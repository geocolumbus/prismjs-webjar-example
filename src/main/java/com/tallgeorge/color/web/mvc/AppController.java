package com.tallgeorge.color.web.mvc;

import com.tallgeorge.color.dao.JpaResultSetRepository;
import com.tallgeorge.color.model.ResultSet;
import com.tallgeorge.color.strategy.SelectCodeBeautifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class AppController {

    /**
     * The class logger.
     */
    private final Logger logger = LoggerFactory.getLogger(AppController.class);

    /**
     * The result set jpa repository.
     */
    @Autowired
    private JpaResultSetRepository jpaResultSetRepository;

    /**
     * A code beautifier strategy selector.
     */
    @Autowired
    private SelectCodeBeautifier selectCodeBeautifier;

    /**
     * Route to the home page.
     *
     * @param model data map to pass to the jsp page
     * @return a string, the JSP template name
     */
    @RequestMapping("/")
    public final String home(final Map<String, Object> model) {
        int counter = 0;
        for (ResultSet r : jpaResultSetRepository.findAll()) {
            model.put(
                "item" + Integer.toString(counter++),
                selectCodeBeautifier.lookupByContentType(r.getContentType()).beautify(r.getResultEntity())
            );
        }
        return "index";
    }
}
