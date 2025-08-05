package com.taobao.android.virtual_thread.face;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.g;
import java.util.Objects;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-240621674);
        kge.a(1789629085);
    }

    @Override // com.taobao.android.virtual_thread.face.g
    public <T> ThreadLocal<T> a(g.a<? extends T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadLocal) ipChange.ipc$dispatch("7823d1eb", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return new ThreadLocal<>();
        }
        return new a(aVar);
    }

    /* loaded from: classes6.dex */
    public static class a<T> extends ThreadLocal<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final g.a<? extends T> f15810a;

        static {
            kge.a(1957141479);
        }

        public a(g.a<? extends T> aVar) {
            this.f15810a = (g.a) Objects.requireNonNull(aVar);
        }

        @Override // java.lang.ThreadLocal
        public T initialValue() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("2908671e", new Object[]{this}) : this.f15810a.get();
        }
    }
}
