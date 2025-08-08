package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.DescModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.a;
import com.taobao.android.detail.datasdk.model.datamodel.template.b;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class enm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private enl f27470a;
    private Context b;

    static {
        kge.a(1222638068);
    }

    public enm(Context context) {
        this.b = context;
        emu.a("com.taobao.android.detail.datasdk.engine.structure.desc.DetailDescStructureEngine");
    }

    public enl a(String str) {
        JSONObject parseObject;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enl) ipChange.ipc$dispatch("7c6ee191", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null || (jSONObject = parseObject.getJSONObject("data")) == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("weexData");
        enk enkVar = jSONObject2 != null ? new enk(jSONObject2) : null;
        JSONObject jSONObject3 = jSONObject.getJSONObject("components");
        if (jSONObject3 == null) {
            return null;
        }
        DescModel a2 = a(jSONObject3);
        if (a2 == null && enkVar == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(XslMUSComponent.KEY_REQUEST_API);
        enl enlVar = new enl(a(a2));
        enlVar.d = enkVar;
        if (a2 != null) {
            if (jSONArray != null && !jSONArray.isEmpty()) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    a2.requestApis.add(new b(jSONArray.getString(i)));
                }
                enlVar.a(a2.requestApis);
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("page");
            if (jSONObject4 != null) {
                a2.actionModels = epw.a(jSONObject4.getJSONArray("pageActions"), new epy<ActionModel>() { // from class: tb.enm.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel, java.lang.Object] */
                    @Override // tb.epy
                    public /* synthetic */ ActionModel b(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public ActionModel a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (ActionModel) ipChange2.ipc$dispatch("344c7c83", new Object[]{this, obj}) : new ActionModel(new ActionModel((JSONObject) obj));
                    }
                });
            }
            enlVar.a(this.b, a2.actionModels);
        }
        enlVar.e = jSONObject.getString("abtestParam");
        this.f27470a = enlVar;
        return enlVar;
    }

    public enl b(String str) {
        enl enlVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enl) ipChange.ipc$dispatch("7d1b8d30", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return this.f27470a;
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            return this.f27470a;
        }
        JSONObject jSONObject = parseObject.getJSONObject("data");
        if (jSONObject == null || jSONObject.isEmpty()) {
            return this.f27470a;
        }
        synchronized (this.f27470a) {
            HashMap<String, DescModel> hashMap = new HashMap<>();
            for (String str2 : jSONObject.keySet()) {
                hashMap.put(str2, a(jSONObject.getJSONObject(str2)));
            }
            a aVar = new a();
            aVar.f10062a = hashMap;
            enlVar = new enl(a(this.f27470a.f27460a, aVar));
            enlVar.b = this.f27470a.b;
            this.f27470a = enlVar;
        }
        return enlVar;
    }

    private DescModel a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DescModel) ipChange.ipc$dispatch("1162509a", new Object[]{this, jSONObject});
        }
        enj enjVar = new enj(this.b);
        JSONArray jSONArray = jSONObject.getJSONArray("layout");
        JSONObject jSONObject2 = jSONObject.getJSONObject("componentData");
        JSONObject jSONObject3 = jSONObject.getJSONObject("componentActions");
        if (jSONArray == null || jSONObject2 == null || jSONObject2.isEmpty()) {
            return null;
        }
        enjVar.a(jSONObject2);
        enjVar.b(jSONObject3);
        return enjVar.a(jSONArray);
    }

    public ArrayList<epf> a(DescModel descModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ca4eaf8e", new Object[]{this, descModel});
        }
        if (descModel == null || descModel.components == null) {
            return null;
        }
        com.taobao.android.detail.datasdk.factory.manager.b l = emx.a(this.b).b().l();
        ArrayList<epf> arrayList = new ArrayList<>();
        int size = descModel.components.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            epf a2 = l.a(descModel.components.get(i2));
            if (a2 != null && !a2.a()) {
                eph b = a2.b();
                if (b != null) {
                    b.r = i;
                    b.s = i;
                    arrayList.add(b);
                    i++;
                }
                a2.r = i;
                a2.s = i;
                arrayList.add(a2);
                i++;
            }
        }
        return arrayList;
    }

    public ArrayList<epf> a(List<epf> list, a aVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d3e3a6b6", new Object[]{this, list, aVar});
        }
        int size = list.size();
        ArrayList<epf> arrayList = new ArrayList<>();
        int i2 = size;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            epf epfVar = list.get(i4);
            if (aVar.a(epfVar.t)) {
                ArrayList<epf> a2 = a(aVar.f10062a.get(epfVar.t));
                if (a2 != null) {
                    Iterator<epf> it = a2.iterator();
                    while (it.hasNext()) {
                        epf next = it.next();
                        if (next != null && !epfVar.a()) {
                            next.s = i2;
                            next.r = i3;
                            arrayList.add(next);
                            i3++;
                            i2++;
                        }
                    }
                } else {
                    i = i3 + 1;
                    epfVar.r = i3;
                    arrayList.add(epfVar);
                }
            } else {
                i = i3 + 1;
                epfVar.r = i3;
                arrayList.add(epfVar);
            }
            i3 = i;
        }
        return arrayList;
    }
}
