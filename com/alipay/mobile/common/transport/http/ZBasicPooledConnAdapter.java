package com.alipay.mobile.common.transport.http;

import org.apache.http.impl.conn.AbstractPoolEntry;
import org.apache.http.impl.conn.tsccm.BasicPooledConnAdapter;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;

/* loaded from: classes3.dex */
public class ZBasicPooledConnAdapter extends BasicPooledConnAdapter {
    public ZBasicPooledConnAdapter(ThreadSafeClientConnManager threadSafeClientConnManager, AbstractPoolEntry abstractPoolEntry) {
        super(threadSafeClientConnManager, abstractPoolEntry);
    }
}
