package com.taobao.themis.kernel.container.ui.titlebar;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.List;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes9.dex */
public interface d {
    void a();

    void a(List<? extends a> list);

    void b();

    void c();

    void e();

    /* loaded from: classes9.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final f f22509a;
        private final ITMSPage b;

        static {
            kge.a(-287555120);
        }

        public abstract int a();

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        public abstract Object d();

        public a(ITMSPage mPage) {
            q.d(mPage, "mPage");
            this.b = mPage;
            this.f22509a = this.b.b();
        }

        public final ITMSPage e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("41fa7495", new Object[]{this}) : this.b;
        }

        public final f b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("db03aa12", new Object[]{this}) : this.f22509a;
        }
    }
}
