package com.alipay.vi.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class RpcThreadParamsHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_RESPONSE_HEADER = "key_rpc_response_headers";

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<Map<String, Object>> f6210a = new ThreadLocal<Map<String, Object>>() { // from class: com.alipay.vi.android.phone.mrpc.core.RpcThreadParamsHelper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.ThreadLocal
        public final Map<String, Object> initialValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d848a9c9", new Object[]{this}) : new HashMap(1);
        }
    };

    public static final void setResponseHeaders(HttpUrlHeader httpUrlHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e2feb62", new Object[]{httpUrlHeader});
        } else {
            f6210a.get().put(KEY_RESPONSE_HEADER, httpUrlHeader);
        }
    }

    public static final HttpUrlHeader getResponseHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrlHeader) ipChange.ipc$dispatch("5334adf2", new Object[0]);
        }
        Object obj = f6210a.get().get(KEY_RESPONSE_HEADER);
        if (obj == null) {
            return null;
        }
        if (obj instanceof HttpUrlHeader) {
            return (HttpUrlHeader) obj;
        }
        new StringBuilder("[getResponseHeaders] Illega value type ：").append(obj.getClass().getName());
        return null;
    }

    public static final ThreadLocal<Map<String, Object>> getThreadLocal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadLocal) ipChange.ipc$dispatch("1502a816", new Object[0]) : f6210a;
    }

    public static final void clearThreadLocalValues() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7082bd", new Object[0]);
            return;
        }
        try {
            f6210a.remove();
        } catch (Throwable unused) {
        }
    }
}
