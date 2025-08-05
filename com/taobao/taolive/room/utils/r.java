package com.taobao.taolive.room.utils;

import android.app.Activity;
import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.plx;

/* loaded from: classes8.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f21775a;

    static {
        kge.a(1219245676);
        f21775a = false;
    }

    public static boolean a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3afcdd", new Object[]{view, new Integer(i)})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        try {
            view.requestFocus();
            f21775a = true;
            return ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, i);
        } catch (Exception e) {
            f21775a = false;
            plx.b("KeyboardUtils", "showKeyboard exp = " + e.getMessage());
            return false;
        }
    }

    public static boolean a(View view, ResultReceiver resultReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("802dd044", new Object[]{view, resultReceiver})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        f21775a = false;
        return ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0, resultReceiver);
    }

    public static boolean a(Activity activity, ResultReceiver resultReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ede9bf4", new Object[]{activity, resultReceiver})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        f21775a = false;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        } else {
            currentFocus = new View(activity);
        }
        return ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0, resultReceiver);
    }
}
