package com.alibaba.android.nextrpc.stream.request;

import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import java.util.List;

/* loaded from: classes2.dex */
public interface d {
    void a(StreamOtherResponse streamOtherResponse);

    void a(StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list);

    void a(List<AttachedResponse> list);

    void c(StreamOtherResponse streamOtherResponse);
}
