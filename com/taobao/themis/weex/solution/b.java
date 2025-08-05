package com.taobao.themis.weex.solution;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.tlg;

/* loaded from: classes9.dex */
public final class b extends tlg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final f f22903a;

    static {
        kge.a(241467390);
    }

    @Override // tb.tlf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public b(f instance) {
        q.d(instance, "instance");
        this.f22903a = instance;
    }
}
