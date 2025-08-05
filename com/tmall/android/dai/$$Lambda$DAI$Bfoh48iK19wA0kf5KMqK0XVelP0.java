package com.tmall.android.dai;

import java.util.concurrent.Callable;

/* compiled from: lambda */
/* renamed from: com.tmall.android.dai.-$$Lambda$DAI$Bfoh48iK19wA0kf5KMqK0XVelP0  reason: invalid class name */
/* loaded from: classes9.dex */
public final /* synthetic */ class $$Lambda$DAI$Bfoh48iK19wA0kf5KMqK0XVelP0 implements Callable {
    public static final /* synthetic */ $$Lambda$DAI$Bfoh48iK19wA0kf5KMqK0XVelP0 INSTANCE = new $$Lambda$DAI$Bfoh48iK19wA0kf5KMqK0XVelP0();

    private /* synthetic */ $$Lambda$DAI$Bfoh48iK19wA0kf5KMqK0XVelP0() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Integer loadNativeDBBeforeStartInner;
        loadNativeDBBeforeStartInner = DAI.loadNativeDBBeforeStartInner();
        return loadNativeDBBeforeStartInner;
    }
}
