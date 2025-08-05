package com.taobao.message.chatv2.viewcenter;

import com.taobao.message.chatv2.viewcenter.config.LayoutInfo;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.inner2.Disposable;

/* loaded from: classes7.dex */
public interface IEventService extends Disposable {
    EventDispatcher createEventDispatcher(LayoutInfo layoutInfo, Object obj, ActionDispatcher actionDispatcher);

    <T> void registerService(Class<T> cls, T t);
}
