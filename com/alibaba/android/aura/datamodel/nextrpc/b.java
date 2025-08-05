package com.alibaba.android.aura.datamodel.nextrpc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f2127a;
    private boolean b;

    static {
        kge.a(-922448132);
    }

    public b(a aVar) {
        this.f2127a = a.a(aVar);
        this.b = a.b(aVar);
    }

    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f2127a;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f2128a;
        private boolean b;

        static {
            kge.a(2056956371);
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d4b13004", new Object[]{aVar})).longValue() : aVar.f2128a;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("61ebe195", new Object[]{aVar})).booleanValue() : aVar.b;
        }

        public a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("89ba23e2", new Object[]{this, new Long(j)});
            }
            this.f2128a = j;
            this.b = true;
            return this;
        }

        public b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("1714e073", new Object[]{this}) : new b(this);
        }
    }
}
