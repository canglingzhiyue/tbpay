package com.taobao.android.fluid.framework.mute;

import com.taobao.android.fluid.core.FluidService;
import tb.sok;
import tb.tbn;

/* loaded from: classes5.dex */
public interface IMuteService extends FluidService, sok, tbn {
    boolean isFadInForFirstTime();

    boolean isMuteABTestForSettings();

    void setFadInForFirstTime(boolean z);

    void setMuteABTestForSettings(boolean z);
}
