package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.rul;

/* loaded from: classes3.dex */
public /* synthetic */ class Default2023Shop$initComponent$3 extends FunctionReferenceImpl implements rul<Boolean, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Default2023Shop$initComponent$3(a aVar) {
        super(1, aVar, a.class, "changeToCrossStoreStyle", "changeToCrossStoreStyle(Z)Z", 0);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Boolean, java.lang.Object] */
    @Override // tb.rul
    /* renamed from: invoke */
    public /* synthetic */ Boolean mo2421invoke(Boolean bool) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9923577", new Object[]{this, bool}) : Boolean.valueOf(invoke(bool.booleanValue()));
    }

    public final boolean invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36b985b9", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        a aVar = (a) this.receiver;
        return a.$ipChange;
    }
}
