package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import tb.rxh;

/* loaded from: classes.dex */
public class rxi extends rxh.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f33402a = new AtomicBoolean(false);

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!this.f33402a.compareAndSet(false, true)) {
        } else {
            RemoteConfig.getInstance().loadLocalConfig(context);
            rxj a2 = rxj.a();
            a2.c();
            a2.e();
            a2.f();
            a2.k();
            a2.g();
            a2.d();
            a2.j();
            a2.l();
            a2.m();
        }
    }

    @Override // tb.rxh.a, com.taobao.orange.g
    public void onConfigUpdate(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("[onConfigUpdate] groupName=");
            sb.append(str);
            sb.append(",fromCache=");
            sb.append(z);
            TBSdkLog.i("mtopsdk.SwitchConfigListener", sb.toString());
        }
        MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: tb.rxi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    RemoteConfig.getInstance().updateRemoteConfig();
                    rxj a2 = rxj.a();
                    a2.b();
                    a2.h();
                    a2.i();
                    a2.c();
                    a2.e();
                    a2.f();
                    a2.k();
                    a2.g();
                    a2.d();
                    a2.j();
                    a2.l();
                    a2.m();
                } catch (Exception e) {
                    TBSdkLog.e("mtopsdk.SwitchConfigListener", "[onConfigUpdate] parse SdkSwitchConfigBroadcast error.", e);
                }
            }
        });
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i("mtopsdk.SwitchConfigListener", "[onConfigUpdate]submit parseSdkSwitchConfigBroadcast task to ThreadPool");
    }
}
