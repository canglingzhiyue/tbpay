package com.taobao.munion.taosdk;

import android.app.Application;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.net.pojo.request.SendCpcInfoRequest;
import com.taobao.alimama.net.pojo.response.P4pCpcInfoResponse;
import com.taobao.alimama.utils.EnvironmentUtils;
import com.taobao.alimama.utils.UTAppBackgroundTimeoutDetector;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.alimama.utils.e;
import com.taobao.business.mtop.MunionRemoteBusiness;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.muniontaobaosdk.util.b;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.utils.Global;
import com.ut.mini.UTAnalytics;
import java.net.URLEncoder;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dhe;
import tb.kge;

/* loaded from: classes7.dex */
public class CpcEventCommitter extends MunionRemoteBusiness implements MunionEventCommitter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_ID = "clickid";
    private static final int REQUEST_TYPE = 0;
    private String aurl;
    private String eadt;
    private String epid;
    private String eurl;
    private boolean mIsOpenPage;

    static {
        kge.a(-1966944631);
        kge.a(162073871);
    }

    public static /* synthetic */ String access$000(CpcEventCommitter cpcEventCommitter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e9ffc43", new Object[]{cpcEventCommitter}) : cpcEventCommitter.eurl;
    }

    public CpcEventCommitter(Application application) {
        this(application, true);
    }

    public CpcEventCommitter(Application application, boolean z) {
        super(application);
        this.epid = "";
        this.aurl = "";
        this.eadt = "";
        this.eurl = "";
        this.mIsOpenPage = z;
    }

    public CpcEventCommitter setEadt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcEventCommitter) ipChange.ipc$dispatch("e9a62dfd", new Object[]{this, str});
        }
        this.eadt = b.d(str);
        return this;
    }

    @Override // com.taobao.munion.taosdk.MunionEventCommitter
    public String commitEvent(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("133d892c", new Object[]{this, str});
        }
        if (str == null || str.trim().length() == 0) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, "广告请求参数或者点击URL为空");
            return "";
        }
        try {
            if (TextUtils.isEmpty(this.eadt)) {
                str2 = "";
            } else {
                str2 = this.eadt + "_";
            }
            String str3 = "A1_" + str2 + b.a(this.mApplication);
            registeListener(new CpcCommitterResponseListener(str3, this.epid));
            SendCpcInfoRequest cpcInfoRequest = MunionRequestHelper.getCpcInfoRequest(this.mApplication, str3, str);
            HashMap hashMap = new HashMap();
            hashMap.put("ad_cid", b.a(str));
            hashMap.put("epid", this.epid);
            hashMap.put("aurl", this.aurl);
            hashMap.put("uptime", String.valueOf(SystemClock.uptimeMillis() - Global.StartupTime));
            UserTrackLogs.trackClick(9001, b.a(hashMap), str3);
            e.a("cpc_click_before", b.a(hashMap), "clickid=" + str3);
            startRequest(0, cpcInfoRequest, P4pCpcInfoResponse.class);
            if (this.mIsOpenPage) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("clickid", str3);
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap2));
                if (EnvironmentUtils.isInTaobao() && "on".equals(OrangeConfig.getInstance().getConfig("alimama_ad", "set_ut_tpk_param_switch", "on")) && UTAppBackgroundTimeoutDetector.getInstance().shouldRewriteTpkCache()) {
                    UTAnalytics.getInstance().getDefaultTracker().addTPKCache("adTraceOprId", str3);
                    UTAppBackgroundTimeoutDetector.getInstance().setShouldRewriteTpkCache(false);
                }
            }
            return str3;
        } catch (Exception e) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, e.getMessage());
            return "";
        }
    }

    @Override // com.taobao.munion.taosdk.MunionEventCommitter
    public String commitEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea5c61a2", new Object[]{this, str, str2});
        }
        if (str2 != null && str2.trim().length() > 0) {
            try {
                this.aurl = URLEncoder.encode(str2, "UTF-8");
            } catch (Exception unused) {
            }
            Uri parse = Uri.parse(str2);
            if (parse != null && parse.isHierarchical()) {
                this.epid = parse.getQueryParameter("epid");
                String str3 = this.epid;
                if (str3 == null) {
                    str3 = "";
                }
                this.epid = str3;
            }
        }
        this.eurl = str;
        return MunionUrlBuilder.appendClickidToTargetUrl(str2, commitEvent(str));
    }

    @Override // com.taobao.munion.taosdk.MunionEventCommitter
    public Uri commitEvent(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("89baed0a", new Object[]{this, str, uri});
        }
        if (uri != null && uri.isHierarchical()) {
            try {
                this.aurl = URLEncoder.encode(uri.toString(), "UTF-8");
            } catch (Exception unused) {
            }
            this.epid = uri.getQueryParameter("epid");
            String str2 = this.epid;
            if (str2 == null) {
                str2 = "";
            }
            this.epid = str2;
        }
        this.eurl = str;
        return MunionUrlBuilder.appendClickidToTargetUrl(uri, commitEvent(str));
    }

    /* loaded from: classes7.dex */
    public class CpcCommitterResponseListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String clickId;
        private long clickTime = SystemClock.uptimeMillis();
        private String epid;

        static {
            kge.a(-1645541596);
            kge.a(-525336021);
        }

        public CpcCommitterResponseListener(String str, String str2) {
            this.clickId = str;
            this.epid = str2;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                StringBuilder sb = new StringBuilder();
                sb.append("Cpc 请求失败 System Error：Response Code: ");
                sb.append(mtopResponse.getResponseCode());
                sb.append(";");
                sb.append("ret code: ");
                sb.append(mtopResponse.getRetCode());
                sb.append(";");
                sb.append("ret msg: ");
                sb.append(bytedata);
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, sb.toString() != null ? bytedata.toString() : "null");
                dhe.b().a("Munion_Click_Send_Cpc", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), "");
            } else {
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Cpc 请求失败 System Error");
                dhe.b().a("Munion_Click_Send_Cpc", "0", "Cpc 请求失败 System Error", "");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onSuccess(int r10, mtopsdk.mtop.domain.MtopResponse r11, mtopsdk.mtop.domain.BaseOutDo r12, java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 285
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.munion.taosdk.CpcEventCommitter.CpcCommitterResponseListener.onSuccess(int, mtopsdk.mtop.domain.MtopResponse, mtopsdk.mtop.domain.BaseOutDo, java.lang.Object):void");
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                StringBuilder sb = new StringBuilder();
                sb.append("Cpc 请求失败：Response Code: ");
                sb.append(mtopResponse.getResponseCode());
                sb.append(";");
                sb.append("ret code: ");
                sb.append(mtopResponse.getRetCode());
                sb.append(";");
                sb.append("ret msg: ");
                sb.append(bytedata);
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, sb.toString() != null ? bytedata.toString() : "null");
            } else {
                TaoLog.Logd(UserTrackLogs.UT_PAGE_NAME, "Cpc 请求失败");
            }
        }
    }
}
