package com.pouillos.sortirnice.model;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root
public class Profile {

    @Text
    private String value;

    public String getValue() {
        return value;
    }
}