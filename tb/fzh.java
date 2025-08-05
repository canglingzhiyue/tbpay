package tb;

import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fzh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-915534886);
    }

    public static boolean a(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3af19a", new Object[]{view, new Float(f)})).booleanValue();
        }
        if (view != null && view.isShown()) {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            int height = globalVisibleRect ? rect.height() : 0;
            int width = globalVisibleRect ? rect.width() : 0;
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            if ((measuredHeight == 0 ? measuredHeight : height / measuredHeight) >= f) {
                if ((measuredWidth == 0 ? measuredWidth : width / measuredWidth) >= f) {
                    return true;
                }
            }
        }
        return false;
    }
}
