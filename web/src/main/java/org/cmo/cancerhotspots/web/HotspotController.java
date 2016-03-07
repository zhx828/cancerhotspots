package org.cmo.cancerhotspots.web;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.cmo.cancerhotspots.domain.HotspotMutation;
import org.cmo.cancerhotspots.service.HotspotMutationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Selcuk Onur Sumer
 */
@RestController // shorthand for @Controller, @ResponseBody
@CrossOrigin(origins="*") // allow all cross-domain requests
@RequestMapping(value = "/")
public class HotspotController
{
    private final HotspotMutationService hotspotMutationService;

    @Autowired
    public HotspotController(HotspotMutationService hotspotMutationService)
    {
        this.hotspotMutationService = hotspotMutationService;
    }

    @ApiOperation(value = "getAllHotspotMutations",
        nickname = "getAllHotspotMutations")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success",
            response = HotspotMutation.class,
            responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request")
    })
    @RequestMapping(value = "/hotspots",
        method = {RequestMethod.GET, RequestMethod.POST},
        produces = "application/json")
    public List<HotspotMutation> getAllHotspotMutations()
    {
        return hotspotMutationService.getAllHotspotMutations();
    }
}
