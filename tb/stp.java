package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;

/* loaded from: classes7.dex */
public class stp extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long HSETEXT = 4912396181747440332L;

    static {
        kge.a(2034872741);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (dlhVar == null || lVar == null) {
            ldf.d("HSetExtAbility", "params invalid");
            return null;
        }
        DXRuntimeContext h = lVar.h();
        if (h == null || (e = h.e()) == null) {
            return null;
        }
        String c = dlhVar.c("key");
        if (TextUtils.isEmpty(c)) {
            ldf.d("HSetExtAbility", "key is empty");
            return null;
        }
        String c2 = dlhVar.c("value");
        JSONObject jSONObject = e.getJSONObject("ext");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            e.put("ext", (Object) jSONObject);
        }
        jSONObject.put(c, (Object) c2);
        ldf.d("HSetExtAbility", "hSetExt key: " + c + " value: " + c2);
        return new dla();
    }

    /* loaded from: classes7.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(231412604);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public stp a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (stp) ipChange.ipc$dispatch("16c0f773", new Object[]{this, obj}) : new stp();
        }
    }
}
