package com.alibaba.ability.impl.audio.floatwindow;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes2.dex */
public final class FloatWindowManager$Companion$instance$2 extends Lambda implements ruk<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final FloatWindowManager$Companion$instance$2 INSTANCE = new FloatWindowManager$Companion$instance$2();

    public FloatWindowManager$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final b mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("dd0f5329", new Object[]{this}) : new b(null);
    }
}
