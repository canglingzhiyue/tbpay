package com.huawei.hms.hatool;

/* loaded from: classes4.dex */
public class l1 {

    /* renamed from: a  reason: collision with root package name */
    private s0 f7471a;
    private s0 b;
    private s0 c;
    private s0 d;

    public l1(String str) {
    }

    public s0 a() {
        return this.c;
    }

    public s0 a(String str) {
        if (str.equals("oper")) {
            return c();
        }
        if (str.equals("maint")) {
            return b();
        }
        if (str.equals("diffprivacy")) {
            return a();
        }
        if (str.equals("preins")) {
            return d();
        }
        v.f("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: " + str);
        return null;
    }

    public void a(s0 s0Var) {
        this.f7471a = s0Var;
    }

    public s0 b() {
        return this.f7471a;
    }

    public void b(s0 s0Var) {
        this.b = s0Var;
    }

    public s0 c() {
        return this.b;
    }

    public s0 d() {
        return this.d;
    }
}
