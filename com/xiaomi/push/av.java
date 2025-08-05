package com.xiaomi.push;

import android.content.Context;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
class av implements ar {

    /* renamed from: a  reason: collision with root package name */
    private Context f24360a;

    /* renamed from: a  reason: collision with other field name */
    private Class<?> f118a;

    /* renamed from: a  reason: collision with other field name */
    private Object f119a;

    /* renamed from: a  reason: collision with other field name */
    private Method f120a = null;
    private Method b = null;
    private Method c = null;
    private Method d = null;

    public av(Context context) {
        this.f24360a = context;
        a(context);
    }

    private String a(Context context, Method method) {
        Object obj = this.f119a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke == null) {
                return null;
            }
            return (String) invoke;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a("miui invoke error", e);
            return null;
        }
    }

    private void a(Context context) {
        try {
            this.f118a = r.a(context, "com.android.id.impl.IdProviderImpl");
            this.f119a = this.f118a.newInstance();
            this.b = this.f118a.getMethod("getOAID", Context.class);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a("miui load class error", e);
        }
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a */
    public String mo1730a() {
        return a(this.f24360a, this.b);
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo1730a() {
        return (this.f118a == null || this.f119a == null) ? false : true;
    }
}
