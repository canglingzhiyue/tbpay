package com.taobao.android.weex_ability.page;

import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class d extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FragmentActivity f15964a;

    static {
        kge.a(1066975369);
        kge.a(-1434287497);
    }

    public d(FragmentActivity fragmentActivity) {
        this.f15964a = fragmentActivity;
    }

    public FragmentActivity f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentActivity) ipChange.ipc$dispatch("9084b200", new Object[]{this}) : this.f15964a;
    }
}
