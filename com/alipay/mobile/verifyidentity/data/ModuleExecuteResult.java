package com.alipay.mobile.verifyidentity.data;

import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ModuleExecuteResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, Object> f5859a;
    private boolean b = false;
    private boolean c = false;
    private String d = "";
    public MICRpcResponse mMICRpcResponse;

    public void setMICRpcResponse(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad42d36", new Object[]{this, mICRpcResponse});
        } else {
            this.mMICRpcResponse = mICRpcResponse;
        }
    }

    public MICRpcResponse getMICRpcResponse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MICRpcResponse) ipChange.ipc$dispatch("6709caaa", new Object[]{this}) : this.mMICRpcResponse;
    }

    public void setExtInfo(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6361d37f", new Object[]{this, hashMap});
        } else {
            this.f5859a = hashMap;
        }
    }

    public HashMap<String, Object> getExtInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("e0498ba3", new Object[]{this}) : this.f5859a;
    }

    public boolean isLocalTrans() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8478d3d2", new Object[]{this})).booleanValue() : this.b;
    }

    public void setLocalTrans(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f715528e", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public String getLogicModuleName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fcbf817a", new Object[]{this}) : this.d;
    }

    public void setLogicModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555882a4", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setFindAndPay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d59ce41", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public boolean isFindPay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aec7adb0", new Object[]{this})).booleanValue() : this.c;
    }
}
