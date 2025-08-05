package com.taobao.search.sf.realtimetag;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.android.weex_framework.r;
import com.taobao.search.common.util.LimitedLinkedList;
import com.taobao.search.common.util.g;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.j;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ity;
import tb.iud;
import tb.kge;
import tb.nno;
import tb.noa;
import tb.npj;
import tb.npn;
import tb.npr;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.search.sf.datasource.c f19475a;
    private String b;
    private IRealTimeTagContainer c;
    private SFAuctionBaseCellBean d;
    private npn g;
    private npn h;
    private com.taobao.search.sf.realtimetag.data.b i;
    private npn k;
    private com.taobao.search.sf.realtimetag.data.b l;
    private StringBuilder e = new StringBuilder();
    private LimitedLinkedList<String> f = new LimitedLinkedList<>(20);
    private boolean j = false;
    private boolean m = false;

    static {
        kge.a(906583622);
    }

    public static /* synthetic */ com.taobao.search.sf.datasource.c a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.sf.datasource.c) ipChange.ipc$dispatch("2cf79a2d", new Object[]{bVar}) : bVar.f19475a;
    }

    public static /* synthetic */ void a(b bVar, int i, DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3ea165", new Object[]{bVar, new Integer(i), dynamicCardBean});
        } else {
            bVar.a(i, dynamicCardBean);
        }
    }

    public static /* synthetic */ com.taobao.search.sf.realtimetag.data.b b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.sf.realtimetag.data.b) ipChange.ipc$dispatch("cd55328a", new Object[]{bVar}) : bVar.i;
    }

    public b(com.taobao.search.sf.datasource.c cVar) {
        this.f19475a = cVar;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    private void a(int i, DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3c2a50", new Object[]{this, new Integer(i), dynamicCardBean});
            return;
        }
        BaseCellBean baseCellBean = dynamicCardBean.mDynamicCellBean;
        if (baseCellBean == null) {
            return;
        }
        if (this.e.length() > 0) {
            this.e.append(";");
        }
        StringBuilder sb = this.e;
        sb.append(i);
        sb.append("#");
        sb.append(baseCellBean.cardType);
    }

    public void a(IRealTimeTagContainer iRealTimeTagContainer, SFAuctionBaseCellBean sFAuctionBaseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951ccac3", new Object[]{this, iRealTimeTagContainer, sFAuctionBaseCellBean});
            return;
        }
        this.c = iRealTimeTagContainer;
        this.d = sFAuctionBaseCellBean;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        IRealTimeTagContainer iRealTimeTagContainer = this.c;
        if (iRealTimeTagContainer != null) {
            iRealTimeTagContainer.clearTag();
        }
        SFAuctionBaseCellBean sFAuctionBaseCellBean = this.d;
        if (sFAuctionBaseCellBean == null) {
            return;
        }
        sFAuctionBaseCellBean.dynamicCardBean = null;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.f.add(str);
        }
    }

    public void a(String str, Map<String, String> map, Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2137b7e", new Object[]{this, str, map, activity, new Integer(i)});
            return;
        }
        npn npnVar = this.g;
        if (npnVar != null && !npnVar.b()) {
            this.g.a();
        }
        if (map != null) {
            this.b = map.get("itemId");
        }
        com.taobao.search.sf.realtimetag.data.a aVar = new com.taobao.search.sf.realtimetag.data.a(str, map, i);
        aVar.b(this.e.toString());
        this.g = new npr.b().a(aVar).a().a().a(new iud<nno>() { // from class: com.taobao.search.sf.realtimetag.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iud
            public void a(nno nnoVar) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f68b91c9", new Object[]{this, nnoVar});
                } else {
                    k.e("RealTimeTagManager", "send clickTrace success");
                }
            }
        }, new npj("RealTimeTagManager"));
    }

    public void b(String str, Map<String, String> map, Activity activity, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac891bff", new Object[]{this, str, map, activity, new Integer(i)});
            return;
        }
        npn npnVar = this.g;
        if (npnVar != null && !npnVar.b()) {
            this.g.a();
        }
        if (map != null) {
            this.b = map.get("itemId");
        }
        com.taobao.search.sf.realtimetag.data.a aVar = new com.taobao.search.sf.realtimetag.data.a(str, map, i);
        aVar.b(this.e.toString());
        this.g = new npr.b().a(aVar).a(new com.taobao.search.jarvis.bean.a((CommonSearchResult) this.f19475a.getTotalSearchResult())).a().b().a(new iud<DynamicCardBean>() { // from class: com.taobao.search.sf.realtimetag.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iud
            public void a(DynamicCardBean dynamicCardBean) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("889f1e3", new Object[]{this, dynamicCardBean});
                    return;
                }
                if (dynamicCardBean.mTemplates != null) {
                    r rVar = new r();
                    rVar.a(b.a(b.this).getBundleUrl());
                    rVar.b(b.a(b.this).getTrackingPageName());
                    ity.a(rVar, dynamicCardBean.mTemplates, XslModule.a(), b.a(b.this).getTemplateFiles());
                    b.a(b.this).mergeTemplates(dynamicCardBean.mTemplates);
                }
                if (dynamicCardBean.mDynamicCellBean instanceof SFAuctionBaseCellBean) {
                    SFAuctionBaseCellBean sFAuctionBaseCellBean = (SFAuctionBaseCellBean) dynamicCardBean.mDynamicCellBean;
                    String string = dynamicCardBean.mOriginData.getString("cardRn");
                    sFAuctionBaseCellBean.rn = string;
                    if (sFAuctionBaseCellBean.auctionBaseBean != null) {
                        sFAuctionBaseCellBean.auctionBaseBean.rn = string;
                    }
                }
                b.a(b.this, i, dynamicCardBean);
                b.a(b.this).postEvent(dynamicCardBean);
            }
        }, new npj("RealTimeTagManager"));
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.j;
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        this.b = str;
        this.j = true;
        map.put("clickItems", g.INSTANCE.a(this.f, ","));
        this.i = new com.taobao.search.sf.realtimetag.data.b("", map, 0);
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : g.INSTANCE.a(this.f, ",");
    }

    public void a(String str, Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a5b050", new Object[]{this, str, map, new Integer(i)});
            return;
        }
        this.j = true;
        map.put("clickItems", g.INSTANCE.a(this.f, ","));
        this.i = new com.taobao.search.sf.realtimetag.data.b(str, map, i);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        com.taobao.search.sf.realtimetag.data.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.a(map);
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        com.taobao.search.sf.realtimetag.data.b bVar = this.i;
        if (bVar == null) {
            return;
        }
        bVar.b(map);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!c()) {
        } else {
            if (this.i == null) {
                this.j = false;
                return;
            }
            npn npnVar = this.h;
            if (npnVar != null && !npnVar.b()) {
                this.h.a();
            }
            this.i.b(str);
            this.i.c(this.e.toString());
            JSONObject b = b(str2);
            if (b != null) {
                String optString = b.optString("item_id");
                String optString2 = b.optString(noa.KEY_JARVIS_FEATURE);
                if (TextUtils.equals(optString, this.b) && !TextUtils.isEmpty(optString2)) {
                    this.i.d(optString2);
                }
            }
            this.h = new npr.b().a(this.i).a(new com.taobao.search.jarvis.bean.a((CommonSearchResult) this.f19475a.getTotalSearchResult())).a().b().a(new iud<DynamicCardBean>() { // from class: com.taobao.search.sf.realtimetag.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iud
                public void a(DynamicCardBean dynamicCardBean) throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("889f1e3", new Object[]{this, dynamicCardBean});
                        return;
                    }
                    if (dynamicCardBean.mTemplates != null) {
                        r rVar = new r();
                        rVar.a(b.a(b.this).getBundleUrl());
                        rVar.b(b.a(b.this).getTrackingPageName());
                        ity.a(rVar, dynamicCardBean.mTemplates, j.f19452a, b.a(b.this).getTemplateFiles());
                        b.a(b.this).mergeTemplates(dynamicCardBean.mTemplates);
                    }
                    b bVar = b.this;
                    b.a(bVar, b.b(bVar).c(), dynamicCardBean);
                    b.a(b.this).postEvent(dynamicCardBean);
                }
            }, new npj("DynamicCardRequest"));
            this.j = false;
        }
    }

    private JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("149a1ee1", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            k.a("RealTimeTagManager", "parseJarvisResult", e);
            return null;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        npn npnVar = this.g;
        if (npnVar != null && !npnVar.b()) {
            this.g.a();
            this.g = null;
        }
        npn npnVar2 = this.h;
        if (npnVar2 == null || npnVar2.b()) {
            return;
        }
        this.h.a();
        this.h = null;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.m;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        com.taobao.search.sf.realtimetag.data.b bVar = this.l;
        if (bVar != null) {
            return bVar.b();
        }
        return false;
    }

    public void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
            return;
        }
        com.taobao.search.sf.realtimetag.data.b bVar = this.l;
        if (bVar == null) {
            return;
        }
        bVar.a(map);
    }

    public com.alibaba.fastjson.JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this});
        }
        com.taobao.search.sf.realtimetag.data.b bVar = this.l;
        if (bVar != null) {
            return bVar.b;
        }
        return null;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        StringBuilder sb = this.e;
        sb.delete(0, sb.length());
        this.f.clear();
    }

    public void a(String str, String str2, Map<String, String> map, int i, boolean z, com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226569b6", new Object[]{this, str, str2, map, new Integer(i), new Boolean(z), jSONObject});
            return;
        }
        this.m = true;
        this.l = new com.taobao.search.sf.realtimetag.data.b(str, str2, map, i);
        this.l.a(jSONObject);
        this.l.a(z);
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (!e()) {
        } else {
            if (this.l == null) {
                this.m = false;
                return;
            }
            npn npnVar = this.k;
            if (npnVar != null && !npnVar.b()) {
                this.k.a();
            }
            if (!TextUtils.isEmpty(str)) {
                this.l.b(str);
                JSONObject b = b(str2);
                if (b != null) {
                    String optString = b.optString(noa.KEY_JARVIS_FEATURE);
                    if (!TextUtils.isEmpty(optString)) {
                        this.l.d(optString);
                    }
                }
            }
            this.k = new npr.b().a(this.l).a(new com.taobao.search.jarvis.bean.a((CommonSearchResult) this.f19475a.getTotalSearchResult())).a().b().a(new iud<DynamicCardBean>() { // from class: com.taobao.search.sf.realtimetag.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iud
                public void a(DynamicCardBean dynamicCardBean) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("889f1e3", new Object[]{this, dynamicCardBean});
                        return;
                    }
                    if (dynamicCardBean.mTemplates != null) {
                        r rVar = new r();
                        rVar.a(b.a(b.this).getBundleUrl());
                        rVar.b(b.a(b.this).getTrackingPageName());
                        ity.a(rVar, dynamicCardBean.mTemplates, j.f19452a, b.a(b.this).getTemplateFiles());
                        b.a(b.this).mergeTemplates(dynamicCardBean.mTemplates);
                    }
                    b.a(b.this).postEvent(dynamicCardBean);
                }
            }, new npj("CommonDynamicCardRequest"));
            this.m = false;
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            b(null, null);
        }
    }
}
