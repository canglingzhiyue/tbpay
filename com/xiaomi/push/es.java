package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class es {

    /* renamed from: a  reason: collision with root package name */
    private static volatile es f24462a;

    /* renamed from: a  reason: collision with other field name */
    private int f331a;

    /* renamed from: a  reason: collision with other field name */
    private Context f332a;

    /* renamed from: a  reason: collision with other field name */
    private ew f333a;

    /* renamed from: a  reason: collision with other field name */
    private String f334a;

    /* renamed from: a  reason: collision with other field name */
    private HashMap<eu, ev> f335a = new HashMap<>();
    private String b;

    private es(Context context) {
        this.f332a = context;
        this.f335a.put(eu.SERVICE_ACTION, new ey());
        this.f335a.put(eu.SERVICE_COMPONENT, new ez());
        this.f335a.put(eu.ACTIVITY, new eq());
        this.f335a.put(eu.PROVIDER, new ex());
    }

    public static es a(Context context) {
        if (f24462a == null) {
            synchronized (es.class) {
                if (f24462a == null) {
                    f24462a = new es(context);
                }
            }
        }
        return f24462a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(eu euVar, Context context, er erVar) {
        this.f335a.get(euVar).a(context, erVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1915a(Context context) {
        return com.xiaomi.push.service.al.m2273a(context, context.getPackageName());
    }

    public int a() {
        return this.f331a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ew m1916a() {
        return this.f333a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m1917a() {
        return this.f334a;
    }

    public void a(int i) {
        this.f331a = i;
    }

    public void a(Context context, String str, int i, String str2, String str3) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            a(i);
            ah.a(this.f332a).a(new et(this, str, context, str2, str3));
            return;
        }
        eo.a(context, "" + str, 1008, "A receive a incorrect message");
    }

    public void a(eu euVar, Context context, Intent intent, String str) {
        if (euVar != null) {
            this.f335a.get(euVar).a(context, intent, str);
        } else {
            eo.a(context, "null", 1008, "A receive a incorrect message with empty type");
        }
    }

    public void a(ew ewVar) {
        this.f333a = ewVar;
    }

    public void a(String str) {
        this.f334a = str;
    }

    public void a(String str, String str2, int i, ew ewVar) {
        a(str);
        b(str2);
        a(i);
        a(ewVar);
    }

    public String b() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
    }
}
