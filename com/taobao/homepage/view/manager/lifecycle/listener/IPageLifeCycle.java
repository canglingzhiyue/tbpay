package com.taobao.homepage.view.manager.lifecycle.listener;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public interface IPageLifeCycle {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface EnterHomeType {
    }

    void a(String str);

    void i();

    void j();

    void k();

    void l();

    void m();
}
