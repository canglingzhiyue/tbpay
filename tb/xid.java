package tb;

import com.alibaba.android.nextrpc.streamv2.request.a;
import com.alibaba.android.nextrpc.streamv2.request.b;
import com.alibaba.fastjson.JSONObject;
import com.taobao.tao.stream.c;
import kotlin.Metadata;
import org.android.agoo.common.AgooConstants;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u0003H&¨\u0006\u001a"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/aspect/IRequestAspect;", "", "onError", "", "mtopStreamErrorEvent", "Lcom/taobao/tao/stream/MtopStreamErrorEvent;", "onExecute", "request", "Lcom/alibaba/android/nextrpc/streamv2/request/Request;", "onFinish", "mtopStreamFinishEvent", "Lcom/taobao/tao/stream/MtopStreamFinishEvent;", "onNextRPCFinish", "finishResult", "Lcom/alibaba/android/nextrpc/streamv2/request/FinishResult;", "onReceiveAccsData", AgooConstants.MESSAGE_BODY, "", "headerJson", "Lcom/alibaba/fastjson/JSONObject;", "onReceiveData", "mainResponse", "Lcom/alibaba/android/nextrpc/streamv2/response/MainResponse;", "isAllAttachedResponse", "", "onTimeout", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public interface xid {
    void a();

    void a(a aVar);

    void a(b bVar);

    void a(com.taobao.tao.stream.b bVar);

    void a(c cVar);

    void a(String str, JSONObject jSONObject);

    void a(xij xijVar, boolean z);
}
