package com.taobao.alimama.click.cpc;

import android.net.Uri;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.utils.EnvironmentUtils;
import com.taobao.alimama.utils.UTAppBackgroundTimeoutDetector;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.alimama.utils.c;
import com.taobao.alimama.utils.e;
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
    private Map<String, String> f8413a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;

    static {
        kge.a(-914516068);
    }

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f85cdfee", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ String b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12785e8d", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ String c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2c93dd2c", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ String d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("46af5bcb", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ String e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("60cada6a", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ String f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7ae65909", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ Map g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6b044c2d", new Object[]{aVar}) : aVar.f8413a;
    }

    public a(String str, Map<String, String> map) {
        this.b = str;
        this.f8413a = map;
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
        Map<String, String> map = this.f8413a;
        this.d = b.d(map == null ? str : map.get("epid"));
        Map<String, String> map2 = this.f8413a;
        this.c = map2 == null ? null : map2.get("presetClickId");
        Map<String, String> map3 = this.f8413a;
        String d = b.d(map3 == null ? str : map3.get("aurl"));
        Map<String, String> map4 = this.f8413a;
        String str2 = map4 == null ? null : map4.get("eadt");
        Map<String, String> map5 = this.f8413a;
        boolean z = map5 != null && "true".equals(map5.get("isOpenPage"));
        Map<String, String> map6 = this.f8413a;
        this.e = b.d(map6 == null ? str : map6.get("mmAdArgs"));
        Map<String, String> map7 = this.f8413a;
        this.f = b.d(map7 == null ? str : map7.get("host"));
        Map<String, String> map8 = this.f8413a;
        this.g = b.d(map8 == null ? str : map8.get("path"));
        if (this.c == null) {
            if (!StringUtils.isEmpty(str2)) {
                str = str2 + "_";
            }
            this.c = "A1_" + str + b.a();
        }
        CpcClickRequest a2 = a(this.c, this.b);
        try {
            d = URLEncoder.encode(d, "UTF-8");
        } catch (Exception unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ad_cid", b.a(this.b));
        hashMap.put("epid", this.d);
        hashMap.put("aurl", d);
        hashMap.put("uptime", String.valueOf(SystemClock.uptimeMillis() - Global.StartupTime));
        hashMap.put("host", this.f);
        hashMap.put("path", this.g);
        hashMap.put("mmAdArgs", this.e);
        if (c.b()) {
            UserTrackLogs.trackAdLog("cpc_click_before", b.a(hashMap), "clickid=" + this.c);
        } else {
            UserTrackLogs.trackClick(9001, b.a(hashMap), this.c);
        }
        e.a("cpc_click_before", b.a(hashMap), "clickid=" + this.c);
        dhq dhqVar = new dhq(null, dhm.RETRY_FIVE_TIMES, a2, CpcClickResponse.class);
        dhqVar.a(new C0325a());
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

    private static CpcClickRequest a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickRequest) ipChange.ipc$dispatch("af1a1908", new Object[]{str, str2});
        }
        CpcClickRequest cpcClickRequest = new CpcClickRequest();
        cpcClickRequest.cna = "";
        cpcClickRequest.ext = "";
        cpcClickRequest.referer = "";
        cpcClickRequest.utkey = "";
        cpcClickRequest.utsid = "";
        cpcClickRequest.host = "";
        cpcClickRequest.e = str2;
        cpcClickRequest.utdid = MunionDeviceUtil.getUtdid();
        cpcClickRequest.accept = MunionDeviceUtil.getAccept(str);
        cpcClickRequest.clickid = str;
        return cpcClickRequest;
    }

    /* renamed from: com.taobao.alimama.click.cpc.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0325a implements dhf {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long b;

        static {
            kge.a(1760522624);
            kge.a(-744181563);
        }

        private C0325a() {
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
            CpcClickResponse cpcClickResponse = (CpcClickResponse) obj;
            if (cpcClickResponse == null || cpcClickResponse.mo2429getData() == null) {
                return;
            }
            String str3 = cpcClickResponse.mo2429getData().result;
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
            if (c.b()) {
                UserTrackLogs.trackAdLog("cpc_click_after", str2, "clickid=" + a.a(a.this), "epid=" + a.b(a.this));
            } else {
                str2 = str2 + String.format(",hash_eurl=%s", b.a(a.c(a.this)));
                UserTrackLogs.trackClick(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, str2, a.a(a.this), a.b(a.this), a.d(a.this), a.e(a.this), a.f(a.this));
            }
            e.a("cpc_click_after", str2, "clickid=" + a.a(a.this), b.a(a.g(a.this)));
        }

        @Override // tb.dhf
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("cpc_click_temp_fail", "error_code=" + str, "error_msg=" + str2, "clickid=" + a.a(a.this));
            e.a("cpc_click_temp_failed", "error_code=" + str, "error_msg=" + str2, "eurl=" + Uri.encode(a.c(a.this)), "clickid=" + a.a(a.this), b.a(a.g(a.this)));
        }

        @Override // tb.dhf
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("cpc_click_fail", "error_code=" + str, "error_msg=" + str2, "clickid=" + a.a(a.this));
            e.a("cpc_click_final_failed", "error_code=" + str, "error_msg=" + str2, "eurl=" + Uri.encode(a.c(a.this)), "clickid=" + a.a(a.this), b.a(a.g(a.this)));
        }
    }
}
