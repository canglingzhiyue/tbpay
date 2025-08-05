package com.taobao.android.fluid.framework.data;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.a;
import com.taobao.android.fluid.core.b;
import java.util.Map;
import tb.jul;
import tb.skk;
import tb.skm;
import tb.skp;
import tb.sks;
import tb.skt;
import tb.skv;
import tb.skx;
import tb.sld;
import tb.slg;
import tb.slh;
import tb.sli;
import tb.slk;

/* loaded from: classes5.dex */
public interface IDataService extends FluidService, jul, skm, skp, sks, skt, skv.a, skv.b, skx, sld, slg, slh, sli {
    public static final b DATA_ERROR_INTERCEPTOR_CHAIN_OUT_OF_INDEX = new b("DATA-1", "数据请求链数组越界");
    public static final b ERROR_CODE_REQUEST_DATA = new b("DATA-2", "请求接口失败");
    public static final String SERVICE_NAME = "IDataService";

    skk getConfig();

    boolean isTab3CacheDataRefreshShowLoading();

    boolean isTab3CacheEnable();

    boolean isTab3CacheHadExposedNeedPlayNextVideo();

    void requestList(boolean z, Map map, a<slk.a> aVar);

    void requestListForCollection(boolean z, Map map, int i, a<slk.a> aVar);

    void setTab3CacheDataRefreshShowLoading(boolean z);

    void setTab3CacheEnable(boolean z);

    void setTab3CacheHadExposedNeedPlayNextVideo(boolean z);
}
