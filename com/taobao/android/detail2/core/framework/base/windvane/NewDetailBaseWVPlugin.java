package com.taobao.android.detail2.core.framework.base.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fjt;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class NewDetailBaseWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ERROR_CODE_EMPTY_PARAMS = "10001";
    private static final String ERROR_MSG_EMPTY_PARAMS = "params为空";

    static {
        kge.a(360555405);
    }

    public abstract boolean onExecute(String str, JSONObject jSONObject, WVCallBackContext wVCallBackContext, String str2);

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        fjt.a(fjt.TAG_WINDVANE, "windvane execute执行 message为空, action: " + str + ", params: " + str2);
        JSONObject parseObject = JSONObject.parseObject(str2);
        if (parseObject == null) {
            handleCallbackFail("10001", ERROR_MSG_EMPTY_PARAMS, wVCallBackContext);
            return false;
        }
        String string = parseObject.getString("from");
        if (StringUtils.isEmpty(string)) {
            fjt.a(fjt.TAG_WINDVANE, "handleUpdateData from is null");
        }
        return onExecute(str, parseObject, wVCallBackContext, string);
    }

    public void handleCallbackFail(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01182a3", new Object[]{this, str, str2, wVCallBackContext});
        } else if (wVCallBackContext == null) {
        } else {
            r rVar = new r("HY_FAILED");
            rVar.a("errorCode", str);
            rVar.a("errorMsg", str2);
            wVCallBackContext.error(rVar);
            fjt.a(fjt.TAG_WINDVANE, "errorCode: " + str + ", errorMsg: " + str2);
        }
    }
}
