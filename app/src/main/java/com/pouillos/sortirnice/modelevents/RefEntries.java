package com.pouillos.sortirnice.modelevents;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class RefEntries {

    @Element (name="ref_entry_id")
    private String refEntryId;

    @Element (name="ref_entry_name")
    private String refEntryName;

    public String getRefEntryId() {
        return refEntryId;
    }

    public String getRefEntryName() {
        return refEntryName;
    }
}