package com.taobao.android.detail.core.request.area;

import com.taobao.android.detail.datasdk.model.datamodel.sku.AreaNewItemVO;
import java.io.Serializable;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class BasicQuerySupportedAreaListResult implements Serializable {
    public List<AreaNewItemVO> branches;
    public int type;

    static {
        kge.a(1802065311);
        kge.a(1028243835);
    }

    public BasicQuerySupportedAreaListResult() {
        emu.a("com.taobao.android.detail.core.request.area.BasicQuerySupportedAreaListResult");
    }
}
