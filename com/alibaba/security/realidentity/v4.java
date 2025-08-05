package com.alibaba.security.realidentity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.ui.activity.ALBiometricsActivity;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class v4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c542844", new Object[]{context, rPBizConfig});
        } else {
            ALBiometricsActivity.a(context, rPBizConfig);
        }
    }

    public static void a(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f53e474", new Object[]{context, bundle});
        } else if (context == null) {
        } else {
            Intent intent = new Intent();
            intent.setAction(f2.l);
            intent.putExtra("data", bundle);
            h.a(context).a(intent);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            Intent intent = new Intent();
            intent.setAction(f2.k);
            h.a(context).a(intent);
        }
    }
}
