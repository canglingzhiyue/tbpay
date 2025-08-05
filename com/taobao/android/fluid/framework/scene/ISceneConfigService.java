package com.taobao.android.fluid.framework.scene;

import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.b;
import java.util.Map;
import tb.sni;
import tb.spm;
import tb.spo;
import tb.spp;
import tb.spr;
import tb.sps;

/* loaded from: classes5.dex */
public interface ISceneConfigService extends FluidService, spm {
    public static final b ERROR_CODE_MISS_PARAM = new b("SCENE-1", "FluidInstanceConfig 缺少必要字段");

    spo getGlobalState();

    sni getLockListListener();

    spr getSessionExtParams();

    sps getSessionParams();

    spp getSlidePageLockConfigure();

    boolean isItemRecognizeShowing();

    void mergeTab3ExtParams(Map map);

    void refreshInstanceConfig(FluidInstanceConfig fluidInstanceConfig);

    void refreshSessionParams(Map map);

    void setItemRecognizeShowing(boolean z);

    void setLockListListener(sni sniVar);

    void updateGlobalParams(Map map);
}
