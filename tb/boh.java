package tb;

import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.ultron.event.base.f;
import com.alibaba.android.ultron.vfw.viewholder.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public class boh extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long HANDLE_DINAMICX_EVENT_ONCE = 1656475939690454807L;

    static {
        kge.a(1398711458);
    }

    public static /* synthetic */ Object ipc$super(boh bohVar, String str, Object... objArr) {
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
        } else if (objArr == null || objArr.length < 2 || !(objArr[0] instanceof String) || !(objArr[1] instanceof String) || dXRuntimeContext == null || dXRuntimeContext.a() == null) {
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
            String format = String.format("%s_%s", (String) objArr[0], (String) objArr[1]);
            Object obj = map.get(d.TAG_DINAMICX_VIEW_COMPONENT);
            if (!(obj instanceof IDMComponent)) {
                return;
            }
            IDMComponent iDMComponent = (IDMComponent) obj;
            if (iDMComponent.getOnceExtMap() == null || a(iDMComponent, format)) {
                return;
            }
            iDMComponent.getOnceExtMap().put(format, true);
            map.put(f.KEY_DXEVENT, dXEvent);
            ArrayList arrayList2 = new ArrayList();
            View v = dXRuntimeContext.v();
            if (v != null) {
                Object tag = v.getTag(bpl.DINAMICX_3_CUSTOM_INPUT_KEY);
                if (tag instanceof ArrayList) {
                    arrayList = (ArrayList) tag;
                    bolVar.a(dXRuntimeContext.s(), "", objArr, null, a2, arrayList);
                }
            }
            arrayList = arrayList2;
            bolVar.a(dXRuntimeContext.s(), "", objArr, null, a2, arrayList);
        }
    }

    private boolean a(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a050eeba", new Object[]{this, iDMComponent, str})).booleanValue();
        }
        ArrayMap<String, Object> onceExtMap = iDMComponent.getOnceExtMap();
        if (onceExtMap != null && !TextUtils.isEmpty(str)) {
            Object obj = onceExtMap.get(str);
            if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
