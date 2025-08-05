package tb;

import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1482352628);
    }

    public static int B(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ff92b54b", new Object[]{bcbVar})).intValue() : x(bcbVar).getFirstBundleLineHeight();
    }

    public static JSONObject C(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("9486c2f9", new Object[]{bcbVar}) : x(bcbVar).getBuyTransferParams();
    }

    public static String A(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d640eea9", new Object[]{bcbVar});
        }
        CartGlobal m = bcbVar.m();
        if (m == null) {
            return null;
        }
        return m.getAddress();
    }

    public static int z(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2c3c2183", new Object[]{bcbVar})).intValue() : x(bcbVar).getSupportModalBuyCount();
    }

    public static boolean y(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3db91b13", new Object[]{bcbVar})).booleanValue() : x(bcbVar).isEnableDesignScale();
    }

    public static boolean a(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e1707efb", new Object[]{bcbVar})).booleanValue() : x(bcbVar).isForceRemoteCheck();
    }

    public static String b(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec830e28", new Object[]{bcbVar}) : x(bcbVar).getJumpComponentKey();
    }

    public static boolean c(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be768bfd", new Object[]{bcbVar})).booleanValue() : d(bcbVar) != null && d(bcbVar).getBooleanValue("submitCheckAll");
    }

    public static JSONObject d(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("833fd59a", new Object[]{bcbVar}) : x(bcbVar).getFilterCheckOptimize();
    }

    public static boolean f(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("89ff9f80", new Object[]{bcbVar})).booleanValue() : x(bcbVar).isClearFilterItemAndReQuery();
    }

    public static JSONArray a(IDMComponent iDMComponent, bbz bbzVar) {
        Map<String, List<b>> eventMap;
        CartGlobal m;
        JSONArray swipeItems;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e5c2161c", new Object[]{iDMComponent, bbzVar});
        }
        JSONArray jSONArray = new JSONArray();
        if (bbzVar != null && iDMComponent != null && (eventMap = iDMComponent.getEventMap()) != null && (m = bbzVar.n().m()) != null && m.getControlParas() != null && m.getControlParas().getSwipeItems() != null && (swipeItems = m.getControlParas().getSwipeItems()) != null && !swipeItems.isEmpty()) {
            int a2 = a(bbzVar, iDMComponent);
            for (int i = 0; i < swipeItems.size(); i++) {
                JSONObject jSONObject = swipeItems.getJSONObject(i);
                if (jSONObject != null && eventMap.containsKey(jSONObject.getString("event")) && (jSONObject.getIntValue("v") & a2) != 0) {
                    jSONArray.add(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    public static boolean g(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7882a601", new Object[]{bcbVar})).booleanValue() : x(bcbVar).isIsPromotionChecked();
    }

    public static boolean h(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6705ac82", new Object[]{bcbVar})).booleanValue();
        }
        if (bcbVar != null && bcbVar.m() != null && bcbVar.m().getControlParas() != null) {
            return bcbVar.m().getControlParas().isNewCart();
        }
        return false;
    }

    public static JSONObject i(bcb bcbVar) {
        JSONObject feedFlowConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8863a21f", new Object[]{bcbVar});
        }
        CartGlobal m = bcbVar.m();
        if (m != null && (feedFlowConfig = m.getControlParas().getFeedFlowConfig()) != null && !feedFlowConfig.isEmpty()) {
            return feedFlowConfig.getJSONObject(bcbVar.b());
        }
        return null;
    }

    public static boolean j(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("440bb984", new Object[]{bcbVar})).booleanValue();
        }
        if (bcbVar.m() != null && bcbVar.m().getControlParas() != null) {
            return bcbVar.m().getControlParas().isRemoteCheck();
        }
        return false;
    }

    public static boolean k(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("328ec005", new Object[]{bcbVar})).booleanValue();
        }
        CartGlobal m = bcbVar.m();
        if (m != null && m.getControlParas() != null) {
            return m.getControlParas().isPreLoadOpen();
        }
        return false;
    }

    public static int l(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2111c675", new Object[]{bcbVar})).intValue();
        }
        CartGlobal m = bcbVar.m();
        if (m != null && m.getFeature() != null) {
            return m.getFeature().getCheckMax();
        }
        return 0;
    }

    public static int m(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f94ccf6", new Object[]{bcbVar})).intValue();
        }
        CartGlobal m = bcbVar.m();
        if (m != null && m.getFeature() != null) {
            return m.getFeature().getMaxCheckCount();
        }
        return Integer.MAX_VALUE;
    }

    public static int n(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe17d377", new Object[]{bcbVar})).intValue();
        }
        CartGlobal m = bcbVar.m();
        if (m != null && m.getAllItemInfo() != null) {
            return m.getAllItemInfo().getValue();
        }
        return 0;
    }

    public static JSONObject o(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("28283125", new Object[]{bcbVar}) : x(bcbVar).getPromotionUtInfo();
    }

    public static String p(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f5f470da", new Object[]{bcbVar}) : x(bcbVar).getTopUrl();
    }

    public static boolean q(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c9a0e70b", new Object[]{bcbVar})).booleanValue() : x(bcbVar).androidSupportItemSwipe();
    }

    public static boolean r(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b823ed8c", new Object[]{bcbVar})).booleanValue() : (bcbVar.m() == null || bcbVar.m().getFeature() == null || !bcbVar.m().getFeature().isClientTotalPrice()) ? false : true;
    }

    public static boolean t(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9529fa8e", new Object[]{bcbVar})).booleanValue() : x(bcbVar).isMixCart();
    }

    public static String u(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f953caf5", new Object[]{bcbVar}) : x(bcbVar).getWakeUpErrorMsg();
    }

    public static String v(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa007694", new Object[]{bcbVar}) : x(bcbVar).getToastMessage();
    }

    public static String w(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("faad2233", new Object[]{bcbVar}) : x(bcbVar).getExParamsTransparentState();
    }

    public static CartGlobal.ControlParas x(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartGlobal.ControlParas) ipChange.ipc$dispatch("84e4784a", new Object[]{bcbVar});
        }
        if (bcbVar != null) {
            try {
                CartGlobal m = bcbVar.m();
                if (m != null) {
                    CartGlobal.ControlParas controlParas = m.getControlParas();
                    if (controlParas != null) {
                        return controlParas;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return new CartGlobal.ControlParas();
    }

    private static int a(bbz bbzVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21811a9", new Object[]{bbzVar, iDMComponent})).intValue();
        }
        if (bbzVar.n().a() && !bbzVar.v().k()) {
            z = true;
        }
        boolean equals = "dynamicConfig_showAllGroup".equals(bbzVar.n().b());
        boolean p = bei.p(iDMComponent);
        if (z || equals) {
            i = 4;
        }
        return p ? i << 1 : i;
    }
}
