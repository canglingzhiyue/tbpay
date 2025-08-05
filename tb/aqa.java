package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class aqa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1161795539);
    }

    public static void a(SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d35d43", new Object[]{editor});
        } else {
            editor.apply();
        }
    }
}
