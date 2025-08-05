package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.taobao.TBActionBar;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.ultron.trade.utils.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public class ige {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1914371936);
    }

    public static void a(Activity activity, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca5ff9a", new Object[]{activity, new Integer(i), new Integer(i2)});
            return;
        }
        View view = (View) igk.a(activity, i, View.class);
        TextView textView = (TextView) igk.a(activity, i2, TextView.class);
        if (view != null) {
            FestivalMgr.a().a(activity, view, TBActionBar.ActionBarStyle.NORMAL);
            if (!a()) {
                view.setBackgroundColor(-855310);
            }
        }
        if (textView == null || !a()) {
            return;
        }
        textView.setTextColor(a(activity));
        Drawable drawable = activity.getResources().getDrawable(R.drawable.purchase_action_bar_back_light);
        int i3 = (int) (activity.getResources().getDisplayMetrics().density * 24.0f);
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, i3, i3);
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : FestivalMgr.a().a("global");
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue() : FestivalMgr.a().a("actionbarTextColor", b.a("#333333", 3355443));
    }
}
