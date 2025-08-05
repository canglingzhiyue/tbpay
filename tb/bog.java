package tb;

import android.view.View;
import com.alibaba.android.ultron.event.base.f;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public class bog extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DISPATCHER_TAG = "handleDinamicXEvent";

    static {
        kge.a(-675908962);
    }

    public static /* synthetic */ Object ipc$super(bog bogVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
                    a(dXRuntimeContext.s(), v);
                    bolVar.a(dXRuntimeContext.s(), "", objArr, null, a2, arrayList);
                }
            }
            arrayList = arrayList2;
            a(dXRuntimeContext.s(), v);
            bolVar.a(dXRuntimeContext.s(), "", objArr, null, a2, arrayList);
        }
    }

    private void a(View view, View view2) {
        View findViewWithTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7536b928", new Object[]{this, view, view2});
            return;
        }
        if (view != null && (findViewWithTag = view.findViewWithTag(f.TAG_CLICK_VIEW)) != null) {
            findViewWithTag.setTag(null);
        }
        if (view2 == null || view2.getTag() != null) {
            return;
        }
        view2.setTag(f.TAG_CLICK_VIEW);
    }
}
