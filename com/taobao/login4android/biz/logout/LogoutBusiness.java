package com.taobao.login4android.biz.logout;

import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.info.AlipayInfo;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LogoutRequest;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.constants.SessionConstants;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class LogoutBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1771926773);
    }

    public void logout(LogoutParam logoutParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1018be58", new Object[]{this, logoutParam});
        } else if (logoutParam == null) {
        } else {
            logout(logoutParam.site, logoutParam.sid, logoutParam.autologinToken, logoutParam.userid);
        }
    }

    public void logout(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990c1070", new Object[]{this, new Integer(i), str, str2, str3});
        } else {
            logout(i, str, null, str2, str3);
        }
    }

    public void logout(int i, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1177fe3a", new Object[]{this, new Integer(i), str, str2, str3, str4});
            return;
        }
        try {
            LogoutRequest logoutRequest = new LogoutRequest();
            logoutRequest.apdid = AlipayInfo.getInstance().getApdid();
            logoutRequest.appKey = DataProviderFactory.getDataProvider().getAppkey();
            logoutRequest.deviceId = DataProviderFactory.getDataProvider().getDeviceId();
            logoutRequest.umidToken = AppInfo.getInstance().getUmidToken();
            logoutRequest.sid = str;
            try {
                Long.parseLong(str4);
                logoutRequest.userId = str4;
            } catch (Exception e) {
                e.printStackTrace();
            }
            logoutRequest.ttid = DataProviderFactory.getDataProvider().getTTID();
            RpcRequest rpcRequest = new RpcRequest();
            rpcRequest.API_NAME = ApiConstants.ApiName.LOGOUT;
            HashMap hashMap = new HashMap();
            if (!StringUtils.isEmpty(str2)) {
                hashMap.put(SessionConstants.SUBSID, str2);
            }
            logoutRequest.attributes = hashMap;
            logoutRequest.utdid = AppInfo.getInstance().getUtdid();
            rpcRequest.addParam("request", JSON.toJSONString(logoutRequest));
            rpcRequest.addParam("userId", str4);
            rpcRequest.NEED_SESSION = true;
            rpcRequest.NEED_ECODE = false;
            rpcRequest.requestSite = i;
            ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, null, str4, new RpcRequestCallback() { // from class: com.taobao.login4android.biz.logout.LogoutBusiness.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                        return;
                    }
                    ((RpcService) ServiceFactory.getService(RpcService.class)).logout();
                    ((RpcService) ServiceFactory.getService(RpcService.class)).setHeader("x-disastergrd", "");
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    } else {
                        onSuccess(rpcResponse);
                    }
                }
            });
        } catch (Exception e2) {
            LoginTLogAdapter.w("login.LogoutBusiness", "logout from server failed.", e2);
            e2.printStackTrace();
        }
    }
}
