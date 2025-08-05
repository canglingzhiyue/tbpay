package com.ali.user.mobile.service;

import android.app.Activity;
import com.ali.user.mobile.model.SNSSignInAccount;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;

/* loaded from: classes2.dex */
public interface SNSService {
    void dismissLoading(Activity activity);

    void onError(Activity activity, RpcResponse<LoginReturnData> rpcResponse);

    void onH5(Activity activity, RpcResponse<LoginReturnData> rpcResponse, UrlParam urlParam);

    void onLoginSuccess(Activity activity, SNSSignInAccount sNSSignInAccount, RpcResponse<LoginReturnData> rpcResponse);

    void showLoading(Activity activity);

    void toast(Activity activity, String str);
}
