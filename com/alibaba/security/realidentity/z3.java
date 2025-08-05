package com.alibaba.security.realidentity;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class z3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String e = "11111111111";
    public static final int f = 500;
    public static final int g = 100;
    public static final int h = 2000;
    public static final int i = 10000;
    public static final int j = 200;
    public static final int k = 300;
    public static final int l = 0;
    public static final int m = 2000;
    public static final int n = 0;
    public static final int[] o = {1, 4, 9, 2, 10, 5, 6, 13, 8, 3, 11};

    /* renamed from: a  reason: collision with root package name */
    public String f3615a;
    public int b;
    public int c;
    public int d;

    public z3(HashMap<String, String> hashMap) {
        try {
            this.f3615a = hashMap.get(r3.n);
            this.b = Integer.parseInt(hashMap.get(r3.o));
            this.c = Integer.parseInt(hashMap.get(r3.p));
            this.d = Integer.parseInt(hashMap.get(r3.q));
        } catch (Exception unused) {
        }
    }

    public List<Integer> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        if (a(this.f3615a)) {
            this.f3615a = e;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = this.f3615a.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            if (charArray[i2] == '1') {
                arrayList.add(Integer.valueOf(o[i2]));
            }
        }
        return arrayList;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        int i2 = this.c;
        if (i2 > 300 || i2 <= 0) {
            this.c = 100;
        }
        return this.c;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        int i2 = this.d;
        if (i2 > 2000 || i2 <= 0) {
            this.d = 2000;
        }
        return this.d;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        int i2 = this.b;
        if (i2 > 10000 || i2 <= 200) {
            this.b = 500;
        }
        return this.b;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length != 11) {
            return true;
        }
        for (char c : charArray) {
            if (c != '1' && c != '0') {
                return true;
            }
        }
        return false;
    }
}
