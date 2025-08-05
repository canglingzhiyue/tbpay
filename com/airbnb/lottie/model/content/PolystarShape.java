package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import tb.agn;
import tb.agy;
import tb.aia;
import tb.ail;

/* loaded from: classes2.dex */
public class PolystarShape implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f1754a;
    private final Type b;
    private final aia c;
    private final ail<PointF, PointF> d;
    private final aia e;
    private final aia f;
    private final aia g;
    private final aia h;
    private final aia i;
    private final boolean j;
    private final boolean k;

    /* loaded from: classes2.dex */
    public enum Type {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            Type[] values;
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, aia aiaVar, ail<PointF, PointF> ailVar, aia aiaVar2, aia aiaVar3, aia aiaVar4, aia aiaVar5, aia aiaVar6, boolean z, boolean z2) {
        this.f1754a = str;
        this.b = type;
        this.c = aiaVar;
        this.d = ailVar;
        this.e = aiaVar2;
        this.f = aiaVar3;
        this.g = aiaVar4;
        this.h = aiaVar5;
        this.i = aiaVar6;
        this.j = z;
        this.k = z2;
    }

    public String a() {
        return this.f1754a;
    }

    @Override // com.airbnb.lottie.model.content.c
    public agn a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new agy(lottieDrawable, aVar, this);
    }

    public Type b() {
        return this.b;
    }

    public aia c() {
        return this.c;
    }

    public ail<PointF, PointF> d() {
        return this.d;
    }

    public aia e() {
        return this.e;
    }

    public aia f() {
        return this.f;
    }

    public aia g() {
        return this.g;
    }

    public aia h() {
        return this.h;
    }

    public aia i() {
        return this.i;
    }

    public boolean j() {
        return this.j;
    }

    public boolean k() {
        return this.k;
    }
}
