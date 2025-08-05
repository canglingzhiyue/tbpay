package com.taobao.update.apk;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.framework.UpdateRuntime;
import tb.kge;
import tb.rev;
import tb.rfg;
import tb.rfh;
import tb.rfi;
import tb.rfj;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private rev f23370a;

    static {
        kge.a(-2002742551);
    }

    public a() {
        this.f23370a = null;
        try {
            this.f23370a = (rev) com.taobao.update.framework.a.getInstance(rev.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public com.taobao.update.framework.c execute(boolean z, MainUpdateData mainUpdateData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.update.framework.c) ipChange.ipc$dispatch("1d42bec7", new Object[]{this, new Boolean(z), mainUpdateData});
        }
        ApkUpdateContext apkUpdateContext = null;
        try {
            Intent intent = new Intent("app_update_msg");
            intent.putExtra("hasApkUpdate", true);
            UpdateRuntime.getContext().sendBroadcast(intent);
            apkUpdateContext = a(z, mainUpdateData);
            if (this.f23370a != null) {
                this.f23370a.commit("apefficiency");
            }
            if (apkUpdateContext.isForceUpdate() && !apkUpdateContext.isDownloadError) {
                UpdateRuntime.log("UpdateFlowController start to do KillAppProcessor ");
                new rfi().execute(apkUpdateContext);
            }
        } catch (Throwable th) {
            UpdateRuntime.log("do apk update error", th);
        }
        return apkUpdateContext;
    }

    private ApkUpdateContext a(boolean z, MainUpdateData mainUpdateData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApkUpdateContext) ipChange.ipc$dispatch("ee815b0c", new Object[]{this, new Boolean(z), mainUpdateData});
        }
        ApkUpdateContext apkUpdateContext = new ApkUpdateContext();
        apkUpdateContext.context = UpdateRuntime.getContext();
        apkUpdateContext.background = z;
        apkUpdateContext.mainUpdate = mainUpdateData;
        String str = mainUpdateData.version;
        String downloadUrl = mainUpdateData.getDownloadUrl();
        rev revVar = this.f23370a;
        if (revVar != null) {
            revVar.add("apefficiency", true, "revupdate", "", "", str, downloadUrl, 0L, 0L);
        }
        UpdateRuntime.log("UpdateFlowController start to execute in background " + z);
        rfg.getProcessor(rfh.class).execute(apkUpdateContext);
        rev revVar2 = this.f23370a;
        if (revVar2 != null) {
            revVar2.add("apefficiency", apkUpdateContext.success, "disk", String.valueOf(apkUpdateContext.errorCode), apkUpdateContext.errorMsg, str, downloadUrl, 0L, 0L);
        }
        if (!apkUpdateContext.success) {
            UpdateRuntime.log("UpdateFlowController failed to pass EnvCheckProcessor " + apkUpdateContext);
            return apkUpdateContext;
        }
        UpdateRuntime.log("UpdateFlowController start to do apk update ");
        rfg.getProcessor(rfj.class).execute(apkUpdateContext);
        rev revVar3 = this.f23370a;
        if (revVar3 != null) {
            revVar3.add("apefficiency", apkUpdateContext.success, "notifytimes", String.valueOf(apkUpdateContext.errorCode), apkUpdateContext.errorMsg, str, downloadUrl, 0L, 0L);
        }
        if (apkUpdateContext.success) {
            return (apkUpdateContext.isForceUpdate() || apkUpdateContext.notifyPolicy == ApkUpdateContext.NotifyPolicy.DEFAULT) ? c.getInstance().doUpdate(apkUpdateContext, str, downloadUrl) : apkUpdateContext;
        }
        if (apkUpdateContext.exceedUpdateTimes.booleanValue()) {
            UpdateRuntime.log("update check not pass, exceedUpdateTimes=true");
        } else {
            UpdateRuntime.log("update check not pass, exceedUpdateTimes=false");
        }
        UpdateRuntime.log("UpdateFlowController failed to pass NotifyTimesCheckProcessor " + apkUpdateContext);
        return apkUpdateContext;
    }
}
