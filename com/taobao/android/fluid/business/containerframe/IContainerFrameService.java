package com.taobao.android.fluid.business.containerframe;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.data.datamodel.AlbumData;
import com.taobao.android.fluid.framework.data.datamodel.a;

/* loaded from: classes5.dex */
public interface IContainerFrameService extends FluidService {
    public static final String SERVICE_NAME = "IContainerFrameService";

    void handleAlbumDetail(AlbumData albumData, a aVar);

    void hideCommentFrame();

    boolean isAlbumDetailFrameShowing();

    boolean isGoodListShowing();

    void onGoodsClick(a.c cVar, String str);

    void popCommentFrame(a.c cVar);
}
