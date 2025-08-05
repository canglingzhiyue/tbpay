package com.ali.user.mobile.scan.impl;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.login.model.TokenLoginRequest;
import com.ali.user.mobile.scan.model.CommonScanParam;
import com.ali.user.mobile.scan.model.CommonScanResponse;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.ResourceUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class ScanServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ScanServiceImpl instance;

    static {
        kge.a(-1208832557);
    }

    public static ScanServiceImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScanServiceImpl) ipChange.ipc$dispatch("4868d7d0", new Object[0]);
        }
        if (instance == null) {
            instance = new ScanServiceImpl();
        }
        return instance;
    }

    public void commonScanWithRemoteBiz(CommonScanParam commonScanParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8482d510", new Object[]{this, commonScanParam, rpcRequestCallback});
        } else {
            commonScanWithRemoteBizAction(ApiConstants.ApiName.COMMON_SCAN_QRCODE, commonScanParam, rpcRequestCallback);
        }
    }

    public void commonConfirmWithRemoteBiz(CommonScanParam commonScanParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4edf0f1d", new Object[]{this, commonScanParam, rpcRequestCallback});
        } else {
            commonScanWithRemoteBizAction(ApiConstants.ApiName.COMMON_CONFIRM_QRCODE, commonScanParam, rpcRequestCallback);
        }
    }

    public void commonCancelWithRemoteBiz(CommonScanParam commonScanParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ee6b50d", new Object[]{this, commonScanParam, rpcRequestCallback});
        } else {
            commonScanWithRemoteBizAction(ApiConstants.ApiName.COMMON_CANCEL_QRCODE, commonScanParam, rpcRequestCallback);
        }
    }

    private void commonScanWithRemoteBizAction(String str, CommonScanParam commonScanParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23ac230", new Object[]{this, str, commonScanParam, rpcRequestCallback});
            return;
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = str;
        rpcRequest.VERSION = "1.0";
        rpcRequest.NEED_ECODE = true;
        rpcRequest.NEED_SESSION = true;
        rpcRequest.requestSite = commonScanParam.currentSite;
        if (commonScanParam.dailyDomain != null) {
            rpcRequest.dailyDomain = commonScanParam.dailyDomain;
        }
        if (commonScanParam.preDomain != null) {
            rpcRequest.preDomain = commonScanParam.preDomain;
        }
        if (commonScanParam.onlineDomain != null) {
            rpcRequest.onlineDomain = commonScanParam.onlineDomain;
        }
        TokenLoginRequest tokenLoginRequest = new TokenLoginRequest();
        tokenLoginRequest.token = commonScanParam.key;
        tokenLoginRequest.hid = commonScanParam.havanaId;
        tokenLoginRequest.locale = ResourceUtil.getLocaleStr();
        tokenLoginRequest.appName = commonScanParam.appName;
        tokenLoginRequest.site = commonScanParam.currentSite;
        tokenLoginRequest.sdkVersion = AppInfo.getInstance().getSdkVersion();
        tokenLoginRequest.ttid = DataProviderFactory.getDataProvider().getTTID();
        tokenLoginRequest.utdid = AppInfo.getInstance().getUtdid();
        tokenLoginRequest.deviceId = DataProviderFactory.getDataProvider().getDeviceId();
        tokenLoginRequest.ext = new HashMap();
        tokenLoginRequest.ext.put("youkuNotNeedUpgrade", String.valueOf(commonScanParam.youkuNotNeedUpgrade));
        rpcRequest.addParam(ApiConstants.ApiField.TOKEN_INFO, JSON.toJSONString(tokenLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, CommonScanResponse.class, rpcRequestCallback);
    }
}
