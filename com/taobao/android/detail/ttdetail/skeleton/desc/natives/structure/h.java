package com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private g f10864a;
    private Context b;

    static {
        kge.a(-1026470411);
    }

    public h(Context context) {
        this.b = context;
    }

    public g a(String str) {
        JSONObject parseObject;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("f5da2c6a", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("weexData");
        f fVar = jSONObject2 != null ? new f(jSONObject2) : null;
        JSONObject jSONObject3 = jSONObject.getJSONObject("components");
        if (jSONObject3 == null) {
            return null;
        }
        DescModel a2 = a(jSONObject3);
        if (a2 == null && fVar == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(XslMUSComponent.KEY_REQUEST_API);
        g gVar = new g(a(a2));
        gVar.b = fVar;
        if (a2 != null) {
            if (jSONArray != null && !jSONArray.isEmpty()) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    a2.requestApis.add(new e(jSONArray.getString(i)));
                }
                gVar.a(a2.requestApis);
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("page");
            if (jSONObject4 != null) {
                a2.actionModels = i.a(jSONObject4.getJSONArray("pageActions"), new k<ActionModel>() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.h.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ActionModel] */
                    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.k
                    public /* synthetic */ ActionModel b(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public ActionModel a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (ActionModel) ipChange2.ipc$dispatch("e065400c", new Object[]{this, obj}) : new ActionModel(new ActionModel((JSONObject) obj));
                    }
                });
            }
            gVar.a(this.b, a2.actionModels);
        }
        gVar.c = jSONObject.getString("abtestParam");
        this.f10864a = gVar;
        return gVar;
    }

    public g b(String str) {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("f500bbc9", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return this.f10864a;
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            return this.f10864a;
        }
        JSONObject jSONObject = parseObject.getJSONObject("data");
        if (jSONObject == null || jSONObject.isEmpty()) {
            return this.f10864a;
        }
        synchronized (this.f10864a) {
            HashMap<String, DescModel> hashMap = new HashMap<>();
            for (String str2 : jSONObject.keySet()) {
                hashMap.put(str2, a(jSONObject.getJSONObject(str2)));
            }
            c cVar = new c();
            cVar.f10857a = hashMap;
            gVar = new g(a(this.f10864a.d, cVar));
            gVar.f10863a = this.f10864a.f10863a;
            this.f10864a = gVar;
        }
        return gVar;
    }

    private DescModel a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DescModel) ipChange.ipc$dispatch("6fd16663", new Object[]{this, jSONObject});
        }
        d dVar = new d(this.b);
        JSONArray jSONArray = jSONObject.getJSONArray("layout");
        JSONObject jSONObject2 = jSONObject.getJSONObject("componentData");
        JSONObject jSONObject3 = jSONObject.getJSONObject("componentActions");
        if (jSONArray == null || jSONObject2 == null || jSONObject2.isEmpty()) {
            return null;
        }
        dVar.a(jSONObject2);
        dVar.b(jSONObject3);
        return dVar.a(jSONArray);
    }

    public ArrayList<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> a(DescModel descModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("7a913b97", new Object[]{this, descModel});
        }
        if (descModel == null || descModel.components == null) {
            return null;
        }
        ArrayList<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> arrayList = new ArrayList<>();
        int size = descModel.components.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e a2 = com.taobao.android.detail.ttdetail.skeleton.desc.natives.e.a(descModel.components.get(i2));
            if (a2 != null && !a2.a()) {
                com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.g g = a2.g();
                if (g != null) {
                    g.i = i;
                    g.j = i;
                    arrayList.add(g);
                    i++;
                }
                a2.i = i;
                a2.j = i;
                arrayList.add(a2);
                i++;
            }
        }
        return arrayList;
    }

    public ArrayList<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> a(List<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> list, c cVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("fc2d287d", new Object[]{this, list, cVar});
        }
        int size = list.size();
        ArrayList<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> arrayList = new ArrayList<>();
        int i2 = size;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e eVar = list.get(i4);
            if (cVar.a(eVar.k)) {
                ArrayList<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> a2 = a(cVar.f10857a.get(eVar.k));
                if (a2 != null) {
                    Iterator<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> it = a2.iterator();
                    while (it.hasNext()) {
                        com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e next = it.next();
                        if (next != null && !eVar.a()) {
                            next.j = i2;
                            next.i = i3;
                            arrayList.add(next);
                            i3++;
                            i2++;
                        }
                    }
                } else {
                    i = i3 + 1;
                    eVar.i = i3;
                    arrayList.add(eVar);
                }
            } else {
                i = i3 + 1;
                eVar.i = i3;
                arrayList.add(eVar);
            }
            i3 = i;
        }
        return arrayList;
    }
}
