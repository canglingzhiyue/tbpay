package com.taobao.ugc.utils;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.m;
import tb.gbh;
import tb.kge;

/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2023963218);
    }

    public static void a(ViewGroup viewGroup, m mVar, com.taobao.android.dinamicx.model.a aVar) {
        ViewGroup.LayoutParams generateLayoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72aff298", new Object[]{viewGroup, mVar, aVar});
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            generateLayoutParams = mVar.generateLayoutParams(aVar);
        } else {
            generateLayoutParams = mVar.generateLayoutParams(aVar, layoutParams);
        }
        viewGroup.setLayoutParams(generateLayoutParams);
    }

    public static com.taobao.android.dinamicx.model.a a(int i, int i2, double d, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.model.a) ipChange.ipc$dispatch("a0150bf", new Object[]{new Integer(i), new Integer(i2), new Double(d), new Integer(i3), new Integer(i4)});
        }
        com.taobao.android.dinamicx.model.a aVar = new com.taobao.android.dinamicx.model.a();
        aVar.f11888a = i;
        aVar.b = i2;
        aVar.c = d;
        if (i3 != aVar.e) {
            aVar.d = gbh.a(DXWidgetNode.getAbsoluteGravity(i3, i4));
            aVar.e = i3;
        }
        return aVar;
    }
}
