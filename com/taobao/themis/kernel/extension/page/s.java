package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.kge;

/* loaded from: classes9.dex */
public interface s extends g {
    public static final a Companion = a.f22525a;
    public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_DEFAULT = 1;
    public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_LEGACY_API = 8;
    public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_PUB = 2;
    public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_SINGLE_WEB = 9;
    public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_SINGLE_WEEX = 9;
    public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_UNI_API = 10;

    /* loaded from: classes9.dex */
    public static final class a {
        public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_DEFAULT = 1;
        public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_LEGACY_API = 8;
        public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_PUB = 2;
        public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_SINGLE_WEB = 9;
        public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_SINGLE_WEEX = 9;
        public static final int PAGE_CLOSE_INTERCEPTOR_PRIORITY_UNI_API = 10;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f22525a;

        static {
            kge.a(-257809596);
            f22525a = new a();
        }

        private a() {
        }
    }

    /* loaded from: classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1633554778);
        }

        public static void a(s sVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b1b1e5", new Object[]{sVar, page});
                return;
            }
            kotlin.jvm.internal.q.d(page, "page");
            g.a.a(sVar, page);
        }

        public static void b(s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6bde819", new Object[]{sVar});
            } else {
                g.a.a(sVar);
            }
        }

        public static void c(s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e08889f8", new Object[]{sVar});
            } else {
                g.a.c(sVar);
            }
        }
    }

    /* loaded from: classes9.dex */
    public interface c {
        boolean a(ITMSPage iTMSPage, TMSBackPressedType tMSBackPressedType);

        int b();
    }

    void a(c cVar);

    boolean a(TMSBackPressedType tMSBackPressedType);

    void b(c cVar);
}
