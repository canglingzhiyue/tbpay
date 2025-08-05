package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.view.widgets.TailFadeFrameLayout;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.i;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.util.DensityUtil;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.kss;
import tb.kvw;
import tb.lmt;
import tb.onq;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lmt f20651a;
    private boolean b;
    private MultiTabLayout c;
    private TUrlImageView d;
    private List<JSONObject> e;
    private final kvw f;
    private final com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.c g;
    private View h;
    private final List<a.c> i = new CopyOnWriteArrayList();

    static {
        kge.a(486549280);
    }

    public static /* synthetic */ MultiTabLayout a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultiTabLayout) ipChange.ipc$dispatch("75bb9a97", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ void a(c cVar, JSONObject jSONObject, MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("507e8d31", new Object[]{cVar, jSONObject, multiTabLayout});
        } else {
            cVar.a(jSONObject, multiTabLayout);
        }
    }

    public static /* synthetic */ void a(c cVar, JSONObject jSONObject, MultiTabLayout multiTabLayout, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d809d7df", new Object[]{cVar, jSONObject, multiTabLayout, jSONObject2});
        } else {
            cVar.b(jSONObject, multiTabLayout, jSONObject2);
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94fa7c89", new Object[]{cVar, str});
        } else {
            cVar.a(str);
        }
    }

    public static /* synthetic */ lmt b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lmt) ipChange.ipc$dispatch("4db9b7b5", new Object[]{cVar}) : cVar.f20651a;
    }

    public static /* synthetic */ List c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e216546a", new Object[]{cVar}) : cVar.i;
    }

    public static /* synthetic */ TUrlImageView d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("206c660", new Object[]{cVar}) : cVar.d;
    }

    public c(lmt lmtVar, kvw kvwVar, i iVar) {
        this.f20651a = lmtVar;
        this.f = kvwVar;
        this.g = new com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.c(kvwVar, iVar);
    }

    public void a(final JSONObject jSONObject, List<JSONObject> list, MultiTabLayout multiTabLayout, View view, TailFadeFrameLayout tailFadeFrameLayout, final TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb3bdf", new Object[]{this, jSONObject, list, multiTabLayout, view, tailFadeFrameLayout, tUrlImageView});
        } else if (jSONObject == null) {
        } else {
            if (TextUtils.isEmpty(this.f20651a.q)) {
                view.setVisibility(8);
                tailFadeFrameLayout.showFade(false);
                return;
            }
            this.c = multiTabLayout;
            this.d = tUrlImageView;
            this.e = list;
            onq.a(tUrlImageView, this.f20651a.b(true), "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
            tUrlImageView.setImageUrl(this.f20651a.b(true));
            tUrlImageView.setContentDescription("展开,按钮");
            view.setVisibility(0);
            tailFadeFrameLayout.setFadeWidth(DensityUtil.dip2px(tailFadeFrameLayout.getContext(), 18.0f));
            tailFadeFrameLayout.showFade(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        return;
                    }
                    Object a2 = HomePageUtility.a(jSONObject, com.taobao.tao.infoflow.multitab.e.PATH_DOWN_PANEL_ITEM);
                    if (a2 instanceof JSONObject) {
                        kss.b(jSONObject, (JSONObject) a2);
                    }
                    boolean e = com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.e(jSONObject);
                    g.a("TabDownPanelViewBuilder", "customizable: " + e);
                    if (e) {
                        c cVar = c.this;
                        c.a(cVar, jSONObject, c.a(cVar), null);
                    } else {
                        c cVar2 = c.this;
                        c.a(cVar2, jSONObject, c.a(cVar2));
                    }
                    String b = c.b(c.this).b(e);
                    if (!TextUtils.isEmpty(b)) {
                        onq.a(tUrlImageView, b, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
                        tUrlImageView.setImageUrl(b);
                        tUrlImageView.setContentDescription("收起,按钮");
                    }
                    for (a.c cVar3 : c.c(c.this)) {
                        cVar3.b();
                    }
                }
            });
            this.b = true;
        }
    }

    public void a(JSONObject jSONObject, MultiTabLayout multiTabLayout, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491cd088", new Object[]{this, jSONObject, multiTabLayout, jSONObject2});
        } else if (!com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.e(jSONObject)) {
            g.a("TabDownPanelViewBuilder", "triggerCustomPanelShow not customizable");
        } else if (multiTabLayout == null) {
            g.a("TabDownPanelViewBuilder", "triggerCustomPanelShow tabLayout null");
        } else {
            g.a("TabDownPanelViewBuilder", "triggerCustomPanelShow  buildCustomizablePanelView");
            b(jSONObject, multiTabLayout, jSONObject2);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View view = this.h;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public void a(a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c644e062", new Object[]{this, cVar});
        } else {
            this.i.add(cVar);
        }
    }

    private void b(JSONObject jSONObject, MultiTabLayout multiTabLayout, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d32ac9", new Object[]{this, jSONObject, multiTabLayout, jSONObject2});
            return;
        }
        View view = this.h;
        if (view != null && view.getVisibility() == 0) {
            this.h.setVisibility(8);
            return;
        }
        View rootView = this.c.getRootView();
        if (!(rootView instanceof ViewGroup)) {
            return;
        }
        this.h = this.g.a(jSONObject, this.c.getContext(), jSONObject2);
        int[] iArr = new int[2];
        multiTabLayout.getLocationInWindow(iArr);
        this.h.setY(iArr[1]);
        ((ViewGroup) rootView).addView(this.h);
    }

    private void a(JSONObject jSONObject, MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13f768", new Object[]{this, jSONObject, multiTabLayout});
            return;
        }
        Object a2 = HomePageUtility.a(jSONObject, com.taobao.tao.infoflow.multitab.e.PATH_DOWN_PANEL_POP_CONFIG);
        if (!(a2 instanceof JSONObject)) {
            return;
        }
        JSONObject jSONObject2 = (JSONObject) a2;
        Object a3 = HomePageUtility.a(jSONObject, com.taobao.tao.infoflow.multitab.e.PATH_DOWN_PANEL_POP_SECTION);
        if (!(a3 instanceof JSONObject)) {
            return;
        }
        JSONObject jSONObject3 = (JSONObject) a3;
        JSONObject jSONObject4 = jSONObject3.getJSONObject("ext");
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
            jSONObject3.put("ext", (Object) jSONObject4);
        }
        jSONObject4.put(com.taobao.tao.infoflow.multitab.e.KEY_SELECTED_TAB_ID, (Object) a());
        int[] iArr = new int[2];
        multiTabLayout.getLocationOnScreen(iArr);
        jSONObject4.put(com.taobao.tao.infoflow.multitab.e.KEY_DOWN_PANEL_ANCHOR_Y, (Object) String.valueOf(iArr[1] + multiTabLayout.getHeight()));
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject3);
        jSONObject2.put("sections", (Object) jSONArray);
        a(jSONObject2);
    }

    private void a(JSONObject jSONObject) {
        IPopData<PopSectionModel> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!this.b || (a2 = com.taobao.homepage.pop.utils.e.a(jSONObject)) == null) {
        } else {
            final String businessID = a2.getBusinessID();
            int trigger = a2.getPopConfig() == null ? 3 : a2.getPopConfig().getTrigger();
            com.taobao.tao.topmultitab.c.a().a(new IPopViewService.a() { // from class: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.biz.IPopViewService.a
                public void a(String str, Object obj, JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e5ed1122", new Object[]{this, str, obj, jSONObject2});
                        return;
                    }
                    IPopData<PopSectionModel> a3 = com.taobao.homepage.pop.utils.e.a(obj);
                    if (a3 == null || !TextUtils.equals(a3.getBusinessID(), businessID)) {
                        return;
                    }
                    com.taobao.android.home.component.utils.e.e("TabDownPanelViewBuilder", "receive messageType: " + str);
                    if (TextUtils.equals("selectMultiTab", str) && jSONObject2 != null) {
                        String string = jSONObject2.getString(com.taobao.tao.infoflow.multitab.e.KEY_TAB_ID);
                        if (TextUtils.isEmpty(string)) {
                            return;
                        }
                        c.a(c.this, string);
                    } else if (!com.taobao.homepage.pop.utils.g.a(str)) {
                    } else {
                        String b = c.b(c.this).b(true);
                        if (!TextUtils.isEmpty(b)) {
                            onq.a(c.d(c.this), b, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
                            c.d(c.this).setImageUrl(b);
                            c.d(c.this).setContentDescription("展开,按钮");
                        }
                        com.taobao.tao.topmultitab.c.a().b(this);
                    }
                }
            });
            com.taobao.tao.topmultitab.c.a().a(trigger, jSONObject);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        int i2 = -1;
        while (true) {
            if (i < this.e.size()) {
                JSONObject jSONObject = this.e.get(i).getJSONObject("content");
                if (jSONObject != null && TextUtils.equals(str, jSONObject.getString(com.taobao.tao.infoflow.multitab.e.KEY_TAB_ID))) {
                    i2 = i;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (i2 < 0 || i2 == this.c.getSelectedTabPosition()) {
            return;
        }
        a aVar = (a) this.f.a(a.KEY);
        if (aVar != null) {
            aVar.a(i2, 1);
        }
        g.a("TabDownPanelViewBuilder", "selectTabById: " + str + ", pos: " + i2);
    }

    private String a() {
        List<JSONObject> list;
        int selectedTabPosition;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : (this.b && (list = this.e) != null && !list.isEmpty() && (selectedTabPosition = this.c.getSelectedTabPosition()) >= 0 && selectedTabPosition < this.e.size()) ? com.taobao.tao.infoflow.multitab.e.b(this.e.get(selectedTabPosition)) : "";
    }
}
