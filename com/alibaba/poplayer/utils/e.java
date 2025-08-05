package com.alibaba.poplayer.utils;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f3219a;
    private static int b;

    static {
        kge.a(734931462);
    }

    public static Pair<Integer, Integer> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4b5efeaa", new Object[]{context});
        }
        int i = f3219a;
        if (i > 0 && b > 0) {
            return new Pair<>(Integer.valueOf(i), Integer.valueOf(b));
        }
        if (context != null) {
            Display defaultDisplay = ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            f3219a = point.x;
            b = point.y;
        }
        c.a("ScreenInfo.getScreenSize.mScreenWidth=%s.mScreenHeight=%s", Integer.valueOf(f3219a), Integer.valueOf(b));
        return new Pair<>(Integer.valueOf(f3219a), Integer.valueOf(b));
    }
}
