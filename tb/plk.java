package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class plk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Toast f32753a;
    private static Toast b;

    static {
        kge.a(1504515299);
    }

    public static void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
        } else if (context == null || i == 0) {
        } else {
            a(context, context.getResources().getString(i));
        }
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95562904", new Object[]{context, charSequence});
        } else if (context == null || StringUtils.isEmpty(charSequence)) {
        } else {
            Toast toast = f32753a;
            if (toast == null) {
                f32753a = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            } else {
                toast.setText(charSequence);
            }
            f32753a.setGravity(17, 0, 0);
            f32753a.show();
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        Toast toast = f32753a;
        if (toast != null) {
            toast.cancel();
            f32753a = null;
        }
        Toast toast2 = b;
        if (toast2 == null) {
            return;
        }
        toast2.cancel();
        b = null;
    }
}
