package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.trade.event.f;

/* loaded from: classes4.dex */
public class eba extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Long EVENT_IDENTIFY;
    public static final String EVENT_TAG = "xCopy";

    public static /* synthetic */ Object ipc$super(eba ebaVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-197429695);
        EVENT_IDENTIFY = 20175625671960L;
    }

    public eba() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.eventhandler.DetailDinamicCopyEventHandlerV3");
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else {
            a(dXEvent, objArr, dXRuntimeContext);
        }
    }

    private void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        efq a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd72af8", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXRuntimeContext == null || dXRuntimeContext.m() == null || objArr == null || objArr.length == 0) {
        } else {
            Context m = dXRuntimeContext.m();
            if (!(m instanceof DetailCoreActivity)) {
                return;
            }
            DetailCoreActivity detailCoreActivity = (DetailCoreActivity) m;
            if (a(dXRuntimeContext)) {
                a2 = b(dXRuntimeContext);
            } else {
                a2 = a(detailCoreActivity, objArr, dXRuntimeContext);
            }
            f.a(detailCoreActivity, a2);
        }
    }

    private boolean a(DXRuntimeContext dXRuntimeContext) {
        dwk G;
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("487cd5dd", new Object[]{this, dXRuntimeContext})).booleanValue();
        }
        Context m = dXRuntimeContext.m();
        return (!(m instanceof DetailCoreActivity) || (G = ((DetailCoreActivity) m).G()) == null || G.d() == null || (e = dXRuntimeContext.e()) == null || e.getJSONObject("fields") == null || e.getJSONObject("fields").getJSONArray("titleTapMenus") == null) ? false : true;
    }

    private efq a(DetailCoreActivity detailCoreActivity, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (efq) ipChange.ipc$dispatch("8fc24567", new Object[]{this, detailCoreActivity, objArr, dXRuntimeContext});
        }
        String i = detailCoreActivity.y().t.i();
        String string = ((JSONObject) objArr[0]).getJSONObject("拷贝").getString("content");
        DXRootView s = dXRuntimeContext.s();
        efq efqVar = new efq();
        efqVar.f27283a = s;
        efqVar.b = i;
        efqVar.c = string;
        return efqVar;
    }

    private efq b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (efq) ipChange.ipc$dispatch("fcad77bc", new Object[]{this, dXRuntimeContext});
        }
        JSONArray jSONArray = dXRuntimeContext.e().getJSONObject("fields").getJSONArray("titleTapMenus");
        efq efqVar = new efq();
        efqVar.f27283a = dXRuntimeContext.s();
        efqVar.d = jSONArray;
        return efqVar;
    }
}
