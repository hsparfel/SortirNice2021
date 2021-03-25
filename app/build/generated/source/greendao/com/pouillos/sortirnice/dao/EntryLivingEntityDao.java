package com.pouillos.sortirnice.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.pouillos.sortirnice.entities.entry.detail.EntryLivingEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ENTRY_LIVING_ENTITY".
*/
public class EntryLivingEntityDao extends AbstractDao<EntryLivingEntity, Long> {

    public static final String TABLENAME = "ENTRY_LIVING_ENTITY";

    /**
     * Properties of entity EntryLivingEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property RoomCount = new Property(1, int.class, "roomCount", false, "ROOM_COUNT");
        public final static Property RoomBathCount = new Property(2, int.class, "roomBathCount", false, "ROOM_BATH_COUNT");
        public final static Property RoomShowerCount = new Property(3, int.class, "roomShowerCount", false, "ROOM_SHOWER_COUNT");
        public final static Property RoomNoSmokingCount = new Property(4, int.class, "roomNoSmokingCount", false, "ROOM_NO_SMOKING_COUNT");
        public final static Property SuiteCount = new Property(5, int.class, "suiteCount", false, "SUITE_COUNT");
        public final static Property StudioCount = new Property(6, int.class, "studioCount", false, "STUDIO_COUNT");
        public final static Property ApartmentCount = new Property(7, int.class, "apartmentCount", false, "APARTMENT_COUNT");
        public final static Property RoomAccessibleCount = new Property(8, int.class, "roomAccessibleCount", false, "ROOM_ACCESSIBLE_COUNT");
        public final static Property SingleCount = new Property(9, int.class, "singleCount", false, "SINGLE_COUNT");
        public final static Property DoubleCount = new Property(10, int.class, "doubleCount", false, "DOUBLE_COUNT");
        public final static Property TripleCount = new Property(11, int.class, "tripleCount", false, "TRIPLE_COUNT");
        public final static Property TwinsCount = new Property(12, int.class, "twinsCount", false, "TWINS_COUNT");
        public final static Property FamilyCount = new Property(13, int.class, "familyCount", false, "FAMILY_COUNT");
        public final static Property Area = new Property(14, int.class, "area", false, "AREA");
        public final static Property Type = new Property(15, String.class, "type", false, "TYPE");
        public final static Property Floor = new Property(16, int.class, "floor", false, "FLOOR");
        public final static Property BedroomCount = new Property(17, int.class, "bedroomCount", false, "BEDROOM_COUNT");
        public final static Property SleepsCount = new Property(18, int.class, "sleepsCount", false, "SLEEPS_COUNT");
        public final static Property FurnishedRoomCount = new Property(19, int.class, "furnishedRoomCount", false, "FURNISHED_ROOM_COUNT");
    }


    public EntryLivingEntityDao(DaoConfig config) {
        super(config);
    }
    
    public EntryLivingEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ENTRY_LIVING_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"ROOM_COUNT\" INTEGER NOT NULL ," + // 1: roomCount
                "\"ROOM_BATH_COUNT\" INTEGER NOT NULL ," + // 2: roomBathCount
                "\"ROOM_SHOWER_COUNT\" INTEGER NOT NULL ," + // 3: roomShowerCount
                "\"ROOM_NO_SMOKING_COUNT\" INTEGER NOT NULL ," + // 4: roomNoSmokingCount
                "\"SUITE_COUNT\" INTEGER NOT NULL ," + // 5: suiteCount
                "\"STUDIO_COUNT\" INTEGER NOT NULL ," + // 6: studioCount
                "\"APARTMENT_COUNT\" INTEGER NOT NULL ," + // 7: apartmentCount
                "\"ROOM_ACCESSIBLE_COUNT\" INTEGER NOT NULL ," + // 8: roomAccessibleCount
                "\"SINGLE_COUNT\" INTEGER NOT NULL ," + // 9: singleCount
                "\"DOUBLE_COUNT\" INTEGER NOT NULL ," + // 10: doubleCount
                "\"TRIPLE_COUNT\" INTEGER NOT NULL ," + // 11: tripleCount
                "\"TWINS_COUNT\" INTEGER NOT NULL ," + // 12: twinsCount
                "\"FAMILY_COUNT\" INTEGER NOT NULL ," + // 13: familyCount
                "\"AREA\" INTEGER NOT NULL ," + // 14: area
                "\"TYPE\" TEXT," + // 15: type
                "\"FLOOR\" INTEGER NOT NULL ," + // 16: floor
                "\"BEDROOM_COUNT\" INTEGER NOT NULL ," + // 17: bedroomCount
                "\"SLEEPS_COUNT\" INTEGER NOT NULL ," + // 18: sleepsCount
                "\"FURNISHED_ROOM_COUNT\" INTEGER NOT NULL );"); // 19: furnishedRoomCount
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ENTRY_LIVING_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, EntryLivingEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getRoomCount());
        stmt.bindLong(3, entity.getRoomBathCount());
        stmt.bindLong(4, entity.getRoomShowerCount());
        stmt.bindLong(5, entity.getRoomNoSmokingCount());
        stmt.bindLong(6, entity.getSuiteCount());
        stmt.bindLong(7, entity.getStudioCount());
        stmt.bindLong(8, entity.getApartmentCount());
        stmt.bindLong(9, entity.getRoomAccessibleCount());
        stmt.bindLong(10, entity.getSingleCount());
        stmt.bindLong(11, entity.getDoubleCount());
        stmt.bindLong(12, entity.getTripleCount());
        stmt.bindLong(13, entity.getTwinsCount());
        stmt.bindLong(14, entity.getFamilyCount());
        stmt.bindLong(15, entity.getArea());
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(16, type);
        }
        stmt.bindLong(17, entity.getFloor());
        stmt.bindLong(18, entity.getBedroomCount());
        stmt.bindLong(19, entity.getSleepsCount());
        stmt.bindLong(20, entity.getFurnishedRoomCount());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, EntryLivingEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getRoomCount());
        stmt.bindLong(3, entity.getRoomBathCount());
        stmt.bindLong(4, entity.getRoomShowerCount());
        stmt.bindLong(5, entity.getRoomNoSmokingCount());
        stmt.bindLong(6, entity.getSuiteCount());
        stmt.bindLong(7, entity.getStudioCount());
        stmt.bindLong(8, entity.getApartmentCount());
        stmt.bindLong(9, entity.getRoomAccessibleCount());
        stmt.bindLong(10, entity.getSingleCount());
        stmt.bindLong(11, entity.getDoubleCount());
        stmt.bindLong(12, entity.getTripleCount());
        stmt.bindLong(13, entity.getTwinsCount());
        stmt.bindLong(14, entity.getFamilyCount());
        stmt.bindLong(15, entity.getArea());
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(16, type);
        }
        stmt.bindLong(17, entity.getFloor());
        stmt.bindLong(18, entity.getBedroomCount());
        stmt.bindLong(19, entity.getSleepsCount());
        stmt.bindLong(20, entity.getFurnishedRoomCount());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public EntryLivingEntity readEntity(Cursor cursor, int offset) {
        EntryLivingEntity entity = new EntryLivingEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // roomCount
            cursor.getInt(offset + 2), // roomBathCount
            cursor.getInt(offset + 3), // roomShowerCount
            cursor.getInt(offset + 4), // roomNoSmokingCount
            cursor.getInt(offset + 5), // suiteCount
            cursor.getInt(offset + 6), // studioCount
            cursor.getInt(offset + 7), // apartmentCount
            cursor.getInt(offset + 8), // roomAccessibleCount
            cursor.getInt(offset + 9), // singleCount
            cursor.getInt(offset + 10), // doubleCount
            cursor.getInt(offset + 11), // tripleCount
            cursor.getInt(offset + 12), // twinsCount
            cursor.getInt(offset + 13), // familyCount
            cursor.getInt(offset + 14), // area
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // type
            cursor.getInt(offset + 16), // floor
            cursor.getInt(offset + 17), // bedroomCount
            cursor.getInt(offset + 18), // sleepsCount
            cursor.getInt(offset + 19) // furnishedRoomCount
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, EntryLivingEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setRoomCount(cursor.getInt(offset + 1));
        entity.setRoomBathCount(cursor.getInt(offset + 2));
        entity.setRoomShowerCount(cursor.getInt(offset + 3));
        entity.setRoomNoSmokingCount(cursor.getInt(offset + 4));
        entity.setSuiteCount(cursor.getInt(offset + 5));
        entity.setStudioCount(cursor.getInt(offset + 6));
        entity.setApartmentCount(cursor.getInt(offset + 7));
        entity.setRoomAccessibleCount(cursor.getInt(offset + 8));
        entity.setSingleCount(cursor.getInt(offset + 9));
        entity.setDoubleCount(cursor.getInt(offset + 10));
        entity.setTripleCount(cursor.getInt(offset + 11));
        entity.setTwinsCount(cursor.getInt(offset + 12));
        entity.setFamilyCount(cursor.getInt(offset + 13));
        entity.setArea(cursor.getInt(offset + 14));
        entity.setType(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setFloor(cursor.getInt(offset + 16));
        entity.setBedroomCount(cursor.getInt(offset + 17));
        entity.setSleepsCount(cursor.getInt(offset + 18));
        entity.setFurnishedRoomCount(cursor.getInt(offset + 19));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(EntryLivingEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(EntryLivingEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(EntryLivingEntity entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}