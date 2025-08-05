package com.taobao.themis.kernel.adapter;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import tb.qpw;
import tb.qpx;
import tb.qpy;
import tb.qpz;

/* loaded from: classes9.dex */
public interface ITransportAdapter extends com.taobao.themis.kernel.basic.a {
    void addDownload(qpx qpxVar, qpw qpwVar);

    qpz httpRequest(qpy qpyVar) throws InterruptedException, ExecutionException, IOException;
}
