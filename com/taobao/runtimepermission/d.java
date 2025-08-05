package com.taobao.runtimepermission;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String[] f18987a = null;
    public int[] b = null;
    public String[] c = null;

    public static d a(String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("dfa78e17", new Object[]{strArr, iArr});
        }
        d dVar = new d();
        dVar.f18987a = strArr;
        dVar.b = iArr;
        if (iArr != null) {
            dVar.c = new String[dVar.b.length];
            for (int i = 0; i < dVar.f18987a.length; i++) {
                int i2 = dVar.b[i];
                if (i2 == -3) {
                    dVar.c[i] = "ROLLBACK";
                } else if (i2 == -2) {
                    dVar.c[i] = "BIZ DINED";
                } else if (i2 == -1) {
                    dVar.c[i] = "SYS DINED";
                } else if (i2 != 0) {
                    dVar.c[i] = "UNKNOWN STATUS";
                } else {
                    dVar.c[i] = "";
                }
            }
        }
        return dVar;
    }
}
