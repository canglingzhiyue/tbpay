package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class hix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Toast f28698a;
    private static long b;
    private static CharSequence c;

    static {
        kge.a(1824333038);
        b = 0L;
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95562904", new Object[]{context, charSequence});
        } else if (context == null || StringUtils.isEmpty(charSequence)) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (f28698a == null) {
                f28698a = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            } else if (currentTimeMillis - b < 2000 && charSequence.equals(c)) {
                return;
            } else {
                f28698a.setText(charSequence);
            }
            c = charSequence;
            b = currentTimeMillis;
            f28698a.setGravity(17, 0, 0);
            f28698a.show();
        }
    }
}
