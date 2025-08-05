package com.alibaba.ut.abtest.internal.database;

import android.content.ContentValues;
import com.alibaba.ut.abtest.internal.database.ABDataObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.cex;
import tb.kge;

/* loaded from: classes.dex */
public abstract class a<T extends ABDataObject> extends d<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1362644401);
    }

    @Override // com.alibaba.ut.abtest.internal.database.d
    public e c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("beb102e5", new Object[]{this}) : b.a();
    }

    @Override // com.alibaba.ut.abtest.internal.database.d
    public long[] a(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("19a002ac", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            long currentTimeMillis = System.currentTimeMillis();
            for (T t : list) {
                ContentValues contentValues = t.toContentValues();
                contentValues.put("create_time", Long.valueOf(currentTimeMillis));
                contentValues.put(ABDataObject.COLUMN_MODIFIED_TIME, Long.valueOf(currentTimeMillis));
                contentValues.put("owner_id", cex.a().r());
                arrayList.add(contentValues);
            }
        }
        return c().a(a(), 5, arrayList);
    }
}
