package tb;

import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.q;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.detail.mainpic.f;
import com.taobao.android.detail.mainpic.g;
import com.taobao.android.detail.mainpic.holder.j;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ae;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.List;
import tb.bga;

/* loaded from: classes4.dex */
public class eum extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public f f27585a;

    public static /* synthetic */ Object ipc$super(eum eumVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public eum(f fVar) {
        this.f27585a = fVar;
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        IDMComponent d = eVar.d();
        try {
            d dVar = (d) eVar.h();
            JSONObject fields = ((DMEvent) eVar.i()).getFields();
            String string = fields.getString("imageUrl");
            String key = d.getKey();
            JSONObject parseObject = JSON.parseObject(d.getData().toJSONString());
            JSONObject jSONObject = parseObject.getJSONObject("fields");
            String string2 = jSONObject.getString("mainImageUrl");
            if (string2 != null && string2.equals(string)) {
                jSONObject.remove("originImageUrl");
            } else {
                jSONObject.put("originImageUrl", (Object) string2);
            }
            jSONObject.put("mainImageUrl", (Object) string);
            a(jSONObject, string);
            parseObject.put("fields", (Object) jSONObject);
            DMComponent dMComponent = new DMComponent(parseObject, d.getContainerType(), d.getContainerInfo());
            dMComponent.setComponentKey(key);
            g j = this.f27585a.j();
            IDMComponent i = this.f27585a.i();
            IDMComponent a2 = a(j, i);
            euq.e(a2);
            IDMComponent a3 = euq.a(a2, com.taobao.android.detail.mainpic.holder.e.e);
            euq.a(a3, "url", string);
            JSONObject a4 = euq.a(euq.a(i, j.e), "itemClick", "userTrack", "Page_Detail_Button_BigPic");
            String string3 = fields.getString("skuId");
            String string4 = fields.getString(com.taobao.android.detail.core.aura.utils.g.KEY_PV_PATH);
            euq.a(a4, "skuid", string3);
            euq.a(a4, "pvpath", string4);
            a(dVar, dMComponent);
            if (j.m() == null || !(a3 instanceof DMComponent)) {
                return;
            }
            a(j.m(), (DMComponent) a3);
        } catch (Throwable th) {
            th.printStackTrace();
            bga.a.b(eux.b, ae.EVENT_TYPE, "70001", "Switch Main Image Exception");
        }
    }

    private IDMComponent a(g gVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("36a2103d", new Object[]{this, gVar, iDMComponent});
        }
        List<IDMComponent> a2 = a(gVar);
        if (a2 == null) {
            return null;
        }
        for (IDMComponent iDMComponent2 : a2) {
            if (euq.a(iDMComponent, iDMComponent2)) {
                return iDMComponent2;
            }
        }
        return null;
    }

    private List<IDMComponent> a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2411e16c", new Object[]{this, gVar});
        }
        List<IDMComponent> z = gVar.z();
        if (z != null) {
            return z;
        }
        for (IDMComponent iDMComponent : this.f.f().getChildren()) {
            if (iDMComponent != null && "lightoff".equals(iDMComponent.getPosition())) {
                return iDMComponent.getChildren();
            }
        }
        return z;
    }

    private void a(d dVar, DMComponent dMComponent) {
        DMComponent dMComponent2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad97b5b", new Object[]{this, dVar, dMComponent});
            return;
        }
        ArrayList arrayList = new ArrayList();
        String key = dMComponent.getKey();
        ArrayList arrayList2 = new ArrayList();
        for (IDMComponent iDMComponent : dVar.k().f()) {
            if (key.equals(iDMComponent.getKey())) {
                arrayList.add(dMComponent);
                dMComponent2 = dMComponent;
            } else {
                dMComponent2 = new DMComponent(iDMComponent.getData(), iDMComponent.getContainerType(), iDMComponent.getContainerInfo());
            }
            List<IDMComponent> children = iDMComponent.getChildren();
            if (children != null && children.size() != 0) {
                for (int i = 0; i < children.size(); i++) {
                    IDMComponent iDMComponent2 = children.get(i);
                    if (key.equals(iDMComponent2.getKey())) {
                        dMComponent2.addChild(dMComponent);
                        arrayList.add(dMComponent2);
                    } else {
                        dMComponent2.addChild(new DMComponent(iDMComponent2.getData(), iDMComponent2.getContainerType(), iDMComponent2.getContainerInfo()));
                    }
                }
                arrayList2.add(dMComponent2);
            }
        }
        dVar.k().b(arrayList2);
        dVar.a(arrayList);
    }

    private void a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(Constants.Name.Recycler.LIST_DATA);
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            JSONObject a2 = a(jSONObject3);
            if (a2 != null && (jSONObject2 = a2.getJSONObject("fields")) != null) {
                if (jSONObject2.getString("imageUrl").equals(str)) {
                    jSONObject3.put(ThemisConfig.SCENE_SELECT, "true");
                } else {
                    jSONObject3.put(ThemisConfig.SCENE_SELECT, "false");
                }
                jSONArray.set(i, jSONObject3);
            }
        }
        jSONObject.put(Constants.Name.Recycler.LIST_DATA, (Object) jSONArray);
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        Object obj = jSONObject.get("event");
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (String str : jSONObject2.getInnerMap().keySet()) {
                JSONArray jSONArray = jSONObject2.getJSONArray(str);
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    if (ae.EVENT_TYPE.equals(jSONObject3.getString("type"))) {
                        return jSONObject3;
                    }
                }
            }
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) obj;
            int size2 = jSONArray2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                if (ae.EVENT_TYPE.equals(jSONObject4.getString("type"))) {
                    return jSONObject4;
                }
            }
        }
        return null;
    }
}
