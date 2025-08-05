package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    protected d f7423a;
    private final String b;
    private final c c;
    private final int d;
    private final Context e;
    private final String f;
    private final GrsBaseInfo g;
    private final com.huawei.hms.framework.network.grs.e.c h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.huawei.hms.framework.network.grs.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0267a {
        GRSPOST,
        GRSGET,
        GRSDEFAULT
    }

    public a(String str, int i, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.c cVar2) {
        this.b = str;
        this.c = cVar;
        this.d = i;
        this.e = context;
        this.f = str2;
        this.g = grsBaseInfo;
        this.h = cVar2;
    }

    private String a(String str) {
        return Uri.parse(str).getPath();
    }

    private EnumC0267a h() {
        if (this.b.isEmpty()) {
            return EnumC0267a.GRSDEFAULT;
        }
        String a2 = a(this.b);
        return a2.contains("1.0") ? EnumC0267a.GRSGET : a2.contains("2.0") ? EnumC0267a.GRSPOST : EnumC0267a.GRSDEFAULT;
    }

    public Context a() {
        return this.e;
    }

    public c b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public String e() {
        return this.f;
    }

    public com.huawei.hms.framework.network.grs.e.c f() {
        return this.h;
    }

    public Callable<d> g() {
        if (EnumC0267a.GRSDEFAULT.equals(h())) {
            return null;
        }
        return EnumC0267a.GRSGET.equals(h()) ? new f(this.b, this.d, this.c, this.e, this.f, this.g) : new g(this.b, this.d, this.c, this.e, this.f, this.g, this.h);
    }
}
