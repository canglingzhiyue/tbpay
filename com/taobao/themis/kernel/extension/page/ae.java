package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.kge;

/* loaded from: classes9.dex */
public interface ae extends g {
    public static final a Companion = a.f22515a;

    /* loaded from: classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(196094972);
        }

        public static void a(ae aeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("308b2fff", new Object[]{aeVar});
            } else {
                g.a.a(aeVar);
            }
        }

        public static void a(ae aeVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23adb2aa", new Object[]{aeVar, page});
                return;
            }
            kotlin.jvm.internal.q.d(page, "page");
            g.a.a(aeVar, page);
        }
    }

    ITMSPage b();

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f22515a;

        static {
            kge.a(-1543709726);
            f22515a = new a();
        }

        private a() {
        }

        public final ITMSPage a(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITMSPage) ipChange.ipc$dispatch("7030ef0e", new Object[]{this, page});
            }
            kotlin.jvm.internal.q.d(page, "page");
            while (true) {
                if ((page != null ? (ae) page.a(ae.class) : null) == null) {
                    return page;
                }
                ae aeVar = (ae) page.a(ae.class);
                page = aeVar != null ? aeVar.b() : null;
            }
        }
    }
}
