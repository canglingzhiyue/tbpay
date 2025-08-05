package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import tb.kge;

/* loaded from: classes9.dex */
public interface d extends g {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1421095217);
        }

        public static void a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cec74a9", new Object[]{dVar});
            } else {
                g.a.a(dVar);
            }
        }
    }

    void a();

    com.taobao.monitor.procedure.g b();
}
