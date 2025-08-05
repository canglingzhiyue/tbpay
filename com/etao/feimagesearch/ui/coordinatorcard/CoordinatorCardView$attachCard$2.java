package com.etao.feimagesearch.ui.coordinatorcard;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruw;

/* loaded from: classes3.dex */
public final class CoordinatorCardView$attachCard$2 extends Lambda implements ruw<Integer, String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final CoordinatorCardView$attachCard$2 INSTANCE = new CoordinatorCardView$attachCard$2();

    public CoordinatorCardView$attachCard$2() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("795a6ae2", new Object[]{this, num, str});
        }
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(Integer num, String str) {
        invoke2(num, str);
        return t.INSTANCE;
    }
}
