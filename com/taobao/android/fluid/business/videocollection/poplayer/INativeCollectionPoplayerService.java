package com.taobao.android.fluid.business.videocollection.poplayer;

import android.content.Context;
import android.view.View;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidService;
import java.util.ArrayList;
import tb.hhy;
import tb.sii;
import tb.slk;

/* loaded from: classes5.dex */
public interface INativeCollectionPoplayerService extends FluidService {
    boolean checkDialogPopup(FluidContext fluidContext);

    boolean checkPopupFisrtTime(FluidContext fluidContext);

    void clickCompilationsPop(ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> arrayList, FluidContext fluidContext, Context context);

    void constructNativePoplayer(com.taobao.android.fluid.framework.data.datamodel.a aVar, FluidContext fluidContext, Context context);

    void setVideoResizeForCollectionPopLayer(FluidContext fluidContext, hhy hhyVar, View view, sii siiVar);

    void updateCollectionDialog(FluidContext fluidContext, ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> arrayList, slk.a aVar, boolean z);
}
