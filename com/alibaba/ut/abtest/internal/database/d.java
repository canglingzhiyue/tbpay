package com.alibaba.ut.abtest.internal.database;

import android.database.Cursor;
import com.alibaba.ut.abtest.internal.database.DataObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public abstract class d<T extends DataObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(248569138);
    }

    public abstract String a();

    public abstract T b(Cursor cursor);

    public abstract e c();

    public long[] a(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("19a002ac", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (T t : list) {
                arrayList.add(t.toContentValues());
            }
        }
        return c().a(a(), 0, arrayList);
    }

    public int a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d04957a0", new Object[]{this, str, strArr})).intValue() : c().a(a(), str, strArr);
    }

    public ArrayList<T> a(String[] strArr, String str, int i, int i2, String str2, String... strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ca2f6fae", new Object[]{this, strArr, str, new Integer(i), new Integer(i2), str2, strArr2});
        }
        String str3 = null;
        if (i2 > 0) {
            str3 = (i * i2) + "," + i2;
        }
        return c(c().a(a(), strArr, str, str3, str2, strArr2));
    }

    public ArrayList<T> c(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("5b4708c7", new Object[]{this, cursor});
        }
        try {
            return d(cursor);
        } finally {
            cursor.close();
        }
    }

    public ArrayList<T> d(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("4cf0aee6", new Object[]{this, cursor});
        }
        ArrayList<T> arrayList = new ArrayList<>();
        while (cursor.moveToNext()) {
            arrayList.add(b(cursor));
        }
        return arrayList;
    }
}
