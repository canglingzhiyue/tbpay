package com.taobao.android.meta.srp.ui.list;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.hte;
import tb.iru;
import tb.ruk;

/* loaded from: classes6.dex */
public final class SrpListStateWidget$listStateView$2 extends Lambda implements ruk<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ iru $model;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SrpListStateWidget$listStateView$2(iru iruVar, Activity activity) {
        super(0);
        this.$model = iruVar;
        this.$activity = activity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final a mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("aaf9d23a", new Object[]{this});
        }
        iru iruVar = this.$model;
        if (iruVar == null) {
            q.a();
        }
        hte a2 = iruVar.a();
        if (a2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.srp.SrpConfig");
        }
        return ((com.taobao.android.meta.srp.a) a2).ag().a(this.$activity);
    }
}
