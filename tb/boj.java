package tb;

import android.view.View;
import com.alibaba.android.ultron.event.base.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class boj extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DISPATCHER_TAG = "handleDinamicXEventWithIndex";

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, Object> f26023a;

    static {
        kge.a(-1070308974);
        HashMap<String, Object> hashMap = new HashMap<>();
        f26023a = hashMap;
        hashMap.put(bna.KEY_INDEX_MODE, true);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        bol bolVar;
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXRuntimeContext == null || dXRuntimeContext.a() == null) {
        } else {
            Object a2 = dXRuntimeContext.a();
            if (!(a2 instanceof Map)) {
                return;
            }
            Map map = (Map) a2;
            bny bnyVar = (bny) map.get("ViewEngine");
            if (bnyVar == null || (bolVar = (bol) bnyVar.a(bol.class)) == null) {
                return;
            }
            map.put(f.KEY_DXEVENT, dXEvent);
            ArrayList arrayList2 = new ArrayList();
            View v = dXRuntimeContext.v();
            if (v != null) {
                Object tag = v.getTag(bpl.DINAMICX_3_CUSTOM_INPUT_KEY);
                if (tag instanceof ArrayList) {
                    arrayList = (ArrayList) tag;
                    ((bok) bolVar).a(dXRuntimeContext.s(), "", objArr, null, a2, arrayList, f26023a);
                }
            }
            arrayList = arrayList2;
            ((bok) bolVar).a(dXRuntimeContext.s(), "", objArr, null, a2, arrayList, f26023a);
        }
    }
}
