package com.alipay.mobile.common.logging.helper;

import android.os.SystemClock;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.MTBizReportName;
import com.alipay.mobile.common.logging.util.LoggingAsyncTaskExecutor;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class BugReportAnalyzer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static BugReportAnalyzer f5436a;
    private long b = 0;

    public static /* synthetic */ String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : b(i);
    }

    public static synchronized BugReportAnalyzer a() {
        synchronized (BugReportAnalyzer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BugReportAnalyzer) ipChange.ipc$dispatch("eb0316ee", new Object[0]);
            }
            if (f5436a == null) {
                f5436a = new BugReportAnalyzer();
            }
            return f5436a;
        }
    }

    private BugReportAnalyzer() {
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.b < 1000) {
            return;
        }
        this.b = elapsedRealtime;
        LoggingAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.logging.helper.BugReportAnalyzer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f5437a = 1500;
            public final /* synthetic */ boolean b = false;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    String a2 = BugReportAnalyzer.a(this.f5437a);
                    HashMap hashMap = new HashMap();
                    hashMap.put(LogCategory.CATEGORY_LOGCAT, a2);
                    LoggerFactory.getMonitorLogger().mtBizReport(MTBizReportName.MTBIZ_FRAME, "FRAME_LOGCAT_REPORT", "0", hashMap);
                    LoggerFactory.getLogContext().flush(null, this.b);
                    LoggerFactory.getLogContext().uploadAfterSync(null);
                } catch (Throwable th) {
                    LoggerFactory.getTraceLogger().warn("BugReportAnalyzer", th);
                }
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private static java.lang.String b(int r9) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.helper.BugReportAnalyzer.b(int):java.lang.String");
    }
}
