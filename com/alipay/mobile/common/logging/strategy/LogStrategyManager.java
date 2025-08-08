package com.alipay.mobile.common.logging.strategy;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.common.logging.ContextInfo;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.api.monitor.DataflowID;
import com.alipay.mobile.common.logging.api.monitor.DataflowModel;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.http.HttpClient;
import com.alipay.mobile.common.logging.util.LoggingAsyncTaskExecutor;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.alipay.mobile.common.logging.util.network.NetWorkProvider;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingStatus;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.rrv;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LogStrategyManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE_BOOT = "boot";
    public static final String ACTION_TYPE_FEEDBACK = "feedback";
    public static final String ACTION_TYPE_LEAVEHINT = "leavehint";
    public static final String ACTION_TYPE_LOGIN = "login";
    public static final String ACTION_TYPE_MDAPUPLOAD = "mdapupload";
    public static final String ACTION_TYPE_TIMEOUT = "timeout";
    private static final String CDN_CONFIG_URL_PREFIX = "https://gw.alipayobjects.com/config";
    private static final int DISABLE_TOOLS_PROCESS_NO = 1;
    private static final int DISABLE_TOOLS_PROCESS_YES = 2;
    private static final int ENABLE_NOLOCK_LOG_NO = 2;
    private static final int ENABLE_NOLOCK_LOG_YES = 1;
    private static final int ENABLE_TRAFFIC_LIMIT_NO = 2;
    private static final int ENABLE_TRAFFIC_LIMIT_YES = 1;
    private static LogStrategyManager INSTANCE = null;
    private static final String JSON_DATA_CONTENT = "content";
    private static final String JSON_DATA_DIAGNOSE = "diagnose";
    private static final String KEY_BACKGROUND_TIMESTAMP = "backgroundTimestamp";
    private static final String KEY_CURRENT_REQUEST_TIMESPAN = "CurrentRequestTimeSpan";
    private static final String KEY_CUR_CRASH_HOUR = "curCrashHour";
    private static final String KEY_CUR_CRASH_HOUR_COUNT = "curCrashHourCount";
    private static final String KEY_CUR_CRASH_MINUTE = "curCrashMinute";
    private static final String KEY_CUR_CRASH_MINUTE_COUNT = "curCrashMinuteCount";
    private static final String KEY_CUR_KEYBIZ_DAY = "curKeyBizDay";
    private static final String KEY_CUR_KEYBIZ_DAY_COUNT = "curKeyBizDayCount";
    private static final String KEY_DISABLE_TOOLS_PROCESS = "DisableToolsProcess";
    private static final String KEY_ENABLE_NOLOCK_LOG = "Disable_NoLock_Log";
    private static final String KEY_ENABLE_TRAFFIC_LIMIT = "EnableTrafficLimit";
    private static final String KEY_POSITIVE_DIAGNOSE = "PositiveDiagnose";
    private static final String KEY_PREVIOUS_REQUEST_TIME = "PreviousRequestTime";
    private static final String KEY_STRATEG_CONFIG_CONTENT = "StrategConfigContent2nd";
    private static final String KEY_ZIP_AND_SEVENZIP = "ZipAndSevenZip";
    private static final int MAX_CRASH_HOUR_COUNT = 50;
    private static final int MAX_CRASH_MINUTE_COUNT = 2;
    private static final int MAX_KEYBIZ_DAY_COUNT = 200;
    private static final int POSITIVE_DIAGNOSE_ALL = 3;
    private static final int POSITIVE_DIAGNOSE_NO = 1;
    private static final int POSITIVE_DIAGNOSE_WIFI = 2;
    private static final String REQUEST_URL_SUFFIX = "/loggw/logConfig.do";
    private static final String SP_NAME_CRASHCOUNT_INFO = "CrashCountInfo";
    private static final String SP_NAME_KEYBIZ_INFO = "KeyBizInfo";
    private static final String SP_NAME_LOGSTRATEGY_CONFIG = "LogStrategyConfig";
    public static final String SP_STRATEGY_KEY_NETWORK = "Network";
    public static final String SP_STRATEGY_KEY_THRESHOLD = "Threshold";
    public static final String SP_STRATEGY_KEY_TRIGGER = "Trigger";
    private static final String TAG = "LogStrategyManager";
    private static final int ZIP_AND_SEVENZIP_NO = 1;
    private static final int ZIP_AND_SEVENZIP_YES = 2;
    private Context context;
    private ContextInfo contextInfo;
    private DataChangeBroadCastReceiver dataChangeBroadCastReceiver;
    private int disableNoLockLog;
    private int disableToolsProcessTag;
    private int enableTrafficLimitTag;
    private boolean isReadAndParseStrategy;
    private int positiveDiagnoseTag;
    private long previousRequestTime;
    private int zipAndSevenZipTag;
    private static final long REQUEST_TWICE_SPAN = TimeUnit.SECONDS.toMillis(5);
    private static final long DEFAULT_REQUEST_TIME_SPAN = TimeUnit.MINUTES.toMillis(30);
    private static final long MAXIMAL_REQUEST_TIME_SPAN = TimeUnit.HOURS.toMillis(1);
    public static final long MINIMUM_REQUEST_TIME_SPAN = TimeUnit.MINUTES.toMillis(3);
    private static long CURRENT_REQUEST_TIME_SPAN = DEFAULT_REQUEST_TIME_SPAN;
    private Map<String, LogStrategyInfo> strategyDataMap = new ConcurrentHashMap();
    private Map<String, Long> uploadTimeMap = new ConcurrentHashMap();
    private Map<String, String> intervalEventMap = new ConcurrentHashMap();
    private RealTimeConfig realTimeConfig = new RealTimeConfig();

    public static /* synthetic */ void access$000(LogStrategyManager logStrategyManager, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("368447f8", new Object[]{logStrategyManager, str, new Boolean(z)});
        } else {
            logStrategyManager.syncRequestLogConfig(str, z);
        }
    }

    public static synchronized LogStrategyManager createInstance(Context context, ContextInfo contextInfo) {
        synchronized (LogStrategyManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogStrategyManager) ipChange.ipc$dispatch("62f57931", new Object[]{context, contextInfo});
            }
            if (INSTANCE == null) {
                INSTANCE = new LogStrategyManager(context, contextInfo);
            }
            return INSTANCE;
        }
    }

    public static LogStrategyManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogStrategyManager) ipChange.ipc$dispatch("8782de9f", new Object[0]);
        }
        LogStrategyManager logStrategyManager = INSTANCE;
        if (logStrategyManager == null) {
            throw new IllegalStateException("need createInstance before use");
        }
        return logStrategyManager;
    }

    private LogStrategyManager(Context context, ContextInfo contextInfo) {
        this.context = context;
        this.contextInfo = contextInfo;
        registerDateChangeReceiver();
    }

    private void registerDateChangeReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee658997", new Object[]{this});
            return;
        }
        try {
            if (!LoggingUtil.isInAlipayClient(this.context)) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.DATE_CHANGED");
            this.dataChangeBroadCastReceiver = new DataChangeBroadCastReceiver();
            if (this.context == null) {
                return;
            }
            this.context.registerReceiver(this.dataChangeBroadCastReceiver, intentFilter);
        } catch (Throwable unused) {
        }
    }

    private void readAndParseStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3096e66c", new Object[]{this});
        } else if (this.isReadAndParseStrategy) {
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (this) {
                if (this.isReadAndParseStrategy) {
                    return;
                }
                int i = -1;
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    i = Thread.currentThread().getPriority();
                    Thread.currentThread().setPriority(Looper.getMainLooper().getThread().getPriority());
                }
                parseLogStrategy(this.context.getSharedPreferences(SP_NAME_LOGSTRATEGY_CONFIG, 4).getString(KEY_STRATEG_CONFIG_CONTENT, null));
                this.isReadAndParseStrategy = true;
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    Thread.currentThread().setPriority(i);
                }
                LoggerFactory.getTraceLogger().info(TAG, " readAndParseStrategy END. spend: ".concat(String.valueOf(SystemClock.uptimeMillis() - uptimeMillis)));
            }
        }
    }

    public boolean isLogWrite(String str, LogEvent.Level level) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eff7c0e6", new Object[]{this, str, level})).booleanValue();
        }
        readAndParseStrategy();
        if (str == null) {
            return false;
        }
        LogStrategyInfo logStrategyInfo = this.strategyDataMap.get(str);
        if (logStrategyInfo != null) {
            if (!logStrategyInfo.isWrite || !isHitTest(logStrategyInfo, level)) {
                return false;
            }
            return logStrategyInfo.level == -1 || level == null || logStrategyInfo.level >= level.loggerLevel;
        } else if ("crash".equalsIgnoreCase(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences sharedPreferences = this.context.getSharedPreferences(SP_NAME_CRASHCOUNT_INFO, 4);
            long millis = currentTimeMillis / TimeUnit.HOURS.toMillis(1L);
            long j = sharedPreferences.getLong(KEY_CUR_CRASH_HOUR, 0L);
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.info(TAG, "isLogWrite, curHour:" + millis + " lastCrashHour:" + j);
            if (millis != j) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(KEY_CUR_CRASH_HOUR, millis);
                edit.putInt(KEY_CUR_CRASH_HOUR_COUNT, 1);
                LoggerFactory.getTraceLogger().info(TAG, "isLogWrite, hourCommitResult:".concat(String.valueOf(edit.commit())));
            } else {
                int i = sharedPreferences.getInt(KEY_CUR_CRASH_HOUR_COUNT, 0) + 1;
                LoggerFactory.getTraceLogger().info(TAG, "isLogWrite, curCrashHourCout:".concat(String.valueOf(i)));
                if (i > 50) {
                    LoggerFactory.getTraceLogger().error(TAG, "crash count beyound hour limit:".concat(String.valueOf(i)));
                    return false;
                }
                LoggerFactory.getTraceLogger().info(TAG, "isLogWrite, curCrashHourCoutCommitResult:".concat(String.valueOf(sharedPreferences.edit().putInt(KEY_CUR_CRASH_HOUR_COUNT, i).commit())));
            }
            long millis2 = currentTimeMillis / TimeUnit.MINUTES.toMillis(1L);
            long j2 = sharedPreferences.getLong(KEY_CUR_CRASH_MINUTE, 0L);
            TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
            traceLogger2.info(TAG, "isLogWrite, curMinute:" + millis2 + " lastCrashMinute:" + j2);
            if (millis2 != j2) {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putLong(KEY_CUR_CRASH_MINUTE, millis2);
                edit2.putInt(KEY_CUR_CRASH_MINUTE_COUNT, 1);
                LoggerFactory.getTraceLogger().info(TAG, "isLogWrite, minuteCommitResult:".concat(String.valueOf(edit2.commit())));
            } else {
                int i2 = sharedPreferences.getInt(KEY_CUR_CRASH_MINUTE_COUNT, 0) + 1;
                LoggerFactory.getTraceLogger().info(TAG, "isLogWrite, curCrashMinuteCout:".concat(String.valueOf(i2)));
                if (i2 > 2) {
                    LoggerFactory.getTraceLogger().error(TAG, "crash count beyound minute limit:".concat(String.valueOf(i2)));
                    return false;
                }
                LoggerFactory.getTraceLogger().info(TAG, "isLogWrite, curCrashMinuteCoutCommitResult:".concat(String.valueOf(sharedPreferences.edit().putInt(KEY_CUR_CRASH_MINUTE_COUNT, i2).commit())));
            }
            return true;
        } else if (!LogCategory.CATEGORY_KEYBIZTRACE.equalsIgnoreCase(str)) {
            return !LogCategory.CATEGORY_SDKMONITOR.equalsIgnoreCase(str) && !LogCategory.CATEGORY_ROMESYNC.equalsIgnoreCase(str);
        } else {
            long currentTimeMillis2 = System.currentTimeMillis();
            SharedPreferences sharedPreferences2 = this.context.getSharedPreferences(SP_NAME_KEYBIZ_INFO, 4);
            long millis3 = currentTimeMillis2 / TimeUnit.DAYS.toMillis(1L);
            if (millis3 != sharedPreferences2.getLong(KEY_CUR_KEYBIZ_DAY, 0L)) {
                SharedPreferences.Editor edit3 = sharedPreferences2.edit();
                edit3.putLong(KEY_CUR_KEYBIZ_DAY, millis3);
                edit3.putInt(KEY_CUR_KEYBIZ_DAY_COUNT, 1);
                edit3.commit();
            } else {
                int i3 = sharedPreferences2.getInt(KEY_CUR_KEYBIZ_DAY_COUNT, 0) + 1;
                if (i3 > 200) {
                    LoggerFactory.getTraceLogger().error(TAG, "key biz trace count beyound day limit:".concat(String.valueOf(i3)));
                    return false;
                }
                sharedPreferences2.edit().putInt(KEY_CUR_KEYBIZ_DAY_COUNT, i3).commit();
            }
            return true;
        }
    }

    public boolean needEncrypt(String str) {
        LogStrategyInfo logStrategyInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b57da44", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || (logStrategyInfo = this.strategyDataMap.get(str)) == null) {
            return false;
        }
        return logStrategyInfo.isEncrypt;
    }

    public boolean isLogSend(String str) {
        LogStrategyInfo logStrategyInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a6dd177", new Object[]{this, str})).booleanValue();
        }
        readAndParseStrategy();
        String[] split = str.split("_");
        if (split.length < 3) {
            return false;
        }
        String str2 = split[2];
        String currentNetworkType2Str = NetWorkProvider.getInstance().getCurrentNetworkType2Str();
        if ("unknown".equals(currentNetworkType2Str) || (logStrategyInfo = this.strategyDataMap.get(str2)) == null || !logStrategyInfo.hasSendCondition) {
            return true;
        }
        if ("4g".equals(currentNetworkType2Str) && !logStrategyInfo.sendCondition.contains("4g")) {
            return false;
        }
        if ("3g".equals(currentNetworkType2Str) && !logStrategyInfo.sendCondition.contains("3g")) {
            return false;
        }
        if ("2g".equals(currentNetworkType2Str) && !logStrategyInfo.sendCondition.contains("2g")) {
            return false;
        }
        return !"wifi".equals(currentNetworkType2Str) || logStrategyInfo.sendCondition.contains("wifi");
    }

    public String isLogSend(String str, String str2) {
        LogStrategyInfo logStrategyInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d4739c3", new Object[]{this, str, str2});
        }
        readAndParseStrategy();
        String[] split = str.split("_");
        if (split.length < 3) {
            return null;
        }
        String str3 = split[2];
        if (str2 != null && !str2.equals(str3)) {
            return null;
        }
        String currentNetworkType2Str = NetWorkProvider.getInstance().getCurrentNetworkType2Str();
        if ("unknown".equals(currentNetworkType2Str) || (logStrategyInfo = this.strategyDataMap.get(str3)) == null || !logStrategyInfo.hasSendCondition) {
            return str3;
        }
        if ("4g".equals(currentNetworkType2Str) && !logStrategyInfo.sendCondition.contains("4g")) {
            return null;
        }
        if ("3g".equals(currentNetworkType2Str) && !logStrategyInfo.sendCondition.contains("3g")) {
            return null;
        }
        if ("2g".equals(currentNetworkType2Str) && !logStrategyInfo.sendCondition.contains("2g")) {
            return null;
        }
        if ("wifi".equals(currentNetworkType2Str) && !logStrategyInfo.sendCondition.contains("wifi")) {
            return null;
        }
        return str3;
    }

    public boolean isLogUpload(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9db3e77a", new Object[]{this, str, str2})).booleanValue();
        }
        readAndParseStrategy();
        List<String> list = null;
        LogStrategyInfo logStrategyInfo = this.strategyDataMap.get(str);
        if (logStrategyInfo != null) {
            list = logStrategyInfo.uploadEvents;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        if (list.isEmpty()) {
            if (LogCategory.CATEGORY_ALIVEREPORT.equals(str) || LogCategory.CATEGORY_PERFORMANCE.equals(str) || LogCategory.CATEGORY_USERBEHAVOR.equals(str) || LogCategory.CATEGORY_AUTOUSERBEHAVOR.equals(str)) {
                list.add(LogContext.ENVENT_GOTOBACKGROUND);
            } else if ("crash".equals(str) || "apm".equals(str) || LogCategory.CATEGORY_DATAFLOW.equals(str) || LogCategory.CATEGORY_BATTERY.equals(str)) {
                list.add(LogContext.ENVENT_GOTOBACKGROUND);
                list.add(LogContext.CLIENT_ENVENT_CLIENTLAUNCH);
            } else {
                list.add(LogContext.CLIENT_ENVENT_PERIODCHECK);
                list.add(LogContext.ENVENT_GOTOBACKGROUND);
            }
        } else if (LogCategory.CATEGORY_LOGMONITOR.equals(str) && !list.contains(LogContext.CLIENT_ENVENT_PERIODCHECK)) {
            list.add(LogContext.CLIENT_ENVENT_PERIODCHECK);
        }
        return list.contains(str2);
    }

    public boolean isLogUploadByInterval(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c349016", new Object[]{this, str, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || !this.intervalEventMap.containsKey(str2)) {
            return true;
        }
        Long l = this.uploadTimeMap.get(str);
        if (l == null || l.longValue() <= 0) {
            this.uploadTimeMap.put(str, Long.valueOf(System.currentTimeMillis()));
            return true;
        }
        LogStrategyInfo logStrategyInfo = this.strategyDataMap.get(str);
        int i = 60000;
        if (logStrategyInfo != null && logStrategyInfo.uploadInterval >= 0) {
            i = logStrategyInfo.uploadInterval * 1000;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - l.longValue()) <= i) {
            return false;
        }
        this.uploadTimeMap.put(str, Long.valueOf(currentTimeMillis));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isLogUpload(java.lang.String r6, int r7, com.alipay.mobile.common.logging.api.LogContext r8) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.strategy.LogStrategyManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L27
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            r1[r3] = r6
            r6 = 2
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            r1[r6] = r2
            r6 = 3
            r1[r6] = r8
            java.lang.String r6 = "896df750"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L27:
            r5.readAndParseStrategy()
            java.lang.String r0 = "dataflow"
            boolean r0 = r0.equals(r6)
            r1 = 100
            if (r0 != 0) goto L8f
            java.lang.String r0 = "battery"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L3d
            goto L8f
        L3d:
            java.lang.String r0 = "userbehavor"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L8c
            java.lang.String r0 = "autouserbehavor"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L8c
            java.lang.String r0 = "exception"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L8c
            java.lang.String r0 = com.alipay.mobile.common.logging.api.LogCategory.CATEGORY_NETWORK
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L5f
            goto L8c
        L5f:
            java.lang.String r0 = "alivereport"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L6a
            r0 = 10
            goto L91
        L6a:
            java.lang.String r0 = "crash"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L8a
            java.lang.String r0 = "apm"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L8a
            java.lang.String r0 = com.alipay.mobile.common.logging.api.LogCategory.CATEGORY_KEYBIZTRACE
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L8a
            java.lang.String r0 = "alipaysdk"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L8f
        L8a:
            r0 = 1
            goto L91
        L8c:
            r0 = 50
            goto L91
        L8f:
            r0 = 100
        L91:
            java.util.Map<java.lang.String, com.alipay.mobile.common.logging.strategy.LogStrategyInfo> r1 = r5.strategyDataMap
            java.lang.Object r1 = r1.get(r6)
            com.alipay.mobile.common.logging.strategy.LogStrategyInfo r1 = (com.alipay.mobile.common.logging.strategy.LogStrategyInfo) r1
            if (r1 == 0) goto La1
            int r4 = r1.threshold
            if (r4 <= 0) goto La1
            int r0 = r1.threshold
        La1:
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "updateSize_"
            java.lang.String r6 = r1.concat(r6)
            java.lang.String r6 = r8.getContextParam(r6)
            boolean r8 = android.text.StringUtils.isEmpty(r6)
            if (r8 != 0) goto Lc5
            int r0 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> Lbb
            goto Lc5
        Lbb:
            r6 = move-exception
            com.alipay.mobile.common.logging.api.trace.TraceLogger r8 = com.alipay.mobile.common.logging.api.LoggerFactory.getTraceLogger()
            java.lang.String r1 = "LogStrategyManager"
            r8.error(r1, r6)
        Lc5:
            if (r7 < r0) goto Lc8
            return r3
        Lc8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.strategy.LogStrategyManager.isLogUpload(java.lang.String, int, com.alipay.mobile.common.logging.api.LogContext):boolean");
    }

    public boolean isRealTimeLogCategory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("989e0b22", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        readAndParseStrategy();
        LogStrategyInfo logStrategyInfo = this.strategyDataMap.get(str);
        if (logStrategyInfo != null && this.realTimeConfig.isEnable()) {
            return logStrategyInfo.realtime;
        }
        return false;
    }

    public LogStrategyInfo getLogStrategyInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogStrategyInfo) ipChange.ipc$dispatch("a5ff832a", new Object[]{this, str});
        }
        if (this.strategyDataMap != null && !StringUtils.isEmpty(str)) {
            return this.strategyDataMap.get(str);
        }
        return null;
    }

    public Map<String, LogStrategyInfo> getLogStrategyInfos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1afbfde0", new Object[]{this}) : this.strategyDataMap;
    }

    public void adjustRequestSpanByReceived() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13baa5e9", new Object[]{this});
        } else {
            readAndParseStrategy();
        }
    }

    public void adjustRequestSpanByNetNotMatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f984c4d5", new Object[]{this});
        } else {
            readAndParseStrategy();
        }
    }

    public void adjustRequestSpanByZipFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ca92c5", new Object[]{this});
        } else {
            readAndParseStrategy();
        }
    }

    public void adjustRequestSpanByUploadFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316c9187", new Object[]{this});
        } else {
            readAndParseStrategy();
        }
    }

    public void revertRequestSpanToNormal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a333b55e", new Object[]{this});
            return;
        }
        readAndParseStrategy();
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.info(TAG, "revertRequestSpanToNormal: " + CURRENT_REQUEST_TIME_SPAN);
        this.context.getSharedPreferences(SP_NAME_LOGSTRATEGY_CONFIG, 4).edit().putLong(KEY_CURRENT_REQUEST_TIMESPAN, CURRENT_REQUEST_TIME_SPAN).apply();
    }

    public void queryStrategy(String str, boolean z) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960fbba8", new Object[]{this, str, new Boolean(z)});
            return;
        }
        readAndParseStrategy();
        if (z) {
            asyncRequestLogConfig(str, z);
            return;
        }
        if (LoggerFactory.getProcessInfo().isMainProcess()) {
            sharedPreferences = this.context.getSharedPreferences(SP_NAME_LOGSTRATEGY_CONFIG, 0);
        } else {
            sharedPreferences = this.context.getSharedPreferences(SP_NAME_LOGSTRATEGY_CONFIG, 4);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - sharedPreferences.getLong(KEY_PREVIOUS_REQUEST_TIME, 0L)) < sharedPreferences.getLong(KEY_CURRENT_REQUEST_TIMESPAN, CURRENT_REQUEST_TIME_SPAN)) {
            return;
        }
        if (Math.abs(currentTimeMillis - this.previousRequestTime) < REQUEST_TWICE_SPAN) {
            LoggerFactory.getTraceLogger().error(TAG, "queryStrategy returned by twice: ".concat(String.valueOf(str)));
            return;
        }
        this.previousRequestTime = currentTimeMillis;
        asyncRequestLogConfig(str, z);
    }

    private void asyncRequestLogConfig(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("164e7c90", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (NetUtil.isNetworkConnected(this.context)) {
            saveRequestTimeAndRevertRequestSpanToNormal();
        }
        LoggingAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.logging.strategy.LogStrategyManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LogStrategyManager.access$000(LogStrategyManager.this, str, z);
                }
            }
        });
    }

    private void syncRequestLogConfig(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aba8f91", new Object[]{this, str, new Boolean(z)});
            return;
        }
        LoggerFactory.getTraceLogger().warn(TAG, "syncRequestLogConfig: " + str + ", isForceRequest: " + z);
        try {
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error(TAG, th);
        }
        if (!LoggerFactory.getProcessInfo().isMainProcess()) {
            LoggerFactory.getTraceLogger().error(TAG, "syncRequestLogConfig: is not main process");
            return;
        }
        if (TianyanLoggingStatus.isStrictBackground()) {
            String configValueByKey = TianyanLoggingStatus.getConfigValueByKey("LogStrategy_request_in_bg_disable", "");
            LoggerFactory.getTraceLogger().error(TAG, "syncRequestLogConfig: background and disable ".concat(String.valueOf(configValueByKey)));
            if ("true".equals(configValueByKey)) {
                return;
            }
        }
        try {
            if (StringUtils.isEmpty(LoggerFactory.getLogContext().getLogHost())) {
                LoggerFactory.getTraceLogger().error(TAG, "syncRequestLogConfig: host is none");
                return;
            }
            Map<String, String> logConfigRequestParams = getLogConfigRequestParams(str, true);
            String str2 = CDN_CONFIG_URL_PREFIX + REQUEST_URL_SUFFIX;
            HttpClient httpClient = new HttpClient(str2, this.context);
            long currentTimeMillis = System.currentTimeMillis();
            HttpResponse synchronousRequestByGET = httpClient.synchronousRequestByGET(logConfigRequestParams);
            doConfigRequestMonitor(httpClient, System.currentTimeMillis() - currentTimeMillis);
            if (synchronousRequestByGET == null) {
                httpClient.closeStreamForNextExecute();
                LoggerFactory.getTraceLogger().error(TAG, "syncRequestLogConfig: response is NULL, network error: ".concat(String.valueOf("")));
                return;
            }
            saveRequestTimeAndRevertRequestSpanToNormal();
            int responseCode = httpClient.getResponseCode();
            String responseContent = httpClient.getResponseContent();
            DataflowModel.obtain(DataflowID.MDAP_LOG, str2, httpClient.getRequestLength(), httpClient.getResponseLength(), "strategy").report();
            httpClient.closeStreamForNextExecute();
            if (responseCode == 200 && !StringUtils.isEmpty(responseContent)) {
                syncLogConfig(responseContent);
                return;
            }
            LoggerFactory.getTraceLogger().error(TAG, "syncRequestLogConfig: response is none, or responseCode is ".concat(String.valueOf(responseCode)));
        } catch (Throwable th2) {
            LoggerFactory.getTraceLogger().error(TAG, "syncRequestLogConfig", th2);
        }
    }

    private Map<String, String> getLogConfigRequestParams(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db50893", new Object[]{this, str, new Boolean(z)});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(rrv.PRODUCT_ID, this.contextInfo.e);
        hashMap.put(LoggingSPCache.STORAGE_PRODUCTVERSION, this.contextInfo.f);
        hashMap.put("templateId", "2.0");
        hashMap.put("configVersion", "2");
        if (!z) {
            hashMap.put("actionType", str);
            hashMap.put("userId", this.contextInfo.a());
            hashMap.put("utdId", this.contextInfo.b());
            hashMap.put("processName", LoggerFactory.getProcessInfo().getProcessAlias());
        }
        return hashMap;
    }

    public void syncLogConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58cb339c", new Object[]{this, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.getInt("code") != 200) {
                LoggerFactory.getTraceLogger().error(TAG, "syncRequestLogConfig: serverLogicCode is not 200, ".concat(String.valueOf(str)));
                return;
            }
            if (jSONObject.has("diagnose")) {
                LoggerFactory.getTraceLogger().info(TAG, "syncRequestLogConfig: has diagnose tasks");
                JSONArray jSONArray = jSONObject.getJSONArray("diagnose");
                if (jSONArray != null) {
                    Intent intent = new Intent();
                    intent.setClassName(this.context, LogContext.PUSH_SERVICE_CLASS_NAME);
                    intent.setAction(this.context.getPackageName() + ".push.action.MONITOR_RECEIVED");
                    intent.putExtra("config_msg_tasks", jSONArray.toString());
                    intent.putExtra("config_msg_userid", this.contextInfo.a());
                    try {
                        intent.setPackage(this.context.getPackageName());
                    } catch (Throwable unused) {
                    }
                    if (this.context.startService(intent) == null) {
                        LoggerFactory.getTraceLogger().error(TAG, "syncRequestLogConfig: start service for diagnose occured error");
                    }
                }
            }
            if (!jSONObject.has("content")) {
                return;
            }
            LoggerFactory.getTraceLogger().info(TAG, "syncRequestLogConfig: has configs");
            String string = jSONObject.getString("content");
            updateLogStrategy(string);
            if (LoggerFactory.getProcessInfo().isMainProcess()) {
                notifyOtherProcessToUpdateLogStrategy(LogContext.PUSH_LOG_SERVICE_CLASS_NAME, string);
                if (!LoggerFactory.getLogContext().isDisableToolsProcess() && (LoggerFactory.getLogContext().getToolsUploadInterceptor() == null || LoggerFactory.getLogContext().getToolsUploadInterceptor().isUplaod() != 2)) {
                    notifyOtherProcessToUpdateLogStrategy(LogContext.TOOLS_SERVICE_CLASS_NAME, string);
                }
                notifyLiteProcessToUpdateLogStrategy(string);
            } else if (LoggerFactory.getProcessInfo().isPushProcess()) {
                if (LoggerFactory.getLogContext().isDisableToolsProcess()) {
                    return;
                }
                if (LoggerFactory.getLogContext().getToolsUploadInterceptor() != null && LoggerFactory.getLogContext().getToolsUploadInterceptor().isUplaod() == 2) {
                    notifyToolProcessToUpdateLogStrategy(string);
                } else {
                    notifyOtherProcessToUpdateLogStrategy(LogContext.TOOLS_SERVICE_CLASS_NAME, string);
                }
            } else if (LoggerFactory.getProcessInfo().isToolsProcess() || LoggerFactory.getProcessInfo().isExtProcess()) {
            } else {
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                traceLogger.error(TAG, "syncRequestLogConfig, error: unknown process " + LoggerFactory.getProcessInfo().getProcessAlias());
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error(TAG, "syncLogConfig", th);
        }
    }

    private void notifyOtherProcessToUpdateLogStrategy(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ade35be6", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            Intent intent = new Intent();
            intent.setClassName(this.context, str);
            intent.setAction(this.context.getPackageName() + LogContext.ACTION_UPDATE_LOG_STRATEGY);
            intent.putExtra("strategy", str2);
            try {
                intent.setPackage(this.context.getPackageName());
            } catch (Throwable unused) {
            }
            try {
                if (this.context.startService(intent) != null) {
                    return;
                }
                LoggerFactory.getTraceLogger().error(TAG, "notifyOtherProcessToUpdateLogStrategy: start service occured error");
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error(TAG, "notifyOtherProcessToUpdateLogStrategy", th);
            }
        }
    }

    private void notifyToolProcessToUpdateLogStrategy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8253056", new Object[]{this, str});
        } else if (!StringUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            try {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.context.getSystemService("activity")).getRunningAppProcesses()) {
                    hashMap.put(runningAppProcessInfo.processName, runningAppProcessInfo.processName);
                }
            } catch (Throwable th) {
                new StringBuilder("getProcessIdByName: ").append(th);
            }
            if (!hashMap.containsKey(LogContext.TOOLS_SERVICE_CLASS_NAME)) {
                return;
            }
            Intent intent = new Intent();
            intent.setClassName(this.context, LogContext.TOOLS_SERVICE_CLASS_NAME);
            intent.setAction(this.context.getPackageName() + LogContext.ACTION_UPDATE_LOG_STRATEGY);
            intent.putExtra("strategy", str);
            try {
                intent.setPackage(this.context.getPackageName());
            } catch (Throwable unused) {
            }
            try {
                if (this.context.startService(intent) != null) {
                    return;
                }
                LoggerFactory.getTraceLogger().error(TAG, "notifyToolProcessToUpdateLogStrategy: start service occured error");
            } catch (Throwable th2) {
                LoggerFactory.getTraceLogger().error(TAG, "notifyToolProcessToUpdateLogStrategy", th2);
            }
        }
    }

    private synchronized void notifyLiteProcessToUpdateLogStrategy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9faab36c", new Object[]{this, str});
        } else if (!StringUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.context.getSystemService("activity")).getRunningAppProcesses()) {
                hashMap.put(runningAppProcessInfo.processName, runningAppProcessInfo.processName);
            }
            for (int i = 1; i <= 5; i++) {
                String concat = "com.alipay.mobile.common.logging.process.LogServiceInlite".concat(String.valueOf(i));
                if (hashMap.containsKey(concat)) {
                    Intent intent = new Intent();
                    intent.setClassName(this.context, concat);
                    intent.setAction(this.context.getPackageName() + LogContext.ACTION_UPDATE_LOG_STRATEGY);
                    intent.putExtra("strategy", str);
                    try {
                        intent.setPackage(this.context.getPackageName());
                    } catch (Throwable unused) {
                    }
                    if (this.context.startService(intent) == null) {
                        LoggerFactory.getTraceLogger().error(TAG, "notifyLiteProcessToUpdateLogStrategy: start service occured error");
                    }
                }
            }
        }
    }

    public void updateBackgroundTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a9f8759", new Object[]{this, new Long(j)});
            return;
        }
        readAndParseStrategy();
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(SP_NAME_CRASHCOUNT_INFO, 4);
        if (j == sharedPreferences.getLong(KEY_BACKGROUND_TIMESTAMP, -9L)) {
            return;
        }
        sharedPreferences.edit().putLong(KEY_BACKGROUND_TIMESTAMP, j).commit();
    }

    public long getBackgroundTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9111b60c", new Object[]{this})).longValue();
        }
        readAndParseStrategy();
        return this.context.getSharedPreferences(SP_NAME_CRASHCOUNT_INFO, 4).getLong(KEY_BACKGROUND_TIMESTAMP, 0L);
    }

    public void updateLogStrategy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e8da5f", new Object[]{this, str});
            return;
        }
        readAndParseStrategy();
        if (StringUtils.isEmpty(str)) {
            return;
        }
        this.context.getSharedPreferences(SP_NAME_LOGSTRATEGY_CONFIG, 4).edit().putString(KEY_STRATEG_CONFIG_CONTENT, str).apply();
        try {
            parseLogStrategy(str);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error(TAG, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0295 A[Catch: Throwable -> 0x02d1, TRY_LEAVE, TryCatch #7 {Throwable -> 0x02d1, blocks: (B:137:0x028f, B:139:0x0295), top: B:222:0x028f }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c3 A[Catch: Throwable -> 0x02d3, TryCatch #8 {Throwable -> 0x02d3, blocks: (B:141:0x029b, B:143:0x02a8, B:145:0x02b0, B:148:0x02ba, B:151:0x02c3, B:152:0x02cb), top: B:224:0x029b }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02de A[Catch: Throwable -> 0x02ea, TRY_LEAVE, TryCatch #25 {Throwable -> 0x02ea, blocks: (B:156:0x02d3, B:157:0x02d8, B:159:0x02de), top: B:252:0x02d3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void parseLogStrategy(java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.strategy.LogStrategyManager.parseLogStrategy(java.lang.String):void");
    }

    public boolean isPositiveDiagnose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c00c4c2c", new Object[]{this})).booleanValue();
        }
        readAndParseStrategy();
        if (this.positiveDiagnoseTag == 0) {
            this.positiveDiagnoseTag = this.context.getSharedPreferences(SP_NAME_LOGSTRATEGY_CONFIG, 4).getInt(KEY_POSITIVE_DIAGNOSE, 1);
        }
        int i = this.positiveDiagnoseTag;
        if (i != 2) {
            return i == 3;
        }
        NetworkInfo activeNetworkInfo = NetUtil.getActiveNetworkInfo(this.context);
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }

    public boolean isZipAndSevenZip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ae733f", new Object[]{this})).booleanValue();
        }
        readAndParseStrategy();
        if (this.zipAndSevenZipTag == 0) {
            this.zipAndSevenZipTag = this.context.getSharedPreferences(SP_NAME_LOGSTRATEGY_CONFIG, 4).getInt(KEY_ZIP_AND_SEVENZIP, 1);
        }
        return this.zipAndSevenZipTag == 2;
    }

    public void setDisableToolsProcess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("188b2013", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.disableToolsProcessTag = 2;
        } else {
            this.disableToolsProcessTag = 1;
        }
    }

    public boolean isDisableToolsProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a402bd1d", new Object[]{this})).booleanValue();
        }
        readAndParseStrategy();
        if (this.disableToolsProcessTag == 0) {
            this.disableToolsProcessTag = this.context.getSharedPreferences(SP_NAME_LOGSTRATEGY_CONFIG, 4).getInt(KEY_DISABLE_TOOLS_PROCESS, 1);
        }
        return this.disableToolsProcessTag == 2;
    }

    public boolean isEnableTrafficLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbf086b6", new Object[]{this})).booleanValue();
        }
        readAndParseStrategy();
        if (this.enableTrafficLimitTag == 0) {
            this.enableTrafficLimitTag = this.context.getSharedPreferences(SP_NAME_LOGSTRATEGY_CONFIG, 4).getInt(KEY_ENABLE_TRAFFIC_LIMIT, 2);
        }
        return this.enableTrafficLimitTag == 1;
    }

    public boolean isDisableNoLockLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f05d7e5", new Object[]{this})).booleanValue();
        }
        if (this.disableNoLockLog == 0) {
            this.disableNoLockLog = this.context.getSharedPreferences(SP_NAME_LOGSTRATEGY_CONFIG, 4).getInt(KEY_ENABLE_NOLOCK_LOG, 2);
        }
        return this.disableNoLockLog != 1;
    }

    private void saveRequestTimeAndRevertRequestSpanToNormal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1939726", new Object[]{this});
            return;
        }
        this.context.getSharedPreferences(SP_NAME_LOGSTRATEGY_CONFIG, 4).edit().putLong(KEY_PREVIOUS_REQUEST_TIME, System.currentTimeMillis()).apply();
        revertRequestSpanToNormal();
    }

    private boolean isHitTest(LogStrategyInfo logStrategyInfo, LogEvent.Level level) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f22cac44", new Object[]{this, logStrategyInfo, level})).booleanValue();
        }
        int i = level.loggerLevel;
        Integer num = logStrategyInfo.levelHits.get(String.valueOf(i));
        if (num != null && num.intValue() != LogStrategyInfo.SIMPLING_STATE_INIT) {
            return num.intValue() == LogStrategyInfo.SIMPLING_STATE_HIT || num.intValue() != LogStrategyInfo.SIMPLING_STATE_UNHIT;
        }
        boolean isHitTest = SimplingUtils.isHitTest(getUploadRateByLevel(logStrategyInfo, i), LoggerFactory.getLogContext().getDeviceId());
        if (isHitTest) {
            logStrategyInfo.levelHits.put(String.valueOf(i), Integer.valueOf(LogStrategyInfo.SIMPLING_STATE_HIT));
        } else {
            logStrategyInfo.levelHits.put(String.valueOf(i), Integer.valueOf(LogStrategyInfo.SIMPLING_STATE_UNHIT));
        }
        return isHitTest;
    }

    private int getUploadRateByLevel(LogStrategyInfo logStrategyInfo, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50411db9", new Object[]{this, logStrategyInfo, new Integer(i)})).intValue();
        }
        if (i == 1) {
            i2 = logStrategyInfo.levelRate1;
        } else if (i == 2) {
            i2 = logStrategyInfo.levelRate2;
        } else {
            i2 = i != 3 ? -1 : logStrategyInfo.levelRate3;
        }
        return i2 == -1 ? logStrategyInfo.uploadRate : i2;
    }

    public void refreshHitState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7194f0c0", new Object[]{this});
            return;
        }
        Map<String, LogStrategyInfo> map = this.strategyDataMap;
        if (map == null) {
            return;
        }
        for (Map.Entry<String, LogStrategyInfo> entry : map.entrySet()) {
            LogStrategyInfo value = entry.getValue();
            if (value != null && (value instanceof LogStrategyInfo)) {
                value.levelHits.clear();
            }
        }
    }

    public String getHitTestRate(String str, int i) {
        LogStrategyInfo logStrategyInfo;
        int uploadRateByLevel;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e87f8d5d", new Object[]{this, str, new Integer(i)}) : (str == null || (logStrategyInfo = this.strategyDataMap.get(str)) == null || (uploadRateByLevel = getUploadRateByLevel(logStrategyInfo, i)) < 0) ? "1000" : String.valueOf(uploadRateByLevel);
    }

    public RealTimeConfig getRealTimeConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RealTimeConfig) ipChange.ipc$dispatch("a71bca10", new Object[]{this}) : this.realTimeConfig;
    }

    public void setRealTimeConfig(RealTimeConfig realTimeConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6714105a", new Object[]{this, realTimeConfig});
        } else {
            this.realTimeConfig = realTimeConfig;
        }
    }

    public Map<String, String> getIntervalEventMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8703a0f9", new Object[]{this}) : this.intervalEventMap;
    }

    public void setIntervalEventMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1117cb5", new Object[]{this, map});
        } else {
            this.intervalEventMap = map;
        }
    }

    private void doConfigRequestMonitor(HttpClient httpClient, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fceb2872", new Object[]{this, httpClient, new Long(j)});
            return;
        }
        try {
            String str = httpClient.b;
            String str2 = httpClient.f5441a == null ? UTConstant.Args.UT_SUCCESS_F : "T";
            Behavor behavor = new Behavor();
            behavor.setBehaviourPro(LogCategory.CATEGORY_LOGMONITOR);
            behavor.setSeedID("fetchConfig");
            behavor.setParam1(str);
            behavor.setParam2(str2);
            behavor.setParam3(String.valueOf(j));
            behavor.setLoggerLevel(3);
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.debug(TAG, "config httpget request url=" + str + ",result=" + str2);
            LoggerFactory.getBehavorLogger().event(null, behavor);
        } catch (Throwable th) {
            TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
            traceLogger2.error(TAG, "doConfigRequestMonitor ex=" + th.toString());
        }
    }
}
