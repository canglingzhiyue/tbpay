package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.dinamic.j;
import com.taobao.android.dinamic.view.DLoopLinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.fpd;
import tb.kge;

/* loaded from: classes.dex */
public class DLoopLinearLayoutConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DLoopLinearLayoutConstructor";

    static {
        kge.a(-1380419029);
    }

    public static /* synthetic */ Object ipc$super(DLoopLinearLayoutConstructor dLoopLinearLayoutConstructor, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new DLoopLinearLayout(context, attributeSet);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        super.setAttributes(view, map, arrayList, fpdVar);
        DLoopLinearLayout dLoopLinearLayout = (DLoopLinearLayout) view;
        if (arrayList.contains("dOrientation")) {
            setOrientation(dLoopLinearLayout, (String) map.get("dOrientation"));
        }
        if (!arrayList.contains("dListData")) {
            return;
        }
        bindListData(dLoopLinearLayout, fpdVar, (List) map.get("dListData"));
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void applyDefaultProperty(View view, Map<String, Object> map, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f07c078", new Object[]{this, view, map, fpdVar});
            return;
        }
        super.applyDefaultProperty(view, map, fpdVar);
        DLoopLinearLayout dLoopLinearLayout = (DLoopLinearLayout) view;
        dLoopLinearLayout.setBaselineAligned(false);
        if (!map.containsKey("dOrientation")) {
            dLoopLinearLayout.setOrientation(1);
        }
        dLoopLinearLayout.setTag(j.TAG_DINAMIC_BIND_DATA_LIST, fpdVar.c().f());
    }

    public void setOrientation(DLoopLinearLayout dLoopLinearLayout, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef70056", new Object[]{this, dLoopLinearLayout, str});
        } else if (!TextUtils.isEmpty(str)) {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                dLoopLinearLayout.setOrientation(1);
            } else if (intValue != 1) {
            } else {
                dLoopLinearLayout.setOrientation(0);
            }
        } else {
            dLoopLinearLayout.setOrientation(0);
        }
    }

    public void bindListData(DLoopLinearLayout dLoopLinearLayout, fpd fpdVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c51483c", new Object[]{this, dLoopLinearLayout, fpdVar, list});
        } else {
            dLoopLinearLayout.bindListData(fpdVar, list);
        }
    }
}
