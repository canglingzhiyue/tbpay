package com.taobao.login4android;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData;
import com.ali.user.mobile.rpc.login.model.MemberRequestBase;
import com.ali.user.mobile.rpc.login.model.TokenLoginRequest;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.qrcode.data.GenQrResponse;
import com.taobao.login4android.qrcode.data.QrCodeGenRequest;
import com.taobao.login4android.qrcode.data.QrCodeParam2;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class UIHavanaComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(163973044);
    }

    public static void genQrCode(QrCodeParam2 qrCodeParam2, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5089c349", new Object[]{qrCodeParam2, rpcRequestCallback});
            return;
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.HAVANA_GEN_QR_CODE;
        rpcRequest.VERSION = "1.0";
        QrCodeGenRequest qrCodeGenRequest = new QrCodeGenRequest();
        qrCodeGenRequest.appName = DataProviderFactory.getDataProvider().getAppkey();
        qrCodeGenRequest.sdkVersion = AppInfo.getInstance().getSdkVersion();
        qrCodeGenRequest.utdid = AppInfo.getInstance().getUtdid();
        qrCodeGenRequest.qrCodeSize = qrCodeParam2.qrCodeSize;
        qrCodeGenRequest.genShortUrl = qrCodeParam2.genShortUrl;
        rpcRequest.addParam("qrCodeGenInfo", JSON.toJSONString(qrCodeGenRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        rpcRequest.addParam("ext", JSON.toJSONString(new HashMap()));
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, GenQrResponse.class, rpcRequestCallback);
    }

    private static RpcRequest getRpcRequest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcRequest) ipChange.ipc$dispatch("99dc8458", new Object[]{str});
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.HAVANA_LOGIN_BY_QR_CODE;
        rpcRequest.VERSION = "1.0";
        TokenLoginRequest tokenLoginRequest = new TokenLoginRequest();
        tokenLoginRequest.token = str;
        tokenLoginRequest.tokenType = "newQRCode";
        buildBaseLoginRequest(tokenLoginRequest);
        rpcRequest.addParam(ApiConstants.ApiField.TOKEN_INFO, JSON.toJSONString(tokenLoginRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        rpcRequest.addParam("ext", JSON.toJSONString(new HashMap()));
        return rpcRequest;
    }

    public static DefaultLoginResponseData qrLogin(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DefaultLoginResponseData) ipChange.ipc$dispatch("f2cbf25b", new Object[]{str}) : (DefaultLoginResponseData) ((RpcService) ServiceFactory.getService(RpcService.class)).post(getRpcRequest(str), DefaultLoginResponseData.class);
    }

    private static void buildBaseLoginRequest(MemberRequestBase memberRequestBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d447698d", new Object[]{memberRequestBase});
            return;
        }
        memberRequestBase.appName = DataProviderFactory.getDataProvider().getAppkey();
        memberRequestBase.sdkVersion = AppInfo.getInstance().getSdkVersion();
        memberRequestBase.ttid = DataProviderFactory.getDataProvider().getTTID();
        memberRequestBase.utdid = AppInfo.getInstance().getUtdid();
    }
}
