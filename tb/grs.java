package tb;

import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class grs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28419a = false;

    public static boolean a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3afcdd", new Object[]{view, new Integer(i)})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        view.requestFocus();
        f28419a = true;
        return ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, i);
    }

    public static boolean a(View view, ResultReceiver resultReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("802dd044", new Object[]{view, resultReceiver})).booleanValue();
        }
        if (view != null) {
            return ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0, resultReceiver);
        }
        return false;
    }
}
