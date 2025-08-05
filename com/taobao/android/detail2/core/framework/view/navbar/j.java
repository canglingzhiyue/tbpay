package com.taobao.android.detail2.core.framework.view.navbar;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.navbar.f;
import com.taobao.android.trade.event.Event;
import java.util.HashMap;
import java.util.List;
import tb.fin;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public class j extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1330374483);
    }

    public j(View view, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
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
            kge.a(-1728855840);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private a() {
            super();
        }

        @Override // com.taobao.android.detail2.core.framework.view.navbar.f.a
        public void a(View view) {
            List<Event> a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else if (j.this.c != null && j.this.c.g() != null && j.this.c.g().I != null && (a2 = fin.a(j.this.c.g().I.getJSONArray("shareAction"))) != null) {
                for (Event event : a2) {
                    com.taobao.android.trade.event.f.a(j.this.f11641a.g(), event);
                }
                a();
            }
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            if (j.this.c == null || j.this.c.g() == null) {
                return;
            }
            j.this.b.y().a(j.this.c.g().g, "Navigation_Share", "", "", hashMap, j.this.c.g());
        }
    }

    public static g a(ViewGroup viewGroup, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("232f9dc4", new Object[]{viewGroup, fmdVar, bVar}) : new j(a(viewGroup.getContext(), viewGroup), fmdVar, bVar);
    }
}
