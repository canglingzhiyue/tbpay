package com.alipay.mobile.common.transportext.biz.shared;

import android.content.Context;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.ext.ExtTransportClient;
import com.alipay.mobile.common.transportext.api.ExtTransportManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes3.dex */
public class ExtTransportManagerAdapter implements ExtTransportManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.transportext.api.ExtTransportManager
    public ExtTransportClient getExtTransportClient(Context context, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtTransportClient) ipChange.ipc$dispatch("a5b8e4cb", new Object[]{this, context, transportContext});
        }
        return null;
    }

    @Override // com.alipay.mobile.common.transportext.api.ExtTransportManager
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        }
    }

    @Override // com.alipay.mobile.common.transportext.api.ExtTransportManager
    public boolean isInited() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae907f84", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.common.transportext.api.ExtTransportManager
    public void asynConnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5721172a", new Object[]{this});
            return;
        }
        throw new UnsupportedOperationException("Unsupported operation asynConnect");
    }

    @Override // com.alipay.mobile.common.transportext.api.ExtTransportManager
    public void closeConnection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48183c7d", new Object[]{this});
            return;
        }
        throw new UnsupportedOperationException("Unsupported operation closeConnection");
    }

    @Override // com.alipay.mobile.common.transportext.api.ExtTransportManager
    public boolean isConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[]{this})).booleanValue();
        }
        throw new UnsupportedOperationException("Unsupported operation isConnected");
    }

    @Override // com.alipay.mobile.common.transportext.api.ExtTransportManager
    public void asynPreConnect(ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf392db", new Object[]{this, threadPoolExecutor});
            return;
        }
        throw new UnsupportedOperationException("Unsupported operation asynPreConnect");
    }

    @Override // com.alipay.mobile.common.transportext.api.ExtTransportManager
    public void startPing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfba37b", new Object[]{this});
            return;
        }
        throw new UnsupportedOperationException("Unsupported operation startPing");
    }

    @Override // com.alipay.mobile.common.transportext.api.ExtTransportManager
    public boolean isNetworkActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f453d155", new Object[]{this})).booleanValue();
        }
        throw new UnsupportedOperationException("Unsupported operation isNetworkActive");
    }
}
