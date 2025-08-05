package com.airbnb.lottie.model.content;

import tb.aic;
import tb.aig;

/* loaded from: classes2.dex */
public class Mask {

    /* renamed from: a  reason: collision with root package name */
    private final MaskMode f1752a;
    private final aig b;
    private final aic c;
    private final boolean d;

    /* loaded from: classes2.dex */
    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, aig aigVar, aic aicVar, boolean z) {
        this.f1752a = maskMode;
        this.b = aigVar;
        this.c = aicVar;
        this.d = z;
    }

    public MaskMode a() {
        return this.f1752a;
    }

    public aig b() {
        return this.b;
    }

    public aic c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}
