package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.g;
import tb.kge;

/* loaded from: classes9.dex */
public interface e extends g {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(962350949);
        }

        public static void a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cece908", new Object[]{eVar});
            } else {
                g.a.a(eVar);
            }
        }
    }

    String a();

    void a(String str);
}
