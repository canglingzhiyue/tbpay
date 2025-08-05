package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.detail.core.ultronengine.f;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.u;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fgw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final UMLinkLogInterface f27936a;
    private static final AliUserTrackerInterface b;
    private static long c;
    private static long d;

    static {
        kge.a(1445257517);
        f27936a = bpp.a();
        b = u.a();
        c = 0L;
        d = 0L;
        emu.a("com.taobao.android.detail.wrapper.utils.PicGalleryMonitor");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (str == null) {
        } else {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("itemId", str2);
                UMLinkLogInterface uMLinkLogInterface = f27936a;
                uMLinkLogInterface.commitFailure(str, "", "", "detail2", "has_downgrade", hashMap, str, "新头图降级原因: " + str);
            } catch (Exception e) {
                i.a("PicGalleryMonitor", "picGalleryDowngrade commit error " + Log.getStackTraceString(e));
            }
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(euw.ERROR_CODE_USE_NEW_PIC_INFO);
            sb.append(z ? "$v2" : "$v1");
            String sb2 = sb.toString();
            f27936a.commitFailure(sb2, "", "", "detail2", "mainpic_info", null, sb2, "命中新头图");
        } catch (Exception e) {
            i.a("PicGalleryMonitor", "useNewPicGallery commit error " + Log.getStackTraceString(e));
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            b.a("Page_Detail", 2201, "Page_Detail_Use_New_Gallery", null, null, "");
        } catch (Exception e) {
            i.a("PicGalleryMonitor", "newPicGalleryUT commit error " + Log.getStackTraceString(e));
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            b.a("Page_Detail", 2201, "Page_Detail_Use_Old_Gallery", null, null, "");
        } catch (Exception e) {
            i.a("PicGalleryMonitor", "oldPicGalleryUT commit error " + Log.getStackTraceString(e));
        }
    }

    public static void a(f fVar) {
        Map<String, String> d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06a2ac7", new Object[]{fVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ttid", (Object) b.f10050a);
        b k = fVar.k();
        if (k != null && (d2 = k.d()) != null) {
            jSONObject.put("itemId", (Object) d2.get("itemId"));
            jSONObject.put("traceId", (Object) d2.get("traceId"));
            jSONObject.put("spm", (Object) d2.get("spm"));
            jSONObject.put(p1.h, (Object) d2.get("BC_type"));
        }
        d c2 = fVar.c();
        if (c2 != null) {
            jSONObject.put("utdid", (Object) UTDevice.getUtdid(c2.a()));
            Map<String, String> i = c2.i();
            if (i != null) {
                jSONObject.put("userId", (Object) i.get("user_id"));
            }
        }
        jSONObject.put("time", (Object) String.valueOf(System.currentTimeMillis()));
        try {
            b.a("Page_Detail", 2201, "Page_Detail_Use_Old_Gallery", null, null, String.valueOf(jSONObject));
        } catch (Exception e) {
            i.a("PicGalleryMonitor", "oldPicGalleryUT commit error " + Log.getStackTraceString(e));
        }
    }

    public static void a(Context context, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a1f4fa", new Object[]{context, bVar});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - c < 800 || context == null) {
            return;
        }
        c = currentTimeMillis;
        HashMap hashMap = new HashMap();
        a(bVar, context, hashMap);
        try {
            ecg.a(context, hashMap, "头图降级1.0");
        } catch (Exception e) {
            i.a("PicGalleryMonitor", "oldPicGalleryUmbrella commit error " + Log.getStackTraceString(e));
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        try {
            b.a("Page_Detail", 2201, "Page_Detail_Has_Feature_Flag", null, null, "");
        } catch (Exception e) {
            i.a("PicGalleryMonitor", "hasFeaturePicGalleryUT commit error " + Log.getStackTraceString(e));
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        try {
            b.a("Page_Detail", 2201, "Page_Detail_No_Feature_Flag", null, null, "");
        } catch (Exception e) {
            i.a("PicGalleryMonitor", "noFeaturePicGalleryUT commit error " + Log.getStackTraceString(e));
        }
    }

    public static void a(b bVar, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d93fe99e", new Object[]{bVar, activity, str});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - d < 800 || activity == null) {
            return;
        }
        d = currentTimeMillis;
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(bVar, activity, hashMap);
        try {
            ecg.b(activity, hashMap, "头图降级1.0原因埋点");
        } catch (Exception e) {
            i.a("PicGalleryMonitor", "oldPicGalleryByFeatureUmbrella commit error " + Log.getStackTraceString(e));
        }
    }

    private static void a(b bVar, Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e77ffbf", new Object[]{bVar, context, map});
            return;
        }
        if (bVar != null) {
            Map<String, String> d2 = bVar.d();
            map.put("version", a(bVar));
            map.put("itemId", a(d2, bVar));
            if (d2 != null) {
                String str = "未知";
                map.put("spm", d2.get("spm") != null ? d2.get("spm") : str);
                if (d2.get("BC_type") != null) {
                    str = d2.get("BC_type");
                }
                map.put("bcType", str);
            }
            Map<String, String> e = bVar.e();
            if (e != null) {
                map.put("bizCode", e.get("aliBizCode"));
            }
        } else {
            map.put("nodeBundle", "isNull");
        }
        map.put("utdid", UTDevice.getUtdid(context));
        com.taobao.android.detail.datasdk.protocol.adapter.core.d c2 = epj.c();
        if (c2 == null) {
            return;
        }
        map.put("loginState", TextUtils.isEmpty(c2.e()) ? "0" : "1");
    }

    private static String a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("632ab5de", new Object[]{bVar});
        }
        String d2 = com.taobao.android.detail.core.ultronengine.b.d(bVar);
        if (d2 != null || bVar == null) {
            return d2;
        }
        JSONObject a2 = bVar.a();
        if (a2 == null) {
            return null;
        }
        return a2.containsKey("componentsVO") ? "V6+" : "V6";
    }

    private static String a(Map<String, String> map, b bVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9d70509", new Object[]{map, bVar});
        }
        String str = map != null ? map.get("itemId") : null;
        if (str != null || bVar == null) {
            return str;
        }
        JSONObject a2 = bVar.a();
        if (a2 != null && (jSONObject = a2.getJSONObject("item")) != null) {
            return jSONObject.getString("itemId");
        }
        return null;
    }
}
