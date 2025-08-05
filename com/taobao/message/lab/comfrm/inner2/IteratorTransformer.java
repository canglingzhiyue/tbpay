package com.taobao.message.lab.comfrm.inner2;

import com.taobao.message.lab.comfrm.core.Action;

/* loaded from: classes7.dex */
public interface IteratorTransformer<T> {
    ItemState transform(Action action, SharedState sharedState, T t, ItemState itemState);
}
