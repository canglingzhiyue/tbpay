package com.alibaba.android.ultron.event;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.kge;

/* loaded from: classes2.dex */
public class e extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(917787947);
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) eVar.a().getSystemService("input_method");
            Activity activity = (Activity) eVar.a();
            if (inputMethodManager == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
            activity.getCurrentFocus().clearFocus();
        } catch (Exception e) {
            e.printStackTrace();
            UnifyLog.a(eVar.h().g(), "CommonHideKeyboardSubscriber", "hide keyboard error", new String[0]);
        }
    }
}
