package com.taobao.pha.tb;

import com.taobao.android.nav.r;
import com.taobao.android.tschedule.protocol.b;
import tb.kge;

/* loaded from: classes7.dex */
public class o extends r {
    static {
        kge.a(-1892890133);
    }

    public o() {
        addQueryFilter(b.PROTOCOL_BIZ_CODE_PHA);
        addQueryFilter("wh_hckj");
        addQueryFilter("__pha_container__");
        addQueryFilter("pha_manifest");
    }
}
