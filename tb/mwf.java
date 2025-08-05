package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.nav.Nav;
import com.taobao.mytaobao.ultron.e;
import com.taobao.mytaobao.ultron.event.f;
import com.taobao.mytaobao.ut.c;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class mwf extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_MTB_ONTAP = 8490245503891339469L;

    /* renamed from: a  reason: collision with root package name */
    private e f31298a;

    static {
        kge.a(1335293355);
    }

    public static /* synthetic */ Object ipc$super(mwf mwfVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public mwf(e eVar) {
        this.f31298a = eVar;
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null) {
        } else {
            String str = objArr[0] instanceof String ? (String) objArr[0] : "";
            if ("openDelivery".equals(str)) {
                b(objArr, dXRuntimeContext);
            } else if (!"openBasement".equals(str)) {
            } else {
                a(objArr, dXRuntimeContext);
            }
        }
    }

    private void a(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad925d7a", new Object[]{this, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length < 2 || !(objArr[1] instanceof String)) {
        } else {
            Nav.from(dXRuntimeContext.m()).toUri((String) objArr[1]);
            c.a("Page_MyTaobao", "Page_MyTaobao_click-transition", "a2141.7631743.67.1", (String) null, (JSONObject) null);
        }
    }

    private void b(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e672be19", new Object[]{this, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 3) {
            try {
                JSONArray jSONArray2 = (JSONArray) objArr[1];
                int parseInt = Integer.parseInt((String) objArr[2]);
                if (jSONArray2 != null && parseInt < jSONArray2.size()) {
                    f.a(dXRuntimeContext.m(), jSONArray2.getJSONObject(parseInt), new ArrayList(jSONArray2), parseInt);
                }
                if (objArr.length <= 3 || (jSONArray = (JSONArray) objArr[3]) == null || jSONArray.size() <= 0) {
                    return;
                }
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject.containsKey("type")) {
                        a(jSONObject, jSONObject.getString("type"));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
            return;
        }
        e eVar = this.f31298a;
        if (eVar == null) {
            return;
        }
        eVar.a("orderModule_15", str, jSONObject);
    }
}
