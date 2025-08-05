package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import com.xiaomi.push.cg;

/* loaded from: classes9.dex */
public class cd extends cg.e {

    /* renamed from: a  reason: collision with root package name */
    private String f24392a;

    public cd(String str, ContentValues contentValues, String str2) {
        super(str, contentValues);
        this.f24392a = "MessageInsertJob";
        this.f24392a = str2;
    }

    public static cd a(Context context, String str, ig igVar) {
        byte[] a2 = jm.a(igVar);
        if (a2 == null || a2.length <= 0) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 0);
        contentValues.put("messageId", "");
        contentValues.put("messageItemId", igVar.d());
        contentValues.put("messageItem", a2);
        contentValues.put("appId", bu.a(context).b());
        contentValues.put("packageName", bu.a(context).m1752a());
        contentValues.put("createTimeStamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("uploadTimestamp", (Integer) 0);
        return new cd(str, contentValues, "a job build to insert message to db");
    }
}
