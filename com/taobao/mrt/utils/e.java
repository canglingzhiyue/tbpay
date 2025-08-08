package com.taobao.mrt.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.service.LogService;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes7.dex */
public class e implements LogService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static com.taobao.mrt.mtop.b f18270a;
    private static final SimpleDateFormat b;
    private static BlockingQueue<a> c;
    private static AtomicBoolean d;
    private String e = null;

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f18272a;
        public String b;
        public String c;

        static {
            kge.a(-1706169354);
        }

        private a() {
        }
    }

    public static /* synthetic */ AtomicBoolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("49f1dfa8", new Object[0]) : d;
    }

    public static /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9f01c3", new Object[]{eVar});
        } else {
            eVar.b();
        }
    }

    static {
        kge.a(1664807592);
        kge.a(-1936452834);
        f18270a = new com.taobao.mrt.mtop.b("mtop.taobao.daidebug.insertlog", "1.0", false, false, null, Map.class, MethodEnum.POST);
        b = new SimpleDateFormat("MM-dd HH:mm:ss.SSS");
        c = new LinkedBlockingQueue();
        d = new AtomicBoolean(false);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void a(LogService.LogSource logSource, LogService.LogLevel logLevel, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0fb60b8", new Object[]{this, logSource, logLevel, str, str2, th});
        } else {
            b(logSource, logLevel, str, str2, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[Catch: Throwable -> 0x00ee, TryCatch #0 {Throwable -> 0x00ee, blocks: (B:6:0x0023, B:9:0x0050, B:12:0x0055, B:14:0x0059, B:26:0x0098, B:28:0x00a1, B:33:0x00b6, B:35:0x00be, B:36:0x00ca, B:38:0x00e1, B:29:0x00a7, B:31:0x00ab, B:32:0x00b1, B:15:0x0064, B:17:0x0068, B:18:0x0072, B:20:0x0076, B:21:0x007f, B:23:0x0083, B:24:0x008d, B:25:0x0093), top: B:43:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7 A[Catch: Throwable -> 0x00ee, TryCatch #0 {Throwable -> 0x00ee, blocks: (B:6:0x0023, B:9:0x0050, B:12:0x0055, B:14:0x0059, B:26:0x0098, B:28:0x00a1, B:33:0x00b6, B:35:0x00be, B:36:0x00ca, B:38:0x00e1, B:29:0x00a7, B:31:0x00ab, B:32:0x00b1, B:15:0x0064, B:17:0x0068, B:18:0x0072, B:20:0x0076, B:21:0x007f, B:23:0x0083, B:24:0x008d, B:25:0x0093), top: B:43:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[Catch: Throwable -> 0x00ee, TryCatch #0 {Throwable -> 0x00ee, blocks: (B:6:0x0023, B:9:0x0050, B:12:0x0055, B:14:0x0059, B:26:0x0098, B:28:0x00a1, B:33:0x00b6, B:35:0x00be, B:36:0x00ca, B:38:0x00e1, B:29:0x00a7, B:31:0x00ab, B:32:0x00b1, B:15:0x0064, B:17:0x0068, B:18:0x0072, B:20:0x0076, B:21:0x007f, B:23:0x0083, B:24:0x008d, B:25:0x0093), top: B:43:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1 A[Catch: Throwable -> 0x00ee, TRY_LEAVE, TryCatch #0 {Throwable -> 0x00ee, blocks: (B:6:0x0023, B:9:0x0050, B:12:0x0055, B:14:0x0059, B:26:0x0098, B:28:0x00a1, B:33:0x00b6, B:35:0x00be, B:36:0x00ca, B:38:0x00e1, B:29:0x00a7, B:31:0x00ab, B:32:0x00b1, B:15:0x0064, B:17:0x0068, B:18:0x0072, B:20:0x0076, B:21:0x007f, B:23:0x0083, B:24:0x008d, B:25:0x0093), top: B:43:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(com.taobao.mrt.service.LogService.LogSource r9, com.taobao.mrt.service.LogService.LogLevel r10, final java.lang.String r11, java.lang.String r12, java.lang.Throwable r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mrt.utils.e.b(com.taobao.mrt.service.LogService$LogSource, com.taobao.mrt.service.LogService$LogLevel, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    private synchronized void b() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String str = null;
            String str2 = null;
            while (z) {
                a poll = c.poll(2L, TimeUnit.SECONDS);
                if (poll == null) {
                    z = false;
                } else if (StringUtils.equals(str2, poll.f18272a) && StringUtils.equals(str, poll.b)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(poll.c);
                    if (sb.length() > 2000) {
                        a(poll.b, poll.f18272a, sb.toString());
                        sb.delete(0, sb.length());
                    }
                } else {
                    if (sb.length() > 0) {
                        a(str, str2, sb.toString());
                        sb.delete(0, sb.length());
                    }
                    str2 = poll.f18272a;
                    str = poll.b;
                    sb.append(poll.c);
                }
            }
            if (sb.length() > 0) {
                a(str, str2, sb.toString());
            }
        } catch (InterruptedException unused) {
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("debugId", this.e);
        hashMap.put("type", str2);
        hashMap.put("level", str);
        hashMap.put("content", str3);
        com.taobao.mrt.mtop.a.a().a(f18270a, hashMap, new IRemoteBaseListener() { // from class: com.taobao.mrt.utils.RealtimeDebugLogService$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String str4 = "onSystemError, response=" + mtopResponse;
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String str4 = "onError, response=" + mtopResponse;
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                String str4 = "onSuccess, response=" + mtopResponse;
            }
        });
    }
}
