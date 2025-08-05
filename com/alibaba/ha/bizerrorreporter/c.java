package com.alibaba.ha.bizerrorreporter;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import tb.byy;
import tb.byz;
import tb.bzc;
import tb.bzh;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String _JAVA_VERSION = "";
    public static final String _MAGIC = "BizErrorReporterSDK";
    public static final String _NATIVE_VERSION = "160509105620";
    public static final String _TARGET = "beta";
    public static final String _VERSION = "1.0.0.0";

    /* loaded from: classes.dex */
    public class a extends C0109c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(com.alibaba.ha.bizerrorreporter.module.a aVar, Context context, String str, long j, String str2) {
            super(aVar, context, str, j, str2);
        }

        @Override // com.alibaba.ha.bizerrorreporter.c.C0109c, com.alibaba.ha.bizerrorreporter.c.b
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            sb.append(l());
            sb.append(k());
            sb.append(f());
            try {
                if (!"true".equals(this.d.getSharedPreferences("BizErrorReport", 0).getString("closeStorage", "true"))) {
                    sb.append(g());
                }
            } catch (Exception unused) {
            }
            sb.append(i());
            if (this.l instanceof OutOfMemoryError) {
                sb.append(h());
            }
            sb.append(j());
            return sb.toString();
        }
    }

    public com.alibaba.ha.bizerrorreporter.module.b a(Context context, com.alibaba.ha.bizerrorreporter.module.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.ha.bizerrorreporter.module.b) ipChange.ipc$dispatch("60604cf5", new Object[]{this, context, aVar});
        }
        com.alibaba.ha.bizerrorreporter.module.b bVar = new com.alibaba.ha.bizerrorreporter.module.b();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            bVar.f3120a = byz.b(bzc.a(new a(aVar, context, a(com.alibaba.motu.tbrest.d.a().c, com.alibaba.motu.tbrest.d.a().e, currentTimeMillis, com.taobao.android.weex_framework.util.a.ATOM_catch, "BUSINESS"), currentTimeMillis, "BUSINESS").b().getBytes()));
            bVar.c = String.valueOf(aVar.b);
            bVar.b = aVar.f3119a;
            bVar.d = d.EVENTID_61005;
            bVar.e = d.SEND_FLAG;
            return bVar;
        } catch (Exception e) {
            Log.e(d.LOGTAG, "base64 and gzip err", e);
            return null;
        }
    }

    /* loaded from: classes.dex */
    public abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String b;
        public long c;
        public Context d;
        public Map<String, Object> e;
        public String f;
        public long g;
        public long h;
        public long i;
        public long j;

        public abstract String a();

        public b() {
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
            }
            return e() + a() + c();
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
            }
            return String.format("Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", Long.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.i), Long.valueOf(this.j)) + String.format("log end: %s\n", c.a(System.currentTimeMillis()));
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
            }
            return "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n";
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            sb.append("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n");
            sb.append(String.format("Basic Information: 'pid: %d/tid: %d/logver: 2/time: %s/cpu: %s/cpu hardware: %s'\n", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), Long.valueOf(this.c), Build.CPU_ABI, Build.HARDWARE));
            sb.append(String.format("Mobile Information: 'model: %s/version: %s/sdk: %d'\n", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)));
            sb.append(String.format("Build fingerprint: '" + Build.FINGERPRINT + "'\n", new Object[0]));
            sb.append(String.format("Runtime Information: 'start: %s/maxheap: %s'\n", e.a().f3117a, Long.valueOf(Runtime.getRuntime().maxMemory())));
            sb.append(String.format("Application Information: 'version: %s/subversion: %s/buildseq: %s'\n", com.alibaba.motu.tbrest.d.a().e, com.alibaba.motu.tbrest.d.a().e, Build.ID));
            sb.append(String.format("%s Information: 'version: %s/nativeseq: %s/javaseq: %s/target: %s'\n", c._MAGIC, c._VERSION, "160509105620", "", "beta"));
            sb.append("Report Name: " + this.b + "\n");
            sb.append("UUID: " + UUID.randomUUID().toString().toLowerCase() + "\n");
            sb.append("Log Type: " + this.f + "\n");
            sb.append(d());
            return sb.toString();
        }

        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            try {
                sb.append("meminfo:\n");
                sb.append(bzh.a(byy.c(), "") + "\n");
                sb.append(d());
            } catch (Exception e) {
                Log.e(d.LOGTAG, "write meminfo.", e);
            }
            try {
                sb.append("status:\n");
                sb.append(bzh.a(byy.b(), "") + "\n");
                sb.append(d());
            } catch (Exception e2) {
                Log.e(d.LOGTAG, "adapter write status.", e2);
            }
            try {
                sb.append("virtual machine:\nMaxMemory: " + Runtime.getRuntime().maxMemory() + " TotalMemory: " + Runtime.getRuntime().totalMemory() + " FreeMemory: " + Runtime.getRuntime().freeMemory() + "\n");
            } catch (Exception e3) {
                Log.e(d.LOGTAG, "adapter write virtual machine info.", e3);
            }
            sb.append(d());
            return sb.toString();
        }

        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
            }
            return "storageinfo:\n" + byy.c(this.d) + d();
        }

        public String h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
            }
            return "appliction meminfo:\n" + byy.b(this.d) + d();
        }

        public String i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            File[] fileArr = null;
            try {
                fileArr = new File("/proc/self/fd").listFiles();
                if (fileArr != null) {
                    sb.append(String.format("opened file count: %d, write limit: %d.\n", Integer.valueOf(fileArr.length), 1024));
                } else {
                    sb.append("[DEBUG] listFiles failed!\n");
                }
            } catch (Exception e) {
                Log.e(d.LOGTAG, "print file descriptor.", e);
            }
            if (fileArr != null) {
                try {
                    if (fileArr.length >= 1024) {
                        sb.append("opened files:\n");
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            for (File file : fileArr) {
                                sb2.append(file.getName());
                                sb2.append(" -> ");
                                sb2.append(file.getCanonicalPath());
                                sb2.append("\n");
                            }
                        } catch (Exception e2) {
                            Log.e(d.LOGTAG, "print file descriptor.", e2);
                        }
                        sb.append(sb2.toString());
                    }
                } catch (Exception e3) {
                    Log.e(d.LOGTAG, "print file descriptor.", e3);
                }
            }
            sb.append(d());
            return sb.toString();
        }

        public String j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
            }
            return a(null, 100) + a("events", 100);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v12, types: [java.io.Closeable, java.io.BufferedReader] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9, types: [java.io.Closeable] */
        private String a(String str, int i) {
            Process process;
            ?? r3;
            Throwable th;
            int i2;
            int i3;
            int i4;
            int i5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{this, str, new Integer(i)});
            }
            StringBuilder sb = new StringBuilder();
            try {
                if ("true".equals(this.d.getSharedPreferences("BizErrorReport", 0).getString("closeLogcat", "true"))) {
                    i = -1;
                }
            } catch (Exception unused) {
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(LogCategory.CATEGORY_LOGCAT);
            arrayList.add("-d");
            if (bzh.a((CharSequence) str)) {
                sb.append("logcat main: \n");
            } else {
                sb.append("logcat " + str + ": \n");
                arrayList.add("-b");
                arrayList.add(str);
            }
            arrayList.add("-v");
            arrayList.add("threadtime");
            if (i < 0) {
                sb.append("[DEBUG] custom java logcat lines count is 0!\n");
            } else {
                arrayList.add("-t");
                arrayList.add(String.valueOf(i));
                String str2 = null;
                Closeable closeable = null;
                try {
                    process = new ProcessBuilder(new String[0]).command(arrayList).redirectErrorStream(true).start();
                } catch (Exception e) {
                    Log.e(d.LOGTAG, "exec logcat", e);
                    process = null;
                }
                try {
                    if (process == null) {
                        sb.append("[DEBUG] exec logcat failed!\n");
                    } else {
                        try {
                            r3 = new BufferedReader(new InputStreamReader(process.getInputStream()), 8192);
                            i4 = 0;
                            i5 = 0;
                            while (true) {
                                try {
                                    String readLine = r3.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    i4++;
                                    if (i5 < i) {
                                        sb.append(readLine + "\n");
                                        i5++;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    int i6 = i5;
                                    i2 = i4;
                                    closeable = r3;
                                    i3 = i6;
                                    Log.e(d.LOGTAG, "print log.", e);
                                    byy.a(closeable);
                                    i4 = i2;
                                    i5 = i3;
                                    str2 = String.format("[DEBUG] Read %d lines, wrote %d lines.\n", Integer.valueOf(i4), Integer.valueOf(i5));
                                    sb.append(str2);
                                    sb.append(d());
                                    return sb.toString();
                                } catch (Throwable th2) {
                                    th = th2;
                                    byy.a((Closeable) r3);
                                    throw th;
                                }
                            }
                            byy.a((Closeable) r3);
                        } catch (Exception e3) {
                            e = e3;
                            i2 = 0;
                            i3 = 0;
                        }
                        str2 = String.format("[DEBUG] Read %d lines, wrote %d lines.\n", Integer.valueOf(i4), Integer.valueOf(i5));
                        sb.append(str2);
                    }
                } catch (Throwable th3) {
                    r3 = str2;
                    th = th3;
                }
            }
            sb.append(d());
            return sb.toString();
        }

        public String k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            Map<String, Object> map = this.e;
            if (map != null && !map.isEmpty()) {
                try {
                    sb.append("extrainfo:\n");
                    for (String str : this.e.keySet()) {
                        sb.append(String.format("%s: %s\n", str, this.e.get(str)));
                    }
                } catch (Exception e) {
                    Log.e(d.LOGTAG, "write extral info", e);
                }
                sb.append(d());
            }
            return sb.toString();
        }
    }

    /* renamed from: com.alibaba.ha.bizerrorreporter.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0109c extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Throwable l;
        public Thread m;
        public String n;
        public com.alibaba.ha.bizerrorreporter.module.a o;

        public C0109c(com.alibaba.ha.bizerrorreporter.module.a aVar, Context context, String str, long j, String str2) {
            super();
            this.o = aVar;
            this.l = aVar.k;
            this.m = aVar.l;
            this.n = aVar.j;
            if (this.e == null) {
                this.e = new HashMap();
            }
            String str3 = aVar.c;
            if (str3 != null) {
                this.e.put("exceptionId", str3);
            }
            String str4 = aVar.d;
            if (str4 != null) {
                this.e.put(d.exceptionCode, str4);
            }
            String str5 = aVar.e;
            if (str5 != null) {
                this.e.put(d.exceptionVersion, str5);
            }
            String str6 = aVar.f;
            if (str6 != null) {
                this.e.put(d.exceptionArg1, str6);
            }
            String str7 = aVar.g;
            if (str7 != null) {
                this.e.put(d.exceptionArg2, str7);
            }
            String str8 = aVar.h;
            if (str8 != null) {
                this.e.put(d.exceptionArg3, str8);
            }
            if (this.l != null && this.n != null) {
                this.e.put(d.exceptionDetail, this.n);
            }
            Map<String, Object> map = aVar.i;
            if (map != null && map.size() > 0) {
                this.e.putAll(map);
            }
            this.d = context;
            this.b = str;
            this.c = j;
            this.f = str2;
        }

        @Override // com.alibaba.ha.bizerrorreporter.c.b
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            return l() + k();
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String l() {
            /*
                Method dump skipped, instructions count: 222
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ha.bizerrorreporter.c.C0109c.l():java.lang.String");
        }

        public String a(Thread thread) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b62d4a27", new Object[]{this, thread});
            }
            StringBuilder sb = new StringBuilder();
            try {
                sb.append(String.format("Thread Name: '%s'\n", thread.getName()));
                sb.append(String.format("\"%s\" prio=%d tid=%d %s\n", thread.getName(), Integer.valueOf(thread.getPriority()), Long.valueOf(thread.getId()), thread.getState()));
                StackTraceElement[] stackTrace = thread.getStackTrace();
                int length = stackTrace.length;
                for (int i = 0; i < length; i++) {
                    sb.append(String.format("\tat %s\n", stackTrace[i].toString()));
                }
            } catch (Exception e) {
                Log.e(d.LOGTAG, "dumpThread", e);
            }
            return sb.toString();
        }
    }

    public static String a(String str, String str2, long j, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("859c5e44", new Object[]{str, str2, new Long(j), str3, str4});
        }
        String a2 = a(str2);
        String a3 = a(str3);
        return "BizErrorReporterSDK_1.0.0.0_df_df_df_df_" + str + "_" + a2 + "_" + String.valueOf(j) + "_" + a(j) + "_" + bzh.a(a3, "df") + "_" + str4 + ".log";
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : str != null ? str.replace("_", "&#95;") : "";
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            return simpleDateFormat.format(new Date(j));
        } catch (Exception e) {
            Log.e(d.LOGTAG, "getGMT8Time", e);
            return "";
        }
    }
}
