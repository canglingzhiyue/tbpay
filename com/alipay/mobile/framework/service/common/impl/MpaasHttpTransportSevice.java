package com.alipay.mobile.framework.service.common.impl;

import android.content.Context;
import com.alipay.mobile.common.transport.Request;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.Transport;
import com.alipay.mobile.common.transport.http.HttpManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public class MpaasHttpTransportSevice implements Transport {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static MpaasHttpTransportSevice b;

    /* renamed from: a  reason: collision with root package name */
    private HttpManager f5711a;

    public static MpaasHttpTransportSevice getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MpaasHttpTransportSevice) ipChange.ipc$dispatch("8e7b604b", new Object[]{context});
        }
        MpaasHttpTransportSevice mpaasHttpTransportSevice = b;
        if (mpaasHttpTransportSevice != null) {
            return mpaasHttpTransportSevice;
        }
        synchronized (MpaasHttpTransportSevice.class) {
            if (b != null) {
                return b;
            }
            b = new MpaasHttpTransportSevice(context);
            return b;
        }
    }

    public MpaasHttpTransportSevice(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context parameter can't be null ");
        }
        this.f5711a = new HttpManager(context);
    }

    @Override // com.alipay.mobile.common.transport.Transport
    public Future<Response> execute(Request request) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("439d65a6", new Object[]{this, request}) : this.f5711a.execute(request);
    }
}
