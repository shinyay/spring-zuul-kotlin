package io.pivotal.shinyay.zuul.filter

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import org.slf4j.Logger
import org.slf4j.LoggerFactory.getLogger
import org.springframework.stereotype.Component
import javax.servlet.http.HttpServletRequest

@Component
class PreFilter : ZuulFilter() {

    fun <T : Any> T.logger(): Logger = getLogger(javaClass)
    /**
     * pre filters are executed before the request is routed
     * route filters can handle the actual routing of the request
     * post filters are executed after the request has been routed
     * error filters execute if an error occurs in the course of handling the request.
     */
    override fun filterType() = "pre"

    override fun shouldFilter() = true

    override fun filterOrder() = 1

    override fun run() {
        val request: HttpServletRequest = RequestContext.getCurrentContext().request
        logger().info(String.format("%s request to %s", request.method, request.requestURL.toString()))
    }






}