package com.alipay.mobile.common.rpc.protocol;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class AbstractSerializer implements Serializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mOperationType;
    public Object mParams;
    public String scene;

    public AbstractSerializer(String str, Object obj) {
        this.mOperationType = str;
        this.mParams = obj;
    }

    public String getScene() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this}) : this.scene;
    }

    public void setScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9147a05b", new Object[]{this, str});
        } else {
            this.scene = str;
        }
    }
}
