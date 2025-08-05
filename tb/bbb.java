package tb;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1633212210);
    }

    public static void a(View view) {
        InputMethodManager inputMethodManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else if (view == null) {
        } else {
            Context context = view.getContext();
            try {
                View findFocus = view.findFocus();
                if (findFocus == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
                    return;
                }
                inputMethodManager.hideSoftInputFromWindow(findFocus.getWindowToken(), 0);
                findFocus.clearFocus();
            } catch (Exception e) {
                arc.a().c("AURAKeyboardUtil", MspEventTypes.ACTION_STRING_HIDE_KEYBOARD, e.getMessage());
            }
        }
    }
}
