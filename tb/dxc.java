package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.p;
import java.util.Arrays;
import java.util.HashMap;

@AURAExtensionImpl(code = "aura.impl.event.changeSKUTab")
/* loaded from: classes4.dex */
public final class dxc extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1487258737);
    }

    public static /* synthetic */ Object ipc$super(dxc dxcVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "switchSkuTab";
    }

    public dxc() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.sku.AliDetailSKUTabEvent");
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
            a2.c("AliDetailSKUImageEvent", "AliDetailSKUTabEvent", "component or component.data or component.data.fields is null,eventType=" + aURAEventIO.getEventType());
        } else if (b().b() == null) {
            ard a3 = arc.a();
            a3.c("AliDetailSKUImageEvent", "AliDetailSKUTabEvent", "getAURAInstance is null,eventType=" + aURAEventIO.getEventType());
        } else {
            a(d, c(aURAEventIO));
            p.a(b().e(), "switchSkuTab");
        }
    }

    private String c(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5b03e8a", new Object[]{this, aURAEventIO});
        }
        Object[] e = aURAEventIO.getEventModel().e();
        return (e == null || e.length < 2 || !(e[1] instanceof String)) ? "0" : (String) e[1];
    }

    private void a(AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a501edd", new Object[]{this, aURARenderComponent, str});
        } else if (aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.fields != null && !TextUtils.isEmpty(str)) {
            Object obj = aURARenderComponent.data.fields.get("items");
            JSONArray jSONArray = obj instanceof JSONArray ? (JSONArray) obj : null;
            if (jSONArray == null || jSONArray.isEmpty()) {
                return;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    if (TextUtils.equals(String.valueOf(i), str)) {
                        jSONObject.put("isSelected", (Object) true);
                    } else {
                        jSONObject.put("isSelected", (Object) false);
                    }
                }
            }
            b().b().a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(bbg.a(RuleType.PROPS_WRITE_BACK, aURARenderComponent, new HashMap()))), null);
        }
    }
}
