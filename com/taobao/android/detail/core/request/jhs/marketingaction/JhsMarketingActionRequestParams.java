package com.taobao.android.detail.core.request.jhs.marketingaction;

import com.taobao.android.detail.core.request.a;
import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class JhsMarketingActionRequestParams extends a implements Serializable {
    public String attributes;
    public String id;
    public String itemId;
    public String type;

    static {
        kge.a(-1218160548);
        kge.a(1028243835);
    }

    public JhsMarketingActionRequestParams(String str, String str2, String str3, String str4) {
        this.type = str2;
        this.attributes = str4;
        this.itemId = str;
        this.id = str3;
        emu.a("com.taobao.android.detail.core.request.jhs.marketingaction.JhsMarketingActionRequestParams");
    }
}
