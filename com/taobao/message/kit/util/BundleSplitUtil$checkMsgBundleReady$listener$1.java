package com.taobao.message.kit.util;

import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.splitinstall.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleListing;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.ruk;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/message/kit/util/BundleSplitUtil$checkMsgBundleReady$listener$1", "Lcom/alibaba/android/split/core/splitinstall/SplitInstallStateUpdatedListener;", "onStateUpdate", "", "state", "Lcom/alibaba/android/split/core/splitinstall/SplitInstallSessionState;", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class BundleSplitUtil$checkMsgBundleReady$listener$1 implements o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ BundleListing.a $bundleInfo;
    public final /* synthetic */ g $manager;
    public final /* synthetic */ rul $onFailure;
    public final /* synthetic */ rul $onProgress;
    public final /* synthetic */ ruk $onSuccess;
    public final /* synthetic */ String $source;
    public final /* synthetic */ long $start;
    public final /* synthetic */ boolean $withInit;

    public BundleSplitUtil$checkMsgBundleReady$listener$1(BundleListing.a aVar, rul rulVar, long j, String str, g gVar, boolean z, ruk rukVar, rul rulVar2) {
        this.$bundleInfo = aVar;
        this.$onProgress = rulVar;
        this.$start = j;
        this.$source = str;
        this.$manager = gVar;
        this.$withInit = z;
        this.$onSuccess = rukVar;
        this.$onFailure = rulVar2;
    }

    @Override // com.alibaba.android.split.core.listener.b
    public void onStateUpdate(m state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f72d846", new Object[]{this, state});
            return;
        }
        q.c(state, "state");
        if (!state.g().contains(this.$bundleInfo.d)) {
            return;
        }
        int b = state.b();
        if (b == 2) {
            TLog.loge(BundleSplitUtil.TAG, "DOWNLOADING:" + state.e() + ';' + state.f());
            rul rulVar = this.$onProgress;
            if (rulVar == null) {
                return;
            }
            rulVar.mo2421invoke(Integer.valueOf(((int) (((float) state.e()) * 0.98f)) + 1));
        } else if (b == 4) {
            TLog.loge(BundleSplitUtil.TAG, "INSTALLING");
        } else if (b != 5) {
            if (b != 6) {
                return;
            }
            TLog.loge(BundleSplitUtil.TAG, "FAILED");
            RemoteMonitorUtil.remoteInstallAlarm$default(RemoteMonitorUtil.INSTANCE, false, this.$source, null, null, 12, null);
            this.$manager.b(this);
            this.$onFailure.mo2421invoke("msg init failed");
        } else {
            TLog.loge(BundleSplitUtil.TAG, "INSTALLED");
            RemoteMonitorUtil.INSTANCE.remoteInstallStat(System.currentTimeMillis() - this.$start, this.$source);
            RemoteMonitorUtil.remoteInstallAlarm$default(RemoteMonitorUtil.INSTANCE, true, this.$source, null, null, 12, null);
            this.$manager.b(this);
            if (this.$withInit) {
                FeatureInitHelper.directInit(new BundleSplitUtil$checkMsgBundleReady$listener$1$onStateUpdate$1(this));
            } else {
                this.$onSuccess.mo2427invoke();
            }
        }
    }
}
