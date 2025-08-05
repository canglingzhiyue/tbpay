package com.meizu.cloud.pushsdk.f.d;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.f.d.a;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;

/* loaded from: classes4.dex */
public class b extends com.meizu.cloud.pushsdk.f.d.a {
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final int m;

    /* renamed from: com.meizu.cloud.pushsdk.f.d.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static class C0284b extends c<C0284b> {
        private C0284b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.meizu.cloud.pushsdk.f.d.a.AbstractC0283a
        /* renamed from: c */
        public C0284b a() {
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class c<T extends c<T>> extends a.AbstractC0283a<T> {
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;
        private int m = 0;

        public T a(int i) {
            this.m = i;
            return (T) a();
        }

        public T a(String str) {
            this.f = str;
            return (T) a();
        }

        public T b(String str) {
            this.l = str;
            return (T) a();
        }

        public b b() {
            return new b(this);
        }

        public T c(String str) {
            this.d = str;
            return (T) a();
        }

        public T d(String str) {
            this.g = str;
            return (T) a();
        }

        public T e(String str) {
            this.k = str;
            return (T) a();
        }

        public T f(String str) {
            this.i = str;
            return (T) a();
        }

        public T g(String str) {
            this.h = str;
            return (T) a();
        }

        public T h(String str) {
            this.j = str;
            return (T) a();
        }

        public T i(String str) {
            this.e = str;
            return (T) a();
        }
    }

    protected b(c<?> cVar) {
        super(cVar);
        this.e = ((c) cVar).e;
        this.f = ((c) cVar).f;
        this.g = ((c) cVar).g;
        this.d = ((c) cVar).d;
        this.h = ((c) cVar).h;
        this.i = ((c) cVar).i;
        this.j = ((c) cVar).j;
        this.k = ((c) cVar).k;
        this.l = ((c) cVar).l;
        this.m = ((c) cVar).m;
    }

    public static c<?> d() {
        return new C0284b();
    }

    public com.meizu.cloud.pushsdk.f.b.c e() {
        String str;
        String str2;
        com.meizu.cloud.pushsdk.f.b.c cVar = new com.meizu.cloud.pushsdk.f.b.c();
        cVar.a("en", this.d);
        cVar.a("ti", this.e);
        if (!TextUtils.isEmpty(this.g)) {
            str = this.g;
            str2 = "fdId";
        } else {
            str = this.f;
            str2 = AppIconSetting.DEFAULT_LARGE_ICON;
        }
        cVar.a(str2, str);
        cVar.a("pv", this.h);
        cVar.a("pn", this.i);
        cVar.a("si", this.j);
        cVar.a("ms", this.k);
        cVar.a("ect", this.l);
        cVar.a("br", Integer.valueOf(this.m));
        return a(cVar);
    }
}
