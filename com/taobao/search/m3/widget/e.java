package com.taobao.search.m3.widget;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
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
public final class e extends com.taobao.search.m3.widget.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final itb.a e;

    /* renamed from: a  reason: collision with root package name */
    private final M3ListContainer f19156a;

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
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
    public e(View itemView, Activity activity, ium parent, ListStyle style, int i, iru<com.taobao.search.sf.datasource.c> iruVar) {
        super(itemView, activity, parent, style, i, iruVar);
        q.c(itemView, "itemView");
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(style, "style");
        this.f19156a = (M3ListContainer) itemView;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(933877672);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final itb.a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (itb.a) ipChange.ipc$dispatch("65fb974a", new Object[]{this}) : e.F();
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

        public final e b(itb.b bVar) {
            M3ListContainer m3ListContainer;
            ipj d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("2503fa86", new Object[]{this, bVar});
            }
            Activity activity = bVar.f29303a;
            if (!(activity instanceof ipk)) {
                activity = null;
            }
            ipk ipkVar = (ipk) activity;
            if (ipkVar == null || (d = ipkVar.d()) == null || (m3ListContainer = d.e()) == null) {
                Activity activity2 = bVar.f29303a;
                q.a((Object) activity2, "it.activity");
                m3ListContainer = new M3ListContainer(activity2);
            }
            Activity activity3 = bVar.f29303a;
            q.a((Object) activity3, "it.activity");
            ium iumVar = bVar.b;
            q.a((Object) iumVar, "it.parent");
            ListStyle listStyle = bVar.d;
            q.a((Object) listStyle, "it.listStyle");
            return new e(m3ListContainer, activity3, iumVar, listStyle, bVar.e, (iru) bVar.f);
        }
    }

    static {
        kge.a(-1260133280);
        Companion = new a(null);
        e = b.INSTANCE;
    }

    @Override // com.taobao.search.m3.widget.b
    public void a(int i, M3CellBean bean, TbSearchStyle tbSearchStyle) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce0d763", new Object[]{this, new Integer(i), bean, tbSearchStyle});
            return;
        }
        q.c(bean, "bean");
        this.f19156a.start();
        M3ListContainer m3ListContainer = this.f19156a;
        m3ListContainer.updateItemImage(bean, m3ListContainer.updateVideo(bean, this, tbSearchStyle), tbSearchStyle);
        this.f19156a.updateTitle(bean, tbSearchStyle);
        if (tbSearchStyle != null && tbSearchStyle.isTb2024) {
            z = true;
        }
        if (!this.f19156a.updateFlashSale(bean, z) && !this.f19156a.updateDiscount(bean, z) && !bean.getUspBottom()) {
            b(bean, z);
        }
        if (bean.getListMergeLocToPrice() == 1) {
            this.f19156a.updateIcons(bean, bean.getListIconInTop(), false, this, z);
        }
        this.f19156a.updatePrice(bean, z);
        if (bean.getListMergeLocToPrice() != 1) {
            this.f19156a.updateIcons(bean, false, true, this, z);
        }
        if (bean.getUspBottom()) {
            a(bean, z);
        }
        this.f19156a.updateShopInfo(bean, this, z);
        if (!bean.getUspBottom()) {
            a(bean, z);
        }
        if (bean.getUspBottom()) {
            b(bean, z);
        } else {
            this.f19156a.updateBottomTag(bean, this, z);
        }
        com.taobao.search.m3.feedback.a feedback = bean.getFeedback();
        if (feedback == null || !feedback.b()) {
            return;
        }
        this.f19156a.updateFeedback(bean, this, tbSearchStyle, g(bean));
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
