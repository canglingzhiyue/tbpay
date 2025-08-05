package com.network.diagnosis;

import android.content.Context;
import anet.channel.util.ALog;
import anetwork.channel.config.NetworkConfigCenter;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.toolchain.WVNetworkDiagnosisPlugin;
import com.network.diagnosis.toolchain.WVNetworkQualityPlugin;
import com.taobao.uikit.extend.component.TBErrorView;
import tb.cze;

/* loaded from: classes.dex */
public class NetworkDiagnosisCenter implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f8024a = false;
    private Context b;

    @Override // com.network.diagnosis.b
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.f8024a) {
        } else {
            synchronized (this) {
                if (this.f8024a) {
                    ALog.e("NPM.NetworkDiagnosisCenter", "already initialize.", null, new Object[0]);
                    return;
                }
                ALog.e("NPM.NetworkDiagnosisCenter", "initialize", null, new Object[0]);
                this.b = context;
                WVNetworkDiagnosisPlugin.register();
                WVNetworkQualityPlugin.register();
                cze.a(context);
                com.network.diagnosis.model.c.b().a(context);
                try {
                    TBErrorView.setNetworkDiagnosisEnable(NetworkConfigCenter.isNetworkDiagnosisOpened());
                } catch (Exception e) {
                    ALog.e("NPM.NetworkDiagnosisCenter", "init TBErrorView error", null, e, new Object[0]);
                }
                this.f8024a = true;
            }
        }
    }

    @Override // com.network.diagnosis.b
    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8aaca045", new Object[]{this}) : com.network.diagnosis.model.a.a();
    }

    @Override // com.network.diagnosis.b
    public c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b3fc8504", new Object[]{this}) : com.network.diagnosis.model.b.a();
    }

    @Override // com.network.diagnosis.b
    public d c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("dd4c69a4", new Object[]{this}) : com.network.diagnosis.model.c.b();
    }
}
