package api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginHTTP {

    @JsonProperty
    private String mustConfirmSafetyInfo;

    public String getMustConfirmSafetyInfo() {
        return mustConfirmSafetyInfo;
    }

}
