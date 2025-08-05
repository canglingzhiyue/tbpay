package com.etao.feimagesearch.mnn;

import android.graphics.RectF;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INVALID_RESULT_CODE = "A00001";
    public static final String NEW_ALGORITHM_CODE = "A00000";
    public static final String OLD_ALGORITHM_CODE = "A00002";

    /* renamed from: a  reason: collision with root package name */
    private List<Integer> f6759a;
    private List<RectF> b;
    private List<Float> c;
    private String d;

    static {
        kge.a(989742832);
    }

    public List<RectF> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
    }

    public List<Float> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.c;
    }

    public static c a(Map<String, Object> map) {
        List<List> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("16210bd6", new Object[]{map});
        }
        try {
            c b = b(map);
            if (b == null || (list = (List) map.get("boxes")) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (List list2 : list) {
                if (list2 != null && list2.size() == 4) {
                    arrayList.add(new RectF(((Double) list2.get(0)).floatValue(), ((Double) list2.get(1)).floatValue(), ((Double) list2.get(2)).floatValue(), ((Double) list2.get(3)).floatValue()));
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            b.b = arrayList;
            if (!a(b)) {
                return b;
            }
            return null;
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    private static c b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("15aaa5d7", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        try {
            c cVar = new c();
            cVar.f6759a = (List) map.get("labels");
            cVar.c = (List) map.get("scores");
            cVar.d = (String) map.get("result_code");
            return cVar;
        } catch (ClassCastException | NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean a(c cVar) {
        List<Float> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c05b4429", new Object[]{cVar})).booleanValue() : cVar.f6759a == null || cVar.b == null || (list = cVar.c) == null || list.size() != cVar.b.size() || TextUtils.isEmpty(cVar.d);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.d) && NEW_ALGORITHM_CODE.equalsIgnoreCase(this.d);
    }
}
