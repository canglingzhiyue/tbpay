package com.alipay.mobile.verifyidentity.data;

import android.os.Bundle;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId;
import com.alipay.mobile.verifyidentity.callback.VerifyIdentityListener;
import com.alipay.mobile.verifyidentity.common.VerifyType;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannel;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class VerifyIdentityTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static long TASK_TIMEOUT = 10000;
    private String b;
    public String bizId;
    public String bizRequestData;
    private String c;
    private String d;
    private VerifyIdentityListener e;
    public String entryModuleData;
    public String entryModuleName;
    public String gwUrl;
    private Bundle h;
    private VerifyType i;
    public boolean isIPay;
    public boolean isLoginRPC;
    private String j;
    private VIListenerByVerifyId k;
    private VIMessageChannel l;
    public boolean resetCookie;
    public String sceneId;

    /* renamed from: a  reason: collision with root package name */
    private final String f5861a = VerifyIdentityTask.class.getSimpleName();
    private TaskStatus f = TaskStatus.WAIT;
    private long g = SystemClock.elapsedRealtime();
    public boolean needReportEnvInfo = true;
    public long taskPrepareStartTime = -1;
    public long taskPrepareEndTime = -1;
    public long initRpcStartTime = SystemClock.elapsedRealtime();
    public long initRpcEndTime = SystemClock.elapsedRealtime();
    public long mTaskStartTime = SystemClock.elapsedRealtime();
    public boolean isDynamicMode = false;
    private boolean m = false;
    public boolean canNotUseRpcChannel = false;
    public boolean showEngineError = false;
    public boolean isMultiTaskEnabled = false;
    public boolean canMultiTaskEnableOnPoP = false;
    public String nextProVid = "";

    /* loaded from: classes3.dex */
    public enum TaskStatus {
        WAIT,
        RUN,
        OVER
    }

    public void setToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99ac208", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String getToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a592a696", new Object[]{this}) : this.b;
    }

    public void setModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d5f6ea", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String getModuleName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this}) : this.c;
    }

    public void setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this}) : this.d;
    }

    public void setListener(VerifyIdentityListener verifyIdentityListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfc8739", new Object[]{this, verifyIdentityListener});
        } else {
            this.e = verifyIdentityListener;
        }
    }

    public VerifyIdentityListener getListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VerifyIdentityListener) ipChange.ipc$dispatch("b5795781", new Object[]{this}) : this.e;
    }

    public synchronized void setTaskStatus(TaskStatus taskStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a92045", new Object[]{this, taskStatus});
        } else {
            this.f = taskStatus;
        }
    }

    public synchronized TaskStatus getTaskStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskStatus) ipChange.ipc$dispatch("55a460e9", new Object[]{this});
        }
        return this.f;
    }

    public void setTaskCreateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43ce86cd", new Object[]{this, new Long(j)});
        } else {
            this.g = j;
        }
    }

    public long getTaskCreateTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("186fc8bf", new Object[]{this})).longValue() : this.g;
    }

    public void setExtParams(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b51a88", new Object[]{this, bundle});
            return;
        }
        this.h = bundle;
        Bundle bundle2 = this.h;
        if (bundle2 == null) {
            return;
        }
        String string = bundle2.getString("gwUrl");
        if (!StringUtils.isEmpty(string)) {
            String str = this.f5861a;
            VerifyLogCat.i(str, "外部注入了网关: " + string);
            this.gwUrl = string;
        }
        if (this.h.getBoolean("resetCookie", false)) {
            VerifyLogCat.i(this.f5861a, "resetCookie: true");
            this.resetCookie = true;
        }
        if (this.h.getBoolean("isLoginRPC", false)) {
            VerifyLogCat.i(this.f5861a, "isLoginRPC: true");
            this.isLoginRPC = true;
        }
        String string2 = this.h.getString("VIE_envType");
        if (!StringUtils.isEmpty(string2)) {
            MicroModuleContext.getInstance().setEnvType(string2);
        }
        if ("Y".equalsIgnoreCase(this.h.getString("VIE_useBird"))) {
            this.isDynamicMode = true;
        } else {
            this.isDynamicMode = false;
        }
        if (this.h.getBoolean(VIFBPluginManager.KEY_IS_PLUGIN_MODE)) {
            VerifyLogCat.i(this.f5861a, "本次校验为插件模式");
            this.m = true;
        }
        if (!this.h.containsKey("showEngineError")) {
            return;
        }
        this.showEngineError = Boolean.valueOf(String.valueOf(this.h.get("showEngineError"))).booleanValue();
        String str2 = this.f5861a;
        VerifyLogCat.i(str2, "showEngineError: " + this.showEngineError);
    }

    public Bundle getExtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("d78bef1c", new Object[]{this}) : this.h;
    }

    public void setVerifyId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e861b407", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public String getVerifyId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8b1b04f", new Object[]{this}) : this.j;
    }

    public void setVidListener(VIListenerByVerifyId vIListenerByVerifyId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c38ebf", new Object[]{this, vIListenerByVerifyId});
        } else {
            this.k = vIListenerByVerifyId;
        }
    }

    public VIListenerByVerifyId getVidListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VIListenerByVerifyId) ipChange.ipc$dispatch("69bd7b75", new Object[]{this}) : this.k;
    }

    public VIMessageChannel getVIMessageChannel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VIMessageChannel) ipChange.ipc$dispatch("31008be1", new Object[]{this}) : this.l;
    }

    public void setVIMessageChannel(VIMessageChannel vIMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b16ea0d", new Object[]{this, vIMessageChannel});
            return;
        }
        this.l = vIMessageChannel;
        if (vIMessageChannel == null) {
            return;
        }
        this.m = true;
    }

    public void setEntryModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("872c4bb8", new Object[]{this, str});
        } else {
            this.entryModuleName = str;
        }
    }

    public void setEntryModuleData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff38f97", new Object[]{this, str});
        } else {
            this.entryModuleData = str;
        }
    }

    public VerifyType getVerifyType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VerifyType) ipChange.ipc$dispatch("511e0c40", new Object[]{this}) : this.i;
    }

    public void setVerifyType(VerifyType verifyType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f090d6", new Object[]{this, verifyType});
        } else {
            this.i = verifyType;
        }
    }

    public boolean getPluginOrProxyMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9158eb0", new Object[]{this})).booleanValue() : this.m;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (SystemClock.elapsedRealtime() - this.taskPrepareStartTime <= 2100000) {
            return false;
        }
        VerifyLogCat.i(this.f5861a, "当前多实例任务已超时");
        return true;
    }

    public boolean keepOnMultiMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40e27b23", new Object[]{this})).booleanValue();
        }
        boolean z = !a() && this.canMultiTaskEnableOnPoP;
        if ((!this.isMultiTaskEnabled || a() || getPluginOrProxyMode()) && !z) {
            return false;
        }
        String str = this.f5861a;
        VerifyLogCat.i(str, "多实例任务不清理 " + getVerifyId());
        return true;
    }

    public String getCompatibleVerifyType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6596f55c", new Object[]{this});
        }
        VerifyType verifyType = this.i;
        return (verifyType == null || verifyType.equals(VerifyType.VERIFYID) || this.i.equals(VerifyType.TOKEN)) ? "standard" : this.i.equals(VerifyType.FAST_INIT) ? "verify_init" : this.i.equals(VerifyType.FAST_DIRECT) ? "verify_module" : "";
    }
}
