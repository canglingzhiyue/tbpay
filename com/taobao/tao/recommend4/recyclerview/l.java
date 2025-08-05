package com.taobao.tao.recommend4.recyclerview;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.homepage.utils.o;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ksk;

/* loaded from: classes8.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<ksk, Integer> f20996a;
    private int b;
    private HashMap<String, Integer> c = new HashMap<>(64);
    private HashMap<Integer, o.a> d = new HashMap<>(64);

    static {
        kge.a(-1475469364);
        HashMap hashMap = new HashMap();
        f20996a = hashMap;
        hashMap.put(ksk.HOME_MAIN, 0);
        f20996a.put(ksk.HOME_INTL, 100);
        f20996a.put(ksk.HOME_CUN, 200);
        f20996a.put(ksk.HOME_OLD, 300);
    }

    public l(ksk kskVar) {
        Integer num = f20996a.get(kskVar == null ? ksk.HOME_MAIN : kskVar);
        this.b = (num == null ? 0 : num).intValue();
    }

    public int a(JSONObject jSONObject) {
        Integer num;
        Integer num2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266fb7b", new Object[]{this, jSONObject})).intValue();
        }
        if (jSONObject == null) {
            return -1;
        }
        o.a a2 = com.taobao.homepage.utils.o.a(jSONObject);
        String b = a2.b();
        String c = a2.c();
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(c)) {
            num = -1;
        } else {
            String str = b + "_" + c;
            if (a2.g()) {
                this.c.remove(str);
                a2.a(false);
            }
            num = this.c.get(str);
            if (num == null) {
                if (a2.a()) {
                    DXTemplateItem a3 = com.taobao.tao.recommend3.a.a().b().a(a2.e());
                    if (a3 == null) {
                        num = -1;
                    } else {
                        if (!TextUtils.equals(a3.f11925a, b) || !TextUtils.equals(String.valueOf(a3.b), c)) {
                            str = a3.f11925a + "_" + a3.b;
                        }
                        num2 = this.c.get(str);
                        if (num2 == null) {
                            int i = this.b;
                            this.b = i + 1;
                            num2 = Integer.valueOf(i);
                            this.c.put(str, num2);
                            this.d.put(num2, a2);
                        }
                        num = num2;
                    }
                } else {
                    DinamicTemplate d = DTemplateManager.a("guess").d(a2.d());
                    if (d == null) {
                        num = -1;
                    } else {
                        if (!TextUtils.equals(d.name, b) || !TextUtils.equals(d.version, c)) {
                            str = d.name + "_" + d.version;
                        }
                        num2 = this.c.get(str);
                        if (num2 == null) {
                            int i2 = this.b;
                            this.b = i2 + 1;
                            num2 = Integer.valueOf(i2);
                            this.c.put(str, num2);
                            this.d.put(num2, a2);
                        }
                        num = num2;
                    }
                }
            } else {
                this.d.put(num, a2);
            }
        }
        return num.intValue();
    }

    public o.a a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o.a) ipChange.ipc$dispatch("a6ead26c", new Object[]{this, new Integer(i)}) : this.d.get(Integer.valueOf(i));
    }
}
