package com.taobao.android.detail2.core.framework.view.navbar;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.navbar.b;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import tb.fhi;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TIconFontTextView d;

    static {
        kge.a(1889858040);
    }

    public d(View view, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
        super(view, fmdVar, bVar);
        this.d = (TIconFontTextView) view.findViewById(R.id.nav_icon);
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.data.model.d g = this.c.g();
        if (!(g instanceof fhi)) {
            return;
        }
        b bVar = new b(this.f11641a, this.b, (fhi) g, this.d, this.c.c(), -16777216);
        if (!bVar.a()) {
            return;
        }
        bVar.a(new b.a() { // from class: com.taobao.android.detail2.core.framework.view.navbar.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail2.core.framework.view.navbar.b.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    return;
                }
                d dVar = d.this;
                dVar.d(dVar.c);
            }
        });
    }

    @Override // com.taobao.android.detail2.core.framework.view.navbar.g
    public void a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2441c2", new Object[]{this, lVar});
            return;
        }
        this.d.setText(lVar.e());
        this.d.setTextColor(lVar.b());
    }

    public static g a(ViewGroup viewGroup, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("232f9dc4", new Object[]{viewGroup, fmdVar, bVar}) : new d(b(viewGroup.getContext(), viewGroup), fmdVar, bVar);
    }
}
