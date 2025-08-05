package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.c;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class tiz extends tit<tja> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1042069650);
    }

    @Override // tb.tit
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "addToCart";
    }

    @Override // tb.tit
    public void a(tja tjaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ea4d", new Object[]{this, tjaVar});
        } else if (tjaVar == null) {
            stv.a("AddCartEvent", "data null");
        } else {
            HashMap hashMap = new HashMap(3);
            hashMap.put("itemId", tjaVar.b);
            hashMap.put("showSku", false);
            hashMap.put("skuId", tjaVar.f34141a);
            c.a().a(new h("msoa.taobao.cart.open", "msoa.taobao.cart.open.add", "1.0", "splashInteract", hashMap), new MSOAServiceListener() { // from class: tb.tiz.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onSuccess(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    } else {
                        tiz.this.b();
                    }
                }

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                    } else {
                        tiz.this.b(str, str2);
                    }
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            stv.a("AddCartEvent", "互动加购成功");
            tjo.b(1, "", "", this.b.d().b());
            a((JSONObject) null);
        } catch (Throwable th) {
            stv.a("AddCartEvent", "BootImagePopMamaCommercialView. commitSuccess .error", th);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        try {
            stv.a("AddCartEvent", "互动加购失败：retCode=" + str + ";retMsg=" + str2);
            tjo.b(0, str, str2, this.b.d().b());
            a(str, str2);
        } catch (Throwable th) {
            stv.a("AddCartEvent", "BootImagePopMamaCommercialView. commitFail .error", th);
        }
    }
}
