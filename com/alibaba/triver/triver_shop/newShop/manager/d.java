package com.alibaba.triver.triver_shop.newShop.manager;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.view.j;
import com.alibaba.triver.triver_shop.newShop.view.l;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ruw;

/* loaded from: classes3.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f3873a;
    private final com.alibaba.triver.triver_shop.newShop.data.d b;
    private final boolean c;
    private final ruw<Integer, Boolean, t> d;
    private HashMap<Integer, Integer> e;
    private boolean f;
    private final l g;

    /* loaded from: classes3.dex */
    public static final class a implements j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.j
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            ruw a2 = d.a(d.this);
            if (a2 == null) {
                return;
            }
            a2.mo2423invoke(Integer.valueOf(i), true);
        }
    }

    static {
        kge.a(-1891388912);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopDataParser, boolean z, ruw<? super Integer, ? super Boolean, t> ruwVar) {
        q.d(context, "context");
        q.d(shopDataParser, "shopDataParser");
        this.f3873a = context;
        this.b = shopDataParser;
        this.c = z;
        this.d = ruwVar;
        this.e = new HashMap<>();
        this.f = true;
        l lVar = new l();
        JSONArray aE = this.b.aE();
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = aE.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                String string = ((JSONObject) next).getString("title");
                arrayList.add(string == null ? "" : string);
            }
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.b;
        lVar.a(dVar, this.f3873a, dVar.f(dVar.p(), this.b.q()), arrayList, new a(), this.c);
        t tVar = t.INSTANCE;
        this.g = lVar;
    }

    public static final /* synthetic */ ruw a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruw) ipChange.ipc$dispatch("17d2ca7c", new Object[]{dVar}) : dVar.d;
    }

    public final View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.g.a();
    }

    public final void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e.put(Integer.valueOf(i), Integer.valueOf(this.b.j(i2)));
        this.g.a(i2);
        this.g.b(i);
        this.f = false;
    }

    public final void a(int i, boolean z) {
        Integer num;
        IpChange ipChange = $ipChange;
        Integer num2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (this.e.containsKey(Integer.valueOf(i)) && (num = this.e.get(Integer.valueOf(i))) != null) {
            num2 = num;
        }
        int f = this.b.f(i, num2.intValue());
        a(i, f);
        ruw<Integer, Boolean, t> ruwVar = this.d;
        if (ruwVar != null) {
            ruwVar.mo2423invoke(Integer.valueOf(f), Boolean.valueOf(z));
        }
        this.g.b(i);
    }

    public static /* synthetic */ void a(d dVar, boolean z, Boolean bool, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bac3b90", new Object[]{dVar, new Boolean(z), bool, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        dVar.a(z, bool);
    }

    public final void a(boolean z, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25558c61", new Object[]{this, new Boolean(z), bool});
        } else {
            l.a(this.g, Boolean.valueOf(z), null, null, null, null, bool, 30, null);
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g.a(z);
        }
    }
}
