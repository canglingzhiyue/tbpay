package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.home.component.utils.k;
import java.util.Map;

/* loaded from: classes.dex */
public class kva extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HPAGECHANGEEXPOSE = -5738105571919564880L;

    /* renamed from: a  reason: collision with root package name */
    private static String f30334a;

    public static /* synthetic */ Object ipc$super(kva kvaVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1973691291);
        f30334a = "DXHPageChangeExposeEventHandler";
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        int a2 = a(dXEvent, dXRuntimeContext);
        if (a2 == -1) {
            ksp.c(f30334a, "pageIndex is -1");
            return;
        }
        if (objArr != null && (objArr[0] instanceof JSONObject) && (jSONObject = (JSONObject) objArr[0]) != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(a2));
            k.a(jSONObject2, dXRuntimeContext.m());
            a(jSONObject2, dXRuntimeContext);
        }
        if (objArr == null || objArr.length <= 1 || !(objArr[1] instanceof String)) {
            return;
        }
        new kve().handleEvent(dXEvent, new Object[]{String.valueOf(objArr[1]), String.valueOf(a2)}, dXRuntimeContext);
    }

    private int a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24d3ed0e", new Object[]{this, dXEvent, dXRuntimeContext})).intValue();
        }
        if (dXEvent != null && (dXEvent instanceof DXPageChangeEvent)) {
            return ((DXPageChangeEvent) dXEvent).pageIndex;
        }
        if (!(dXRuntimeContext.d() instanceof DXSliderLayout)) {
            return -1;
        }
        return ((DXSliderLayout) dXRuntimeContext.d()).getPageIndex();
    }

    private void a(JSONObject jSONObject, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a99ecf9", new Object[]{this, jSONObject, dXRuntimeContext});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            ksp.c(f30334a, "independentExpose, itemList is empty");
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            k.a((JSONObject) entry.getValue(), dXRuntimeContext.m());
        }
    }
}
