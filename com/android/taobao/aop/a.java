package com.android.taobao.aop;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-882039572);
    }

    public static PendingIntent a(Context context, int i, Intent intent, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("b871594f", new Object[]{context, new Integer(i), intent, new Integer(i2)});
        }
        boolean z2 = (i2 & 67108864) != 0;
        if ((33554432 & i2) == 0) {
            z = false;
        }
        if (!z && !z2) {
            if (Build.VERSION.SDK_INT > 30) {
                return PendingIntent.getActivity(context, i, intent, i2 | 67108864);
            }
            return PendingIntent.getActivity(context, i, intent, i2);
        }
        return PendingIntent.getActivity(context, i, intent, i2);
    }

    public static PendingIntent a(Context context, int i, Intent[] intentArr, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("f89feb40", new Object[]{context, new Integer(i), intentArr, new Integer(i2)});
        }
        boolean z2 = (i2 & 67108864) != 0;
        if ((33554432 & i2) == 0) {
            z = false;
        }
        if (!z && !z2) {
            if (Build.VERSION.SDK_INT > 30) {
                return PendingIntent.getActivities(context, i, intentArr, i2 | 67108864);
            }
            return PendingIntent.getActivities(context, i, intentArr, i2);
        }
        return PendingIntent.getActivities(context, i, intentArr, i2);
    }

    public static PendingIntent a(Context context, int i, Intent[] intentArr, int i2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("c9bf32ec", new Object[]{context, new Integer(i), intentArr, new Integer(i2), bundle});
        }
        boolean z2 = (i2 & 67108864) != 0;
        if ((33554432 & i2) == 0) {
            z = false;
        }
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        if (!z && !z2) {
            if (Build.VERSION.SDK_INT > 30) {
                return PendingIntent.getActivities(context, i, intentArr, i2 | 67108864, bundle);
            }
            return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
        }
        return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
    }

    public static PendingIntent b(Context context, int i, Intent intent, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("e722c36e", new Object[]{context, new Integer(i), intent, new Integer(i2)});
        }
        boolean z2 = (i2 & 67108864) != 0;
        if ((33554432 & i2) == 0) {
            z = false;
        }
        if (!z && !z2) {
            if (Build.VERSION.SDK_INT > 30) {
                return PendingIntent.getBroadcast(context, i, intent, i2 | 67108864);
            }
            return PendingIntent.getBroadcast(context, i, intent, i2);
        }
        return PendingIntent.getBroadcast(context, i, intent, i2);
    }

    public static PendingIntent c(Context context, int i, Intent intent, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("15d42d8d", new Object[]{context, new Integer(i), intent, new Integer(i2)});
        }
        boolean z2 = (i2 & 67108864) != 0;
        if ((33554432 & i2) == 0) {
            z = false;
        }
        if (!z && !z2) {
            if (Build.VERSION.SDK_INT > 30) {
                return PendingIntent.getService(context, i, intent, i2 | 67108864);
            }
            return PendingIntent.getService(context, i, intent, i2);
        }
        return PendingIntent.getService(context, i, intent, i2);
    }
}
