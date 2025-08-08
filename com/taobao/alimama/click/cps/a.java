package com.taobao.alimama.click.cps;

import android.app.Application;
import android.net.Uri;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.utils.EnvironmentUtils;
import com.taobao.alimama.utils.UTAppBackgroundTimeoutDetector;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.alimama.utils.e;
import com.taobao.business.mtop.MunionRemoteBusiness;
import com.taobao.munion.taosdk.MunionUrlBuilder;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.muniontaobaosdk.util.b;
import com.taobao.orange.OrangeConfig;
import com.taobao.utils.Global;
import com.ut.mini.UTAnalytics;
import java.net.URLEncoder;
import java.util.HashMap;
import tb.kge;
import tb.kuh;

/* loaded from: classes4.dex */
public class a extends MunionRemoteBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_ID = "clickid";

    /* renamed from: a  reason: collision with root package name */
    private String f8417a;
    private String b;
    private String c;
    private boolean d;
    private String e;
    private String f;
    private String g;

    static {
        kge.a(878067434);
    }

    public a(Application application) {
        this(application, true);
    }

    public a(Application application, boolean z) {
        super(application);
        this.f8417a = "";
        this.b = "";
        this.c = "";
        this.e = "";
        this.g = "";
        this.f = RPCDataItems.CPS;
        this.d = z;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str == null || str.trim().length() == 0) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, "广告请求参数或者点击URL为空");
            return "";
        }
        try {
            String str2 = "A22_" + this.f + "_" + b.a(this.mApplication);
            HashMap hashMap = new HashMap();
            hashMap.put("ad_cid", b.a(str));
            hashMap.put("epid", this.f8417a);
            hashMap.put("uptime", String.valueOf(SystemClock.uptimeMillis() - Global.StartupTime));
            hashMap.put("alitrackid", this.g);
            UserTrackLogs.trackClick(9001, b.a(hashMap), str2);
            e.a("cps_click_before", b.a(hashMap), "clickid=" + str2);
            hashMap.put("redirecturl", this.b);
            UserTrackLogs.trackClick(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, b.a(hashMap), str2);
            e.a("cps_click_after", b.a(hashMap), "clickid=" + str2);
            if (this.d) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("clickid", str2);
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap2));
                if (EnvironmentUtils.isInTaobao() && "on".equals(OrangeConfig.getInstance().getConfig("alimama_ad", "set_ut_tpk_param_switch", "on")) && UTAppBackgroundTimeoutDetector.getInstance().shouldRewriteTpkCache()) {
                    UTAnalytics.getInstance().getDefaultTracker().addTPKCache("adTraceOprId", str2);
                    UTAppBackgroundTimeoutDetector.getInstance().setShouldRewriteTpkCache(false);
                }
            }
            return str2;
        } catch (Exception e) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, e.getMessage());
            return "";
        }
    }

    public Uri a(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("cc01728c", new Object[]{this, str, uri});
        }
        if (uri != null && uri.isHierarchical()) {
            try {
                this.b = URLEncoder.encode(uri.toString(), "UTF-8");
                this.f8417a = uri.getQueryParameter("epid");
                this.f8417a = this.f8417a == null ? "" : this.f8417a;
                this.g = uri.getQueryParameter(kuh.ALI_TRACK_ID);
                String queryParameter = uri.getQueryParameter("eads");
                if (!StringUtils.isEmpty(queryParameter)) {
                    this.f = queryParameter;
                }
                this.c = com.taobao.utils.a.a(uri.toString(), "e");
            } catch (Exception unused) {
            }
        }
        this.e = str;
        return MunionUrlBuilder.appendClickidToTargetUrl(uri, a(str));
    }
}
