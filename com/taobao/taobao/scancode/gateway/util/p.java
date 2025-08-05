package com.taobao.taobao.scancode.gateway.util;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-508022308);
    }

    public static void a(LayoutInflater layoutInflater, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c026498", new Object[]{layoutInflater, context, str});
        } else if (context == null || layoutInflater == null || TextUtils.isEmpty(str)) {
        } else {
            Toast toast = new Toast(context);
            View inflate = layoutInflater.inflate(R.layout.scancode_gateway_toast, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.content)).setText(str);
            toast.setDuration(1);
            toast.setGravity(17, 0, 0);
            toast.setView(inflate);
            toast.show();
        }
    }
}
