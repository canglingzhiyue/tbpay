package com.xiaomi.push;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public class cn {

    /* renamed from: a  reason: collision with root package name */
    private int f24402a;

    /* renamed from: a  reason: collision with other field name */
    private long f173a;

    /* renamed from: a  reason: collision with other field name */
    private String f174a;
    private long b;
    private long c;

    public cn() {
        this(0, 0L, 0L, null);
    }

    public cn(int i, long j, long j2, Exception exc) {
        this.f24402a = i;
        this.f173a = j;
        this.c = j2;
        this.b = System.currentTimeMillis();
        if (exc != null) {
            this.f174a = exc.getClass().getSimpleName();
        }
    }

    public int a() {
        return this.f24402a;
    }

    public cn a(JSONObject jSONObject) {
        this.f173a = jSONObject.getLong("cost");
        this.c = jSONObject.getLong("size");
        this.b = jSONObject.getLong("ts");
        this.f24402a = jSONObject.getInt("wt");
        this.f174a = jSONObject.optString("expt");
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public JSONObject m1779a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f173a);
        jSONObject.put("size", this.c);
        jSONObject.put("ts", this.b);
        jSONObject.put("wt", this.f24402a);
        jSONObject.put("expt", this.f174a);
        return jSONObject;
    }
}
