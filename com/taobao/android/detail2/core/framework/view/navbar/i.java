package com.taobao.android.detail2.core.framework.view.navbar;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.navbar.f;
import com.taobao.android.t;
import java.util.HashMap;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public class i extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1134745859);
    }

    public i(View view, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
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
            kge.a(877591170);
        }

        private a() {
            super();
        }

        @Override // com.taobao.android.detail2.core.framework.view.navbar.f.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else if (i.this.c == null || i.this.c.d() == null) {
            } else {
                String string = i.this.c.d().getString("url");
                if (StringUtils.isEmpty(string)) {
                    return;
                }
                if (i.this.c.g() != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", string);
                    i.this.b.y().a(i.this.c.g().g, "NavigationCart", "", "", hashMap, i.this.c.g());
                }
                t.a().a(i.this.f11641a.g()).a(string);
            }
        }
    }

    public static g a(ViewGroup viewGroup, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("232f9dc4", new Object[]{viewGroup, fmdVar, bVar}) : new i(a(viewGroup.getContext(), viewGroup), fmdVar, bVar);
    }
}
