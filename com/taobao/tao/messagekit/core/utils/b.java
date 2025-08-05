package com.taobao.tao.messagekit.core.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.monitor.c;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1443298231);
    }

    public b(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 5);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            return;
        }
        try {
            for (c.d dVar : com.taobao.tao.messagekit.base.d.a().h().a()) {
                com.taobao.tao.messagekit.base.monitor.a.a(sQLiteDatabase, dVar.a());
            }
        } catch (Exception e) {
            MsgLog.c("DataBase", e, new Object[0]);
            e.printStackTrace();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        for (c.d dVar : com.taobao.tao.messagekit.base.d.a().h().a()) {
            com.taobao.tao.messagekit.base.monitor.a.a(sQLiteDatabase, dVar.a(), i, i2);
        }
    }
}
