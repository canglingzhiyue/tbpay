package com.taobao.android.detail.wrapper.ext.provider.option;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.emu;
import tb.eoy;
import tb.epk;
import tb.kge;
import tb.onk;
import tb.riy;

/* loaded from: classes5.dex */
public class e implements epk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;
    private String c;
    private int d;
    private boolean g;
    private final String f = "dinamic+TB_detail_divider_rateLocator";

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, HashMap<String, a>> f11348a = new HashMap<>();
    private HashMap<String, Integer> e = new HashMap<>();

    /* loaded from: classes5.dex */
    public static class a {
        public static final int TYPE_BETWEENCOUNT = 2;
        public static final int TYPE_REPEATCOUNT = 1;

        /* renamed from: a  reason: collision with root package name */
        public int f11349a;
        public int b;

        static {
            kge.a(-1052914343);
        }

        public a(int i, int i2) {
            this.f11349a = i;
            this.b = i2;
        }
    }

    static {
        kge.a(805216346);
        kge.a(-1308822800);
    }

    public e() {
        a("dinamic", "TB_detail_divider", new a(1, 1));
        a(onk.NAME, "tipDivision", new a(1, 1));
        a("dinamic", "TB_detail_divider", new a(2, 2));
        a();
        emu.a("com.taobao.android.detail.wrapper.ext.provider.option.TBViewModelIntercepoterProvider");
    }

    @Override // tb.epk
    public List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> a(List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        a();
        ArrayList arrayList = new ArrayList();
        String str = null;
        String str2 = null;
        for (com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar : list) {
            if (bVar.component != null) {
                str = bVar.component.key;
                str2 = bVar.component.ruleId;
            } else if (bVar.dmComponent != null) {
                str = eoy.a(bVar.dmComponent);
                str2 = eoy.b(bVar.dmComponent);
            }
            if (!a(str, str2)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = "";
        this.c = "";
        this.d = 0;
        this.g = false;
    }

    private boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (c(str, str2) || b(str, str2));
    }

    private boolean b(String str, String str2) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
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
        HashMap<String, a> hashMap2 = this.f11348a.get(str);
        if (hashMap2 == null || (aVar = hashMap2.get(str2)) == null || aVar.f11349a != 2) {
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

    private void a(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("358a6354", new Object[]{this, str, str2, aVar});
            return;
        }
        HashMap<String, a> hashMap = this.f11348a.get(str);
        if (hashMap == null) {
            hashMap = new HashMap<>(1);
            this.f11348a.put(str, hashMap);
        }
        hashMap.put(str2, aVar);
    }

    private boolean c(String str, String str2) {
        a aVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{this, str, str2})).booleanValue();
        }
        if (str.equals(this.b) && str2.equals(this.c)) {
            this.d++;
            HashMap<String, a> hashMap = this.f11348a.get(str);
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
