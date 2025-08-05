package com.taobao.android.fluid.framework.hostapp;

import android.content.Context;
import com.taobao.android.fluid.core.FluidService;
import tb.smy;

/* loaded from: classes5.dex */
public interface IHostAppService extends FluidService, smy {
    public static final String SERVICE_NAME = "IHostAppService";

    int getCurrentTabIndex();

    int getTabIndex();

    boolean isTBMainActivity(Context context);

    boolean isTabBarHide();

    boolean isTaoBaoApp(Context context);
}
