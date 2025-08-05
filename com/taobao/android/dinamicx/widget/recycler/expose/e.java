package com.taobao.android.dinamicx.widget.recycler.expose;

import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import tb.kge;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(472769274);
    }

    public static boolean a(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3af19a", new Object[]{view, new Float(f)})).booleanValue();
        }
        if (view != null && view.isShown()) {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            int height = globalVisibleRect ? rect.height() : 0;
            int width = globalVisibleRect ? rect.width() : 0;
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            if ((measuredHeight == 0 ? measuredHeight : height / measuredHeight) >= f) {
                if ((measuredWidth == 0 ? measuredWidth : width / measuredWidth) >= f) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f6b3e9b", new Object[]{view, new Float(f)})).booleanValue();
        }
        if (view != null && view.isShown()) {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            int height = globalVisibleRect ? rect.height() : 0;
            int width = globalVisibleRect ? rect.width() : 0;
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            if ((measuredHeight == 0 ? measuredHeight : height / measuredHeight) <= f) {
                if ((measuredWidth == 0 ? measuredWidth : width / measuredWidth) <= f) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            com.taobao.android.dinamicx.monitor.b.a("DinamicX", null, "native", DXMonitorConstant.NATIVE_CRASH, s.DX_NATIVE_CRASH_6, str);
        }
    }
}
