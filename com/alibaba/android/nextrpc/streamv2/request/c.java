package com.alibaba.android.nextrpc.streamv2.request;

import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.streamv2.trace.TraceName;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.tao.Globals;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import org.android.agoo.common.AgooConstants;
import tb.bfw;
import tb.xie;
import tb.xih;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bJ\b\u0010\f\u001a\u00020\tH\u0002J\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fJ0\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u001b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/request/RequestClient;", "Lcom/alibaba/android/nextrpc/internal/accs/IAccsResponseCallback;", "accsServiceName", "", "(Ljava/lang/String;)V", "pendingTasks", "", "Lcom/alibaba/android/nextrpc/streamv2/request/RequestTask;", "cancel", "", "requestIDs", "", "cancelAll", e.RECORD_EXECUTE, "request", "Lcom/alibaba/android/nextrpc/streamv2/request/Request;", "resultCallback", "Lcom/alibaba/android/nextrpc/streamv2/request/RequestResultCallback;", "hasPendingTask", "", "onData", "serviceId", "dataId", AgooConstants.MESSAGE_BODY, "header", "Lcom/alibaba/fastjson/JSONObject;", "removeTask", "unbind", "Companion", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class c implements com.alibaba.android.nextrpc.internal.accs.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, RequestTask> f2402a;
    private final String b;

    private c(String str) {
        this.b = str;
        this.f2402a = new ConcurrentHashMap();
    }

    public /* synthetic */ c(String str, o oVar) {
        this(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/request/RequestClient$Companion;", "", "()V", "clientWithAccsServiceName", "Lcom/alibaba/android/nextrpc/streamv2/request/RequestClient;", "accsServiceName", "", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final c a(String accsServiceName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("6e0668a5", new Object[]{this, accsServiceName});
            }
            q.d(accsServiceName, "accsServiceName");
            c cVar = new c(accsServiceName, null);
            com.alibaba.android.nextrpc.internal.utils.a.a(Globals.getApplication());
            com.alibaba.android.nextrpc.internal.accs.a.a().a(Globals.getApplication(), accsServiceName, cVar);
            return cVar;
        }
    }

    public final synchronized void a(b request, d resultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18bd3ea", new Object[]{this, request, resultCallback});
            return;
        }
        q.d(request, "request");
        q.d(resultCallback, "resultCallback");
        String a2 = bfw.a();
        q.b(a2, "RequestUtil.generateRequestId()");
        request.a(a2);
        RequestTask requestTask = new RequestTask(request, this, resultCallback, new xie());
        this.f2402a.put(request.e(), requestTask);
        requestTask.execute();
    }

    public final synchronized void a(List<String> requestIDs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, requestIDs});
            return;
        }
        q.d(requestIDs, "requestIDs");
        Map<String, RequestTask> map = this.f2402a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, RequestTask> entry : map.entrySet()) {
            if (requestIDs.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (RequestTask requestTask : linkedHashMap.values()) {
            requestTask.cancel();
        }
        for (String str : requestIDs) {
            this.f2402a.remove(str);
        }
    }

    public final synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b();
        com.alibaba.android.nextrpc.internal.accs.a.a().b(Globals.getApplication(), this.b, this);
    }

    @Override // com.alibaba.android.nextrpc.internal.accs.b
    public synchronized void a(String str, String str2, String str3, JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5d0b6a", new Object[]{this, str, str2, str3, jSONObject});
            return;
        }
        try {
            com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.a(TraceName.NEXTRPC_RECEIVE_ACCS);
            if (jSONObject == null || (i = jSONObject.getString("reqId")) == null) {
                i = -1;
            }
            RequestTask requestTask = this.f2402a.get(i);
            if (requestTask != null) {
                com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.a(TraceName.NEXTRPC_CREATE_ATTACHED_RESPONSE);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (str3 == null) {
                    str3 = "";
                }
                xih xihVar = new xih(jSONObject, str3, requestTask.getRequest());
                com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_CREATE_ATTACHED_RESPONSE);
                requestTask.receiveAttachedResponse(xihVar);
            }
            com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_RECEIVE_ACCS);
        } catch (Exception e) {
            UnifyLog.d("NextRPC", "receiveAccs error msg: " + e.getMessage(), new Object[0]);
            com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_RECEIVE_ACCS);
        }
    }

    public final synchronized void a(b request) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6431ca", new Object[]{this, request});
            return;
        }
        q.d(request, "request");
        if (request.e().length() <= 0) {
            z = false;
        }
        if (z) {
            this.f2402a.remove(request.e());
        }
    }

    public final synchronized boolean b(b request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a9ee34f", new Object[]{this, request})).booleanValue();
        }
        q.d(request, "request");
        return this.f2402a.containsKey(request.e());
    }

    private final synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (RequestTask requestTask : this.f2402a.values()) {
            requestTask.cancel();
        }
        this.f2402a.clear();
    }
}
