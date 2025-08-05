package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.android.ultron.datamodel.imp.b;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bei {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CURRENCY_UNIT_FACTOR = 100;
    public static final int DEFAULT_PRICE_RESERVED_DECIMAL_NUMBER = 2;
    public static final String KEY_CAN_CHECK_IN_MANAGE = "canCheckInManage";
    public static final String KEY_CAN_CHECK_IN_NORMAL = "canCheck";
    public static final String KEY_DISCOUNT_TIPS = "discountTips";
    public static final String KEY_IS_CALCULATING_STATE = "_isCalculatingState";
    public static final String KEY_IS_CHECKED = "isChecked";
    public static final String KEY_IS_CHECKED_ALL_FROM_NAVIVE = "isCheckedAllFromNative";
    public static final String KEY_IS_RELATION_ITEM = "isRelationItem";

    /* loaded from: classes2.dex */
    public interface a {
        boolean a(IDMComponent iDMComponent);
    }

    static {
        kge.a(-224947244);
    }

    public static boolean a(b bVar, String str) {
        IDMComponent b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbaec200", new Object[]{bVar, str})).booleanValue();
        }
        if (bVar != null && !TextUtils.isEmpty(str) && (b = bVar.b(str)) != null && b.getChildren() != null) {
            for (IDMComponent iDMComponent : b.getChildren()) {
                if (((DMComponent) iDMComponent).isExtendBlock()) {
                    return iDMComponent.getData().getBooleanValue("hasMore");
                }
            }
        }
        return false;
    }

    public static void a(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbcbb03", new Object[]{jnyVar});
        } else {
            a(jnyVar, Globals.getApplication().getString(R.string.cart_calculate_in_settlement), Globals.getApplication().getString(R.string.cart_promotion_calculate_totalTitle_heji));
        }
    }

    public static void a(jny jnyVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e495ea97", new Object[]{jnyVar, str, str2});
            return;
        }
        IDMComponent b = b(jnyVar);
        if (b == null) {
            return;
        }
        a(b, "", "pay", "postTitle");
        a(b, str, "pay", KEY_DISCOUNT_TIPS);
        a(b, "", "pay", "calculatorTips");
        a(b, "", "pay", "detailInfoText");
        a(b, str2, "pay", "totalTitle");
        if (!Globals.getApplication().getString(R.string.cart_promotion_calculate).equals(str)) {
            return;
        }
        b.getFields().put(KEY_IS_CALCULATING_STATE, (Object) true);
    }

    public static IDMComponent b(jny jnyVar) {
        List<IDMComponent> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("c1602388", new Object[]{jnyVar});
        }
        if (jnyVar == null || (b = jnyVar.b()) == null || b.size() <= 0) {
            return null;
        }
        for (IDMComponent iDMComponent : b) {
            if (iDMComponent != null && "submit".equals(iDMComponent.getTag())) {
                return iDMComponent;
            }
        }
        return null;
    }

    public static List<IDMComponent> c(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("74b35fa2", new Object[]{jnyVar});
        }
        ArrayList arrayList = null;
        if (!(jnyVar instanceof b)) {
            return null;
        }
        List<IDMComponent> m = ((b) jnyVar).m();
        if (m != null && m.size() > 0) {
            arrayList = new ArrayList();
            for (IDMComponent iDMComponent : m) {
                if ("item".equals(iDMComponent.getTag()) && b(iDMComponent)) {
                    arrayList.add(iDMComponent);
                }
            }
        }
        return arrayList;
    }

    public static int e(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9c8d4fa", new Object[]{jnyVar})).intValue();
        }
        List<IDMComponent> c = c(jnyVar);
        if (c == null) {
            return 0;
        }
        return c.size();
    }

    public static List<IDMComponent> f(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("472675bf", new Object[]{jnyVar});
        }
        ArrayList arrayList = null;
        if (jnyVar == null) {
            return null;
        }
        List<IDMComponent> b = jnyVar.b();
        if (b != null && b.size() > 0) {
            arrayList = new ArrayList();
            for (IDMComponent iDMComponent : b) {
                if (TextUtils.equals("item", iDMComponent.getTag())) {
                    arrayList.add(iDMComponent);
                }
            }
        }
        return arrayList;
    }

    public static void a(jny jnyVar, bbz bbzVar) {
        List<IDMComponent> m;
        int indexOf;
        int i;
        String str;
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afed3f9", new Object[]{jnyVar, bbzVar});
        } else if (!(jnyVar instanceof b) || (m = ((b) jnyVar).m()) == null || m.size() <= 0) {
        } else {
            String str2 = "0";
            BigDecimal bigDecimal = new BigDecimal(str2);
            HashSet hashSet = new HashSet();
            Iterator<IDMComponent> it = m.iterator();
            BigDecimal bigDecimal2 = bigDecimal;
            IDMComponent iDMComponent = null;
            int i2 = 0;
            long j3 = 0;
            long j4 = 0;
            boolean z = false;
            while (it.hasNext()) {
                Iterator<IDMComponent> it2 = it;
                IDMComponent next = it.next();
                if (next != null) {
                    str = str2;
                    if ("submit".equals(next.getTag())) {
                        iDMComponent = next;
                    }
                    if (!"item".equals(next.getTag()) || !b(next) || !a(false, next)) {
                        j = j3;
                        iDMComponent = iDMComponent;
                    } else {
                        int i3 = i2 + 1;
                        Long l = (Long) a(next, (Class<Object>) Long.class, "pay", "total");
                        IDMComponent iDMComponent2 = iDMComponent;
                        Long l2 = (Long) a(next, (Class<Object>) Long.class, "pay", "currencyUnitFactor");
                        BigDecimal bigDecimal3 = new BigDecimal(100);
                        if (l2 != null) {
                            j2 = j3;
                            bigDecimal3 = new BigDecimal(l2.longValue());
                        } else {
                            j2 = j3;
                        }
                        JSONObject jSONObject = next.getFields().getJSONObject("pay");
                        if ((jSONObject != null && jSONObject.containsKey("price")) && next.getFields().containsKey("quantity")) {
                            bigDecimal2 = bigDecimal2.add(new BigDecimal(jSONObject.getLongValue("price")).multiply(new BigDecimal(next.getFields().getLongValue("quantity"))).divide(bigDecimal3, 2, 6));
                        } else if (l != null) {
                            bigDecimal2 = bigDecimal2.add(new BigDecimal(l.longValue()).divide(bigDecimal3, 2, 6));
                        }
                        Long l3 = (Long) a(next, (Class<Object>) Long.class, "weight", "value");
                        if (l3 != null) {
                            j4 += l3.longValue();
                        }
                        String str3 = (String) a(next, (Class<Object>) String.class, "pay", "currencySymbol");
                        if (TextUtils.isEmpty(str3)) {
                            str3 = "￥";
                        }
                        hashSet.add(str3.trim());
                        j = j2 + 1;
                        i2 = i3;
                        iDMComponent = iDMComponent2;
                        z = true;
                    }
                } else {
                    str = str2;
                    j = j3;
                }
                str2 = str;
                it = it2;
                j3 = j;
            }
            String str4 = str2;
            long j5 = j3;
            if (iDMComponent == null) {
                return;
            }
            a(iDMComponent, Long.valueOf(bigDecimal2.multiply(new BigDecimal(100)).longValue()), "pay", "price");
            if (hashSet.size() > 1) {
                a(iDMComponent, com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21665), "pay", "priceTitle");
                a(iDMComponent, (Object) true, "pay", "multipleCurrencySymbol");
                a(iDMComponent, (Object) null, "pay", "currencySymbol");
            } else {
                String str5 = hashSet.iterator().hasNext() ? (String) hashSet.iterator().next() : "￥";
                a(iDMComponent, (Object) false, "pay", "multipleCurrencySymbol");
                a(iDMComponent, str5, "pay", "currencySymbol");
                if (bigDecimal2.multiply(new BigDecimal(100)).longValue() == 0) {
                    a(iDMComponent, "￥0", "pay", "priceTitle");
                    a(iDMComponent, "", "pay", KEY_DISCOUNT_TIPS);
                } else {
                    String str6 = str5 + bigDecimal2.toString();
                    if (!TextUtils.isEmpty(str6) && str6.contains(".") && (indexOf = str6.indexOf(".")) != -1 && (i = indexOf + 1) < str6.length() && TextUtils.isEmpty(str6.substring(i).replace(str4, ""))) {
                        str6 = str6.substring(0, indexOf);
                    }
                    a(iDMComponent, str6, "pay", "priceTitle");
                }
            }
            a(iDMComponent, Long.valueOf(j4), "weight", "value");
            a(iDMComponent, a(j4), "weight", "title");
            a(iDMComponent, Long.valueOf(j5), "quantity");
            if (!z) {
                a(iDMComponent, "disable", "submit", "status");
            } else {
                a(iDMComponent, "normal", "submit", "status");
            }
            a(iDMComponent, (Object) false, "pay", "fromServer");
            JSONObject fields = iDMComponent.getFields();
            if (fields != null) {
                fields.put("isHideCalculateBtn", (Object) true);
            }
            if (i2 > 0) {
                a(iDMComponent, String.format(com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21657), Integer.valueOf(i2)), "pay", "postTitle");
            } else {
                a(iDMComponent, "", "pay", "postTitle");
            }
        }
    }

    private static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        String bigDecimal = new BigDecimal(j).divide(new BigDecimal("1000"), 3, 6).toString();
        return bigDecimal + "kg";
    }

    public static <T> T a(IDMComponent iDMComponent, Class<T> cls, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f125c444", new Object[]{iDMComponent, cls, strArr});
        }
        if (iDMComponent != null && cls != null && iDMComponent.getFields() != null && strArr != null && strArr.length > 0) {
            Object fields = iDMComponent.getFields();
            for (int i = 0; i < strArr.length && (fields instanceof JSONObject); i++) {
                if (i == strArr.length - 1) {
                    return (T) ((JSONObject) fields).getObject(strArr[i], cls);
                }
                fields = ((JSONObject) fields).get(strArr[i]);
            }
            return null;
        }
        return null;
    }

    public static boolean a(IDMComponent iDMComponent, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de6a8b5b", new Object[]{iDMComponent, obj, strArr})).booleanValue();
        }
        if (iDMComponent != null && iDMComponent.getFields() != null && strArr != null && strArr.length > 0) {
            Object fields = iDMComponent.getFields();
            for (int i = 0; i < strArr.length && (fields instanceof JSONObject); i++) {
                if (i == strArr.length - 1) {
                    ((JSONObject) fields).put(strArr[i], obj);
                    return true;
                }
                fields = ((JSONObject) fields).get(strArr[i]);
            }
            return false;
        }
        return false;
    }

    public static boolean a(boolean z, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83305b6c", new Object[]{new Boolean(z), iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return false;
        }
        JSONObject fields = iDMComponent.getFields();
        if (z) {
            if (fields.containsKey(KEY_CAN_CHECK_IN_MANAGE) && "true".equals(fields.getString(KEY_CAN_CHECK_IN_MANAGE))) {
                return true;
            }
        } else if (fields.containsKey(KEY_CAN_CHECK_IN_NORMAL) && "true".equals(fields.getString(KEY_CAN_CHECK_IN_NORMAL))) {
            return true;
        }
        return false;
    }

    public static boolean a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent == null) {
            return false;
        }
        JSONObject fields = iDMComponent.getFields();
        return fields.containsKey(KEY_CAN_CHECK_IN_NORMAL) && "true".equals(fields.getString(KEY_CAN_CHECK_IN_NORMAL));
    }

    public static boolean b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73527f0f", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return false;
        }
        JSONObject fields = iDMComponent.getFields();
        return fields.containsKey("isChecked") && "true".equals(fields.getString("isChecked"));
    }

    public static IDMComponent c(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("60ed112e", new Object[]{iDMComponent});
        }
        if (iDMComponent != null && iDMComponent.getParent() != null && iDMComponent.getParent().getParent() != null) {
            for (IDMComponent iDMComponent2 : iDMComponent.getParent().getParent().getChildren()) {
                if (iDMComponent2 != null && "shop".equals(iDMComponent2.getTag())) {
                    return iDMComponent2;
                }
            }
        }
        return null;
    }

    public static void a(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6484868", new Object[]{iDMComponent, new Boolean(z)});
        } else if (iDMComponent == null) {
        } else {
            iDMComponent.getFields().put("isChecked", (Object) String.valueOf(z));
            CheckHoldManager.a().a(iDMComponent.getFields(), z);
        }
    }

    public static void d(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2cad49", new Object[]{iDMComponent});
        } else if (iDMComponent == null || iDMComponent.getData() == null) {
        } else {
            iDMComponent.getData().put("status", "hidden");
        }
    }

    public static void e(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a19c468", new Object[]{iDMComponent});
        } else if (iDMComponent == null || iDMComponent.getData() == null) {
        } else {
            iDMComponent.getData().remove("status");
        }
    }

    public static void f(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a706db87", new Object[]{iDMComponent});
        } else if (iDMComponent == null || iDMComponent.getData() == null) {
        } else {
            if (TextUtils.equals(iDMComponent.getData().getString("status"), "hidden")) {
                e(iDMComponent);
            } else {
                d(iDMComponent);
            }
        }
    }

    public static String g(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7800e2ba", new Object[]{iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        if (t(iDMComponent)) {
            return iDMComponent.getId();
        }
        return g(iDMComponent.getParent());
    }

    public static String h(IDMComponent iDMComponent) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abaf0d7b", new Object[]{iDMComponent});
        }
        if (iDMComponent != null && (fields = iDMComponent.getFields()) != null) {
            return fields.getString("cartId");
        }
        return null;
    }

    public static List<IDMComponent> a(bcb bcbVar, com.taobao.android.ultron.common.model.b bVar) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ac8026c1", new Object[]{bcbVar, bVar});
        }
        if (bVar == null || (string = bVar.getFields().getString("nextRenderRoot")) == null) {
            return null;
        }
        List<IDMComponent> components = bVar.getComponents();
        if (components == null) {
            components = bcbVar.w().a(string);
            if (bVar instanceof DMEvent) {
                ((DMEvent) bVar).setComponents(components);
            }
        }
        return components;
    }

    public static IDMComponent a(jny jnyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("fbbda991", new Object[]{jnyVar, str});
        }
        return jnyVar.b("bundle_" + str);
    }

    public static IDMComponent b(jny jnyVar, String str) {
        List<IDMComponent> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("a3398352", new Object[]{jnyVar, str});
        }
        IDMComponent a2 = a(jnyVar, str);
        if (a2 == null || (children = a2.getChildren()) == null) {
            return null;
        }
        for (IDMComponent iDMComponent : children) {
            if ("bundleHeader".equals(iDMComponent.getTag())) {
                return iDMComponent;
            }
        }
        return null;
    }

    public static List<IDMComponent> i(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fe9d4ce3", new Object[]{iDMComponent});
        }
        if (iDMComponent == null || iDMComponent.getChildren() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        a(arrayList, iDMComponent);
        return arrayList;
    }

    public static void a(List<IDMComponent> list, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ac5f9b", new Object[]{list, iDMComponent});
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        if (iDMComponent == null) {
            return;
        }
        if ((iDMComponent.getChildren() == null || iDMComponent.getChildren().isEmpty()) && ("item".equals(iDMComponent.getTag()) || "bundleHeader".equals(iDMComponent.getTag()))) {
            list.add(iDMComponent);
        }
        for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
            a(list, iDMComponent2);
        }
    }

    public static boolean j(IDMComponent iDMComponent) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dabb3807", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || (fields = iDMComponent.getFields()) == null) {
            return false;
        }
        if (fields.containsKey(KEY_IS_RELATION_ITEM)) {
            return fields.getBooleanValue(KEY_IS_RELATION_ITEM);
        }
        return j(iDMComponent.getParent());
    }

    public static IDMComponent k(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("64c5be26", new Object[]{iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        return t(iDMComponent) ? iDMComponent : k(iDMComponent.getParent());
    }

    public static IDMComponent c(jny jnyVar, String str) {
        List<IDMComponent> m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("4ab55d13", new Object[]{jnyVar, str});
        }
        if (TextUtils.isEmpty(str) || (m = ((b) jnyVar).m()) == null) {
            return null;
        }
        for (IDMComponent iDMComponent : m) {
            if (str.equals(h(iDMComponent))) {
                return iDMComponent;
            }
        }
        return null;
    }

    public static boolean l(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4956645", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent != null && iDMComponent.getFields() != null) {
            return iDMComponent.getFields().getBooleanValue("isRepeatBuy");
        }
        return false;
    }

    public static void a(bbz bbzVar, String str, String str2) {
        IDMComponent b;
        Map<String, List<com.taobao.android.ultron.common.model.b>> eventMap;
        List<com.taobao.android.ultron.common.model.b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69082e72", new Object[]{bbzVar, str, str2});
        } else if (bbzVar != null && bbzVar.O() != null && (b = bbzVar.O().b(str)) != null && (eventMap = b.getEventMap()) != null && (list = eventMap.get(str2)) != null) {
            for (com.taobao.android.ultron.common.model.b bVar : list) {
                bmz a2 = bbzVar.F().a();
                a2.c(str2);
                a2.a(bVar.getType());
                a2.a(bVar);
                a2.a(b);
                bbzVar.F().a(a2);
            }
        }
    }

    public static IDMComponent a(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("339b7bba", new Object[]{iDMComponent, str});
        }
        if (iDMComponent != null && !TextUtils.isEmpty(str)) {
            if (str.equals(iDMComponent.getTag())) {
                return iDMComponent;
            }
            IDMComponent parent = iDMComponent.getParent();
            if (parent != null && parent.getChildren() != null && !parent.getChildren().isEmpty()) {
                for (IDMComponent iDMComponent2 : parent.getChildren()) {
                    if (str.equals(iDMComponent2.getTag())) {
                        return iDMComponent2;
                    }
                }
                return a(parent, str);
            }
        }
        return null;
    }

    public static boolean m(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("81827d64", new Object[]{iDMComponent})).booleanValue() : r(iDMComponent) && !p(iDMComponent);
    }

    public static boolean o(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b5caba2", new Object[]{iDMComponent})).booleanValue();
        }
        List<IDMComponent> q = q(iDMComponent);
        if (q == null) {
            return false;
        }
        for (IDMComponent iDMComponent2 : q) {
            if (m(iDMComponent2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean p(IDMComponent iDMComponent) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2849c2c1", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || (fields = iDMComponent.getFields()) == null) {
            return false;
        }
        if (t(iDMComponent) && fields.containsKey("isCustomBundle")) {
            return fields.getBooleanValue("isCustomBundle");
        }
        return p(iDMComponent.getParent());
    }

    public static List<IDMComponent> q(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("36fc84eb", new Object[]{iDMComponent});
        }
        return iDMComponent == null ? new ArrayList() : i(k(iDMComponent));
    }

    public static boolean r(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4223f0ff", new Object[]{iDMComponent})).booleanValue() : "bundleHeader".equals(iDMComponent.getTag());
    }

    public static String a(List<IDMComponent> list, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2216817a", new Object[]{list, aVar});
        }
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (IDMComponent iDMComponent : list) {
            if ("item".equals(iDMComponent.getTag())) {
                String string = iDMComponent.getFields().getString("cartId");
                if (!TextUtils.isEmpty(string) && (aVar == null || aVar.a(iDMComponent))) {
                    sb.append(string);
                    sb.append(",");
                }
            }
        }
        if (sb.toString().endsWith(",")) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    public static String a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("80c38867", new Object[]{list}) : a(list, (a) null);
    }

    public static void a(bbz bbzVar) {
        List<String> a2;
        boolean z;
        IDMComponent k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16d505e", new Object[]{bbzVar});
            return;
        }
        List<IDMComponent> b = bbzVar.n().x().b();
        b bVar = (b) bbzVar.H();
        Map<String, DMComponent> u = bVar.u();
        ArrayList<String> arrayList = new ArrayList();
        for (IDMComponent iDMComponent : b) {
            if ("item".equals(iDMComponent.getTag()) && (k = k(iDMComponent)) != null) {
                arrayList.add(k.getKey());
            }
        }
        boolean z2 = false;
        for (String str : arrayList) {
            if (!TextUtils.isEmpty(str) && (a2 = bek.a(str, bVar.u())) != null) {
                Iterator<String> it = a2.iterator();
                DMComponent dMComponent = null;
                int i = 0;
                boolean z3 = true;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DMComponent dMComponent2 = u.get(it.next());
                    if (dMComponent2 != null) {
                        if ("shop".equals(dMComponent2.getTag()) || "bundleHeader".equals(dMComponent2.getTag())) {
                            i++;
                            dMComponent = dMComponent2;
                        } else {
                            boolean booleanValue = dMComponent2.getFields().getBooleanValue("isChecked");
                            if (!dMComponent2.getFields().getBooleanValue(KEY_CAN_CHECK_IN_NORMAL)) {
                                i++;
                            } else if (booleanValue) {
                                continue;
                            } else if (dMComponent != null) {
                                z3 = false;
                                break;
                            } else {
                                z3 = false;
                            }
                        }
                    }
                }
                if (a2.size() == i) {
                    z = false;
                    z3 = false;
                } else {
                    z = true;
                }
                if (dMComponent != null) {
                    JSONObject fields = dMComponent.getFields();
                    if (fields.getBooleanValue("isChecked") != z3) {
                        fields.put("isChecked", (Object) (z3 + ""));
                        z2 = true;
                    }
                    if (fields.getBooleanValue(KEY_CAN_CHECK_IN_NORMAL) != z) {
                        fields.put(KEY_CAN_CHECK_IN_NORMAL, (Object) (z + ""));
                        z2 = true;
                    }
                }
            }
        }
        if (!z2) {
            return;
        }
        bbzVar.x().b(2);
    }

    public static int g(jny jnyVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86cee1fc", new Object[]{jnyVar})).intValue();
        }
        if (jnyVar == null) {
            return 0;
        }
        for (IDMComponent iDMComponent : jnyVar.b()) {
            if (iDMComponent != null && "item".equals(iDMComponent.getTag())) {
                i++;
            }
        }
        return i;
    }

    public static List<IDMComponent> a(IDMComponent iDMComponent, bbz bbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("20484a25", new Object[]{iDMComponent, bbzVar});
        }
        ArrayList arrayList = new ArrayList();
        if (iDMComponent == null) {
            return arrayList;
        }
        JSONArray jSONArray = iDMComponent.getFields().getJSONArray("relationItems");
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                IDMComponent b = bbzVar.O().b(String.valueOf(it.next()));
                if (b != null && "item".equals(b.getTag())) {
                    arrayList.add(b);
                }
            }
            return arrayList;
        }
        IDMComponent parent = iDMComponent.getParent();
        if (parent == null) {
            arrayList.add(iDMComponent);
            return arrayList;
        }
        if (s(parent)) {
            for (IDMComponent iDMComponent2 : parent.getChildren()) {
                if (iDMComponent2 != null && "item".equals(iDMComponent2.getTag())) {
                    arrayList.add(iDMComponent2);
                }
            }
        } else {
            arrayList.add(iDMComponent);
        }
        return arrayList;
    }

    public static boolean s(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf11081e", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent == null) {
            return false;
        }
        JSONObject fields = iDMComponent.getFields();
        if (fields != null && fields.containsKey(KEY_IS_RELATION_ITEM)) {
            z = fields.getBoolean(KEY_IS_RELATION_ITEM).booleanValue();
        }
        return Boolean.TRUE.equals(Boolean.valueOf(z));
    }

    public static boolean t(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bfe1f3d", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getData() == null) {
            return false;
        }
        return "bundle".equals(iDMComponent.getTag()) || iDMComponent.getFields().getBooleanValue("isBundle");
    }

    public static String b(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2162506", new Object[]{list});
        }
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : list) {
            sb.append(obj);
            sb.append(",");
        }
        if (sb.toString().endsWith(",")) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    public static boolean a(bcb bcbVar) {
        List<IDMComponent> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1707efb", new Object[]{bcbVar})).booleanValue();
        }
        if (bcbVar.p()) {
            return false;
        }
        if (bcbVar.d() && !jdc.b(null)) {
            b = bcbVar.n().x().d().f();
        } else {
            b = bcbVar.w().b();
        }
        if (b == null) {
            return false;
        }
        for (IDMComponent iDMComponent : b) {
            if (iDMComponent != null && "item".equals(iDMComponent.getTag()) && !b(iDMComponent) && a(bcbVar.j(), iDMComponent)) {
                return false;
            }
        }
        return true;
    }

    public static void b(bcb bcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff38578", new Object[]{bcbVar});
            return;
        }
        IDMComponent e = bcbVar.e("submit");
        if (e == null) {
            return;
        }
        a(e, String.valueOf(a(bcbVar)), "isChecked");
    }

    public static List<IDMComponent> c(bcb bcbVar) {
        List<IDMComponent> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a1a8b52e", new Object[]{bcbVar});
        }
        if (bcbVar.d()) {
            b = bcbVar.n().x().d().f();
        } else {
            b = bcbVar.w().b();
        }
        ArrayList arrayList = null;
        if (b != null && b.size() > 0) {
            arrayList = new ArrayList();
            for (IDMComponent iDMComponent : b) {
                if (TextUtils.equals("item", iDMComponent.getTag())) {
                    arrayList.add(iDMComponent);
                }
            }
        }
        return arrayList;
    }

    public static void a(bcb bcbVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431959f3", new Object[]{bcbVar, str, new Boolean(z)});
            return;
        }
        IDMComponent e = bcbVar.e(str);
        if (e == null) {
            return;
        }
        e.getData().put("status", (Object) (z ? "normal" : "hidden"));
    }

    public static String h(jny jnyVar) {
        JSONObject q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b98f156", new Object[]{jnyVar});
        }
        if (jnyVar != null && (q = ((b) jnyVar).q()) != null) {
            return q.getString("queryParams");
        }
        return null;
    }

    public static int c(bbz bbzVar) {
        bez x;
        ViewGroup u;
        DXRootView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be735d53", new Object[]{bbzVar})).intValue();
        }
        if (bbzVar != null && (x = bbzVar.x()) != null && (u = x.u()) != null && (a2 = bek.a(u, "submit")) != null) {
            return a2.getMeasuredHeight();
        }
        return 0;
    }

    public static int b(bbz bbzVar) {
        bmi x;
        List<IDMComponent> c;
        DXRootView a2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cff056d2", new Object[]{bbzVar})).intValue();
        }
        if (bbzVar == null || (x = bbzVar.n().x()) == null || (c = x.c()) == null) {
            return 0;
        }
        for (IDMComponent iDMComponent : c) {
            if (iDMComponent != null && iDMComponent.isNormalComponent()) {
                String tag = iDMComponent.getTag();
                if (!"submit".equals(tag) && !"elevator".equals(tag) && !iDMComponent.getFields().getBooleanValue("isIgnoreStripe") && (a2 = bek.a(bbzVar.x().u(), tag)) != null) {
                    i += a2.getMeasuredHeight();
                }
            }
        }
        return i;
    }

    public static com.taobao.android.ultron.common.model.b a(IDMComponent iDMComponent, String str, String str2) {
        Map<String, List<com.taobao.android.ultron.common.model.b>> eventMap;
        List<com.taobao.android.ultron.common.model.b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("acbc74a5", new Object[]{iDMComponent, str, str2});
        }
        if (iDMComponent == null || str == null || str2 == null || (eventMap = iDMComponent.getEventMap()) == null || (list = eventMap.get(str)) == null) {
            return null;
        }
        for (com.taobao.android.ultron.common.model.b bVar : list) {
            if (bVar != null && str2.equals(bVar.getType())) {
                return bVar;
            }
        }
        return null;
    }
}
