package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class ai implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ruk f12056a;

    public ai(ruk rukVar) {
        this.f12056a = rukVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            kotlin.jvm.internal.q.b(this.f12056a.mo2427invoke(), "invoke(...)");
        }
    }
}
