package com.taobao.pexode.animate;

import tb.kge;

/* loaded from: classes7.dex */
public class AnimatedDrawableFrameInfo {

    /* renamed from: a  reason: collision with root package name */
    public final int f18680a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final DisposalMode f;
    public final BlendMode g;

    /* loaded from: classes7.dex */
    public enum BlendMode {
        BLEND_WITH_PREVIOUS,
        NO_BLEND
    }

    /* loaded from: classes7.dex */
    public enum DisposalMode {
        DISPOSE_DO_NOT,
        DISPOSE_TO_BACKGROUND,
        DISPOSE_TO_PREVIOUS
    }

    static {
        kge.a(729666141);
    }

    public AnimatedDrawableFrameInfo(int i, int i2, int i3, int i4, int i5, BlendMode blendMode, DisposalMode disposalMode) {
        this.f18680a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.g = blendMode;
        this.f = disposalMode;
    }
}
