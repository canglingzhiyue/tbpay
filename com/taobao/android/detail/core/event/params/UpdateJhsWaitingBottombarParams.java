package com.taobao.android.detail.core.event.params;

import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class UpdateJhsWaitingBottombarParams implements Serializable {
    public String actionText;
    public String btnColor;
    public boolean btnDisable;
    public String btnText;
    public String errorMessage;
    public boolean isSuccess;

    static {
        kge.a(841704606);
        kge.a(1028243835);
    }

    public UpdateJhsWaitingBottombarParams() {
        emu.a("com.taobao.android.detail.core.event.params.UpdateJhsWaitingBottombarParams");
    }
}
