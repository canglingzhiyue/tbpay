package com.taobao.android.fluid.framework.data.remote.newmodel;

import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import tb.kge;

/* loaded from: classes5.dex */
public final class NewRecommendRequest implements IMTOPRequest {
    public String appId;
    private final String API_NAME = "mtop.relationrecommend.wirelessrecommend.recommend";
    private final String VERSION = "2.0";
    private final boolean NEED_ECODE = false;
    private final boolean NEED_SESSION = true;
    public String asac = null;
    public String params = null;

    static {
        kge.a(-1023098182);
        kge.a(-1823959057);
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public String getApi() {
        return "mtop.relationrecommend.wirelessrecommend.recommend";
    }

    @Override // com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest
    public String getVersion() {
        return "2.0";
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
