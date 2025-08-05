package com.taobao.android.detail.sdk.structure;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.onk;
import tb.riy;
import tb.tpc;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, HashMap<String, a>> f10332a;
    private String b;
    private String c;
    private int d;
    private HashMap<String, Integer> e;
    private final String f = "dinamic+TB_detail_divider_rateLocator";
    private boolean g;

    /* loaded from: classes4.dex */
    public static class a {
        public static final int TYPE_BETWEENCOUNT = 2;
        public static final int TYPE_REPEATCOUNT = 1;

        /* renamed from: a  reason: collision with root package name */
        public int f10333a;
        public int b;

        static {
            kge.a(-2059667521);
        }

        public a(int i, int i2) {
            this.f10333a = i;
            this.b = i2;
        }
    }

    static {
        kge.a(-960361676);
    }

    public d() {
        a();
        tpc.a("com.taobao.android.detail.sdk.structure.FilterRepeatView");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f10332a == null) {
            this.f10332a = new HashMap<>(1);
        }
        if (this.e == null) {
            this.e = new HashMap<>(1);
        }
        this.f10332a.clear();
        a("dinamic", "TB_detail_divider", new a(1, 1));
        a(onk.NAME, "tipDivision", new a(1, 1));
        a("dinamic", "TB_detail_divider", new a(2, 2));
    }

    private void a(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdaf8c20", new Object[]{this, str, str2, aVar});
            return;
        }
        HashMap<String, a> hashMap = this.f10332a.get(str);
        if (hashMap == null) {
            hashMap = new HashMap<>(1);
            this.f10332a.put(str, hashMap);
        }
        hashMap.put(str2, aVar);
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (b(str, str2) || c(str, str2));
    }

    private boolean c(String str, String str2) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, str, str2})).booleanValue();
        }
        if (this.g) {
            return false;
        }
        if (d(str, str2).equals("dinamic+TB_detail_divider_rateLocator")) {
            this.g = true;
            return false;
        }
        for (String str3 : this.e.keySet()) {
            HashMap<String, Integer> hashMap = this.e;
            hashMap.put(str3, Integer.valueOf(hashMap.get(str3).intValue() + 1));
        }
        HashMap<String, a> hashMap2 = this.f10332a.get(str);
        if (hashMap2 == null || (aVar = hashMap2.get(str2)) == null || aVar.f10333a != 2) {
            return false;
        }
        String d = d(str, str2);
        if (this.e.get(d) == null) {
            this.e.put(d, 0);
        } else {
            HashMap<String, Integer> hashMap3 = this.e;
            hashMap3.put(d, Integer.valueOf(hashMap3.get(d).intValue() - 1));
            int intValue = this.e.get(d).intValue();
            if (intValue < aVar.b) {
                return true;
            }
            if (intValue >= aVar.b) {
                this.e.put(d, 0);
            }
        }
        return false;
    }

    public boolean b(String str, String str2) {
        a aVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        if (str.equals(this.b) && str2.equals(this.c)) {
            this.d++;
            HashMap<String, a> hashMap = this.f10332a.get(str);
            if (hashMap != null && (aVar = hashMap.get(str2)) != null && this.d >= aVar.b) {
                z = true;
            }
        } else {
            this.d = 0;
        }
        this.b = str;
        this.c = str2;
        return z;
    }

    private String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bded401", new Object[]{this, str, str2});
        }
        return str + riy.PLUS + str2;
    }
}
