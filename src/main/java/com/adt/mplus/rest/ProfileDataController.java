package com.adt.mplus.rest;

import com.adt.mplus.domain.MplusProfile;
import com.adt.mplus.domain.ProfilesRequest;
import com.adt.mplus.service.RaiderIOService;
import com.adt.mplus.util.AGNBUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileDataController {

    private RaiderIOService raiderIOService;

    public ProfileDataController(RaiderIOService raiderIOService) {
        this.raiderIOService = raiderIOService;
    }

    @GetMapping("/profile/core")
    public List<MplusProfile> all() {
        ProfilesRequest profilesRequest = new ProfilesRequest();
        profilesRequest.setProfiles(AGNBUtils.coreCrew());
        List<MplusProfile> profiles = raiderIOService.getProfiles(profilesRequest);
        return profiles;
    }

}
