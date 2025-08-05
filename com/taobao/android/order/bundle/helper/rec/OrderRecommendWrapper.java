package com.taobao.android.order.bundle.helper.rec;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import tb.kge;

/* loaded from: classes6.dex */
public class OrderRecommendWrapper extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f14549a;

    /* renamed from: com.taobao.android.order.bundle.helper.rec.OrderRecommendWrapper$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14550a = new int[RecType.values().length];

        static {
            try {
                f14550a[RecType.MAIN_SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14550a[RecType.GUESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum RecType {
        GUESS,
        MAIN_SEARCH
    }

    static {
        kge.a(-305750434);
    }

    public OrderRecommendWrapper(OrderRecyclerView orderRecyclerView, Context context, RecType recType, JSONObject jSONObject) {
        if (AnonymousClass1.f14550a[recType.ordinal()] == 1) {
            this.f14549a = new c(orderRecyclerView, context, jSONObject);
        } else {
            this.f14549a = new b(orderRecyclerView, context);
        }
    }

    public a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("74e04be", new Object[]{this}) : this.f14549a;
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f14549a.a();
        }
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f14549a.a(z);
        }
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
        } else {
            this.f14549a.a(jSONObject, str);
        }
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f14549a.b();
        }
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f14549a.c();
        }
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f14549a.d();
        }
    }

    @Override // com.taobao.android.order.bundle.helper.rec.a
    public View e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("42261fae", new Object[]{this}) : this.f14549a.e();
    }
}
