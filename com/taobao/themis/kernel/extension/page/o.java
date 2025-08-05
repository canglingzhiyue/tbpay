package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.kge;

/* loaded from: classes9.dex */
public interface o extends g {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-916069391);
        }

        public static void a(o oVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9000c69", new Object[]{oVar, page});
                return;
            }
            kotlin.jvm.internal.q.d(page, "page");
            g.a.a(oVar, page);
        }

        public static void b(o oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6bc169d", new Object[]{oVar});
            } else {
                g.a.a(oVar);
            }
        }

        public static void c(o oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e086b87c", new Object[]{oVar});
            } else {
                g.a.c(oVar);
            }
        }
    }

    void a(boolean z);

    boolean a();
}
