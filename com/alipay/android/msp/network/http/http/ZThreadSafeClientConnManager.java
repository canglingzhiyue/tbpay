package com.alipay.android.msp.network.http.http;

import com.android.alibaba.ip.runtime.IpChange;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes3.dex */
public class ZThreadSafeClientConnManager extends ThreadSafeClientConnManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ZThreadSafeClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        super(httpParams, schemeRegistry);
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClientConnectionOperator) ipChange.ipc$dispatch("cea04ecc", new Object[]{this, schemeRegistry}) : new ZClientConnectionOperator(schemeRegistry);
    }
}
