package com.taobao.android.searchbaseframe.meta.uikit;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Method f14986a;

    static {
        kge.a(-1272813808);
        f14986a = null;
    }

    public static int a(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9501e35d", new Object[]{view})).intValue() : (int) view.getTranslationY();
    }

    public static void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{view, new Integer(i)});
        } else {
            view.setTranslationY(i);
        }
    }

    public static void a(RecyclerView recyclerView, int i) {
        try {
            if (f14986a == null) {
                Method declaredMethod = RecyclerView.class.getDeclaredMethod("setScrollState", Integer.TYPE);
                f14986a = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            f14986a.invoke(recyclerView, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }
}
