package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.kge;

/* loaded from: classes9.dex */
public interface z extends g {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(498016315);
        }

        public static void a(z zVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cf674d3", new Object[]{zVar});
            } else {
                g.a.a(zVar);
            }
        }

        public static void a(z zVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5928937e", new Object[]{zVar, page});
                return;
            }
            kotlin.jvm.internal.q.d(page, "page");
            g.a.a(zVar, page);
        }

        public static void b(z zVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6c116b2", new Object[]{zVar});
            } else {
                g.a.c(zVar);
            }
        }
    }

    void a(String str);

    void a(boolean z);
}
