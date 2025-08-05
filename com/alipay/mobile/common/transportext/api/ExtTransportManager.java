package com.alipay.mobile.common.transportext.api;

import android.content.Context;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.ext.ExtTransportClient;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes3.dex */
public interface ExtTransportManager {
    void asynConnect();

    void asynPreConnect(ThreadPoolExecutor threadPoolExecutor);

    void closeConnection();

    ExtTransportClient getExtTransportClient(Context context, TransportContext transportContext);

    void init(Context context);

    boolean isConnected();

    boolean isInited();

    boolean isNetworkActive();

    void startPing();
}
