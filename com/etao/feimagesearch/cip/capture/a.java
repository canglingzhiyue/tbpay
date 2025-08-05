package com.etao.feimagesearch.cip.capture;

import android.app.Activity;
import android.content.DialogInterface;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ab;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-769334112);
    }

    public static void a(Activity activity, String str, final DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4b5949", new Object[]{activity, str, onClickListener});
        } else if (activity == null || activity.isFinishing()) {
        } else {
            ab.a(activity, b.a(R.string.taobao_app_1007_prompt), str, b.a(R.string.taobao_app_1007_confirm), new DialogInterface.OnClickListener() { // from class: com.etao.feimagesearch.cip.capture.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    DialogInterface.OnClickListener onClickListener2 = onClickListener;
                    if (onClickListener2 == null) {
                        return;
                    }
                    onClickListener2.onClick(dialogInterface, i);
                }
            }, "", null);
        }
    }
}
