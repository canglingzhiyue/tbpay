package com.taobao.android.msoa;

import android.text.TextUtils;
import com.taobao.android.msoa.annotation.MSOAServiceDefinition;
import com.taobao.android.msoa.annotation.MSOAServiceInvoke;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import java.util.Map;

/* loaded from: classes6.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public String f14434a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Map<String, Object> f;
    public int g;
    public long h;
    public long i;
    public MSOAServiceListener j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;

    public g(String str, Map<String, Object> map) {
        this.c = "1.0";
        MSOAServiceInvoke mSOAServiceInvoke = (MSOAServiceInvoke) getClass().getAnnotation(MSOAServiceInvoke.class);
        if (mSOAServiceInvoke != null) {
            this.d = mSOAServiceInvoke.bizName();
            this.b = mSOAServiceInvoke.serviceId();
            this.c = mSOAServiceInvoke.version();
        }
        this.e = str;
        this.f = map;
        this.g = MSOAServiceDefinition.Platform.NATIVE.value();
        this.k = this.b + "@" + this.c;
        if (TextUtils.isEmpty(str)) {
            this.l = this.d;
            return;
        }
        this.l = this.d + "@" + str;
    }

    public g(String str, String str2, String str3, String str4, Map<String, Object> map) {
        this(str, str2, str3, str4, map, MSOAServiceDefinition.Platform.NATIVE.value());
    }

    public g(String str, String str2, String str3, String str4, Map<String, Object> map, int i) {
        this.c = "1.0";
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = map;
        this.g = i;
        if (TextUtils.isEmpty(this.c)) {
            this.c = "1.0";
        }
        this.k = this.b + "@" + this.c;
        if (TextUtils.isEmpty(str4)) {
            this.l = this.d;
            return;
        }
        this.l = this.d + "@" + str4;
    }
}
