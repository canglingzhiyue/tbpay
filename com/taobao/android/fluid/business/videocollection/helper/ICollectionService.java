package com.taobao.android.fluid.business.videocollection.helper;

import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.b;
import tb.obr;
import tb.obs;

/* loaded from: classes5.dex */
public interface ICollectionService extends FluidService, obr, obs {
    public static final String SERVICE_NAME = "ICollectionService";
    public static final b INSTANCE_REQUEST_ERROR = new b("COLLECTION-1", "接口请求失败");
    public static final b INSTANCE_PARSE_ERROR = new b("COLLECTION-2", "数据解析失败");

    com.taobao.android.fluid.business.videocollection.poplayer.b getConfig();

    boolean isCollectionPage(FluidContext fluidContext);

    boolean isCollectionPagingEnable();

    boolean isCollectionRecommendEnable();

    boolean isNewPageRecommend();

    void setCollectionPagingEnable(boolean z);

    void setCollectionRecommendEnable(boolean z);

    void setNewPageRecommend(boolean z);
}
