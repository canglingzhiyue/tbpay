package com.taobao.message.lab.comfrm.inner;

import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.ViewObject;

/* loaded from: classes7.dex */
public interface Render<VIEW> {
    /* renamed from: getView */
    VIEW mo1139getView();

    void render(ViewObject viewObject, EventDispatcher eventDispatcher);
}
