package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import tb.agn;
import tb.ahf;
import tb.aia;
import tb.akh;
import tb.riy;

/* loaded from: classes2.dex */
public class ShapeTrimPath implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f1757a;
    private final Type b;
    private final aia c;
    private final aia d;
    private final aia e;
    private final boolean f;

    /* loaded from: classes2.dex */
    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i != 1) {
                if (i == 2) {
                    return INDIVIDUALLY;
                }
                akh.c("Unknown trim path type " + i);
                return null;
            }
            return SIMULTANEOUSLY;
        }
    }

    public ShapeTrimPath(String str, Type type, aia aiaVar, aia aiaVar2, aia aiaVar3, boolean z) {
        this.f1757a = str;
        this.b = type;
        this.c = aiaVar;
        this.d = aiaVar2;
        this.e = aiaVar3;
        this.f = z;
    }

    public String a() {
        return this.f1757a;
    }

    @Override // com.airbnb.lottie.model.content.c
    public agn a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new ahf(aVar, this);
    }

    public Type b() {
        return this.b;
    }

    public aia c() {
        return this.d;
    }

    public aia d() {
        return this.c;
    }

    public aia e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.c + ", end: " + this.d + ", offset: " + this.e + riy.BLOCK_END_STR;
    }
}
