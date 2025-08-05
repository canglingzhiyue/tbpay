package com.alibaba.android.nextrpc.request;

import java.util.List;

/* loaded from: classes2.dex */
public interface NextRpcResponseCallbackV2 extends a {
    public static final int RESPONSE_ATTACHED = 2;
    public static final int RESPONSE_CACHED = 0;
    public static final int RESPONSE_FAILURE = -1;
    public static final int RESPONSE_MAIN = 1;
    public static final int RESPONSE_TIMEOUT = -2;

    /* loaded from: classes2.dex */
    public @interface ResponseType {
    }

    void a(int i, AbsResponse absResponse, List<AttachedResponse> list, boolean z);
}
