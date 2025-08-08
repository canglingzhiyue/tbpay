package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class kim {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Toast f30100a;

    @Deprecated
    public static synchronized void a(Context context, CharSequence charSequence) {
        synchronized (kim.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95562904", new Object[]{context, charSequence});
            } else if (StringUtils.isEmpty(charSequence)) {
            } else {
                if (f30100a == null) {
                    f30100a = Toast.makeText(context, charSequence, 0);
                } else {
                    f30100a.setText(charSequence);
                }
                f30100a.show();
            }
        }
    }

    public static void a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f990c", new Object[]{charSequence});
        } else {
            a(Globals.getApplication(), charSequence);
        }
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else {
            a(Globals.getApplication().getResources().getString(i));
        }
    }

    public static synchronized void a() {
        synchronized (kim.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            if (f30100a != null) {
                f30100a.cancel();
                f30100a = null;
            }
        }
    }
}
