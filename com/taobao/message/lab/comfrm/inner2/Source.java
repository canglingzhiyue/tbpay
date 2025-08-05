package com.taobao.message.lab.comfrm.inner2;

import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import java.util.Map;

/* loaded from: classes7.dex */
public interface Source<T> {
    void dispose();

    void subscribe(ActionDispatcher actionDispatcher);

    T updateOriginalData(Action action, T t);

    void use(Command command, Map<String, Object> map, ActionDispatcher actionDispatcher);
}
