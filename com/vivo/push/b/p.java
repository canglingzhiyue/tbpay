package com.vivo.push.b;

import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.vivo.push.model.InsideNotificationItem;

/* loaded from: classes9.dex */
public final class p extends com.vivo.push.v {

    /* renamed from: a  reason: collision with root package name */
    private String f24164a;
    private String b;
    private byte[] c;
    private long d;
    private InsideNotificationItem e;
    private String f;
    private String g;
    private Uri h;
    private String i;
    private Bundle j;

    public p() {
        super(5);
    }

    public p(String str, long j, InsideNotificationItem insideNotificationItem) {
        super(5);
        this.f24164a = str;
        this.d = j;
        this.e = insideNotificationItem;
    }

    private static Uri e(String str) {
        try {
            return Uri.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void a(Uri uri) {
        this.h = uri;
    }

    public final void b(String str) {
        this.f = str;
    }

    @Override // com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        dVar.a("package_name", this.f24164a);
        dVar.a("notify_id", this.d);
        dVar.a("notification_v1", com.vivo.push.util.v.b(this.e));
        dVar.a("open_pkg_name", this.b);
        dVar.a("open_pkg_name_encode", this.c);
        dVar.a("notify_action", this.f);
        dVar.a("notify_componet_pkg", this.g);
        dVar.a("notify_componet_class_name", this.i);
        Uri uri = this.h;
        if (uri != null) {
            dVar.a("notify_uri_data", uri.toString());
        }
    }

    public final void c(String str) {
        this.g = str;
    }

    public final String d() {
        return this.f24164a;
    }

    @Override // com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        this.f24164a = dVar.a("package_name");
        this.d = dVar.b("notify_id", -1L);
        this.b = dVar.a("open_pkg_name");
        this.c = dVar.b("open_pkg_name_encode");
        this.f = dVar.a("notify_action");
        this.g = dVar.a("notify_componet_pkg");
        this.i = dVar.a("notify_componet_class_name");
        String a2 = dVar.a("notification_v1");
        if (!StringUtils.isEmpty(a2)) {
            this.e = com.vivo.push.util.v.a(a2);
        }
        InsideNotificationItem insideNotificationItem = this.e;
        if (insideNotificationItem != null) {
            insideNotificationItem.setMsgId(this.d);
        }
        String a3 = dVar.a("notify_uri_data");
        if (!StringUtils.isEmpty(a3)) {
            this.h = e(a3);
        }
        this.j = dVar.b();
    }

    public final void d(String str) {
        this.i = str;
    }

    public final long e() {
        return this.d;
    }

    public final InsideNotificationItem f() {
        return this.e;
    }

    public final String g() {
        return this.f;
    }

    public final String h() {
        return this.g;
    }

    public final String i() {
        return this.i;
    }

    public final Uri j() {
        return this.h;
    }

    public final Bundle k() {
        Bundle bundle = this.j;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        try {
            bundle2.remove("command_type");
            bundle2.remove("security_avoid_pull");
            bundle2.remove("security_avoid_pull_rsa");
            bundle2.remove("security_avoid_rsa_public_key");
            bundle2.remove("security_avoid_rsa_public_key");
            bundle2.remove("notify_action");
            bundle2.remove("notify_componet_pkg");
            bundle2.remove("notify_componet_class_name");
            bundle2.remove("notification_v1");
            bundle2.remove("command");
            bundle2.remove("package_name");
            bundle2.remove("method");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bundle2;
    }

    @Override // com.vivo.push.v
    public final String toString() {
        return "OnNotificationClickCommand";
    }
}
