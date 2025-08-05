package com.taobao.login4android;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.helper.IUccInterface;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.open.core.util.ParamsConstants;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.biz.UccH5Presenter;
import com.ali.user.open.ucc.model.UccParams;
import com.ali.user.open.ucc.util.UccConstants;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.thread.LoginThreadHelper;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class UccH5Impl implements IUccInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1135913308);
        kge.a(29484180);
    }

    @Override // com.ali.user.mobile.helper.IUccInterface
    public void openUrl(final Context context, final UrlParam urlParam, final CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f669426", new Object[]{this, context, urlParam, commonDataCallback});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("url", urlParam.url);
        String str = "1";
        if (!str.equals(urlParam.uccNeedSession)) {
            str = "0";
        }
        bundle.putString("needSession", str);
        bundle.putString("needToast", "0");
        bundle.putString(ParamsConstants.Key.PARAM_NEED_LOCAL_SESSION, "0");
        UccParams uccParams = new UccParams();
        uccParams.sdkVersion = AppInfo.getInstance().getSdkVersion();
        bundle.putString(UccConstants.PARAM_UCC_PARAMS, JSON.toJSONString(uccParams));
        try {
            UccH5Presenter.openUrl(context, bundle, new UccCallback() { // from class: com.taobao.login4android.UccH5Impl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.ucc.UccCallback
                public void onSuccess(String str2, Map map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str2, map});
                        return;
                    }
                    CommonDataCallback commonDataCallback2 = commonDataCallback;
                    if (commonDataCallback2 != null) {
                        commonDataCallback2.onSuccess(map);
                    } else if (map != null) {
                        String str3 = (String) map.get(UccConstants.PARAM_LOGIN_DATA);
                        if (!TextUtils.isEmpty(str3)) {
                            HashMap hashMap = new HashMap();
                            Log.e(LoginThreadHelper.TAG, "loginType=" + urlParam.loginType);
                            if (!TextUtils.isEmpty(urlParam.loginType)) {
                                hashMap.put(LoginConstants.LOGIN_TYPE, urlParam.loginType);
                            }
                            LoginDataHelper.processLoginReturnData(true, (LoginReturnData) JSON.parseObject(str3, LoginReturnData.class), hashMap);
                            return;
                        }
                        BroadCastHelper.sendLoginFailBroadcast(702, "");
                    } else {
                        BroadCastHelper.sendLoginFailBroadcast(702, "");
                    }
                }

                @Override // com.ali.user.open.ucc.UccCallback
                public void onFail(String str2, int i, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9656df", new Object[]{this, str2, new Integer(i), str3});
                        return;
                    }
                    CommonDataCallback commonDataCallback2 = commonDataCallback;
                    if (commonDataCallback2 != null) {
                        commonDataCallback2.onFail(i, str3);
                    } else if (i == 10003 || i == 10004 || i == 15) {
                        BroadCastHelper.sendLoginFailBroadcast(701, "user cancel");
                    } else {
                        BroadCastHelper.sendLoginFailBroadcast(i, str3);
                        Toast.makeText(context, str3, 0).show();
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
