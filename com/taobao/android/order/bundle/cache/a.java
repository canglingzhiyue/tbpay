package com.taobao.android.order.bundle.cache;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.TabType;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.protodb.Config;
import com.taobao.login4android.api.Login;
import java.util.Arrays;
import java.util.List;
import tb.bax;
import tb.bxb;
import tb.bxd;
import tb.cts;
import tb.iro;
import tb.jpt;
import tb.jqd;
import tb.jqg;
import tb.jqh;
import tb.kge;
import tb.spk;
import tb.sxz;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SCENE_FIRSTSCREEN = "firstScreen";
    public static final String SCENE_RELOADCONTAINER = "reloadContainer";
    public static final String TAG = "OrderListCache";

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f14537a;
    private static final sxz b;
    private static JSONObject c;
    private static jqd d;
    private static boolean e;

    public static /* synthetic */ void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            b(context, str);
        }
    }

    public static /* synthetic */ void a(org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{jSONObject});
        } else {
            b(jSONObject);
        }
    }

    public static /* synthetic */ jqd b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jqd) ipChange.ipc$dispatch("16b82e20", new Object[0]) : d();
    }

    public static /* synthetic */ sxz c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sxz) ipChange.ipc$dispatch("1e6e07c7", new Object[0]) : b;
    }

    static {
        kge.a(-762174612);
        e = true;
        f14537a = Arrays.asList(TabType.ALL.getValue(), TabType.WAIT_PAY.getValue(), TabType.WAIT_SEND.getValue(), TabType.WAIT_CONFIRM.getValue(), TabType.REFUND.getValue(), TabType.WAIT_RATE.getValue());
        b = new sxz("order_list");
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : e;
    }

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]);
        }
        e = false;
        return c;
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            c = null;
        }
    }

    private static jqd d() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqd) ipChange.ipc$dispatch("261b78de", new Object[0]);
        }
        jqd jqdVar = d;
        if (jqdVar != null) {
            return jqdVar;
        }
        if (b.c()) {
            str = "order_list_" + b.a().getLanguage();
        } else {
            str = "order_list";
        }
        Config config = new Config();
        config.walSize = 524288;
        jqd a2 = jqd.a(str, config);
        d = a2;
        return a2;
    }

    public static JSONObject a(Context context, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b5a9c494", new Object[]{context, str, str2});
        }
        c = null;
        if (TabType.REFUND.getValue().equals(str) || !bxd.a("enableOrderListCache", true)) {
            return null;
        }
        String userId = Login.getUserId();
        if (StringUtils.isEmpty(userId)) {
            a(str2, false, "session 过期");
            return null;
        }
        jqd d2 = d();
        String e2 = d2.e(userId + str);
        if (!spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enablePreRequestOrderList", true) || !StringUtils.isEmpty(e2)) {
            str3 = "LSDB 命中";
        } else {
            j f = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().f();
            e2 = f.a(userId + str, cts.a.BIZ_ORDER_LIST);
            str3 = "TradeCache 命中";
        }
        if (!StringUtils.isEmpty(e2)) {
            try {
                JSONObject parseObject = JSONObject.parseObject(e2);
                jqg.b(TAG, str + " use LSDBCache: " + str2);
                a(str2, true, str3);
                c = parseObject;
                return parseObject;
            } catch (Exception e3) {
                a(str2, false, "未命中：LSDBCache parser error" + e3.getMessage());
                return null;
            }
        }
        jqg.b(TAG, "LSDB is null");
        sxz sxzVar = b;
        byte[] b2 = sxzVar.b(context, userId + str);
        if (b2 == null) {
            a(str2, false, "未命中：" + str + " cache is null");
            return null;
        }
        try {
            JSONObject parseObject2 = JSONObject.parseObject(new String(b2));
            a(str2, true, "FileCache 命中, isMainThread: " + jqh.a());
            jqg.b(TAG, str + " use FileCache: " + str2);
            c = parseObject2;
            return parseObject2;
        } catch (Exception e4) {
            a(str2, false, "未命中：fileCache parser error " + e4.getMessage());
            return null;
        }
    }

    public static void a(final Context context, final String str, final org.json.JSONObject jSONObject, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d24ff6", new Object[]{context, str, jSONObject, str2, new Boolean(z)});
        } else if (!bxd.a("enableOrderListCache", true) || TabType.WAIT_RATE.getValue().equals(str)) {
        } else {
            final String userId = Login.getUserId();
            if (StringUtils.isEmpty(userId)) {
                jqg.b(TAG, "cache save failed: userId is null");
                return;
            }
            jqh.a(new Runnable() { // from class: com.taobao.android.order.bundle.cache.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        a.a(context, userId);
                        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("global");
                        if (optJSONObject != null) {
                            optJSONObject.put("isLoadFromCache", "true");
                        }
                        a.a(jSONObject);
                        String jSONObject2 = jSONObject.toString();
                        jqd b2 = a.b();
                        if (!b2.a(userId + str, jSONObject2)) {
                            jqg.b(a.TAG, "LSDB save failed");
                            sxz c2 = a.c();
                            Context context2 = context;
                            c2.a(context2, userId + str, jSONObject2.getBytes());
                        }
                        jqg.b(a.TAG, str + " cache saved");
                    } catch (Exception e2) {
                        jqg.b(a.TAG, str + " cache save failed: " + e2.getMessage());
                    }
                }
            });
            if (z && 3 == bax.a().f25741a) {
                a(userId, str, str2);
            }
            if (StringUtils.isEmpty(str2)) {
                return;
            }
            jqd d2 = d();
            d2.a(userId + str + "_orderIds", str2);
        }
    }

    public static void a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{str, list});
        } else if (list.isEmpty()) {
            jqg.b(TAG, str + " save imgs failed: cachedImgList is empty");
        } else {
            String userId = Login.getUserId();
            if (StringUtils.isEmpty(userId)) {
                jqg.b(TAG, str + " save imgs failed: userId is null");
                return;
            }
            try {
                String jSONString = JSON.toJSONString(list);
                jqd d2 = d();
                if (d2.a(userId + str + "_img", jSONString)) {
                    jqg.b(TAG, str + " imgs saved");
                    return;
                }
                jqg.b(TAG, str + " imgs save failed");
            } catch (Throwable th) {
                jqg.b(TAG, "save imgs failed: lsdb is error" + th.toString());
            }
        }
    }

    private static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
        } else if (context == null) {
        } else {
            SharedPreferences sharedPreferences = context.getSharedPreferences("order_list_userIds", 0);
            JSONArray jSONArray = null;
            String string = sharedPreferences.getString("userId", null);
            jqg.b(TAG, "oldUserIds: " + string);
            try {
                jSONArray = JSONArray.parseArray(string);
            } catch (Exception e2) {
                jqg.b(TAG, "no userIds: " + e2.getMessage());
            }
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            } else if (jSONArray.contains(str)) {
                jSONArray.remove(str);
            } else if (jSONArray.size() >= bxd.a("maxAccountSize", 2)) {
                c(context, jSONArray.getString(0));
                jSONArray.mo1572remove(0);
            }
            jSONArray.add(str);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            String jSONArray2 = jSONArray.toString();
            edit.putString("userId", jSONArray2);
            edit.commit();
            jqg.b(TAG, "newUserIds: " + jSONArray2);
        }
    }

    private static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{context, str});
        } else if (bxd.a("enableOrderListCache", true)) {
            for (String str2 : f14537a) {
                jqd d2 = d();
                d2.c(str + str2);
                context.deleteFile("order_list" + str + str2);
            }
            jqg.b(TAG, "cache cleared: " + str);
        }
    }

    private static void b(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345f6975", new Object[]{jSONObject});
        } else if (Build.VERSION.SDK_INT >= 19) {
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("hierarchy");
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
            if (optJSONObject2 == null || optJSONObject3 == null || (optJSONObject = optJSONObject2.optJSONObject("structure")) == null) {
                return;
            }
            org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("boughtlist");
            if (optJSONArray == null) {
                optJSONArray = optJSONObject.optJSONArray("boughtlist4");
            }
            if (optJSONArray == null) {
                return;
            }
            int a2 = bxd.a("cacheReserveGroupCount", 5);
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                String optString = optJSONArray.optString(i3);
                if (!StringUtils.isEmpty(optString) && optString.startsWith("MainGroup")) {
                    i2++;
                    if (i2 > a2) {
                        org.json.JSONArray optJSONArray2 = optJSONObject.optJSONArray(optString);
                        if (optJSONArray2 != null) {
                            a(optJSONObject, optJSONArray2, optJSONObject3);
                        }
                        optJSONObject3.remove(optString);
                        optJSONObject.remove(optString);
                    }
                    i = i3;
                }
            }
            while (i2 > a2) {
                optJSONArray.remove(i);
                i2--;
                i--;
            }
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("global");
            if (optJSONObject4 == null) {
                return;
            }
            try {
                optJSONObject4.put("orderCount", String.valueOf(i2));
            } catch (Exception unused) {
            }
        }
    }

    private static void a(org.json.JSONObject jSONObject, org.json.JSONArray jSONArray, org.json.JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2da27ce", new Object[]{jSONObject, jSONArray, jSONObject2});
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(optString);
            if (optJSONArray == null) {
                jSONObject2.remove(optString);
            } else {
                a(jSONObject, optJSONArray, jSONObject2);
            }
            jSONObject2.remove(optString);
            jSONObject.remove(optString);
        }
    }

    private static void a(String str, String str2, String str3) {
        String str4;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (!bxd.a("needCompareOrderIds", true)) {
        } else {
            jqd d2 = d();
            String e2 = d2.e(str + str2 + "_orderIds");
            boolean isEmpty = StringUtils.isEmpty(e2);
            boolean isEmpty2 = StringUtils.isEmpty(str3);
            if ((!isEmpty || isEmpty2) && (isEmpty || !isEmpty2)) {
                str4 = "";
                z = false;
            } else {
                str4 = "orderIds is null";
                z = true;
            }
            if (!isEmpty && !isEmpty2) {
                String[] split = e2.split(",", 4);
                String[] split2 = str3.split(",", 4);
                int i = 0;
                while (true) {
                    if (i < Math.min(split.length, split2.length)) {
                        if (split[i].equals(split2[i])) {
                            if (i == 2) {
                                break;
                            }
                            i++;
                        } else {
                            str4 = "orderIds different";
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                jpt a2 = bxb.a.b(OrderBizCode.orderList, "cacheConsistency").a(0.01f);
                bxb.a(a2.a(str2 + "缓存不一致: " + str4).a(false));
                return;
            }
            bxb.a(bxb.a.b(OrderBizCode.orderList, "cacheConsistency").a(0.001f).a("缓存一致").a(true));
        }
    }

    private static void a(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b0622c", new Object[]{str, new Boolean(z), str2});
        } else if (!SCENE_FIRSTSCREEN.equals(str)) {
        } else {
            bxb.a(bxb.a.b(OrderBizCode.orderList, TAG).a(z ? 5.0E-4f : 0.001f).a(str2).a(z));
        }
    }
}
