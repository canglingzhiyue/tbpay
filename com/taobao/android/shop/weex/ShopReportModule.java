package com.taobao.android.shop.weex;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class ShopReportModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(358194686);
    }

    @JSMethod(uiThread = false)
    public void report(String str, String str2, Map<String, String> map, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d580072", new Object[]{this, str, str2, map, jSCallback});
            return;
        }
        Long l = null;
        try {
            l = Long.valueOf(Long.parseLong(str2));
        } catch (NumberFormatException unused) {
        }
        if (l == null) {
            l = Long.valueOf(System.currentTimeMillis());
        }
        Context O = this.mWXSDKInstance.O();
        if (O instanceof ShopRenderActivity) {
            String str3 = "";
            if (!StringUtils.isEmpty(str) && str.contains("will")) {
                ((ShopRenderActivity) O).recordCostTime(str.replace("will", com.taobao.tao.messagekit.base.network.a.KEY_DID), l.longValue());
            } else {
                ShopRenderActivity shopRenderActivity = (ShopRenderActivity) O;
                Object[] objArr = new Object[2];
                objArr[0] = "main-cost";
                objArr[1] = map != null ? map.toString() : str3;
                shopRenderActivity.showCostTime(str, l, objArr);
            }
            if ((str.contains("pagedata") && str.contains("will")) || ((str.contains("downgrade") && str.contains("will")) || (str.contains("fetch") && str.contains("will")))) {
                ShopRenderActivity shopRenderActivity2 = (ShopRenderActivity) O;
                Object[] objArr2 = new Object[2];
                objArr2[0] = "main-cost";
                if (map != null) {
                    str3 = map.toString();
                }
                objArr2[1] = str3;
                shopRenderActivity2.showCostTime(str, l, objArr2);
                return;
            } else if (!str.contains("total") && !str.contains("shopperf_interaction_time")) {
                return;
            } else {
                return;
            }
        }
        jSCallback.invoke("failed. not ShopRenderActivity");
    }

    @JSMethod(uiThread = false)
    public void abtestActivateServer(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("752afb4e", new Object[]{this, str, jSCallback});
            return;
        }
        try {
            UTABTest.activateServer(str);
            jSCallback.invoke(com.taobao.android.weex_framework.util.a.ATOM_done);
        } catch (Throwable unused) {
            jSCallback.invoke("exception");
        }
    }
}
