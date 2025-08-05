package com.taobao.vividsocial.utils;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes9.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f23466a;
    private static WeakReference<Activity> b;

    /* loaded from: classes9.dex */
    public static class a extends Pair<WeakReference<Activity>, Integer> {
        static {
            kge.a(1242251853);
        }

        public a(WeakReference<Activity> weakReference, Integer num) {
            super(weakReference, num);
        }
    }

    static {
        kge.a(-806693223);
    }

    public static synchronized void a(Context context) {
        synchronized (g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
                return;
            }
            Activity a2 = i.a(context);
            if (a2 == null) {
                return;
            }
            b = new WeakReference<>(a2);
        }
    }

    public static synchronized void a() {
        synchronized (g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else if (b == null || b.get() == null) {
            } else {
                try {
                    Activity activity = b.get();
                    int i = activity.getWindow().getAttributes().softInputMode;
                    if (i == 48) {
                        return;
                    }
                    f23466a = new a(b, Integer.valueOf(i));
                    activity.getWindow().setSoftInputMode(48);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static synchronized void b() {
        synchronized (g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
            } else if (f23466a == null || f23466a.first == null || ((WeakReference) f23466a.first).get() == null) {
            } else {
                try {
                    ((Activity) ((WeakReference) f23466a.first).get()).getWindow().setSoftInputMode(((Integer) f23466a.second).intValue());
                    f23466a = null;
                } catch (Exception e) {
                    e.printStackTrace();
                    f23466a = null;
                }
            }
        }
    }
}
