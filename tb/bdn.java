package tb;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.trade.presenter.c;
import com.alibaba.android.ultron.vfw.viewholder.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bdn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(696705094);
    }

    public static bbz a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbz) ipChange.ipc$dispatch("6fbef593", new Object[]{dXRuntimeContext});
        }
        if (dXRuntimeContext != null && dXRuntimeContext.a() != null && (dXRuntimeContext.a() instanceof Map)) {
            Object obj = ((Map) dXRuntimeContext.a()).get("ViewEngine");
            if (obj instanceof bny) {
                return (bbz) ((bny) obj).a(bbz.class);
            }
        }
        return null;
    }

    public static IDMComponent b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("34de969e", new Object[]{dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            return null;
        }
        Object a2 = dXRuntimeContext.a();
        if (!(a2 instanceof Map)) {
            return null;
        }
        Object obj = ((Map) a2).get(d.TAG_DINAMICX_VIEW_COMPONENT);
        if (!(obj instanceof IDMComponent)) {
            return null;
        }
        return (IDMComponent) obj;
    }

    public static List<List<JSONObject>> a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("64b39c64", new Object[]{cVar, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add(a(cVar.y().t()));
        }
        if ((i & 2) != 0) {
            arrayList.add(a(cVar.y().s()));
        }
        if ((i & 4) != 0) {
            arrayList.add(a(cVar.y().r()));
        }
        return arrayList;
    }

    public static List<JSONObject> a(ViewGroup viewGroup) {
        JSONObject data;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cc92ec0", new Object[]{viewGroup});
        }
        ArrayList arrayList = new ArrayList();
        if (viewGroup == null) {
            return arrayList;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof DXRootView) && (data = ((DXRootView) childAt).getData()) != null && (jSONObject = data.getJSONObject("fields")) != null) {
                arrayList.add(jSONObject);
            }
        }
        return arrayList;
    }
}
