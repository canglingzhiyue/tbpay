package com.hihonor.push.sdk;

import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import com.hihonor.push.sdk.x;

/* loaded from: classes4.dex */
public class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7290a;
    public final /* synthetic */ x.a b;

    public v(x.a aVar, int i) {
        this.b = aVar;
        this.f7290a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.a(HonorPushErrorEnum.fromCode(this.f7290a));
    }
}
