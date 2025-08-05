package com.taobao.android.live.plugin.atype.flexalocal.subscribe;

import java.io.Serializable;

/* loaded from: classes6.dex */
public interface IObserverX extends Serializable {
    void onComplete();

    void onError(Throwable th);

    void onNext(Object obj);
}
