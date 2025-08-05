package com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f12493a;
    public int b;
    public boolean c;
    public boolean d;

    static {
        kge.a(-524547368);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "indicatorText: " + this.f12493a + " ,isMin: " + this.c + " ,isMax: " + this.d;
    }
}
