package com.pouillos.sortirnice.modelsorties;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root
public class Image {

    @Text
    private String url;

    public String getUrl() {
        return url;
    }
}
