package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.threads.AdThreadExecutor;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.alimama.utils.e;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.utils.Global;
import com.taobao.utils.b;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.dhp;

/* loaded from: classes4.dex */
public class fvp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Queue<String> f28146a;
    private static Map<String, dhi> b;

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : b;
    }

    public static /* synthetic */ void a(fvp fvpVar, String str, String str2, String str3, boolean z, String str4, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6f7bbd", new Object[]{fvpVar, str, str2, str3, new Boolean(z), str4, map});
        } else {
            fvpVar.b(str, str2, str3, z, str4, map);
        }
    }

    public static /* synthetic */ Queue b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("20f0989", new Object[0]) : f28146a;
    }

    static {
        kge.a(-1279749676);
        f28146a = new ConcurrentLinkedQueue();
        b = new ConcurrentHashMap();
    }

    public void a(final String str, final String str2, final String str3, final boolean z, final String str4, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e865daed", new Object[]{this, str, str2, str3, new Boolean(z), str4, map});
        } else {
            AdThreadExecutor.execute(new Runnable() { // from class: tb.fvp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        fvp.a(fvp.this, str, str2, str3, z, str4, map);
                    }
                }
            });
        }
    }

    private void b(String str, String str2, String str3, boolean z, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce11376e", new Object[]{this, str, str2, str3, new Boolean(z), str4, map});
            return;
        }
        Uri.Builder buildUpon = Uri.parse("https://ef-dongfeng.tanx.com/ud-sdk-monitor").buildUpon();
        String str5 = "0";
        if (StringUtils.isEmpty(str3)) {
            str3 = str5;
        }
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("itemid", str3);
        if (StringUtils.isEmpty(str2)) {
            str2 = str5;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("sellerid", str2);
        if (z) {
            str5 = "1";
        }
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("ismall", str5).appendQueryParameter("url", Uri.encode(str)).appendQueryParameter("clickid", com.taobao.utils.a.a(str, "clickid")).appendQueryParameter("utdid", b.a(MunionDeviceUtil.getUtdid(Global.getApplication()))).appendQueryParameter(kuh.ALI_TRACK_ID, str4);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                appendQueryParameter3.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        String uri = appendQueryParameter3.build().toString();
        String a2 = com.taobao.muniontaobaosdk.util.b.a(str);
        String str6 = "url=" + Uri.encode(str);
        String str7 = "url_hash=" + a2;
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(a2)) {
            e.a("ud_committer_invalid_url", "msg=url_is_empty_or_hash_error", str6, str7);
        } else if (f28146a.contains(a2)) {
            UserTrackLogs.trackAdLog("ud_committer_request_duplicated", str6, str7);
            e.a("ud_committer_request_duplicated", str6, str7);
        } else {
            dhi dhiVar = b.get(a2);
            if (dhiVar != null) {
                dhiVar.a();
                e.a("ud_committer_request_pending_retry_now", str6, str7);
                return;
            }
            UserTrackLogs.trackAdLog("ud_committer_request", str6, str7);
            e.a("ud_committer_request", str6, str7);
            dhp.a aVar = new dhp.a(uri, dhm.RETRY_FIVE_TIMES);
            aVar.a(true);
            aVar.a(3);
            aVar.c(20000);
            aVar.b(30000);
            aVar.a(HttpRequest.HEADER_ACCEPT, MunionDeviceUtil.getAccept(Global.getApplication(), null));
            dhp dhpVar = new dhp(aVar);
            dhpVar.a(new a(a2, str));
            b.put(a2, dhg.a().a(dhpVar));
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements dhf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f28148a;
        private final String b;
        private final String c;
        private final String d;

        static {
            kge.a(968782760);
            kge.a(-744181563);
        }

        public a(String str, String str2) {
            this.f28148a = str;
            this.b = str2;
            this.c = "url=" + Uri.encode(str2);
            this.d = "url_hash=" + str;
        }

        @Override // tb.dhf
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                return;
            }
            UserTrackLogs.trackAdLog("ud_committer_request_success", this.c, this.d);
            e.a("ud_committer_request_success", this.c, this.d);
            fvp.a().remove(this.f28148a);
            if (fvp.b().size() >= 1000) {
                fvp.b().poll();
            }
            fvp.b().offer(this.f28148a);
        }

        @Override // tb.dhf
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("ud_committer_request_tmp_fail", this.c, this.d, "error_code=" + str, "error_msg=" + str2);
            e.a("ud_committer_request_tmp_fail", this.c, this.d, "error_code=" + str, "error_msg=" + str2);
        }

        @Override // tb.dhf
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("ud_committer_request_fail", this.c, this.d, "error_code=" + str, "error_msg=" + str2);
            e.a("ud_committer_request_fail", this.c, this.d, "error_code=" + str, "error_msg=" + str2);
            fvp.a().remove(this.f28148a);
        }
    }
}
