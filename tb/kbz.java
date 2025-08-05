package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public class kbz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1807057680);
    }

    public static Drawable a(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("26c56e24", new Object[]{str, context}) : context.getResources().getDrawable(R.drawable.dw_bubble_item);
    }
}
