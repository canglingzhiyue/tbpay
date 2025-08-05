package com.taobao.android.fluid.business.usertrack.track.ut.videotracker;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.c;
import com.taobao.taobaoavsdk.util.f;
import com.taobao.vpm.VPMManagerInstance;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.kge;
import tb.obz;
import tb.pim;
import tb.psw;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f12425a;

    static {
        kge.a(-1465472317);
        f12425a = b.class.getSimpleName();
    }

    public static void a(psw pswVar, String str) {
        String str2;
        c.a aVar;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7de2c4e", new Object[]{pswVar, str});
        } else if (!com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.a()) {
        } else {
            try {
                c.a b = com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.b(str);
                if (b == null) {
                    return;
                }
                if (b.i <= 0 || (aVar = b.j) == null) {
                    str2 = "";
                } else {
                    if (b.d == aVar.d) {
                        i = 1;
                    } else {
                        i = b.d > aVar.d ? 2 : 3;
                    }
                    str2 = aVar.c;
                }
                d.a(pswVar, "opti_bitrate_info", String.valueOf(i), b.c, str2, b.a());
            } catch (Throwable th) {
                spz.a(f12425a, "", th);
            }
        }
    }

    public static void a(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3f5b84", new Object[]{pswVar});
        } else if (!pim.a()) {
        } else {
            try {
                HashMap<String, String> hAMetrics = VPMManagerInstance.getInstance().getHAMetrics("RefNetSpeed");
                if (hAMetrics == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(hAMetrics);
                jSONObject.put("netlib_speed", f.a() * 1000);
                String jSONObject2 = jSONObject.toString();
                d.a(pswVar, "vpm_ref_netspeed", jSONObject2, "", "", "");
                spz.c(f12425a, jSONObject2);
            } catch (Throwable th) {
                spz.a(f12425a, "", th);
            }
        }
    }

    public static void a(psw pswVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e547c977", new Object[]{pswVar, str, map});
        } else if (map == null) {
        } else {
            try {
                String str2 = map.get("definition");
                String str3 = map.get("optiCode");
                String playScenes = pswVar.z().getInstanceConfig().getPlayScenes();
                sps sessionParams = ((ISceneConfigService) pswVar.z().getService(ISceneConfigService.class)).getSessionParams();
                String str4 = null;
                if (sessionParams != null) {
                    str4 = sessionParams.c;
                }
                map.put("playScene", playScenes);
                map.put("source", str4);
                String a2 = obz.a(map);
                String str5 = f12425a;
                spz.c(str5, "trackStreamopti svm_reserve1=" + str + "; svm_reserve2=" + str2 + ";svm_reserve3=" + str3 + ";svm_reserves=" + a2);
                d.a(pswVar, "stream_opti", str, str2, str3, a2);
            } catch (Throwable th) {
                spz.a(f12425a, "", th);
            }
        }
    }
}
