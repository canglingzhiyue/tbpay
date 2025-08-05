package com.taobao.android.fluid.framework.lifecycle;

import com.taobao.android.fluid.core.FluidService;
import tb.smz;
import tb.snc;
import tb.snd;
import tb.sne;

/* loaded from: classes5.dex */
public interface ILifecycleService extends FluidService, snc, snd, sne {
    smz getConfig();

    int getPageState();

    boolean isFinish();

    boolean isNavigationBarVisible();
}
