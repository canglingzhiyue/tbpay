package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.c;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.h;
import java.util.HashMap;
import java.util.Map;

@AURAExtensionImpl(code = dtu.CODE)
/* loaded from: classes4.dex */
public final class dtu extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "alibuy.impl.event.openSku";

    static {
        kge.a(676554826);
    }

    public static /* synthetic */ Object ipc$super(dtu dtuVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "openSku";
    }

    @Override // tb.arv
    public void b(final AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        d eventModel = aURAEventIO.getEventModel();
        JSONObject c = eventModel.c();
        if (c == null) {
            arc.a().a("AURAOpenMSOAPageExtension eventFields is null");
            return;
        }
        final AURARenderComponent d = eventModel.d();
        if (d == null) {
            arc.a().a("AURAOpenMSOAPageExtension renderComponent is null");
        } else {
            c.a().a(new h("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "cart", a(c)), new MSOAServiceListener() { // from class: tb.dtu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onSuccess(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    } else {
                        dtu.this.a(map, d, aURAEventIO);
                    }
                }

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                    } else {
                        arc.a().b("AURAMSOAExtension", new arf().a("errCode", str).a("errStr", str2));
                    }
                }
            });
        }
    }

    private Map<String, Object> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("itemId");
        String string2 = jSONObject.getString("skuId");
        jSONObject.getString("bizName");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("bizName", (Object) "minidetail");
        jSONObject2.put("skuId", (Object) string2);
        JSONObject jSONObject3 = jSONObject.getJSONObject("exParams");
        if (jSONObject3 != null) {
            jSONObject2.putAll(jSONObject3);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", string);
        hashMap.put("sourceType", "3");
        hashMap.put("exParams", jSONObject2);
        return hashMap;
    }

    public void a(Map<String, Object> map, AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362a1aea", new Object[]{this, map, aURARenderComponent, aURAEventIO});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str = (String) bbc.a(map, "itemId", String.class, null);
        String str2 = (String) bbc.a(map, "skuId", String.class, null);
        if (StringUtils.isEmpty(str2)) {
            arc.a().a("AURAMSOAExtension skuId is null");
            return;
        }
        jSONObject.put("skuId", (Object) str2);
        if (!StringUtils.isEmpty(str)) {
            jSONObject.put("itemId", (Object) str);
        }
        duw.a(b(), aURARenderComponent, aURAEventIO, jSONObject);
    }
}
