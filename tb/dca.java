package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import org.android.agoo.honor.HonorRegister;
import org.android.agoo.huawei.HuaWeiRegister;
import org.android.agoo.mezu.MeizuRegister;
import org.android.agoo.oppo.OppoRegister;
import org.android.agoo.vivo.VivoRegister;
import org.android.agoo.xiaomi.MiPushRegistar;

/* loaded from: classes4.dex */
public class dca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(348827413);
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        ALog.e("VendorPush", "init VendorPush start", new Object[0]);
        try {
            if (a()) {
                b(application);
            } else {
                c(application);
            }
        } catch (Throwable th) {
            ALog.e("VendorPush", "init push err", th, new Object[0]);
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : HuaWeiRegister.checkDevice();
    }

    private static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{application});
            return;
        }
        ALog.e("VendorPush", "initHuaWei", new Object[0]);
        if (a((Context) application)) {
            ALog.e("VendorPush", "honor is available", new Object[0]);
            try {
                HonorRegister.registerBundle(application);
                return;
            } catch (Throwable th) {
                ALog.e("VendorPush", "HonorRegister err", th, new Object[0]);
            }
        }
        ALog.e("VendorPush", "register huawei start", new Object[0]);
        try {
            HuaWeiRegister.registerBundle(application, true);
        } catch (Throwable th2) {
            ALog.e("VendorPush", "HuaWeiRegister err", th2, new Object[0]);
        }
    }

    private static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : HonorRegister.isSupport(context);
    }

    private static void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771ec6b5", new Object[]{application});
            return;
        }
        ALog.e("VendorPush", "initXiaoMi", new Object[0]);
        try {
            MiPushRegistar.register(application, "2882303761517135997", "5491713541997");
            OppoRegister.register(application, "X4PFm4rhiaASckCkqYSIIqA1", "6ZHzxPVPl2kLpMF8Ht2gmmfc");
            MeizuRegister.register(application, "111373", "9c3cf30192a540eebbca03572d877ac5");
            VivoRegister.register(application);
        } catch (Throwable th) {
            ALog.e("VendorPush", "init XiaoMiPush", th, new Object[0]);
        }
    }
}
