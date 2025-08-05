package com.alibaba.evo.internal.database;

import android.content.ContentValues;
import android.database.Cursor;
import com.alibaba.ut.abtest.internal.database.ABDataObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class ExperimentDO extends ABDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLUMN_BEGIN_TIME = "begin_time";
    public static final String COLUMN_COGNATION = "cognation";
    public static final String COLUMN_CONDITION = "condition";
    public static final String COLUMN_END_TIME = "end_time";
    public static final String COLUMN_EXP_INDEX_TYPE = "exp_index_type";
    public static final String COLUMN_GROUPS = "groups";
    public static final String COLUMN_HIT_COUNT = "hit_count";
    public static final String COLUMN_HIT_LATEST_TIME = "hit_latest_time";
    public static final String COLUMN_KEY = "key";
    public static final String COLUMN_PRIORITY_LEVEL = "priority_level_int";
    public static final String COLUMN_PUBLISH_TYPE = "exp_publish_type";
    public static final String COLUMN_RELEASE_ID = "release_id";
    public static final String COLUMN_RETAIN = "ext_int";
    public static final String COLUMN_TRACKS = "tracks";
    public static final String COLUMN_TYPE = "type";
    public static final String COLUMN_VARIATIONS = "ext_string";
    public static final String COLUMN_VARIATION_CONFIG = "variation_config";
    private long beginTime;
    private String cognation;
    private String condition;
    private long endTime;
    private int expIndexType;
    private int expPublishType;
    private String groups;
    private long hitCount;
    private long hitLatestTime;
    private String key;
    private int priorityLevel;
    private long releaseId;
    private boolean retain;
    private String tracks;
    private int type;
    private String variationConfigs;
    private String variations;

    static {
        kge.a(-902504740);
    }

    public static /* synthetic */ Object ipc$super(ExperimentDO experimentDO, String str, Object... objArr) {
        if (str.hashCode() == 148665523) {
            return super.toContentValues();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ExperimentDO() {
    }

    public ExperimentDO(Cursor cursor) {
        super(cursor);
        this.releaseId = getCursorLong(cursor, "release_id");
        this.type = getCursorInt(cursor, "type");
        this.key = getCursorString(cursor, "key");
        this.beginTime = getCursorLong(cursor, COLUMN_BEGIN_TIME);
        this.endTime = getCursorLong(cursor, COLUMN_END_TIME);
        this.tracks = getCursorString(cursor, COLUMN_TRACKS);
        this.condition = getCursorString(cursor, "condition");
        this.cognation = getCursorString(cursor, COLUMN_COGNATION);
        this.groups = getCursorString(cursor, "groups");
        this.variationConfigs = getCursorString(cursor, COLUMN_VARIATION_CONFIG);
        this.hitCount = getCursorLong(cursor, COLUMN_HIT_COUNT);
        this.hitLatestTime = getCursorLong(cursor, COLUMN_HIT_LATEST_TIME);
        this.variations = getCursorString(cursor, COLUMN_VARIATIONS);
        this.retain = getCursorInt(cursor, COLUMN_RETAIN) != 1 ? false : true;
        this.priorityLevel = getCursorInt(cursor, COLUMN_PRIORITY_LEVEL);
        this.expIndexType = getCursorInt(cursor, COLUMN_EXP_INDEX_TYPE);
        this.expPublishType = getCursorInt(cursor, COLUMN_PUBLISH_TYPE);
    }

    @Override // com.alibaba.ut.abtest.internal.database.ABDataObject, com.alibaba.ut.abtest.internal.database.DataObject
    public ContentValues toContentValues() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentValues) ipChange.ipc$dispatch("8dc74b3", new Object[]{this});
        }
        ContentValues contentValues = super.toContentValues();
        contentValues.put("release_id", Long.valueOf(this.releaseId));
        contentValues.put("type", Integer.valueOf(this.type));
        contentValues.put("key", this.key);
        contentValues.put(COLUMN_BEGIN_TIME, Long.valueOf(this.beginTime));
        contentValues.put(COLUMN_END_TIME, Long.valueOf(this.endTime));
        contentValues.put(COLUMN_TRACKS, this.tracks);
        contentValues.put("condition", this.condition);
        contentValues.put(COLUMN_COGNATION, this.cognation);
        contentValues.put("groups", this.groups);
        contentValues.put(COLUMN_VARIATION_CONFIG, this.variationConfigs);
        contentValues.put(COLUMN_VARIATIONS, this.variations);
        contentValues.put(COLUMN_HIT_COUNT, Long.valueOf(this.hitCount));
        contentValues.put(COLUMN_HIT_LATEST_TIME, Long.valueOf(this.hitLatestTime));
        contentValues.put(COLUMN_RETAIN, Integer.valueOf(this.retain ? 1 : 0));
        contentValues.put(COLUMN_PRIORITY_LEVEL, Integer.valueOf(this.priorityLevel));
        contentValues.put(COLUMN_EXP_INDEX_TYPE, Integer.valueOf(this.expIndexType));
        contentValues.put(COLUMN_PUBLISH_TYPE, Integer.valueOf(this.expPublishType));
        return contentValues;
    }

    public long getReleaseId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6756fb47", new Object[]{this})).longValue() : this.releaseId;
    }

    public void setReleaseId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7f4ddd", new Object[]{this, new Long(j)});
        } else {
            this.releaseId = j;
        }
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.type;
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.type = i;
        }
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : this.key;
    }

    public void setKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06c2d6e", new Object[]{this, str});
        } else {
            this.key = str;
        }
    }

    public long getBeginTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6c1f88db", new Object[]{this})).longValue() : this.beginTime;
    }

    public void setBeginTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc872c9", new Object[]{this, new Long(j)});
        } else {
            this.beginTime = j;
        }
    }

    public long getEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("250d18d", new Object[]{this})).longValue() : this.endTime;
    }

    public void setEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e12d357", new Object[]{this, new Long(j)});
        } else {
            this.endTime = j;
        }
    }

    public String getTracks() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5168e3b", new Object[]{this}) : this.tracks;
    }

    public void setTracks(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d65269b", new Object[]{this, str});
        } else {
            this.tracks = str;
        }
    }

    public String getCondition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7f8db1b4", new Object[]{this}) : this.condition;
    }

    public void setCondition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46640aa", new Object[]{this, str});
        } else {
            this.condition = str;
        }
    }

    public String getCognation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18368cad", new Object[]{this}) : this.cognation;
    }

    public void setCognation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d8c4d1", new Object[]{this, str});
        } else {
            this.cognation = str;
        }
    }

    public String getGroups() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81b0f46f", new Object[]{this}) : this.groups;
    }

    public void setGroups(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541786e7", new Object[]{this, str});
        } else {
            this.groups = str;
        }
    }

    public String getVariationConfigs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("af787425", new Object[]{this}) : this.variationConfigs;
    }

    public void setVariationConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd89ef1", new Object[]{this, str});
        } else {
            this.variationConfigs = str;
        }
    }

    public String getVariations() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("780d8403", new Object[]{this}) : this.variations;
    }

    public void setVariations(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c83d3", new Object[]{this, str});
        } else {
            this.variations = str;
        }
    }

    public long getHitCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c242a2d", new Object[]{this})).longValue() : this.hitCount;
    }

    public void setHitCount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b37fa1f", new Object[]{this, new Long(j)});
        } else {
            this.hitCount = j;
        }
    }

    public long getHitLatestTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("70a3cf2c", new Object[]{this})).longValue() : this.hitLatestTime;
    }

    public void setHitLatestTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b021098", new Object[]{this, new Long(j)});
        } else {
            this.hitLatestTime = j;
        }
    }

    public boolean isRetain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9fb467da", new Object[]{this})).booleanValue() : this.retain;
    }

    public void setRetain(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b206386", new Object[]{this, new Boolean(z)});
        } else {
            this.retain = z;
        }
    }

    public int getPriorityLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3bd88404", new Object[]{this})).intValue() : this.priorityLevel;
    }

    public void setPriorityLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d663f31e", new Object[]{this, new Integer(i)});
        } else {
            this.priorityLevel = i;
        }
    }

    public int getExpIndexType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cdd4a5ff", new Object[]{this})).intValue() : this.expIndexType;
    }

    public void setExpIndexType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8569aeb", new Object[]{this, new Integer(i)});
        } else {
            this.expIndexType = i;
        }
    }

    public int getExpPublishType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e274dafc", new Object[]{this})).intValue() : this.expPublishType;
    }

    public void setExpPublishType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba6bb88e", new Object[]{this, new Integer(i)});
        } else {
            this.expPublishType = i;
        }
    }
}
