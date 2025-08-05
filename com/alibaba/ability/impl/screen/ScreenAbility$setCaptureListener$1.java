package com.alibaba.ability.impl.screen;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.co;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes2.dex */
public final class ScreenAbility$setCaptureListener$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ co $events;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenAbility$setCaptureListener$1(co coVar) {
        super(0);
        this.$events = coVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            this.$events.a();
        }
    }
}
