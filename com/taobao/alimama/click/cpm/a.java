package com.taobao.alimama.click.cpm;

import android.net.Uri;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.cpm.e;
import com.taobao.alimama.utils.EnvironmentUtils;
import com.taobao.alimama.utils.UTAppBackgroundTimeoutDetector;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.alimama.utils.c;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.muniontaobaosdk.util.b;
import com.taobao.orange.OrangeConfig;
import com.taobao.utils.Global;
import com.ut.mini.UTAnalytics;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.dhf;
import tb.dhg;
import tb.dhm;
import tb.dhq;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_ID = "clickid";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f8415a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;

    static {
        kge.a(1421316016);
    }

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de4cdc78", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ String b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8685b17", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ String c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1283d9b6", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ String d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2c9f5855", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ String e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("46bad6f4", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ String f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("60d65593", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ Map g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7756abe3", new Object[]{aVar}) : aVar.f8415a;
    }

    public a(String str, Map<String, String> map) {
        this.b = str;
        this.f8415a = map;
    }

    private String a(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (StringUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = str2 + "_";
        }
        if (!StringUtils.isEmpty(str) && str.contains("click.mz.simba.taobao.com/brand")) {
            return "A42_" + str3 + b.a();
        }
        return "A17_" + str3 + b.a();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String str = "";
        if (StringUtils.isEmpty(this.b)) {
            return str;
        }
        Pair<Long, Long> a2 = e.a(this.b);
        if (a2 != null) {
            long longValue = ((Long) a2.first).longValue();
            long longValue2 = ((Long) a2.second).longValue();
            long currentTimeMillis = System.currentTimeMillis() - longValue;
            if (currentTimeMillis > longValue2) {
                UserTrackLogs.trackLog(19999, "munionAdForClickExpired", String.valueOf(currentTimeMillis), this.b, null);
            }
        }
        Map<String, String> map = this.f8415a;
        this.d = b.d(map == null ? str : map.get("epid"));
        Map<String, String> map2 = this.f8415a;
        this.c = map2 == null ? null : map2.get("presetClickId");
        Map<String, String> map3 = this.f8415a;
        String d = b.d(map3 == null ? str : map3.get("aurl"));
        Map<String, String> map4 = this.f8415a;
        String str2 = map4 == null ? str : map4.get("eadt");
        Map<String, String> map5 = this.f8415a;
        boolean z = map5 != null && "true".equals(map5.get("isOpenPage"));
        Map<String, String> map6 = this.f8415a;
        this.g = b.d(map6 == null ? str : map6.get("mmAdArgs"));
        Map<String, String> map7 = this.f8415a;
        this.e = b.d(map7 == null ? str : map7.get("host"));
        Map<String, String> map8 = this.f8415a;
        if (map8 != null) {
            str = map8.get("path");
        }
        this.f = b.d(str);
        if (this.c == null) {
            this.c = a(this.b, str2);
        }
        CpmClickRequest b = b(this.c, this.b);
        try {
            d = URLEncoder.encode(d, "UTF-8");
        } catch (Exception unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ad_cid", b.a(this.b));
        hashMap.put("epid", this.d);
        hashMap.put("aurl", d);
        hashMap.put("uptime", String.valueOf(SystemClock.uptimeMillis() - Global.StartupTime));
        hashMap.put("host", this.e);
        hashMap.put("path", this.f);
        hashMap.put("mmAdArgs", this.g);
        if (c.d()) {
            UserTrackLogs.trackAdLog("cpm_click_before", b.a(hashMap), "clickid=" + this.c);
        } else {
            UserTrackLogs.trackClick(9001, b.a(hashMap), this.c);
        }
        com.taobao.alimama.utils.e.a("cpm_click_before", b.a(hashMap), "clickid=" + this.c);
        dhq dhqVar = new dhq(null, dhm.RETRY_FIVE_TIMES, b, CpmClickResponse.class);
        dhqVar.a(new C0326a());
        dhg.a().a(dhqVar);
        if (z) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("clickid", this.c);
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap2));
            if (EnvironmentUtils.isInTaobao() && "on".equals(OrangeConfig.getInstance().getConfig("alimama_ad", "set_ut_tpk_param_switch", "on")) && UTAppBackgroundTimeoutDetector.getInstance().shouldRewriteTpkCache()) {
                UTAnalytics.getInstance().getDefaultTracker().addTPKCache("adTraceOprId", this.c);
                UTAppBackgroundTimeoutDetector.getInstance().setShouldRewriteTpkCache(false);
            }
        }
        return this.c;
    }

    private static CpmClickRequest b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmClickRequest) ipChange.ipc$dispatch("75181113", new Object[]{str, str2});
        }
        CpmClickRequest cpmClickRequest = new CpmClickRequest();
        cpmClickRequest.cna = "";
        cpmClickRequest.e = str2;
        cpmClickRequest.ext = "";
        cpmClickRequest.referer = "";
        cpmClickRequest.utdid = MunionDeviceUtil.getUtdid();
        cpmClickRequest.accept = MunionDeviceUtil.getAccept(str);
        cpmClickRequest.useragent = MunionDeviceUtil.getUserAgent();
        cpmClickRequest.clickid = str;
        return cpmClickRequest;
    }

    /* renamed from: com.taobao.alimama.click.cpm.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0326a implements dhf {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long b;

        static {
            kge.a(-1366277598);
            kge.a(-744181563);
        }

        private C0326a() {
            this.b = SystemClock.uptimeMillis();
        }

        @Override // tb.dhf
        public void a(String str, Object obj) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                return;
            }
            CpmClickResponse cpmClickResponse = (CpmClickResponse) obj;
            if (cpmClickResponse == null || cpmClickResponse.mo2429getData() == null) {
                return;
            }
            String str3 = cpmClickResponse.mo2429getData().result;
            String str4 = "";
            if (!b.c(str3)) {
                return;
            }
            try {
                str4 = "redirecturl=" + URLEncoder.encode(str3, "UTF-8");
                str2 = str4 + String.format(",rttime=%s", String.valueOf(SystemClock.uptimeMillis() - this.b));
            } catch (UnsupportedEncodingException e) {
                TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, e.getMessage());
                str2 = str4;
            }
            if (c.d()) {
                UserTrackLogs.trackAdLog("cpm_click_after", str2, "clickid=" + a.a(a.this), "epid=" + a.b(a.this));
            } else {
                str2 = str2 + String.format(",hash_eurl=%s", b.a(a.c(a.this)));
                UserTrackLogs.trackClick(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, str2, a.a(a.this), a.b(a.this), a.d(a.this), a.e(a.this), a.f(a.this));
            }
            com.taobao.alimama.utils.e.a("cpm_click_after", str2, "clickid=" + a.a(a.this), b.a(a.g(a.this)));
        }

        @Override // tb.dhf
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("cpm_click_temp_fail", "error_code=" + str, "error_msg=" + str2, "clickid=" + a.a(a.this));
            com.taobao.alimama.utils.e.a("cpm_click_temp_failed", "error_code=" + str, "error_msg=" + str2, "eurl=" + Uri.encode(a.c(a.this)), "clickid=" + a.a(a.this), b.a(a.g(a.this)));
        }

        @Override // tb.dhf
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("cpm_click_fail", "error_code=" + str, "error_msg=" + str2, "clickid=" + a.a(a.this));
            com.taobao.alimama.utils.e.a("cpm_click_final_failed", "error_code=" + str, "error_msg=" + str2, "eurl=" + Uri.encode(a.c(a.this)), "clickid=" + a.a(a.this), b.a(a.g(a.this)));
        }
    }
}
