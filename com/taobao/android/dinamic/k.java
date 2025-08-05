package com.taobao.android.dinamic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.DLoopLinearLayout;
import com.taobao.android.dinamic.view.a;
import com.taobao.android.dinamic.view.b;
import java.util.ArrayList;
import tb.fpd;
import tb.fpq;
import tb.kge;

/* loaded from: classes5.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1220364053);
    }

    public static View a(String str, Context context, AttributeSet attributeSet, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("75d29e90", new Object[]{str, context, attributeSet, fpdVar});
        }
        com.taobao.android.dinamic.dinamic.h b = e.b(str);
        if (b == null) {
            fpdVar.c().b().a(a.ERROR_CODE_VIEW_NOT_FOUND, str);
            return null;
        }
        View initializeViewWithModule = b.initializeViewWithModule(str, context, attributeSet, fpdVar);
        if (initializeViewWithModule == null) {
            fpdVar.c().b().a(a.ERROR_CODE_VIEW_NOT_FOUND, str);
            return null;
        }
        fpq handleAttributeSet = b.handleAttributeSet(attributeSet);
        b.applyDefaultProperty(initializeViewWithModule, handleAttributeSet.b, fpdVar);
        if (!handleAttributeSet.c.isEmpty() || !handleAttributeSet.d.isEmpty()) {
            fpdVar.c().f().add(initializeViewWithModule);
        }
        handleAttributeSet.f28098a = str;
        initializeViewWithModule.setTag(j.PROPERTY_KEY, handleAttributeSet);
        ArrayList<String> arrayList = new ArrayList<>(20);
        arrayList.addAll(handleAttributeSet.b.keySet());
        b.bindDataImpl(initializeViewWithModule, handleAttributeSet.b, arrayList, fpdVar);
        return initializeViewWithModule;
    }

    public static View a(Context context, View view, b bVar, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9251e03c", new Object[]{context, view, bVar, fpdVar});
        }
        fpq a2 = l.a(view);
        com.taobao.android.dinamic.dinamic.h b = e.b(a2.f28098a);
        if (b == null) {
            fpdVar.c().b().a(a.ERROR_CODE_VIEW_NOT_FOUND, a2.f28098a);
            return null;
        }
        View initializeViewWithModule = b.initializeViewWithModule(a2.f28098a, context, null, fpdVar);
        if (initializeViewWithModule == null) {
            fpdVar.c().b().a(a.ERROR_CODE_VIEW_NOT_FOUND, a2.f28098a);
            return null;
        }
        if ((initializeViewWithModule instanceof DLoopLinearLayout) && (view instanceof DLoopLinearLayout)) {
            ((DLoopLinearLayout) initializeViewWithModule).setTemplateViews(((DLoopLinearLayout) view).cloneTemplateViews());
        }
        b.applyDefaultProperty(initializeViewWithModule);
        initializeViewWithModule.setTag(j.PROPERTY_KEY, a2);
        if (!a2.c.isEmpty() || !a2.d.isEmpty()) {
            bVar.f().add(initializeViewWithModule);
        }
        ArrayList<String> arrayList = new ArrayList<>(20);
        arrayList.addAll(a2.b.keySet());
        b.bindDataImpl(initializeViewWithModule, a2.b, arrayList, fpdVar);
        return initializeViewWithModule;
    }
}
