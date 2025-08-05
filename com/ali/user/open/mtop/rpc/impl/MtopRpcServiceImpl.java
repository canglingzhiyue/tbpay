package com.ali.user.open.mtop.rpc.impl;

import android.text.TextUtils;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.device.DeviceInfo;
import com.ali.user.open.core.model.RpcRequest;
import com.ali.user.open.core.model.RpcRequestCallbackWithCode;
import com.ali.user.open.core.service.RpcService;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.CommonUtils;
import com.ali.user.open.mtop.rpc.MTOPWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.intf.Mtop;

/* loaded from: classes2.dex */
public class MtopRpcServiceImpl implements RpcService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RpcService";

    @Override // com.ali.user.open.core.service.RpcService
    public <T> void remoteBusiness(RpcRequest rpcRequest, Class<T> cls, RpcRequestCallbackWithCode rpcRequestCallbackWithCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a3d0c0", new Object[]{this, rpcRequest, cls, rpcRequestCallbackWithCode});
        } else {
            MTOPWrapper.getInstance().remoteBusiness(rpcRequest, cls, rpcRequestCallbackWithCode);
        }
    }

    @Override // com.ali.user.open.core.service.RpcService
    public void registerSessionInfo(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a47da6", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                CommonUtils.sendUT("ucc_register_session_info_" + str);
                SDKLogger.e(TAG, "ucc_register_session_info_" + str);
                Mtop.instance(str, KernelContext.applicationContext, "", 0).registerSessionInfo(str2, str3);
            } else if (!ConfigManager.getInstance().isRegisterSidToMtopDefault()) {
            } else {
                CommonUtils.sendUT("ucc_register_session_info");
                SDKLogger.e(TAG, "ucc_register_session_info");
                Mtop.instance(KernelContext.applicationContext).registerSessionInfo(str2, str3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.open.core.service.RpcService
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this}) : DeviceInfo.deviceId;
    }

    @Override // com.ali.user.open.core.service.RpcService
    public void logout(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c22c9b", new Object[]{this, str});
            return;
        }
        try {
            Mtop.instance(str, KernelContext.applicationContext, "").logout();
        } catch (Throwable unused) {
        }
    }
}
