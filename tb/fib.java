package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.e;
import com.taobao.android.detail2.core.framework.view.feeds.d;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class fib extends fic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-323074986);
    }

    public static /* synthetic */ Object ipc$super(fib fibVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(fib fibVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fa79d08", new Object[]{fibVar, dVar});
        } else {
            fibVar.a(dVar);
        }
    }

    @Override // tb.fic
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8cce74", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            eVar.a(new flq() { // from class: tb.fib.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.flq, tb.flr
                public void a(d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("799501f7", new Object[]{this, dVar});
                    } else {
                        fib.a(fib.this, dVar);
                    }
                }
            });
        }
    }

    private void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799501f7", new Object[]{this, dVar});
        } else if (dVar == null || !(dVar.H() instanceof fhi)) {
        } else {
            HashMap hashMap = new HashMap();
            JSONObject h = ((fhi) dVar.H()).h();
            if (h != null) {
                hashMap.put("categoryId", h.getString("categoryId"));
                hashMap.put("rootCategoryId", h.getString("rootCategoryId"));
            }
            fkr C = dVar.H().C();
            if (C != null) {
                hashMap.put(aw.PARAM_PVID, C.i());
            }
            JSONObject i = ((fhi) dVar.H()).i();
            if (i != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("price", (Object) i.getJSONObject("price"));
                hashMap.put("detailPriceInfo", jSONObject.toJSONString());
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(dVar.I().g(), hashMap);
        }
    }
}
