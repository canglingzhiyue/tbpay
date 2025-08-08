package com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.tab.GoodsMultiTabManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Iterator;
import java.util.List;
import tb.afs;
import tb.ddw;
import tb.hgu;
import tb.hir;
import tb.his;
import tb.hit;
import tb.iao;
import tb.kge;
import tb.xkw;

/* loaded from: classes5.dex */
public class e extends com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b<c, d> implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BroadcastReceiver e;
    private boolean f;
    private boolean g;
    private com.taobao.android.live.plugin.atype.flexalocal.good.tab.c h;
    public boolean i;
    public BroadcastReceiver j;

    static {
        kge.a(-961390204);
        kge.a(-1438463071);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b520e9", new Object[]{eVar});
        } else {
            eVar.d();
        }
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) ipChange.ipc$dispatch("2a7f8293", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) ipChange.ipc$dispatch("6ad803b2", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) ipChange.ipc$dispatch("ab3084d1", new Object[]{eVar}) : eVar.d;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.d, tb.hgu] */
    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b
    public /* synthetic */ d bL_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgu) ipChange.ipc$dispatch("456f4ef4", new Object[]{this}) : c();
    }

    public e(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        super(cVar);
        this.f = false;
        this.g = false;
        this.e = new BroadcastReceiver() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.GoodsViewPresenter$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                his.b("GoodsViewPresenter", iao.NEXT_TAG_RECEIVER);
                e.a(e.this);
            }
        };
        this.j = new BroadcastReceiver() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.GoodsViewPresenter$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                his.b("GoodsViewPresenter", "mBagCloseBroadcastReceiver");
                if (e.b(e.this) == null || e.c(e.this).C() == null) {
                    return;
                }
                ddw.a().a(xkw.EVENT_SHOW_GOODSPACKAGE_DISMISS, null, e.d(e.this).C().G());
            }
        };
        this.f = hir.i();
        this.g = hir.h();
        if (cVar == null || cVar.f() == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("TBLiveWVPlugin.Event.container.close");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.d.f()).registerReceiver(this.e, intentFilter);
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("TradePay.Event.livebag.close");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.d.f()).registerReceiver(this.j, intentFilter);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.tab.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d00574", new Object[]{this, cVar});
        } else {
            this.h = cVar;
        }
    }

    public d c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("457dda8e", new Object[]{this}) : new d(this.d);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.g
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            ((c) this.f13751a).a(i);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        his.b("GoodsViewPresenter", "refreshHeaderAndCategory | defaultCategoryId=");
        ((d) this.b).a(false);
        ((d) this.b).b();
    }

    public void g() {
        GoodsMultiTabManager.NativeDXTabBundle a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        d();
        com.taobao.android.live.plugin.atype.flexalocal.good.tab.c cVar = this.h;
        if (cVar == null || (a2 = cVar.a()) == null || a2.stateMultiTabView == null) {
            return;
        }
        a2.stateMultiTabView.resume();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!((c) this.f13751a).k()) {
            his.b("GoodsViewPresenter", "refreshHeaderOnly | list is not show.");
        } else {
            if (this.f) {
                his.b("GoodsViewPresenter", "refreshHeaderOnly | topOperate.");
                ((d) this.b).b();
            }
            if (!this.g) {
                return;
            }
            his.b("GoodsViewPresenter", "refreshHeaderOnly | category.");
            ((d) this.b).a(true);
        }
    }

    public void a(LiveItemCategoriesResponseData liveItemCategoriesResponseData, JSONObject jSONObject, String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc0864a3", new Object[]{this, liveItemCategoriesResponseData, jSONObject, str, list});
            return;
        }
        his.a("GoodsViewPresenter", "handleCategoriesData ｜ excludeCategory=");
        if (this.d.c.i) {
            int a2 = com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.d.a(this.d.R);
            int a3 = com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.d.a(jSONObject, a2, this.i);
            his.a("GoodsViewPresenter", "handleCategoriesData | oldLiveCartCount=" + a2 + "   newLiveCartCount=" + a3);
        }
        this.d.R = liveItemCategoriesResponseData;
        a(jSONObject);
        afs afsVar = (afs) ((c) this.f13751a).f.getAdapter();
        if (afsVar != null) {
            for (IDMComponent iDMComponent : afsVar.a("category")) {
                iDMComponent.getFields().putAll(jSONObject);
                afsVar.a(iDMComponent);
            }
        }
        hit.a(jSONObject, false);
        ((c) this.f13751a).a(liveItemCategoriesResponseData, str, list);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.b == 0 || ((d) this.b).c() == null) {
        } else {
            b(((d) this.b).c());
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.b == 0 || ((d) this.b).c() == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(((d) this.b).c());
            jSONObject.put("carouselListV2", (Object) new JSONArray());
            jSONObject.put("carouselList", (Object) new JSONArray());
            b(jSONObject);
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        his.a("GoodsViewPresenter", "handleTopOperate");
        afs afsVar = (afs) ((c) this.f13751a).f.getAdapter();
        if (afsVar == null) {
            return;
        }
        for (IDMComponent iDMComponent : afsVar.a("topOperate")) {
            JSONObject data = iDMComponent.getData();
            if (!data.containsKey("fields")) {
                data.put("fields", (Object) new JSONObject());
            }
            data.getJSONObject("fields").putAll(jSONObject);
            afsVar.a(iDMComponent);
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.n()) {
            return;
        }
        hit.a(jSONObject);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (this.d != null && this.d.f() != null) {
            LocalBroadcastManager.getInstance(this.d.f()).unregisterReceiver(this.e);
            LocalBroadcastManager.getInstance(this.d.f()).unregisterReceiver(this.j);
        }
        this.i = false;
    }

    private void a(JSONObject jSONObject) {
        JSONArray jSONArray;
        VideoInfo.ExtraGoodsTabItem extraGoodsTabItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || this.d.t() == null || (jSONArray = jSONObject.getJSONArray("topRightEntranceList")) == null || jSONArray.isEmpty()) {
        } else {
            if (this.d.A()) {
                jSONObject.remove("topRightEntranceList");
                return;
            }
            int i = ((c) this.f13751a).i();
            List<VideoInfo.ExtraGoodsTabItem> G = this.d.G();
            if (G == null || G.size() <= i || (extraGoodsTabItem = G.get(i)) == null || extraGoodsTabItem.showTopBarType == null || StringUtils.equals("nativeDX", extraGoodsTabItem.type)) {
                return;
            }
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                String string = ((JSONObject) it.next()).getString("type");
                if (StringUtils.isEmpty(string)) {
                    it.remove();
                } else if (!extraGoodsTabItem.showTopBarType.contains(string)) {
                    it.remove();
                }
            }
        }
    }
}
