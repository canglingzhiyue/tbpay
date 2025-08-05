package com.meizu.cloud.pushsdk.handler.e.h;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private long f7983a;
    private int b;
    private List<String> c;
    private List<String> d;
    private List<a> e;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f7984a;
        private String b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(String str, String str2) {
            this.f7984a = str;
            this.b = str2;
        }

        public String a() {
            return this.f7984a;
        }

        public String b() {
            return this.b;
        }

        public String toString() {
            return "ShieldConfig{mModel=" + this.f7984a + "mOs=" + this.b + '}';
        }
    }

    public List<a> a() {
        return this.e;
    }

    public void a(int i) {
        this.b = i;
    }

    public void a(long j) {
        this.f7983a = j;
    }

    public void a(a aVar) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(aVar);
    }

    public void a(String str) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(str);
    }

    public List<String> b() {
        return this.d;
    }

    public void b(String str) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(str);
    }

    public List<String> c() {
        return this.c;
    }

    public boolean d() {
        int i;
        long j = this.f7983a;
        return (j == 0 || (i = this.b) == 0 || j + ((long) (i * 3600000)) <= System.currentTimeMillis()) ? false : true;
    }

    public String toString() {
        return "PushConfigInfo{mRequestTime=" + this.f7983a + "mIntervalHour=" + this.b + "mShieldPackageList=" + this.d + "mWhitePackageList=" + this.c + "mShieldConfigList=" + this.e + '}';
    }
}
