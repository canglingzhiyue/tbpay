package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfigLocal;
import com.taobao.orange.g;
import java.util.Map;
import mtopsdk.common.util.TBSdkLog;

/* loaded from: classes.dex */
public class rxh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f33401a = false;

    /* loaded from: classes.dex */
    public static class a implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.orange.g
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            }
        }
    }

    static {
        try {
            Class.forName("com.taobao.orange.OrangeConfig");
            f33401a = true;
        } catch (Exception unused) {
            TBSdkLog.w("mtopsdk.OrangeAdapter", "load com.taobao.orange.OrangeConfig error,no orange sdk");
            f33401a = false;
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (f33401a) {
            OrangeConfigLocal.getInstance().init(context);
        } else {
            TBSdkLog.w("mtopsdk.OrangeAdapter", "[init] init orange error,no orange sdk");
        }
    }

    public static void a(String[] strArr, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c5bfe8", new Object[]{strArr, aVar});
        } else if (f33401a) {
            OrangeConfigLocal.getInstance().registerListener(strArr, aVar);
        } else {
            TBSdkLog.w("mtopsdk.OrangeAdapter", "[registerListener] registerListener error,no orange sdk");
        }
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (f33401a) {
            return OrangeConfigLocal.getInstance().getConfig(str, str2, str3);
        }
        TBSdkLog.w("mtopsdk.OrangeAdapter", "[getConfig] getConfig error,no orange sdk");
        return str3;
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        if (f33401a) {
            return OrangeConfigLocal.getInstance().getConfigs(str);
        }
        TBSdkLog.w("mtopsdk.OrangeAdapter", "[getConfig] getConfigs by groupName error,no orange sdk");
        return null;
    }
}
