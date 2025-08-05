package com.alibaba.evo.internal.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.alibaba.ut.abtest.internal.database.ABDataObject;
import com.alibaba.ut.abtest.internal.database.DataObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class a extends com.alibaba.ut.abtest.internal.database.a<ExperimentDO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TABLE_NAME = "beta_experiments_v1";

    static {
        kge.a(-1244206799);
    }

    @Override // com.alibaba.ut.abtest.internal.database.d
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : TABLE_NAME;
    }

    @Override // com.alibaba.ut.abtest.internal.database.d
    public /* synthetic */ DataObject b(Cursor cursor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataObject) ipChange.ipc$dispatch("d3c18f3f", new Object[]{this, cursor}) : a(cursor);
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e4aad3", new Object[]{sQLiteDatabase, new Boolean(z)});
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "\"" + TABLE_NAME + "\" (id INTEGER, key VARCHAR(2048) NOT NULL, release_id INTEGER NOT NULL, type INTEGER NOT NULL, " + ExperimentDO.COLUMN_BEGIN_TIME + " INTEGER NOT NULL, " + ExperimentDO.COLUMN_END_TIME + " INTEGER NOT NULL, " + ExperimentDO.COLUMN_TRACKS + " VARCHAR(2048), condition VARCHAR(4096), " + ExperimentDO.COLUMN_COGNATION + " VARCHAR(4096) NOT NULL, groups TEXT, " + ExperimentDO.COLUMN_VARIATION_CONFIG + " TEXT, " + ExperimentDO.COLUMN_HIT_COUNT + " INTEGER NOT NULL DEFAULT 0, " + ExperimentDO.COLUMN_HIT_LATEST_TIME + " INTEGER NOT NULL DEFAULT 0, create_time INTEGER, " + ABDataObject.COLUMN_MODIFIED_TIME + " INTEGER, owner_id VARCHAR(64) NOT NULL DEFAULT '0', " + ExperimentDO.COLUMN_RETAIN + " INTEGER, " + ExperimentDO.COLUMN_PRIORITY_LEVEL + " INTEGER, " + ExperimentDO.COLUMN_EXP_INDEX_TYPE + " INTEGER, " + ExperimentDO.COLUMN_PUBLISH_TYPE + " INTEGER, " + ExperimentDO.COLUMN_VARIATIONS + " TEXT, PRIMARY KEY(id))");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS beta_experiments_v1_key_idx ON beta_experiments_v1(key)");
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ffd04b5", new Object[]{sQLiteDatabase, str, str2});
            return;
        }
        sQLiteDatabase.execSQL("alter table beta_experiments_v1 add " + str + " " + str2);
    }

    public ExperimentDO a(Cursor cursor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExperimentDO) ipChange.ipc$dispatch("a890dc1a", new Object[]{this, cursor}) : new ExperimentDO(cursor);
    }
}
