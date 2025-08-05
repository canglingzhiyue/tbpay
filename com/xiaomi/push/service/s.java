package com.xiaomi.push.service;

import com.xiaomi.push.ib;
import com.xiaomi.push.ig;
import java.util.List;

/* loaded from: classes9.dex */
public class s implements ib {

    /* renamed from: a  reason: collision with root package name */
    private final XMPushService f24724a;

    public s(XMPushService xMPushService) {
        this.f24724a = xMPushService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f24724a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }

    @Override // com.xiaomi.push.ib
    public void a(List<ig> list, String str, String str2) {
        this.f24724a.a(new t(this, 4, str, list, str2));
    }
}
