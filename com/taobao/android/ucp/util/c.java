package com.taobao.android.ucp.util;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.k;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final c f15712a;
    private SQLiteDatabase b;

    static {
        kge.a(237863649);
        f15712a = new c();
    }

    private c() {
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("629fef23", new Object[0]) : f15712a;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return;
        }
        this.b = SQLiteDatabase.openDatabase(k.a() + "ucp_data.db", null, 1);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        this.b.close();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        c();
        JSONObject jSONObject = new JSONObject();
        JSONArray e = e();
        JSONArray f = f();
        JSONArray g = g();
        jSONObject.put("KVPair", (Object) e);
        jSONObject.put("fatigue", (Object) f);
        jSONObject.put("limitIds", (Object) g);
        d();
        return jSONObject.toJSONString();
    }

    private JSONArray e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("ad1c0252", new Object[]{this});
        }
        c();
        JSONArray jSONArray = new JSONArray();
        Cursor rawQuery = this.b.rawQuery("select * from KVPair", null);
        while (rawQuery.moveToNext()) {
            String a2 = a(rawQuery, "key");
            String a3 = a(rawQuery, "value");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", (Object) a2);
            jSONObject.put("value", (Object) a3);
            jSONArray.add(jSONObject);
        }
        rawQuery.close();
        return jSONArray;
    }

    private JSONArray f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("215b3ab1", new Object[]{this});
        }
        c();
        JSONArray jSONArray = new JSONArray();
        Cursor rawQuery = this.b.rawQuery("select * from fatigue", null);
        while (rawQuery.moveToNext()) {
            String a2 = a(rawQuery, "createTime");
            String a3 = a(rawQuery, "actionType");
            String a4 = a(rawQuery, "bizId");
            String a5 = a(rawQuery, "schemeId");
            String a6 = a(rawQuery, "bizPlanId");
            String a7 = a(rawQuery, "materialId");
            String a8 = a(rawQuery, "materialDeliveryId");
            JSONArray jSONArray2 = jSONArray;
            String a9 = a(rawQuery, "identifier");
            Cursor cursor = rawQuery;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("createTime", (Object) a2);
            jSONObject.put("actionType", (Object) a3);
            jSONObject.put("bizId", (Object) a4);
            jSONObject.put("schemeId", (Object) a5);
            jSONObject.put("bizPlanId", (Object) a6);
            jSONObject.put("materialId", (Object) a7);
            jSONObject.put("materialDeliveryId", (Object) a8);
            jSONObject.put("identifier", (Object) a9);
            jSONArray2.add(jSONObject);
            jSONArray = jSONArray2;
            rawQuery = cursor;
        }
        JSONArray jSONArray3 = jSONArray;
        rawQuery.close();
        return jSONArray3;
    }

    private static String a(Cursor cursor, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec4b2b87", new Object[]{cursor, str}) : cursor.getString(cursor.getColumnIndex(str));
    }

    private JSONArray g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("959a7310", new Object[]{this});
        }
        c();
        JSONArray jSONArray = new JSONArray();
        Cursor rawQuery = this.b.rawQuery("select * from limitIds", null);
        while (rawQuery.moveToNext()) {
            String a2 = a(rawQuery, "bizType");
            String a3 = a(rawQuery, "id");
            String a4 = a(rawQuery, "startTime");
            String a5 = a(rawQuery, "endTime");
            String a6 = a(rawQuery, "policyId");
            String a7 = a(rawQuery, "version");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizType", (Object) a2);
            jSONObject.put("id", (Object) a3);
            jSONObject.put("startTime", (Object) a4);
            jSONObject.put("endTime", (Object) a5);
            jSONObject.put("policyId", (Object) a6);
            jSONObject.put("version", (Object) a7);
            jSONArray.add(jSONObject);
        }
        rawQuery.close();
        return jSONArray;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (com.taobao.android.behavix.d.b() == null) {
            return "";
        }
        com.taobao.android.behavir.util.b a2 = com.taobao.android.behavir.util.b.a();
        return a2.a("fatigue" + str);
    }
}
