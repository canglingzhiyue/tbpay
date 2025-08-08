package com.taobao.android.detail.core.detail.popup;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ehs;
import tb.emu;
import tb.epo;
import tb.epz;
import tb.kge;

/* loaded from: classes4.dex */
public class c implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POPUP_WINDOW_DEFAULT = "default";

    /* renamed from: a  reason: collision with root package name */
    public List<IDMComponent> f9638a;
    private Context b;
    private com.taobao.android.detail.datasdk.model.datamodel.node.b c;
    private Map<String, IDMComponent> d;

    static {
        kge.a(-957580717);
        kge.a(214134139);
    }

    public static /* synthetic */ JSONObject a(c cVar, ActionModel actionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("135a930d", new Object[]{cVar, actionModel, jSONObject}) : cVar.a(actionModel, jSONObject);
    }

    public static /* synthetic */ void a(c cVar, e eVar, List list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b088f9", new Object[]{cVar, eVar, list, jSONObject});
        } else {
            cVar.a(eVar, list, jSONObject);
        }
    }

    public c(Context context) {
        this.b = context;
        emu.a("com.taobao.android.detail.core.detail.popup.DefaultPopupWindowHandler");
    }

    @Override // com.taobao.android.detail.core.detail.popup.f
    public void a(HashMap<String, Object> hashMap, final e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76938ed", new Object[]{this, hashMap, eVar});
        } else if (hashMap == null || eVar == null) {
        } else {
            final ActionModel actionModel = (ActionModel) hashMap.get(f.SRC);
            Map map = (Map) hashMap.get(f.EXTRA);
            this.f9638a = new ArrayList();
            if (map != null && actionModel != null) {
                com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar = (com.taobao.android.detail.datasdk.model.viewmodel.main.b) map.get(ehs.EVENT_EXTRA_VIEWMODEL);
                com.taobao.android.ultron.common.model.b a2 = a(actionModel, bVar, (JSONArray) map.get(ehs.EVENT_EXTRA_EVENT_SRC));
                if (a2 != null && a2.getComponents() != null) {
                    this.f9638a.addAll(a2.getComponents());
                    c(this.f9638a);
                    this.c = bVar.mNodeBundle;
                    AsyncRequestParams a3 = a(actionModel);
                    if (a3 != null && a3.isValid()) {
                        new AsyncRequestClient(this.b, a3, epo.f(), new MtopRequestListener<JSONObject>() { // from class: com.taobao.android.detail.core.detail.popup.c.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.detail.core.request.c
                            public /* synthetic */ void b(Object obj) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                                } else {
                                    a((JSONObject) obj);
                                }
                            }

                            public void a(JSONObject jSONObject) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                                    return;
                                }
                                c cVar = c.this;
                                c.a(cVar, eVar, cVar.f9638a, c.a(c.this, actionModel, jSONObject));
                            }

                            @Override // com.taobao.android.detail.core.request.c
                            public void a(MtopResponse mtopResponse) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                                } else {
                                    eVar.b(null);
                                }
                            }
                        }).execute();
                        return;
                    } else {
                        a(eVar, this.f9638a, (JSONObject) null);
                        return;
                    }
                }
                eVar.b(null);
                return;
            }
            eVar.b(null);
        }
    }

    private void a(e eVar, List<IDMComponent> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3146f6ef", new Object[]{this, eVar, list, jSONObject});
            return;
        }
        try {
            eVar.a(a(list, jSONObject));
        } catch (Throwable unused) {
            eVar.b(null);
        }
    }

    private AsyncRequestParams a(ActionModel actionModel) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AsyncRequestParams) ipChange.ipc$dispatch("38d9db97", new Object[]{this, actionModel});
        }
        if (actionModel.params != null && (jSONObject = actionModel.params.getJSONObject("request")) != null) {
            return new AsyncRequestParams(jSONObject);
        }
        return null;
    }

    private JSONObject a(ActionModel actionModel, JSONObject jSONObject) {
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9763d1d7", new Object[]{this, actionModel, jSONObject});
        }
        if (jSONObject == null || actionModel.params == null) {
            return null;
        }
        JSONObject jSONObject2 = actionModel.params.getJSONObject(HttpHeaderConstant.KEY_EXTDATA);
        if (((DetailCoreActivity) this.b).y() == null || (bVar = this.c) == null) {
            return null;
        }
        JSONObject jSONObject3 = (JSONObject) epz.a(bVar.a(), jSONObject2);
        if (jSONObject3 != null) {
            jSONObject.putAll(jSONObject3);
        }
        return jSONObject;
    }

    public b a(List<IDMComponent> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8b3cec22", new Object[]{this, list, jSONObject});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        this.d = a(list);
        IDMComponent iDMComponent = this.d.get("header");
        IDMComponent iDMComponent2 = this.d.get("footer");
        IDMComponent iDMComponent3 = this.d.get("popup_body");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (iDMComponent != null && iDMComponent.getChildren() != null) {
            arrayList3.addAll(iDMComponent.getChildren());
        }
        if (iDMComponent2 != null && iDMComponent2.getChildren() != null) {
            arrayList.addAll(iDMComponent2.getChildren());
        }
        if (iDMComponent3 != null && iDMComponent3.getChildren() != null) {
            arrayList2.addAll(iDMComponent3.getChildren());
        }
        i iVar = new i();
        iVar.b(arrayList2);
        iVar.a(arrayList3);
        iVar.c(arrayList);
        return new d(this.b, iVar, jSONObject, this.c);
    }

    private Map<String, IDMComponent> a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71436bce", new Object[]{this, list});
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.clear();
        for (IDMComponent iDMComponent : list) {
            IDMComponent parent = iDMComponent.getParent();
            if (parent != null) {
                String tag = parent.getTag();
                if (!StringUtils.isEmpty(tag)) {
                    this.d.put(tag, parent);
                }
            }
        }
        return this.d;
    }

    @Override // com.taobao.android.detail.core.detail.popup.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<IDMComponent> list = this.f9638a;
        if (list != null) {
            b(list);
            this.f9638a.clear();
            this.f9638a = null;
        }
        Map<String, IDMComponent> map = this.d;
        if (map != null) {
            map.clear();
        }
        this.c = null;
    }

    private void b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list != null) {
            for (IDMComponent iDMComponent : list) {
                iDMComponent.rollBack();
            }
        }
    }

    private void c(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else if (list != null) {
            for (IDMComponent iDMComponent : list) {
                iDMComponent.record();
            }
        }
    }

    private com.taobao.android.ultron.common.model.b a(ActionModel actionModel, com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar, JSONArray jSONArray) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("7e67b79c", new Object[]{this, actionModel, bVar, jSONArray});
        }
        if (bVar == null || jSONArray == null || bVar.dmComponent == null || bVar.dmComponent == null) {
            return null;
        }
        JSONObject events = bVar.dmComponent.getEvents();
        String b = b(actionModel);
        if (StringUtils.isEmpty(b)) {
            return null;
        }
        Iterator<Map.Entry<String, Object>> it = events.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            Map.Entry<String, Object> next = it.next();
            if (a(next.getValue(), actionModel.type, b)) {
                str = next.getKey();
                break;
            }
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        for (com.taobao.android.ultron.common.model.b bVar2 : bVar.dmComponent.getEventMap().get(str)) {
            if (bVar2.getType().equals(actionModel.type)) {
                return bVar2;
            }
        }
        return null;
    }

    private boolean a(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d7b755c", new Object[]{this, obj, str, str2})).booleanValue();
        }
        if (!(obj instanceof JSONArray)) {
            return false;
        }
        JSONArray jSONArray = (JSONArray) obj;
        for (int i = 0; i < jSONArray.size(); i++) {
            ActionModel actionModel = new ActionModel((JSONObject) jSONArray.get(i));
            String str3 = actionModel.type;
            String b = b(actionModel);
            if (b != null && str3 != null && str3.equals(str) && b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private String b(ActionModel actionModel) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0401e06", new Object[]{this, actionModel});
        }
        if (actionModel != null && (jSONObject = actionModel.params) != null) {
            return jSONObject.getString("nextRenderRoot");
        }
        return null;
    }
}
