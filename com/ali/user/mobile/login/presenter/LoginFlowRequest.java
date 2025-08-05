package com.ali.user.mobile.login.presenter;

import com.ali.user.mobile.rpc.login.model.LoginRequestBase;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginFlowRequest extends LoginRequestBase implements Serializable {
    public String loginId;
    public boolean mobileNetworkOn;

    static {
        kge.a(-156629363);
        kge.a(1028243835);
    }
}
