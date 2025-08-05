package com.alibaba.triver.triver_shop;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.rul;
import tb.ruw;

/* loaded from: classes3.dex */
public final class ShopMoreUtils$requestShopStarInfo$2 extends Lambda implements ruw<Integer, String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ rul<JSONObject, t> $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShopMoreUtils$requestShopStarInfo$2(rul<? super JSONObject, t> rulVar) {
        super(2);
        this.$callback = rulVar;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(Integer num, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("77c951db", new Object[]{this, num, str}) : invoke(num.intValue(), str);
    }

    public final t invoke(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("adb173f1", new Object[]{this, new Integer(i), str});
        }
        rul<JSONObject, t> rulVar = this.$callback;
        if (rulVar == null) {
            return null;
        }
        rulVar.mo2421invoke(null);
        return t.INSTANCE;
    }
}
