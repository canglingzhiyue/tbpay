package com.alipay.mobile.common.transport;

import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public interface Transport {
    Future<Response> execute(Request request);
}
