package indi.joynic.joodoo.web.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * url
 */
public class UrlUtil {

    private static final Logger logger = LoggerFactory.getLogger(UrlUtil.class);

    public static String extractRequestUri(HttpServletRequest request) {
        return request.toString();
    }
}