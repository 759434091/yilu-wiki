package team.a9043.yiluwiki.controller;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;
import team.a9043.yiluwiki.exception.InvalidParameterException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    private static final String errResStr =
            "{\"success\":false,\"error\":true,\"errType\":\"%s\"," +
                    "\"message\":%s}";

    @ExceptionHandler({NoHandlerFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleNotFound(Exception e,
                               HttpServletResponse response) throws IOException {
        response.setHeader("Content-type",
                "application/json;charset=utf-8");
        response.getWriter().write(
                formatErr(HttpStatus.NOT_FOUND, e.getMessage()));
    }

    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    public void handleUnSupportedMediaType(Exception e,
                                           HttpServletResponse response) throws IOException {
        response.setHeader("Content-type",
                "application/json;charset=utf-8");
        response.getWriter().write(
                formatErr(HttpStatus.UNSUPPORTED_MEDIA_TYPE, e.getMessage()));
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void handleForbidden(Exception e,
                                HttpServletResponse response) throws IOException {
        response.setHeader("Content-type",
                "application/json;charset=utf-8");
        response.getWriter().write(
                formatErr(HttpStatus.FORBIDDEN, e.getMessage()));
    }

    @ExceptionHandler({
            MissingServletRequestParameterException.class,
            MissingPathVariableException.class,
            InvalidParameterException.class,
            MethodArgumentTypeMismatchException.class,
            MissingServletRequestPartException.class,
            ServletRequestBindingException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void handleBadRequest(Exception e,
                                 HttpServletResponse response) throws IOException {
        response.setHeader("Content-type",
                "application/json;charset=utf-8");
        response.getWriter().write(
                formatErr(HttpStatus.BAD_REQUEST, e.getMessage()));
    }

    @ExceptionHandler({
            HttpMediaTypeNotSupportedException.class
    })
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    public void handleUnsupportedMediaType(Exception e,
                                           HttpServletResponse response) throws IOException {
        response.setHeader("Content-type",
                "application/json;charset=utf-8");
        response.getWriter().write(
                formatErr(HttpStatus.UNSUPPORTED_MEDIA_TYPE, e.getMessage()));
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void handleInternalServerError(Exception e,
                                          HttpServletResponse response) throws IOException {
        log.error(e.getMessage(), e);
        response.setHeader("Content-type",
                "application/json;charset=utf-8");
        response.getWriter().write(
                formatErr(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void handleOther(Exception e,
                            HttpServletResponse response) throws IOException {
        response.setHeader("Content-type",
                "application/json;charset=utf-8");
        log.error(e.getMessage(), e);
        response.getWriter().write(
                formatErr(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage()));
    }

    private String formatErr(HttpStatus errType, String message) {
        return String.format(errResStr,
                errType.getReasonPhrase(),
                JSONObject.quote(message));
    }
}
