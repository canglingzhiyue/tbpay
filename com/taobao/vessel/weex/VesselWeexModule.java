package com.taobao.vessel.weex;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.base.a;
import com.taobao.vessel.base.b;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class VesselWeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(29915563);
    }

    @WXModuleAnno
    public void vesselCall(Map<String, Object> map, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6979aa5e", new Object[]{this, map, jSCallback});
        } else {
            b.a().a(this.mWXSDKInstance, map, new a(jSCallback));
        }
    }
}
