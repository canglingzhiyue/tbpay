package com.etao.feimagesearch.util;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import tb.com;
import tb.kge;

/* loaded from: classes4.dex */
public final class ao {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ao INSTANCE;

    static {
        kge.a(-1623942381);
        INSTANCE = new ao();
    }

    private ao() {
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            Object systemService = com.b().getSystemService("vibrator");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.os.Vibrator");
            }
            Vibrator vibrator = (Vibrator) systemService;
            if (!vibrator.hasVibrator()) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                vibrator.vibrate(VibrationEffect.createOneShot(30L, -1));
            } else {
                vibrator.vibrate(30L);
            }
        } catch (Exception unused) {
        }
    }
}
