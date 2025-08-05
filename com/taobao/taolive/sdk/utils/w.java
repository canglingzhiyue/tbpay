package com.taobao.taolive.sdk.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Toast f21972a;

    static {
        kge.a(-678920239);
    }

    public static void a(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95562904", new Object[]{context, charSequence});
        } else if (context == null || TextUtils.isEmpty(charSequence)) {
        } else {
            Toast toast = f21972a;
            if (toast == null) {
                f21972a = Toast.makeText(context.getApplicationContext(), charSequence, 1);
            } else {
                toast.setText(charSequence);
            }
            f21972a.setGravity(17, 0, 0);
            f21972a.show();
        }
    }
}
