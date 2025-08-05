package com.taobao.tao.alipay.callservice;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.pay.PayTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class WVAlipayApiPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_DECRYPT = "decCashierObfs";
    private static final String ACTION_GET_ALIPAY_CASHIER_PARAMS = "alipayCashierParams";
    private static final String ERROR_GET_ALIPAY_CASHIER_PARAMS_FAILED = "get alipayCashierParams failed";
    private static final String ERROR_STRING_DECRYPT_FAILED = "decrypt failed";
    private static final String ERROR_STRING_INVALID_ARGS = "invalid args";
    private static final String KEY_OBFS = "obfsString";

    public static /* synthetic */ Object ipc$super(WVAlipayApiPlugin wVAlipayApiPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null) {
            return false;
        }
        if (TextUtils.equals(str, ACTION_DECRYPT)) {
            alipayDecrypt(str2, wVCallBackContext);
            return true;
        } else if (!TextUtils.equals(str, ACTION_GET_ALIPAY_CASHIER_PARAMS)) {
            return false;
        } else {
            getAlipayCashierParams(str2, wVCallBackContext);
            return true;
        }
    }

    private void alipayDecrypt(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c19371", new Object[]{this, str, wVCallBackContext});
        } else if (TextUtils.isEmpty(str)) {
            callbackError(wVCallBackContext, ERROR_STRING_INVALID_ARGS);
        } else {
            try {
                JSONObject parseObject = JSONObject.parseObject(str);
                if (parseObject == null || TextUtils.isEmpty(parseObject.getString(KEY_OBFS))) {
                    callbackError(wVCallBackContext, ERROR_STRING_INVALID_ARGS);
                    return;
                }
                Map<String, Object> decCashierObfs = PayTask.decCashierObfs(parseObject.getString(KEY_OBFS));
                if (decCashierObfs == null) {
                    callbackError(wVCallBackContext, ERROR_STRING_DECRYPT_FAILED);
                } else {
                    wVCallBackContext.success(decCashierObfs.toString());
                }
            } catch (Exception unused) {
                callbackError(wVCallBackContext, ERROR_STRING_INVALID_ARGS);
            }
        }
    }

    private void getAlipayCashierParams(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3416d8d7", new Object[]{this, str, wVCallBackContext});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSONObject.parseObject(str);
                for (String str2 : parseObject.keySet()) {
                    hashMap.put(str2, parseObject.getString(str2) == null ? "" : parseObject.getString(str2));
                }
            } catch (Exception unused) {
                callbackError(wVCallBackContext, ERROR_GET_ALIPAY_CASHIER_PARAMS_FAILED);
                return;
            }
        }
        JSONObject preposeCashierRequestParams = PayTask.getPreposeCashierRequestParams(hashMap, this.mContext);
        if (preposeCashierRequestParams == null) {
            preposeCashierRequestParams = new JSONObject();
        }
        wVCallBackContext.success(preposeCashierRequestParams.toJSONString());
    }

    private void callbackError(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef5dc11", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        rVar.a("errorMsg", str);
        wVCallBackContext.error(rVar);
    }
}
