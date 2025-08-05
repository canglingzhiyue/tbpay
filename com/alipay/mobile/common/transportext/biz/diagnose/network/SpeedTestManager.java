package com.alipay.mobile.common.transportext.biz.diagnose.network;

import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnoseManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SpeedTestManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static SpeedTestManager f5670a = null;
    public static boolean firstTime = true;
    public static int netErrCode = -2;
    private DiagnoseStateManager b = null;
    private NetworkDiagnoseManager.ResultCount c = null;

    public static final SpeedTestManager instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpeedTestManager) ipChange.ipc$dispatch("7808e34c", new Object[0]);
        }
        if (f5670a == null) {
            f5670a = new SpeedTestManager();
        }
        return f5670a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[Catch: Throwable -> 0x00d5, TryCatch #0 {Throwable -> 0x00d5, blocks: (B:15:0x003e, B:17:0x0048, B:19:0x0050, B:21:0x0065, B:26:0x0076, B:28:0x0080, B:33:0x0091, B:35:0x009b, B:40:0x00ae, B:42:0x00b8, B:44:0x00c0, B:39:0x00a6, B:32:0x008b, B:25:0x0070), top: B:50:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8 A[Catch: Throwable -> 0x00d5, TryCatch #0 {Throwable -> 0x00d5, blocks: (B:15:0x003e, B:17:0x0048, B:19:0x0050, B:21:0x0065, B:26:0x0076, B:28:0x0080, B:33:0x0091, B:35:0x009b, B:40:0x00ae, B:42:0x00b8, B:44:0x00c0, B:39:0x00a6, B:32:0x008b, B:25:0x0070), top: B:50:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.alipay.mobile.common.transportext.biz.diagnose.network.SpeedTestLinkData> convertLinkData(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.SpeedTestManager.convertLinkData(java.lang.String):java.util.List");
    }

    public void register(NetworkDiagnoseManager.ResultCount resultCount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7565437b", new Object[]{this, resultCount});
        } else if (resultCount == null) {
        } else {
            this.c = resultCount;
        }
    }

    public void register(DiagnoseStateManager diagnoseStateManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772af310", new Object[]{this, diagnoseStateManager});
        } else if (diagnoseStateManager == null) {
        } else {
            this.b = diagnoseStateManager;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0080 A[Catch: Throwable -> 0x00db, TryCatch #0 {Throwable -> 0x00db, blocks: (B:18:0x0047, B:21:0x0056, B:23:0x005c, B:25:0x0064, B:27:0x0068, B:35:0x007a, B:37:0x0080, B:39:0x00be, B:41:0x00c4, B:43:0x00cc, B:45:0x00d0, B:32:0x0074, B:33:0x0077), top: B:53:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.mobile.common.transportext.biz.diagnose.network.SpeedTestLinkData diagnoseByLink(java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transportext.biz.diagnose.network.SpeedTestManager.diagnoseByLink(java.lang.String, boolean):com.alipay.mobile.common.transportext.biz.diagnose.network.SpeedTestLinkData");
    }

    public boolean diagnose(Configuration.DetectInf detectInf) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efb1ca75", new Object[]{this, detectInf})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        LogCatUtil.info("DIAGNOSE-SPEEDTESTMANAGER", "[diagnose]detectInf begin.");
        if (detectInf == null) {
            LogCatUtil.warn("DIAGNOSE-SPEEDTESTMANAGER", "[diagnose] dectectInf is null.");
            a(true, false, false, "[diagnose] dectectInf is null.");
            return false;
        }
        if (1 != detectInf.protocol) {
            z = false;
        }
        Configuration.Address sysProxy = NetworkDiagnoseUtil.sysProxy(null, z);
        boolean start = new Link(detectInf, this.b, null).start();
        if (sysProxy != null) {
            Link link = new Link(detectInf, this.b, sysProxy);
            NetworkDiagnoseManager.ResultCount resultCount = this.c;
            if (resultCount != null) {
                resultCount.addTotal();
            }
            start |= link.start();
        }
        AlipayQosService.getInstance().estimate(start ? System.currentTimeMillis() - currentTimeMillis : 5000.0d, (byte) 3);
        return start;
    }

    private void a(boolean z, boolean z2, boolean z3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556bc9b6", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), str});
        } else if (this.b == null) {
        } else {
            if (str != null) {
                str = "out_diago:" + str;
            }
            this.b.report(z, z2, z3, str);
        }
    }
}
