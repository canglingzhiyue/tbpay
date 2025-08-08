package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.c;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class tdj extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ADDTOCART = -5950106872187663489L;

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, final dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        String c = dlhVar.c("itemId");
        boolean equals = StringUtils.equals("true", dlhVar.c("disableAddToCart"));
        boolean equals2 = StringUtils.equals("true", dlhVar.c("disableToast"));
        if (StringUtils.isEmpty(c) || equals) {
            lch.a("DXAddToCartAbility", "onExecuteWithData: itemId=" + c + ", disableAddToCart=" + dlhVar.c("disableAddToCart"));
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", c);
        hashMap.put("showSku", false);
        hashMap.put("skuId", dlhVar.c("skuId"));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("disableToast", Boolean.valueOf(equals2));
        hashMap.put("clientExParams", hashMap2);
        c.a().a(new h("msoa.taobao.cart.open", "msoa.taobao.cart.open.add", "1.0", "homepageTexiu", hashMap), new MSOAServiceListener() { // from class: tb.tdj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onSuccess(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                JSONObject jSONObject = new JSONObject(map);
                lch.a("DXAddToCartAbility", "onSuccess: " + jSONObject);
                dllVar.callback("onSuccess", new dla(jSONObject));
            }

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) str);
                jSONObject.put("errorMsg", (Object) str2);
                lch.a("DXAddToCartAbility", "onFail: " + jSONObject);
                dllVar.callback("onFail", new dla(jSONObject));
            }
        });
        return null;
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public tdj a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (tdj) ipChange.ipc$dispatch("16c12f08", new Object[]{this, obj}) : new tdj();
        }
    }
}
