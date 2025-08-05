package com.taobao.android.detail.core.request.jhs;

import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class RemindResult implements Serializable {
    public String actionText;
    public String btnColor;
    public boolean btnDisable;
    public String btnText;
    public String errorMessage;
    public boolean isSuccess;

    static {
        kge.a(1773814401);
        kge.a(1028243835);
    }

    public RemindResult() {
        emu.a("com.taobao.android.detail.core.request.jhs.RemindResult");
    }
}
