package com.ali.user.mobile.impl;

import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.callback.RpcRequestCallbackWithCode;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.service.RpcService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.deviceid.DeviceIDManager;
import mtopsdk.mtop.global.SDKConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopParamType;
import mtopsdk.mtop.intf.MtopSetting;
import tb.kge;

/* loaded from: classes2.dex */
public class MtopRpcServiceImpl implements RpcService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String deviceId;

    static {
        kge.a(654807423);
        kge.a(828805106);
    }

    @Override // com.ali.user.mobile.service.RpcService
    public <T extends RpcResponse<?>> T post(RpcRequest rpcRequest, Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("1cfb3a20", new Object[]{this, rpcRequest, cls}) : (T) MTOPWrapper.getInstance().post(rpcRequest, cls);
    }

    @Override // com.ali.user.mobile.service.RpcService
    public <T extends RpcResponse<?>> T post(RpcRequest rpcRequest, Class<T> cls, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("e3f95c2a", new Object[]{this, rpcRequest, cls, str}) : (T) MTOPWrapper.getInstance().post(rpcRequest, cls, str);
    }

    @Override // com.ali.user.mobile.service.RpcService
    public void registerSessionInfo(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a47da6", new Object[]{this, str, str2, str3});
            return;
        }
        Mtop.instance(DataProviderFactory.getApplicationContext()).registerSessionInfo(str, str2);
        MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-disastergrd", str3);
    }

    @Override // com.ali.user.mobile.service.RpcService
    public void setHeader(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("821380aa", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, str, str2);
        }
    }

    @Override // com.ali.user.mobile.service.RpcService
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        this.deviceId = SDKConfig.getInstance().getGlobalDeviceId();
        if (TextUtils.isEmpty(this.deviceId)) {
            try {
                DeviceIDManager.getInstance().getDeviceID(DataProviderFactory.getApplicationContext(), DataProviderFactory.getDataProvider().getAppkey());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.deviceId;
    }

    @Override // com.ali.user.mobile.service.RpcService
    public void logout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e233c511", new Object[]{this});
        } else {
            Mtop.instance(DataProviderFactory.getApplicationContext()).logout();
        }
    }

    @Override // com.ali.user.mobile.service.RpcService
    public <T extends RpcResponse<?>> void remoteBusiness(RpcRequest rpcRequest, Class<T> cls, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24fed773", new Object[]{this, rpcRequest, cls, rpcRequestCallback});
        } else {
            remoteBusiness(rpcRequest, cls, "", rpcRequestCallback);
        }
    }

    @Override // com.ali.user.mobile.service.RpcService
    public <T extends RpcResponse<?>> void remoteBusiness(RpcRequest rpcRequest, Class<T> cls, RpcRequestCallbackWithCode rpcRequestCallbackWithCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5302fa0", new Object[]{this, rpcRequest, cls, rpcRequestCallbackWithCode});
            return;
        }
        RemoteBusiness.init(DataProviderFactory.getApplicationContext(), DataProviderFactory.getDataProvider().getTTID());
        MTOPWrapper.getInstance().remoteBusiness(rpcRequest, cls, rpcRequestCallbackWithCode);
    }

    @Override // com.ali.user.mobile.service.RpcService
    public <T extends RpcResponse<?>> void remoteBusiness(RpcRequest rpcRequest, Class<T> cls, String str, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3022a029", new Object[]{this, rpcRequest, cls, str, rpcRequestCallback});
            return;
        }
        RemoteBusiness.init(DataProviderFactory.getApplicationContext(), DataProviderFactory.getDataProvider().getTTID());
        MTOPWrapper.getInstance().remoteBusiness(rpcRequest, cls, str, rpcRequestCallback);
    }
}
