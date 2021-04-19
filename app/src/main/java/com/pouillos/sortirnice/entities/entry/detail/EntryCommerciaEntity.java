package com.pouillos.sortirnice.entities.entry.detail;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class EntryCommerciaEntity implements Comparable<EntryCommerciaEntity> {

    @Id
    private Long id;

    private String value;

    @Generated(hash = 1660791648)
    public EntryCommerciaEntity(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    @Generated(hash = 885091761)
    public EntryCommerciaEntity() {
    }

    @Override
    public int compareTo(EntryCommerciaEntity o) {
        return this.getId().compareTo(o.getId());
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    
}