package com.taobao.android.trade.event;

import com.taobao.android.trade.event.Event;

/* loaded from: classes.dex */
public interface j<T extends Event> {
    ThreadMode getThreadMode();

    i handleEvent(T t);
}
