package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.parse.a;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.k;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.NUTFloatViewManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bse;

@AURAExtensionImpl(code = "aura.impl.event.popupWindow")
/* loaded from: classes2.dex */
public final class azp extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "popupWindow";

    /* renamed from: a  reason: collision with root package name */
    private final String f25718a = "aura_float_config.json";
    private final String b = "aura.workflow.float";
    private aqs c;
    private bav d;
    private NUTFloatViewManager e;
    private boolean f;
    private boolean g;

    static {
        kge.a(417481626);
    }

    public static /* synthetic */ Object ipc$super(azp azpVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : EVENT_TYPE;
    }

    public static /* synthetic */ JSONObject a(azp azpVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6c8722cb", new Object[]{azpVar, str}) : azpVar.a(str);
    }

    public static /* synthetic */ void a(azp azpVar, JSONObject jSONObject, AURARenderComponent aURARenderComponent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6a0a548", new Object[]{azpVar, jSONObject, aURARenderComponent, obj});
        } else {
            azpVar.a(jSONObject, aURARenderComponent, obj);
        }
    }

    @Override // tb.arv, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.d = new bav("AURAPopupWindowEvent");
        this.d.a(qVar.e(), i());
        this.f = bar.a("delayDestroyInstance", true);
    }

    @Override // tb.arv
    public void b(final AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        JSONObject f = f();
        if (bau.a(f)) {
            a(0, "-2000_INVALID_PROTOCOL", "浮层插件popupWindow事件输入的协议为校验失败");
        } else if (d(aURAEventIO)) {
        } else {
            Object c = c(aURAEventIO);
            if (!(c instanceof RenderComponent)) {
                a(0, "-1000_EMPTY_STATE", "浮层插件获取的popupWindowComponent为空");
                return;
            }
            RenderComponent renderComponent = (RenderComponent) c;
            final String str = renderComponent.key;
            if (StringUtils.isEmpty(str)) {
                a(0, "-1000_EMPTY_STATE", "浮层插件获取的popupWindowKey为空");
                return;
            }
            JSONObject a2 = a(renderComponent.component);
            final HashMap<String, Object> a3 = a(str, f);
            final NUTFloatViewManager.Builder floatParams = NUTFloatViewManager.b().floatType("aura").floatStyle(a(a2, aURAEventIO.getEventModel().c())).floatParams(a3);
            if (this.f) {
                floatParams.internalRecycleOnDismiss(false);
                NUTFloatViewManager nUTFloatViewManager = this.e;
                if (nUTFloatViewManager != null) {
                    nUTFloatViewManager.a();
                    this.e.c();
                }
            } else {
                floatParams.internalRecycleOnDismiss(true);
            }
            this.e = floatParams.build();
            this.e.a(b().e());
            a(this.e);
            this.e.a(new bse.a() { // from class: tb.azp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bse.a
                public boolean a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                    }
                    azp.a(azp.this, azp.a(azp.this, str), aURAEventIO.getEventModel().d(), a3.get("auraInstance"));
                    return !floatParams.getFloatStyle().i();
                }
            });
        }
    }

    private boolean d(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("639045db", new Object[]{this, aURAEventIO})).booleanValue();
        }
        for (hif hifVar : c().b(hif.class)) {
            if (hifVar.a(aURAEventIO)) {
                return true;
            }
        }
        return false;
    }

    private JSONObject a(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        JSONObject f = f();
        if (f != null && (jSONObject = f.getJSONObject("data")) != null) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    private void a(JSONObject jSONObject, AURARenderComponent aURARenderComponent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38979cf", new Object[]{this, jSONObject, aURARenderComponent, obj});
        } else if (!(obj instanceof s) || jSONObject == null) {
            arc.a().b("auraInstance or dataProtocol is null!!");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events");
            if (jSONObject2 == null) {
                return;
            }
            for (String str : jSONObject2.keySet()) {
                if ("onClose".equals(str)) {
                    c.a((s) obj, aURARenderComponent, jSONObject2.getJSONArray(str));
                }
            }
        }
    }

    private void a(NUTFloatViewManager nUTFloatViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40ecfda", new Object[]{this, nUTFloatViewManager});
            return;
        }
        AURAGlobalData d = d();
        if (d == null) {
            return;
        }
        d.update("auraFloatViewManager", nUTFloatViewManager);
    }

    private JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        AURAGlobalData d = d();
        if (d != null) {
            return (JSONObject) d.get("aura_data_protocol_json", JSONObject.class);
        }
        return null;
    }

    private bsq a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bsq) ipChange.ipc$dispatch("30040ade", new Object[]{this, jSONObject, jSONObject2});
        }
        bsq bsqVar = new bsq();
        int c = bay.c();
        bsqVar.a(0.6f);
        bsqVar.b(0.9f);
        bsqVar.a(bas.b());
        bsr bsrVar = new bsr();
        bsrVar.a((int) (c * 0.2d));
        bsqVar.a(bsrVar);
        a(bsqVar, jSONObject);
        a(bsqVar, jSONObject2);
        if (bsqVar.j()) {
            bsqVar.a(false);
            bsqVar.c(0.0f);
        }
        return bsqVar;
    }

    private void a(bsq bsqVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536ae558", new Object[]{this, bsqVar, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("backgroundColor");
            if (!StringUtils.isEmpty(string)) {
                bsqVar.a(string);
            }
            String string2 = jSONObject.getString(bsq.KEY_NEED_CLOSE_BUTTON);
            if (!StringUtils.isEmpty(string2)) {
                bsqVar.b(Boolean.parseBoolean(string2));
                bsqVar.a(false);
            }
            float a2 = bbi.a(jSONObject.getString(bsq.KEY_HEIGHT_RATIO), -1.0f);
            if (a2 != -1.0f) {
                bsqVar.a(a2);
                bsr bsrVar = new bsr();
                bsrVar.a((int) (bay.c() * (1.0f - a2)));
                bsqVar.a(bsrVar);
            }
            String string3 = jSONObject.getString(bsq.KEY_AUTO_SIZE);
            if (!StringUtils.isEmpty(string3) && !Boolean.parseBoolean(string3)) {
                return;
            }
            bsqVar.c(this.g);
        }
    }

    private JSONObject a(Component component) {
        Map<String, Object> fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a7097342", new Object[]{this, component});
        }
        if (component == null || (fields = component.getFields()) == null) {
            return null;
        }
        Object obj = fields.get("style");
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        return (JSONObject) obj;
    }

    private HashMap<String, Object> a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9f66eee1", new Object[]{this, str, jSONObject});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        JSONObject a2 = a(jSONObject);
        if (a2 == null) {
            return hashMap;
        }
        AURAParseIO aURAParseIO = new AURAParseIO(Arrays.asList(new a(a2)));
        aURAParseIO.setRootKey(str);
        hashMap.put("auraInstance", j());
        hashMap.put("startPointInputIO", aURAParseIO);
        hashMap.put("startPointWorkflow", h());
        return hashMap;
    }

    private UltronProtocol g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronProtocol) ipChange.ipc$dispatch("d58158d5", new Object[]{this});
        }
        AURAGlobalData d = d();
        if (d != null) {
            return (UltronProtocol) d.get(ayj.GLOBAL_DATA_PROTOCOL, UltronProtocol.class);
        }
        return null;
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (bar.a("enablePopupWindowOpt2", true)) {
            return JSONObject.parseObject(jSONObject.toJSONString());
        }
        try {
            return (JSONObject) JSON.toJSON(g().m147clone());
        } catch (Throwable th) {
            if (this.c == null) {
                return null;
            }
            a(0, "-3000_DEEP_CLONE_EXCEPTION", "浮层插件popupWindow协议深拷贝异常：" + th.toString());
            return null;
        }
    }

    private String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        String str = null;
        azr azrVar = (azr) c().a(azr.class);
        if (azrVar != null) {
            str = azrVar.d();
        }
        return StringUtils.isEmpty(str) ? "aura.workflow.float" : str;
    }

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        azr azrVar = (azr) c().a(azr.class);
        if (azrVar == null) {
            return "aura_float_config.json";
        }
        String c = azrVar.c();
        return StringUtils.isEmpty(c) ? "aura_float_config.json" : c;
    }

    private k j() {
        IAURAPluginCenter[] iAURAPluginCenterArr;
        q qVar;
        List<IAURAInputField> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("5f0ea34", new Object[]{this});
        }
        azr azrVar = (azr) c().a(azr.class);
        if (azrVar != null) {
            qVar = azrVar.a();
            list = azrVar.b();
            iAURAPluginCenterArr = azrVar.e();
        } else {
            iAURAPluginCenterArr = null;
            qVar = null;
            list = null;
        }
        if (qVar == null) {
            qVar = new q(b().e(), null);
        }
        a(qVar);
        k a2 = k.a(qVar);
        AURAPluginContainerNodeModel a3 = this.d.a();
        if (a3 == null) {
            a2.a(i());
        } else {
            a2.a(a3);
            arc.a().a("AURAPopupWindowEvent", "createAURAInstance", "使用预加载的配置");
        }
        if (iAURAPluginCenterArr != null) {
            a2.a(iAURAPluginCenterArr);
        }
        if (list != null && !list.isEmpty()) {
            for (IAURAInputField iAURAInputField : list) {
                a2.a(iAURAInputField);
            }
        }
        return a2;
    }

    private void a(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6de311", new Object[]{this, qVar});
        } else {
            this.g = ((Boolean) bbc.a(qVar.a(), "autoSize", Boolean.class, Boolean.valueOf(ami.b(qVar.e())))).booleanValue();
        }
    }

    private Object c(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d2ed611c", new Object[]{this, aURAEventIO});
        }
        d eventModel = aURAEventIO.getEventModel();
        JSONObject c = eventModel.c();
        if (c == null) {
            return null;
        }
        String string = c.getString("code");
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        Object obj = c.get("popupData");
        if (obj != null) {
            return obj;
        }
        AURARenderComponent d = eventModel.d();
        if (d != null && d.data != null && d.data.codePopupWindowMap != null) {
            return d.data.codePopupWindowMap.get(string);
        }
        return null;
    }

    @Override // tb.arv, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.c = aqsVar;
    }

    private void a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8114572f", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        aqs aqsVar = this.c;
        if (aqsVar == null) {
            return;
        }
        aqsVar.a(new b(i, "AURAFloatPluginDomain", str, str2));
    }

    @Override // tb.arv, tb.arl
    public void onDestroy() {
        NUTFloatViewManager nUTFloatViewManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.d.c();
        if (!this.f || (nUTFloatViewManager = this.e) == null) {
            return;
        }
        nUTFloatViewManager.c();
    }
}
