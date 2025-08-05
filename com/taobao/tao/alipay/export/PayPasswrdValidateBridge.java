package com.taobao.tao.alipay.export;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.tao.util.NavUrls;
import com.taobao.taobao.b;
import com.taobao.taobao.internal.PayRequest;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class PayPasswrdValidateBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CHECK_PAY_PASSWORD = "checkPayPasswordAction";
    private static final String ACTION_CLEAR_CHECK_PAY_PASSWORD = "clearCheckPayPasswordAction";
    private static final String ACTION_GET_LOGIN_TOKEN = "getLoginToken";
    public static final String PLUGIN_NAME = "TBWVPayPasswrdValidateHandler";
    public static WVCallBackContext wvCallBack;

    public static /* synthetic */ Object ipc$super(PayPasswrdValidateBridge payPasswrdValidateBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (ACTION_GET_LOGIN_TOKEN.equals(str)) {
            r rVar = new r();
            rVar.a("sid", Login.getSid());
            wVCallBackContext.success(rVar);
            return true;
        } else if (ACTION_CHECK_PAY_PASSWORD.equals(str)) {
            checkPayPasswordAction(str2);
            wvCallBack = wVCallBackContext;
            return true;
        } else if (!ACTION_CLEAR_CHECK_PAY_PASSWORD.equals(str)) {
            return false;
        } else {
            wvCallBack = null;
            return true;
        }
    }

    private void checkPayPasswordAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8663f22", new Object[]{this, str});
            return;
        }
        JSONObject parseObject = JSONObject.parseObject(str);
        String string = parseObject.getString("url");
        String string2 = parseObject.getString(CashdeskConstants.CASHIER_TYPE);
        String string3 = parseObject.getString(CashdeskConstants.ENCODE_PARAMS);
        String string4 = parseObject.getString("from");
        if (Boolean.parseBoolean(string3)) {
            invokeCashDeskWithEncodeParams(string);
        } else if (string2 != null || string4 != null) {
            invokeCashDeskWithExtParams(string2, parseObject, string);
        } else {
            Nav from = Nav.from(Globals.getApplication());
            from.toUri(NavUrls.NAV_URL_ALIPAY + "?" + string + "&" + CashdeskConstants.VALIDATE_ARGS + "=true");
        }
    }

    private void invokeCashDeskWithEncodeParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa07257", new Object[]{this, str});
            return;
        }
        Map<String, String> queryMap = Cashdesk.getQueryMap(str);
        queryMap.put(CashdeskConstants.VALIDATE_ARGS, "true");
        queryMap.put(CashdeskConstants.ENCODE_PARAMS, "true");
        Cashdesk.invokeAlipay(Globals.getApplication(), queryMap);
    }

    private void invokeCashDeskWithExtParams(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a8f0ec", new Object[]{this, str, jSONObject, str2});
        } else if (PayRequest.CALL_WEIXIN_SDK.equals(str)) {
            executorWXPay(jSONObject, str2);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("signStr", str2);
            hashMap.put(CashdeskConstants.VALIDATE_ARGS, "true");
            appendExtParams(jSONObject, hashMap, "url");
            Cashdesk.invokeAlipay(Globals.getApplication(), hashMap);
        }
    }

    private void executorWXPay(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94cb7d3f", new Object[]{this, jSONObject, str});
            return;
        }
        Context context = getContext();
        if (!(context instanceof Activity) && wvCallBack != null) {
            handleAlipayErrorResult("context must Activity");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("signStr", str);
        appendExtParams(jSONObject, hashMap, "url");
        new b().a((Activity) context, hashMap, (com.taobao.taobao.internal.b) null);
    }

    private void appendExtParams(JSONObject jSONObject, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33575333", new Object[]{this, jSONObject, map, str});
            return;
        }
        for (String str2 : jSONObject.keySet()) {
            if (!str.equals(str2)) {
                map.put(str2, jSONObject.getString(str2));
            }
        }
    }

    private static void handleAlipayErrorResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa04fca4", new Object[]{str});
        } else if (wvCallBack == null) {
        } else {
            r rVar = new r();
            rVar.a(str);
            wvCallBack.error(rVar);
        }
    }

    public static void handleAlipayResult(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae1ac8", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        if (wvCallBack != null) {
            r rVar = new r();
            rVar.a("result", str4);
            rVar.a("memo", str2);
            rVar.a(MspGlobalDefine.OPEN_TIME, str3);
            rVar.a("ResultStatus", str);
            rVar.a(MspGlobalDefine.EXTENDINFO, str5);
            wvCallBack.success(rVar);
        }
        wvCallBack = null;
    }
}
