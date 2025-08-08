package com.vivo.push;

import mtopsdk.common.util.StringUtils;

/* loaded from: classes9.dex */
public final class z implements k {

    /* renamed from: a  reason: collision with root package name */
    private y f24274a = new y();
    private y b = new y();
    private com.vivo.push.c.a c;
    private volatile String d;
    private com.vivo.push.restructure.b.a e;

    public z(com.vivo.push.c.a aVar, com.vivo.push.restructure.b.a aVar2) {
        this.c = aVar;
        this.e = aVar2;
    }

    private int c() {
        if (!this.c.d()) {
            return 8013;
        }
        if (this.b.a()) {
            com.vivo.push.util.u.d("SubscribeImpl", "isAppSubscribe 两秒内重复调用  ");
            return 1002;
        }
        int i = 1;
        try {
            String a2 = new e(1, com.vivo.push.restructure.a.a().b().getPackageName(), "", "", com.vivo.push.restructure.a.a().e().f()).a();
            com.vivo.push.util.u.d("SubscribeImpl", "isAppSubscribe parameter = ".concat(String.valueOf(a2)));
            String a3 = com.vivo.push.c.a.a(com.vivo.push.restructure.a.a().b(), a2);
            com.vivo.push.util.u.d("SubscribeImpl", "isAppSubscribe isSubscribe = ".concat(String.valueOf(a3)));
            if (!StringUtils.isEmpty(a3)) {
                i = 1 ^ (Boolean.parseBoolean(g.f24203a.a(a3).b()) ? 1 : 0);
            }
        } catch (Exception e) {
            com.vivo.push.util.u.a("SubscribeImpl", "isAppSubscribe", e);
        }
        com.vivo.push.util.u.d("SubscribeImpl", "isAppSubscribe code = ".concat(String.valueOf(i)));
        return i;
    }

    private String d() {
        String concat;
        String str = "";
        if (!this.c.d()) {
            concat = "getRegidByCoreSdk 系统不支持查询regid  ";
        } else if (this.f24274a.a()) {
            concat = "getRegidByCoreSdk 两秒内重复调用  ";
        } else {
            try {
                String a2 = new e(2, com.vivo.push.restructure.a.a().b().getPackageName(), "", "", com.vivo.push.restructure.a.a().e().f()).a();
                com.vivo.push.util.u.d("SubscribeImpl", "getRegidByCoreSdk parameter = ".concat(String.valueOf(a2)));
                String a3 = com.vivo.push.c.a.a(com.vivo.push.restructure.a.a().b(), a2);
                com.vivo.push.util.u.d("SubscribeImpl", "getRegidByCoreSdk isSubscribe = ".concat(String.valueOf(a3)));
                if (!StringUtils.isEmpty(a3)) {
                    str = g.f24203a.a(a3).b();
                }
            } catch (Exception e) {
                com.vivo.push.util.u.a("SubscribeImpl", "getRegidByCoreSdk", e);
            }
            concat = "getRegidByCoreSdk code = ".concat(String.valueOf(str));
        }
        com.vivo.push.util.u.d("SubscribeImpl", concat);
        return str;
    }

    private void d(String str) {
        this.d = str;
        this.e.c(this.d);
    }

    @Override // com.vivo.push.k
    public final int a() {
        return c();
    }

    @Override // com.vivo.push.k
    public final void a(IPushActionListener iPushActionListener, String str, String str2) {
        if (this.c.c() || iPushActionListener == null) {
            m.a().b(iPushActionListener, str, str2);
        } else {
            iPushActionListener.onStateChanged(8012);
        }
    }

    @Override // com.vivo.push.k
    public final void a(String str) {
        d(str);
        this.e.d();
        this.e.b();
    }

    @Override // com.vivo.push.k
    public final void a(String str, String str2, String str3) {
        d(str);
        this.e.a(str2);
        this.e.b(str3);
    }

    @Override // com.vivo.push.k
    public final String b() {
        if (!StringUtils.isEmpty(this.d)) {
            return this.d;
        }
        String d = d();
        if (StringUtils.isEmpty(d)) {
            d = this.e.f();
            t.c(new aa(this, d));
        }
        this.d = d;
        com.vivo.push.util.u.d("SubscribeImpl", "getRegidByCoreSdk code = ".concat(String.valueOf(d)));
        return d;
    }

    @Override // com.vivo.push.k
    public final void b(String str) {
        d(str);
        m.a().e();
        this.e.h();
        this.e.d();
        this.e.b();
    }

    @Override // com.vivo.push.k
    public final void c(String str) {
        d(str);
    }
}
