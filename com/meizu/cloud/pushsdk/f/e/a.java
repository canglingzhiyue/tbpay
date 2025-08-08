package com.meizu.cloud.pushsdk.f.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import mtopsdk.common.util.StringUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7964a = "a";
    private SQLiteDatabase b;
    private final b c;
    private final String[] d = {"id", "eventData", "dateCreated"};
    private long e = -1;
    private final int f;

    public a(Context context, int i) {
        this.c = b.a(context, a(context));
        e();
        this.f = i;
    }

    private String a(Context context) {
        String str;
        try {
            str = (String) Class.forName("com.meizu.cloud.utils.ProcessUtils").getDeclaredMethod("getCurrentProcessName", Context.class).invoke(null, context);
        } catch (Exception e) {
            String str2 = f7964a;
            DebugLogger.e(str2, "getCurrentProcessName error " + e.getMessage());
            str = null;
        }
        if (StringUtils.isEmpty(str)) {
            return "PushEvents.db";
        }
        return str + "_PushEvents.db";
    }

    public static Map<String, String> a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            HashMap hashMap = (HashMap) objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return hashMap;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] a(Map<String, String> map) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Map<String, Object>> a(int i) {
        return a(null, "id ASC LIMIT " + i);
    }

    public List<Map<String, Object>> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (d()) {
            Cursor query = this.b.query("events", this.d, str, null, null, null, str2);
            query.moveToFirst();
            while (!query.isAfterLast()) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("id", Long.valueOf(query.getLong(0)));
                hashMap.put("eventData", a(query.getBlob(1)));
                hashMap.put("dateCreated", query.getString(2));
                query.moveToNext();
                arrayList.add(hashMap);
            }
            query.close();
        }
        return arrayList;
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public void a(com.meizu.cloud.pushsdk.f.b.a aVar) {
        b(aVar);
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public boolean a() {
        return d();
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public boolean a(long j) {
        int i;
        if (d()) {
            SQLiteDatabase sQLiteDatabase = this.b;
            i = sQLiteDatabase.delete("events", "id=" + j, null);
        } else {
            i = -1;
        }
        String str = f7964a;
        com.meizu.cloud.pushsdk.f.g.c.a(str, "Removed event from database: " + j, new Object[0]);
        return i == 1;
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public long b() {
        if (d()) {
            return DatabaseUtils.queryNumEntries(this.b, "events");
        }
        return 0L;
    }

    public long b(com.meizu.cloud.pushsdk.f.b.a aVar) {
        if (d()) {
            byte[] a2 = a(aVar.a());
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("eventData", a2);
            this.e = this.b.insert("events", null, contentValues);
        }
        String str = f7964a;
        com.meizu.cloud.pushsdk.f.g.c.a(str, "Added event to database: " + this.e, new Object[0]);
        return this.e;
    }

    @Override // com.meizu.cloud.pushsdk.f.e.d
    public com.meizu.cloud.pushsdk.f.c.c c() {
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        for (Map<String, Object> map : a(this.f)) {
            com.meizu.cloud.pushsdk.f.b.c cVar = new com.meizu.cloud.pushsdk.f.b.c();
            cVar.a((Map) map.get("eventData"));
            linkedList.add((Long) map.get("id"));
            arrayList.add(cVar);
        }
        return new com.meizu.cloud.pushsdk.f.c.c(arrayList, linkedList);
    }

    public boolean d() {
        SQLiteDatabase sQLiteDatabase = this.b;
        return sQLiteDatabase != null && sQLiteDatabase.isOpen();
    }

    public void e() {
        if (!d()) {
            try {
                SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
                this.b = writableDatabase;
                writableDatabase.enableWriteAheadLogging();
            } catch (Exception e) {
                String str = f7964a;
                com.meizu.cloud.pushsdk.f.g.c.b(str, " open database error " + e.getMessage(), new Object[0]);
            }
        }
    }
}
