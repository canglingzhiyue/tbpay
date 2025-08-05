package com.xiaomi.push;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
class cp {

    /* renamed from: a  reason: collision with root package name */
    private String f24404a;

    /* renamed from: a  reason: collision with other field name */
    private final ArrayList<co> f179a = new ArrayList<>();

    public cp() {
    }

    public cp(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f24404a = str;
            return;
        }
        throw new IllegalArgumentException("the host is empty");
    }

    public synchronized co a() {
        for (int size = this.f179a.size() - 1; size >= 0; size--) {
            co coVar = this.f179a.get(size);
            if (coVar.m1783a()) {
                cs.a().m1794a(coVar.a());
                return coVar;
            }
        }
        return null;
    }

    public synchronized cp a(JSONObject jSONObject) {
        this.f24404a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f179a.add(new co(this.f24404a).a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m1784a() {
        return this.f24404a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ArrayList<co> m1785a() {
        return this.f179a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized JSONObject m1786a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("host", this.f24404a);
        JSONArray jSONArray = new JSONArray();
        Iterator<co> it = this.f179a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m1781a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    public synchronized void a(co coVar) {
        int i = 0;
        while (true) {
            if (i >= this.f179a.size()) {
                break;
            } else if (this.f179a.get(i).a(coVar)) {
                this.f179a.set(i, coVar);
                break;
            } else {
                i++;
            }
        }
        if (i >= this.f179a.size()) {
            this.f179a.add(coVar);
        }
    }

    public synchronized void a(boolean z) {
        ArrayList<co> arrayList;
        for (int size = this.f179a.size() - 1; size >= 0; size--) {
            co coVar = this.f179a.get(size);
            if (z) {
                if (coVar.c()) {
                    arrayList = this.f179a;
                    arrayList.remove(size);
                }
            } else if (!coVar.b()) {
                arrayList = this.f179a;
                arrayList.remove(size);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24404a);
        sb.append("\n");
        Iterator<co> it = this.f179a.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }
}
