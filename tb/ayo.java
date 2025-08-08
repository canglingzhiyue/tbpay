package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.c;
import com.tanx.exposer.d;
import com.taobao.alimama.threads.AdThreadExecutor;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.alimama.utils.e;
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
public class ayo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f25697a;
    private Map<String, String> b;
    private String c;
    private List<String> d;
    private String e;

    static {
        kge.a(505005055);
    }

    public static /* synthetic */ void a(ayo ayoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bd7cd5", new Object[]{ayoVar, str, str2});
        } else {
            ayoVar.a(str, str2);
        }
    }

    public ayo(String str, Map<String, String> map, Map<String, String> map2) {
        this.c = str;
        this.f25697a = map;
        this.b = map2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (c()) {
            if (com.taobao.alimama.tanx.a.a().b() && b()) {
                UserTrackLogs.trackAdLog("tanx_click_report_exposer", d());
                e.a("tanx_click_report_exposer", d());
                return;
            }
            UserTrackLogs.trackAdLog("tanx_click_invoke_success", d());
            e.a("tanx_click_invoke_success", d());
            for (final String str : this.d) {
                String host = Uri.parse(str).getHost();
                if (StringUtils.isEmpty(host)) {
                    e.a("tanx_click_invalid_url", "msg=domain_not_right", d());
                } else {
                    final String b = b(host);
                    AdThreadExecutor.execute(new Runnable() { // from class: tb.ayo.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ayo.a(ayo.this, str, b);
                            }
                        }
                    });
                }
            }
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : this.f25697a.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
            d.a().b(this.d, new c.a().a(jSONObject).a(this.f25697a.get(MspDBHelper.BizEntry.COLUMN_NAME_PID)).a());
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

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        if (this.f25697a == null) {
            this.f25697a = new HashMap();
        }
        JSONArray parseArray = JSON.parseArray(this.c);
        if (parseArray == null) {
            a("tracking_json_parse_error");
        }
        for (int i = 0; i < parseArray.size(); i++) {
            this.d.add(parseArray.getString(i));
        }
        if (StringUtils.isEmpty(this.f25697a.get(MspDBHelper.BizEntry.COLUMN_NAME_PID))) {
            a("pid_empty");
        }
        if (this.d.size() == 0) {
            a("urlList_empty");
        }
        List<String> list = this.d;
        return list != null && list.size() > 0;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        e.a("tanx_click_parse_error", d(), "error_msg=" + str, "tracking_json=" + Uri.encode(this.c));
        UserTrackLogs.trackAdLog("tanx_click_parse_error", d(), "error_msg=" + str, "tracking_json=" + Uri.encode(this.c));
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        if (this.e == null) {
            this.e = b.a(this.f25697a);
        }
        return this.e;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        StringBuilder sb = new StringBuilder(d());
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
        public String f25699a;
        public String b;

        static {
            kge.a(1276391442);
            kge.a(-744181563);
        }

        public a(String str, String str2) {
            this.b = str2;
            this.f25699a = str;
        }

        @Override // tb.dhf
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_click_request_success", this.b);
            e.a("tanx_click_request_success", this.b, "ifs=" + Uri.encode(this.f25699a));
        }

        @Override // tb.dhf
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_click_request_tmp_fail", this.b, "error_code=" + str, "error_msg=" + str2);
            e.a("tanx_click_request_tmp_fail", this.b, "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(this.f25699a));
        }

        @Override // tb.dhf
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_click_request_fail", this.b, "error_code=" + str, "error_msg=" + str2);
            e.a("tanx_click_request_fail", this.b, "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(this.f25699a));
        }
    }
}
