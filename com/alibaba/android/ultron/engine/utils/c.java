package com.alibaba.android.ultron.engine.utils;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aoh;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f2574a;
    private SQLiteDatabase b;

    static {
        kge.a(2034514487);
    }

    public static c a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("c239dd3f", new Object[]{context});
        }
        if (context == null && f2574a == null) {
            throw new IllegalArgumentException("context and evaluator cannot be null.");
        }
        if (f2574a == null) {
            synchronized (c.class) {
                if (f2574a == null) {
                    f2574a = new c(context.getApplicationContext());
                }
            }
        }
        return f2574a;
    }

    private c(Context context) {
        this.b = new aoh(context, null).getReadableDatabase();
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        try {
            Cursor rawQuery = this.b.rawQuery("SELECT " + str, null);
            rawQuery.moveToFirst();
            String string = rawQuery.getString(0);
            rawQuery.close();
            return !string.equals("0");
        } catch (Exception unused) {
            return true;
        }
    }
}
