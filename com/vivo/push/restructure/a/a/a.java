package com.vivo.push.restructure.a.a;

import com.vivo.push.util.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected T f24220a;
    private String b;
    private i e;
    private a g;
    private long c = -1;
    private int d = -1;
    private boolean f = false;

    public a(String str, T t, i iVar) {
        this.b = str;
        this.f24220a = t;
        this.e = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        long currentTimeMillis = System.currentTimeMillis();
        this.d = a((a<T>) this.f24220a);
        this.c = System.currentTimeMillis() - currentTimeMillis;
        int i = this.d;
        if (i != 0) {
            i iVar = this.e;
            if (iVar == null) {
                return;
            }
            iVar.a(this, this.f24220a, i);
            return;
        }
        a aVar = this.g;
        if (aVar != null) {
            aVar.a();
            return;
        }
        i iVar2 = this.e;
        if (iVar2 == null) {
            return;
        }
        iVar2.a((i) this.f24220a);
    }

    protected abstract int a(T t);

    public final void a() {
        if (this.f) {
            com.vivo.push.util.g.a().execute(new b(this));
        } else {
            d();
        }
    }

    public final void a(long j) {
        this.c = j;
    }

    public final void a(a aVar) {
        if (this != aVar) {
            this.g = aVar;
        }
    }

    public synchronized String b() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.b);
            jSONObject.put("code", this.d);
            jSONObject.put("cost", this.c);
        } catch (Exception e) {
            u.a("AbstractMessageNodeMoni", e);
        }
        return jSONObject.toString();
    }

    public final JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        for (a<T> aVar = this; aVar != null; aVar = aVar.g) {
            try {
                jSONArray.put(aVar.b());
            } catch (Exception e) {
                u.a("AbstractMessageNodeMoni", e);
            }
        }
        return jSONArray;
    }
}
