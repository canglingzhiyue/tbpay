package com.taobao.android.icart.event;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bby;
import tb.bbz;
import tb.bca;
import tb.bdx;
import tb.beb;
import tb.bex;
import tb.bmz;
import tb.dtg;
import tb.jny;
import tb.jqi;
import tb.kge;

/* loaded from: classes5.dex */
public class k extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE_SWITCH_QUANTITY = "switchQuantity";
    private RecyclerView.OnScrollListener c;
    private List<String> k = new ArrayList();

    static {
        kge.a(1168488867);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ List a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b75bca0d", new Object[]{kVar}) : kVar.k;
    }

    public static /* synthetic */ bbz b(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("7b530cf1", new Object[]{kVar}) : kVar.f25791a;
    }

    public static /* synthetic */ boolean c(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4af02380", new Object[]{kVar})).booleanValue() : kVar.g();
    }

    public static /* synthetic */ bbz d(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("ee42282f", new Object[]{kVar}) : kVar.f25791a;
    }

    public static /* synthetic */ bbz e(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("a7b9b5ce", new Object[]{kVar}) : kVar.f25791a;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bdx.a(bmzVar);
        if (bmzVar == null || (objArr = (Object[]) bmzVar.b("extraParams")) == null || objArr.length < 2) {
            return;
        }
        String valueOf = String.valueOf(objArr[1]);
        if (StringUtils.isEmpty(valueOf)) {
            return;
        }
        this.h.getFields().put("showQuantity", (Object) valueOf);
        this.f25791a.x().n();
        this.k.add(this.h.getKey());
        f();
        bbz bbzVar = this.f25791a;
        IDMComponent iDMComponent = this.h;
        bbz bbzVar2 = this.f25791a;
        bex.a(bbzVar, "Page_ShoppingCart_Item_SwitchQuantity", beb.a(iDMComponent, bbzVar2, "showQuantity=" + valueOf));
        h();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        Object b = this.d.b("triggerView");
        if (!(b instanceof DXRootView)) {
            return;
        }
        final DXRootView dXRootView = (DXRootView) b;
        dXRootView.post(new Runnable() { // from class: com.taobao.android.icart.event.k.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                DXWidgetNode queryWidgetNodeByUserId = dXRootView.getFlattenWidgetNode().queryWidgetNodeByUserId(dtg.WIDGET_NAME);
                if (queryWidgetNodeByUserId == null || queryWidgetNodeByUserId.getDXRuntimeContext() == null) {
                    return;
                }
                queryWidgetNodeByUserId.getDXRuntimeContext().v().sendAccessibilityEvent(128);
            }
        });
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.c != null) {
        } else {
            this.c = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.icart.event.k.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == 2142696127) {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    jny H;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (1 != i || k.a(k.this).size() <= 0 || (H = k.b(k.this).H()) == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = k.a(k.this).iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        IDMComponent b = H.b((String) it.next());
                        if (b != null) {
                            arrayList.add(b);
                            JSONObject fields = b.getFields();
                            if (fields != null && "true".equals(fields.get("showQuantity"))) {
                                fields.put("showQuantity", (Object) false);
                                z = true;
                            }
                            it.remove();
                        }
                    }
                    if (!z) {
                        return;
                    }
                    if (k.c(k.this)) {
                        k.d(k.this).x().b(2);
                    } else {
                        k.e(k.this).x().c(arrayList);
                    }
                }
            };
            ((RecyclerView) this.f25791a.x().s()).addOnScrollListener(this.c);
            bby d = this.f25791a.x().d();
            if (d == null || d.a() == null) {
                return;
            }
            d.a().addOnScrollListener(this.c);
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : jqi.a("iCart", "refreshAllWhenChangeQuantity", false);
    }
}
