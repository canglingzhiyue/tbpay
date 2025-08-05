package com.alibaba.triver.triver_shop.preload;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<Long, a> f4026a;

    /* loaded from: classes3.dex */
    public interface a {
        Object a(long j);

        void a(Object obj);
    }

    private d() {
    }

    static {
        kge.a(-1616624717);
        INSTANCE = new d();
        f4026a = new HashMap<>();
    }

    public final Object a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8543a356", new Object[]{this, new Long(j)});
        }
        a remove = f4026a.remove(Long.valueOf(j));
        if (remove != null) {
            return remove.a(j);
        }
        return null;
    }

    public static /* synthetic */ void a(d dVar, long j, a aVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce68d2a", new Object[]{dVar, new Long(j), aVar, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        dVar.a(j, aVar, z);
    }

    public final void a(long j, a prefetchDataGetter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761a045c", new Object[]{this, new Long(j), prefetchDataGetter, new Boolean(z)});
            return;
        }
        q.d(prefetchDataGetter, "prefetchDataGetter");
        f4026a.put(Long.valueOf(j), prefetchDataGetter);
        if (!z) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new CommonPrefetchDataManager$setPrefetchDataGetter$1(j), 30000L);
    }

    public final void a(long j, Object data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e008e838", new Object[]{this, new Long(j), data});
            return;
        }
        q.d(data, "data");
        a remove = f4026a.remove(Long.valueOf(j));
        if (remove != null) {
            remove.a(data);
        } else {
            a(this, j, new b(data), false, 4, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f4027a;

        @Override // com.alibaba.triver.triver_shop.preload.d.a
        public void a(Object data) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, data});
            } else {
                q.d(data, "data");
            }
        }

        public b(Object obj) {
            this.f4027a = obj;
        }

        @Override // com.alibaba.triver.triver_shop.preload.d.a
        public Object a(long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8543a356", new Object[]{this, new Long(j)}) : this.f4027a;
        }
    }
}
