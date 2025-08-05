package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.uikit.provider.IFontSizeProvider;
import tb.fut;
import tb.kge;

/* loaded from: classes9.dex */
public class DataParseFontSizeList implements fut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-229174384);
        kge.a(1343895002);
    }

    @Override // tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IFontSizeProvider iFontSizeProvider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length > 0 && (iFontSizeProvider = (IFontSizeProvider) GlobalContainer.getInstance().get(IFontSizeProvider.class)) != null && iFontSizeProvider.getDPSize() > 0 && iFontSizeProvider.getDPSize() <= objArr.length) {
            return objArr[iFontSizeProvider.getDPSize() - 1];
        }
        return null;
    }
}
