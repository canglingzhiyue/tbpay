package com.taobao.android.layoutmanager.adapter.impl.tbtheme;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f13148a;

    static {
        kge.a(-1022589629);
    }

    public static boolean a(Context context) {
        Resources resources;
        Configuration configuration;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return (!(context instanceof Activity) || !((Activity) context).isFinishing()) && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && (configuration.uiMode & 48) == 32;
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        a();
        return f13148a.a(i, i2);
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f13148a != null) {
        } else {
            synchronized (f.class) {
                if (f13148a != null) {
                    return;
                }
                f13148a = new e();
            }
        }
    }
}
