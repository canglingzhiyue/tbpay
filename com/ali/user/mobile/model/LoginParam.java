package com.ali.user.mobile.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginParam extends LoginBaseParam {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    public String bindProtocolUrl;
    public boolean callRpc;
    public String errorCode;
    public String headImg;
    public String helpUrl;
    public boolean supportOverseaMobile = true;

    static {
        kge.a(2046508690);
    }

    public static /* synthetic */ Object ipc$super(LoginParam loginParam, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: clone */
    public LoginParam m102clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginParam) ipChange.ipc$dispatch("a32b18cf", new Object[]{this});
        }
        try {
            return (LoginParam) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
