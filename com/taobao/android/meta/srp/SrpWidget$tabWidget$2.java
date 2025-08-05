package com.taobao.android.meta.srp;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.htk;
import tb.ruk;

/* loaded from: classes6.dex */
public final class SrpWidget$tabWidget$2 extends Lambda implements ruk<htk> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SrpWidget$tabWidget$2(c cVar) {
        super(0);
        this.this$0 = cVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final htk mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (htk) ipChange.ipc$dispatch("3b36c3a8", new Object[]{this}) : this.this$0.i();
    }
}
