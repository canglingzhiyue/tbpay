package com.xiaomi.push;

/* loaded from: classes9.dex */
public class jv {

    /* renamed from: a  reason: collision with root package name */
    public final byte f24584a;

    /* renamed from: a  reason: collision with other field name */
    public final String f839a;

    /* renamed from: a  reason: collision with other field name */
    public final short f840a;

    public jv() {
        this("", (byte) 0, (short) 0);
    }

    public jv(String str, byte b, short s) {
        this.f839a = str;
        this.f24584a = b;
        this.f840a = s;
    }

    public String toString() {
        return "<TField name:'" + this.f839a + "' type:" + ((int) this.f24584a) + " field-id:" + ((int) this.f840a) + ">";
    }
}
