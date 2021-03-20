package com.pouillos.sortirnice.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.pouillos.sortirnice.entities.EntryEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ENTRY_ENTITY".
*/
public class EntryEntityDao extends AbstractDao<EntryEntity, Long> {

    public static final String TABLENAME = "ENTRY_ENTITY";

    /**
     * Properties of entity EntryEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property SortieId = new Property(1, Long.class, "sortieId", false, "SORTIE_ID");
        public final static Property NameFr = new Property(2, String.class, "nameFr", false, "NAME_FR");
        public final static Property NameFrShort = new Property(3, String.class, "nameFrShort", false, "NAME_FR_SHORT");
        public final static Property Adress = new Property(4, String.class, "adress", false, "ADRESS");
        public final static Property Zip = new Property(5, String.class, "zip", false, "ZIP");
        public final static Property City = new Property(6, String.class, "city", false, "CITY");
        public final static Property Phone = new Property(7, String.class, "phone", false, "PHONE");
        public final static Property Fax = new Property(8, String.class, "fax", false, "FAX");
        public final static Property Email = new Property(9, String.class, "email", false, "EMAIL");
        public final static Property Website = new Property(10, String.class, "website", false, "WEBSITE");
        public final static Property Latitude = new Property(11, double.class, "latitude", false, "LATITUDE");
        public final static Property Longitude = new Property(12, double.class, "longitude", false, "LONGITUDE");
        public final static Property Location_map = new Property(13, String.class, "location_map", false, "LOCATION_MAP");
        public final static Property Note = new Property(14, String.class, "note", false, "NOTE");
        public final static Property Start = new Property(15, String.class, "start", false, "START");
        public final static Property NiceresAvailability = new Property(16, boolean.class, "niceresAvailability", false, "NICERES_AVAILABILITY");
        public final static Property NiceresId = new Property(17, int.class, "niceresId", false, "NICERES_ID");
        public final static Property Created = new Property(18, String.class, "created", false, "CREATED");
        public final static Property Updated = new Property(19, String.class, "updated", false, "UPDATED");
    }


    public EntryEntityDao(DaoConfig config) {
        super(config);
    }
    
    public EntryEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ENTRY_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"SORTIE_ID\" INTEGER," + // 1: sortieId
                "\"NAME_FR\" TEXT," + // 2: nameFr
                "\"NAME_FR_SHORT\" TEXT," + // 3: nameFrShort
                "\"ADRESS\" TEXT," + // 4: adress
                "\"ZIP\" TEXT," + // 5: zip
                "\"CITY\" TEXT," + // 6: city
                "\"PHONE\" TEXT," + // 7: phone
                "\"FAX\" TEXT," + // 8: fax
                "\"EMAIL\" TEXT," + // 9: email
                "\"WEBSITE\" TEXT," + // 10: website
                "\"LATITUDE\" REAL NOT NULL ," + // 11: latitude
                "\"LONGITUDE\" REAL NOT NULL ," + // 12: longitude
                "\"LOCATION_MAP\" TEXT," + // 13: location_map
                "\"NOTE\" TEXT," + // 14: note
                "\"START\" TEXT," + // 15: start
                "\"NICERES_AVAILABILITY\" INTEGER NOT NULL ," + // 16: niceresAvailability
                "\"NICERES_ID\" INTEGER NOT NULL ," + // 17: niceresId
                "\"CREATED\" TEXT," + // 18: created
                "\"UPDATED\" TEXT);"); // 19: updated
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ENTRY_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, EntryEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long sortieId = entity.getSortieId();
        if (sortieId != null) {
            stmt.bindLong(2, sortieId);
        }
 
        String nameFr = entity.getNameFr();
        if (nameFr != null) {
            stmt.bindString(3, nameFr);
        }
 
        String nameFrShort = entity.getNameFrShort();
        if (nameFrShort != null) {
            stmt.bindString(4, nameFrShort);
        }
 
        String adress = entity.getAdress();
        if (adress != null) {
            stmt.bindString(5, adress);
        }
 
        String zip = entity.getZip();
        if (zip != null) {
            stmt.bindString(6, zip);
        }
 
        String city = entity.getCity();
        if (city != null) {
            stmt.bindString(7, city);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(8, phone);
        }
 
        String fax = entity.getFax();
        if (fax != null) {
            stmt.bindString(9, fax);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(10, email);
        }
 
        String website = entity.getWebsite();
        if (website != null) {
            stmt.bindString(11, website);
        }
        stmt.bindDouble(12, entity.getLatitude());
        stmt.bindDouble(13, entity.getLongitude());
 
        String location_map = entity.getLocation_map();
        if (location_map != null) {
            stmt.bindString(14, location_map);
        }
 
        String note = entity.getNote();
        if (note != null) {
            stmt.bindString(15, note);
        }
 
        String start = entity.getStart();
        if (start != null) {
            stmt.bindString(16, start);
        }
        stmt.bindLong(17, entity.getNiceresAvailability() ? 1L: 0L);
        stmt.bindLong(18, entity.getNiceresId());
 
        String created = entity.getCreated();
        if (created != null) {
            stmt.bindString(19, created);
        }
 
        String updated = entity.getUpdated();
        if (updated != null) {
            stmt.bindString(20, updated);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, EntryEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long sortieId = entity.getSortieId();
        if (sortieId != null) {
            stmt.bindLong(2, sortieId);
        }
 
        String nameFr = entity.getNameFr();
        if (nameFr != null) {
            stmt.bindString(3, nameFr);
        }
 
        String nameFrShort = entity.getNameFrShort();
        if (nameFrShort != null) {
            stmt.bindString(4, nameFrShort);
        }
 
        String adress = entity.getAdress();
        if (adress != null) {
            stmt.bindString(5, adress);
        }
 
        String zip = entity.getZip();
        if (zip != null) {
            stmt.bindString(6, zip);
        }
 
        String city = entity.getCity();
        if (city != null) {
            stmt.bindString(7, city);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(8, phone);
        }
 
        String fax = entity.getFax();
        if (fax != null) {
            stmt.bindString(9, fax);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(10, email);
        }
 
        String website = entity.getWebsite();
        if (website != null) {
            stmt.bindString(11, website);
        }
        stmt.bindDouble(12, entity.getLatitude());
        stmt.bindDouble(13, entity.getLongitude());
 
        String location_map = entity.getLocation_map();
        if (location_map != null) {
            stmt.bindString(14, location_map);
        }
 
        String note = entity.getNote();
        if (note != null) {
            stmt.bindString(15, note);
        }
 
        String start = entity.getStart();
        if (start != null) {
            stmt.bindString(16, start);
        }
        stmt.bindLong(17, entity.getNiceresAvailability() ? 1L: 0L);
        stmt.bindLong(18, entity.getNiceresId());
 
        String created = entity.getCreated();
        if (created != null) {
            stmt.bindString(19, created);
        }
 
        String updated = entity.getUpdated();
        if (updated != null) {
            stmt.bindString(20, updated);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public EntryEntity readEntity(Cursor cursor, int offset) {
        EntryEntity entity = new EntryEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // sortieId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // nameFr
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // nameFrShort
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // adress
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // zip
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // city
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // phone
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // fax
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // email
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // website
            cursor.getDouble(offset + 11), // latitude
            cursor.getDouble(offset + 12), // longitude
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // location_map
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // note
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // start
            cursor.getShort(offset + 16) != 0, // niceresAvailability
            cursor.getInt(offset + 17), // niceresId
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // created
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19) // updated
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, EntryEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSortieId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setNameFr(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setNameFrShort(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAdress(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setZip(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCity(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPhone(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setFax(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setEmail(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setWebsite(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setLatitude(cursor.getDouble(offset + 11));
        entity.setLongitude(cursor.getDouble(offset + 12));
        entity.setLocation_map(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setNote(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setStart(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setNiceresAvailability(cursor.getShort(offset + 16) != 0);
        entity.setNiceresId(cursor.getInt(offset + 17));
        entity.setCreated(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setUpdated(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(EntryEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(EntryEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(EntryEntity entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}