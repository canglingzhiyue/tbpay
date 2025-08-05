package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ruw;

/* loaded from: classes3.dex */
public final class l extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1474758670);
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.nativeview.c
    public void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopData, int i) {
        super(context, shopData, i);
        q.d(context, "context");
        q.d(shopData, "shopData");
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.nativeview.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a(i);
        e(i);
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.nativeview.c
    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
            return;
        }
        ruw<Integer, Integer, t> c = c();
        if (c == null) {
            return;
        }
        c.mo2423invoke(Integer.valueOf(i), 0);
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.nativeview.c
    public JSONArray d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("38dcc9f3", new Object[]{this}) : b().bc().q();
    }
}
