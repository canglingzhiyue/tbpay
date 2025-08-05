package com.alibaba.security.realidentity;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class b4 extends a4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public b4(c4 c4Var) {
        super(c4Var);
    }

    @Override // com.alibaba.security.realidentity.a4
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return null;
    }

    public Pair<Boolean, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("bbe3e075", new Object[]{this}) : new Pair<>(Boolean.TRUE, "");
    }
}
