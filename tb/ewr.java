package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ActionModel;
import com.taobao.android.detail.sdk.model.template.DescModel;
import com.taobao.android.detail.sdk.model.template.a;
import com.taobao.android.detail.sdk.model.template.b;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import com.taobao.android.detail.sdk.vmodel.desc.e;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class ewr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ewq f27616a;

    static {
        kge.a(1259763249);
    }

    public ewq a(String str) {
        JSONObject parseObject;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewq) ipChange.ipc$dispatch("7c6f03f5", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("weexData");
        ewp ewpVar = jSONObject2 != null ? new ewp(jSONObject2) : null;
        JSONObject jSONObject3 = jSONObject.getJSONObject("components");
        if (jSONObject3 == null) {
            return null;
        }
        DescModel a2 = a(jSONObject3);
        if (a2 == null && ewpVar == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(XslMUSComponent.KEY_REQUEST_API);
        ewq ewqVar = new ewq(a(a2));
        ewqVar.d = ewpVar;
        if (a2 != null) {
            if (jSONArray != null && !jSONArray.isEmpty()) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    a2.requestApis.add(new b(jSONArray.getString(i)));
                }
                ewqVar.a(a2.requestApis);
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("page");
            if (jSONObject4 != null) {
                a2.actionModels = c.a(jSONObject4.getJSONArray("pageActions"), new g<ActionModel>() { // from class: tb.ewr.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.template.ActionModel] */
                    @Override // com.taobao.android.detail.sdk.utils.g
                    public /* synthetic */ ActionModel b(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public ActionModel a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (ActionModel) ipChange2.ipc$dispatch("fa7c12bd", new Object[]{this, obj}) : new ActionModel(new ActionModel((JSONObject) obj));
                    }
                });
            }
            ewqVar.b(a2.actionModels);
        }
        ewqVar.e = jSONObject.getString("abtestParam");
        this.f27616a = ewqVar;
        return ewqVar;
    }

    public ewq b(String str) {
        ewq ewqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewq) ipChange.ipc$dispatch("7d1baf94", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return this.f27616a;
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            return this.f27616a;
        }
        JSONObject jSONObject = parseObject.getJSONObject("data");
        if (jSONObject == null || jSONObject.isEmpty()) {
            return this.f27616a;
        }
        synchronized (this.f27616a) {
            HashMap<String, DescModel> hashMap = new HashMap<>();
            for (String str2 : jSONObject.keySet()) {
                hashMap.put(str2, a(jSONObject.getJSONObject(str2)));
            }
            a aVar = new a();
            aVar.f10306a = hashMap;
            ewqVar = new ewq(a(this.f27616a.f10331a, aVar));
            ewqVar.b = this.f27616a.b;
            this.f27616a = ewqVar;
        }
        return ewqVar;
    }

    private DescModel a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DescModel) ipChange.ipc$dispatch("e7a6c654", new Object[]{this, jSONObject});
        }
        ewo ewoVar = new ewo();
        JSONArray jSONArray = jSONObject.getJSONArray("layout");
        JSONObject jSONObject2 = jSONObject.getJSONObject("componentData");
        JSONObject jSONObject3 = jSONObject.getJSONObject("componentActions");
        if (jSONArray == null || jSONObject2 == null || jSONObject2.isEmpty()) {
            return null;
        }
        ewoVar.a(jSONObject2);
        ewoVar.b(jSONObject3);
        return ewoVar.a(jSONArray);
    }

    public ArrayList<e> a(DescModel descModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("8e233888", new Object[]{this, descModel});
        }
        if (descModel == null || descModel.components == null) {
            return null;
        }
        com.taobao.android.detail.sdk.factory.manager.b a2 = com.taobao.android.detail.sdk.factory.manager.b.a();
        ArrayList<e> arrayList = new ArrayList<>();
        int size = descModel.components.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            e a3 = a2.a(descModel.components.get(i2));
            if (a3 != null && !a3.a()) {
                com.taobao.android.detail.sdk.vmodel.desc.g c = a3.c();
                if (c != null) {
                    c.i = i;
                    c.j = i;
                    arrayList.add(c);
                    i++;
                }
                a3.i = i;
                a3.j = i;
                arrayList.add(a3);
                i++;
            }
        }
        return arrayList;
    }

    public ArrayList<e> a(List<e> list, a aVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("35cee370", new Object[]{this, list, aVar});
        }
        int size = list.size();
        ArrayList<e> arrayList = new ArrayList<>();
        int i2 = size;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = list.get(i4);
            if (aVar.a(eVar.k)) {
                ArrayList<e> a2 = a(aVar.f10306a.get(eVar.k));
                if (a2 != null) {
                    Iterator<e> it = a2.iterator();
                    while (it.hasNext()) {
                        e next = it.next();
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
