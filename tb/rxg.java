package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.common.util.SwitchConfigUtil;
import mtopsdk.common.util.TBSdkLog;

/* loaded from: classes.dex */
public class rxg implements rxe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.rxe
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            rxh.a(context);
            rxi rxiVar = new rxi();
            rxiVar.a(context);
            rxh.a(new String[]{SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_ANDROID_SWITCH}, rxiVar);
            rxh.a(new String[]{SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_UPLOAD_SWITCH}, new rxl());
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("groupNames=[");
            sb.append(SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_ANDROID_SWITCH);
            sb.append(",");
            sb.append(SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_UPLOAD_SWITCH);
            sb.append(riy.ARRAY_END_STR);
            TBSdkLog.i("mtopsdk.MtopConfigOrangeListenerImpl", "[initConfig] initConfig  parameter:" + sb.toString());
        } catch (Throwable th) {
            TBSdkLog.w("mtopsdk.MtopConfigOrangeListenerImpl", "[initConfig] init mtop orange config error", th.toString());
        }
    }

    @Override // tb.rxe
    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        try {
            return rxh.a(str, str2, str3);
        } catch (Throwable unused) {
            return str3;
        }
    }

    @Override // tb.rxe
    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        try {
            return rxh.a(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
