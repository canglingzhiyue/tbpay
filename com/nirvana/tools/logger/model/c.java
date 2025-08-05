package com.nirvana.tools.logger.model;

/* loaded from: classes4.dex */
public class c {
    public static final int FLAG_ALL = -1;
    public static final int UPLOAD_FLAG_FAILED = 1;
    public static final int UPLOAD_FLAG_NONE = 0;
    public static final int UPLOAD_FLAG_SUCCEED = 2;
    public static final int UPLOAD_STRATEGY_ALL_NETWORK = 2;
    public static final int UPLOAD_STRATEGY_ONLY_WIFI = 1;

    /* renamed from: a  reason: collision with root package name */
    private long f8093a;
    private String e;
    private long b = System.currentTimeMillis();
    private int f = 2;
    private int d = 0;
    private int c = 0;

    public void a(long j) {
        this.f8093a = j;
    }

    public void a(String str) {
        this.e = str;
    }

    public long b() {
        return this.f8093a;
    }

    public void b(int i) {
        this.c = i;
    }

    public void b(long j) {
        this.b = j;
    }

    public long c() {
        return this.b;
    }

    public void c(int i) {
        this.d = i;
    }

    public int d() {
        return this.c;
    }

    public void d(int i) {
        this.f = i;
    }

    public int e() {
        return this.d;
    }

    public String f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }
}
