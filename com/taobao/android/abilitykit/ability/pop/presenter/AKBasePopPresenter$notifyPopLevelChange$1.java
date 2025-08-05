package com.taobao.android.abilitykit.ability.pop.presenter;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes4.dex */
public final class AKBasePopPresenter$notifyPopLevelChange$1 extends Lambda implements rul<a<?, ?>, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref.BooleanRef $findTopInDim;
    public final /* synthetic */ Ref.IntRef $index;
    public final /* synthetic */ boolean $upper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKBasePopPresenter$notifyPopLevelChange$1(Ref.IntRef intRef, boolean z, Ref.BooleanRef booleanRef) {
        super(1);
        this.$index = intRef;
        this.$upper = z;
        this.$findTopInDim = booleanRef;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(a<?, ?> aVar) {
        invoke2(aVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(a<?, ?> it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caaa223b", new Object[]{this, it});
            return;
        }
        q.d(it, "it");
        com.taobao.android.abilitykit.ability.pop.render.c cVar = a.$ipChange;
        if (cVar == null || cVar.shouldIgnoreNotifyLevelChange()) {
            return;
        }
        if (this.$index.element == 0) {
            boolean z = this.$upper;
            if (z) {
                cVar.onLevelChanged(z, !this.$findTopInDim.element, this.$index.element);
                if (!cVar.isBgTransparent()) {
                    this.$findTopInDim.element = true;
                }
            }
            this.$index.element++;
            return;
        }
        cVar.onLevelChanged(this.$upper, !this.$findTopInDim.element, this.$index.element);
        if (!cVar.isBgTransparent()) {
            this.$findTopInDim.element = true;
        }
        this.$index.element++;
    }
}
