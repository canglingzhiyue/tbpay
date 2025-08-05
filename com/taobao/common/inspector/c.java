package com.taobao.common.inspector;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import tb.kge;
import tb.kgi;
import tb.kgj;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String[] b;
    private static String[] c;

    /* renamed from: a  reason: collision with root package name */
    private final kgj[] f16929a;

    public c(kgj[] kgjVarArr) {
        this.f16929a = kgjVarArr;
    }

    public String a(kgj kgjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6735c56", new Object[]{this, kgjVar});
        }
        String[] b2 = b(kgjVar);
        if (b2 != null && b2.length > 0) {
            return b2[0];
        }
        return null;
    }

    public String[] b(kgj kgjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("556c2b1a", new Object[]{this, kgjVar}) : a(kgjVar, this.f16929a);
    }

    public static String[] a(kgj kgjVar, kgj[] kgjVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("14aadafc", new Object[]{kgjVar, kgjVarArr});
        }
        if (kgjVarArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (kgj kgjVar2 : kgjVarArr) {
            if (a(kgjVar2.b, kgjVar.b) && ((kgjVar.c == null || kgjVar.c.length <= 0 || a(kgjVar2.c, a(kgjVar.c[0]))) && a(kgjVar2.d, kgjVar.d))) {
                arrayList.add(kgjVar2.f30053a);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static boolean a(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4420b40c", new Object[]{strArr, strArr2})).booleanValue();
        }
        if (strArr2 != null && strArr2.length != 0) {
            return a(strArr, strArr2[0]);
        }
        return true;
    }

    public static boolean a(String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a325b9c5", new Object[]{strArr, str})).booleanValue();
        }
        if (strArr != null && str != null) {
            return Arrays.asList(strArr).contains(str);
        }
        return true;
    }

    public static boolean a(kgi kgiVar, kgi kgiVar2) {
        kgi.a[] aVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc772f2", new Object[]{kgiVar, kgiVar2})).booleanValue();
        }
        if (kgiVar != null && kgiVar2 != null) {
            if (kgiVar.f30051a != kgiVar2.f30051a) {
                return false;
            }
            if (kgiVar.b != null && kgiVar2.b != null) {
                if (kgiVar.b.length < kgiVar2.b.length) {
                    return false;
                }
                for (kgi.a aVar : kgiVar2.b) {
                    kgi.a aVar2 = null;
                    kgi.a[] aVarArr2 = kgiVar.b;
                    int length = aVarArr2.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        kgi.a aVar3 = aVarArr2[i];
                        if ((aVar3.b & aVar.b) == aVar.b) {
                            aVar2 = aVar3;
                            break;
                        }
                        i++;
                    }
                    if (aVar2 == null || !a(aVar2, aVar)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean a(kgi.a aVar, kgi.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41f0a138", new Object[]{aVar, aVar2})).booleanValue();
        }
        if (aVar2.c == null || aVar2.c.length == 0 || aVar.c == null) {
            return true;
        }
        int i = aVar2.c[0];
        int i2 = aVar2.c[aVar2.c.length - 1];
        return Math.min(i, i2) == aVar.c[0] && Math.max(i, i2) == aVar.c[1];
    }

    private static String a(String str) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String str2 = str;
        for (String str3 : b) {
            int indexOf = str2.indexOf(str3);
            if (indexOf >= 0) {
                str2 = str2.substring(indexOf + str3.length());
            }
        }
        for (String str4 : c) {
            int indexOf2 = str2.indexOf(str4);
            if (indexOf2 >= 0) {
                str2 = str2.substring(0, indexOf2);
            }
        }
        return str2.trim();
    }

    static {
        kge.a(-1763267323);
        b = new String[]{"based on Qualcomm Technologies, Inc ", "Qualcomm Technologies, Inc. ", "Qualcomm Technologies, Inc ", "Qualcomm ", "Hisilicon ", "Samsung Technologies, Inc ", " based on Samsung ", "SAMSUNG ", "Samsung "};
        c = new String[]{" HUAWEI "};
    }
}
