package com.taobao.unit.center.mdc.dinamicx.dataParse;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import mtopsdk.common.util.SymbolExpUtil;
import tb.fqr;
import tb.fuf;
import tb.kge;

/* loaded from: classes9.dex */
public class DXDataParserMpSplitAndGetSubString extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPSPLITANDGETSUBSTRING = 8018042842832646611L;

    static {
        kge.a(-1838064161);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 3) {
            Object obj = objArr[0];
            if (!(obj instanceof String)) {
                return null;
            }
            Object obj2 = objArr[1];
            if (!(obj2 instanceof String)) {
                return null;
            }
            Object obj3 = objArr[2];
            if (!(obj3 instanceof String)) {
                return null;
            }
            int a2 = fqr.a((String) obj3);
            String str = (String) obj2;
            if (StringUtils.equals(".", str)) {
                obj2 = "\\.";
            } else if (StringUtils.equals("|", str)) {
                obj2 = SymbolExpUtil.SYMBOL_VERTICALBAR;
            }
            String[] split = ((String) obj).split((String) obj2);
            if (split != null && a2 >= 0) {
                if (split.length == 0 && a2 == 0) {
                    return obj;
                }
                if (split.length > a2) {
                    return split[a2];
                }
                return null;
            }
        }
        return null;
    }
}
