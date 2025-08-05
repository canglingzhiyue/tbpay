package com.alibaba.triver.triver_shop.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import tb.kge;

/* loaded from: classes3.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private boolean f3683a;
    private boolean b;

    static {
        kge.a(517351968);
        Companion = new a(null);
    }

    public h() {
        this(false, false, 3, null);
    }

    public h(boolean z, boolean z2) {
        this.f3683a = z;
        this.b = z2;
    }

    public /* synthetic */ h(boolean z, boolean z2, int i, o oVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f3683a;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1429213848);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        public final h a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("db9c99dd", new Object[]{this}) : new h(true, true);
        }

        public final h b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("9514277c", new Object[]{this}) : new h(true, false, 2, null);
        }

        public final h c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("4e8bb51b", new Object[]{this}) : new h(false, false, 2, null);
        }
    }
}
