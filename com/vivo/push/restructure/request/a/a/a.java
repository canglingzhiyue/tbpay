package com.vivo.push.restructure.request.a.a;

import com.vivo.push.restructure.request.a.a.c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f24234a;
    private int b;
    private JSONArray c;

    public a() {
        this.f24234a = 0;
        this.c = new JSONArray();
    }

    public a(String str) throws JSONException {
        this.f24234a = 0;
        this.c = new JSONArray(str);
        this.f24234a = 0;
        this.b = this.c.length();
    }

    public final int a() throws JSONException {
        int i = this.f24234a;
        if (i < this.b) {
            JSONArray jSONArray = this.c;
            this.f24234a = i + 1;
            return jSONArray.getInt(i);
        }
        return 0;
    }

    public final void a(int i) {
        this.c.put(i);
    }

    public final void a(long j) {
        this.c.put(j);
    }

    public final <T extends c> void a(c.a<T> aVar, List<T> list) throws JSONException {
        T t;
        int i = this.f24234a;
        if (i < this.b ? this.c.isNull(i) : true) {
            this.f24234a++;
            return;
        }
        JSONArray jSONArray = this.c;
        int i2 = this.f24234a;
        this.f24234a = i2 + 1;
        int i3 = jSONArray.getInt(i2);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.f24234a;
            if (i5 < this.b) {
                JSONArray jSONArray2 = this.c;
                this.f24234a = i5 + 1;
                t = aVar.a(jSONArray2.getString(i5));
            } else {
                t = null;
            }
            list.add(t);
        }
    }

    public final void a(String str) {
        this.c.put(str);
    }

    public final <T extends c> void a(List<T> list) {
        if (list == null) {
            this.c.put((Object) null);
            return;
        }
        this.c.put(list.size());
        for (T t : list) {
            this.c.put(t.a());
        }
    }

    public final long b() throws JSONException {
        int i = this.f24234a;
        if (i < this.b) {
            JSONArray jSONArray = this.c;
            this.f24234a = i + 1;
            return jSONArray.getLong(i);
        }
        return 0L;
    }

    public final String c() throws JSONException {
        int i = this.f24234a;
        if (i < this.b) {
            JSONArray jSONArray = this.c;
            this.f24234a = i + 1;
            return jSONArray.getString(i);
        }
        return null;
    }

    public final String d() {
        JSONArray jSONArray = this.c;
        return jSONArray != null ? jSONArray.toString() : "";
    }
}
