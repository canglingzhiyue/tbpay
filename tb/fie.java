package tb;

import android.app.Activity;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.detail2.core.framework.e;
import com.taobao.android.detail2.core.framework.view.feeds.d;
import com.taobao.flowcustoms.afc.utils.b;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fie extends fic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1698650795);
    }

    public static /* synthetic */ Map a(Activity activity, int i, String str, String str2, String str3, Map map, fhi fhiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("adb9781c", new Object[]{activity, new Integer(i), str, str2, str3, map, fhiVar}) : b(activity, i, str, str2, str3, map, fhiVar);
    }

    public static /* synthetic */ void a(flz flzVar, Activity activity, fkr fkrVar, fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a45362", new Object[]{flzVar, activity, fkrVar, fhiVar});
        } else {
            b(flzVar, activity, fkrVar, fhiVar);
        }
    }

    @Override // tb.fic
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8cce74", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            eVar.a(new flq() { // from class: tb.fie.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.flq, tb.flr
                public void b(d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("340aa278", new Object[]{this, dVar});
                    } else if (dVar == null || !dVar.D()) {
                    } else {
                        if ((!"item".equals(dVar.H().g) && !fhp.VIEWHOLDER_KEY.equals(dVar.H().g)) || !dVar.H().q()) {
                            return;
                        }
                        fie.a(dVar.J(), dVar.I().g(), dVar.I().h(), (fhi) dVar.H());
                    }
                }

                @Override // tb.flq, tb.flr
                public void a(d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("799501f7", new Object[]{this, dVar});
                    } else if (dVar == null) {
                    } else {
                        if ((!fhp.VIEWHOLDER_KEY.equals(dVar.H().g) && !"item".equals(dVar.H().g)) || !dVar.H().q()) {
                            return;
                        }
                        fie.a(dVar.J(), dVar.I().g(), dVar.I().h(), (fhi) dVar.H());
                    }
                }
            });
            eVar.a(new fls() { // from class: tb.fie.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.fls
                public Map<String, String> a(Activity activity, int i, String str, String str2, String str3, Map<String, String> map, com.taobao.android.detail2.core.framework.data.model.d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("5d595389", new Object[]{this, activity, new Integer(i), str, str2, str3, map, dVar});
                    }
                    if (!(dVar instanceof fhi)) {
                        return null;
                    }
                    return fie.a(activity, i, str, str2, str3, map, (fhi) dVar);
                }
            });
        }
    }

    private static void b(flz flzVar, Activity activity, fkr fkrVar, fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2f7123", new Object[]{flzVar, activity, fkrVar, fhiVar});
            return;
        }
        ctu.a("trackCompleteExposureAd");
        if (activity == null) {
            ctu.a();
            return;
        }
        Uri data = activity.getIntent().getData();
        a((data == null || fhiVar.f != 0) ? null : data.toString(), fhiVar);
        if (fhiVar.z || fhiVar.f != 0) {
            ctu.a();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("clickid", fkrVar.h());
        flzVar.a("", hashMap);
        ctu.a();
    }

    private static void a(String str, fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2877fb5b", new Object[]{str, fhiVar});
            return;
        }
        ctu.a("commitTaokeInfoWithAfcId");
        HashMap hashMap = new HashMap();
        hashMap.put(b.AFC_ID, "");
        try {
            String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
            if (!StringUtils.isEmpty(globalProperty)) {
                hashMap.put(b.AFC_ID, globalProperty);
            }
            AlimamaAdvertising.instance().commitTaokeInfo(str, fhiVar.e(), fhiVar.k, fhiVar.f(), hashMap);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_NewDetail", 2101, "NewDetail_Button_Advert_SDKCall", "", "", null).build());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        ctu.a();
    }

    private static Map<String, String> b(Activity activity, int i, String str, String str2, String str3, Map<String, String> map, fhi fhiVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8783455d", new Object[]{activity, new Integer(i), str, str2, str3, map, fhiVar});
        }
        if (fhiVar == null || fhiVar.q == null || !"ad".equals(fhiVar.q.getString(fjp.BIZ_CONTEXT_KEY_CARD_TYPE)) || (jSONObject = fhiVar.q.getJSONObject("utAdList")) == null || (jSONObject2 = jSONObject.getJSONObject(str)) == null || !jSONObject2.getString("utType").equals(String.valueOf(i))) {
            return null;
        }
        String string = jSONObject2.getString("adUrlType");
        if (StringUtils.isEmpty(string) || (jSONObject3 = fhiVar.q.getJSONObject("adArgs")) == null) {
            return null;
        }
        String string2 = jSONObject3.getString(string);
        if (StringUtils.isEmpty(string2)) {
            return null;
        }
        JSONObject jSONObject4 = jSONObject2.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        if (jSONObject4 != null) {
            Uri.Builder buildUpon = Uri.parse(string2).buildUpon();
            for (Map.Entry<String, Object> entry : jSONObject4.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        buildUpon.appendQueryParameter(key, (String) value);
                    }
                }
            }
            string2 = buildUpon.toString();
        }
        if (i != 2101) {
            if (i == 2201) {
                AlimamaAdvertising.instance().buildIfsExposure(activity.getApplication(), string2).withArgPid("431468_1007").withArgNamespace("newdetail").commit();
            }
            return null;
        }
        String handleAdUrlForClickid = AlimamaAdvertising.instance().handleAdUrlForClickid(string2);
        if (StringUtils.isEmpty(handleAdUrlForClickid)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("clickid", handleAdUrlForClickid);
        return hashMap;
    }
}
