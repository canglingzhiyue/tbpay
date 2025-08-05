package tb;

import android.support.v4.app.DialogFragment;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fgy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-545802211);
        emu.a("com.taobao.android.detail.wrapper.utils.TBDetailFragmentUtils");
    }

    public static boolean a(DialogFragment dialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a357966", new Object[]{dialogFragment})).booleanValue();
        }
        try {
            if (!dialogFragment.isAdded() && !dialogFragment.isVisible() && !dialogFragment.isRemoving()) {
                return dialogFragment.getDialog().getWindow().getDecorView().getVisibility() == 0;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
