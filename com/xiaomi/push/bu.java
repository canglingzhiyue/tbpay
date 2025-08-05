package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.ah;
import com.xiaomi.push.cg;

/* loaded from: classes9.dex */
public class bu {

    /* renamed from: a  reason: collision with root package name */
    private static volatile bu f24383a;

    /* renamed from: a  reason: collision with other field name */
    private Context f144a;

    /* renamed from: a  reason: collision with other field name */
    private cj f146a;

    /* renamed from: a  reason: collision with other field name */
    private ck f147a;
    private String e;
    private String f;

    /* renamed from: a  reason: collision with other field name */
    private final String f148a = "push_stat_sp";

    /* renamed from: b  reason: collision with other field name */
    private final String f149b = "upload_time";

    /* renamed from: c  reason: collision with other field name */
    private final String f150c = "delete_time";
    private final String d = "check_time";

    /* renamed from: a  reason: collision with other field name */
    private ah.a f145a = new bv(this);
    private ah.a b = new bw(this);
    private ah.a c = new bx(this);

    private bu(Context context) {
        this.f144a = context;
    }

    public static bu a(Context context) {
        if (f24383a == null) {
            synchronized (bu.class) {
                if (f24383a == null) {
                    f24383a = new bu(context);
                }
            }
        }
        return f24383a;
    }

    private boolean a() {
        return com.xiaomi.push.service.az.a(this.f144a).a(ih.StatDataSwitch.a(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        SharedPreferences.Editor edit = this.f144a.getSharedPreferences("push_stat_sp", 0).edit();
        edit.putLong(str, System.currentTimeMillis());
        p.a(edit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        return this.f144a.getDatabasePath(by.f152a).getAbsolutePath();
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m1752a() {
        return this.e;
    }

    public void a(cg.a aVar) {
        cg.a(this.f144a).a(aVar);
    }

    public void a(ig igVar) {
        if (a() && com.xiaomi.push.service.ca.a(igVar.e())) {
            a(cd.a(this.f144a, c(), igVar));
        }
    }

    public void a(String str) {
        if (a() && !TextUtils.isEmpty(str)) {
            a(cl.a(this.f144a, str));
        }
    }

    public void a(String str, String str2, Boolean bool) {
        if (this.f146a != null) {
            if (bool.booleanValue()) {
                this.f146a.a(this.f144a, str2, str);
            } else {
                this.f146a.b(this.f144a, str2, str);
            }
        }
    }

    public String b() {
        return this.f;
    }
}
