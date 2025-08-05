package com.taobao.android.detail.wrapper.fragment.weex.wxcomponent;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.s;
import com.taobao.android.trade.event.f;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import java.util.Map;
import tb.emu;
import tb.enz;
import tb.kge;

/* loaded from: classes5.dex */
public class WXAliDetailModel extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-546415132);
    }

    public WXAliDetailModel() {
        emu.a("com.taobao.android.detail.wrapper.fragment.weex.wxcomponent.WXAliDetailModel");
    }

    @WXModuleAnno(runOnUIThread = true)
    public void postEventWithEventName(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a718f", new Object[]{this, str, map});
        } else if (!TextUtils.equals(str, s.EVENT_TYPE_ALTERNATIVE)) {
        } else {
            f.a(this.mWXSDKInstance.O()).a(new enz());
        }
    }
}
