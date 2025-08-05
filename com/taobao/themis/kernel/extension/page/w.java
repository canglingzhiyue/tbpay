package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.extension.page.g;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.kge;

/* loaded from: classes9.dex */
public interface w extends g {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-483305215);
        }

        public static void a(w wVar, ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10635761", new Object[]{wVar, page});
                return;
            }
            kotlin.jvm.internal.q.d(page, "page");
            g.a.a(wVar, page);
        }

        public static void b(w wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6bfb995", new Object[]{wVar});
            } else {
                g.a.a(wVar);
            }
        }

        public static void c(w wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e08a5b74", new Object[]{wVar});
            } else {
                g.a.c(wVar);
            }
        }
    }

    void a(Window.Orientation orientation);
}
