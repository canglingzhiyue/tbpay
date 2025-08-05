package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.kge;

/* loaded from: classes9.dex */
public interface n extends g {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1769301797);
        }

        public static void a(n nVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3613a30a", new Object[]{nVar, page});
                return;
            }
            kotlin.jvm.internal.q.d(page, "page");
            g.a.a(nVar, page);
        }

        public static void b(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6bba23e", new Object[]{nVar});
            } else {
                g.a.a(nVar);
            }
        }

        public static void c(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e086441d", new Object[]{nVar});
            } else {
                g.a.c(nVar);
            }
        }
    }

    ITMSPage a();
}
