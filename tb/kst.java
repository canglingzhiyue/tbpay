package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.c;
import com.taobao.homepage.utils.i;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.realtimerecommend.j;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.tao.util.TaoHelper;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.global.SDKUtils;

/* loaded from: classes.dex */
public class kst {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, ksj> f30293a;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !TextUtils.equals(str, ksk.HOME_MAIN.b) && !TextUtils.equals(str, ksk.HOME_INTL.b) && !TextUtils.equals(str, ksk.HOME_CUN.b) && !TextUtils.equals(str, ksk.HOME_OLD.b) && !TextUtils.equals(str, ksk.REC_MAIN.b) && !TextUtils.equals(str, ksk.REC_INTL.b) && !TextUtils.equals(str, ksk.REC_CUN.b) && !TextUtils.equals(str, ksk.REC_OLD.b);
    }

    public static long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue() : j + (SDKUtils.getTimeOffset() * 1000);
    }

    public static int a(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c1aa3516", new Object[]{str, list})).intValue();
        }
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (a(list.get(i).getString("sectionBizCode"), str)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.equals(str, str2)) {
            if (!TextUtils.equals(str + "_delta", str2)) {
                if (!TextUtils.equals(str, str2 + "_delta")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null || !a(jSONObject.getString("sectionBizCode"), jSONObject2.getString("sectionBizCode"))) {
            return false;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("item");
        JSONObject jSONObject4 = jSONObject2.getJSONObject("item");
        if (jSONObject3 != jSONObject4) {
            if (jSONObject3 == null || jSONObject4 == null || jSONObject3.size() != jSONObject4.size()) {
                return false;
            }
            for (String str : jSONObject3.keySet()) {
                JSONObject jSONObject5 = jSONObject3.getJSONObject(str);
                JSONObject jSONObject6 = jSONObject4.getJSONObject(str);
                if (jSONObject5 == jSONObject6 || (jSONObject5 != null && jSONObject6 != null && TextUtils.equals(jSONObject5.getString("content"), jSONObject6.getString("content")) && TextUtils.equals(jSONObject5.getString(e.KEY_SMART_CONTENT), jSONObject6.getString(e.KEY_SMART_CONTENT)) && TextUtils.equals(jSONObject5.getString("voiceText"), jSONObject6.getString("voiceText")) && TextUtils.equals(jSONObject5.getString("ext"), jSONObject6.getString("ext")))) {
                }
                return false;
            }
        }
        JSONObject jSONObject7 = jSONObject.getJSONObject("subSection");
        JSONObject jSONObject8 = jSONObject2.getJSONObject("subSection");
        if (jSONObject7 != jSONObject8) {
            if (jSONObject7 == null || jSONObject8 == null || jSONObject7.size() != jSONObject8.size()) {
                return false;
            }
            for (String str2 : jSONObject7.keySet()) {
                if (!a(jSONObject7.getJSONObject(str2), jSONObject8.getJSONObject(str2))) {
                    return false;
                }
            }
        }
        if (jSONObject3 == null && jSONObject4 == null && jSONObject7 == null && jSONObject8 == null) {
            if (jSONObject.size() != jSONObject2.size()) {
                return false;
            }
            for (String str3 : jSONObject.keySet()) {
                JSONObject jSONObject9 = jSONObject.getJSONObject(str3);
                JSONObject jSONObject10 = jSONObject2.getJSONObject(str3);
                if (jSONObject9 != jSONObject10 && (jSONObject9 == null || jSONObject10 == null || !TextUtils.equals(jSONObject9.getString("content"), jSONObject10.getString("content")) || !TextUtils.equals(jSONObject9.getString(e.KEY_SMART_CONTENT), jSONObject10.getString(e.KEY_SMART_CONTENT)) || !TextUtils.equals(jSONObject9.getString("voiceText"), jSONObject10.getString("voiceText")) || !TextUtils.equals(jSONObject9.getString("ext"), jSONObject10.getString("ext")))) {
                    return false;
                }
            }
        }
        return true;
    }

    static {
        kge.a(203918332);
        f30293a = new ConcurrentHashMap(16);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f30293a.clear();
        }
    }

    public static List<String> b(String str) {
        ksk[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{str});
        }
        ArrayList arrayList = new ArrayList(ksk.values().length);
        for (ksk kskVar : ksk.values()) {
            if (TextUtils.equals(str, kskVar.b)) {
                arrayList.add(kskVar.f30287a);
            }
        }
        return arrayList;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        String str = (String) c.a("ttid", null);
        return TextUtils.isEmpty(str) ? TaoHelper.getTTID() : str;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        String str = (String) c.a("deviceId", null);
        return TextUtils.isEmpty(str) ? UTDevice.getUtdid(g.a()) : str;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        String str = (String) c.a("userId", null);
        return TextUtils.isEmpty(str) ? i.b() : str;
    }

    public static float a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("266fb78", new Object[]{jSONObject})).floatValue() : j.a(jSONObject, "windvaneDisplay", 0.2f);
    }

    public static String a(ksk kskVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6151114b", new Object[]{kskVar}) : kskVar == null ? "" : ksk.REC_ORDER_DETAIL.b.equals(kskVar.b) ? "ORDER_DETAIL_ANDROID" : ksk.REC_LOGISTICS.b.equals(kskVar.b) ? "WULIU_ANDROID" : ksk.REC_MC_CART.b.equals(kskVar.b) ? "MAO_CHAO_ANDROID" : ksk.REC_CART.b.equals(kskVar.b) ? "CART_ANDROID" : ksk.REC_ORDER_LIST.b.equals(kskVar.b) ? "ORDER_LIST_ANDROID" : ksk.REC_ORDER_LIST_CATAPULT.b.equals(kskVar.b) ? "ORDER_LIST_CATAPULT_ANDROID" : ksk.REC_FAVORITE.b.equals(kskVar.b) ? "COLLECTION_ANDROID" : ksk.REC_DIRECT_SALE_CART.b.equals(kskVar.b) ? "tmallhk_ds_native_taobao_android" : ksk.REC_ORDER_SEARCH_RESULTS.b.equals(kskVar.b) ? "ORDER_LIST_CATAPULT_ANDROID" : ksk.REC_PAY_SUCCESS.b.equals(kskVar.b) ? "PAY_SUCCESS_ANDROID" : ksk.REC_CONFIRM_RECEIPT.b.equals(kskVar.b) ? "CONFIRM_RECEIPT_ANDROID" : "";
    }
}
