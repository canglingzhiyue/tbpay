package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;

/* loaded from: classes6.dex */
public class sff {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static sfd f33519a;

    public static void a(jdy jdyVar, jgh jghVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c59ebe", new Object[]{jdyVar, jghVar});
            return;
        }
        f33519a = new sfd(jdyVar, jghVar);
        TCrashSDK.instance().addOnFileCreatedListener(UncaughtCrashType.ALL, f33519a);
        num.a();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        TCrashSDK.instance().removeOnFileCreatedListener(UncaughtCrashType.ALL, f33519a);
        sfd sfdVar = f33519a;
        if (sfdVar != null) {
            sfdVar.a();
        }
        f33519a = null;
        num.c();
    }
}
