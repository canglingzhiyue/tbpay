package com.taobao.tao.stream;

import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: classes8.dex */
public interface IMtopStreamListener extends MtopListener {
    void onError(b bVar, int i, Object obj);

    void onFinish(c cVar, int i, Object obj);

    void onReceiveData(d dVar, BaseOutDo baseOutDo, int i, Object obj);
}
