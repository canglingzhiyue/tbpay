package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.kge;

/* loaded from: classes9.dex */
public interface g {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1549885083);
        }

        public static void a(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cedd1c6", new Object[]{gVar});
            }
        }

        public static void a(g gVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e19cc171", new Object[]{gVar, page});
            } else {
                kotlin.jvm.internal.q.d(page, "page");
            }
        }

        public static void c(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0831584", new Object[]{gVar});
            }
        }
    }

    void c();

    void c_(ITMSPage iTMSPage);

    void i();
}
