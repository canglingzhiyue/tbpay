package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fuf;
import tb.fuw;
import tb.kge;

/* loaded from: classes9.dex */
public class DXDataParserBetween extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_BETWEEN = 4691990062613419377L;

    static {
        kge.a(991431076);
    }

    public static /* synthetic */ Object ipc$super(DXDataParserBetween dXDataParserBetween, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length != 3) {
            fuw.d("DXDataParserBetween", "operationList 键值对数量不符合规范");
            return false;
        }
        Integer integer = toInteger(objArr[0]);
        Integer integer2 = toInteger(objArr[1]);
        Integer integer3 = toInteger(objArr[2]);
        if (integer != null && integer2 != null && integer3 != null) {
            if (integer.intValue() < integer2.intValue() || integer.intValue() > integer3.intValue()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        fuw.d("DXDataParserBetween", "第0项为空");
        return false;
    }

    private Integer toInteger(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("f973f84d", new Object[]{this, obj});
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (Throwable unused) {
                fuw.d("DXDataParserBetween", "第0项参数非法");
                return null;
            }
        } else if (!(obj instanceof Integer)) {
            return null;
        } else {
            return (Integer) obj;
        }
    }
}
