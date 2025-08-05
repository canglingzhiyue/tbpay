package com.taobao.android.detail.core.request.endorsement;

import com.taobao.android.detail.core.request.a;
import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class EndorsementRequestParams extends a implements Serializable {
    public String sellerId;

    static {
        kge.a(540934605);
        kge.a(1028243835);
    }

    public EndorsementRequestParams(String str) {
        this.sellerId = str;
        emu.a("com.taobao.android.detail.core.request.endorsement.EndorsementRequestParams");
    }
}
