package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import java.util.HashMap;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1449685255);
    }

    public static /* synthetic */ WXSDKInstance a(Context context, String str, com.taobao.weex.d dVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("1d0243cf", new Object[]{context, str, dVar, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            dVar = null;
        }
        return a(context, str, dVar);
    }

    public static final WXSDKInstance a(Context context, String str, com.taobao.weex.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("21d2e30c", new Object[]{context, str, dVar});
        }
        kotlin.jvm.internal.q.d(context, "context");
        WXSDKInstance wXSDKInstance = new WXSDKInstance(context);
        wXSDKInstance.c(true);
        HashMap hashMap = new HashMap();
        hashMap.put("bundleUrl", str);
        wXSDKInstance.a(new a());
        wXSDKInstance.c("shopEmbed", str, hashMap, "", WXRenderStrategy.APPEND_ASYNC);
        ceg.Companion.b(kotlin.jvm.internal.q.a("start render weex instance : ", (Object) str));
        return wXSDKInstance;
    }

    /* loaded from: classes3.dex */
    public static final class a implements com.taobao.weex.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.weex.d
        public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            }
        }

        @Override // com.taobao.weex.d
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            }
        }

        @Override // com.taobao.weex.d
        public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
                return;
            }
            ceg.a aVar = ceg.Companion;
            aVar.b("weex onException : " + ((Object) str) + " , " + ((Object) str2));
        }

        @Override // com.taobao.weex.d
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            } else {
                ceg.Companion.b("weex onRenderSuccess");
            }
        }
    }
}
