package com.taobao.alimama.click.applink;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.utils.EnvironmentUtils;
import com.taobao.alimama.utils.UTAppBackgroundTimeoutDetector;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.alimama.utils.e;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.muniontaobaosdk.util.b;
import com.taobao.utils.Global;
import com.ut.mini.UTAnalytics;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.kuh;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean c;
    private String d;
    private Map<String, String> e;

    /* renamed from: a  reason: collision with root package name */
    private String f8412a = "";
    private String b = "";
    private boolean f = false;

    static {
        kge.a(-1129532175);
    }

    public a(String str, Map<String, String> map) {
        this.d = str;
        this.e = map;
    }

    public String a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String str2 = "";
        if (TextUtils.isEmpty(this.d)) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, "广告请求参数或者点击URL为空");
            return str2;
        }
        a(Uri.parse(this.d));
        Map<String, String> map = this.e;
        String str3 = map == null ? null : map.get("eadt");
        if (!TextUtils.isEmpty(str3)) {
            str2 = str3 + "_";
        }
        if (this.c) {
            str = "A220_";
        } else {
            str = this.f ? "A22C_" : "A270_";
        }
        String str4 = str + str2 + b.a(Global.getApplication());
        HashMap hashMap = new HashMap();
        hashMap.put("alitrackid", this.b);
        hashMap.put("uptime", String.valueOf(SystemClock.uptimeMillis() - Global.StartupTime));
        UserTrackLogs.trackClick(9001, b.a(hashMap), str4);
        e.a("app_link_click_before", b.a(hashMap), "clickid=" + str4);
        Map<String, String> map2 = this.e;
        if (map2 != null && "true".equals(map2.get("isOpenPage"))) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("clickid", str4);
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap2));
            if (EnvironmentUtils.isInTaobao() && UTAppBackgroundTimeoutDetector.getInstance().shouldRewriteTpkCache()) {
                UTAnalytics.getInstance().getDefaultTracker().addTPKCache("adTraceOprId", str4);
                UTAppBackgroundTimeoutDetector.getInstance().setShouldRewriteTpkCache(false);
            }
        }
        try {
            this.f8412a = URLEncoder.encode(this.f8412a, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, e.getMessage());
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("redirecturl", this.f8412a);
        hashMap3.put("alitrackid", this.b);
        UserTrackLogs.trackClick(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, b.a(hashMap3), str4);
        e.a("app_link_click_after", b.a(hashMap3), "clickid=", str4);
        return str4;
    }

    private void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else if (uri == null || !uri.isHierarchical()) {
        } else {
            this.b = uri.getQueryParameter(kuh.ALI_TRACK_ID);
            String str = this.b;
            if (str == null) {
                str = "";
            }
            this.b = str;
            this.c = this.b.startsWith("2:mm");
            this.f = this.b.startsWith("c:mm");
            this.f8412a = uri.toString();
        }
    }
}
