package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class oce {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Toast f31906a;

    static {
        kge.a(18378612);
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95562904", new Object[]{context, charSequence});
        } else if (TextUtils.isEmpty(charSequence)) {
        } else {
            Toast toast = f31906a;
            if (toast == null) {
                f31906a = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            } else {
                toast.setText(charSequence);
            }
            f31906a.show();
        }
    }

    public static void b(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af71a7a3", new Object[]{context, charSequence});
        } else {
            a(context, charSequence, 0);
        }
    }

    public static void a(Context context, CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156f6a7f", new Object[]{context, charSequence, new Integer(i)});
            return;
        }
        Toast makeText = Toast.makeText(context.getApplicationContext(), charSequence, i);
        makeText.setGravity(17, 0, 0);
        View view = makeText.getView();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setGravity(17);
                }
            }
        }
        makeText.show();
    }

    public static void c(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98d2642", new Object[]{context, charSequence});
        } else if (!obu.a(context)) {
        } else {
            a(context, "Debug：" + ((Object) charSequence), 1);
        }
    }
}
