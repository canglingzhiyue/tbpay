package com.ali.user.mobile.login.ui;

import com.ali.user.mobile.login.presenter.LoginFlowReturnData;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.rpc.RpcResponse;
import java.util.List;

/* loaded from: classes2.dex */
public interface RecommendLoginView extends OneKeyLoginView {
    void onFlowLimitLocked(String str);

    void onGuideH5(LoginParam loginParam, RpcResponse<LoginFlowReturnData> rpcResponse);

    void onNeedAlert(LoginParam loginParam, RpcResponse<LoginFlowReturnData> rpcResponse);

    void onRecommendBioLogin(String str, List<String> list, LoginParam loginParam);

    void onRecommendEmailLogin(String str, List<String> list, LoginParam loginParam);

    void onRecommendEmailReg(String str, List<String> list, LoginParam loginParam);

    void onRecommendFaceLogin(String str, List<String> list, LoginParam loginParam);

    void onRecommendPwdLogin(String str, List<String> list, LoginParam loginParam);

    void onRecommendSimLogin(String str, List<String> list, LoginParam loginParam);

    void onRecommendSmsLogin(String str, List<String> list, LoginParam loginParam);

    void updateAccountInfo(LoginFlowReturnData loginFlowReturnData);
}
