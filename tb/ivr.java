package tb;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.LocationCallBack;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public class ivr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(728108199);
    }

    public static void a(TextView textView, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7031af96", new Object[]{textView, imageView});
            return;
        }
        textView.setTypeface(textView.getTypeface(), 1);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.gravity = 3;
        layoutParams.leftMargin = bay.a(53.0f);
        textView.setLayoutParams(layoutParams);
        textView.setText(b.a(R.string.purchase_tbbuy_title));
        imageView.setImageResource(R.drawable.mul_back_icon);
        imageView.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams2.leftMargin = bay.a(15.0f);
        imageView.setLayoutParams(layoutParams2);
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            bbh.a(new Runnable() { // from class: tb.ivr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(LocationCallBack.ACTION_IP_BLACKLIST_CHECK));
                    }
                }
            });
        }
    }
}
