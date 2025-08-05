package tb;

import android.net.Uri;
import android.text.TextUtils;
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
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;
import tb.dhp;

/* loaded from: classes4.dex */
public class dib {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Queue<String> f;
    private static Map<String, dhi> g;

    /* renamed from: a  reason: collision with root package name */
    private String f26775a;
    private Map<String, String> b;
    private Map<String, String> c;
    private String d;
    private List<String> e;
    private String h;

    public static /* synthetic */ void a(dib dibVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("380364d9", new Object[]{dibVar, str, str2, str3});
        } else {
            dibVar.a(str, str2, str3);
        }
    }

    public static /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]) : g;
    }

    public static /* synthetic */ Queue c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("ea7ff0a", new Object[0]) : f;
    }

    static {
        kge.a(-1124369932);
        f = new ConcurrentLinkedQueue();
        g = new ConcurrentHashMap();
    }

    public dib(String str, Map<String, String> map, Map<String, String> map2) {
        this.d = str;
        this.b = map;
        this.c = map2;
        this.f26775a = b.a(str);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (d()) {
            if (f() && com.taobao.alimama.tanx.a.a().b()) {
                UserTrackLogs.trackAdLog("tanx_imp_report_exposer", e());
                e.a("tanx_imp_report_exposer", e());
                return;
            }
            UserTrackLogs.trackAdLog("tanx_imp_invoke_success", e());
            e.a("tanx_imp_invoke_success", e());
            for (final String str : this.e) {
                final String a2 = b.a(str);
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(a2)) {
                    e.a("tanx_imp_invalid_url", "msg=url_is_empty_or_hash_error", e());
                } else {
                    String host = Uri.parse(str).getHost();
                    if (TextUtils.isEmpty(host)) {
                        e.a("tanx_imp_invalid_url", "msg=domain_not_right", e());
                    } else {
                        final String a3 = a(host, a2);
                        if (f.contains(a2)) {
                            UserTrackLogs.trackAdLog("tanx_imp_request_duplicated", a3);
                            e.a("tanx_imp_request_duplicated", a3);
                        } else {
                            AdThreadExecutor.execute(new Runnable() { // from class: tb.dib.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        dib.a(dib.this, str, a2, a3);
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        try {
            if (!c.j()) {
                return false;
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
            d.a().a(this.e, new c.a().a(jSONObject).a(this.b.get(MspDBHelper.BizEntry.COLUMN_NAME_PID)).a());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (f.contains(str2)) {
            UserTrackLogs.trackAdLog("tanx_imp_request_duplicated", str3);
            e.a("tanx_imp_request_duplicated", str3);
        } else {
            dhi dhiVar = g.get(str2);
            if (dhiVar != null) {
                dhiVar.a();
                e.a("tanx_imp_request_pending", str3);
                return;
            }
            Map<String, String> map = this.c;
            if (map != null && !map.isEmpty()) {
                str = com.taobao.muniontaobaosdk.util.a.a(str, Uri.encode(b.b(this.c)));
            }
            UserTrackLogs.trackAdLog("tanx_imp_request", str3);
            e.a("tanx_imp_request", str3, "ifs=" + Uri.encode(str));
            dhp.a aVar = new dhp.a(str, dhm.RETRY_FIVE_TIMES);
            aVar.a(true);
            aVar.a(3);
            aVar.c(20000);
            aVar.b(30000);
            aVar.a(HttpRequest.HEADER_ACCEPT, MunionDeviceUtil.getAccept(Global.getApplication(), null));
            dhp dhpVar = new dhp(aVar);
            dhpVar.a(new a(str2, str, str3));
            g.put(str2, dhg.a().a(dhpVar));
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.e == null) {
            this.e = new ArrayList();
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        String a2 = h.a(this.d, this.e, this.b);
        if (!TextUtils.isEmpty(a2)) {
            e.a("tanx_imp_parse_error", e(), "error_msg=" + a2, "tracking_json=" + Uri.encode(this.d));
            UserTrackLogs.trackAdLog("tanx_imp_parse_error", e(), "error_msg=" + a2, "tracking_json=" + Uri.encode(this.d));
        }
        List<String> list = this.e;
        return list != null && list.size() > 0;
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (this.h == null) {
            String format = String.format("json_hash=%s", this.f26775a);
            String a2 = b.a(this.b);
            if (!TextUtils.isEmpty(a2)) {
                format = format + "," + a2;
            }
            this.h = format;
        }
        return this.h;
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        StringBuilder sb = new StringBuilder(e());
        if (!TextUtils.isEmpty(str)) {
            sb.append(",host=");
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(",ifs_hash=");
            sb.append(str2);
        }
        return sb.toString();
    }

    /* loaded from: classes4.dex */
    public class a implements dhf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f26777a;
        public String b;
        public String c;

        static {
            kge.a(2035040843);
            kge.a(-744181563);
        }

        public a(String str, String str2, String str3) {
            this.f26777a = str;
            this.c = str3;
            this.b = str2;
        }

        @Override // tb.dhf
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_imp_request_success", this.c);
            e.a("tanx_imp_request_success", this.c, "ifs=" + Uri.encode(this.b));
            dib.b().remove(this.f26777a);
            if (dib.c().size() >= 1000) {
                dib.c().poll();
            }
            dib.c().offer(this.f26777a);
        }

        @Override // tb.dhf
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_imp_request_tmp_fail", this.c, "error_code=" + str, "error_msg=" + str2);
            e.a("tanx_imp_request_tmp_fail", this.c, "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(this.b));
        }

        @Override // tb.dhf
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("tanx_imp_request_fail", this.c, "error_code=" + str, "error_msg=" + str2);
            e.a("tanx_imp_request_fail", this.c, "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(this.b));
            dib.b().remove(this.f26777a);
        }
    }
}
