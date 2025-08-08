package com.alibaba.android.nextrpc.stream.request;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.stream.internal.StreamNextRpcRequestImpl;
import com.alibaba.android.nextrpc.stream.internal.mtop.IStreamMtopRequestCallback;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class c implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, List<c>> b = new HashMap();
    private static final Object d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.android.nextrpc.stream.internal.response.a f2397a;
    private final Context c;
    private final String e;
    private Map<String, IStreamMtopRequestCallback> f = new ConcurrentHashMap();

    public static /* synthetic */ void a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c2def", new Object[]{cVar, str});
        } else {
            cVar.a(str);
        }
    }

    public c(Context context, String str) {
        this.c = context.getApplicationContext();
        this.e = str;
        synchronized (d) {
            List<c> list = b.get(str);
            list = list == null ? new ArrayList<>() : list;
            list.add(this);
            b.put(str, list);
        }
        if (!StringUtils.isEmpty(str)) {
            this.f2397a = new com.alibaba.android.nextrpc.stream.internal.response.a(this.f);
            com.alibaba.android.nextrpc.internal.accs.a.a().a(context, str, this.f2397a);
        }
        com.alibaba.android.nextrpc.internal.utils.a.a(context);
    }

    @Override // com.alibaba.android.nextrpc.stream.request.a
    public String a(StreamNextRpcRequest streamNextRpcRequest, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71d3c799", new Object[]{this, streamNextRpcRequest, dVar});
        }
        StreamNextRpcRequestImpl streamNextRpcRequestImpl = new StreamNextRpcRequestImpl();
        String request = streamNextRpcRequestImpl.request(streamNextRpcRequest, dVar, new com.alibaba.android.nextrpc.stream.internal.mtop.b() { // from class: com.alibaba.android.nextrpc.stream.request.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.nextrpc.stream.internal.mtop.b
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    c.a(c.this, str);
                }
            }
        });
        UnifyLog.d("StreamNextRpcRequestClientImpl", "Current reqId = " + request, new Object[0]);
        a(request, streamNextRpcRequestImpl);
        return request;
    }

    @Override // com.alibaba.android.nextrpc.stream.request.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        synchronized (d) {
            List<c> list = b.get(this.e);
            if (list != null) {
                list.remove(this);
                if (list.size() == 0) {
                    b.remove(this.e);
                }
            }
        }
        if (!StringUtils.isEmpty(this.e) && this.f2397a != null) {
            com.alibaba.android.nextrpc.internal.accs.a.a().b(this.c, this.e, this.f2397a);
        }
        for (String str : this.f.keySet()) {
            if (str != null) {
                IStreamMtopRequestCallback iStreamMtopRequestCallback = this.f.get(str);
                if (iStreamMtopRequestCallback instanceof com.alibaba.android.nextrpc.request.internal.mtop.a) {
                    ((com.alibaba.android.nextrpc.stream.internal.mtop.a) iStreamMtopRequestCallback).release();
                }
            }
        }
    }

    private void a(String str, IStreamMtopRequestCallback iStreamMtopRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("507bb166", new Object[]{this, str, iStreamMtopRequestCallback});
        } else {
            this.f.put(str, iStreamMtopRequestCallback);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Map<String, IStreamMtopRequestCallback> map = this.f;
        if (map == null) {
            return;
        }
        map.remove(str);
    }
}
