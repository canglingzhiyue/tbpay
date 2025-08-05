package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.h;
import com.alibaba.triver.triver_shop.newShop.ext.j;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public class c extends h.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f3954a;
    private final a b;
    private final com.alibaba.triver.triver_shop.newShop.data.d c;

    static {
        kge.a(-1293645243);
    }

    public c(Context context, a shopTemplateComponent) {
        q.d(context, "context");
        q.d(shopTemplateComponent, "shopTemplateComponent");
        this.f3954a = context;
        this.b = shopTemplateComponent;
        this.c = this.b.a();
    }

    public final com.alibaba.triver.triver_shop.newShop.data.d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("820aec79", new Object[]{this}) : this.c;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else if (!this.b.h()) {
        } else {
            boolean z = obj instanceof String;
            if (z) {
                l.a(this.f3954a, (String) obj);
            }
            if (q.a((Object) this.c.aw(), obj)) {
                j.c(this.c);
            }
            if (q.a((Object) this.c.aQ(), obj)) {
                j.f(this.c);
            }
            if (!z || !this.c.f((String) obj)) {
                return;
            }
            j.j(this.c);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
        } else if (!this.b.h()) {
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.a(this.f3954a);
            if (this.c.t()) {
                return;
            }
            j.k(this.c);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
    public void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceeb7748", new Object[]{this, obj});
        } else if (!this.b.h()) {
        } else {
            com.alibaba.triver.triver_shop.d.INSTANCE.a((Activity) this.f3954a, this.b.a(), this.b.a().L(), this.b.a().K(), null, null, null);
            if (this.c.t()) {
                return;
            }
            j.a(this.c);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.data.h.b
    public void g(Object obj) {
        com.alibaba.triver.triver_shop.newShop.event.broadcast.a z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("634ea9ca", new Object[]{this, obj});
            return;
        }
        String str = null;
        if ((obj instanceof String) && (z = this.c.z()) != null) {
            z.a((String) obj, (String) null);
        }
        if (!(obj instanceof JSONObject)) {
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        String string = jSONObject.getString("jumpType");
        JSONObject jSONObject2 = jSONObject.getJSONObject("jumpParams");
        com.alibaba.triver.triver_shop.newShop.event.broadcast.a z2 = this.c.z();
        if (z2 == null) {
            return;
        }
        if (jSONObject2 != null) {
            str = jSONObject2.toJSONString();
        }
        z2.a(string, str);
    }
}
