package com.taobao.taolive.room.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class ao {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Toast f21760a;

    static {
        kge.a(-438606680);
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95562904", new Object[]{context, charSequence});
        } else if (context == null || TextUtils.isEmpty(charSequence)) {
        } else {
            Toast toast = f21760a;
            if (toast == null) {
                f21760a = Toast.makeText(context.getApplicationContext(), charSequence, 1);
            } else {
                toast.setText(charSequence);
            }
            f21760a.setGravity(17, 0, 0);
            f21760a.show();
        }
    }
}
