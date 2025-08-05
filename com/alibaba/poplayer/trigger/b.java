package com.alibaba.poplayer.trigger;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<d> f3207a = new ArrayList<>();
    public final ArrayList<d> b = new ArrayList<>();
    public final ArrayList<d> c = new ArrayList<>();
    public final ArrayList<d> d = new ArrayList<>();
    public final ArrayList<BaseConfigItem> e = new ArrayList<>();
    public final List<String> f = new ArrayList();
    public final List<String> g = new ArrayList();

    static {
        kge.a(686621470);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.f.isEmpty()) {
            return true;
        }
        return this.f3207a.isEmpty() && this.d.isEmpty() && this.e.isEmpty() && this.b.isEmpty() && this.c.isEmpty();
    }
}
