package com.taobao.android.gateway.dinamic.expressionv2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends DinamicASTNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(26830067);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == -1120663606) {
            return super.a();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.gateway.dinamic.expressionv2.DinamicASTNode
    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        com.taobao.android.gateway.util.a.a("ConstName:" + this.d);
        return super.a();
    }
}
