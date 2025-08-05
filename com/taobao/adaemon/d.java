package com.taobao.adaemon;

import android.support.constraint.Constraints;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f8337a;
    public int b;
    private boolean c;
    private int d;
    public boolean e;

    static {
        kge.a(705480729);
    }

    private d(a aVar) {
        this.b = -1;
        this.e = false;
        this.f8337a = aVar.f8338a;
        this.c = aVar.b;
        this.d = aVar.c;
        e.a(Constraints.TAG, "Constraints:" + toString(), new Object[0]);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Constraints{mRequiresBackground=" + this.f8337a + ", mRequiresPressBackToBg=" + this.c + ", mBackgroundInterval=" + this.d + ", targetPid=" + this.b + '}';
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f8338a = true;
        public boolean b = true;
        public int c = 10;

        static {
            kge.a(1545238000);
        }

        public d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("90874d56", new Object[]{this}) : new d(this);
        }
    }
}
