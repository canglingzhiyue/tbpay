package com.taobao.android.dinamicx.template.download;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.au;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import tb.kge;

/* loaded from: classes.dex */
public class DXTemplateItem {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_VERSION = -1;
    public static final byte TEMPLATE_CACHE_PRIORITY_DEFAULT = 0;
    public static final byte TEMPLATE_CACHE_PRIORITY_HIGH = 1;
    public static final int TYPE_CHECK_DOWNLOAING = 2;
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_REMOTE_CHILD = 1;

    /* renamed from: a  reason: collision with root package name */
    public String f11925a;
    public String c;
    public Collection<String> d;
    public f g;
    private String h;
    public long b = -1;
    public boolean e = false;
    public boolean l = false;
    private boolean m = false;
    public boolean f = false;
    private int i = 0;
    private int j = 0;
    private byte k = 0;
    private Boolean n = null;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface TemplateType {
    }

    static {
        kge.a(744380166);
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.m && this.l;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        Boolean bool = this.n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!this.m || (!this.l && !au.a(str, this.f11925a))) {
            z = false;
        }
        this.n = Boolean.valueOf(z);
        return this.n.booleanValue();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.h)) {
            this.h = this.f11925a + " : " + this.b;
        }
        return this.h;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "name=" + this.f11925a + "version=" + this.b + "templateUrl=" + this.c;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.f11925a) && this.b > -1;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.i;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DXTemplateItem dXTemplateItem = (DXTemplateItem) obj;
            String str = this.f11925a;
            if (str == null ? dXTemplateItem.f11925a != null : !str.equals(dXTemplateItem.f11925a)) {
                return false;
            }
            if (this.i == dXTemplateItem.i && this.b == dXTemplateItem.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : b().hashCode();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.j;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f11925a;
    }

    public long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : this.b;
    }

    public byte h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10db", new Object[]{this})).byteValue() : this.k;
    }
}
