package com.taobao.wireless.link.assistant.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.rjt;
import tb.rkg;
import tb.rkj;

/* loaded from: classes9.dex */
public class AssistantHomeJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ASSISTANT_HOME = "assistant_home";
    public static final String CLASSNAME_ASSISTANT_HOME = "AssistantHomeJsBridge";

    static {
        kge.a(-1078820134);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (StringUtils.equals(str, ACTION_ASSISTANT_HOME)) {
                rkg.a("link_tag", "AssistantHomeJsBridge === execute === h5调用跳转桌面");
                rkj.g(rjt.a().f33186a);
            }
        } catch (Exception e) {
            rkg.a("link_tag", "AssistantHomeJsBridge === execute === 小助手jsbridge调用，跳转桌面异常：" + e.getMessage());
        }
        return false;
    }
}
