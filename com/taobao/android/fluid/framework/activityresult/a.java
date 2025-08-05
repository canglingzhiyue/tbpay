package com.taobao.android.fluid.framework.activityresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import java.util.HashMap;
import tb.kge;
import tb.sma;
import tb.spy;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f12447a;
    private SparseArray<String> b;

    static {
        kge.a(1171422062);
        f12447a = 0;
    }

    public void a(FluidContext fluidContext, Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf22822", new Object[]{this, fluidContext, fragment, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            f12447a = (f12447a + 1) % 254;
            this.b.put(f12447a, str);
            int i = f12447a + 256;
            Bundle bundle = new Bundle();
            bundle.putString("bizName", "taobaoVideo");
            FluidSDK.getNavAdapter().nav(fluidContext, fragment, "http://a.m.taobao.com/sku" + str + ".htm", bundle, 0, i);
        }
    }

    public void a(sma smaVar, String str, int i, int i2, Intent intent) {
        SparseArray<String> sparseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd27c18", new Object[]{this, smaVar, str, new Integer(i), new Integer(i2), intent});
        } else if ((65280 & i) != 256 || i2 != 1 || (sparseArray = this.b) == null) {
        } else {
            String str2 = sparseArray.get(i & 255);
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", str2);
            hashMap.put("action", "addToCart");
            smaVar.sendMessage(new spy("VSMSG_skuAction", str, hashMap));
        }
    }
}
