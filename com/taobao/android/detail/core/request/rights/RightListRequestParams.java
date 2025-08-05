package com.taobao.android.detail.core.request.rights;

import com.taobao.android.detail.core.request.a;
import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class RightListRequestParams extends a implements Serializable {
    public String model = "Detail";
    public String serviceIds;

    static {
        kge.a(-1356770898);
        kge.a(1028243835);
    }

    public RightListRequestParams(String str) {
        this.serviceIds = str;
        emu.a("com.taobao.android.detail.core.request.rights.RightListRequestParams");
    }
}
