package com.o2o.ad.click.common;

import android.net.Uri;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.muniontaobaosdk.util.b;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.dbe;
import tb.dbg;
import tb.dbh;
import tb.dhf;
import tb.dhg;
import tb.dhm;
import tb.dhq;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f8097a;
    private String b;
    private String c;

    static {
        kge.a(1811987507);
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : str == null ? "" : str;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if ("1".equals(str)) {
            return "O2O_A1_" + b.a();
        } else if ("3".equals(str)) {
            return "O2O_A17_" + b.a();
        } else {
            return "O2O_A1_" + b.a();
        }
    }

    private String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            TaoLog.Loge("O2OAdSdk", "广告请求参数或者点击URL为空");
            return "";
        }
        String a2 = a(str2);
        O2OClickSendRequest o2OClickSendRequest = new O2OClickSendRequest();
        Map a3 = dbg.a(str);
        if (a3 == null) {
            a3 = new HashMap();
        }
        Map map = a3;
        map.put("o2oclickid", a2);
        dhq dhqVar = new dhq(str, dhm.DEFAULT_NO_RETRY, o2OClickSendRequest, map, O2OClickSendResponse.class);
        dhqVar.a(new C0301a(a2, this.b));
        dhg.a().a(dhqVar);
        String[] strArr = {"epid=" + b(this.b), "targeturl=" + b(this.f8097a), "o2o=" + b(this.c), "o2oclickid=" + a2};
        dbh.a("o2o_click_commit", strArr);
        dbe.a("o2o_cpm_click_before", strArr);
        return a2;
    }

    public String a(String str, String str2) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        try {
            this.c = URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(this.b) && (parse = Uri.parse(str)) != null && parse.isHierarchical()) {
            this.b = parse.getQueryParameter(MspDBHelper.BizEntry.COLUMN_NAME_PID);
        }
        return b(str, str2);
    }

    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        try {
            this.f8097a = URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
        }
        Uri parse = Uri.parse(str2);
        if (parse != null && parse.isHierarchical()) {
            this.b = parse.getQueryParameter("epid");
        }
        return dbg.a(str, "o2oclickid", a(str2, str3));
    }

    /* renamed from: com.o2o.ad.click.common.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0301a implements dhf {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private String c;

        static {
            kge.a(837946202);
            kge.a(-744181563);
        }

        @Override // tb.dhf
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            }
        }

        public C0301a(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // tb.dhf
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                return;
            }
            O2OClickSendResponseData mo2429getData = ((O2OClickSendResponse) obj).mo2429getData();
            if (TextUtils.isEmpty(mo2429getData.o2otrackid)) {
                return;
            }
            String[] strArr = {"o2otrackid=" + mo2429getData.o2otrackid, "o2oclickid=" + this.b, "epid=" + this.c};
            dbh.a("o2o_click_commit_success", strArr);
            dbe.a("o2o_click_after", strArr);
        }

        @Override // tb.dhf
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            dbh.a("o2o_click_commit_fail", "error_code=" + str, "error_msg=" + str2);
            dbe.a("o2o_click_commit_fail", "error_code=" + str, "error_msg=" + str2);
        }
    }
}
