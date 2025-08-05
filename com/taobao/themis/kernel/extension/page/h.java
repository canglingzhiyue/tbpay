package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.extension.page.g;
import tb.kge;

/* loaded from: classes9.dex */
public interface h extends g {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1579234672);
        }

        public static void a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cee4625", new Object[]{hVar});
            } else {
                g.a.a(hVar);
            }
        }
    }

    IShareAdapter.a a();

    void a(IShareAdapter.a aVar);

    void b();
}
