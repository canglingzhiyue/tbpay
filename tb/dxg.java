package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.af;
import java.util.Arrays;
import java.util.HashMap;

@AURAExtensionImpl(code = "aura.impl.event.expandTitle")
/* loaded from: classes4.dex */
public final class dxg extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    public static /* synthetic */ Object ipc$super(dxg dxgVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : af.EVENT_TYPE;
    }

    static {
        kge.a(2145390344);
        TAG = dxg.class.getSimpleName();
    }

    public dxg() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.title.AliDetailExpandTitleEvent");
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
            arc.a().c(TAG, "AliDetailExpandTitleEvent", "component data fail" + aURAEventIO.getEventType());
            return;
        }
        Object obj = d.data.fields.get(g.KEY_HEADER_EXPANDED);
        if (!(obj instanceof String)) {
            arc.a().c(TAG, "AliDetailExpandTitleEvent", "expandObj data fail");
            return;
        }
        boolean z = !"true".equals(obj);
        d.data.fields.put(g.KEY_HEADER_EXPANDED, String.valueOf(z));
        a(d.data.fields.get("title"), z);
        b().b().a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(bbg.a(RuleType.PROPS_WRITE_BACK, d, new HashMap()))), null);
    }

    private void a(Object obj, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7de910", new Object[]{this, obj, new Boolean(z)});
        } else if (obj != null && (obj instanceof JSONArray)) {
            JSONArray jSONArray = (JSONArray) obj;
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("style")) != null) {
                    jSONObject.put("tailIndent", (Object) String.valueOf(z));
                }
            }
        }
    }
}
