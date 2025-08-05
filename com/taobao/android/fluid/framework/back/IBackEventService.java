package com.taobao.android.fluid.framework.back;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.layoutmanager.container.containerlifecycle.GestureLayout;
import tb.ple;
import tb.psv;
import tb.shs;
import tb.snd;
import tb.spy;

/* loaded from: classes5.dex */
public interface IBackEventService extends FluidService, psv, shs, snd {
    public static final String SERVICE_NAME = "IBackEventService";

    void acceptEnableInterceptBackMsg(spy spyVar);

    ple getBackKeyEventDetector();

    void handleExitFullPage();

    void setBackInterceptListener(GestureLayout gestureLayout);

    boolean tryToInterceptBack();
}
