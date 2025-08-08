package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.d;

/* loaded from: classes5.dex */
public class hgt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Toast f28639a;
    private static Toast b;

    static {
        kge.a(1068584624);
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95562904", new Object[]{context, charSequence});
        } else if (context == null || StringUtils.isEmpty(charSequence)) {
        } else {
            Toast toast = f28639a;
            if (toast == null) {
                f28639a = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            } else {
                toast.setText(charSequence);
            }
            f28639a.setGravity(17, 0, 0);
            f28639a.show();
        }
    }

    public static void b(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af71a7a3", new Object[]{context, charSequence});
        } else if (context == null || StringUtils.isEmpty(charSequence)) {
        } else {
            if (b == null) {
                b = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            }
            TextView textView = new TextView(context.getApplicationContext());
            textView.setText(charSequence);
            textView.setTextColor(context.getResources().getColor(R.color.white_flexalocal));
            textView.setTextSize(2, 18.0f);
            int a2 = d.a(context, 37.0f);
            textView.setPadding(a2, a2, a2, a2);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            textView.setGravity(17);
            textView.setLineSpacing(d.a(context, 18.0f), 1.0f);
            textView.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.taolive_toast_bg_flexalocal));
            b.setView(textView);
            b.setGravity(17, 0, 0);
            b.show();
        }
    }
}
