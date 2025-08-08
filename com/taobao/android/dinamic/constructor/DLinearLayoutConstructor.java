package com.taobao.android.dinamic.constructor;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.dinamic.j;
import com.taobao.android.dinamic.view.DLinearLayout;
import java.util.ArrayList;
import java.util.Map;
import tb.fpd;
import tb.fpr;
import tb.kge;

/* loaded from: classes.dex */
public class DLinearLayoutConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DLinearLayoutConstructor";

    static {
        kge.a(564466543);
    }

    public static /* synthetic */ Object ipc$super(DLinearLayoutConstructor dLinearLayoutConstructor, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 333836301) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (fpd) objArr[3]);
            return null;
        } else if (hashCode != 2131214456) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.applyDefaultProperty((View) objArr[0], (Map) objArr[1], (fpd) objArr[2]);
            return null;
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new DLinearLayout(context);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void applyDefaultProperty(View view, Map<String, Object> map, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f07c078", new Object[]{this, view, map, fpdVar});
            return;
        }
        super.applyDefaultProperty(view, map, fpdVar);
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.setBaselineAligned(false);
        if (map.containsKey("dOrientation")) {
            return;
        }
        linearLayout.setOrientation(0);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        super.setAttributes(view, map, arrayList, fpdVar);
        DLinearLayout dLinearLayout = (DLinearLayout) view;
        if (arrayList.contains("dOrientation")) {
            setOrientation(dLinearLayout, (String) map.get("dOrientation"));
        }
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

    public void setOrientation(LinearLayout linearLayout, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0c900bc", new Object[]{this, linearLayout, str});
        } else if (!StringUtils.isEmpty(str)) {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                linearLayout.setOrientation(1);
            } else if (intValue != 1) {
            } else {
                linearLayout.setOrientation(0);
            }
        } else {
            linearLayout.setOrientation(0);
        }
    }
}
