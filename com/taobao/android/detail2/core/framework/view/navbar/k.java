package com.taobao.android.detail2.core.framework.view.navbar;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.navbar.f;
import tb.fjt;
import tb.fkc;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public class k extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1009030604);
    }

    public k(View view, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
        super(view, fmdVar, bVar);
    }

    @Override // com.taobao.android.detail2.core.framework.view.navbar.f
    public f.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f.a) ipChange.ipc$dispatch("b754202b", new Object[]{this}) : new a();
    }

    /* loaded from: classes5.dex */
    public class a extends f.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1297478366);
        }

        private a() {
            super();
        }

        @Override // com.taobao.android.detail2.core.framework.view.navbar.f.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else if (k.this.c == null || k.this.c.c() == null) {
            } else {
                try {
                    fkc.a(k.this.c.c().getJSONArray("events"), k.this.b);
                } catch (Exception e) {
                    fjt.a("new_detail异常", "转发按钮点击处理异常", e);
                }
            }
        }
    }

    public static g a(ViewGroup viewGroup, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("232f9dc4", new Object[]{viewGroup, fmdVar, bVar}) : new k(a(viewGroup.getContext(), viewGroup), fmdVar, bVar);
    }
}
