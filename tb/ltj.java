package tb;

import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class ltj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1178391648);
    }

    public static Rect a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("13ade933", new Object[]{view});
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight());
    }
}
