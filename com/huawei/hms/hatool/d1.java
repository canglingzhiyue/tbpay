package com.huawei.hms.hatool;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class d1 implements g {

    /* renamed from: a  reason: collision with root package name */
    private String f7455a;
    private String b;
    private String c;
    private List<b1> d;

    public d1(List<b1> list, String str, String str2, String str3) {
        this.f7455a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    private void a() {
        d.a(q0.i(), "backup_event", n1.a(this.f7455a, this.c, this.b));
    }

    @Override // java.lang.Runnable
    public void run() {
        List<b1> list = this.d;
        if (list == null || list.size() == 0) {
            v.d("hmsSdk", "failed events is empty");
            return;
        }
        if (c0.a(q0.i(), "cached_v2_1", q0.k() * 1048576)) {
            v.e("hmsSdk", "The cacheFile is full,Can not writing data! reqID:" + this.b);
            return;
        }
        String a2 = n1.a(this.f7455a, this.c);
        List<b1> list2 = c1.b(q0.i(), "cached_v2_1", a2).get(a2);
        if (list2 != null && list2.size() != 0) {
            this.d.addAll(list2);
        }
        JSONArray jSONArray = new JSONArray();
        for (b1 b1Var : this.d) {
            try {
                jSONArray.put(b1Var.d());
            } catch (JSONException unused) {
                v.e("hmsSdk", "event to json error");
            }
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2.length() > q0.h() * 1048576) {
            v.e("hmsSdk", "this failed data is too long,can not writing it");
            this.d = null;
            return;
        }
        v.d("hmsSdk", "data send failed, write to cache file...reqID:" + this.b);
        d.b(q0.i(), "cached_v2_1", a2, jSONArray2);
        a();
    }
}
