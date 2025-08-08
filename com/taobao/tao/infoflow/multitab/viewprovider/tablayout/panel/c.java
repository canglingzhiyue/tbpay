package com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.n;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.kvw;
import tb.oqc;
import tb.thw;
import tb.thy;
import tb.tkc;

/* loaded from: classes8.dex */
public class c implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final kvw c;
    private final i d;
    private boolean e;
    private View g;

    /* renamed from: a  reason: collision with root package name */
    private final thw f20669a = new thw(this);
    private final tkc f = new tkc();
    private final thy b = new thy(this.f20669a);

    static {
        kge.a(-1390315560);
        kge.a(1717401112);
    }

    public static /* synthetic */ View a(c cVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7003d8aa", new Object[]{cVar, view});
        }
        cVar.g = view;
        return view;
    }

    public static /* synthetic */ String a(c cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b68f35a", new Object[]{cVar, jSONObject}) : cVar.b(jSONObject);
    }

    public static /* synthetic */ thy a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (thy) ipChange.ipc$dispatch("88392937", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ i b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("324dbbd3", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ tkc c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tkc) ipChange.ipc$dispatch("89d62ed2", new Object[]{cVar}) : cVar.f;
    }

    public static /* synthetic */ View d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e4b70089", new Object[]{cVar}) : cVar.g;
    }

    public static /* synthetic */ thw e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (thw) ipChange.ipc$dispatch("8b7322fd", new Object[]{cVar}) : cVar.f20669a;
    }

    public c(kvw kvwVar, i iVar) {
        this.c = kvwVar;
        this.d = iVar;
    }

    public View a(JSONObject jSONObject, Context context, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("564bd5f2", new Object[]{this, jSONObject, context, jSONObject2});
        }
        PanelStyleModel b = b.b(jSONObject);
        if (b == null) {
            return new View(context);
        }
        ViewGroup a2 = this.f20669a.a(context);
        View a3 = this.b.a(jSONObject, b, context, this.d.h());
        a2.addView(a3);
        a2.addView(this.f20669a.a(context, b));
        if (jSONObject2 == null) {
            return a2;
        }
        g.a("PanelViewManager", "panelGuidePopView createPopView");
        a(jSONObject2, a2, a3);
        return a2;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.b();
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f20669a.c();
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void d() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        g.a("PanelViewManager", "onClose categoryViewProvider :");
        this.b.d();
        this.e = this.b.e();
        if (this.e) {
            oqc.a().r();
        }
        JSONObject a2 = b.a();
        if (a2 == null) {
            g.a("PanelViewManager", "缓存tabs数据异常");
            return;
        }
        JSONObject a3 = b.a(a2);
        if (a3 == null) {
            g.a("PanelViewManager", "缓存tabItemData数据异常");
            return;
        }
        String str = "";
        for (Map.Entry<String, Boolean> entry : a(a3).entrySet()) {
            str = entry.getKey();
            z = entry.getValue().booleanValue();
        }
        a(str);
        a(a2, z);
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        View view = this.g;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    private void a(final JSONObject jSONObject, final ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cacc6dab", new Object[]{this, jSONObject, viewGroup, view});
        } else {
            view.post(new Runnable() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (jSONObject == null) {
                    } else {
                        g.a("PanelViewManager", "panelGuidePopView createPopView");
                        String a2 = c.a(c.this, jSONObject);
                        if (StringUtils.isEmpty(a2)) {
                            return;
                        }
                        int[] a3 = c.a(c.this).a(a2);
                        if (a3[0] == 0 || a3[1] == 0) {
                            return;
                        }
                        c cVar = c.this;
                        c.a(cVar, c.c(cVar).a(viewGroup.getContext(), jSONObject, c.b(c.this).a(a2)));
                        if (c.d(c.this) == null) {
                            return;
                        }
                        c.c(c.this).a(a3);
                        c.e(c.this).a();
                        c.a(c.this).a();
                        viewGroup.addView(c.d(c.this));
                    }
                }
            });
        }
    }

    private String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 != null) {
            return jSONObject2.getString(e.KEY_TAB_ID);
        }
        return null;
    }

    private Map<String, Boolean> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap(1);
        int h = this.d.h();
        String n = this.d.n(h);
        g.a("PanelViewManager", "updateCurrentRemovedAndNavId selectTabId :" + n + ",selectPosition:" + h);
        int c = this.d.c();
        String str = n;
        boolean z = true;
        for (int i = 0; i < jSONObject.size(); i++) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(i));
            if (jSONObject2 != null) {
                String c2 = b.c(jSONObject2);
                if (!StringUtils.isEmpty(c2)) {
                    this.d.a(c2, i, jSONObject2);
                    if (StringUtils.equals(str, c2)) {
                        z = false;
                    }
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("content");
                    if (jSONObject3 != null && jSONObject3.getBooleanValue(b.IS_CLICK)) {
                        jSONObject3.remove(b.IS_CLICK);
                        g.a("PanelViewManager", "updateCurrentRemovedAndNavId 点击 naviTabId :" + c2);
                        str = c2;
                        z = false;
                    }
                }
            }
        }
        g.a("PanelViewManager", "updateCurrentRemovedAndNavId mCurrentTabRemoved " + z);
        if (z) {
            str = this.d.n(c);
            g.a("PanelViewManager", "updateCurrentRemovedAndNavId 当前tab被移除跳转推荐");
        }
        g.a("PanelViewManager", "updateCurrentRemovedAndNavId finalNaviId :" + str + ",currentTabRemove:" + z);
        hashMap.put(str, Boolean.valueOf(z));
        return hashMap;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            g.a("PanelViewManager", "naviToTabId tabId为null");
        } else {
            com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a aVar = (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) this.c.a(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY);
            int a2 = this.d.a(str);
            g.a("PanelViewManager", "naviToTabId naviToTab :" + str + ",position:" + a2);
            if (a2 == -1 || aVar == null) {
                return;
            }
            g.a("chengyu", "naviToTabId tabIndex  :" + a2);
            this.d.g(a2);
            aVar.b(str);
            if (!n.n().e()) {
                return;
            }
            ((com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) this.c.a(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY)).a(a2, true);
        }
    }

    private void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (!this.e) {
            g.a("PanelViewManager", "notifyUiRefresh 未编辑不刷新 ");
        } else {
            g.a("PanelViewManager", "notifyUiRefresh  currentTabRemoved " + z);
            List<JSONObject> a2 = e.a(jSONObject);
            ((com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a) this.c.a(com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.KEY)).a(jSONObject, a2, z);
            ((com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a) this.c.a(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.KEY)).a(jSONObject, a2, z);
        }
    }
}
