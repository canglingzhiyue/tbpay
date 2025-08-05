package com.airbnb.lottie.model;

/* loaded from: classes2.dex */
public class DocumentData {

    /* renamed from: a  reason: collision with root package name */
    public String f1748a;
    public String b;
    public float c;
    public Justification d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public boolean k;

    /* loaded from: classes2.dex */
    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData() {
    }

    public DocumentData(String str, String str2, float f, Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        a(str, str2, f, justification, i, f2, f3, i2, i3, f4, z);
    }

    public void a(String str, String str2, float f, Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.f1748a = str;
        this.b = str2;
        this.c = f;
        this.d = justification;
        this.e = i;
        this.f = f2;
        this.g = f3;
        this.h = i2;
        this.i = i3;
        this.j = f4;
        this.k = z;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f1748a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c)) * 31) + this.d.ordinal()) * 31) + this.e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.h;
    }
}
