package com.taobao.alimama.click.interact;

import android.net.Uri;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.ResultCode;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.alimama.utils.e;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.muniontaobaosdk.util.b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Vector;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.dhf;
import tb.dhg;
import tb.dhm;
import tb.dhq;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Queue<String> i;
    private static List<String> j;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f8424a;
    private Map<String, String> b;
    private String c;
    private String d;
    private boolean e;
    private String f;
    private String g;
    private String h;

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a91c372", new Object[]{aVar}) : aVar.h;
    }

    public static /* synthetic */ String b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7b479033", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ Queue b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("20f0989", new Object[0]) : i;
    }

    public static /* synthetic */ String c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8bfd5cf4", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ List c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[0]) : j;
    }

    static {
        kge.a(1377879678);
        i = new ConcurrentLinkedQueue();
        j = new Vector();
    }

    public a(String str, Map<String, String> map, Map<String, String> map2) {
        this.c = str;
        this.f8424a = map;
        this.b = map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean d() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.alimama.click.interact.a.d():boolean");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (!d()) {
            UserTrackLogs.trackAdLog("interact_invoke_verify_fail", b.a(this.f8424a));
            return ResultCode.INVALID_URL.name();
        }
        Map<String, String> map = this.b;
        if (map != null && !map.isEmpty()) {
            this.c = com.taobao.muniontaobaosdk.util.a.a(this.c, this.b);
        }
        this.f = b.a(this.c);
        this.f8424a.put("url_hash", this.f);
        this.h = b.a(this.f8424a);
        UserTrackLogs.trackAdLog("interact_invoke_success", this.h);
        e.a("interact_invoke_success", this.h);
        if (this.e) {
            if (j.contains(this.f)) {
                UserTrackLogs.trackAdLog("interact_invoke_disk_duplicated", this.h);
                e.a("interact_invoke_disk_duplicated", this.h);
                return ResultCode.DUPLICATED.name();
            } else if (com.taobao.alimama.cpm.ifs.a.a().a(this.g, this.f)) {
                UserTrackLogs.trackAdLog("interact_invoke_disk_duplicated", this.h);
                e.a("interact_invoke_disk_duplicated", this.h);
                return ResultCode.DUPLICATED.name();
            } else if (i.contains(this.f)) {
                UserTrackLogs.trackAdLog("interact_invoke_duplicated", this.h);
                e.a("interact_invoke_duplicated", this.h);
                return ResultCode.DUPLICATED.name();
            }
        }
        InteractRequest a2 = a(this.c, this.d);
        UserTrackLogs.trackAdLog("interact_invoke_request_success", this.h);
        e.a("interact_invoke_request_success", this.h);
        dhq dhqVar = new dhq(null, dhm.RETRY_FIVE_TIMES, a2, InteractResponse.class);
        dhqVar.a(new C0329a());
        dhg.a().a(dhqVar);
        j.add(this.f);
        return ResultCode.COMMITED.name();
    }

    private static InteractRequest a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractRequest) ipChange.ipc$dispatch("c82b6f0a", new Object[]{str, str2});
        }
        InteractRequest interactRequest = new InteractRequest();
        interactRequest.cna = "";
        interactRequest.e = str;
        interactRequest.ext = "";
        interactRequest.referer = "";
        interactRequest.utdid = MunionDeviceUtil.getUtdid();
        interactRequest.accept = MunionDeviceUtil.getAccept("");
        interactRequest.useragent = MunionDeviceUtil.getUserAgent();
        interactRequest.API_NAME = str2;
        return interactRequest;
    }

    /* renamed from: com.taobao.alimama.click.interact.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0329a implements dhf {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long b;

        static {
            kge.a(1103122818);
            kge.a(-744181563);
        }

        private C0329a() {
            this.b = SystemClock.uptimeMillis();
        }

        @Override // tb.dhf
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                return;
            }
            try {
                InteractResponse interactResponse = (InteractResponse) obj;
                if (interactResponse != null && interactResponse.mo2429getData() != null) {
                    String str2 = interactResponse.mo2429getData().result;
                    String str3 = "";
                    if (b.c(str2)) {
                        try {
                            str3 = ("redirecturl=" + URLEncoder.encode(str2, "UTF-8")) + String.format(",rttime=%s", String.valueOf(SystemClock.uptimeMillis() - this.b));
                        } catch (UnsupportedEncodingException e) {
                            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, e.getMessage());
                        }
                    }
                    UserTrackLogs.trackAdLog("interact_request_success", a.a(a.this), str3);
                    e.a("interact_request_success", a.a(a.this), str3);
                    if (a.b().size() >= 1000) {
                        a.b().poll();
                    }
                    a.b().offer(a.b(a.this));
                    a.c().remove(a.b(a.this));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // tb.dhf
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            a.c().remove(a.b(a.this));
            UserTrackLogs.trackAdLog("interact_request_temp_fail", "error_code=" + str, "error_msg=" + str2, "url=" + Uri.encode(a.c(a.this)), a.a(a.this));
            e.a("interact_request_temp_fail", "error_code=" + str, "error_msg=" + str2, "url=" + Uri.encode(a.c(a.this)), a.a(a.this));
        }

        @Override // tb.dhf
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            a.c().remove(a.b(a.this));
            UserTrackLogs.trackAdLog("interact_request_fail", "error_code=" + str, "error_msg=" + str2, "url=" + Uri.encode(a.c(a.this)), a.a(a.this));
            e.a("interact_request_fail", "error_code=" + str, "error_msg=" + str2, "url=" + Uri.encode(a.c(a.this)), a.a(a.this));
        }
    }
}
