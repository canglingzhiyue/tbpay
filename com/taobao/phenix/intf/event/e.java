package com.taobao.phenix.intf.event;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.niw;
import tb.qol;
import tb.riy;

/* loaded from: classes7.dex */
public class e extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f18930a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public final List<String> g;
    public final List<String> h;
    public final List<Throwable> i;

    static {
        kge.a(-364565662);
    }

    public e(List<String> list, List<String> list2) {
        super(null);
        this.g = list;
        this.h = list2;
        this.i = new ArrayList();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (!niw.a(3)) {
            return "PrefetchEvent@Release";
        }
        return "PrefetchEvent@" + Integer.toHexString(hashCode()) + "(totalCount:" + this.f18930a + ", completeCount:" + this.b + ", completeSize:" + qol.a(this.c) + ", allSucceeded:" + this.f + ", succeeded:" + this.g.size() + ", failed:" + this.h.size() + riy.BRACKET_END_STR;
    }
}
