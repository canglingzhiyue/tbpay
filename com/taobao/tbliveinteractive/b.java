package com.taobao.tbliveinteractive;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.tbliveinteractive.business.list.InteractiveNeedShowResponse;
import com.taobao.tbliveinteractive.business.list.InteractiveShowInfo;
import com.taobao.tbliveinteractive.componentlist.MtopMediaplatformDetailComponentlistResponse;
import com.taobao.tbliveinteractive.componentlist.MtopMediaplatformDetailComponentlistResponseData;
import com.taobao.tbliveinteractive.view.DWPenetrateFrameLayout;
import com.taobao.tbliveinteractive.view.right_component.InteractiveComponentRightAnim;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import tb.ddw;
import tb.kge;
import tb.phg;
import tb.pmd;
import tb.pnj;
import tb.pqj;
import tb.qnd;
import tb.qne;
import tb.qnh;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f22100a;
    private final String b;
    private e c;
    private com.taobao.tbliveinteractive.componentlist.b d;
    private com.taobao.tbliveinteractive.container.h5.b g;
    private HashMap<String, String> i;
    private c k;
    private StringBuilder l;
    private List<InteractiveComponent> e = new ArrayList();
    private boolean f = false;
    private boolean h = true;
    private Set<String> j = new HashSet();
    private List<InteractiveComponent> m = new ArrayList();

    public static /* synthetic */ List a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("af331998", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ void a(b bVar, InteractiveComponent interactiveComponent, InteractiveShowInfo interactiveShowInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8ea1fb", new Object[]{bVar, interactiveComponent, interactiveShowInfo});
        } else {
            bVar.a(interactiveComponent, interactiveShowInfo);
        }
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a843abe9", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.f = z;
        return z;
    }

    public static /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e788f450", new Object[]{bVar});
        } else {
            bVar.l();
        }
    }

    public static /* synthetic */ String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[0]) : f22100a;
    }

    static {
        kge.a(1456388152);
        f22100a = b.class.getSimpleName();
    }

    public b(String str, e eVar, com.taobao.tbliveinteractive.componentlist.b bVar, c cVar) {
        this.b = str;
        this.c = eVar;
        this.d = bVar;
        this.k = cVar;
    }

    public void a(com.taobao.tbliveinteractive.container.h5.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46032c91", new Object[]{this, bVar});
        } else {
            this.g = bVar;
        }
    }

    public InteractiveComponent a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractiveComponent) ipChange.ipc$dispatch("fb1d9f4e", new Object[]{this, str});
        }
        for (InteractiveComponent interactiveComponent : this.e) {
            if (!TextUtils.isEmpty(str) && (str.equals(interactiveComponent.name) || str.equals(interactiveComponent.fedName))) {
                return interactiveComponent;
            }
        }
        return null;
    }

    public List<InteractiveComponent> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.e);
        return arrayList;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.k = null;
        this.e.clear();
        this.j.clear();
        this.m.clear();
        this.h = true;
        this.i = null;
        StringBuilder sb = this.l;
        if (sb != null && sb.length() > 0) {
            e eVar = this.c;
            qnh.a(eVar, "component_load_finish", "componentInfos=" + this.l.toString());
        }
        this.l = null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.e.clear();
        this.j.clear();
        this.m.clear();
        this.h = true;
        c();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.l = new StringBuilder();
        this.j.clear();
        this.e.clear();
        com.taobao.tbliveinteractive.componentlist.b bVar = this.d;
        if (bVar == null) {
            return;
        }
        bVar.a(new com.taobao.tbliveinteractive.componentlist.c() { // from class: com.taobao.tbliveinteractive.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                }
            }

            @Override // com.taobao.tbliveinteractive.componentlist.c
            public void a(JSONObject jSONObject) {
                JSONObject jSONObject2;
                JSONArray jSONArray;
                MtopMediaplatformDetailComponentlistResponseData.Component component;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                } else if (jSONObject != null && jSONObject.containsKey("componentListData") && (jSONObject2 = jSONObject.getJSONObject("componentListData")) != null && jSONObject2.containsKey("aliveList") && (jSONArray = jSONObject2.getJSONArray("aliveList")) != null) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        if (jSONObject3 != null && (component = (MtopMediaplatformDetailComponentlistResponseData.Component) pqj.a(jSONObject3, MtopMediaplatformDetailComponentlistResponseData.Component.class)) != null) {
                            b.a(b.this).add(new InteractiveComponent(component));
                        }
                    }
                    b.b(b.this);
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                MtopMediaplatformDetailComponentlistResponse mtopMediaplatformDetailComponentlistResponse;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                } else if (!(netBaseOutDo instanceof MtopMediaplatformDetailComponentlistResponse) || (mtopMediaplatformDetailComponentlistResponse = (MtopMediaplatformDetailComponentlistResponse) netBaseOutDo) == null || mtopMediaplatformDetailComponentlistResponse.mo1437getData() == null || mtopMediaplatformDetailComponentlistResponse.mo1437getData().result == null) {
                } else {
                    b.a(b.this, mtopMediaplatformDetailComponentlistResponse.mo1437getData().enableMultiBatchRender);
                    Iterator<MtopMediaplatformDetailComponentlistResponseData.Component> it = mtopMediaplatformDetailComponentlistResponse.mo1437getData().result.iterator();
                    while (it.hasNext()) {
                        b.a(b.this).add(new InteractiveComponent(it.next()));
                    }
                    b.b(b.this);
                }
            }
        }, true);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        Collections.sort(this.e, new Comparator<InteractiveComponent>() { // from class: com.taobao.tbliveinteractive.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(InteractiveComponent interactiveComponent, InteractiveComponent interactiveComponent2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, interactiveComponent, interactiveComponent2})).intValue() : a(interactiveComponent, interactiveComponent2);
            }

            public int a(InteractiveComponent interactiveComponent, InteractiveComponent interactiveComponent2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("6631b6db", new Object[]{this, interactiveComponent, interactiveComponent2})).intValue();
                }
                return (interactiveComponent.showOrder < 0 ? interactiveComponent.showOrder + 10000 : interactiveComponent.showOrder) - (interactiveComponent2.showOrder < 0 ? interactiveComponent2.showOrder + 10000 : interactiveComponent2.showOrder);
            }
        });
        k();
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        try {
            InteractiveComponent a2 = a(str);
            InteractiveShowInfo interactiveShowInfo = new InteractiveShowInfo();
            interactiveShowInfo.isNeedShow = Boolean.parseBoolean(map.get("isNeedShow"));
            interactiveShowInfo.isNotifying = Boolean.parseBoolean(map.get("isNotifying"));
            interactiveShowInfo.notificationViewParams = map.get("notificationViewParams");
            interactiveShowInfo.viewParams = map.get("viewParams");
            interactiveShowInfo.extraParams = map.get("extraParams");
            interactiveShowInfo.actionUrl = map.get("actionUrl");
            interactiveShowInfo.iconAction = map.get("iconAction");
            if (a2 == null) {
                return;
            }
            a(a2, interactiveShowInfo);
        } catch (Exception e) {
            qnh.a("interactUpdateEntranceView", "Exception=" + e.toString());
        }
    }

    private void a(InteractiveComponent interactiveComponent, InteractiveShowInfo interactiveShowInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767001c2", new Object[]{this, interactiveComponent, interactiveShowInfo});
        } else if (interactiveComponent == null || interactiveShowInfo == null) {
        } else {
            interactiveComponent.updateViewParams(interactiveShowInfo);
            ddw.a().a("com.taobao.taolive.room.interactive_component_update_entrance_info", interactiveComponent, this.b);
            c cVar = this.k;
            if (cVar == null) {
                return;
            }
            cVar.a(interactiveComponent, interactiveShowInfo);
        }
    }

    public void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        try {
            InteractiveComponentRightAnim interactiveComponentRightAnim = new InteractiveComponentRightAnim();
            interactiveComponentRightAnim.name = str;
            interactiveComponentRightAnim.animationType = map.get("animationType");
            interactiveComponentRightAnim.dxTemplate = map.get("dxTemplate");
            interactiveComponentRightAnim.params = pqj.b(map.get("params"));
            interactiveComponentRightAnim.additionalAnimation = map.get("apngUrl");
            interactiveComponentRightAnim.stayDuration = Integer.parseInt(map.get("stayDuration"));
            if (map.containsKey("apngStayDuration")) {
                interactiveComponentRightAnim.apngStayDuration = Integer.parseInt(map.get("apngStayDuration"));
            }
            if (map.containsKey("dxDisAppearDuration")) {
                interactiveComponentRightAnim.dxDisAppearDuration = Integer.parseInt(map.get("dxDisAppearDuration"));
            }
            ddw.a().a("com.taobao.taolive.room.interactive_component_update_entrance_anim_info", interactiveComponentRightAnim, this.b);
        } catch (Exception unused) {
        }
    }

    public ArrayList<InteractiveComponent> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("379df345", new Object[]{this});
        }
        ArrayList<InteractiveComponent> arrayList = new ArrayList<>();
        for (InteractiveComponent interactiveComponent : this.e) {
            if (interactiveComponent.migrationFlag && interactiveComponent.isNeedShowEntrance && interactiveComponent.rightShowFlag && !interactiveComponent.interactivePanelDisplayOnly) {
                arrayList.add(interactiveComponent);
            }
        }
        return arrayList;
    }

    public ArrayList<InteractiveComponent> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("bbce4046", new Object[]{this});
        }
        ArrayList<InteractiveComponent> arrayList = new ArrayList<>();
        arrayList.addAll(this.m);
        for (InteractiveComponent interactiveComponent : this.e) {
            if (interactiveComponent.migrationFlag && interactiveComponent.isNeedShowEntrance && interactiveComponent.interactivePanelDisplayOnly && !arrayList.contains(interactiveComponent)) {
                arrayList.add(interactiveComponent);
            }
        }
        return arrayList;
    }

    private boolean a(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84243448", new Object[]{this, interactiveComponent})).booleanValue() : interactiveComponent.migrationFlag && interactiveComponent.isDefaultComponentType();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        if (!(phg.d().a() || !qne.u()) || !this.h || this.e.isEmpty() || this.i == null) {
            return;
        }
        this.h = false;
        for (final InteractiveComponent interactiveComponent : this.e) {
            if (a(interactiveComponent)) {
                if (interactiveComponent.customizedType == 1) {
                    if (!TextUtils.isEmpty(interactiveComponent.customizedMtop)) {
                        new com.taobao.tbliveinteractive.business.list.a(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.tbliveinteractive.b.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.taolive.sdk.adapter.network.d
                            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                                } else if (!(netBaseOutDo instanceof InteractiveNeedShowResponse)) {
                                } else {
                                    InteractiveComponent interactiveComponent2 = interactiveComponent;
                                    interactiveComponent2.isFistShow = true;
                                    b.a(b.this, interactiveComponent2, ((InteractiveNeedShowResponse) netBaseOutDo).mo1437getData());
                                }
                            }

                            @Override // com.taobao.taolive.sdk.adapter.network.d
                            public void onError(int i, NetResponse netResponse, Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                                } else {
                                    pmd.a().m().a(b.j(), "checkIsNeedShowByMtop onError ");
                                }
                            }

                            @Override // com.taobao.taolive.sdk.adapter.network.d
                            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                                } else {
                                    onError(i, netResponse, obj);
                                }
                            }
                        }).a(interactiveComponent.customizedMtop, interactiveComponent.fedName, this.i);
                    }
                } else if (interactiveComponent.customizedType == 2 && !TextUtils.isEmpty(interactiveComponent.iconUrl)) {
                    InteractiveShowInfo interactiveShowInfo = new InteractiveShowInfo();
                    interactiveShowInfo.isNeedShow = true;
                    interactiveComponent.isFistShow = true;
                    a(interactiveComponent, interactiveShowInfo);
                }
            }
        }
    }

    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        this.i = hashMap;
        k();
    }

    public void c(String str, Map<String, String> map) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ec9e51", new Object[]{this, str, map});
            return;
        }
        String str2 = map.get("componentInfo");
        if (!TextUtils.isEmpty(str2) && (sb = this.l) != null) {
            if (sb.length() > 0) {
                StringBuilder sb2 = this.l;
                sb2.append("^");
                sb2.append(str2);
            } else {
                this.l.append(str2);
            }
        }
        InteractiveComponent a2 = a(str);
        if (a2 == null) {
            return;
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.a(a2);
        }
        a2.loadComponentComplete();
        ddw.a().a("com.taobao.taolive.room.interactive_component_load_complete", a2, this.b);
    }

    public String d(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80d9f7b0", new Object[]{this, str, map});
        }
        InteractiveComponent a2 = a(str);
        if (a2 == null) {
            return "";
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.a(a2, map);
        }
        a2.initComponentComplete();
        ddw.a().a("com.taobao.taolive.room.interactive_component_render_complete", a2, this.b);
        return a2.parseJsonTBLiveInteractiveComponent().toJSONString();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.f();
        }
        ddw.a().a("com.taobao.taolive.room.interactive_all_component_load_complete", null, this.b);
    }

    public void e(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a591d78f", new Object[]{this, str, map});
            return;
        }
        InteractiveComponent a2 = a(str);
        if (a2 == null) {
            return;
        }
        a2.setFloatingLayerStatus(true);
    }

    public void f(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4742e", new Object[]{this, str, map});
            return;
        }
        InteractiveComponent a2 = a(str);
        if (a2 == null || !a2.isFloatingLayerStatus()) {
            return;
        }
        a2.setFloatingLayerStatus(false);
    }

    private void a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fc7488", new Object[]{this, context, str, str2, str3, str4});
        } else if ("openLayer".equals(str2)) {
            InteractiveComponent a2 = a(str);
            HashMap hashMap = (HashMap) pqj.a(a2 != null ? a2.parseJsonTBLiveInteractiveComponent().toJSONString() : "{}", HashMap.class);
            hashMap.put("clickSource", str4);
            g(str, hashMap);
        } else if ("jumpUrl".equals(str2)) {
            this.c.o().a(context, str3, qne.I());
        } else if ("poplayer".equals(str2)) {
            this.c.o().a(context, str3);
        } else if ("openWebViewLayer".equals(str2)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("bizData", str4);
            float a3 = qnd.a() * qne.B();
            hashMap2.put("x", "0");
            hashMap2.put("y", String.valueOf(com.taobao.taolive.sdk.utils.b.a((qnd.a() - qnd.a(context)) - a3)));
            hashMap2.put("width", String.valueOf(-1));
            hashMap2.put("height", String.valueOf(com.taobao.taolive.sdk.utils.b.a(a3)));
            hashMap2.put("modal", "true");
            e eVar = this.c;
            eVar.b(eVar.o().a(context), str3, hashMap2);
        } else if (!"openWebViewNewLayer".equals(str2)) {
        } else {
            HashMap hashMap3 = new HashMap();
            e eVar2 = this.c;
            eVar2.a(eVar2.o().a(context), str3, hashMap3);
        }
    }

    public void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{this, context, str, str2, str3});
        } else {
            a(context, str, str2, str3, "interactPanel");
        }
    }

    public InteractiveComponent a(Context context, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractiveComponent) ipChange.ipc$dispatch("2831d82d", new Object[]{this, context, objArr});
        }
        if (objArr.length < 4 || !"interact_click".equals(objArr[1])) {
            return null;
        }
        String valueOf = String.valueOf(objArr[2]);
        a(context, valueOf, String.valueOf(objArr[3]), objArr.length >= 5 ? String.valueOf(objArr[4]) : "", "interactRight");
        return a(valueOf);
    }

    public InteractiveComponent b(Context context, Object[] objArr) {
        String valueOf;
        InteractiveComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractiveComponent) ipChange.ipc$dispatch("46ec0fee", new Object[]{this, context, objArr});
        }
        if (objArr.length < 3 || !"interact_right_anim_click".equals(objArr[1]) || (a2 = a((valueOf = String.valueOf(objArr[2])))) == null) {
            return null;
        }
        a(context, valueOf, a2.iconAction, a2.actionUrl, "interactRightAnim");
        return a2;
    }

    public void g(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("683710cd", new Object[]{this, str, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        String uuid = UUID.randomUUID().toString();
        HashMap hashMap = new HashMap();
        hashMap.put("clickId", uuid);
        hashMap.put("componentName", str);
        InteractiveComponent a2 = a(str);
        if (a2 != null && !a2.isLoadComponentComplete()) {
            pnj m = pmd.a().m();
            String str2 = f22100a;
            m.a(str2, "openComponentLayer isInitStatus " + str);
            qnh.a(this.c, 19999, "ComponentClick_noInit", hashMap);
            if (pmd.a().u() != null && pmd.a().u().c() != null && com.taobao.taolive.sdk.utils.b.d(pmd.a().u().c())) {
                Toast.makeText(pmd.a().u().c(), "抱歉，组件还未加载完成", 1).show();
            }
        }
        map.put("componentName", str);
        map.put("clickTime", Long.valueOf(System.nanoTime()));
        map.put("clickId", uuid);
        map.put("queryParams", this.c.o().a());
        qnh.a(this.c, 19999, "ComponentClick", hashMap);
        this.c.a("TBLiveWeex.Event.openComponent", map);
        if (this.c.r().o() == null) {
            return;
        }
        this.c.r().o().accessListener(AccessListenerEnum.onFloatViewShow, new Object[0]);
    }

    public void h(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c989ad6c", new Object[]{this, str, map});
        } else if (a(str) == null) {
        } else {
            qnh.a(this.c, 19999, "ComponentClickResponse", map);
        }
    }

    public void i(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2adc4a0b", new Object[]{this, str, map});
        } else if (a(str) == null) {
        } else {
            map.put("componentName", str);
            map.put("queryParams", this.c.o().a());
            this.c.a("TBLiveWeex.Event.openComponent", map);
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.f;
    }

    public boolean a(String str, boolean z, boolean z2, String str2, float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3021cac8", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, new Float(f), new Float(f2), new Float(f3)})).booleanValue();
        }
        pnj m = pmd.a().m();
        String str3 = f22100a;
        m.a(str3, "addShowComponentList componentName " + str + " isShowComponent " + z);
        if (!qne.q() || !qne.c(str)) {
            return false;
        }
        if (z) {
            this.j.add(str);
        } else {
            this.j.remove(str);
        }
        com.taobao.tbliveinteractive.container.h5.b bVar = this.g;
        if (bVar != null) {
            View j = bVar.j();
            boolean h = h();
            if (z2) {
                this.g.a(h, str2, f, f2, f3);
            }
            if (j instanceof DWPenetrateFrameLayout) {
                pnj m2 = pmd.a().m();
                String str4 = f22100a;
                m2.a(str4, "addShowComponentList componentName " + str + " isShowComponent " + z + " hasShowingComponent " + h());
                ((DWPenetrateFrameLayout) j).setHasShowingComponent(h);
            }
        }
        return true;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : !this.j.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.taobao.tbliveinteractive.InteractiveComponent r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tbliveinteractive.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r1[r3] = r7
            java.lang.String r7 = "855a8723"
            r0.ipc$dispatch(r7, r1)
            return
        L15:
            java.util.List<com.taobao.tbliveinteractive.InteractiveComponent> r0 = r6.m
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            com.taobao.tbliveinteractive.InteractiveComponent r1 = (com.taobao.tbliveinteractive.InteractiveComponent) r1
            java.lang.String r4 = r7.name
            java.lang.String r5 = r1.name
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L3b
            java.lang.String r4 = r7.fedName
            java.lang.String r5 = r1.fedName
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L1b
        L3b:
            java.util.List<com.taobao.tbliveinteractive.InteractiveComponent> r0 = r6.m
            r0.remove(r1)
            boolean r0 = r7.isNeedShowEntrance
            if (r0 == 0) goto L4b
            java.util.List<com.taobao.tbliveinteractive.InteractiveComponent> r0 = r6.m
            r0.add(r7)
            goto L4b
        L4a:
            r2 = 1
        L4b:
            if (r2 == 0) goto L56
            boolean r0 = r7.isNeedShowEntrance
            if (r0 == 0) goto L56
            java.util.List<com.taobao.tbliveinteractive.InteractiveComponent> r0 = r6.m
            r0.add(r7)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbliveinteractive.b.b(com.taobao.tbliveinteractive.InteractiveComponent):void");
    }

    public void c(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8690da02", new Object[]{this, interactiveComponent});
        } else {
            this.m.remove(interactiveComponent);
        }
    }
}
