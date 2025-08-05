package android.taobao.safemode;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;

/* loaded from: classes.dex */
public class g implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long CRITICAL_DURATION_MILLS = 15000;

    /* renamed from: a  reason: collision with root package name */
    private Context f1528a;
    private String b;

    public g(Context context, String str) {
        this.f1528a = context;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0179  */
    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.Object> onJvmUncaughtCrash(java.lang.Thread r9, java.lang.Throwable r10) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.safemode.g.onJvmUncaughtCrash(java.lang.Thread, java.lang.Throwable):java.util.Map");
    }
}
