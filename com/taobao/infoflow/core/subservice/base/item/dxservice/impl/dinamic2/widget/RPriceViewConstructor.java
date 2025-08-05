package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic2.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import com.taobao.android.dinamic.dinamic.h;
import tb.kge;

/* loaded from: classes7.dex */
public class RPriceViewConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-717836058);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new RPriceView(context, attributeSet);
    }

    @DinamicAttr(attrSet = {"rPriceText"})
    public void setPrice(RPriceView rPriceView, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f420a49b", new Object[]{this, rPriceView, obj});
        } else {
            rPriceView.setPrice(obj);
        }
    }

    @DinamicAttr(attrSet = {"rPriceTextSize"})
    public void setPriceTextSize(RPriceView rPriceView, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bec0aed", new Object[]{this, rPriceView, obj});
        } else {
            rPriceView.setPriceTextSize(obj);
        }
    }

    @DinamicAttr(attrSet = {"rPriceTextColor"})
    public void setPriceTextColor(RPriceView rPriceView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a180efa1", new Object[]{this, rPriceView, str});
        } else {
            rPriceView.setPriceTextColor(str);
        }
    }

    @DinamicAttr(attrSet = {"rPriceTextAlignment"})
    public void setPriceTextAlignment(RPriceView rPriceView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b591321", new Object[]{this, rPriceView, str});
        } else {
            rPriceView.setPriceTextAlignment(str);
        }
    }

    @DinamicAttr(attrSet = {"rPriceTextStyle"})
    public void setPriceTextStyle(RPriceView rPriceView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58e00393", new Object[]{this, rPriceView, str});
        } else {
            rPriceView.setPriceTextStyle(str);
        }
    }
}
