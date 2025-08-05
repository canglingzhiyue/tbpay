package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import tb.kge;

/* loaded from: classes9.dex */
public interface j extends g {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(619041087);
        }

        public static void a(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cef2ee3", new Object[]{jVar});
            } else {
                g.a.a(jVar);
            }
        }
    }

    boolean a();

    void b();
}
