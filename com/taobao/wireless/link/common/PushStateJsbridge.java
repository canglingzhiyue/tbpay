package com.taobao.wireless.link.common;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.pop.d;
import org.json.JSONObject;
import tb.kge;
import tb.rjt;
import tb.rkg;

/* loaded from: classes9.dex */
public class PushStateJsbridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_JUMP_SWITCH = "jumpPushSetting";
    private static final String ACTION_SWITCH = "getPushSwitch";
    public static final String CLASSNAME_PUSH_STATE = "UGPushHandler";

    static {
        kge.a(815929148);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.equals("false", b.a(rjt.a().f33186a, "is_push_api_open", "true"))) {
            rkg.a("link_tag", "PushStateJsbridge === execute === h5调用获取通知权限,功能开关关闭");
            return false;
        }
        if (StringUtils.equals(str, ACTION_SWITCH)) {
            if (wVCallBackContext != null) {
                JSONObject jSONObject = new JSONObject();
                String h = d.h(rjt.a().f33186a);
                rkg.a("link_tag", "PushStateJsbridge === execute === h5调用获取通知权限：" + h);
                try {
                    jSONObject.put("notificationEnabled", h);
                } catch (Exception e) {
                    rkg.b("link_tag", "PushStateJsbridge === execute === 获取通知权限异常：" + e);
                }
                r rVar = new r();
                rVar.a("data", jSONObject);
                wVCallBackContext.success(rVar);
                return true;
            }
        } else if (StringUtils.equals(str, ACTION_JUMP_SWITCH)) {
            d.i(rjt.a().f33186a);
            rkg.a("link_tag", "PushStateJsbridge === execute === h5调用跳转到通知权限开通页面");
        }
        return true;
    }
}
