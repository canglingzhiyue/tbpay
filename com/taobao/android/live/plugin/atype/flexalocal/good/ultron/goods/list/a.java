package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelStoreOwner;
import android.content.Context;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.RecyclerView;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.alibaba.android.ultron.vfw.viewholder.j;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.afq;
import tb.fnk;
import tb.fpd;
import tb.fqr;
import tb.hhs;
import tb.hik;
import tb.hin;
import tb.hiq;
import tb.kge;
import tb.pqj;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f13833a;
    private Context b;
    private j c;
    private RecyclerView d;
    private HashMap<Integer, LinkedList<h>> e = new HashMap<>();
    private Map<Integer, String> g = new HashMap();
    private c h;

    static {
        kge.a(141541682);
    }

    public a(c cVar, j jVar, d dVar, boolean z) {
        this.b = cVar.f();
        this.h = cVar;
        this.c = jVar;
        this.f13833a = dVar;
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(this.h)) {
            this.g.put(4, "normal2");
        } else {
            this.g.put(4, "normal");
        }
        this.g.put(6, "secKill");
        String e = com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.e();
        if (!z || TextUtils.isEmpty(e)) {
            return;
        }
        if (e.contains("pcg")) {
            this.g.put(7, "pcg");
        }
        if (e.contains("rightsTopV2")) {
            this.g.put(1, "rightsTopV2");
        }
        if (e.contains("categoryTop")) {
            this.g.put(8, "categoryTop");
        }
        if (!e.contains("searchBottom")) {
            return;
        }
        this.g.put(10, "searchBottom");
    }

    public String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : this.g.get(Integer.valueOf(i));
    }

    public void a(h hVar, IDMComponent iDMComponent, boolean z) {
        LinkedList<h> linkedList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("654d7a0d", new Object[]{this, hVar, iDMComponent, new Boolean(z)});
            return;
        }
        View view = hVar.itemView;
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        int a2 = this.c.a(iDMComponent);
        if (this.e.containsKey(Integer.valueOf(a2))) {
            linkedList = this.e.get(Integer.valueOf(a2));
        } else {
            linkedList = new LinkedList<>();
        }
        if (linkedList != null) {
            if (z) {
                linkedList.addFirst(hVar);
            } else {
                linkedList.addLast(hVar);
            }
        }
        if (hiq.a(iDMComponent) && !(hVar.itemView instanceof DXRootView)) {
            return;
        }
        this.e.put(Integer.valueOf(a2), linkedList);
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else if (this.d != null) {
        } else {
            this.d = recyclerView;
        }
    }

    public IDMComponentsFrameLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponentsFrameLayout) ipChange.ipc$dispatch("db2e3727", new Object[]{this});
        }
        IDMComponentsFrameLayout iDMComponentsFrameLayout = new IDMComponentsFrameLayout(this.b);
        iDMComponentsFrameLayout.setId(R.id.item_root);
        iDMComponentsFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return iDMComponentsFrameLayout;
    }

    public void a(c cVar, IDMComponentsFrameLayout iDMComponentsFrameLayout, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c0a7b9a", new Object[]{this, cVar, iDMComponentsFrameLayout, jSONObject, str});
            return;
        }
        List<IDMComponent> list = null;
        UltronInstanceViewModel ultronInstanceViewModel = (UltronInstanceViewModel) new ViewModelProvider((ViewModelStoreOwner) this.b, new com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.h()).get(UltronInstanceViewModel.class);
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.o() && ((TextUtils.equals("normal2", str) || TextUtils.equals("normal", str)) && cVar != null && cVar.E() != null)) {
            list = cVar.E().a(str);
        }
        if (list == null) {
            this.f13833a.r().a(pqj.b(ultronInstanceViewModel.f13834a));
            this.f13833a.a(new afq(str));
            list = this.f13833a.k().f();
        }
        if (list == null) {
            m.e("GoodsItemViewAdapter", "卡片渲染失败，奥创接口失败");
            return;
        }
        int size = iDMComponentsFrameLayout.getRecyclerViewHolders().size();
        if (size > 0) {
            List<IDMComponent> components = iDMComponentsFrameLayout.getComponents();
            List<h> recyclerViewHolders = iDMComponentsFrameLayout.getRecyclerViewHolders();
            for (int i = 0; i < size; i++) {
                a(recyclerViewHolders.get(i), components.get(i), true);
            }
        }
        iDMComponentsFrameLayout.clearRecyclerViewHolders();
        iDMComponentsFrameLayout.clearIDMComponents();
        iDMComponentsFrameLayout.removeAllViews();
        HashSet hashSet = new HashSet();
        for (IDMComponent iDMComponent : list) {
            String jSONString = iDMComponent.getContainerInfo().toJSONString();
            if (!a(hashSet, iDMComponent)) {
                if (b(iDMComponent)) {
                    Log.e("GoodsItemViewAdapter", jSONString + " 作为SubSection 子Item 渲染");
                    IDMComponent parent = iDMComponent.getParent();
                    if (a(cVar, parent, iDMComponentsFrameLayout, jSONObject)) {
                        hashSet.add(parent);
                    }
                } else if (a(iDMComponent, jSONObject)) {
                    h a2 = a(iDMComponent, (ViewGroup) iDMComponentsFrameLayout, true);
                    iDMComponent.getData().put("ultronItemData", (Object) jSONObject);
                    ArrayMap<String, Object> extMap = iDMComponent.getExtMap();
                    if (extMap != null) {
                        extMap.put("gl_ultron_context", cVar);
                    }
                    if (d(iDMComponent)) {
                        hik.a(iDMComponent.getData().getJSONObject("fields"), jSONObject);
                    }
                    this.c.a(a2, iDMComponent);
                    iDMComponentsFrameLayout.addRecyclerViewHolder(a2);
                    iDMComponentsFrameLayout.addIDMComponent(iDMComponent);
                    iDMComponentsFrameLayout.addView(a2.itemView);
                }
            }
        }
        if (!b.d(this.b)) {
            return;
        }
        TextView textView = new TextView(this.b);
        textView.setText(RVStartParams.KEY_URL_SHORT);
        textView.setTextColor(-65536);
        textView.setTextSize(12.0f);
        iDMComponentsFrameLayout.addView(textView, new ViewGroup.LayoutParams(-2, -2));
    }

    private h a(IDMComponent iDMComponent, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("5584a7ae", new Object[]{this, iDMComponent, viewGroup, new Boolean(z)});
        }
        h hVar = null;
        int a2 = this.c.a(iDMComponent);
        if (this.e.containsKey(Integer.valueOf(a2))) {
            LinkedList<h> linkedList = this.e.get(Integer.valueOf(a2));
            if (!linkedList.isEmpty()) {
                hVar = linkedList.removeFirst();
            }
        }
        if (hVar == null) {
            hVar = a(this.c.a(iDMComponent), iDMComponent, viewGroup, z);
        } else {
            z2 = false;
        }
        Log.e("GoodsItemViewAdapter", "getViewHolderByType:" + iDMComponent.getKey() + "  result=" + hVar.itemView + "   create=" + z2);
        return hVar;
    }

    private boolean a(c cVar, IDMComponent iDMComponent, IDMComponentsFrameLayout iDMComponentsFrameLayout, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e763efea", new Object[]{this, cVar, iDMComponent, iDMComponentsFrameLayout, jSONObject})).booleanValue();
        }
        if (!a(iDMComponent, jSONObject)) {
            return false;
        }
        String string = iDMComponent.getFields().getString("exclusion");
        boolean parseBoolean = !TextUtils.isEmpty(string) ? Boolean.parseBoolean(string) : false;
        for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
            if (a(iDMComponent2, jSONObject)) {
                h a2 = a(iDMComponent2, (ViewGroup) iDMComponentsFrameLayout, true);
                iDMComponentsFrameLayout.addIDMComponent(iDMComponent2);
                iDMComponentsFrameLayout.addRecyclerViewHolder(a2);
                iDMComponent2.getData().put("ultronItemData", (Object) jSONObject);
                boolean d = d(iDMComponent2);
                ArrayMap<String, Object> extMap = iDMComponent2.getExtMap();
                if (extMap != null) {
                    extMap.put("gl_ultron_context", cVar);
                }
                if (d) {
                    hik.a(iDMComponent2.getData().getJSONObject("fields"), jSONObject);
                }
                this.c.a(a2, iDMComponent2);
                int[] c = c(iDMComponent2.getParent());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c[1], c[0]);
                layoutParams.leftMargin = c[2];
                layoutParams.topMargin = c[3];
                a2.itemView.setLayoutParams(layoutParams);
                iDMComponentsFrameLayout.addView(a2.itemView);
                if (parseBoolean) {
                    break;
                }
            }
        }
        return parseBoolean;
    }

    private boolean a(Set<IDMComponent> set, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c904b661", new Object[]{this, set, iDMComponent})).booleanValue();
        }
        for (IDMComponent iDMComponent2 : set) {
            if (iDMComponent2.getChildren().contains(iDMComponent)) {
                return true;
            }
        }
        return false;
    }

    private boolean b(IDMComponent iDMComponent) {
        IDMComponent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73527f0f", new Object[]{this, iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || (parent = iDMComponent.getParent()) == null) {
            return false;
        }
        JSONObject containerInfo = parent.getContainerInfo();
        return "sub_section".equals(containerInfo.getString("name")) && "layout".equals(containerInfo.getString("containerType"));
    }

    private int[] c(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("7b32ffa", new Object[]{this, iDMComponent});
        }
        JSONObject fields = iDMComponent.getFields();
        DinamicXEngine c = hhs.a().c();
        return new int[]{hin.a(c, this.b, fields.getIntValue("h")), hin.a(c, this.b, fields.getIntValue("w")), hin.a(c, this.b, fields.getIntValue("x")), hin.a(c, this.b, fields.getIntValue("y"))};
    }

    private boolean a(IDMComponent iDMComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca1a8088", new Object[]{this, iDMComponent, jSONObject})).booleanValue();
        }
        String string = iDMComponent.getFields().getString("dependency");
        if (!TextUtils.isEmpty(string)) {
            return fqr.a(fnk.a(string, "", new fpd.a().b(jSONObject).a()));
        }
        return true;
    }

    private boolean d(IDMComponent iDMComponent) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8d2cad4d", new Object[]{this, iDMComponent})).booleanValue() : (iDMComponent == null || iDMComponent.getData() == null || (jSONObject = iDMComponent.getData().getJSONObject("fields")) == null || !jSONObject.containsKey("parsefields") || !"true".equalsIgnoreCase(jSONObject.getString("parsefields"))) ? false : true;
    }

    public void a(IDMComponentsFrameLayout iDMComponentsFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87253767", new Object[]{this, iDMComponentsFrameLayout});
            return;
        }
        for (h hVar : iDMComponentsFrameLayout.getRecyclerViewHolders()) {
            if (hVar != null && (hVar.itemView instanceof DXRootView)) {
                hhs.a().b((DXRootView) hVar.itemView);
            }
        }
    }

    public static String a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject}) : (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("ultronItemData")) == null) ? "" : jSONObject2.getString("itemId");
    }

    private h a(int i, IDMComponent iDMComponent, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("e55dc121", new Object[]{this, new Integer(i), iDMComponent, viewGroup, new Boolean(z)});
        }
        if (!com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.c().booleanValue() || !z) {
            return this.c.a(viewGroup, i);
        }
        if (this.h.E() != null && this.h.E().d() != null) {
            return this.h.E().d().a(this.c, viewGroup, i, iDMComponent, false);
        }
        return null;
    }
}
