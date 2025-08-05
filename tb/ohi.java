package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ohi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Toast f32061a;

    static {
        kge.a(2110038702);
    }

    public static /* synthetic */ Toast a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Toast) ipChange.ipc$dispatch("396bb401", new Object[0]) : f32061a;
    }

    public static /* synthetic */ Toast a(Toast toast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toast) ipChange.ipc$dispatch("8f72a40e", new Object[]{toast});
        }
        f32061a = toast;
        return toast;
    }

    public static void a(final Context context, final CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95562904", new Object[]{context, charSequence});
        } else if (TextUtils.isEmpty(charSequence)) {
        } else {
            oec.a(new Runnable() { // from class: tb.ohi.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (ohi.a() == null) {
                        ohi.a(Toast.makeText(context.getApplicationContext(), charSequence, 0));
                    } else {
                        ohi.a().setText(charSequence);
                    }
                    ohi.a().show();
                }
            }, true);
        }
    }
}
