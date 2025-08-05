package com.taobao.message.kit.util;

import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/taobao/message/kit/util/BundleSplitUtil$checkClazzReady$1", "Lcom/alibaba/flexa/compat/FlexaClass$ClassLoadedCallBack;", "onClassLoaded", "", "aClass", "Ljava/lang/Class;", "onClassNotFound", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class BundleSplitUtil$checkClazzReady$1 implements c.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $clazzName;
    public final /* synthetic */ rul $onFailure;
    public final /* synthetic */ rul $onSuccess;
    public final /* synthetic */ long $start;
    public final /* synthetic */ boolean $withInit;

    public BundleSplitUtil$checkClazzReady$1(long j, String str, boolean z, rul rulVar, rul rulVar2) {
        this.$start = j;
        this.$clazzName = str;
        this.$withInit = z;
        this.$onSuccess = rulVar;
        this.$onFailure = rulVar2;
    }

    @Override // com.alibaba.flexa.compat.c.a
    public void onClassLoaded(Class<?> aClass) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ad6f018", new Object[]{this, aClass});
            return;
        }
        q.c(aClass, "aClass");
        RemoteMonitorUtil remoteMonitorUtil = RemoteMonitorUtil.INSTANCE;
        long currentTimeMillis = System.currentTimeMillis() - this.$start;
        String cls = aClass.toString();
        q.a((Object) cls, "aClass.toString()");
        remoteMonitorUtil.remoteClazzStat(currentTimeMillis, cls);
        RemoteMonitorUtil.remoteClazzAlarm$default(RemoteMonitorUtil.INSTANCE, true, this.$clazzName, null, null, 12, null);
        TLog.loge(BundleSplitUtil.TAG, "onClassLoaded" + aClass);
        if (this.$withInit) {
            FeatureInitHelper.directInit(new BundleSplitUtil$checkClazzReady$1$onClassLoaded$1(this, aClass));
        } else {
            this.$onSuccess.mo2421invoke(aClass);
        }
    }

    @Override // com.alibaba.flexa.compat.c.a
    public void onClassNotFound() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            return;
        }
        RemoteMonitorUtil.remoteClazzAlarm$default(RemoteMonitorUtil.INSTANCE, false, this.$clazzName, null, null, 12, null);
        TLog.loge(BundleSplitUtil.TAG, "onClassNotFound");
        rul rulVar = this.$onFailure;
        rulVar.mo2421invoke("onClassNotFound" + this.$clazzName);
    }
}
