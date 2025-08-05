package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.u;
import tb.ane;
import tb.hhs;
import tb.hiq;
import tb.his;
import tb.kge;

/* loaded from: classes5.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f13804a;
    private boolean b;
    private Handler c;
    private com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.i d = new com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.i(null);
    private com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c e;

    static {
        kge.a(-862799690);
    }

    public static /* synthetic */ void a(l lVar, FrameLayout frameLayout, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea5de87", new Object[]{lVar, frameLayout, liveItem});
        } else {
            lVar.b(frameLayout, liveItem);
        }
    }

    public static /* synthetic */ void a(l lVar, FrameLayout frameLayout, LiveItem liveItem, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899b42cb", new Object[]{lVar, frameLayout, liveItem, kVar});
        } else {
            lVar.b(frameLayout, liveItem, kVar);
        }
    }

    public l(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, Context context, boolean z) {
        this.f13804a = context;
        this.e = cVar;
        this.b = z;
        this.d.a(cVar);
        this.c = new Handler(Looper.getMainLooper());
    }

    private String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b ? "taolive_goods_showcase_pcg" : com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(this.e) ? "taolive_gl_item_showcase3" : "taolive_gl_item_showcase2";
    }

    public void a(final FrameLayout frameLayout, final LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec23f2c6", new Object[]{this, frameLayout, liveItem});
        } else if (u.aU() && com.taobao.taolive.sdk.utils.p.a("enableBanShowShowCase", false)) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar = this.e;
            if (cVar != null && cVar.C() != null && this.e.C().R() != null) {
                this.e.C().R().a("hasShowShowCase", "true");
            }
            if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a()) {
                this.c.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.l.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            l.a(l.this, frameLayout, liveItem);
                        }
                    }
                });
            } else {
                b(frameLayout, liveItem);
            }
        }
    }

    private void b(FrameLayout frameLayout, LiveItem liveItem) {
        DXRootView b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34cd507", new Object[]{this, frameLayout, liveItem});
            return;
        }
        liveItem.nativeConfigInfos.put("enableNewHotSaleAtmosphere", (Object) true);
        String a2 = a();
        if (frameLayout.getChildAt(0) instanceof DXRootView) {
            DXRootView dXRootView = (DXRootView) frameLayout.getChildAt(0);
            if (a2.equals(dXRootView.getDxTemplateItem().f11925a)) {
                DXRootView dXRootView2 = (DXRootView) frameLayout.getChildAt(0);
                hhs.a().a(dXRootView2, a(liveItem), this.e);
                hhs.a().b(dXRootView2);
                return;
            }
            this.e.C().z().K().a(new ane(dXRootView));
            frameLayout.removeAllViews();
        }
        ane a3 = this.e.C().z().K().a(a2.hashCode());
        if (a3 != null) {
            b = a3.a();
        } else {
            b = hhs.a().b(this.f13804a, a2);
        }
        if (b == null) {
            his.b("ShowcaseRenderCommon", "renderNormalCard | empty. templateName=" + a2);
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.addView(b);
        hhs.a().a(b, a(liveItem), this.e);
        hhs.a().b(b);
    }

    public void a(final FrameLayout frameLayout, final LiveItem liveItem, final k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44322e6c", new Object[]{this, frameLayout, liveItem, kVar});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a()) {
            this.c.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.showcase.l.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        l.a(l.this, frameLayout, liveItem, kVar);
                    }
                }
            });
        } else {
            b(frameLayout, liveItem, kVar);
        }
    }

    private void b(FrameLayout frameLayout, LiveItem liveItem, k kVar) {
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e471c4b", new Object[]{this, frameLayout, liveItem, kVar});
        } else if (frameLayout == null || frameLayout.getChildCount() <= 0) {
        } else {
            liveItem.nativeConfigInfos.put("enableNewHotSaleAtmosphere", (Object) true);
            View childAt = frameLayout.getChildAt(0);
            if (!(childAt instanceof DXRootView)) {
                return;
            }
            DXRootView dXRootView = (DXRootView) childAt;
            DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
            DXWidgetNode dXWidgetNode2 = null;
            if (expandWidgetNode != null) {
                dXWidgetNode2 = expandWidgetNode.queryWidgetNodeByUserId("good_content");
                dXWidgetNode = expandWidgetNode.queryWidgetNodeByUserId("good_atmosphere_content");
            } else {
                dXWidgetNode = null;
            }
            if (kVar != null && kVar.c != null && hiq.h(kVar.c) != hiq.h(liveItem)) {
                z = true;
            }
            if (dXWidgetNode2 == null || z) {
                hhs.a().a(dXRootView, a(liveItem), this.e);
                hhs.a().b(dXRootView);
                return;
            }
            a(dXRootView, liveItem);
            hhs.a().a(dXWidgetNode2);
            if (dXWidgetNode != null) {
                hhs.a().a(dXWidgetNode);
            }
            hhs.a().b(dXRootView);
        }
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else if (viewGroup == null || viewGroup.getChildCount() <= 0) {
        } else {
            View childAt = viewGroup.getChildAt(0);
            if (!(childAt instanceof DXRootView)) {
                return;
            }
            DXRootView dXRootView = (DXRootView) childAt;
            this.e.C().z().K().a(new ane(dXRootView));
            viewGroup.removeAllViews();
            hhs.a().a(dXRootView);
        }
    }

    private JSONObject a(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b82707a3", new Object[]{this, liveItem});
        }
        JSONObject parseJsonObject = liveItem.parseJsonObject();
        this.d.a(this.e, parseJsonObject, false, true);
        return parseJsonObject;
    }

    private void a(DXRootView dXRootView, LiveItem liveItem) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63235c44", new Object[]{this, dXRootView, liveItem});
        } else if (dXRootView == null || (data = dXRootView.getData()) == null) {
        } else {
            data.clear();
            data.putAll(a(liveItem));
        }
    }
}
