package com.alipay.mobile.common.logging.uploader;

import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.encrypt.LogEncryptClient;
import com.alipay.mobile.common.logging.api.rpc.LogRpcResult;
import com.alipay.mobile.common.logging.api.rpc.RpcClient;
import com.alipay.mobile.common.logging.api.rpc.RpcLogData;
import com.alipay.mobile.common.logging.api.rpc.RpcLogRequestParam;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.util.FileUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class RpcUploader extends BaseUploader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(RpcUploader rpcUploader, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RpcUploader(File file, Context context) {
        super(file, context);
    }

    public final void a(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            new StringBuilder("cleanExpiresFile: ").append(th);
        }
        if (bundle != null) {
            z = bundle.getBoolean(LogContext.IS_MERGE_UPLOAD, false);
        }
        File[] listFiles = this.b.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            String str2 = f5455a;
            traceLogger.info(str2, str + " do not need upload RpcUploader");
            return;
        }
        TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
        String str3 = f5455a;
        traceLogger2.info(str3, str + " will upload, count of all mdap files: " + listFiles.length + " isMerge = " + z);
        if (z) {
            a(str, listFiles);
        } else {
            a(str, listFiles, bundle);
        }
    }

    private void a(String str, File[] fileArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9269a0da", new Object[]{this, str, fileArr});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            if (file != null && file.exists() && file.isFile()) {
                String name = file.getName();
                try {
                    String a2 = a(name);
                    if (!StringUtils.isEmpty(a2) && LogStrategyManager.getInstance().isRealTimeLogCategory(a2) && LogStrategyManager.getInstance().isLogSend(name)) {
                        arrayList.add(file);
                    }
                } catch (Throwable th) {
                    LoggerFactory.getTraceLogger().error(f5455a, th);
                }
            }
        }
        a(arrayList);
        LoggerFactory.getTraceLogger().info(f5455a, "target " + str + " merge uploadLog end");
    }

    private void a(List<File> list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list.isEmpty()) {
            LoggerFactory.getTraceLogger().info(f5455a, "uploadMergeFile files is empty");
        } else {
            int size = list.size();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            RpcClient logUploadRpcClient = LoggerFactory.getLogContext().getLogUploadRpcClient();
            if (logUploadRpcClient == null) {
                LoggerFactory.getTraceLogger().info(f5455a, "getRpcClient = null do http upload");
                b(list);
                return;
            }
            ArrayList arrayList5 = arrayList3;
            Integer num = 0;
            ArrayList arrayList6 = arrayList4;
            int i2 = 0;
            while (i2 < size) {
                try {
                    File file = list.get(i2);
                    if (file != null && file.exists()) {
                        String readFile = FileUtil.readFile(file);
                        if (StringUtils.isEmpty(readFile)) {
                            file.delete();
                            throw new IllegalStateException("file content is empty");
                            break;
                        }
                        String[] split = readFile.split("\\$\\$");
                        int length = split.length;
                        if (!arrayList6.isEmpty() && num.intValue() + length >= 100) {
                            a(arrayList5, arrayList6, logUploadRpcClient, num.intValue());
                            try {
                                arrayList2 = new ArrayList();
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                arrayList5 = new ArrayList();
                                arrayList6 = arrayList2;
                                num = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                arrayList6 = arrayList2;
                                num = 0;
                                LoggerFactory.getTraceLogger().error(f5455a, th);
                                i2++;
                                i = 0;
                            }
                        }
                        String a2 = a(file.getName());
                        RpcLogData rpcLogData = new RpcLogData();
                        rpcLogData.bizCode = a2;
                        ArrayList arrayList7 = new ArrayList();
                        int length2 = split.length;
                        while (i < length2) {
                            if (!StringUtils.isEmpty(split[i])) {
                                arrayList7.add(b(split[i]));
                            }
                            i++;
                        }
                        rpcLogData.log = arrayList7;
                        arrayList6.add(rpcLogData);
                        Integer valueOf = Integer.valueOf(num.intValue() + arrayList7.size());
                        try {
                            arrayList5.add(file);
                            if (valueOf.intValue() >= 100) {
                                a(arrayList5, arrayList6, logUploadRpcClient, valueOf.intValue());
                                ArrayList arrayList8 = new ArrayList();
                                try {
                                    arrayList = new ArrayList();
                                    arrayList6 = arrayList8;
                                    valueOf = 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    arrayList6 = arrayList8;
                                    num = 0;
                                    LoggerFactory.getTraceLogger().error(f5455a, th);
                                    i2++;
                                    i = 0;
                                }
                            } else {
                                arrayList = arrayList5;
                            }
                            arrayList5 = arrayList;
                            num = valueOf;
                        } catch (Throwable th4) {
                            th = th4;
                            num = valueOf;
                            LoggerFactory.getTraceLogger().error(f5455a, th);
                            i2++;
                            i = 0;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                i2++;
                i = 0;
            }
            if (arrayList6.isEmpty()) {
                return;
            }
            a(arrayList5, arrayList6, logUploadRpcClient, num.intValue());
        }
    }

    private void a(List<File> list, List<RpcLogData> list2, RpcClient rpcClient, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834f1cbd", new Object[]{this, list, list2, rpcClient, new Integer(i)});
            return;
        }
        RpcLogRequestParam rpcLogRequestParam = new RpcLogRequestParam();
        rpcLogRequestParam.logs = list2;
        int size = list.size();
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        String str = f5455a;
        traceLogger.info(str, "doMergeUpload start, files count = " + size + " logCount = " + i);
        try {
            LogRpcResult uploadLog = rpcClient.uploadLog(rpcLogRequestParam, "merge", null);
            TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
            String str2 = f5455a;
            traceLogger2.info(str2, "doMergeUpload success, files count = " + size + " logCount = " + i);
            if (uploadLog == null || uploadLog.respCode != 1000) {
                b(list);
                return;
            }
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    list.get(i2).delete();
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            b(list);
            LoggerFactory.getTraceLogger().error(f5455a, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.util.List<java.io.File> r21) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.uploader.RpcUploader.b(java.util.List):void");
    }

    private void a(String str, File[] fileArr, Bundle bundle) {
        String str2;
        String str3 = str;
        File[] fileArr2 = fileArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e651ba", new Object[]{this, str3, fileArr2, bundle});
            return;
        }
        int i = 0;
        int i2 = 0;
        while (i < fileArr2.length) {
            File file = fileArr2[i];
            if (file != null && file.exists() && file.isFile()) {
                String name = file.getName();
                try {
                    str2 = LogStrategyManager.getInstance().isLogSend(name, str3);
                    if (str2 == null) {
                        continue;
                    } else {
                        String str4 = "default";
                        if (bundle != null) {
                            try {
                                if (!StringUtils.isEmpty(bundle.getString("event"))) {
                                    str4 = bundle.getString("event");
                                }
                            } catch (Throwable th) {
                                th = th;
                                String th2 = th.toString();
                                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                                String str5 = f5455a;
                                traceLogger.error(str5, str2 + " uploadByCategory failed: " + name + " at " + th2);
                                i++;
                                str3 = str;
                                fileArr2 = fileArr;
                            }
                        }
                        if (file == null) {
                            throw new IllegalStateException("file object is NULL");
                        }
                        String readFile = FileUtil.readFile(file);
                        if (StringUtils.isEmpty(readFile)) {
                            file.delete();
                            throw new IllegalStateException("file content is empty");
                        }
                        RpcClient logUploadRpcClient = LoggerFactory.getLogContext().getLogUploadRpcClient();
                        if (logUploadRpcClient != null) {
                            ArrayList arrayList = new ArrayList();
                            RpcLogData rpcLogData = new RpcLogData();
                            rpcLogData.bizCode = str2;
                            ArrayList arrayList2 = new ArrayList();
                            String[] split = readFile.split("\\$\\$");
                            int length = split.length;
                            int i3 = 0;
                            while (i3 < length) {
                                arrayList2.add(b(split[i3]));
                                i3++;
                                split = split;
                            }
                            rpcLogData.log = arrayList2;
                            arrayList.add(rpcLogData);
                            RpcLogRequestParam rpcLogRequestParam = new RpcLogRequestParam();
                            rpcLogRequestParam.logs = arrayList;
                            LogRpcResult uploadLog = logUploadRpcClient.uploadLog(rpcLogRequestParam, str4, bundle);
                            if (uploadLog == null) {
                                LoggerFactory.getTraceLogger().info(f5455a, "rpc upload fail result is null");
                                a(bundle, str2);
                            } else if (uploadLog.respCode == 1000) {
                                LoggerFactory.getTraceLogger().info(f5455a, "rpc upload success category = ".concat(String.valueOf(str2)));
                                file.delete();
                            } else {
                                TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                                String str6 = f5455a;
                                traceLogger2.info(str6, "rpc upload fail respCode = " + uploadLog.respCode + " resp des = " + uploadLog.errorMsg);
                                a(bundle, str2);
                            }
                        } else {
                            a(bundle, str2);
                        }
                        TraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
                        String str7 = f5455a;
                        traceLogger3.info(str7, str2 + " uploadByCategory upload success: " + name + " event = " + str4);
                        i2++;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str2 = str;
                }
            }
            i++;
            str3 = str;
            fileArr2 = fileArr;
        }
        LoggerFactory.getTraceLogger().info(f5455a, "uploadByCategory end, realUploadCount: ".concat(String.valueOf(i2)));
    }

    private static String b(String str) {
        LogEncryptClient logEncryptClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (!StringUtils.isEmpty(str) && (logEncryptClient = LoggerFactory.getLogContext().getLogEncryptClient()) != null && str.startsWith("1_")) {
            String decrypt = logEncryptClient.decrypt(str.substring(2));
            if (!StringUtils.isEmpty(decrypt)) {
                return decrypt;
            }
        }
        return str;
    }

    private void a(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1273636", new Object[]{this, bundle, str});
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        LoggerFactory.getTraceLogger().info(f5455a, "doDegradeUploadByLogCategory logCategory = ".concat(String.valueOf(str)));
        bundle.putBoolean(LogContext.IS_DEGRADE_UPLOAD, true);
        new HttpUploader(this.b, this.c).a(str, (String) null, bundle);
    }
}
