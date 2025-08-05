package com.taobao.android.litecreator.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class as {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-45519879);
    }

    public static boolean a(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("628634dc", new Object[]{activity, view})).booleanValue();
        }
        if (activity != null && view != null) {
            int b = ap.b((Context) activity) + ap.d((Context) activity);
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            if (rect.bottom <= b * 0.75f) {
                return true;
            }
        }
        return false;
    }

    public static final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        view.requestFocus();
        inputMethodManager.showSoftInput(view, 0);
    }

    public static final void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{view});
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void a(Context context) {
        InputMethodManager inputMethodManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null || (inputMethodManager = (InputMethodManager) context.getApplicationContext().getSystemService("input_method")) == null) {
        } else {
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }
}
