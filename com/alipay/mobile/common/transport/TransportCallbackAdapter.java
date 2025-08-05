package com.alipay.mobile.common.transport;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class TransportCallbackAdapter implements TransportCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.transport.TransportCallback
    public void onCancelled(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ab1ecd", new Object[]{this, request});
        }
    }

    @Override // com.alipay.mobile.common.transport.TransportCallback
    public void onFailed(Request request, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fc6d16", new Object[]{this, request, new Integer(i), str});
        }
    }

    @Override // com.alipay.mobile.common.transport.TransportCallback
    public void onPostExecute(Request request, Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a46dd3b", new Object[]{this, request, response});
        }
    }

    @Override // com.alipay.mobile.common.transport.TransportCallback
    public void onPreExecute(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d596d2c", new Object[]{this, request});
        }
    }

    @Override // com.alipay.mobile.common.transport.TransportCallback
    public void onProgressUpdate(Request request, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f01968e", new Object[]{this, request, new Double(d)});
        }
    }
}
