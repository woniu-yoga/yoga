package com.yoga.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyRequest extends HttpServletRequestWrapper {
    public MyRequest(HttpServletRequest request) {
        super(request);
    }
    @Override
    public String getParameter(String name) {
        String value = super.getParameter(name);
        value = filterString(value);
        return value;
    }

    public String filterString(String value){
        if(value!=null){
            value=value.replaceAll("<", "&lt;");
            value=value.replaceAll(">", "&gt;");
            value=value.replaceAll("xjp", "*");
            value=value.replaceAll("lkq", "*");
            value=value.replaceAll("cnm", "*");
            value=value.replaceAll("nmsl", "*");
            value=value.replaceAll("wdnmd", "*");
            value=value.replaceAll("fuck", "*");
        }
        return value;
    }

    @Override
    public String[] getParameterValues(String name) {
        String[] values =super.getParameterValues(name);
        if(values!=null){
            for (int i = 0; i < values.length; i++) {
                String value = values[i];
                value = filterString(value);
                values[i] = value;
            }
        }
        return values ;
    }
}
