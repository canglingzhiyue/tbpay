package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.uikit.provider.IFontSizeProvider;
import tb.fut;
import tb.kge;

/* loaded from: classes9.dex */
public class DataParseFontSize implements fut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1601230894);
        kge.a(1343895002);
    }

    @Override // tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IFontSizeProvider iFontSizeProvider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (iFontSizeProvider = (IFontSizeProvider) GlobalContainer.getInstance().get(IFontSizeProvider.class)) != null && (obj instanceof String)) {
            return Float.valueOf(iFontSizeProvider.getDPFontSizeByScale(Float.parseFloat((String) obj)));
        }
        return null;
    }
}
