package com.alibaba.triver.triver_shop.newShop;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.ruw;

/* loaded from: classes3.dex */
public /* synthetic */ class ShopActivity$init$shopData$1 extends FunctionReferenceImpl implements ruw<String, Integer, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShopActivity$init$shopData$1(ShopActivity shopActivity) {
        super(2, shopActivity, ShopActivity.class, "parseDataErrorCallback", "parseDataErrorCallback(Ljava/lang/String;I)V", 0);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(String str, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c951db", new Object[]{this, str, num});
        }
        invoke(str, num.intValue());
        return t.INSTANCE;
    }

    public final void invoke(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5588bf1a", new Object[]{this, str, new Integer(i)});
        } else {
            ShopActivity.a((ShopActivity) this.receiver, str, i);
        }
    }
}
