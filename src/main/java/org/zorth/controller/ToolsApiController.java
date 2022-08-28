package org.zorth.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zorth.pojo.Request;
import org.zorth.pojo.Response;
import org.zorth.tools.Magnet;

/**
 * @author nicolas
 */
@RestController
@CrossOrigin
public class ToolsApiController {

    @PostMapping("/splicingMagnet")
    public Response splicingMagnet(@RequestBody Request request) {
        Magnet magnet = new Magnet();
        String input = (String) request.getReqBody();
        Response response = new Response();
        response.setRespBody(magnet.splicingMagnet(input));
        return response;
    }

}
