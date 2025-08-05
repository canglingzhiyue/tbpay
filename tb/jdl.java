package tb;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.android.tbtheme.kit.g;

/* loaded from: classes6.dex */
public class jdl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(504491088);
    }

    public static void a(ThemeFrameLayout themeFrameLayout, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c5e273", new Object[]{themeFrameLayout, gVar});
            return;
        }
        TextView textView = new TextView(themeFrameLayout.getContext());
        textView.setText("taobaoTheme,biz=" + gVar.f15437a + "height=" + gVar.c);
        textView.setTextColor(858993459);
        themeFrameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
    }
}
