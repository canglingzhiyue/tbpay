package com.taobao.weex.ui;

import com.taobao.weex.bridge.Invoker;
import com.taobao.weex.bridge.JavascriptInvokable;

/* loaded from: classes9.dex */
public interface IFComponentHolder extends JavascriptInvokable, ComponentCreator {
    Invoker getPropertyInvoker(String str);

    void loadIfNonLazy();
}
