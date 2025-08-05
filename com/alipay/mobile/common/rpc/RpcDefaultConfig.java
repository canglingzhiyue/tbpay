package com.alipay.mobile.common.rpc;

import com.alipay.mobile.common.transport.Transport;
import com.alipay.mobile.common.transport.http.HttpUrlHeader;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.utils.ReadSettingServerUrl;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class RpcDefaultConfig implements Config {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.rpc.Config
    public void addExtHeaders(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fbd1f61", new Object[]{this, httpUrlRequest});
        }
    }

    @Override // com.alipay.mobile.common.rpc.Config
    public String getAppKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49079005", new Object[]{this}) : "";
    }

    @Override // com.alipay.mobile.common.rpc.Config
    public abstract Transport getTransport();

    @Override // com.alipay.mobile.common.rpc.Config
    public void giveResponseHeader(String str, HttpUrlHeader httpUrlHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63830570", new Object[]{this, str, httpUrlHeader});
        }
    }

    @Override // com.alipay.mobile.common.rpc.Config
    public boolean isCompress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2873e137", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.mobile.common.rpc.Config
    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : ReadSettingServerUrl.getInstance().getGWFURL(TransportEnvUtil.getContext());
    }
}
