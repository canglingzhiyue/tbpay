package com.alipay.android.msp.framework.helper;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class VibrateHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile VibrateHelper f4793a;
    private Vibrator b;

    private VibrateHelper() {
    }

    public static VibrateHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VibrateHelper) ipChange.ipc$dispatch("f3dae91a", new Object[0]);
        }
        if (f4793a == null) {
            synchronized (GlobalHelper.class) {
                if (f4793a == null) {
                    f4793a = new VibrateHelper();
                }
            }
        }
        return f4793a;
    }

    public void init(Context context) {
        Context applicationContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.b = (Vibrator) applicationContext.getSystemService("vibrator");
            if (checkoutInvalid()) {
                throw new IllegalStateException("System does not have a Vibrator, or the permission is disabled.");
            }
            return;
        }
        LogUtil.record(2, "vibrator::init", "系统版本小于5.0，无法使用震动功能");
    }

    public boolean checkoutInvalid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("995d15dc", new Object[]{this})).booleanValue();
        }
        Vibrator vibrator = this.b;
        return vibrator == null || !vibrator.hasVibrator();
    }

    public void vibrate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed5aa76", new Object[]{this});
        } else {
            vibrate(500L);
        }
    }

    public void vibrate(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be01b0e", new Object[]{this, new Long(j)});
        } else {
            vibrate(j, -1);
        }
    }

    public void vibrate(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5023b9b5", new Object[]{this, new Long(j), new Integer(i)});
        } else if (checkoutInvalid()) {
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                if (i == -1) {
                    i = -1;
                }
                if (this.b.hasAmplitudeControl()) {
                    this.b.vibrate(VibrationEffect.createOneShot(j, i));
                    return;
                } else {
                    this.b.vibrate(VibrationEffect.createOneShot(j, -1));
                    return;
                }
            }
            this.b.vibrate(j);
        }
    }

    public void vibrate(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502b77c5", new Object[]{this, jArr});
        } else {
            vibrate(jArr, (int[]) null);
        }
    }

    public void vibrate(long[] jArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3432993", new Object[]{this, jArr, iArr});
        } else if (checkoutInvalid()) {
        } else {
            if (Build.VERSION.SDK_INT < 26) {
                this.b.vibrate(jArr, -1);
            } else if (iArr != null) {
                this.b.vibrate(VibrationEffect.createWaveform(jArr, iArr, -1));
            } else {
                this.b.vibrate(VibrationEffect.createWaveform(jArr, -1));
            }
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (checkoutInvalid()) {
        } else {
            this.b.cancel();
        }
    }
}
