package com.alibaba.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.c;
import kotlin.jvm.internal.q;
import tb.alm;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class AbsAbilityWrapper<T extends com.taobao.android.abilityidl.c> extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final T f1813a;

    static {
        kge.a(474670421);
    }

    public static /* synthetic */ Object ipc$super(AbsAbilityWrapper absAbilityWrapper, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AbsAbilityWrapper(T abilityImpl) {
        q.d(abilityImpl, "abilityImpl");
        this.f1813a = abilityImpl;
    }

    public final T getAbilityImpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("7735e5be", new Object[]{this}) : this.f1813a;
    }

    @Override // tb.alm
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.f1813a.onDestroy();
    }
}
