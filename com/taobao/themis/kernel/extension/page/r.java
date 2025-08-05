package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.bj;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.extension.page.s;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.kge;

/* loaded from: classes9.dex */
public interface r extends g, s.c {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1807118955);
        }

        public static void a(r rVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41c54886", new Object[]{rVar, page});
                return;
            }
            kotlin.jvm.internal.q.d(page, "page");
            g.a.a(rVar, page);
        }

        public static void b(r rVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6bd73ba", new Object[]{rVar});
            } else {
                g.a.a(rVar);
            }
        }

        public static void c(r rVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0881599", new Object[]{rVar});
            } else {
                g.a.c(rVar);
            }
        }
    }

    void a();

    void a(bj bjVar);
}
