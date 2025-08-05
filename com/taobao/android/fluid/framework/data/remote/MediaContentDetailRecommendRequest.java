package com.taobao.android.fluid.framework.data.remote;

import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import tb.kge;

/* loaded from: classes5.dex */
public final class MediaContentDetailRecommendRequest implements IMTOPRequest {
    public String contentId;
    public String sceneId;
    private final String API_NAME = "mtop.taobao.content.detail.mix.recommend";
    private final String VERSION = "1.0";
    private final boolean NEED_ECODE = false;
    private final boolean NEED_SESSION = true;
    public long pageIndex = 0;
    public String bizParameters = null;
    public long pageSize = 0;
    public String source = null;
    public String extendParameters = null;

    static {
        kge.a(-172059194);
        kge.a(-1823959057);
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public String getApi() {
        return "mtop.taobao.content.detail.mix.recommend";
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public String getVersion() {
        return "1.0";
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public boolean isNeedEcode() {
        return false;
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public boolean isNeedSession() {
        return true;
    }
}
