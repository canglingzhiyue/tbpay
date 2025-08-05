package com.taobao.android.fluid.business.globalinteraction;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.b;
import com.taobao.android.fluid.framework.data.datamodel.a;
import tb.iqw;

/* loaded from: classes5.dex */
public interface IInteractionService extends FluidService {
    public static final b ERROR_CODE_WEB_VIEW_NULL = new b("INTERACTION-1", "全局互动 WebView 为空");

    iqw getConfig();

    String getGlobalVCH5Url();

    void initCollectionPoplayer();

    void initGlobalH5MessageHandler(a aVar);

    void initGlobalInteractHandler();

    boolean isEnableGlobalWeexDSLV2();

    void setGlobalLayerVisibility(boolean z);
}
