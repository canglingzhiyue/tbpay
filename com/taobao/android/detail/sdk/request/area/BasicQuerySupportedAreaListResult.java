package com.taobao.android.detail.sdk.request.area;

import com.taobao.tao.sku.uimodel.AreaNewItemVO;
import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class BasicQuerySupportedAreaListResult implements Serializable {
    public List<AreaNewItemVO> branches;
    public int type;

    static {
        kge.a(-831526822);
        kge.a(1028243835);
    }

    public BasicQuerySupportedAreaListResult() {
        tpc.a("com.taobao.android.detail.sdk.request.area.BasicQuerySupportedAreaListResult");
    }
}
