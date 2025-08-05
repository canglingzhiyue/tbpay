package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.h;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.vessel.utils.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class hvu extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ULTRONBUYNOW = "-1873679453362485004";

    static {
        kge.a(700254484);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        JSONObject c = dlhVar.c();
        if (c == null) {
            return new dkw(new dkv(-1000, c.LOAD_DATA_NULL));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizName", (Object) "minidetail");
        jSONObject.put("from", (Object) "order");
        jSONObject.put("request_key", (Object) "openFrom,skuId");
        jSONObject.put("openFrom", (Object) "tmBuyAgain");
        String string = c.getString("skuId");
        if (string != null) {
            jSONObject.put("skuId", (Object) string);
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("sourceType", "6");
        hashMap.putAll(c);
        hashMap.put("exParams", jSONObject);
        com.taobao.android.msoa.c.a().a(new h("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "cart", hashMap), new MSOAServiceListener() { // from class: tb.hvu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onSuccess(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                }
            }

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                    return;
                }
                UnifyLog.d("UltronBuyNowAbility", str + "#" + str2);
            }
        });
        return new dla();
    }

    /* loaded from: classes6.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(648252395);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public hvu a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (hvu) ipChange.ipc$dispatch("16bbff7b", new Object[]{this, obj}) : new hvu();
        }
    }
}
