package com.taobao.unit.center.mdc.dinamicx.dataParse;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fut;
import tb.kge;

/* loaded from: classes9.dex */
public class DataParseRelationOp implements fut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-576992417);
        kge.a(1343895002);
    }

    @Override // tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length == 3) {
            String str = "" + objArr[0];
            String str2 = "" + objArr[1];
            String str3 = "" + objArr[2];
            if (!TextUtils.isEmpty(str)) {
                String str4 = str2;
                if (!TextUtils.isEmpty(str4)) {
                    String str5 = str3;
                    if (!TextUtils.isEmpty(str5) && !"null".equals(str4) && !"null".equals(str5)) {
                        try {
                            double parseDouble = Double.parseDouble(str2);
                            double parseDouble2 = Double.parseDouble(str3);
                            if ("==".equals(str)) {
                                if (parseDouble != parseDouble2) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            } else if ("!=".equals(str)) {
                                if (parseDouble == parseDouble2) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            } else if (">".equals(str)) {
                                if (parseDouble <= parseDouble2) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            } else if ("<".equals(str)) {
                                if (parseDouble >= parseDouble2) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            } else if (">=".equals(str)) {
                                if (parseDouble < parseDouble2) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            } else if (!"<=".equals(str)) {
                                return null;
                            } else {
                                if (parseDouble > parseDouble2) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
    }
}
