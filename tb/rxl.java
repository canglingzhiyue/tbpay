package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import tb.rxh;

/* loaded from: classes.dex */
public class rxl extends rxh.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f33409a = "mtopsdk.UploadSwitchListener";

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
            TBSdkLog.i("mtopsdk.UploadSwitchListener", sb.toString());
        }
        MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: tb.rxl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                RemoteConfig.getInstance().updateUploadRemoteConfig();
                rxk a2 = rxk.a();
                a2.b();
                a2.c();
                a2.d();
            }
        });
        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            return;
        }
        TBSdkLog.i("mtopsdk.UploadSwitchListener", "[onConfigUpdate]submit UploadSwitchConfigBroadcast task to ThreadPool");
    }
}
