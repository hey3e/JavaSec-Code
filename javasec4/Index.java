package com.example.fastjson.controller;

import com.alibaba.fastjson.JSONObject;
import com.thoughtworks.xstream.XStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Index {
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    @ResponseBody
    public void test(@RequestBody String data) {
        XStream xStream = new XStream();
        xStream.fromXML(data);
    }
}
