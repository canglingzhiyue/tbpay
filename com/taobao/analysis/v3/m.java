package com.taobao.analysis.v3;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.myr;
import tb.mzl;

/* loaded from: classes.dex */
public class m extends mzl implements l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        if (str.hashCode() == 381266679) {
            return super.b();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.mzl
    public /* synthetic */ myr b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (myr) ipChange.ipc$dispatch("16b9aaf7", new Object[]{this}) : a();
    }

    @Override // com.taobao.analysis.v3.l
    public n a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("d5f3bc1", new Object[]{this}) : (n) super.b();
    }
}
