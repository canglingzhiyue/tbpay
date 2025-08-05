package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class pov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Toast f32789a;

    static {
        kge.a(-1415545413);
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95562904", new Object[]{context, charSequence});
            return;
        }
        Toast toast = f32789a;
        if (toast != null) {
            toast.cancel();
            f32789a = null;
        }
        if (context == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        Toast makeText = Toast.makeText(context.getApplicationContext(), charSequence, 0);
        f32789a = makeText;
        makeText.show();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        Toast toast = f32789a;
        if (toast == null) {
            return;
        }
        toast.cancel();
        f32789a = null;
    }
}
