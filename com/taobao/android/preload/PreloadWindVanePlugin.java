package com.taobao.android.preload;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class PreloadWindVanePlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_LOAD = "load";
    private static final String ERROR_CODE_ACTION_INVALID = "10004";
    private static final String ERROR_CODE_BIZ_NAME_EMPTY = "10002";
    private static final String ERROR_CODE_EMPTY_PARAMS = "10001";
    private static final String ERROR_CODE_ITEMS_EMPTY = "10003";
    private static final String ERROR_MSG_ACTION_INVALID = "action未找到";
    private static final String ERROR_MSG_BIZ_NAME_EMPTY = "bizName为空";
    private static final String ERROR_MSG_EMPTY_PARAMS = "params为空";
    private static final String ERROR_MSG_ITEMS_EMPTY = "items为空";
    public static final String NAME = "TBDetailPreloadPlugin";
    private static final String TAG = "PreloadWindVanePlugin";

    public static /* synthetic */ Object ipc$super(PreloadWindVanePlugin preloadWindVanePlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        JSONObject parseObject = JSONObject.parseObject(str2);
        if (parseObject == null) {
            handleCallbackFail("10001", ERROR_MSG_EMPTY_PARAMS, wVCallBackContext);
            return false;
        }
        String string = parseObject.getString("bizName");
        if (TextUtils.isEmpty(string)) {
            handleCallbackFail("10002", ERROR_MSG_BIZ_NAME_EMPTY, wVCallBackContext);
            return false;
        } else if (parseObject.getJSONArray("items") == null) {
            handleCallbackFail("10003", ERROR_MSG_ITEMS_EMPTY, wVCallBackContext);
            return false;
        } else {
            h a2 = i.a(string);
            if ("load".equals(str)) {
                a2.a(parseObject.toJSONString());
                handleCallbackSuccess(wVCallBackContext);
                return true;
            }
            handleCallbackFail("10004", ERROR_MSG_ACTION_INVALID, wVCallBackContext);
            return false;
        }
    }

    private void handleCallbackFail(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01182a3", new Object[]{this, str, str2, wVCallBackContext});
        } else if (wVCallBackContext == null) {
        } else {
            r rVar = new r("HY_FAILED");
            rVar.a("errorCode", str);
            rVar.a("errorMsg", str2);
            wVCallBackContext.error(rVar);
            String a2 = e.a(TAG);
            f.a(a2, "errorCode: " + str + ", errorMsg: " + str2);
        }
    }

    private void handleCallbackSuccess(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d0f0fa", new Object[]{this, wVCallBackContext});
        } else if (wVCallBackContext == null) {
        } else {
            wVCallBackContext.success(new r("HY_SUCCESS"));
        }
    }
}
