package com.pouillos.sortirnice.modelsorties;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root
public class Amenity {

    @Text
    private String value;

    public String getValue() {
        return value;
    }
}
