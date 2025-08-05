package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ipu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Toast f29222a;

    static {
        kge.a(-1147247317);
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95562904", new Object[]{context, charSequence});
        } else if (TextUtils.isEmpty(charSequence)) {
        } else {
            Toast toast = f29222a;
            if (toast == null) {
                f29222a = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            } else {
                toast.setText(charSequence);
            }
            f29222a.show();
        }
    }
}
