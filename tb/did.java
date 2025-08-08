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
public class did {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f26779a;
    private Map<String, String> b;
    private Map<String, String> c;
    private String d;
    private List<String> e;
    private String f;

    static {
        kge.a(-2105418304);
    }

    public static /* synthetic */ void a(did didVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a1128d", new Object[]{didVar, str, str2});
        } else {
            didVar.a(str, str2);
        }
    }

    public did(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        this.d = str;
        this.f26779a = map;
        this.b = map2;
        this.c = map3;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (b()) {
            if (d() && com.taobao.alimama.tanx.a.a().b()) {
                UserTrackLogs.trackAdLog("tanx_interact_report_exposer", c());
                e.a("tanx_interact_report_exposer", c());
                return;
            }
            UserTrackLogs.trackAdLog("tanx_interact_invoke_success", c());
            e.a("tanx_interact_invoke_success", c());
            for (final String str : this.e) {
                String host = Uri.parse(str).getHost();
                if (StringUtils.isEmpty(host)) {
                    e.a("tanx_interact_invalid_url", "msg=domain_not_right", c());
                } else {
                    final String a2 = a(host);
                    AdThreadExecutor.execute(new Runnable() { // from class: tb.did.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                did.a(did.this, str, a2);
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
            if (!c.j()) {
                return false;
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : this.f26779a.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
            d.a().c(this.e, new c.a().a(jSONObject).a(this.f26779a.get(MspDBHelper.BizEntry.COLUMN_NAME_PID)).a());
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
        Map<String, String> map2 = this.c;
        if (map2 != null && !map2.isEmpty()) {
            str = com.taobao.muniontaobaosdk.util.a.a(str, this.c);
        }
        UserTrackLogs.trackAdLog("tanx_interact_request", str2);
        e.a("tanx_interact_request", str2, "ifs=" + Uri.encode(str));
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
        if (this.e == null) {
            this.e = new ArrayList();
        }
        if (this.f26779a == null) {
            this.f26779a = new HashMap();
        }
        String a2 = h.a(this.d, this.e, this.f26779a);
        if (!StringUtils.isEmpty(a2)) {
            e.a("tanx_interact_parse_error", c(), "error_msg=" + a2, "tracking_json=" + Uri.encode(this.d));
            UserTrackLogs.trackAdLog("tanx_interact_parse_error", c(), "error_msg=" + a2, "tracking_json=" + Uri.encode(this.d));
        }
        List<String> list = this.e;
        return list != null && list.size() > 0;
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (this.f == null) {
            this.f = b.a(this.f26779a);
        }
        return this.f;
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
        public String f26781a;
        public String b;

        static {
            kge.a(1915505303);
            kge.a(-744181563);
        }

        public a(String str, String str2) {
            this.b = str2;
            this.f26781a = str;
        }

        @Override // tb.dhf
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_interact_request_success", this.b);
            e.a("tanx_interact_request_success", this.b, "ifs=" + Uri.encode(this.f26781a));
        }

        @Override // tb.dhf
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_interact_request_tmp_fail", this.b, "error_code=" + str, "error_msg=" + str2);
            e.a("tanx_interact_request_tmp_fail", this.b, "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(this.f26781a));
        }

        @Override // tb.dhf
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_interact_request_fail", this.b, "error_code=" + str, "error_msg=" + str2);
            e.a("tanx_interact_request_fail", this.b, "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(this.f26781a));
        }
    }
}
