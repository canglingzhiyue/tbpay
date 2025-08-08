package com.taobao.search.m3.widget;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.m3.M3CellBean;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.ipj;
import tb.ipk;
import tb.iru;
import tb.itb;
import tb.itd;
import tb.ium;
import tb.kge;

/* loaded from: classes7.dex */
public final class f extends com.taobao.search.m3.widget.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final itb.a e;

    /* renamed from: a  reason: collision with root package name */
    private final M3WfContainer f19157a;

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == 113156224) {
            super.y();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.search.m3.widget.b, tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "M3WfCellWidget";
    }

    public static final /* synthetic */ itb.a F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itb.a) ipChange.ipc$dispatch("93975385", new Object[0]) : e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View itemView, Activity activity, ium parent, ListStyle style, int i, iru<com.taobao.search.sf.datasource.c> iruVar) {
        super(itemView, activity, parent, style, i, iruVar);
        q.c(itemView, "itemView");
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(style, "style");
        this.f19157a = (M3WfContainer) itemView;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(379746905);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final itb.a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (itb.a) ipChange.ipc$dispatch("65fb974a", new Object[]{this}) : f.F();
        }
    }

    /* loaded from: classes7.dex */
    public static final class b implements itb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // tb.ise
        public /* synthetic */ itd a(itb.b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("f42f608a", new Object[]{this, bVar}) : b(bVar);
        }

        public final f b(itb.b bVar) {
            M3WfContainer m3WfContainer;
            ipj d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("2503faa5", new Object[]{this, bVar});
            }
            Activity activity = bVar.f29303a;
            if (!(activity instanceof ipk)) {
                activity = null;
            }
            ipk ipkVar = (ipk) activity;
            if (ipkVar == null || (d = ipkVar.d()) == null || (m3WfContainer = d.d()) == null) {
                Activity activity2 = bVar.f29303a;
                q.a((Object) activity2, "it.activity");
                m3WfContainer = new M3WfContainer(activity2);
            }
            Activity activity3 = bVar.f29303a;
            q.a((Object) activity3, "it.activity");
            ium iumVar = bVar.b;
            q.a((Object) iumVar, "it.parent");
            ListStyle listStyle = bVar.d;
            q.a((Object) listStyle, "it.listStyle");
            return new f(m3WfContainer, activity3, iumVar, listStyle, bVar.e, (iru) bVar.f);
        }
    }

    static {
        kge.a(-935985071);
        Companion = new a(null);
        e = b.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    @Override // com.taobao.search.m3.widget.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r11, com.taobao.search.m3.M3CellBean r12, com.taobao.search.searchdoor.sf.config.TbSearchStyle r13) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.m3.widget.f.a(int, com.taobao.search.m3.M3CellBean, com.taobao.search.searchdoor.sf.config.TbSearchStyle):void");
    }

    @Override // com.taobao.search.m3.widget.b
    public String d(M3CellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ba33f57", new Object[]{this, bean});
        }
        q.c(bean, "bean");
        return bean.getWfRatioOrigin();
    }

    @Override // com.taobao.search.m3.widget.b
    public String b(M3CellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fa94d5", new Object[]{this, bean});
        }
        q.c(bean, "bean");
        if (!StringUtils.isEmpty(bean.getUprightImage())) {
            return bean.getUprightImage();
        }
        return bean.getPicPath();
    }

    @Override // com.taobao.search.m3.widget.b
    public boolean g(M3CellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("472aca4a", new Object[]{this, bean})).booleanValue();
        }
        q.c(bean, "bean");
        return c(bean) && Math.abs(bean.getWfRatio() - 1.0f) >= 1.0E-6f;
    }

    @Override // com.taobao.search.m3.widget.b
    public boolean c(M3CellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1e057ce", new Object[]{this, bean})).booleanValue();
        }
        q.c(bean, "bean");
        return !StringUtils.isEmpty(bean.getUprightImage());
    }

    @Override // com.taobao.search.m3.widget.b, tb.itd
    public void y() {
        ipj d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        super.y();
        Activity activity = getActivity();
        if (!(activity instanceof ipk)) {
            activity = null;
        }
        ipk ipkVar = (ipk) activity;
        if (ipkVar == null || (d = ipkVar.d()) == null) {
            return;
        }
        d.a(this.itemView);
    }
}
