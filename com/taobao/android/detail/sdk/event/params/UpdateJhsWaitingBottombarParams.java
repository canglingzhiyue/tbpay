package com.taobao.android.detail.sdk.event.params;

import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class UpdateJhsWaitingBottombarParams implements Serializable {
    public String actionText;
    public String btnColor;
    public boolean btnDisable;
    public String btnText;
    public String errorMessage;
    public boolean isSuccess;

    static {
        kge.a(-1449301479);
        kge.a(1028243835);
    }

    public UpdateJhsWaitingBottombarParams() {
        tpc.a("com.taobao.android.detail.sdk.event.params.UpdateJhsWaitingBottombarParams");
    }
}
