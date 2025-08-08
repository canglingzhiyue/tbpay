package com.vivo.push.b;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.vivo.push.util.aa;

/* loaded from: classes9.dex */
public class c extends com.vivo.push.v {

    /* renamed from: a  reason: collision with root package name */
    private String f24154a;
    private String b;
    private long c;
    private int d;
    private int e;
    private String f;
    private String g;
    private String h;

    public c(int i, String str) {
        super(i);
        this.c = -1L;
        this.d = -1;
        this.f24154a = null;
        this.b = str;
    }

    public final int a(Context context) {
        if (this.d == -1) {
            String str = this.b;
            if (StringUtils.isEmpty(str)) {
                com.vivo.push.util.u.a("BaseAppCommand", "pkg name is null");
                String a2 = a();
                if (StringUtils.isEmpty(a2)) {
                    com.vivo.push.util.u.a("BaseAppCommand", "src is null");
                    return -1;
                }
                str = a2;
            }
            this.d = aa.b(context, str);
            if (!StringUtils.isEmpty(this.f)) {
                this.d = 2;
            }
        }
        return this.d;
    }

    public final void b(int i) {
        this.e = i;
    }

    public final void b(String str) {
        this.f24154a = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.v
    public void c(com.vivo.push.d dVar) {
        dVar.a("req_id", this.f24154a);
        dVar.a("package_name", this.b);
        dVar.a("sdk_version", 341L);
        dVar.a("PUSH_APP_STATUS", this.d);
        if (!StringUtils.isEmpty(this.f)) {
            dVar.a("BaseAppCommand.EXTRA__HYBRIDVERSION", this.f);
        }
        dVar.a("BaseAppCommand.EXTRA_APPID", this.h);
        dVar.a("BaseAppCommand.EXTRA_APPKEY", this.g);
    }

    public final void c(String str) {
        this.h = str;
    }

    public final int d() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.v
    public void d(com.vivo.push.d dVar) {
        this.f24154a = dVar.a("req_id");
        this.b = dVar.a("package_name");
        this.c = dVar.b("sdk_version", 0L);
        this.d = dVar.b("PUSH_APP_STATUS", 0);
        this.f = dVar.a("BaseAppCommand.EXTRA__HYBRIDVERSION");
        this.h = dVar.a("BaseAppCommand.EXTRA_APPID");
        this.g = dVar.a("BaseAppCommand.EXTRA_APPKEY");
    }

    public final void d(String str) {
        this.g = str;
    }

    public final void e() {
        this.f = null;
    }

    public final String f() {
        return this.f24154a;
    }

    @Override // com.vivo.push.v
    public String toString() {
        return "BaseAppCommand";
    }
}
