package com.taobao.accs.ut.monitor;

import anet.channel.statist.Dimension;
import anet.channel.statist.Monitor;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.init.Launcher_InitPush;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import tb.kge;

@Monitor(module = "accs", monitorPoint = "manufacturer")
/* loaded from: classes.dex */
public class ManuMonitor extends BaseMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ManuMonitor";
    @Dimension
    public boolean abort;
    @Dimension
    public boolean hasInitialized;
    @Dimension
    public boolean isAgooControlCmd;
    @Dimension
    public boolean isDeviceSupport;
    @Dimension
    public boolean isTokenEmpty;
    @Dimension
    public boolean result;

    static {
        kge.a(-395317692);
    }

    public static /* synthetic */ Object ipc$super(ManuMonitor manuMonitor, String str, Object... objArr) {
        if (str.hashCode() == 358433569) {
            return new Boolean(super.beforeCommit());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ManuMonitor() {
        this.isTokenEmpty = true;
        this.hasInitialized = false;
        this.isAgooControlCmd = false;
        this.isDeviceSupport = true;
        this.isDeviceSupport = Launcher_InitPush.isSupportPush();
    }

    public ManuMonitor(boolean z) {
        this.isTokenEmpty = true;
        this.hasInitialized = false;
        this.isAgooControlCmd = false;
        this.isDeviceSupport = true;
        this.abort = z;
    }

    @Override // com.taobao.accs.utl.BaseMonitor, anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue();
        }
        ALog.e(TAG, "manufacturer_monitor", "isTokenEmpty", Boolean.valueOf(this.isTokenEmpty), BaseFBPlugin.VERIFY_STATUS.abort, Boolean.valueOf(this.abort), "result", Boolean.valueOf(this.result), "hasInitialized", Boolean.valueOf(this.hasInitialized));
        return super.beforeCommit();
    }
}
