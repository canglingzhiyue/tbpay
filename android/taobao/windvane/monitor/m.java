package android.taobao.windvane.monitor;

import android.net.Uri;
import android.taobao.windvane.extra.performance2.WVWPData;
import android.taobao.windvane.monitor.l;
import android.taobao.windvane.monitor.q;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class m implements d, n, q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long b;
    private boolean h;

    /* renamed from: a  reason: collision with root package name */
    private boolean f1684a = true;
    private long c = 0;
    private boolean d = false;
    private String e = "";
    private HashSet<String> f = new HashSet<>();
    private ConcurrentHashMap<String, l> g = new ConcurrentHashMap<>();

    static {
        kge.a(628472066);
        kge.a(77642679);
        kge.a(-1398031473);
        kge.a(-442625129);
    }

    @Override // android.taobao.windvane.monitor.n
    public void commitWhitePageData(WVWPData wVWPData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a2f7a3", new Object[]{this, wVWPData});
        }
    }

    public m() {
        this.b = 0L;
        this.h = false;
        this.b = System.currentTimeMillis();
        this.h = true;
    }

    private static j a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("49686188", new Object[0]) : k.getInstance().config;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (android.taobao.windvane.config.a.f != null) {
            return this.h;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r0.stat.onLoad == 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.monitor.m.a(java.lang.String):void");
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(63);
        if (indexOf <= 0) {
            indexOf = str.length();
        }
        int indexOf2 = str.indexOf(35);
        if (indexOf2 <= 0) {
            indexOf2 = str.length();
        }
        if (indexOf >= indexOf2) {
            indexOf = indexOf2;
        }
        return str.substring(0, indexOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(java.lang.String r6, java.lang.String r7, java.lang.Integer r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.monitor.m.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            r6 = 2
            r1[r6] = r8
            java.lang.String r6 = "ac7ac37f"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1f:
            android.taobao.windvane.monitor.j r0 = a()
            boolean r0 = r0.isErrorBlacklist
            android.taobao.windvane.monitor.j r1 = a()
            java.util.List<android.taobao.windvane.monitor.j$a> r1 = r1.errorRule
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L91
            java.lang.Object r4 = r1.next()
            android.taobao.windvane.monitor.j$a r4 = (android.taobao.windvane.monitor.j.a) r4
            java.lang.String r5 = r4.url
            if (r5 == 0) goto L59
            if (r6 == 0) goto L59
            java.util.regex.Pattern r5 = r4.urlPattern
            if (r5 != 0) goto L4d
            java.lang.String r5 = r4.url
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            r4.urlPattern = r5
        L4d:
            java.util.regex.Pattern r5 = r4.urlPattern
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L2f
        L59:
            java.lang.String r5 = r4.msg
            if (r5 == 0) goto L77
            if (r7 == 0) goto L77
            java.util.regex.Pattern r5 = r4.msgPattern
            if (r5 != 0) goto L6b
            java.lang.String r5 = r4.msg
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            r4.msgPattern = r5
        L6b:
            java.util.regex.Pattern r5 = r4.msgPattern
            java.util.regex.Matcher r5 = r5.matcher(r7)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L2f
        L77:
            java.lang.String r5 = r4.code
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L8d
            if (r8 == 0) goto L8d
            java.lang.String r4 = r4.code
            java.lang.String r5 = r8.toString()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L2f
        L8d:
            if (r0 != 0) goto L90
            return r2
        L90:
            return r3
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.monitor.m.a(java.lang.String, java.lang.String, java.lang.Integer):boolean");
    }

    private l c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("aa99e112", new Object[]{this, str});
        }
        ConcurrentHashMap<String, l> concurrentHashMap = this.g;
        if (concurrentHashMap == null) {
            return null;
        }
        l lVar = concurrentHashMap.get(str);
        if (lVar == null) {
            synchronized (m.class) {
                if (lVar == null) {
                    android.taobao.windvane.util.m.c("WVMonitor", "monitor data init");
                    lVar = new l();
                    this.e = str;
                    this.g.put(str, lVar);
                }
            }
        }
        return lVar;
    }

    @Override // android.taobao.windvane.monitor.q
    public void didPageStartLoadAtTime(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59da2279", new Object[]{this, str, new Long(j)});
        } else if (!b() || str == null || Uri.parse(str) == null || !Uri.parse(str).isHierarchical()) {
        } else {
            android.taobao.windvane.util.m.b("WVMonitor", String.format("pageStart: %s", str));
            l c = c(str);
            if (c == null) {
                return;
            }
            c.startTime = j;
            c.url = str;
        }
    }

    @Override // android.taobao.windvane.monitor.q
    public void didPageFinishLoadAtTime(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f096138c", new Object[]{this, str, new Long(j)});
        } else if (str == null || Uri.parse(str) == null || !Uri.parse(str).isHierarchical()) {
        } else {
            a(str, j, true);
        }
    }

    @Override // android.taobao.windvane.monitor.q
    public void didPageDomLoadAtTime(String str, long j) {
        ConcurrentHashMap<String, l> concurrentHashMap;
        l lVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf31f919", new Object[]{this, str, new Long(j)});
        } else if (!b() || str == null || (concurrentHashMap = this.g) == null || (lVar = concurrentHashMap.get(str)) == null || lVar.startTime <= 0) {
        } else {
            long j2 = j - lVar.startTime;
            if (j2 < a().stat.onDomLoad) {
                return;
            }
            lVar.stat.onDomLoad = j2;
        }
    }

    @Override // android.taobao.windvane.monitor.q
    public void didPageReceiveFirstByteAtTime(String str, long j) {
        ConcurrentHashMap<String, l> concurrentHashMap;
        l lVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bd7370", new Object[]{this, str, new Long(j)});
        } else if (!b() || str == null || (concurrentHashMap = this.g) == null || (lVar = concurrentHashMap.get(str)) == null) {
        } else {
            android.taobao.windvane.util.m.b("WVMonitor", String.format("domLoad: %s", str));
            if (lVar.startTime <= 0) {
                return;
            }
            lVar.stat.firstByteTime = j - lVar.startTime;
        }
    }

    @Override // android.taobao.windvane.monitor.q
    public void didPageOccurSelfDefinedEvent(String str, String str2, long j) {
        ConcurrentHashMap<String, l> concurrentHashMap;
        l lVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934145ee", new Object[]{this, str, str2, new Long(j)});
        } else if (b() && str != null && (concurrentHashMap = this.g) != null && (lVar = concurrentHashMap.get(str)) != null) {
            android.taobao.windvane.util.m.b("WVMonitor", String.format("domLoad: %s", str));
            if (lVar.startTime <= 0) {
                return;
            }
            Map<String, Long> map = lVar.args.selfDefine;
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                map.put(entry.getKey(), Long.valueOf(entry.getValue().longValue() - lVar.startTime));
            }
        }
    }

    @Override // android.taobao.windvane.monitor.q
    public void didGetPageStatusCode(String str, int i, int i2, String str2, String str3, String str4, Map<String, String> map, q.a aVar) {
        l c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcecec7b", new Object[]{this, str, new Integer(i), new Integer(i2), str2, str3, str4, map, aVar});
        } else if (!b() || str == null || (c = c(str)) == null) {
        } else {
            c.args.netStat = aVar;
            if (i > 0) {
                c.args.statusCode = i;
            }
            if (i2 > 1 && c.stat.fromType <= 1) {
                c.stat.fromType = i2;
            }
            if (!TextUtils.isEmpty(str2)) {
                c.stat.packageAppVersion = str2;
            }
            if (map != null) {
                c.args.via = map.get("via");
            }
            if (!TextUtils.isEmpty(str3)) {
                c.stat.packageAppName = str3;
            }
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            c.stat.appSeq = str4;
        }
    }

    @Override // android.taobao.windvane.monitor.q
    public void didExitAtTime(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f47376", new Object[]{this, str, new Long(j)});
        } else {
            a(str, j, false);
        }
    }

    @Override // android.taobao.windvane.monitor.q
    public void didResourceStartLoadAtTime(String str, long j) {
        l lVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49316538", new Object[]{this, str, new Long(j)});
            return;
        }
        ConcurrentHashMap<String, l> concurrentHashMap = this.g;
        if (concurrentHashMap == null || (lVar = concurrentHashMap.get(this.e)) == null) {
            return;
        }
        try {
            if (!e(str)) {
                return;
            }
            f(str).start = j - lVar.startTime;
        } catch (Exception e) {
            android.taobao.windvane.util.m.d("WVMonitor", "didResourceStartLoadAtTime Exception : " + e.getMessage());
        }
    }

    @Override // android.taobao.windvane.monitor.q
    public void didResourceFinishLoadAtTime(String str, long j, String str2, long j2) {
        l lVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4363c6d", new Object[]{this, str, new Long(j), str2, new Long(j2)});
            return;
        }
        ConcurrentHashMap<String, l> concurrentHashMap = this.g;
        if (concurrentHashMap == null || (lVar = concurrentHashMap.get(this.e)) == null) {
            return;
        }
        try {
            if (e(str)) {
                l.b f = f(str);
                f.end = j - lVar.startTime;
                f.protocolType = str2;
                f.tcpTime = j2;
            } else if (!d(str)) {
            } else {
                lVar.protocolType = str2;
            }
        } catch (Exception e) {
            android.taobao.windvane.util.m.d("WVMonitor", "didResourceFinishLoadAtTime Exception : " + e.getMessage());
        }
    }

    @Override // android.taobao.windvane.monitor.q
    public void didGetResourceStatusCode(String str, int i, int i2, Map<String, String> map, q.a aVar) {
        l.b f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7136dc", new Object[]{this, str, new Integer(i), new Integer(i2), map, aVar});
        } else if (d(str)) {
            didGetPageStatusCode(str, i, i2, null, null, null, map, aVar);
        } else if (!e(str) || (f = f(str)) == null) {
        } else {
            f.fromType = i2;
            f.statusCode = i;
            f.via = map != null ? map.get(HttpConstant.VIA) : "";
            if (aVar == null || !a().stat.netstat) {
                return;
            }
            f.netStat = aVar;
        }
    }

    @Override // android.taobao.windvane.monitor.q
    public void didGetResourceVerifyCode(String str, long j, long j2, int i, int i2) {
        l lVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4406529c", new Object[]{this, str, new Long(j), new Long(j2), new Integer(i), new Integer(i2)});
            return;
        }
        ConcurrentHashMap<String, l> concurrentHashMap = this.g;
        if (concurrentHashMap == null || (lVar = concurrentHashMap.get(this.e)) == null) {
            return;
        }
        if (d(str)) {
            if (!b() || str == null) {
                return;
            }
            lVar.stat.verifyResTime = j;
            lVar.stat.verifyTime = j2;
            lVar.stat.verifyError = i;
        } else if (e(str)) {
            l.b f = f(str);
            f.verifyResTime = j;
            f.verifyTime = j2;
            f.verifyError = i;
        }
        lVar.stat.allVerifyTime += j2;
        lVar.stat.verifyCacheSize = i2;
    }

    @Override // android.taobao.windvane.monitor.q
    public void didPerformanceCheckResult(String str, long j, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf89381d", new Object[]{this, str, new Long(j), str2, str3, str4});
        } else {
            a.commitWebPerfCheckInfo(str, j, str2, str3, str4);
        }
    }

    @Override // android.taobao.windvane.monitor.q
    public void didPageStartInFSP(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2a9a29", new Object[]{this, str, new Long(j)});
        } else {
            a.commitFSPInfo(str, j);
        }
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        if (this.g != null) {
            return b(this.e).equals(b(str));
        }
        return false;
    }

    private boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue() : b() && str != null && !d(str);
    }

    private l.b f(String str) {
        l lVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l.b) ipChange.ipc$dispatch("9dc70097", new Object[]{this, str});
        }
        ConcurrentHashMap<String, l> concurrentHashMap = this.g;
        if (concurrentHashMap == null || (lVar = concurrentHashMap.get(this.e)) == null) {
            return null;
        }
        l.b bVar = lVar.args.resStat.get(str);
        if (bVar != null) {
            return bVar;
        }
        l.b createNewResStatInstance = l.createNewResStatInstance();
        lVar.args.resStat.put(str, createNewResStatInstance);
        return createNewResStatInstance;
    }

    private void a(String str, long j, boolean z) {
        ConcurrentHashMap<String, l> concurrentHashMap;
        l lVar;
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3531c42", new Object[]{this, str, new Long(j), new Boolean(z)});
        } else if (!b() || str == null || (concurrentHashMap = this.g) == null || (lVar = concurrentHashMap.get(str)) == null) {
        } else {
            android.taobao.windvane.util.m.b("WVMonitor", String.format("pageFinish: %s", str));
            if (lVar.startTime > 0) {
                try {
                    long j2 = j - lVar.startTime;
                    android.taobao.windvane.util.m.b("WVMonitor", String.format("url: %s", str) + " onLoad time :" + j2);
                    j a2 = a();
                    if (a2 != null && b() && j2 >= a2.stat.onLoad) {
                        lVar.stat.onLoad = j2;
                        l.c cVar = lVar.stat;
                        if (!z) {
                            i = 0;
                        }
                        cVar.finish = i;
                        try {
                            Uri parse = Uri.parse(str);
                            if (parse != null && parse.isHierarchical()) {
                                String queryParameter = parse.getQueryParameter("wvAppMonitor");
                                if (!TextUtils.isEmpty(queryParameter)) {
                                    lVar.wvAppMonitor = Integer.valueOf(queryParameter).intValue();
                                }
                            }
                        } catch (Exception unused) {
                        }
                        a(str);
                    }
                } catch (Exception unused2) {
                }
            }
            this.g.remove(str);
        }
    }

    @Override // android.taobao.windvane.monitor.d
    public void didOccurNativeError(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fdf518", new Object[]{this, str, new Integer(i), str2});
        } else if (!b() || str == null || str2 == null) {
        } else {
            android.taobao.windvane.util.m.b("WVMonitor", String.format("reportNativeError: %s ///// %s ///// %d", str, str2, Integer.valueOf(i)));
            if (!b() || !a(str, str2, Integer.valueOf(i))) {
                return;
            }
            a.commitFail(a.NATIVE_ERROR_POINT, i, String.format("message=%s\ncode=%d", str2, Integer.valueOf(i)), str);
        }
    }

    @Override // android.taobao.windvane.monitor.d
    public void didOccurJSError(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb4f5a1", new Object[]{this, str, str2, str3, str4});
        } else if (!b() || str == null || str2 == null || str4 == null || str3 == null) {
        } else {
            android.taobao.windvane.util.m.b("WVMonitor", String.format("reportJsError: %s ///// %s ///// %s ///// %s", str, str3, str2, str4));
            if (!a(str, str2, (Integer) null)) {
                return;
            }
            a.commitFail(a.JS_ERROR_POINT, 1, String.format("message=%s\nline=%s\nfile=%s", str2, str4, str3), str);
        }
    }

    @Override // android.taobao.windvane.monitor.q
    public void didWebViewInitAtTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aec56853", new Object[]{this, new Long(j)});
        } else if (!b()) {
        } else {
            this.d = true;
            this.c = j;
        }
    }

    @Override // android.taobao.windvane.monitor.q
    public void didPagePerformanceInfo(String str, String str2) {
        l lVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69b858b", new Object[]{this, str, str2});
            return;
        }
        ConcurrentHashMap<String, l> concurrentHashMap = this.g;
        if (concurrentHashMap == null || (lVar = concurrentHashMap.get(str)) == null) {
            return;
        }
        lVar.performanceInfo = str2;
    }

    @Override // android.taobao.windvane.monitor.n
    public void WebViewWrapType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e985e08e", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "UnKnow";
        }
        a.commitWVWrapType(str);
    }

    @Override // android.taobao.windvane.monitor.n
    public void commitCoreInitTime(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62851eb4", new Object[]{this, new Long(j), str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "UnKnow";
        }
        a.commitCoreInitTime(j, str);
    }

    @Override // android.taobao.windvane.monitor.n
    public void commitCoreTypeByPV(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee480cbc", new Object[]{this, str, str2, str3, str4});
            return;
        }
        if (TextUtils.isEmpty("UnKnow")) {
            str = "UnKnow";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "UnKnow";
        }
        a.commitCoreTypeByPV(str, str2, str3, str4);
    }

    @Override // android.taobao.windvane.monitor.n
    public void commitWebMultiType(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0d02a7", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            a.commitRenderType(str, i, i2, String.valueOf(android.taobao.windvane.config.a.b));
        }
    }

    @Override // android.taobao.windvane.monitor.n
    public void commitWebMultiTypeByPV(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dbf54f6", new Object[]{this, str, str2, str3, str4, str5, str6});
            return;
        }
        a.commitRenderTypeByPV(str, str2, str3, str4, str5, str6);
        android.taobao.windvane.util.m.e("WVMonitor", "UC Multi: initRenderType = [" + str + "], successRenderType = [" + str2 + "], renderTypeReason = [" + str3 + "], initGpuType = [" + str4 + "], successGpuType = [" + str5 + "],gpuTypeReason = [" + str6 + riy.ARRAY_END_STR);
    }

    @Override // android.taobao.windvane.monitor.n
    public void commitUseWebgl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff54e1a", new Object[]{this, str});
        } else {
            a.commitUseWebgl(str);
        }
    }
}
