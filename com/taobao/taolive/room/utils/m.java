package com.taobao.taolive.room.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.cgl;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21772a;
    private static long b;
    private static boolean c;
    private static int d;
    private static String e;
    private static String f;
    private static String g;
    private static long h;
    private static long i;

    static {
        kge.a(-2088542282);
        f21772a = m.class.getSimpleName();
        c = false;
        d = Integer.MIN_VALUE;
        g = "-1";
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : p() ? e : "";
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : p() && c;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : c;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            a((com.taobao.alilive.aliliveframework.frame.a) null, "init_afc_cold_launch", q(), (HashMap<String, String>) null, true);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            a((com.taobao.alilive.aliliveframework.frame.a) null, "simple_live_detail_response", q(), (HashMap<String, String>) null, true);
        }
    }

    public static void a(long j, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b062c2", new Object[]{new Long(j), new Boolean(z), str});
        } else {
            a(j, z, str, false, (String) null);
        }
    }

    public static void a(long j, boolean z, String str, boolean z2, String str2) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90db219c", new Object[]{new Long(j), new Boolean(z), str, new Boolean(z2), str2});
            return;
        }
        d = 0;
        b = j;
        f = str;
        c = z;
        e = UUID.randomUUID().toString();
        h = 0L;
        i = 0L;
        a.a(str);
        HashMap hashMap = new HashMap();
        hashMap.put("isLive", String.valueOf(z2));
        String queryParameter = (TextUtils.isEmpty(str2) || (parse = Uri.parse(str2)) == null) ? null : parse.getQueryParameter(aw.PARAM_TCP_OUTER_PARAM);
        hashMap.put("hasTcpOuterParams", TextUtils.isEmpty(queryParameter) ? "false" : "true");
        hashMap.put("tcpOuterParams", queryParameter);
        a(null, "first_init", b, hashMap);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae33dd36", new Object[]{aVar, hashMap});
        } else {
            a(aVar, "dx_panel_detail_request", q(), hashMap);
        }
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f856cb7", new Object[]{aVar, hashMap});
        } else {
            a(aVar, "dx_panel_detail_response", q(), hashMap);
        }
    }

    public static void c(com.taobao.alilive.aliliveframework.frame.a aVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d6fc38", new Object[]{aVar, hashMap});
        } else {
            a(aVar, "dx_panel_render_begin", q(), hashMap);
        }
    }

    public static void d(com.taobao.alilive.aliliveframework.frame.a aVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82288bb9", new Object[]{aVar, hashMap});
        } else {
            a(aVar, "dx_panel_render_finish", q(), hashMap);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{aVar});
        } else {
            b(aVar, "live_detail_request");
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc30e1e7", new Object[]{aVar, str});
            return;
        }
        g = str;
        b(aVar, "live_detail_response");
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c31b7c", new Object[]{aVar});
        } else {
            b(aVar, "comp_list_request");
        }
    }

    public static void c(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6cc19b", new Object[]{aVar});
        } else {
            b(aVar, "comp_list_response");
        }
    }

    public static void d(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1667ba", new Object[]{aVar});
        } else {
            a(aVar, "h5_container_init_begin", q(), (HashMap<String, String>) null, true);
        }
    }

    public static void e(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec00dd9", new Object[]{aVar});
        } else {
            a(aVar, "h5_container_init_finish", q(), (HashMap<String, String>) null, true);
        }
    }

    public static void f(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d069b3f8", new Object[]{aVar});
        } else {
            b(aVar, "h5_webview_init_success");
        }
    }

    public static void g(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2135a17", new Object[]{aVar});
        } else {
            a(aVar, "h5_url_start_load", q(), (HashMap<String, String>) null, true);
        }
    }

    public static void h(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3bd0036", new Object[]{aVar});
            return;
        }
        long q = q();
        h = q;
        a(aVar, "first_frame_render_finish", q, null);
    }

    public static void i(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a566a655", new Object[]{aVar});
            return;
        }
        long q = q();
        i = q;
        a(aVar, "video_launch_play", q, null);
    }

    public static long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de9", new Object[0])).longValue();
        }
        if (b()) {
            long j = h;
            if (j > 0) {
                long j2 = i;
                if (j2 > 0) {
                    return j - j2;
                }
            }
        }
        return 0L;
    }

    public static void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[0]);
        } else {
            d++;
        }
    }

    private static void b(com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589ede46", new Object[]{aVar, str});
        } else {
            a(aVar, str, q(), (HashMap<String, String>) null, false);
        }
    }

    private static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, long j, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cdc64d6", new Object[]{aVar, str, new Long(j), hashMap});
        } else {
            a(aVar, str, j, hashMap, false);
        }
    }

    private static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, long j, HashMap<String, String> hashMap, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb0e8be", new Object[]{aVar, str, new Long(j), hashMap, new Boolean(z)});
            return;
        }
        try {
            if (!p() && !z) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("session_id", e);
            hashMap2.put("timestamp", String.valueOf(j));
            hashMap2.put("is_first_liveroom", String.valueOf(p()));
            hashMap2.put("live_source", f);
            hashMap2.put("livesource", f);
            hashMap2.put("isAfcColdContext", String.valueOf(c));
            hashMap2.put("entry_live_source", f);
            hashMap2.put("room_status", g);
            if (cgl.i() != null) {
                hashMap2.put("is_login", String.valueOf(cgl.i().c()));
            }
            hashMap2.put("timestampSystemClock", String.valueOf(SystemClock.uptimeMillis()));
            if (hashMap != null) {
                hashMap2.putAll(hashMap);
            }
            if (pmd.a().e() == null) {
                a("Page_TaobaoLiveWatch", str, hashMap2);
            } else if (aVar == null) {
                pmd.a().e().a("Page_TaobaoLiveWatch", str, hashMap2);
            } else {
                ai.a(aVar, str, (Map<String, String>) hashMap2);
            }
            b(str + " time " + new Date(j).toString() + " " + (j % 1000) + " timeLen " + (j - b) + " timestampSystemClock " + SystemClock.uptimeMillis());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(str, "Button-" + str2);
        uTControlHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue();
        }
        int i2 = d;
        return i2 <= 1 && i2 >= 0;
    }

    private static long q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46c", new Object[0])).longValue() : System.currentTimeMillis();
    }

    public static void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{str, jSONObject});
        } else if (jSONObject == null) {
        } else {
            jSONObject.put("session_id", (Object) e);
            jSONObject.put("timestamp", (Object) String.valueOf(q()));
            jSONObject.put("timestampSystemClock", (Object) String.valueOf(SystemClock.uptimeMillis()));
            jSONObject.put("is_first_liveroom", (Object) String.valueOf(p()));
            jSONObject.put("isAfcColdContext", (Object) String.valueOf(c));
            long q = q();
            b("putFirstStartTrackParams " + str + " time " + new Date(q).toString() + " " + q + " timeLen " + (q - b) + " timestampSystemClock " + SystemClock.uptimeMillis() + " " + jSONObject.toJSONString());
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (!p()) {
        } else {
            TLog.loge("apm", f21772a + "_InitTaoLiveColdLaunch_" + str);
        }
    }

    public static void a(ViewGroup viewGroup, boolean z) {
        View findViewById;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4670d", new Object[]{viewGroup, new Boolean(z)});
        } else if (!b() || aa.cP() || viewGroup == null || (findViewById = viewGroup.findViewById(R.id.taolive_top_afc_loading)) == null) {
        } else {
            if (!z) {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
    }

    public static void a(Context context, boolean z) {
        View findViewById;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
        } else if (!b() || aa.cP() || !(context instanceof Activity) || (findViewById = ((Activity) context).findViewById(R.id.taolive_top_afc_loading)) == null) {
        } else {
            if (!z) {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
    }
}
