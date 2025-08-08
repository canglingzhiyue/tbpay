package com.o2o.ad.expo;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.o2o.ad.click.common.O2OClickSendResponse;
import com.taobao.alimama.threads.AdThreadExecutor;
import com.taobao.muniontaobaosdk.util.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.dbe;
import tb.dbg;
import tb.dbh;
import tb.dhf;
import tb.dhg;
import tb.dhi;
import tb.dhm;
import tb.dhq;
import tb.kge;

/* loaded from: classes4.dex */
public class O2OExpoCommitter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "mtop.o2o.ad.exposure.get";

    /* renamed from: a  reason: collision with root package name */
    private static Queue<String> f8104a;
    private static Map<String, dhi> b;
    private String c;
    private String d;
    private Map<String, String> e;

    /* loaded from: classes4.dex */
    public enum ResultCode {
        COMMITED,
        INVALID_URL,
        DUPLICATED,
        INTERNAL_ERROR
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : "useCache=0";
    }

    public static /* synthetic */ String a(O2OExpoCommitter o2OExpoCommitter, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("765455ed", new Object[]{o2OExpoCommitter, str}) : o2OExpoCommitter.b(str);
    }

    public static /* synthetic */ void a(O2OExpoCommitter o2OExpoCommitter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29060d89", new Object[]{o2OExpoCommitter});
        } else {
            o2OExpoCommitter.d();
        }
    }

    public static /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]) : b;
    }

    public static /* synthetic */ Map b(O2OExpoCommitter o2OExpoCommitter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2443ed7f", new Object[]{o2OExpoCommitter}) : o2OExpoCommitter.e;
    }

    public static /* synthetic */ String c(O2OExpoCommitter o2OExpoCommitter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("29ee2ff5", new Object[]{o2OExpoCommitter}) : o2OExpoCommitter.c;
    }

    public static /* synthetic */ Queue c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("ea7ff0a", new Object[0]) : f8104a;
    }

    public static /* synthetic */ String d(O2OExpoCommitter o2OExpoCommitter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2b2482d4", new Object[]{o2OExpoCommitter}) : o2OExpoCommitter.d;
    }

    static {
        kge.a(-194351346);
        f8104a = new ConcurrentLinkedQueue();
        b = new ConcurrentHashMap();
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : b.a(str);
    }

    public O2OExpoCommitter(String str, Map<String, String> map) {
        this.c = str;
        this.e = map;
        this.d = a(str);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        Map<String, String> map = this.e;
        if (map == null || !map.containsKey(MspDBHelper.BizEntry.COLUMN_NAME_PID)) {
            try {
                String queryParameter = Uri.parse(this.c).getQueryParameter(MspDBHelper.BizEntry.COLUMN_NAME_PID);
                if (!StringUtils.isEmpty(queryParameter)) {
                    if (this.e == null) {
                        this.e = new HashMap();
                    }
                    this.e.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, queryParameter);
                }
            } catch (Exception unused) {
            }
        }
        dbh.a("o2o_expo_invoke_success", b.a(this.e), b(this.c));
        dbe.a("o2o_expo_invoke_success", b.a(this.e), "expo=" + this.c, b(this.c));
        if (StringUtils.isEmpty(this.c) || StringUtils.isEmpty(this.d)) {
            dbe.a("o2o_expo_invalid_url", "msg=url_is_empty_or_hash_error", b.a(this.e), "expo=" + this.c, b(this.c));
            return ResultCode.INVALID_URL.name();
        } else if (f8104a.contains(this.d)) {
            dbh.a("o2o_expo_invoke_duplicated", b.a(this.e), b(this.c));
            dbe.a("o2o_expo_invoke_duplicated", b.a(this.e), "expo=" + this.c, b(this.c));
            return ResultCode.DUPLICATED.name();
        } else {
            AdThreadExecutor.execute(new Runnable() { // from class: com.o2o.ad.expo.O2OExpoCommitter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        O2OExpoCommitter.a(O2OExpoCommitter.this);
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
        } else if (f8104a.contains(this.d)) {
            dbh.a("o2o_expo_invoke_duplicated", b.a(this.e), b(this.c));
            dbe.a("o2o_expo_invoke_duplicated", b.a(this.e), "expo=" + this.c, b(this.c));
        } else {
            dhi dhiVar = b.get(this.d);
            if (dhiVar != null) {
                dhiVar.a();
                return;
            }
            dhq dhqVar = new dhq(this.c, dhm.RETRY_FIVE_TIMES, new O2OCpmExpoRequest(), dbg.a(this.c), O2OClickSendResponse.class);
            dhqVar.a(new a());
            b.put(this.d, dhg.a().a(dhqVar));
        }
    }

    /* loaded from: classes4.dex */
    public class a implements dhf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1864318982);
            kge.a(-744181563);
        }

        @Override // tb.dhf
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            }
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
            O2OExpoCommitter o2OExpoCommitter = O2OExpoCommitter.this;
            dbh.a("o2o_expo_request_success", b.a(O2OExpoCommitter.b(O2OExpoCommitter.this)), O2OExpoCommitter.a(o2OExpoCommitter, O2OExpoCommitter.c(o2OExpoCommitter)));
            O2OExpoCommitter o2OExpoCommitter2 = O2OExpoCommitter.this;
            dbe.a("o2o_expo_request_success", b.a(O2OExpoCommitter.b(O2OExpoCommitter.this)), "expo=" + O2OExpoCommitter.c(O2OExpoCommitter.this), O2OExpoCommitter.a(o2OExpoCommitter2, O2OExpoCommitter.c(o2OExpoCommitter2)));
            O2OExpoCommitter.b().remove(O2OExpoCommitter.d(O2OExpoCommitter.this));
            if (O2OExpoCommitter.c().size() >= 1000) {
                O2OExpoCommitter.c().poll();
            }
            O2OExpoCommitter.c().offer(O2OExpoCommitter.d(O2OExpoCommitter.this));
        }

        @Override // tb.dhf
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                return;
            }
            O2OExpoCommitter o2OExpoCommitter = O2OExpoCommitter.this;
            dbh.a("o2o_expo_request_fail", b.a(O2OExpoCommitter.b(O2OExpoCommitter.this)), O2OExpoCommitter.a(o2OExpoCommitter, O2OExpoCommitter.c(o2OExpoCommitter)));
            O2OExpoCommitter o2OExpoCommitter2 = O2OExpoCommitter.this;
            dbe.a("o2o_expo_request_fail", b.a(O2OExpoCommitter.b(O2OExpoCommitter.this)), "expo=" + O2OExpoCommitter.c(O2OExpoCommitter.this), O2OExpoCommitter.a(o2OExpoCommitter2, O2OExpoCommitter.c(o2OExpoCommitter2)), "error_code=" + str, "error_msg=" + str2);
            O2OExpoCommitter.b().remove(O2OExpoCommitter.d(O2OExpoCommitter.this));
        }
    }
}
