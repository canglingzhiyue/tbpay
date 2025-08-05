package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.dinamic.view.DHorizontalScrollLayout;
import java.util.ArrayList;
import java.util.Map;
import tb.fpd;
import tb.kge;

/* loaded from: classes.dex */
public class DHorizontalScrollLayoutConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1922881789);
    }

    public static /* synthetic */ Object ipc$super(DHorizontalScrollLayoutConstructor dHorizontalScrollLayoutConstructor, String str, Object... objArr) {
        if (str.hashCode() == 333836301) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (fpd) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeViewWithModule(String str, Context context, AttributeSet attributeSet, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("dd539236", new Object[]{this, str, context, attributeSet, fpdVar}) : new DHorizontalScrollLayout(context, attributeSet, fpdVar);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
        } else {
            super.setAttributes(view, map, arrayList, fpdVar);
        }
    }
}
