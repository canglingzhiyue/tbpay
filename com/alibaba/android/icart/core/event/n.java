package com.alibaba.android.icart.core.event;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.bby;
import tb.bca;
import tb.bcb;
import tb.bei;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class n extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView.OnScrollListener c;
    private RecyclerView.OnItemTouchListener k;
    private boolean l;
    private float m;
    private float n;
    private bby.b o;

    static {
        kge.a(573786201);
    }

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ float a(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("87b26777", new Object[]{nVar})).floatValue() : nVar.n;
    }

    public static /* synthetic */ float a(n nVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e9af109", new Object[]{nVar, new Float(f)})).floatValue();
        }
        nVar.m = f;
        return f;
    }

    public static /* synthetic */ void a(n nVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e9b3c2d", new Object[]{nVar, new Boolean(z)});
        } else {
            nVar.a(z);
        }
    }

    public static /* synthetic */ float b(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("225329f8", new Object[]{nVar})).floatValue() : nVar.m;
    }

    public static /* synthetic */ float b(n nVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28127ea8", new Object[]{nVar, new Float(f)})).floatValue();
        }
        nVar.n = f;
        return f;
    }

    public static /* synthetic */ boolean b(n nVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2812c9d0", new Object[]{nVar, new Boolean(z)})).booleanValue();
        }
        nVar.l = z;
        return z;
    }

    public static /* synthetic */ bcb c(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("1c11f9bc", new Object[]{nVar}) : nVar.b;
    }

    public static /* synthetic */ RecyclerView.OnItemTouchListener d(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnItemTouchListener) ipChange.ipc$dispatch("35451abd", new Object[]{nVar}) : nVar.k;
    }

    public static /* synthetic */ RecyclerView.OnScrollListener e(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("12a45d39", new Object[]{nVar}) : nVar.c;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
        } else if (this.h != null) {
            DataBizContext o = this.b.o();
            DataBizContext.CartGroupContext cartGroupContext = new DataBizContext.CartGroupContext();
            o.a(cartGroupContext);
            for (com.taobao.android.ultron.common.model.b bVar : (List) bmzVar.b("events")) {
                if (TextUtils.equals(bVar.getType(), "popupQuery")) {
                    cartGroupContext.setDefaultFilterItem(bVar.getFields().getString("filterItem"));
                } else if (TextUtils.equals(bVar.getType(), "openPopupWindow")) {
                    for (IDMComponent iDMComponent : bei.a(this.b, bVar)) {
                        if (TextUtils.equals("groupRecommendTab", iDMComponent.getTag())) {
                            o.a(iDMComponent.getKey()).a(0);
                            iDMComponent.getData().put("status", (Object) "hidden");
                        } else if (TextUtils.equals("groupExtendBody", iDMComponent.getTag())) {
                            iDMComponent.getFields().clear();
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if ("bundleHeader".equals(this.h.getTag())) {
                ArrayList<IDMComponent> arrayList2 = new ArrayList();
                bei.a(arrayList2, bei.k(this.h));
                for (IDMComponent iDMComponent2 : arrayList2) {
                    if ("item".equals(iDMComponent2.getTag())) {
                        arrayList.add(iDMComponent2.getKey());
                    }
                }
                cartGroupContext.setName(this.h.getFields().getString("title"));
                Object obj = this.h.getExtMap().get("type");
                cartGroupContext.setType(obj instanceof Integer ? Integer.parseInt(obj.toString()) : 1);
            } else {
                if ("empty".equals(this.h.getTag())) {
                    cartGroupContext.setType(2);
                }
                cartGroupContext.setName(com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21668));
            }
            cartGroupContext.setTriggerComponentKey(this.h.getKey());
            cartGroupContext.setItems(arrayList);
            cartGroupContext.setIsExpanded(true);
            cartGroupContext.setIsRecommendTitleShow(true);
            f();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        bby d = this.f25791a.x().d();
        final RecyclerView a2 = d.a();
        if (this.c == null) {
            this.c = new RecyclerView.OnScrollListener() { // from class: com.alibaba.android.icart.core.event.n.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    } else if (((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition() > 1 || n.a(n.this) <= 0.0f) {
                    } else {
                        n.a(n.this, true);
                    }
                }
            };
        }
        if (this.k == null) {
            this.k = new RecyclerView.OnItemTouchListener() { // from class: com.alibaba.android.icart.core.event.n.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
                public void onRequestDisallowInterceptTouchEvent(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c1dcb2bb", new Object[]{this, new Boolean(z)});
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
                public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("62dd1ae4", new Object[]{this, recyclerView, motionEvent});
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
                public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("e16b42ac", new Object[]{this, recyclerView, motionEvent})).booleanValue();
                    }
                    if (motionEvent.getAction() == 0) {
                        n.a(n.this, motionEvent.getRawY());
                    }
                    n.b(n.this, motionEvent.getRawY() - n.b(n.this));
                    DataBizContext.CartGroupContext d2 = n.c(n.this).o().d();
                    if (n.a(n.this) < 0.0f && d2 != null) {
                        n.a(n.this, false);
                    }
                    return false;
                }
            };
        }
        if (this.o == null) {
            this.o = new bby.b() { // from class: com.alibaba.android.icart.core.event.n.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bby.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    }
                }

                @Override // tb.bby.b
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    a2.removeOnItemTouchListener(n.d(n.this));
                    a2.removeOnScrollListener(n.e(n.this));
                    n.b(n.this, false);
                }
            };
        }
        if (this.l) {
            return;
        }
        a2.addOnScrollListener(this.c);
        a2.addOnItemTouchListener(this.k);
        d.a(this.o);
        this.l = true;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        DataBizContext.CartGroupContext d = this.b.o().d();
        if (d.getIsRecommendTitleShow() != z) {
            d.setIsRecommendTitleShow(z);
            z2 = true;
        }
        if (!d.isHandleExpanded() && d.getIsExpanded() != z) {
            d.setIsExpanded(z);
            z2 = true;
        }
        if (!z2) {
            return;
        }
        this.f25791a.x().d().a(1);
    }
}
