package com.taobao.android.gateway.datastructure;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f12700a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    static {
        kge.a(-875190979);
        f12700a = ".";
        b = 0;
        c = 1;
        d = 2;
        e = 3;
    }

    public a() {
    }

    public a(String str) {
        this.j = str;
    }

    public a(String str, String str2, String str3, String str4) {
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = a(str, str2, str3, str4);
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a55f6bd6", new Object[]{str});
        }
        String[] b2 = b(str);
        return new a(a(b2, b), a(b2, c), a(b2, d), a(b2, e));
    }

    public static String a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{str, str2, str3, str4});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(str3);
        arrayList.add(str4);
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((String) arrayList.get(size)) != null) {
                break;
            } else {
                size--;
            }
        }
        if (size == -1) {
            return null;
        }
        List subList = arrayList.subList(0, size + 1);
        for (int size2 = subList.size() - 1; size2 >= 0; size2--) {
            if (subList.get(size2) == null) {
                subList.set(size2, "");
            }
        }
        return TextUtils.join(".", subList);
    }

    public static String a(String[] strArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fe417f4", new Object[]{strArr, new Integer(i)});
        }
        if (strArr == null || i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    public static String[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("39a26282", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return str.split("\\" + f12700a, 4);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.j;
    }
}
