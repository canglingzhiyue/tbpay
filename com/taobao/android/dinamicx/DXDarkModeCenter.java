package com.taobao.android.dinamicx;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes.dex */
public class DXDarkModeCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DRAW_TYPE_BACKGROUND = 1;
    public static final int DRAW_TYPE_TEXT = 0;
    public static final int DRAW_TYPE_UNSPECIFIED = 2;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f11774a;
    public static bi b;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXDrawType {
    }

    static {
        kge.a(1188273013);
    }

    public static boolean a(DXRuntimeContext dXRuntimeContext) {
        DinamicXEngine D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("487cd5dd", new Object[]{dXRuntimeContext})).booleanValue();
        }
        if (dXRuntimeContext != null && (D = dXRuntimeContext.D()) != null && D.S() != null) {
            Context m = dXRuntimeContext.m();
            bi S = D.S();
            if (m == null) {
                m = DinamicXEngine.i();
            }
            return S.a(m);
        } else if (c()) {
            return b.a(DinamicXEngine.i());
        } else {
            return (DinamicXEngine.i().getResources().getConfiguration().uiMode & 48) == 32;
        }
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        bi biVar = b;
        return biVar != null ? biVar.a(i, i2) : i2;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f11774a;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : b != null;
    }

    public static void a(DXRuntimeContext dXRuntimeContext, View view) {
        DinamicXEngine D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774e7a59", new Object[]{dXRuntimeContext, view});
        } else if (dXRuntimeContext != null && (D = dXRuntimeContext.D()) != null && D.S() != null) {
            D.S();
        } else if (c() || Build.VERSION.SDK_INT < 29) {
        } else {
            view.setForceDarkAllowed(false);
        }
    }
}
