package com.alibaba.android.nextrpc.streamv2.request;

import java.util.List;
import kotlin.Metadata;
import tb.xih;
import tb.xii;
import tb.xij;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u001e\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H&J&\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0015"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/request/RequestResultCallback;", "", "onCreateRequest", "", "request", "Lcom/alibaba/android/nextrpc/streamv2/request/Request;", "onFailure", "errorResponse", "Lcom/alibaba/android/nextrpc/streamv2/response/MainErrorResponse;", "onFinish", "finishResult", "Lcom/alibaba/android/nextrpc/streamv2/request/FinishResult;", "onReceiveAttachedResponse", "attachedResponses", "", "Lcom/alibaba/android/nextrpc/streamv2/response/AttachedResponse;", com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_IS_FINISH, "", "onReceiveData", "mainResponse", "Lcom/alibaba/android/nextrpc/streamv2/response/MainResponse;", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public interface d {
    void a(a aVar);

    void a(b bVar);

    void a(List<xih> list, boolean z);

    void a(xii xiiVar);

    void a(xij xijVar, List<xih> list, boolean z);
}
