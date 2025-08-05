package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.dinamic.j;
import com.taobao.android.dinamic.view.DFrameLayout;
import java.util.ArrayList;
import java.util.Map;
import tb.fpd;
import tb.fpr;
import tb.kge;

/* loaded from: classes.dex */
public class DFrameLayoutConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-77499809);
    }

    public static /* synthetic */ Object ipc$super(DFrameLayoutConstructor dFrameLayoutConstructor, String str, Object... objArr) {
        if (str.hashCode() == 333836301) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (fpd) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new DFrameLayout(context, attributeSet);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        super.setAttributes(view, map, arrayList, fpdVar);
        if (!arrayList.contains("dClipTopLeftRadius") && !arrayList.contains("dClipTopRightRadius") && !arrayList.contains("dClipBottomLeftRadius") && !arrayList.contains("dClipBottomRightRadius")) {
            return;
        }
        int a2 = fpr.a(view.getContext(), map.get("dClipTopLeftRadius"), 0);
        int a3 = fpr.a(view.getContext(), map.get("dClipTopRightRadius"), 0);
        int a4 = fpr.a(view.getContext(), map.get("dClipBottomLeftRadius"), 0);
        float f = a2;
        float f2 = a3;
        float a5 = fpr.a(view.getContext(), map.get("dClipBottomRightRadius"), 0);
        float f3 = a4;
        view.setTag(j.LAYOUT_RADII, new float[]{f, f, f2, f2, a5, a5, f3, f3});
    }
}
