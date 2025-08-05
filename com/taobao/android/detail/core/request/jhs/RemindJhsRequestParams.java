package com.taobao.android.detail.core.request.jhs;

import com.taobao.android.detail.core.request.a;
import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class RemindJhsRequestParams extends a implements Serializable {
    public String itemNumId;
    public String salesSite;

    static {
        kge.a(-868742812);
        kge.a(1028243835);
    }

    public RemindJhsRequestParams(String str) {
        this.itemNumId = str;
        emu.a("com.taobao.android.detail.core.request.jhs.RemindJhsRequestParams");
    }
}
