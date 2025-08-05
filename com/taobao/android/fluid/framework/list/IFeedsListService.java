package com.taobao.android.fluid.framework.list;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.b;
import tb.mrf;
import tb.snm;
import tb.sor;

/* loaded from: classes5.dex */
public interface IFeedsListService extends FluidService, mrf, snm {
    public static final b RECYCLER_VIEW_INDEX_OUT_OF_BOUNDS = new b("LIST-1", "RecyclerView 索引越界");
    public static final b SCROLL_INVALID_TARGET_POSITION = new b("LIST-2", "无效的滚动索引");
    public static final String SERVICE_NAME = "IFeedsListService";

    sor getPreloadVideoData();

    void renderCacheVideo(sor sorVar);
}
