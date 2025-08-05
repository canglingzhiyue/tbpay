package com.alibaba.ut.abtest.internal.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.ut.abtest.internal.util.h;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class c extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(73783385);
    }

    public c(Context context) {
        super(context, "ut-abtest-v2.db", (SQLiteDatabase.CursorFactory) null, 8);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            return;
        }
        h.a("ABDatabaseHelper", "onCreate, db=" + sQLiteDatabase);
        try {
            com.alibaba.evo.internal.database.b.a(sQLiteDatabase, true);
            com.alibaba.evo.internal.database.a.a(sQLiteDatabase, true);
        } catch (Throwable th) {
            com.alibaba.ut.abtest.internal.util.b.a("ABDatabaseHelper.onCreate", th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        h.a("ABDatabaseHelper", "onUpgrade, db=" + sQLiteDatabase + ", oldVersion=" + i + ", newVersion=" + i2);
        try {
            onCreate(sQLiteDatabase);
            switch (i + 1) {
                case 4:
                    com.alibaba.evo.internal.database.b.a(sQLiteDatabase, ExperimentDO.COLUMN_PRIORITY_LEVEL, "INTEGER");
                    com.alibaba.evo.internal.database.a.a(sQLiteDatabase, ExperimentDO.COLUMN_PRIORITY_LEVEL, "INTEGER");
                case 5:
                    com.alibaba.evo.internal.database.b.a(sQLiteDatabase, ExperimentDO.COLUMN_EXP_INDEX_TYPE, "INTEGER");
                    com.alibaba.evo.internal.database.a.a(sQLiteDatabase, ExperimentDO.COLUMN_EXP_INDEX_TYPE, "INTEGER");
                case 6:
                    com.alibaba.evo.internal.database.a.a(sQLiteDatabase, ExperimentDO.COLUMN_PUBLISH_TYPE, "INTEGER");
                case 7:
                    com.alibaba.evo.internal.database.b.a(sQLiteDatabase, ExperimentDO.COLUMN_VARIATION_CONFIG, "TEXT");
                    com.alibaba.evo.internal.database.a.a(sQLiteDatabase, ExperimentDO.COLUMN_VARIATION_CONFIG, "TEXT");
                    break;
                case 8:
                    break;
                default:
                    return;
            }
            com.alibaba.evo.internal.database.b.a(sQLiteDatabase, ExperimentDO.COLUMN_PUBLISH_TYPE, "INTEGER");
        } catch (Exception e) {
            com.alibaba.ut.abtest.internal.util.b.a("ABDatabaseHelper.onUpgrade", e);
        }
    }
}
