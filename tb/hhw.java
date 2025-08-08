package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.tab.DXOnTabClickEvent;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew.g;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.d;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.taolive.sdk.goodlist.l;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hhw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ENTRY_TYPE_LIVE_CART = "liveCart";

    static {
        kge.a(-554652264);
    }

    public static boolean a(DXRuntimeContext dXRuntimeContext, c cVar, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4012675", new Object[]{dXRuntimeContext, cVar, objArr})).booleanValue();
        }
        if (objArr == null || objArr.length < 2) {
            return false;
        }
        d dVar = null;
        if (dXRuntimeContext.b() instanceof d) {
            dVar = (d) dXRuntimeContext.b();
        } else if (dXRuntimeContext.a() instanceof HashMap) {
            Object obj = ((HashMap) dXRuntimeContext.a()).get(com.alibaba.android.ultron.vfw.viewholder.d.TAG_DINAMICX_VIEW_COMPONENT);
            if (obj instanceof DMComponent) {
                Object obj2 = ((DMComponent) obj).getExtMap().get("keyTopBarHandler");
                if (obj2 instanceof d) {
                    dVar = (d) obj2;
                }
            }
        }
        if (StringUtils.equals("more", (String) objArr[1])) {
            if (dVar != null) {
                dVar.a(dXRuntimeContext, cVar, (JSONObject) objArr[2]);
            }
        } else if (StringUtils.equals("search", (String) objArr[1])) {
            if (dVar != null) {
                dVar.a();
            }
        } else if (StringUtils.equals("order", (String) objArr[1])) {
            if (dVar != null) {
                dVar.a((JSONObject) objArr[2]);
            }
        } else if (StringUtils.equals("cart", (String) objArr[1])) {
            if (dVar != null) {
                dVar.b((JSONObject) objArr[2]);
            }
        } else if (StringUtils.equals(ENTRY_TYPE_LIVE_CART, (String) objArr[1])) {
            if (dVar != null) {
                dVar.c((JSONObject) objArr[2]);
            }
        } else if (objArr.length > 2 && (objArr[2] instanceof JSONObject)) {
            String string = ((JSONObject) objArr[2]).getString("jumpUrl");
            if (!StringUtils.isEmpty(string)) {
                a.a().k().a(dXRuntimeContext.m(), string);
            }
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (objArr.length > 3 && (objArr[3] instanceof String)) {
            hashMap.put("gl_scene", (String) objArr[3]);
        }
        if (dVar != null && (objArr[1] instanceof String) && !StringUtils.equals("more", (String) objArr[1])) {
            dVar.b();
            if (objArr[2] instanceof JSONObject) {
                String string2 = ((JSONObject) objArr[2]).getString("count");
                if (!StringUtils.isEmpty(string2)) {
                    hashMap.put(objArr[1] + "_count", string2);
                }
            }
        }
        if (a.a().j() != null) {
            l j = a.a().j();
            j.a("gl_entry_" + ((String) objArr[1]), hashMap);
        }
        return true;
    }

    public static void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd72af8", new Object[]{dXEvent, objArr, dXRuntimeContext});
            return;
        }
        g a2 = a(dXRuntimeContext);
        if (a2 == null || !(dXEvent instanceof DXOnTabClickEvent)) {
            return;
        }
        a2.a(((DXOnTabClickEvent) dXEvent).getIndex());
    }

    private static g a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("ce7ce1c", new Object[]{dXRuntimeContext});
        }
        Object obj = ((HashMap) dXRuntimeContext.a()).get(com.alibaba.android.ultron.vfw.viewholder.d.TAG_DINAMICX_VIEW_COMPONENT);
        if (!(obj instanceof DMComponent)) {
            return null;
        }
        Object obj2 = ((DMComponent) obj).getExtMap().get("keyViewHandler");
        if (!(obj2 instanceof g)) {
            return null;
        }
        return (g) obj2;
    }
}
