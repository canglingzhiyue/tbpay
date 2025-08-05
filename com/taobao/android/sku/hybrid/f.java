package com.taobao.android.sku.hybrid;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SKU_ADD_TO_CART = 2;
    public static final int SKU_BUY = 1;
    public static final int SKU_CLEAR_PARAMS = 8;
    public static final int SKU_CONFIRM = 3;
    public static final int SKU_DOWNGRADE_NATIVE = 9;
    public static final int SKU_GET_DETAIL_DATA = 10;
    public static final int SKU_GET_INPUT_DATA = 7;
    public static final int SKU_HYBRID_ADD_PARAM = 5;
    public static final int SKU_HYBRID_UPDATE_VIEW = 6;
    public static final int SKU_WINDOW_DISMISS = 4;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<d> f15182a;

    static {
        kge.a(-1308169987);
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9292883", new Object[]{this, dVar});
        } else {
            this.f15182a = new WeakReference<>(dVar);
        }
    }

    public String a(int i, Map<String, String> map) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ff85b56", new Object[]{this, new Integer(i), map});
        }
        WeakReference<d> weakReference = this.f15182a;
        if (weakReference == null || (dVar = weakReference.get()) == null) {
            return null;
        }
        if (i == 7 || i == 10) {
            if (!(dVar instanceof a)) {
                return null;
            }
            return ((a) dVar).a(i, map);
        }
        dVar.b(i, map);
        return null;
    }
}
