package tb;

import com.alibaba.android.ultron.event.base.b;
import com.alibaba.android.ultron.event.model.a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes7.dex */
public class mwq implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private mwo f31303a;
    private qnp b = new qnp();

    static {
        kge.a(-1084016271);
        kge.a(-160176441);
    }

    public mwq(mwo mwoVar) {
        this.f31303a = mwoVar;
    }

    @Override // com.alibaba.android.ultron.event.base.b
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d131e5eb", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            com.alibaba.android.ultron.vfw.instance.b a2 = aVar.a();
            IDMComponent iDMComponent = (IDMComponent) aVar.a(com.alibaba.android.ultron.event.b.KEY_COMPONENT);
            MtopResponse mtopResponse = (MtopResponse) aVar.a("mtopResponse");
            JSONArray jSONArray = (JSONArray) aVar.a(com.alibaba.android.ultron.event.b.KEY_TARGET_COMPONENTS);
            if (a2 == null || mtopResponse == null) {
                return;
            }
            JSONObject jSONObject = null;
            try {
                jSONObject = JSON.parseObject(mtopResponse.getDataJsonObject().toString());
            } catch (Exception unused) {
            }
            if (jSONObject == null || jSONObject.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (jSONArray == null) {
                if (!a(iDMComponent, jSONObject.getJSONObject(iDMComponent.getKey()))) {
                    return;
                }
                arrayList.add(iDMComponent);
                aVar.a(com.alibaba.android.ultron.event.b.KEY_NEED_REFRESH_COMPONENTS, arrayList);
                return;
            }
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    String str = (String) next;
                    IDMComponent b = a2.b().b(str);
                    if (a(b, jSONObject.getJSONObject(str))) {
                        arrayList.add(b);
                    }
                }
            }
            mwo mwoVar = this.f31303a;
            if (mwoVar != null) {
                mwoVar.a(arrayList);
            }
            aVar.a(com.alibaba.android.ultron.event.b.KEY_NEED_REFRESH_COMPONENTS, arrayList);
        }
    }

    private boolean a(IDMComponent iDMComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca1a8088", new Object[]{this, iDMComponent, jSONObject})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getData() == null || jSONObject == null) {
            return false;
        }
        JSONObject data = iDMComponent.getData();
        if ("benefitModule2024V2_1".equals(iDMComponent.getKey()) || "headerModule_11".equals(iDMComponent.getKey())) {
            this.b.b(jSONObject, data, false, mxe.INSTANCE.c() == 1);
        }
        if (jSONObject.containsKey("fields")) {
            data.put("fields", (Object) jSONObject.getJSONObject("fields"));
        }
        if (jSONObject.containsKey("events")) {
            data.put("events", (Object) jSONObject.getJSONObject("events"));
        }
        iDMComponent.writeBackDataAndReloadEvent(data, true);
        return true;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f31303a = null;
        }
    }
}
