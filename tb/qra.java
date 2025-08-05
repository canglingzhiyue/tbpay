package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.e;

/* loaded from: classes6.dex */
public class qra {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-188502958);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = e.a();
        if (a2 == null) {
            return true;
        }
        return Boolean.parseBoolean(a2.a("android_sku", "enableMainMtopApi", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = e.a();
        if (a2 == null) {
            return true;
        }
        return Boolean.parseBoolean(a2.a("android_sku", "enableHideLightOffOnDowngrade", "true"));
    }
}
