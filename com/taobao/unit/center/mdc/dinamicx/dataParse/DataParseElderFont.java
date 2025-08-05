package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.provider.IElderFontProvider;
import kotlin.Metadata;
import tb.fut;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/taobao/unit/center/mdc/dinamicx/dataParse/DataParseElderFont;", "Lcom/taobao/android/dinamicx/expression/parser/IDXDataParser;", "()V", "evalWithArgs", "", "operationList", "", "runtimeParam", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)Ljava/lang/Object;", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class DataParseElderFont implements fut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2088477399);
        kge.a(1343895002);
    }

    @Override // tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            if (!(objArr.length >= 2)) {
                objArr = null;
            }
            if (objArr != null) {
                IElderFontProvider iElderFontProvider = (IElderFontProvider) GlobalContainer.getInstance().get(IElderFontProvider.class);
                if (iElderFontProvider != null ? iElderFontProvider.isElderFont() : false) {
                    return objArr[1];
                }
                return objArr[0];
            }
        }
        return null;
    }
}
