package io.github.villcab.mvntest.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

public class NamingStrategyMain {

    public static void main(String[] args) throws JsonProcessingException {
        String json1 = "{\"TxCode\": \"a909120c1c394bb798fa08db868e749f\"}";

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        CodeDTO codeDTO = mapper.readValue(json1, CodeDTO.class);
        System.out.println(codeDTO);
    }

    @Data
    @JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
    static class CodeDTO {
        private String TxCode;
    }
}
