package io.pivotal.shinyay.zuul.filter

import com.netflix.zuul.ZuulFilter

class PreFilter : ZuulFilter() {

    /**
     * pre filters are executed before the request is routed
     * route filters can handle the actual routing of the request
     * post filters are executed after the request has been routed
     * error filters execute if an error occurs in the course of handling the request.
     */
    override fun filterType() = "pre"

    override fun shouldFilter() = true

    override fun filterOrder() = 1

    override fun run(): Any {
        return null
    }






}