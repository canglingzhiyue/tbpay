package com.taobao.themis.kernel.container.ui.splash;

import com.taobao.themis.kernel.e;
import java.util.Map;

/* loaded from: classes9.dex */
public interface ISplashView {

    /* loaded from: classes9.dex */
    public enum Status {
        LAUNCH,
        LOADING,
        ERROR,
        EXIT
    }

    void a();

    void a(e eVar, Map<String, String> map);

    void b();

    void c();
}
