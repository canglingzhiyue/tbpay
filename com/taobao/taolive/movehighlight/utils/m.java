package com.taobao.taolive.movehighlight.utils;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Toast f21483a;

    static {
        kge.a(606548520);
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95562904", new Object[]{context, charSequence});
        } else if (context == null || StringUtils.isEmpty(charSequence)) {
        } else {
            Toast toast = f21483a;
            if (toast == null) {
                f21483a = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            } else {
                toast.setText(charSequence);
            }
            f21483a.setGravity(17, 0, 0);
            f21483a.show();
        }
    }
}
