package tb;

import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.android.umbrella.link.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import com.taobao.tao.log.statistics.d;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bdo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXPOSURE_ONCE_KEY = "_exposureItemAutoUT";
    private static boolean b;

    /* renamed from: a  reason: collision with root package name */
    private bbz f25817a;

    static {
        kge.a(1039461460);
    }

    private static String a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{new Boolean(z)}) : z ? "1" : "0";
    }

    public static /* synthetic */ void a(bdo bdoVar, int i, String str, String str2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee8b3cf", new Object[]{bdoVar, new Integer(i), str, str2, str3, map});
        } else {
            bdoVar.a(i, str, str2, str3, map);
        }
    }

    public static /* synthetic */ void a(bdo bdoVar, IDMComponent iDMComponent, String str, int i, JSONObject jSONObject, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254e0585", new Object[]{bdoVar, iDMComponent, str, new Integer(i), jSONObject, map});
        } else {
            bdoVar.a(iDMComponent, str, i, jSONObject, map);
        }
    }

    public bdo(bbz bbzVar) {
        this.f25817a = bbzVar;
        b = jqi.a("iCart", "enableAsyncAutoUTExposureEvent", true);
    }

    public void a(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a050eeb6", new Object[]{this, iDMComponent, str});
        } else {
            a(iDMComponent, str, 2201, new HashMap());
        }
    }

    public void a(IDMComponent iDMComponent, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7faea0f", new Object[]{this, iDMComponent, str, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        a(iDMComponent, str, 2201, map);
    }

    public void b(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2681c15", new Object[]{this, iDMComponent, str});
        } else {
            a(iDMComponent, str, 2101, new HashMap());
        }
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("features")) != null && (jSONObject3 = jSONObject2.getJSONObject(BHRTaskConfigBase.TYPE_CONFIG_UT)) != null && jSONObject3.getBooleanValue("autoUt")) {
            return jSONObject3.getJSONObject("args");
        }
        return null;
    }

    private void a(final IDMComponent iDMComponent, final String str, final int i, final Map<String, String> map) {
        JSONObject jSONObject;
        final JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92b64d8", new Object[]{this, iDMComponent, str, new Integer(i), map});
        } else if (iDMComponent == null || iDMComponent.getData() == null || (jSONObject = iDMComponent.getData().getJSONObject("features")) == null || (jSONObject2 = jSONObject.getJSONObject(BHRTaskConfigBase.TYPE_CONFIG_UT)) == null || !jSONObject2.getBooleanValue("autoUt")) {
        } else {
            if (b) {
                map.put("currentCheckedCount", String.valueOf(CheckHoldManager.a().f()));
                this.f25817a.t().post(new Runnable() { // from class: tb.bdo.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            bdo.a(bdo.this, iDMComponent, str, i, jSONObject2, map);
                        } catch (Exception e) {
                            jqg.a("iCart", "asyncAutoUTException", e.getMessage());
                        }
                    }
                });
                return;
            }
            try {
                a(iDMComponent, str, i, jSONObject2, map);
            } catch (Exception e) {
                jqg.a("iCart", "autoUTException", e.getMessage());
            }
        }
    }

    private void a(IDMComponent iDMComponent, String str, final int i, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc708fa2", new Object[]{this, iDMComponent, str, new Integer(i), jSONObject, map});
            return;
        }
        final String format = String.format("Page_ShoppingCart_%s_%s", iDMComponent.getTag(), str);
        String string = jSONObject.getString("arg2");
        String string2 = jSONObject.getString("arg3");
        if (string == null) {
            string = "";
        }
        final String str2 = string2 == null ? "" : string2;
        final Map<String, String> a2 = a(this.f25817a, map);
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        if (jSONObject2 != null) {
            for (String str3 : jSONObject2.keySet()) {
                a2.put(str3, jSONObject2.getString(str3));
            }
        }
        String tag = iDMComponent.getTag();
        if ("item".equals(tag)) {
            a2.put(SFMuiseSDK.MUISE_BUNDLE_TYPE, a(iDMComponent));
            if ("item".equals(iDMComponent.getTag())) {
                try {
                    a2.put("itemIndex", String.valueOf(beb.a(iDMComponent, this.f25817a)));
                } catch (Exception e) {
                    bed.a("getModelIndexException", e.getMessage());
                }
            }
        } else if ("bundleHeader".equals(tag)) {
            a2.put(SFMuiseSDK.MUISE_BUNDLE_TYPE, a(iDMComponent));
            if (i == 2101) {
                String b2 = b(iDMComponent);
                if (!TextUtils.isEmpty(b2)) {
                    a2.put("checkedItemIds", b2);
                }
            }
        } else if ("shop".equals(iDMComponent.getTag()) && i == 2101) {
            String b3 = b(iDMComponent);
            if (!TextUtils.isEmpty(b3)) {
                a2.put("checkedItemIds", b3);
            }
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            final String str4 = string;
            this.f25817a.t().post(new Runnable() { // from class: tb.bdo.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        bdo.a(bdo.this, i, format, str4, str2, a2);
                    }
                }
            });
            return;
        }
        a(i, format, string, str2, a2);
    }

    private void a(int i, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82762f2c", new Object[]{this, new Integer(i), str, str2, str3, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(this.f25817a.v().f(), i, str, str2, str3, map).build());
        }
    }

    public static Map<String, String> a(bbz bbzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("64246613", new Object[]{bbzVar}) : a(bbzVar, (Map<String, String>) null);
    }

    private static Map<String, String> a(bbz bbzVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b5e2955c", new Object[]{bbzVar, map});
        }
        bcb n = bbzVar.n();
        HashMap hashMap = new HashMap();
        hashMap.put("isPoplayerFiltering", a(n.d()));
        hashMap.put("isManaging", a(n.j()));
        hashMap.put("currentFilterItem", n.b() == null ? "" : n.b());
        hashMap.put("cartFrom", bbzVar.v().a());
        hashMap.put("cartMode", bem.t(n) ? "mix" : "");
        hashMap.put(d.PARAM_IS_INNER, a(bgd.a()));
        hashMap.put("iCart", "true");
        hashMap.put(a.PARAM_TINCT_TAG, bpt.a("iCart"));
        hashMap.put("currentCheckedCount", CheckHoldManager.a().f() + "");
        hashMap.put(ieu.sKeyFeedFlowType, bbzVar.v().w());
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public static String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41ebe234", new Object[]{iDMComponent}) : bei.p(iDMComponent) ? "custom" : bei.o(iDMComponent) ? "shop" : "empty";
    }

    private String b(IDMComponent iDMComponent) {
        List<IDMComponent> q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("759a0cf5", new Object[]{this, iDMComponent});
        }
        if (iDMComponent == null || bei.b(iDMComponent) || (q = bei.q(iDMComponent)) == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (IDMComponent iDMComponent2 : q) {
            if ("item".equals(iDMComponent2.getTag()) && bei.a(iDMComponent2)) {
                sb.append(iDMComponent2.getFields().getString("itemId"));
                sb.append("#");
            }
        }
        if (sb.toString().endsWith("#")) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }
}
