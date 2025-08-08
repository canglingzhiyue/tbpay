package com.alipay.mobile.verifyidentity.log.behavior;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.info.AppInfo;
import com.alipay.mobile.verifyidentity.info.DeviceInfo;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.utils.EncryptFileUtils;
import com.alipay.mobile.verifyidentity.log.utils.LogReportHelper;
import com.alipay.mobile.verifyidentity.utils.CipherHelper;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.riy;

/* loaded from: classes3.dex */
public class VerifyLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String Dispersed_Type = "event";
    public static final String SENTRY_TYPE = "sentry";
    public static final String Verify_Type = "verify";

    /* renamed from: a  reason: collision with root package name */
    private static final String f5878a = "VerifyLogger";
    private static volatile VerifyLogger i;
    private List<String> c = new ArrayList();
    private List<String> d = new ArrayList();
    private int e = 1;
    private StringBuffer f = new StringBuffer();
    private BlockingQueue<VerifyLogTask> g = new ArrayBlockingQueue(100);
    private AtomicBoolean h = new AtomicBoolean(false);
    private static Map<String, StringBuffer> b = new HashMap();
    private static long j = SystemClock.elapsedRealtime();
    private static String k = "";

    /* loaded from: classes3.dex */
    public class VerifyLogTask {
        public Map<String, String> extParams;
        public String param1;
        public String param2;
        public String param3;
        public String sentryLog;
        public String type;
        public String userCaseID;
        public String verifyId;

        public VerifyLogTask(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
            this.type = str;
            this.userCaseID = str2;
            this.param1 = str3;
            this.param2 = str4;
            this.param3 = str5;
            this.extParams = map;
            this.verifyId = VerifyLogger.access$000(VerifyLogger.this);
        }
    }

    public static /* synthetic */ String access$000(VerifyLogger verifyLogger) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("caa65ed3", new Object[]{verifyLogger}) : verifyLogger.a();
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : f5878a;
    }

    public static /* synthetic */ boolean access$1000(VerifyLogger verifyLogger, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be53b934", new Object[]{verifyLogger, str, str2})).booleanValue() : verifyLogger.b(str, str2);
    }

    public static /* synthetic */ void access$1100(VerifyLogger verifyLogger, String str, StringBuffer stringBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("880aa951", new Object[]{verifyLogger, str, stringBuffer});
        } else {
            verifyLogger.a(str, stringBuffer);
        }
    }

    public static /* synthetic */ void access$1200(VerifyLogger verifyLogger, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eca97e8", new Object[]{verifyLogger, str});
        } else {
            verifyLogger.c(str);
        }
    }

    public static /* synthetic */ void access$1400(VerifyLogger verifyLogger, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbed7634", new Object[]{verifyLogger, str, str2});
        } else {
            verifyLogger.a(str, str2);
        }
    }

    public static /* synthetic */ StringBuffer access$1500(VerifyLogger verifyLogger, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StringBuffer) ipChange.ipc$dispatch("d4d2b7b5", new Object[]{verifyLogger, str}) : verifyLogger.b(str);
    }

    public static /* synthetic */ BlockingQueue access$200(VerifyLogger verifyLogger) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlockingQueue) ipChange.ipc$dispatch("6d612c12", new Object[]{verifyLogger}) : verifyLogger.g;
    }

    public static /* synthetic */ void access$400(VerifyLogger verifyLogger, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97bbfb", new Object[]{verifyLogger, str});
        } else {
            verifyLogger.g(str);
        }
    }

    public static /* synthetic */ int access$500(VerifyLogger verifyLogger) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9621e825", new Object[]{verifyLogger})).intValue() : verifyLogger.e;
    }

    public static /* synthetic */ int access$502(VerifyLogger verifyLogger, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27aa142", new Object[]{verifyLogger, new Integer(i2)})).intValue();
        }
        verifyLogger.e = i2;
        return i2;
    }

    public static /* synthetic */ List access$600(VerifyLogger verifyLogger) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f285a9f4", new Object[]{verifyLogger}) : verifyLogger.d;
    }

    public static /* synthetic */ String access$700(VerifyLogger verifyLogger, Object[] objArr, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4773c7f9", new Object[]{verifyLogger, objArr, str}) : a(objArr, str);
    }

    public static /* synthetic */ void access$800(VerifyLogger verifyLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29665b75", new Object[]{verifyLogger});
        } else {
            verifyLogger.d();
        }
    }

    public static /* synthetic */ void access$900(VerifyLogger verifyLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527d736", new Object[]{verifyLogger});
        } else {
            verifyLogger.b();
        }
    }

    public static VerifyLogger getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyLogger) ipChange.ipc$dispatch("9de0e83a", new Object[0]);
        }
        if (i == null) {
            synchronized (VerifyLogger.class) {
                if (i == null) {
                    i = new VerifyLogger();
                }
            }
        }
        return i;
    }

    public void verifyBehavior(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db2f892b", new Object[]{this, str, str2, str3, str4, map});
        } else {
            logBehavior("verify", str, str2, str3, str4, map);
        }
    }

    public void eventBehavior(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54662b6a", new Object[]{this, str, str2, str3, str4, map});
        } else {
            logBehavior("event", str, str2, str3, str4, map);
        }
    }

    public void sentryBehavior(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da1a9722", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            startLogger();
            VerifyLogTask verifyLogTask = new VerifyLogTask(SENTRY_TYPE, "", "", "", "", null);
            verifyLogTask.sentryLog = str;
            this.g.add(verifyLogTask);
        }
    }

    public void logBehavior(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8063dab6", new Object[]{this, str, str2, str3, str4, str5, map});
        } else if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeLogging))) {
        } else {
            startLogger();
            if (map != null) {
                map.remove("userCaseID");
            }
            this.g.add(new VerifyLogTask(str, str2, str3, str4, str5, map));
            String str6 = f5878a;
            VerifyLogCat.i(str6, "userCaseID: " + str2);
        }
    }

    public void logBehavior(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675b996c", new Object[]{this, str, str2, str3, str4, str5, str6, map});
        } else if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeLogging))) {
        } else {
            startLogger();
            if (map != null) {
                map.remove("userCaseID");
            }
            VerifyLogTask verifyLogTask = new VerifyLogTask(str, str3, str4, str5, str6, map);
            verifyLogTask.verifyId = str2;
            VerifyLogCat.i("DST", "task verifyid:" + verifyLogTask.verifyId);
            this.g.add(verifyLogTask);
            String str7 = f5878a;
            VerifyLogCat.i(str7, "userCaseID: " + str3);
        }
    }

    public synchronized void startLogger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90dc4019", new Object[]{this});
        } else if (this.h.getAndSet(true)) {
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    int parseInt;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    VerifyLogCat.i(VerifyLogger.access$100(), "核身埋点器启动");
                    while (true) {
                        try {
                            synchronized (this) {
                                VerifyLogTask verifyLogTask = (VerifyLogTask) VerifyLogger.access$200(VerifyLogger.this).take();
                                if (verifyLogTask.type.equalsIgnoreCase("event")) {
                                    VerifyLogger.access$400(VerifyLogger.this, VerifyLogger.access$300(VerifyLogger.this, verifyLogTask.type, verifyLogTask.verifyId, verifyLogTask.userCaseID, "-", "-", verifyLogTask.param3, verifyLogTask.extParams));
                                    String reportFlag = ReportHelper.getReportFlag(ReportHelper.maxLogNum);
                                    if (!StringUtils.isEmpty(reportFlag) && (parseInt = Integer.parseInt(reportFlag)) > 0) {
                                        VerifyLogger.access$502(VerifyLogger.this, parseInt);
                                    }
                                    if (VerifyLogger.access$600(VerifyLogger.this).size() >= VerifyLogger.access$500(VerifyLogger.this)) {
                                        String access$700 = VerifyLogger.access$700(VerifyLogger.this, VerifyLogger.access$600(VerifyLogger.this).toArray(), ",");
                                        String access$100 = VerifyLogger.access$100();
                                        VerifyLogCat.i(access$100, "event" + access$700);
                                        VerifyLogger.access$800(VerifyLogger.this);
                                        LogReportHelper.getInstance().reportDispersedLog(access$700);
                                    }
                                } else if (verifyLogTask.type.equalsIgnoreCase("verify")) {
                                    if (verifyLogTask.userCaseID.equals("UC-MobileIC-150810-1")) {
                                        VerifyLogger.access$900(VerifyLogger.this);
                                        LogReportHelper.getInstance().getAndReportData();
                                        String access$300 = VerifyLogger.access$300(VerifyLogger.this, verifyLogTask.type, verifyLogTask.verifyId, verifyLogTask.userCaseID, "-", "-", verifyLogTask.param3, verifyLogTask.extParams);
                                        if (!VerifyLogger.access$1000(VerifyLogger.this, verifyLogTask.verifyId, access$300)) {
                                            StringBuffer stringBuffer = new StringBuffer();
                                            stringBuffer.append(access$300);
                                            VerifyLogger.access$1100(VerifyLogger.this, verifyLogTask.verifyId, stringBuffer);
                                        }
                                    } else if (!verifyLogTask.userCaseID.equals("UC-MobileIC-170823-1")) {
                                        if (verifyLogTask.userCaseID.equals("UC-MobileIC-150810-4")) {
                                            String str = verifyLogTask.param2;
                                            VerifyLogger.access$1200(VerifyLogger.this, str);
                                            VerifyLogger.access$1400(VerifyLogger.this, str, VerifyLogger.access$1300(VerifyLogger.this, "endSymbol", verifyLogTask.userCaseID, "-", "-", verifyLogTask.param3, verifyLogTask.extParams));
                                            String stringBuffer2 = VerifyLogger.access$1500(VerifyLogger.this, str).toString();
                                            String access$1002 = VerifyLogger.access$100();
                                            VerifyLogCat.i(access$1002, "结束后：" + stringBuffer2);
                                            VerifyLogCat.i(VerifyLogger.access$100(), "删除对应暂留日志");
                                            VerifyLogger.getInstance().remove(str);
                                            if (verifyLogTask.extParams == null || !verifyLogTask.extParams.containsKey("cancel_scene") || !"fp_plugin".equalsIgnoreCase(verifyLogTask.extParams.get("cancel_scene"))) {
                                                LogReportHelper.getInstance().reportBehaviorLog(stringBuffer2, str);
                                            }
                                        } else {
                                            String access$1300 = VerifyLogger.access$1300(VerifyLogger.this, null, verifyLogTask.userCaseID, "-", "-", verifyLogTask.param3, verifyLogTask.extParams);
                                            if (!VerifyLogger.access$1000(VerifyLogger.this, verifyLogTask.verifyId, access$1300)) {
                                                VerifyLogger.access$1200(VerifyLogger.this, verifyLogTask.verifyId);
                                                VerifyLogger.access$1400(VerifyLogger.this, verifyLogTask.verifyId, access$1300);
                                            }
                                        }
                                    }
                                } else if (verifyLogTask.type.equalsIgnoreCase(VerifyLogger.SENTRY_TYPE) && !StringUtils.isEmpty(verifyLogTask.sentryLog)) {
                                    LogReportHelper.getInstance().reportSentryLog(VerifyLogger.access$1600(VerifyLogger.this, verifyLogTask.sentryLog));
                                }
                            }
                        } catch (Throwable th) {
                            VerifyLogCat.w(VerifyLogger.access$100(), th);
                        }
                    }
                }
            }, "VI-logBehavior");
        }
    }

    public void setVerifyId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e861b407", new Object[]{this, str});
        } else if (str == null || StringUtils.isEmpty(str)) {
        } else {
            if (this.f.length() > 0) {
                this.f.setLength(0);
            }
            this.f.append(str);
        }
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            return this.f != null ? this.f.toString() : "";
        } catch (Exception e) {
            VerifyLogCat.w(f5878a, e);
            return "";
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : StringUtils.isEmpty(str) ? "-" : str;
    }

    private synchronized StringBuffer b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuffer) ipChange.ipc$dispatch("346189ad", new Object[]{this, str});
        } else if (str != null) {
            StringBuffer stringBuffer = b.get(str);
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer("");
                a(str, stringBuffer);
            }
            return stringBuffer;
        } else {
            return new StringBuffer("");
        }
    }

    private synchronized void a(String str, StringBuffer stringBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290cda1c", new Object[]{this, str, stringBuffer});
            return;
        }
        if (str != null) {
            b.put(str, stringBuffer);
        }
    }

    private synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            b(str).append(str2);
        }
    }

    private synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        for (String str2 : this.c) {
            a(str, str2.replace("NULL_VID_TOBE_REPLACED", a(str)));
            VerifyLogCat.i(f5878a, "appendNoVerifyIdLogCache");
        }
        b();
    }

    private synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c.clear();
        }
    }

    public synchronized void remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
            return;
        }
        if (str != null) {
            b.remove(str);
        }
    }

    private synchronized boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        } else if (!StringUtils.isEmpty(str)) {
            return false;
        } else {
            this.c.add(str2);
            VerifyLogCat.i(f5878a, "cacheOnNoVerifyId");
            return true;
        }
    }

    public synchronized void writeCrashLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f96fcad", new Object[]{this, str});
            return;
        }
        VerifyLogCat.i(f5878a, "writeCrashLog");
        String a2 = a();
        c(a2);
        String str2 = b(a2).toString() + riy.ARRAY_END_STR;
        VerifyLogCat.i(f5878a, "异常后 | verify埋点内容:" + str2);
        EncryptFileUtils.write(LogReportHelper.getLogFileName(), str2);
        g(d(a2) + ",(" + str);
        if (this.d != null && !this.d.isEmpty()) {
            String a3 = a(this.d.toArray(), ",");
            VerifyLogCat.i(f5878a, "异常后 | event埋点内容:" + a3);
            EncryptFileUtils.write(LogReportHelper.getDispersedLogFileName(), a3);
        }
    }

    private static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder("[(");
        sb.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()));
        sb.append(";");
        sb.append(AppInfo.getInstance().getAppVersion());
        sb.append(";");
        sb.append(AppInfo.getInstance().getAppName());
        sb.append(";");
        sb.append(AppInfo.getInstance().getViSdkVersion());
        sb.append(";");
        sb.append(DeviceInfo.getMobileBrand());
        sb.append("|");
        sb.append(DeviceInfo.getMobileModel());
        sb.append(";");
        sb.append(DeviceInfo.getOsVersion());
        sb.append(";");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) MicroModuleContext.getInstance().getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        String str2 = "-";
        if (activeNetworkInfo.isAvailable()) {
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                str2 = "WIFI";
            } else if (type == 0) {
                str2 = "4G/3G";
            }
        }
        sb.append(str2);
        sb.append(";");
        sb.append(a(VIUtils.getUserId()));
        sb.append(";");
        sb.append(f(AppInfo.getInstance().getApdid()));
        sb.append(";");
        sb.append(f(EnvInfoUtil.getBirdNestInfo()));
        sb.append(";");
        if (StringUtils.isEmpty(str)) {
            str = "NULL_VID_TOBE_REPLACED";
        }
        sb.append(str);
        sb.append(";");
        sb.append(f(DeviceInfo.getUtdid(MicroModuleContext.getInstance().getContext())));
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }

    private static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : new SimpleDateFormat("HH:mm:ss:SSS").format(new Date());
    }

    private static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{str});
        }
        String[] split = str.split("-");
        return split[2] + "-" + split[3];
    }

    private static String f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd890709", new Object[]{str}) : str != null ? str.replaceAll("\\(|\\)", "") : "-";
    }

    private static String a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e59c2c01", new Object[]{str, str2, str3, map});
        }
        return handleValue(handleSymbol(str)) + ";" + handleValue(handleSymbol(str2)) + ";" + handleValue(handleSymbol(str3)) + ";" + a(map);
    }

    private static String a(Map<String, String> map) {
        String sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null) {
            return "-";
        }
        ArrayList arrayList = new ArrayList(map.keySet());
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str = (String) arrayList.get(i2);
            String str2 = map.get(str);
            if (i2 == arrayList.size() - 1 && !StringUtils.isEmpty(str2)) {
                sb2.append(str);
                sb2.append("=");
                sb2.append(handleValue(str2));
            } else if (!StringUtils.isEmpty(str2)) {
                sb2.append(str);
                sb2.append("=");
                sb2.append(handleValue(str2));
                sb2.append("&");
            }
        }
        if (sb2.toString().endsWith("&")) {
            sb = sb2.toString().substring(0, sb2.toString().length() - 1);
        } else {
            sb = sb2.toString();
        }
        return handleSymbol(sb);
    }

    public static String handleSymbol(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("94ed204f", new Object[]{str}) : str != null ? str.replaceAll("\\r", "#").replaceAll("\\n", "#").replaceAll(",", "，").replaceAll("\\[", "【").replaceAll("\\]", "】").replaceAll("\\(", "（").replaceAll("\\)", "）").replaceAll(";", "；") : "-";
    }

    public static String handleValue(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1c3b55e6", new Object[]{str}) : !StringUtils.isEmpty(str) ? str.replaceAll("&", "^") : "-";
    }

    private synchronized void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            this.d.add(str);
        }
    }

    private synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.d.clear();
        }
    }

    private static String a(Object[] objArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31e645ad", new Object[]{objArr, str});
        }
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        StringBuffer stringBuffer = new StringBuffer(length == 0 ? 0 : ((objArr[0] == null ? 16 : objArr[0].toString().length()) + 1) * length);
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 > 0) {
                stringBuffer.append(str);
            }
            if (objArr[i2] != null) {
                stringBuffer.append(objArr[i2]);
            }
        }
        return stringBuffer.toString();
    }

    public void logException(String str, Throwable th) {
        String str2;
        String bytes2Hex;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64705fb9", new Object[]{this, str, th});
            return;
        }
        try {
            str2 = new String(Base64.encode(VerifyLogCat.getExceptionMsg(th).getBytes("UTF-8"), 2));
        } catch (Throwable th2) {
            th = th2;
            str2 = "-";
        }
        try {
            bytes2Hex = CipherHelper.bytes2Hex(CipherHelper.encrypt_SHA(str2, "md5"));
        } catch (Throwable th3) {
            th = th3;
            VerifyLogCat.w(f5878a, "fail to build encodedExceptionMsg：", th);
            eventBehavior(str, "", "", str2, null);
        }
        if (SystemClock.elapsedRealtime() - j < 10000 && StringUtils.equals(k, bytes2Hex)) {
            VerifyLogCat.i(f5878a, "短时间内相同ExceptionMsg，忽略");
            return;
        }
        k = bytes2Hex;
        j = SystemClock.elapsedRealtime();
        eventBehavior(str, "", "", str2, null);
    }

    public static /* synthetic */ String access$300(VerifyLogger verifyLogger, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73b11da7", new Object[]{verifyLogger, str, str2, str3, str4, str5, str6, map});
        }
        String str7 = str.equalsIgnoreCase("event") ? ")]" : riy.BRACKET_END_STR;
        return d(str2) + ",(" + e(str3) + ";" + c() + ";" + a(str4, str5, str6, map) + str7;
    }

    public static /* synthetic */ String access$1300(VerifyLogger verifyLogger, String str, String str2, String str3, String str4, String str5, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ceda44c", new Object[]{verifyLogger, str, str2, str3, str4, str5, map});
        }
        String str6 = "endSymbol".equalsIgnoreCase(str) ? ")]" : riy.BRACKET_END_STR;
        return ",(" + e(str2) + ";" + c() + ";" + a(str3, str4, str5, map) + str6;
    }

    public static /* synthetic */ String access$1600(VerifyLogger verifyLogger, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89bdbc34", new Object[]{verifyLogger, str});
        }
        return d("-") + "," + str + riy.ARRAY_END_STR;
    }
}
