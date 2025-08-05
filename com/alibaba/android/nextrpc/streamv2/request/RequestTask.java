package com.alibaba.android.nextrpc.streamv2.request;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.streamv2.trace.TraceName;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.tao.stream.IMtopStreamListener;
import com.taobao.themis.kernel.i;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.xid;
import tb.xig;
import tb.xih;
import tb.xii;
import tb.xij;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 12\u00020\u0001:\u00011B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001c\u001a\u00020\u001aH\u0002J$\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J$\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J,\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u000e\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,J\u0018\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u000200H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/request/RequestTask;", "Lcom/taobao/tao/stream/IMtopStreamListener;", "request", "Lcom/alibaba/android/nextrpc/streamv2/request/Request;", "requestClient", "Lcom/alibaba/android/nextrpc/streamv2/request/RequestClient;", "resultCallback", "Lcom/alibaba/android/nextrpc/streamv2/request/RequestResultCallback;", "requestAspect", "Lcom/alibaba/android/nextrpc/streamv2/aspect/IRequestAspect;", "(Lcom/alibaba/android/nextrpc/streamv2/request/Request;Lcom/alibaba/android/nextrpc/streamv2/request/RequestClient;Lcom/alibaba/android/nextrpc/streamv2/request/RequestResultCallback;Lcom/alibaba/android/nextrpc/streamv2/aspect/IRequestAspect;)V", "asyncHandler", "Landroid/os/Handler;", "attachedQueue", "Lcom/alibaba/android/nextrpc/streamv2/queue/AttachedQueue;", "errorStreamResponse", "Lcom/taobao/tao/stream/MtopStreamResponse;", "isMainRemoteResponsed", "", "mainResponseSeqNum", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextrpcTimeout", "", "getRequest", "()Lcom/alibaba/android/nextrpc/streamv2/request/Request;", "cancel", "", e.RECORD_EXECUTE, "handleTimeout", "onError", "mtopStreamErrorEvent", "Lcom/taobao/tao/stream/MtopStreamErrorEvent;", i.CDN_REQUEST_TYPE, "requestContext", "", "onFinish", "mtopStreamFinishEvent", "Lcom/taobao/tao/stream/MtopStreamFinishEvent;", "onReceiveData", "mtopStreamResponse", "baseOutDo", "Lmtopsdk/mtop/domain/BaseOutDo;", "receiveAttachedResponse", "attachedResponse", "Lcom/alibaba/android/nextrpc/streamv2/response/AttachedResponse;", "requestFinish", "isSuccess", "errorType", "Lcom/alibaba/android/nextrpc/streamv2/request/FinishErrorType;", "Companion", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class RequestTask implements IMtopStreamListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final String RequestHeaderRequestId = "nextrpc-req-id";
    private static final Looper sAsyncLooper;
    private final Handler asyncHandler;
    private final xig attachedQueue;
    private com.taobao.tao.stream.d errorStreamResponse;
    private volatile boolean isMainRemoteResponsed;
    private volatile AtomicInteger mainResponseSeqNum;
    private final int nextrpcTimeout;
    private final com.alibaba.android.nextrpc.streamv2.request.b request;
    private final xid requestAspect;
    private final c requestClient;
    private final d resultCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!RequestTask.access$isMainRemoteResponsed$p(RequestTask.this)) {
                RequestTask.access$handleTimeout(RequestTask.this);
            } else {
                RequestTask.access$requestFinish(RequestTask.this, false, FinishErrorType.TIMEOUT);
                RequestTask.access$getRequestAspect$p(RequestTask.this).a();
            }
        }
    }

    public RequestTask(com.alibaba.android.nextrpc.streamv2.request.b request, c requestClient, d resultCallback, xid requestAspect) {
        q.d(request, "request");
        q.d(requestClient, "requestClient");
        q.d(resultCallback, "resultCallback");
        q.d(requestAspect, "requestAspect");
        this.request = request;
        this.requestClient = requestClient;
        this.resultCallback = resultCallback;
        this.requestAspect = requestAspect;
        this.attachedQueue = new xig();
        this.nextrpcTimeout = this.request.d() > 0 ? this.request.d() : 30000;
        this.asyncHandler = new Handler(sAsyncLooper);
        this.mainResponseSeqNum = new AtomicInteger();
    }

    public static final /* synthetic */ xid access$getRequestAspect$p(RequestTask requestTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xid) ipChange.ipc$dispatch("9b1bf4ff", new Object[]{requestTask}) : requestTask.requestAspect;
    }

    public static final /* synthetic */ void access$handleTimeout(RequestTask requestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c13d0", new Object[]{requestTask});
        } else {
            requestTask.handleTimeout();
        }
    }

    public static final /* synthetic */ boolean access$isMainRemoteResponsed$p(RequestTask requestTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b40c5161", new Object[]{requestTask})).booleanValue() : requestTask.isMainRemoteResponsed;
    }

    public static final /* synthetic */ void access$requestFinish(RequestTask requestTask, boolean z, FinishErrorType finishErrorType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c914e470", new Object[]{requestTask, new Boolean(z), finishErrorType});
        } else {
            requestTask.requestFinish(z, finishErrorType);
        }
    }

    public static final /* synthetic */ void access$setMainRemoteResponsed$p(RequestTask requestTask, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2389cf", new Object[]{requestTask, new Boolean(z)});
        } else {
            requestTask.isMainRemoteResponsed = z;
        }
    }

    public final com.alibaba.android.nextrpc.streamv2.request.b getRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.nextrpc.streamv2.request.b) ipChange.ipc$dispatch("74d6ac98", new Object[]{this}) : this.request;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/request/RequestTask$Companion;", "", "()V", "RequestHeaderRequestId", "", "sAsyncLooper", "Landroid/os/Looper;", "getAsyncLooper", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ Looper a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Looper) ipChange.ipc$dispatch("e3c5190", new Object[]{aVar}) : aVar.a();
        }

        private final Looper a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Looper) ipChange.ipc$dispatch("d8782f3d", new Object[]{this});
            }
            HandlerThread handlerThread = new HandlerThread("NextRPCStreamV2");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            q.b(looper, "handlerThread.looper");
            return looper;
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        sAsyncLooper = a.a(aVar);
    }

    public final synchronized void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        try {
            com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.a(TraceName.NEXTRPC_EXECUTE_TASK);
            this.resultCallback.a(this.request);
            if (this.nextrpcTimeout < this.request.b().mtopProp.connTimeout) {
                this.request.b().mo1312setConnectionTimeoutMilliSecond(this.nextrpcTimeout);
            }
            LinkedHashMap requestHeaders = this.request.b().mtopProp.getRequestHeaders();
            if (requestHeaders == null) {
                requestHeaders = new LinkedHashMap();
            }
            requestHeaders.put(RequestHeaderRequestId, this.request.e());
            this.request.b().mtopProp.setRequestHeaders(requestHeaders);
            this.request.b().allowParseJson(false);
            this.request.b().mo1296handler(this.asyncHandler);
            this.request.b().streamMode(true);
            this.request.c().c();
            com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.a(TraceName.NEXTRPC_SEND_MTOP);
            this.request.b().mo1337addListener((MtopListener) this).startRequest();
            com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_SEND_MTOP);
            handleTimeout();
            this.requestAspect.a(this.request);
            com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_EXECUTE_TASK);
        } catch (Exception e) {
            UnifyLog.d("NextRPC", "RequestTask execute error msg=" + e.getMessage(), new Object[0]);
            com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_EXECUTE_TASK);
        }
    }

    public final synchronized void receiveAttachedResponse(xih attachedResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1634408", new Object[]{this, attachedResponse});
            return;
        }
        q.d(attachedResponse, "attachedResponse");
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.a(TraceName.NEXTRPC_QUEUE_ATTACHED_RESPONSE);
        List<xih> a2 = this.attachedQueue.a(attachedResponse);
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_QUEUE_ATTACHED_RESPONSE);
        if (!this.isMainRemoteResponsed) {
            return;
        }
        if (!a2.isEmpty()) {
            com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.a(TraceName.NEXTRPC_RESULT_ATTACHED_RESPONSE);
            this.resultCallback.a(a2, this.attachedQueue.a());
            com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_RESULT_ATTACHED_RESPONSE);
        }
        if (this.attachedQueue.a()) {
            requestFinish(true, FinishErrorType.FINISH_NONE);
        }
        this.requestAspect.a(attachedResponse.c(), attachedResponse.a());
    }

    public final synchronized void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        requestFinish(false, FinishErrorType.CANCEL);
        this.request.b().cancelRequest();
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public synchronized void onReceiveData(com.taobao.tao.stream.d mtopStreamResponse, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccf0e5c", new Object[]{this, mtopStreamResponse, baseOutDo, new Integer(i), obj});
            return;
        }
        q.d(mtopStreamResponse, "mtopStreamResponse");
        this.request.c().b(this.mainResponseSeqNum.get() + 1);
        this.isMainRemoteResponsed = true;
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.a(TraceName.NEXTRPC_CREATE_MAIN_RESPONSE);
        xij xijVar = new xij(mtopStreamResponse, this.request);
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_CREATE_MAIN_RESPONSE);
        if (!xijVar.g()) {
            this.errorStreamResponse = mtopStreamResponse;
            return;
        }
        xijVar.a(this.mainResponseSeqNum.incrementAndGet());
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.a(TraceName.NEXTRPC_QUEUE_MAIN_RESPONSE);
        List<xih> a2 = this.attachedQueue.a(xijVar);
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_QUEUE_MAIN_RESPONSE);
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.a(TraceName.NEXTRPC_RESULT_MAIN_RESPONSE);
        boolean a3 = this.attachedQueue.a();
        this.resultCallback.a(xijVar, a2, a3);
        com.alibaba.android.nextrpc.streamv2.trace.a.INSTANCE.b(TraceName.NEXTRPC_RESULT_MAIN_RESPONSE);
        this.requestAspect.a(xijVar, a3);
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public synchronized void onError(com.taobao.tao.stream.b bVar, int i, Object obj) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fad801", new Object[]{this, bVar, new Integer(i), obj});
            return;
        }
        this.isMainRemoteResponsed = true;
        int incrementAndGet = this.mainResponseSeqNum.incrementAndGet();
        com.taobao.tao.stream.d dVar = this.errorStreamResponse;
        if (dVar == null || (str = dVar.f21113a) == null) {
            str = "";
        }
        String str4 = str;
        com.taobao.tao.stream.d dVar2 = this.errorStreamResponse;
        if (dVar2 == null || (str2 = dVar2.b) == null) {
            str2 = "";
        }
        String str5 = str2;
        int i2 = bVar != null ? bVar.f : 0;
        if (bVar == null || (str3 = bVar.e) == null) {
            str3 = "";
        }
        this.resultCallback.a(new xii(incrementAndGet, str4, str5, i2, str3));
        requestFinish(false, FinishErrorType.MTOP_FAILURE);
        this.requestAspect.a(bVar);
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public synchronized void onFinish(com.taobao.tao.stream.c cVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295b572b", new Object[]{this, cVar, new Integer(i), obj});
            return;
        }
        this.isMainRemoteResponsed = true;
        if (this.attachedQueue.a()) {
            requestFinish(true, FinishErrorType.FINISH_NONE);
        }
        this.requestAspect.a(cVar);
    }

    private final synchronized void requestFinish(boolean z, FinishErrorType finishErrorType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3170f6e0", new Object[]{this, new Boolean(z), finishErrorType});
            return;
        }
        if (this.requestClient.b(this.request)) {
            this.requestClient.a(this.request);
            com.alibaba.android.nextrpc.streamv2.request.a aVar = new com.alibaba.android.nextrpc.streamv2.request.a(z, finishErrorType, this.request);
            this.resultCallback.a(aVar);
            this.asyncHandler.removeCallbacksAndMessages(null);
            this.requestAspect.a(aVar);
        }
    }

    private final void handleTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a58a20", new Object[]{this});
        } else {
            this.asyncHandler.postDelayed(new b(), this.nextrpcTimeout);
        }
    }
}
