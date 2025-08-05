package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.kge;

/* loaded from: classes9.dex */
public final class af implements f.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final CopyOnWriteArraySet<Integer> c;

    /* renamed from: a  reason: collision with root package name */
    private int f22516a;
    private final com.taobao.themis.kernel.f b;

    @Override // com.taobao.themis.kernel.f.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.f.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(836140808);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final CopyOnWriteArraySet<Integer> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("a936fee1", new Object[]{this}) : af.d();
        }
    }

    public af(com.taobao.themis.kernel.f instance) {
        kotlin.jvm.internal.q.d(instance, "instance");
        this.b = instance;
    }

    public static final /* synthetic */ CopyOnWriteArraySet d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("d59da7be", new Object[0]) : c;
    }

    static {
        kge.a(-1007139904);
        kge.a(1939033613);
        Companion = new a(null);
        c = new CopyOnWriteArraySet<>();
    }

    @Override // com.taobao.themis.kernel.f.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        boolean z = this.b.i() == TMSContainerType.EMBEDDED || this.b.j() == TMSSolutionType.WEB_SINGLE_PAGE || this.b.j() == TMSSolutionType.UNIAPP;
        if (c.isEmpty() || this.f22516a >= com.taobao.themis.kernel.utils.n.a(com.taobao.themis.kernel.i.GROUP_THEMIS_COMMON_CONFIG, "retryReloadNumber", 0) || !z) {
            return;
        }
        this.b.C();
        this.b.n();
        c.clear();
        this.f22516a++;
    }
}
