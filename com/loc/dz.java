package com.loc;

import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class dz implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public String f7753a;
    public String b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;

    public dz() {
        this.f7753a = "";
        this.b = "";
        this.c = 99;
        this.d = Integer.MAX_VALUE;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.i = true;
    }

    public dz(boolean z, boolean z2) {
        this.f7753a = "";
        this.b = "";
        this.c = 99;
        this.d = Integer.MAX_VALUE;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.i = true;
        this.h = z;
        this.i = z2;
    }

    private static int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            ej.a(e);
            return 0;
        }
    }

    @Override // 
    /* renamed from: a */
    public abstract dz clone();

    public final void a(dz dzVar) {
        this.f7753a = dzVar.f7753a;
        this.b = dzVar.b;
        this.c = dzVar.c;
        this.d = dzVar.d;
        this.e = dzVar.e;
        this.f = dzVar.f;
        this.g = dzVar.g;
        this.h = dzVar.h;
        this.i = dzVar.i;
    }

    public final int b() {
        return a(this.f7753a);
    }

    public final int c() {
        return a(this.b);
    }

    public String toString() {
        return "AmapCell{mcc=" + this.f7753a + ", mnc=" + this.b + ", signalStrength=" + this.c + ", asulevel=" + this.d + ", lastUpdateSystemMills=" + this.e + ", lastUpdateUtcMills=" + this.f + ", age=" + this.g + ", main=" + this.h + ", newapi=" + this.i + '}';
    }
}
