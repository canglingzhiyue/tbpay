package com.alipay.mobile.common.logging.util.perf;

import com.alipay.mobile.framework.MpaasClassInfo;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class Constants {
    public static final long APP_IDLE = 5;
    public static final long APP_TO_REAL_IDLE = 3;
    public static final String BROADCAST_ACTION = "mpaas.perf.judge.event";
    public static final long CPU_IDLE = 20;
    public static final String EVENT_BACKGROUND = "background";
    public static final String EVENT_CLIENT_LAUNCH = "clientLaunch";
    public static final String EVENT_CLIENT_LAUNCH_FINISH = "clientLaunchFinish";
    public static final String EVENT_ENTER_IDLE = "enterIdle";
    public static final String EVENT_ENTER_IMP_ZONE = "enterImpZone";
    public static final String EVENT_LEAVE_IMP_ZONE = "leaveImpZone";
    public static final String KEY_JUDGE_CONTROL = "perfJudgeControl";
    public static final String KEY_JUDGE_NO_WRITE_STARTUP_TIME = "perfJudgeNoWriteStartupTime";
    public static final String KEY_LAUNCH_TIME_LIST = "launchTimeList";
    public static final String KEY_TOOLS_CONTROL = "perfToolsControl";
    public static final String PARAM_EVENT = "event";
    public static final String PARAM_PERF_LEVEL = "perfLevel";
    public static final String PARAM_TOOLS_DOWNGRADE = "toolsDowngrade";
    public static final long PERF_LEVEL_1 = 1;
    public static final long PERF_LEVEL_2 = 2;
    public static final long PERF_LEVEL_3 = 3;
    public static final String SPLIT = "-";
    public static final String SP_NAME = "PerformanceJudge";
    public static final long STARTUP_TIME_LEVEL_1 = 4000;
    public static final long STARTUP_TIME_LEVEL_2 = 2000;
    public static final long STARTUP_TIME_LEVEL_3 = 0;
    public static final String SWITCH_DISABLE = "disable";
    public static final String SWITCH_ENABLE = "enable";
    public static final String VAL_NO = "no";
    public static final String VAL_YES = "yes";
}
