package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class c2 extends y1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public c2(Context context, String str, RPBizConfig rPBizConfig, u4 u4Var, String str2, String str3, String str4, byte[] bArr) {
        super(context, str, rPBizConfig, u4Var, str2, str3, str4, bArr);
    }

    @Override // com.alibaba.security.realidentity.y1
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (this.i == null) {
            return this.b;
        }
        return this.i + this.b;
    }

    public c2(Context context, String str, RPBizConfig rPBizConfig, u4 u4Var, String str2, String str3, String str4) {
        super(context, str, rPBizConfig, u4Var, str2, str3, str4);
    }
}
