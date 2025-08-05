package com.taobao.alimama.cpm.ifs;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.ResultCode;
import com.taobao.alimama.threads.AdThreadExecutor;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.alimama.utils.e;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.muniontaobaosdk.util.b;
import com.taobao.utils.Global;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.dhe;
import tb.dhf;
import tb.dhg;
import tb.dhi;
import tb.dhm;
import tb.dhp;
import tb.kge;

/* loaded from: classes4.dex */
public class NEW_IfsCommitter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Queue<String> f8427a;
    private static Map<String, dhi> b;
    private String c;
    private String d;
    private Map<String, String> e;
    private String f;

    public static /* synthetic */ void a(NEW_IfsCommitter nEW_IfsCommitter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b86762", new Object[]{nEW_IfsCommitter});
        } else {
            nEW_IfsCommitter.d();
        }
    }

    public static /* synthetic */ String b(NEW_IfsCommitter nEW_IfsCommitter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7d16793f", new Object[]{nEW_IfsCommitter}) : nEW_IfsCommitter.e();
    }

    public static /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]) : b;
    }

    public static /* synthetic */ String c(NEW_IfsCommitter nEW_IfsCommitter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58d7f500", new Object[]{nEW_IfsCommitter}) : nEW_IfsCommitter.c;
    }

    public static /* synthetic */ Queue c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("ea7ff0a", new Object[0]) : f8427a;
    }

    public static /* synthetic */ String d(NEW_IfsCommitter nEW_IfsCommitter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("349970c1", new Object[]{nEW_IfsCommitter}) : nEW_IfsCommitter.f;
    }

    public static /* synthetic */ String e(NEW_IfsCommitter nEW_IfsCommitter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("105aec82", new Object[]{nEW_IfsCommitter}) : nEW_IfsCommitter.d;
    }

    static {
        kge.a(1553249303);
        f8427a = new ConcurrentLinkedQueue();
        b = new ConcurrentHashMap();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : b.a(str);
    }

    public NEW_IfsCommitter(String str, Map<String, String> map) {
        this.c = str;
        this.e = map;
        this.d = a(str);
        Map<String, String> map2 = this.e;
        if (map2 != null) {
            this.f = map2.get("namespace");
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            Uri parse = Uri.parse(this.c);
            String queryParameter = parse.getQueryParameter(MspDBHelper.BizEntry.COLUMN_NAME_PID);
            String queryParameter2 = parse.getQueryParameter("mmAdArgs");
            String path = parse.getPath();
            String host = parse.getHost();
            if (this.e == null) {
                this.e = new HashMap();
            }
            if (queryParameter != null) {
                this.e.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, queryParameter);
            }
            if (queryParameter2 != null) {
                this.e.put("mmAdArgs", queryParameter2);
            }
            if (host != null) {
                this.e.put("host", host);
            }
            if (path != null) {
                this.e.put("path", path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        UserTrackLogs.trackAdLog("ifs_invoke_success", e());
        e.a("ifs_invoke_success", e(), "ifs=" + Uri.encode(this.c));
        if (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d)) {
            e.a("ifs_invalid_url", "msg=url_is_empty_or_hash_error", e());
            return ResultCode.INVALID_URL.name();
        }
        String host2 = Uri.parse(this.c).getHost();
        if (host2 == null || !host2.endsWith("tanx.com")) {
            e.a("ifs_invalid_url", "msg=domain_not_right", e());
            return ResultCode.INVALID_URL.name();
        } else if (com.taobao.alimama.cpm.ifs.a.a().a(this.f, this.d)) {
            UserTrackLogs.trackAdLog("ifs_invoke_disk_duplicated", e(), "memory_cnt=" + com.taobao.alimama.cpm.ifs.a.a().d());
            e.a("ifs_invoke_disk_duplicated", e(), "memory_cnt=" + com.taobao.alimama.cpm.ifs.a.a().d());
            return ResultCode.DUPLICATED.name();
        } else if (f8427a.contains(this.d)) {
            UserTrackLogs.trackAdLog("ifs_invoke_duplicated", e());
            e.a("ifs_invoke_duplicated", e());
            return ResultCode.DUPLICATED.name();
        } else {
            UserTrackLogs.trackAdLog("ifs_invoke_request", e());
            AdThreadExecutor.execute(new Runnable() { // from class: com.taobao.alimama.cpm.ifs.NEW_IfsCommitter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NEW_IfsCommitter.a(NEW_IfsCommitter.this);
                    }
                }
            });
            return ResultCode.COMMITED.name();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (f8427a.contains(this.d)) {
            UserTrackLogs.trackAdLog("ifs_invoke_duplicated", e());
            e.a("ifs_invoke_duplicated", e());
        } else {
            dhi dhiVar = b.get(this.d);
            if (dhiVar != null) {
                dhiVar.a();
                e.a("ifs_request_pending", e());
                return;
            }
            dhp.a aVar = new dhp.a(this.c, dhm.RETRY_FIVE_TIMES);
            aVar.a(true);
            aVar.a(3);
            aVar.c(20000);
            aVar.b(30000);
            aVar.a(HttpRequest.HEADER_ACCEPT, MunionDeviceUtil.getAccept(Global.getApplication(), null));
            dhp dhpVar = new dhp(aVar);
            dhpVar.a(new a());
            b.put(this.d, dhg.a().a(dhpVar));
        }
    }

    /* loaded from: classes4.dex */
    public class a implements dhf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-908745073);
            kge.a(-744181563);
        }

        private a() {
        }

        @Override // tb.dhf
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                return;
            }
            UserTrackLogs.trackAdLog("ifs_request_success", NEW_IfsCommitter.b(NEW_IfsCommitter.this));
            e.a("ifs_request_success", NEW_IfsCommitter.b(NEW_IfsCommitter.this), "ifs=" + Uri.encode(NEW_IfsCommitter.c(NEW_IfsCommitter.this)));
            dhe.b().a("Munion_Ifs_Send_Exposure", NEW_IfsCommitter.b(NEW_IfsCommitter.this));
            com.taobao.alimama.cpm.ifs.a.a().b(NEW_IfsCommitter.d(NEW_IfsCommitter.this), NEW_IfsCommitter.e(NEW_IfsCommitter.this));
            NEW_IfsCommitter.b().remove(NEW_IfsCommitter.e(NEW_IfsCommitter.this));
            if (NEW_IfsCommitter.c().size() >= 1000) {
                NEW_IfsCommitter.c().poll();
            }
            NEW_IfsCommitter.c().offer(NEW_IfsCommitter.e(NEW_IfsCommitter.this));
        }

        @Override // tb.dhf
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("ifs_request_temp_fail", NEW_IfsCommitter.b(NEW_IfsCommitter.this), "error_code=" + str);
            e.a("ifs_request_temp_fail", NEW_IfsCommitter.b(NEW_IfsCommitter.this), "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(NEW_IfsCommitter.c(NEW_IfsCommitter.this)));
        }

        @Override // tb.dhf
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("ifs_request_fail", NEW_IfsCommitter.b(NEW_IfsCommitter.this), "error_code=" + str);
            e.a("ifs_request_fail", NEW_IfsCommitter.b(NEW_IfsCommitter.this), "error_code=" + str, "error_msg=" + str2, "ifs=" + Uri.encode(NEW_IfsCommitter.c(NEW_IfsCommitter.this)));
            dhe.b().a("Munion_Ifs_Send_Exposure", str, str2, "");
            NEW_IfsCommitter.b().remove(NEW_IfsCommitter.e(NEW_IfsCommitter.this));
        }
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        Object[] objArr = new Object[2];
        objArr[0] = com.taobao.alimama.cpm.e.b(this.c) ? "1" : "0";
        objArr[1] = this.d;
        String format = String.format("useCache=%s,ifs_hash=%s", objArr);
        String a2 = b.a(this.e);
        if (TextUtils.isEmpty(a2)) {
            return format;
        }
        return format + "," + a2;
    }
}
