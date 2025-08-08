package com.alipay.mobile.verifyidentity.log.utils;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobile.verifyidentity.utils.task.ZFileUtil;
import com.alipay.mobileic.core.model.rpc.MICReportRequest;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class LogReportHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5881a = "com.alipay.mobile.verifyidentity.log.utils.LogReportHelper";
    private static volatile LogReportHelper b = null;
    private static String c = "logData";
    private static String d = "sentryLog";
    public static String dispersedLogDirName = "dispersedLog";
    public static String logDirName = "verifyLog";

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : f5881a;
    }

    public static LogReportHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogReportHelper) ipChange.ipc$dispatch("e1da66b8", new Object[0]);
        }
        if (b == null) {
            synchronized (LogReportHelper.class) {
                if (b == null) {
                    b = new LogReportHelper();
                }
            }
        }
        return b;
    }

    public synchronized void reportBehaviorLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398875d9", new Object[]{this, str, str2});
            return;
        }
        getAndReportData();
        if (!StringUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(c, str);
            a(hashMap, str, str2);
        }
    }

    public synchronized void reportDispersedLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbc1846", new Object[]{this, str});
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(c, str);
            a(hashMap, str, "");
        }
    }

    public synchronized void reportSentryLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617f9fe2", new Object[]{this, str});
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(d, str);
            a(hashMap, str, "");
        }
    }

    public synchronized void getAndReportData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb41d86", new Object[]{this});
            return;
        }
        File file = new File(MicroModuleContext.getInstance().getContext().getCacheDir().getAbsolutePath(), logDirName);
        File file2 = new File(MicroModuleContext.getInstance().getContext().getCacheDir().getAbsolutePath(), dispersedLogDirName);
        File[] listFiles = file.listFiles();
        File[] listFiles2 = file2.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            getFileLog(listFiles);
        }
        if (listFiles2 != null && listFiles2.length > 0) {
            getFileLog(listFiles2);
        }
    }

    public void getFileLog(File[] fileArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a03aab3", new Object[]{this, fileArr});
            return;
        }
        for (final File file : fileArr) {
            try {
                if (file.getAbsolutePath().contains(".vi.log")) {
                    String read = EncryptFileUtils.read(file);
                    if (StringUtils.isEmpty(read)) {
                        ZFileUtil.delete(file);
                    } else {
                        final HashMap hashMap = new HashMap();
                        hashMap.put(c, read);
                        AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.log.utils.LogReportHelper.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                try {
                                    MICRpcServiceBiz mICRpcServiceBiz = new MICRpcServiceBiz();
                                    MICReportRequest mICReportRequest = new MICReportRequest();
                                    mICReportRequest.reportData = hashMap;
                                    if (!mICRpcServiceBiz.report(mICReportRequest).success) {
                                        VerifyLogCat.w(LogReportHelper.access$000(), "核身本地日志上报失败");
                                        return;
                                    }
                                    VerifyLogCat.i(LogReportHelper.access$000(), "核身本地日志上报成功");
                                    ZFileUtil.delete(file);
                                } catch (RpcException e) {
                                    VerifyLogCat.w(LogReportHelper.access$000(), "rpc got an RPC exception: ", e);
                                } catch (Exception e2) {
                                    VerifyLogCat.w(LogReportHelper.access$000(), "rpc got an exception: ", e2);
                                }
                            }
                        }, "VI-reportFileData");
                        VerifyLogCat.i(f5881a, "本地有核身闪退日志需要上报");
                    }
                }
            } catch (Throwable th) {
                VerifyLogCat.e(f5881a, th);
            }
        }
    }

    private synchronized void a(final Map<String, String> map, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38873cb1", new Object[]{this, map, str, str2});
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.log.utils.LogReportHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    try {
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            MICRpcServiceBiz mICRpcServiceBiz = new MICRpcServiceBiz();
                            MICReportRequest mICReportRequest = new MICReportRequest();
                            mICReportRequest.reportData = map;
                            if (!mICRpcServiceBiz.report(mICReportRequest).success) {
                                VerifyLogCat.w(LogReportHelper.access$000(), "核身内存暂留日志上报失败");
                                z = true;
                            } else {
                                VerifyLogCat.w(LogReportHelper.access$000(), "核身内存暂留日志上报成功");
                            }
                            if (!z) {
                                return;
                            }
                            VerifyLogCat.i(LogReportHelper.access$000(), "暂留日志需要存到本地");
                            if (!StringUtils.isEmpty(str2)) {
                                EncryptFileUtils.write(LogReportHelper.getLogFileName(), str);
                            } else {
                                EncryptFileUtils.write(LogReportHelper.getDispersedLogFileName(), str);
                            }
                        } catch (RpcException e) {
                            VerifyLogCat.w(LogReportHelper.access$000(), "rpc got an RPC exception: ", e);
                            VerifyLogCat.i(LogReportHelper.access$000(), "暂留日志需要存到本地");
                            if (!StringUtils.isEmpty(str2)) {
                                EncryptFileUtils.write(LogReportHelper.getLogFileName(), str);
                            } else {
                                EncryptFileUtils.write(LogReportHelper.getDispersedLogFileName(), str);
                            }
                        } catch (Exception e2) {
                            VerifyLogCat.w(LogReportHelper.access$000(), "rpc got an exception: ", e2);
                            VerifyLogCat.i(LogReportHelper.access$000(), "暂留日志需要存到本地");
                            if (!StringUtils.isEmpty(str2)) {
                                EncryptFileUtils.write(LogReportHelper.getLogFileName(), str);
                            } else {
                                EncryptFileUtils.write(LogReportHelper.getDispersedLogFileName(), str);
                            }
                        }
                    } catch (Throwable th) {
                        VerifyLogCat.i(LogReportHelper.access$000(), "暂留日志需要存到本地");
                        EncryptFileUtils.write(!StringUtils.isEmpty(str2) ? LogReportHelper.getLogFileName() : LogReportHelper.getDispersedLogFileName(), str);
                        throw th;
                    }
                }
            }, "VI-reportMemoryData");
        }
    }

    public static String getLogFileName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("683995c4", new Object[0]);
        }
        return logDirName + File.separator + System.currentTimeMillis() + ".vi.log";
    }

    public static String getDispersedLogFileName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("117657db", new Object[0]);
        }
        return dispersedLogDirName + File.separator + System.currentTimeMillis() + ".vi.log";
    }
}
