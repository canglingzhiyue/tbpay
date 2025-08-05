package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.kge;

/* loaded from: classes9.dex */
public interface ab extends g {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-421065340);
        }

        public static void a(ab abVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3089d2e2", new Object[]{abVar});
            } else {
                g.a.a(abVar);
            }
        }

        public static void a(ab abVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dae8768d", new Object[]{abVar, page});
                return;
            }
            kotlin.jvm.internal.q.d(page, "page");
            g.a.a(abVar, page);
        }

        public static void b(ab abVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30136ce3", new Object[]{abVar});
            } else {
                g.a.c(abVar);
            }
        }
    }

    void d();
}
