package com.jason.demo.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageHomeController {

    /**
     *
     * @return
     * @throws JSONException
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object test() throws JSONException {
        return getObject();
    }

    private Object getObject() throws JSONException {
        try {
            JSONObject result = new JSONObject();
            result.put("msg", "ok");
            result.put("code", 0);

            return result.toString();
        } catch (Exception e) {
            JSONObject result = new JSONObject();
            result.put("msg", "error");
            result.put("code", -1);

            return result.toString();
        }
    }

    /**
     *
     * @return
     * @throws JSONException
     */
    @RequestMapping(value = "/testOne", method = RequestMethod.GET)
    public Object testOne() throws JSONException {
        return getObject();
    }
}
