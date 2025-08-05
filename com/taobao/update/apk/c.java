package com.taobao.update.apk;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.framework.UpdateRuntime;
import tb.kge;
import tb.rev;
import tb.rfe;
import tb.rff;
import tb.rfk;
import tb.rgq;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private rev f23372a;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f23373a;

        static {
            kge.a(-1771461484);
            f23373a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2dd5ec1c", new Object[0]) : f23373a;
        }
    }

    static {
        kge.a(-1570784548);
    }

    private c() {
        try {
            this.f23372a = (rev) com.taobao.update.framework.a.getInstance(rev.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static c getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ab60fac6", new Object[0]) : a.a();
    }

    public ApkUpdateContext doUpdate(ApkUpdateContext apkUpdateContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApkUpdateContext) ipChange.ipc$dispatch("936edf47", new Object[]{this, apkUpdateContext, str, str2});
        }
        new rfk().execute(apkUpdateContext);
        rev revVar = this.f23372a;
        if (revVar != null) {
            revVar.add("apefficiency", apkUpdateContext.success, "notifydownload", String.valueOf(apkUpdateContext.errorCode), apkUpdateContext.errorMsg, str, str2, 0L, 0L);
        }
        if (!apkUpdateContext.success) {
            UpdateRuntime.log("UpdateFlowController failed to pass NotifyNewApkUpdateProcessor " + apkUpdateContext);
            return apkUpdateContext;
        }
        System.currentTimeMillis();
        new rfe().execute(apkUpdateContext);
        this.f23372a.add("apefficiency", apkUpdateContext.success, "download", String.valueOf(apkUpdateContext.errorCode), apkUpdateContext.errorMsg, str, str2, 0L, System.currentTimeMillis());
        if (!apkUpdateContext.success) {
            UpdateRuntime.log("UpdateFlowController failed to pass ApkDownloadProcessor " + apkUpdateContext);
            apkUpdateContext.isDownloadError = true;
            return apkUpdateContext;
        }
        if (!apkUpdateContext.isDefaultUpdate() || UpdateRuntime.popDialogBeforeInstall || !rgq.isNotificationPermissioned()) {
            UpdateRuntime.log("UpdateFlowController start to do ApkInstallProcessor ");
            new rff().execute(apkUpdateContext);
            this.f23372a.add("apefficiency", apkUpdateContext.success, "notifyinstall", String.valueOf(apkUpdateContext.errorCode), apkUpdateContext.errorMsg, str, str2, 0L, 0L);
        }
        UpdateRuntime.log("UpdateFlowController apk upgrade execute result is " + apkUpdateContext);
        if (!apkUpdateContext.success && TextUtils.isEmpty(apkUpdateContext.errorMsg)) {
            apkUpdateContext.errorMsg = rgq.getAppNameString(R.string.notice_errorupdate, UpdateRuntime.sAppName);
        }
        UpdateRuntime.log("UpdateFlowController update finished with result " + apkUpdateContext);
        return apkUpdateContext;
    }
}
