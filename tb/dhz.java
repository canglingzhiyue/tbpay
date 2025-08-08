package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.c;
import com.tanx.exposer.d;
import com.taobao.alimama.threads.AdThreadExecutor;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.alimama.utils.c;
import com.taobao.alimama.utils.e;
import com.taobao.alimama.utils.h;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.muniontaobaosdk.util.b;
import com.taobao.utils.Global;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.dhp;

/* loaded from: classes4.dex */
public class dhz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f26771a;
    private Map<String, String> b;
    private String c;
    private List<String> d;
    private String e;

    static {
        kge.a(985555964);
    }

    public static /* synthetic */ void a(dhz dhzVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3939ab6", new Object[]{dhzVar, str, str2});
        } else {
            dhzVar.a(str, str2);
        }
    }

    public dhz(String str, Map<String, String> map, Map<String, String> map2) {
        this.c = str;
        this.f26771a = map;
        this.b = map2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (b()) {
            if (d()) {
                UserTrackLogs.trackAdLog("tanx_click_report_exposer", c());
                e.a("tanx_click_report_exposer", c());
                return;
            }
            UserTrackLogs.trackAdLog("tanx_click_invoke_success", c());
            e.a("tanx_click_invoke_success", c());
            for (final String str : this.d) {
                String host = Uri.parse(str).getHost();
                if (StringUtils.isEmpty(host)) {
                    e.a("tanx_click_invalid_url", "msg=domain_not_right", c());
                } else {
                    final String a2 = a(host);
                    AdThreadExecutor.execute(new Runnable() { // from class: tb.dhz.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                dhz.a(dhz.this, str, a2);
                            }
                        }
                    });
                }
            }
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        try {
            if (!c.j() || !com.taobao.alimama.tanx.a.a().b()) {
                return false;
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : this.f26771a.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
            d.a().b(this.d, new c.a().a(jSONObject).a(this.f26771a.get(MspDBHelper.BizEntry.COLUMN_NAME_PID)).a());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        Map<String, String> map = this.b;
        if (map != null && !map.isEmpty()) {
            str = com.taobao.muniontaobaosdk.util.a.a(str, Uri.encode(b.b(this.b)));
        }
        UserTrackLogs.trackAdLog("tanx_click_request", str2);
        e.a("tanx_click_request", str2, "ifs=" + Uri.encode(str));
        dhp.a aVar = new dhp.a(str, dhm.RETRY_FIVE_TIMES);
        aVar.a(true);
        aVar.a(3);
        aVar.c(20000);
        aVar.b(30000);
        aVar.a(HttpRequest.HEADER_ACCEPT, MunionDeviceUtil.getAccept(Global.getApplication(), null));
        dhp dhpVar = new dhp(aVar);
        dhpVar.a(new a(str, str2));
        dhg.a().a(dhpVar);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        if (this.f26771a == null) {
            this.f26771a = new HashMap();
        }
        String a2 = h.a(this.c, this.d, this.f26771a);
        if (!StringUtils.isEmpty(a2)) {
            e.a("tanx_click_parse_error", c(), "error_msg=" + a2, "tracking_json=" + Uri.encode(this.c));
            UserTrackLogs.trackAdLog("tanx_click_parse_error", c(), "error_msg=" + a2, "tracking_json=" + Uri.encode(this.c));
        }
        List<String> list = this.d;
        return list != null && list.size() > 0;
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (this.e == null) {
            this.e = b.a(this.f26771a);
        }
        return this.e;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        StringBuilder sb = new StringBuilder(c());
        if (!StringUtils.isEmpty(str)) {
            sb.append(",host=");
            sb.append(str);
        }
        return sb.toString();
    }

    /* loaded from: classes4.dex */
    public static class a implements dhf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f26773a;
        public String b;

        static {
            kge.a(574463439);
            kge.a(-744181563);
        }

        public a(String str, String str2) {
            this.b = str2;
            this.f26773a = str;
        }

        @Override // tb.dhf
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_click_request_success", this.b);
            e.a("tanx_click_request_success", this.b, "ifs=" + Uri.encode(this.f26773a));
        }

        @Override // tb.dhf
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_click_request_tmp_fail", this.b, "error_code=" + str, "error_msg=" + str2);
            e.a("tanx_click_request_tmp_fail", this.b, "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(this.f26773a));
        }

        @Override // tb.dhf
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_click_request_fail", this.b, "error_code=" + str, "error_msg=" + str2);
            e.a("tanx_click_request_fail", this.b, "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(this.f26773a));
        }
    }
}
