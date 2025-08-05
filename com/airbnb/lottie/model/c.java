package com.airbnb.lottie.model;

import com.airbnb.lottie.model.content.l;
import java.util.List;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<l> f1751a;
    private final char b;
    private final double c;
    private final double d;
    private final String e;
    private final String f;

    public c(List<l> list, char c, double d, double d2, String str, String str2) {
        this.f1751a = list;
        this.b = c;
        this.c = d;
        this.d = d2;
        this.e = str;
        this.f = str2;
    }

    public static int a(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<l> a() {
        return this.f1751a;
    }

    public double b() {
        return this.d;
    }

    public int hashCode() {
        return a(this.b, this.f, this.e);
    }
}
