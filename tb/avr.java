package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model.AsyncModule;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.awa;

@AURAExtensionImpl(code = "aura.impl.event.asyncMR")
/* loaded from: classes2.dex */
public final class avr extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_EXT_PARAMS_ASYNC_MODULE = "asyncModule";
    public static final String EVENT_TYPE = "asyncMR";

    /* renamed from: a  reason: collision with root package name */
    private AURAGlobalData f25638a;

    static {
        kge.a(-1153015657);
    }

    public static /* synthetic */ Object ipc$super(avr avrVar, String str, Object... objArr) {
        if (str.hashCode() == 563256106) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : EVENT_TYPE;
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        s b = b().b();
        if (b == null) {
            arc.a().c("AURAAsyncModuleEvent", "innerHandleEvent", "auraInstance is null");
            return;
        }
        d eventModel = aURAEventIO.getEventModel();
        AURARenderComponent d = eventModel.d();
        if (d == null) {
            arc.a().c("AURAAsyncModuleEvent", "innerHandleEvent", "component is null");
            return;
        }
        AsyncModule asyncModule = (AsyncModule) eventModel.c(EVENT_EXT_PARAMS_ASYNC_MODULE);
        if (asyncModule == null) {
            arc.a().c("AURAAsyncModuleEvent", "innerHandleEvent", "asyncModule is null");
        } else {
            new avz(b, d, asyncModule, new a(b, d, asyncModule, this.f25638a)).a();
        }
    }

    @Override // tb.arv, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.f25638a = aURAGlobalData;
    }

    /* loaded from: classes2.dex */
    public static class a implements awa.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public s f25639a;
        public AURARenderComponent b;
        public AsyncModule c;
        public AURAGlobalData d;

        static {
            kge.a(-965422107);
            kge.a(-2067717629);
        }

        public a(s sVar, AURARenderComponent aURARenderComponent, AsyncModule asyncModule, AURAGlobalData aURAGlobalData) {
            this.f25639a = sVar;
            this.b = aURARenderComponent;
            this.c = asyncModule;
            this.d = aURAGlobalData;
        }

        @Override // tb.awa.a
        public void a(JSONObject jSONObject) {
            AURARenderComponent a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else if (a(jSONObject, this.c.condition)) {
                a("AURANextRPCServiceDomain", "filter by vif");
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(a(jSONObject, this.c.kvMappings, this.b));
                arrayList.add(a(true, this.c.r, this.b));
                if (this.c.relateComponents != null && !this.c.relateComponents.isEmpty()) {
                    for (AsyncModule.RelateComponent relateComponent : this.c.relateComponents) {
                        if (relateComponent != null && (a2 = a(relateComponent.target)) != null) {
                            if (a(jSONObject, relateComponent.condition)) {
                                arrayList.add(a(false, relateComponent.r, a2));
                            } else {
                                arrayList.add(a(jSONObject, relateComponent.kvMappings, a2));
                                arrayList.add(a(true, relateComponent.r, a2));
                            }
                        }
                    }
                }
                this.f25639a.a("aura.workflow.adjustRules", new UMFRuleIO(arrayList), null);
                a(true);
            }
        }

        @Override // tb.awa.a
        public void a(String str, String str2) {
            AURARenderComponent a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(a(false, this.c.r, this.b));
            if (this.c.relateComponents != null && !this.c.relateComponents.isEmpty()) {
                for (AsyncModule.RelateComponent relateComponent : this.c.relateComponents) {
                    if (relateComponent != null && (a2 = a(relateComponent.target)) != null) {
                        arrayList.add(a(false, relateComponent.r, a2));
                    }
                }
            }
            this.f25639a.a("aura.workflow.adjustRules", new UMFRuleIO(arrayList), null);
            a(false);
        }

        private com.alibaba.android.umf.datamodel.service.rule.a a(JSONObject jSONObject, List<AsyncModule.KVMapping> list, AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.alibaba.android.umf.datamodel.service.rule.a) ipChange.ipc$dispatch("8dc87189", new Object[]{this, jSONObject, list, aURARenderComponent});
            }
            JSONObject jSONObject2 = new JSONObject();
            if (list != null && !list.isEmpty()) {
                jSONObject2.put("kvmap", JSONArray.toJSON(list));
            }
            jSONObject2.put("data", (Object) jSONObject);
            return bbg.a("kvmap", aURARenderComponent, jSONObject2);
        }

        private com.alibaba.android.umf.datamodel.service.rule.a a(boolean z, AsyncModule.RModel rModel, AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.alibaba.android.umf.datamodel.service.rule.a) ipChange.ipc$dispatch("73048505", new Object[]{this, new Boolean(z), rModel, aURARenderComponent});
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                if (rModel != null && rModel.successCallback != null && rModel.successCallback.payload != null) {
                    jSONObject.putAll(rModel.successCallback.payload);
                }
            } else if (rModel != null && rModel.failedCallback != null && rModel.failedCallback.payload != null) {
                jSONObject.putAll(rModel.failedCallback.payload);
            }
            return bbg.a(RuleType.PROPS_WRITE_BACK, aURARenderComponent, jSONObject);
        }

        private boolean a(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("48075356", new Object[]{this, jSONObject, str})).booleanValue();
            }
            if (TextUtils.isEmpty(str) || !str.matches("^\\$\\{.+\\}$")) {
                return false;
            }
            try {
                return biy.a(str, jSONObject);
            } catch (Exception e) {
                arc.a().c("AURAAsyncModuleEvent", "filterByVIf", e.toString());
                return true;
            }
        }

        private void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            List<JSONObject> list = null;
            if (z) {
                if (this.c.r != null && this.c.r.successCallback != null) {
                    list = this.c.r.successCallback.events;
                }
            } else if (this.c.r != null && this.c.r.failedCallback != null) {
                list = this.c.r.failedCallback.events;
            }
            if (list == null) {
                return;
            }
            for (JSONObject jSONObject : list) {
                if (jSONObject != null) {
                    String string = jSONObject.getString("type");
                    if (!TextUtils.isEmpty(string)) {
                        d dVar = new d();
                        dVar.a(this.b);
                        dVar.a("" + System.currentTimeMillis());
                        dVar.a(jSONObject.getJSONObject("fields"));
                        c.a(this.f25639a, string, dVar);
                    }
                }
            }
        }

        private AURARenderComponent a(String str) {
            List list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURARenderComponent) ipChange.ipc$dispatch("cb48fc1d", new Object[]{this, str});
            }
            if (this.d != null && !TextUtils.isEmpty(str) && (list = (List) this.d.get("render_view_item_models", List.class)) != null && !list.isEmpty()) {
                for (Object obj : list) {
                    if (obj instanceof AURARenderComponent) {
                        AURARenderComponent aURARenderComponent = (AURARenderComponent) obj;
                        if (TextUtils.equals(aURARenderComponent.key, str)) {
                            return aURARenderComponent;
                        }
                    }
                }
            }
            return null;
        }
    }
}
