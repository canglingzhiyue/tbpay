package tb;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.observer.a;
import com.taobao.android.detail.core.aura.utils.g;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ak;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AURAExtensionImpl(code = "aura.impl.event.changeSKUImage")
/* loaded from: classes4.dex */
public final class dxb extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f27059a;

    public static /* synthetic */ Object ipc$super(dxb dxbVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : ak.EVENT_TYPE;
    }

    static {
        kge.a(-215876517);
        f27059a = dxb.class.getSimpleName();
    }

    public dxb() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.sku.AliDetailSKUItemEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        AURARenderComponent d = aURAEventIO.getEventModel().d();
        if (d == null || d.data == null || d.data.fields == null) {
            ard a2 = arc.a();
            String str = f27059a;
            a2.c(str, "AliDetailSKUItemEvent", "component or component.data or component.data.fields is null,eventType=" + aURAEventIO.getEventType());
        } else if (aURAEventIO.getEventModel().e() == null || aURAEventIO.getEventModel().c() == null) {
            ard a3 = arc.a();
            String str2 = f27059a;
            a3.c(str2, "AliDetailSKUItemEvent", "getArgs or getEventFields is null,eventType=" + aURAEventIO.getEventType());
        } else {
            String a4 = a(aURAEventIO.getEventModel().e());
            if (StringUtils.isEmpty(a4)) {
                return;
            }
            a(d, a4);
            g.a(b().e(), aURAEventIO, a4);
            a(aURAEventIO.getEventModel().c(), a4);
        }
    }

    private String a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2583e9f7", new Object[]{this, objArr});
        }
        if (objArr != null && objArr.length >= 2 && (objArr[1] instanceof String)) {
            return (String) objArr[1];
        }
        return null;
    }

    private void a(AURARenderComponent aURARenderComponent, String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a501edd", new Object[]{this, aURARenderComponent, str});
        } else if (aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.fields != null && !StringUtils.isEmpty(str)) {
            Object obj = aURARenderComponent.data.fields.get("items");
            JSONArray jSONArray2 = obj instanceof JSONArray ? (JSONArray) obj : null;
            if (jSONArray2 == null || jSONArray2.isEmpty()) {
                return;
            }
            for (int i = 0; i < jSONArray2.size(); i++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i);
                if (jSONObject != null && (jSONArray = jSONObject.getJSONArray("skuContents")) != null && !jSONArray.isEmpty()) {
                    for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        if (jSONObject2 != null) {
                            if (StringUtils.equals(jSONObject2.getString(a.KEY_PROP_PATH), str)) {
                                jSONObject2.put("isSelected", (Object) true);
                            } else {
                                jSONObject2.put("isSelected", (Object) false);
                            }
                        }
                    }
                }
            }
            b().b().a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(bbg.a(RuleType.PROPS_WRITE_BACK, aURARenderComponent, new HashMap()))), null);
        }
    }

    private void a(JSONObject jSONObject, String str) {
        elq a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
        } else if (StringUtils.isEmpty(str) || jSONObject == null) {
        } else {
            Object obj = b().a().get("token");
            if (!(obj instanceof String) || (a2 = elr.a((String) obj)) == null || !(a2.b() instanceof RecyclerView)) {
                return;
            }
            RecyclerView recyclerView = (RecyclerView) a2.b();
            atq atqVar = (atq) recyclerView.getAdapter();
            if (atqVar == null) {
                return;
            }
            List<AURARenderComponent> a3 = atqVar.a();
            if (bau.a(a3)) {
                return;
            }
            String string = jSONObject.getString("locatorId");
            AURARenderComponent aURARenderComponent = null;
            int i = 0;
            while (true) {
                if (i >= a3.size()) {
                    break;
                }
                AURARenderComponent aURARenderComponent2 = a3.get(i);
                if (aURARenderComponent2 != null && aURARenderComponent2.data != null && aURARenderComponent2.data.fields != null) {
                    if (StringUtils.equals(string, aURARenderComponent2.data.fields.get("code") instanceof String ? (String) aURARenderComponent2.data.fields.get("code") : "")) {
                        aURARenderComponent = atqVar.a(i);
                        b(aURARenderComponent, str);
                        break;
                    }
                }
                i++;
            }
            int indexOf = a3.indexOf(aURARenderComponent) - 1;
            if (emj.a(recyclerView, false) == indexOf || indexOf <= 0 || indexOf >= a3.size()) {
                return;
            }
            emn.a(recyclerView, a3.get(indexOf), a3);
        }
    }

    private void b(AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ff1617c", new Object[]{this, aURARenderComponent, str});
        } else if (aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.fields != null) {
            Map<String, Object> map = aURARenderComponent.data.fields;
            Object obj = map.get("group");
            JSONArray jSONArray = obj instanceof JSONArray ? (JSONArray) obj : null;
            if (jSONArray == null || jSONArray.isEmpty()) {
                return;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    if (StringUtils.equals(jSONObject.getString("id"), str)) {
                        jSONObject.put("isSelected", (Object) true);
                        map.put("mainImageUrl", jSONObject.getString("bgImage"));
                    } else {
                        jSONObject.put("isSelected", (Object) false);
                    }
                }
            }
            b().b().a("aura.workflow.adjustRules", new UMFRuleIO(Collections.singletonList(bbg.a(RuleType.PROPS_WRITE_BACK, aURARenderComponent, new HashMap()))), null);
        }
    }
}
