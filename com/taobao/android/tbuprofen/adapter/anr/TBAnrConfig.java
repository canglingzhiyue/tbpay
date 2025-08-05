package com.taobao.android.tbuprofen.adapter.anr;

import tb.kge;

/* loaded from: classes6.dex */
public class TBAnrConfig {
    public static final int WRITE_TO_CRASH_MAP = 4;
    public static final int WRITE_TO_LOCAL_FILE = 2;
    public boolean dumpNativeStack;
    public String soVer = null;
    public String utilSoPath = null;
    public boolean isEnable = false;
    public boolean isDebug = false;
    public boolean earlyInit = false;
    public int releaseSample = 0;
    public int graySample = 10000;
    public int minSDK = 29;
    public int maxSDK = 34;
    public int monitorTimeScope = 20000;
    public int largeTaskThreshold = 300;
    public int idleTaskThreshold = 300;
    public int checkTaskInterval = 5000;
    public int maxPendingMessageCount = 500;
    public int getRunningInfoInterval = 5000;
    public boolean isAnrTraceDumpEnable = true;
    public int defaultDumpInterval = 500;
    public int maxDumpInterval = 1500;
    public int timeIncType = 2;
    public int anrInfoSaveFlag = 6;
    public int maxAnrFileNum = 5;
    public long spOptSample = 0;
    public long dumpStatisticSample = 10000;
    public long traceStatisticSample = 1000;
    public boolean dumpMessageObjInfo = true;
    public boolean restartDumpThread = false;
    public int ddmDumpSdkVersion = 29;
    public boolean collectAggregatedMessage = false;
    public long runningInfoCollectSample = 0;
    public boolean initChildProcess = false;
    public boolean dumpAnrTrace = false;

    static {
        kge.a(446365334);
    }
}
