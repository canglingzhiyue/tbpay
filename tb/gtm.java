package tb;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public final class gtm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Intent a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("11ab37a9", new Object[]{context, str});
        }
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setAction(str);
        return intent;
    }
}
