package com.ali.user.mobile.url.service.impl;

import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.info.AlipayInfo;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.model.DeviceTokenSignParam;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.h5.MtopAccountCenterUrlResponseData;
import com.ali.user.mobile.rpc.h5.MtopCanChangeNickResponseData;
import com.ali.user.mobile.rpc.h5.MtopFoundPasswordResponseData;
import com.ali.user.mobile.security.AlibabaSecurityTokenService;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.url.model.AcBaseParam;
import com.ali.user.mobile.utils.ResourceUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class UrlFetchServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static UrlFetchServiceImpl instance;

    static {
        kge.a(1405052989);
    }

    public static UrlFetchServiceImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UrlFetchServiceImpl) ipChange.ipc$dispatch("38b81f96", new Object[0]);
        }
        if (instance == null) {
            instance = new UrlFetchServiceImpl();
        }
        return instance;
    }

    private UrlFetchServiceImpl() {
    }

    public void foundH5urls(AcBaseParam acBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e02cd35", new Object[]{this, acBaseParam, rpcRequestCallback});
            return;
        }
        RpcRequest buildBaseRequest = buildBaseRequest(acBaseParam);
        buildBaseRequest.API_NAME = ApiConstants.ApiName.GET_HAVANA_ACCOUNT_URL;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("taobao", SecurityGuardManagerWraper.getWUA());
            buildBaseRequest.addParam(ApiConstants.ApiField.RDS_INFO, JSON.toJSONString(hashMap));
        } catch (Exception unused) {
        }
        buildBaseRequest.addParam(ApiConstants.ApiField.APDID, AlipayInfo.getInstance().getApdid());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sdkTraceId", acBaseParam.sdkTraceId);
        if (DataProviderFactory.getDataProvider().getExternalData() != null) {
            hashMap2.putAll(DataProviderFactory.getDataProvider().getExternalData());
        }
        buildBaseRequest.addParam("extraInfo", JSON.toJSONString(hashMap2));
        buildBaseRequest.addParam("scene", acBaseParam.scene);
        buildBaseRequest.addParam(ApiConstants.ApiField.FROM_SITE, Integer.valueOf(acBaseParam.fromSite));
        buildBaseRequest.addParam("version", "android:new");
        buildBaseRequest.addParam(ApiConstants.ApiField.TRUST_LOGIN, "true");
        if (!StringUtils.isEmpty(acBaseParam.userInputName)) {
            buildBaseRequest.addParam(ApiConstants.ApiField.USER_INPUT_NAME, acBaseParam.userInputName);
        }
        if (acBaseParam.havanaId != 0) {
            buildBaseRequest.addParam("havanaId", Long.valueOf(acBaseParam.havanaId));
        }
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(buildBaseRequest, MtopAccountCenterUrlResponseData.class, rpcRequestCallback);
    }

    public MtopFoundPasswordResponseData foundPassword(AcBaseParam acBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopFoundPasswordResponseData) ipChange.ipc$dispatch("efaa09a4", new Object[]{this, acBaseParam});
        }
        RpcRequest buildBaseRequest = buildBaseRequest(acBaseParam);
        buildBaseRequest.API_NAME = ApiConstants.ApiName.GENERATE_URL;
        buildBaseRequest.addParam("appVersion", AppInfo.getInstance().getAndroidAppVersion());
        buildBaseRequest.addParam("sdkVersion", AppInfo.getInstance().getSdkVersion());
        buildBaseRequest.addParam("deviceTokenKey", acBaseParam.deviceTokenKey);
        String valueOf = String.valueOf(acBaseParam.havanaId);
        buildBaseRequest.addParam(ApiConstants.ApiField.HID, valueOf);
        String valueOf2 = String.valueOf(System.currentTimeMillis());
        buildBaseRequest.addParam("timestamp", valueOf2);
        HashMap hashMap = new HashMap();
        hashMap.put("taobao", SecurityGuardManagerWraper.getWUA());
        buildBaseRequest.addParam(ApiConstants.ApiField.WIRELESS_ENVM, JSON.toJSONString(hashMap));
        DeviceTokenSignParam deviceTokenSignParam = new DeviceTokenSignParam();
        if (!StringUtils.isEmpty(DataProviderFactory.getDataProvider().getAppkey())) {
            deviceTokenSignParam.addAppKey(DataProviderFactory.getDataProvider().getAppkey());
        }
        deviceTokenSignParam.addAppVersion(AppInfo.getInstance().getAndroidAppVersion());
        deviceTokenSignParam.addHavanaId(valueOf);
        deviceTokenSignParam.addTimestamp(valueOf2);
        deviceTokenSignParam.addSDKVersion(AppInfo.getInstance().getSdkVersion());
        if (!StringUtils.isEmpty(acBaseParam.deviceTokenKey)) {
            buildBaseRequest.addParam(ApiConstants.ApiField.LOGIN_SIGN, AlibabaSecurityTokenService.sign(acBaseParam.deviceTokenKey, deviceTokenSignParam.build()));
        }
        return (MtopFoundPasswordResponseData) ((RpcService) ServiceFactory.getService(RpcService.class)).post(buildBaseRequest, MtopFoundPasswordResponseData.class, String.valueOf(acBaseParam.havanaId));
    }

    public void navBySceneRemote(AcBaseParam acBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ce9a9a", new Object[]{this, acBaseParam, rpcRequestCallback});
        } else {
            ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(buildNavBySceneRequest(acBaseParam), MtopAccountCenterUrlResponseData.class, rpcRequestCallback);
        }
    }

    private RpcRequest buildNavBySceneRequest(AcBaseParam acBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("c99df3ca", new Object[]{this, acBaseParam});
        }
        RpcRequest buildBaseRequest = buildBaseRequest(acBaseParam);
        buildBaseRequest.API_NAME = ApiConstants.ApiName.GET_URL_WITH_SESSION;
        buildBaseRequest.NEED_ECODE = true;
        buildBaseRequest.NEED_SESSION = true;
        buildBaseRequest.addParam(ApiConstants.ApiField.APDID, AlipayInfo.getInstance().getApdid());
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("taobao", SecurityGuardManagerWraper.getWUA());
            buildBaseRequest.addParam(ApiConstants.ApiField.RDS_INFO, hashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        buildBaseRequest.addParam("scene", acBaseParam.scene);
        buildBaseRequest.addParam(ApiConstants.ApiField.FROM_SITE, Integer.valueOf(acBaseParam.fromSite));
        buildBaseRequest.addParam("appVersion", AppInfo.getInstance().getAppVersion());
        buildBaseRequest.addParam("sdkVersion", AppInfo.getInstance().getSdkVersion());
        buildBaseRequest.addParam(ApiConstants.ApiField.TRUST_LOGIN, "true");
        if (DataProviderFactory.getDataProvider().getExternalData() != null) {
            buildBaseRequest.addParam("extraInfo", JSON.toJSONString(DataProviderFactory.getDataProvider().getExternalData()));
        }
        return buildBaseRequest;
    }

    public void checkNickModifiable(RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1ca69a", new Object[]{this, rpcRequestCallback});
            return;
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.CAN_CHANGE_NICK;
        rpcRequest.VERSION = "1.0";
        rpcRequest.NEED_ECODE = true;
        rpcRequest.NEED_SESSION = true;
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, MtopCanChangeNickResponseData.class, rpcRequestCallback);
    }

    private RpcRequest buildBaseRequest(AcBaseParam acBaseParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("c1ab0b2b", new Object[]{this, acBaseParam});
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.requestSite = acBaseParam.fromSite;
        rpcRequest.addParam("appKey", DataProviderFactory.getDataProvider().getAppkey());
        rpcRequest.addParam("locale", ResourceUtil.getLocaleStr());
        rpcRequest.addParam("umidToken", AppInfo.getInstance().getUmidToken());
        return rpcRequest;
    }
}
