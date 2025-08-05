package com.taobao.themis.taobao.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.adapter.IBizLaunchAdapter;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpp;
import tb.qpr;
import tb.tls;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/taobao/impl/TMSTBBizLaunchAdapter;", "Lcom/taobao/themis/kernel/adapter/IBizLaunchAdapter;", "()V", "createBizLaunchStep", "Lcom/taobao/themis/kernel/launcher/step/TMSBaseLaunchStep;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "launcher", "Lcom/taobao/themis/kernel/launcher/TMSBaseLauncher;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/launcher/ITMSLaunchListener;", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSTBBizLaunchAdapter implements IBizLaunchAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(182614349);
        kge.a(-918627018);
    }

    @Override // com.taobao.themis.kernel.adapter.IBizLaunchAdapter
    public TMSBaseLaunchStep createBizLaunchStep(com.taobao.themis.kernel.f instance, qpr launcher, qpp listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSBaseLaunchStep) ipChange.ipc$dispatch("b0bdb64d", new Object[]{this, instance, launcher, listener});
        }
        q.d(instance, "instance");
        q.d(launcher, "launcher");
        q.d(listener, "listener");
        return new tls(instance, launcher, listener);
    }
}
