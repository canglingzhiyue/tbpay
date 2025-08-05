package com.alibaba.ut.abtest;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f4174a;
    private UTABEnvironment b;
    private UTABMethod c = UTABMethod.Pull;

    static {
        kge.a(541413033);
    }

    public static /* synthetic */ UTABEnvironment a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UTABEnvironment) ipChange.ipc$dispatch("b2a380e", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ UTABEnvironment a(c cVar, UTABEnvironment uTABEnvironment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTABEnvironment) ipChange.ipc$dispatch("1a0bd0e3", new Object[]{cVar, uTABEnvironment});
        }
        cVar.b = uTABEnvironment;
        return uTABEnvironment;
    }

    public static /* synthetic */ UTABMethod a(c cVar, UTABMethod uTABMethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTABMethod) ipChange.ipc$dispatch("20493173", new Object[]{cVar, uTABMethod});
        }
        cVar.c = uTABMethod;
        return uTABMethod;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3db70d5", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.f4174a = z;
        return z;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f4174a;
    }

    public UTABEnvironment b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UTABEnvironment) ipChange.ipc$dispatch("ccdf5914", new Object[]{this}) : this.b;
    }

    public UTABMethod c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UTABMethod) ipChange.ipc$dispatch("9b2c780d", new Object[]{this}) : this.c;
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private c f4175a = new c();

        static {
            kge.a(-756323200);
        }

        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("5bd66223", new Object[]{this});
            }
            if (c.a(this.f4175a) == null) {
                c.a(this.f4175a, UTABEnvironment.Product);
            }
            return this.f4175a;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3d3d050a", new Object[]{this, new Boolean(z)});
            }
            c.a(this.f4175a, z);
            return this;
        }

        public a a(UTABEnvironment uTABEnvironment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("82916431", new Object[]{this, uTABEnvironment});
            }
            c.a(this.f4175a, uTABEnvironment);
            return this;
        }

        public a a(UTABMethod uTABMethod) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9ce09967", new Object[]{this, uTABMethod});
            }
            c.a(this.f4175a, uTABMethod);
            return this;
        }
    }
}
