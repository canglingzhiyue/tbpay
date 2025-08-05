package tb;

import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.streamv2.request.a;
import com.alibaba.android.nextrpc.streamv2.request.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopStreamRequestCallback;
import com.taobao.tao.stream.c;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import org.android.agoo.common.AgooConstants;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bH\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\rH\u0016J2\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/aspect/RequestResultAspect;", "Lcom/alibaba/android/nextrpc/streamv2/aspect/IRequestAspect;", "()V", "apiName", "", "reqId", joq.STAGE_NETWORK, "seqNum", "", "traceId", "getRequestTimeTraceParams", "", "onError", "", "mtopStreamErrorEvent", "Lcom/taobao/tao/stream/MtopStreamErrorEvent;", "onExecute", "request", "Lcom/alibaba/android/nextrpc/streamv2/request/Request;", "onFinish", "mtopStreamFinishEvent", "Lcom/taobao/tao/stream/MtopStreamFinishEvent;", "onNextRPCFinish", "finishResult", "Lcom/alibaba/android/nextrpc/streamv2/request/FinishResult;", "onReceiveAccsData", AgooConstants.MESSAGE_BODY, "headerJson", "Lcom/alibaba/fastjson/JSONObject;", "onReceiveData", "mainResponse", "Lcom/alibaba/android/nextrpc/streamv2/response/MainResponse;", "isAllAttachedResponse", "", "onTimeout", "userTracker", "event", "arg3", "args", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class xie implements xid {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f34306a = "";
    private String b = "";
    private String c = "";
    private int d = 1;
    private String e = "";

    @Override // tb.xid
    public void a(b request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6431ca", new Object[]{this, request});
            return;
        }
        q.d(request, "request");
        String apiName = request.a().getApiName();
        q.b(apiName, "request.mtopRequest.apiName");
        this.b = apiName;
        this.f34306a = request.e();
        this.c = String.valueOf(System.currentTimeMillis());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(joq.STAGE_NETWORK, this.c);
        linkedHashMap.put("useAttachedQueue", "true");
        a(this, "nextrpc-main-request", null, linkedHashMap, 2, null);
        UnifyLog.d("NextRPCStreamV2", "onExecute id=" + request.e(), new Object[0]);
    }

    @Override // tb.xid
    public void a(xij mainResponse, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e316fa15", new Object[]{this, mainResponse, new Boolean(z)});
            return;
        }
        q.d(mainResponse, "mainResponse");
        this.d = mainResponse.f();
        this.e = mainResponse.h();
        boolean z2 = !mainResponse.e().isEmpty();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isAllAttachedResponse", z ? "1" : "0");
        linkedHashMap.put("traceId", this.e);
        linkedHashMap.putAll(b());
        a("nextrpc-main-response-success", z2 ? "hasNextData" : "noNextData", linkedHashMap);
        UnifyLog.d("NextRPCStreamV2", "mtop onReceiveData id=" + this.f34306a + ",seqNum=" + this.d, new Object[0]);
    }

    @Override // tb.xid
    public void a(String body, JSONObject headerJson) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, body, headerJson});
            return;
        }
        q.d(body, "body");
        q.d(headerJson, "headerJson");
        Map<String, String> c = ai.c(b());
        Set<String> keySet = headerJson.keySet();
        q.b(keySet, "headerJson.keys");
        for (String key : keySet) {
            q.b(key, "key");
            String string = headerJson.getString(key);
            q.b(string, "headerJson.getString(key)");
            c.put(key, string);
        }
        a("nextrpc-attached-response", "", c);
        UnifyLog.d("NextRPCStreamV2", "mtop onReceiveAccsData id=" + this.f34306a, new Object[0]);
    }

    @Override // tb.xid
    public void a(com.taobao.tao.stream.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89233166", new Object[]{this, bVar});
            return;
        }
        a(this, "nextrpc-main-response-failed", null, null, 6, null);
        StringBuilder sb = new StringBuilder();
        sb.append("mtop onError id=");
        sb.append(this.f34306a);
        sb.append("，errorCode=");
        String str = null;
        sb.append(bVar != null ? bVar.b : null);
        sb.append(", retMsg=");
        if (bVar != null) {
            str = bVar.c;
        }
        sb.append(str);
        UnifyLog.d("NextRPCStreamV2", sb.toString(), new Object[0]);
    }

    @Override // tb.xid
    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8923a5c5", new Object[]{this, cVar});
            return;
        }
        a("nextrpc-main-response-finish", null, b());
        UnifyLog.d("NextRPCStreamV2", "mtop onFinish id=" + this.f34306a, new Object[0]);
    }

    @Override // tb.xid
    public void a(a finishResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd63bd6b", new Object[]{this, finishResult});
            return;
        }
        q.d(finishResult, "finishResult");
        UnifyLog.d("NextRPCStreamV2", "onNextRPCFinish id=" + this.f34306a + "，type=" + finishResult.b(), new Object[0]);
    }

    @Override // tb.xid
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a(this, "nextrpc-timeout", null, null, 6, null);
        UnifyLog.d("NextRPCStreamV2", "onTimeout id=" + this.f34306a, new Object[0]);
    }

    public static /* synthetic */ void a(xie xieVar, String str, String str2, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60322052", new Object[]{xieVar, str, str2, map, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        xieVar.a(str, str2, map);
    }

    private final void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        map.put(MtopStreamRequestCallback.IS_STREAM, "true");
        bfp.a(str, this.b, str2, map);
    }

    private final Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(joq.STAGE_NETWORK, this.c);
        hashMap.put("currentTime", String.valueOf(System.currentTimeMillis()));
        hashMap.put("seqNum", String.valueOf(this.d));
        return hashMap;
    }
}
