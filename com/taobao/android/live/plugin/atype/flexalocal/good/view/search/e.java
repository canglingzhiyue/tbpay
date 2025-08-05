package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13888a;

    static {
        kge.a(-1873846585);
        f13888a = false;
    }

    public static boolean a(View view, ResultReceiver resultReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("802dd044", new Object[]{view, resultReceiver})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        f13888a = false;
        return ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0, resultReceiver);
    }

    public static boolean a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3afcdd", new Object[]{view, new Integer(i)})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        view.requestFocus();
        f13888a = true;
        return ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, i);
    }
}
