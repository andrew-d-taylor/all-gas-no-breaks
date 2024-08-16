package com.adt.mplus.service;

import com.adt.mplus.domain.MplusProfile;
import com.adt.mplus.domain.NameRealmPair;
import com.adt.mplus.domain.ProfilesRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class RaiderIOService {

    private static final String API_URL = "https://www.raider.io";
    private static final String CHARACTER_PATH = "/api/v1/characters/profile";
    private RestTemplate template;

    public RaiderIOService(RestTemplate restTemplate) {
        this.template = restTemplate;
    }

    public List<MplusProfile> getProfiles(ProfilesRequest profilesRequest) {
        List<MplusProfile> results = new ArrayList<>();
        for (NameRealmPair pair: profilesRequest.getProfiles()) {
            StringBuilder builder = new StringBuilder();
            builder.append("?region=us&realm=").append(pair.getRealm()).append("&name=").append(pair.getName());
            builder.append("&fields=mythic_plus_ranks");
            String query = builder.toString();
            MplusProfile profile = template.getForObject(API_URL + CHARACTER_PATH + query, MplusProfile.class);
            results.add(profile);
        }
        return results;
    }

}
