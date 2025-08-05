package com.alibaba.ability.localization;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes2.dex */
public final class Localization$mainHandler$2 extends Lambda implements ruk<Handler> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Localization$mainHandler$2 INSTANCE = new Localization$mainHandler$2();

    public Localization$mainHandler$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final Handler mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("847beb67", new Object[]{this}) : new Handler(Looper.getMainLooper());
    }
}
