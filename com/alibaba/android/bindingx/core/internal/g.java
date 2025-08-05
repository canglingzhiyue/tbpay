package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.AnimationUtils;
import com.alibaba.android.bindingx.core.d;
import com.alibaba.android.bindingx.core.internal.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class g extends AbstractEventHandler implements b.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long n;
    private b o;
    private boolean p;

    static {
        kge.a(-1210639568);
        kge.a(-225136413);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 69046641) {
            super.a((String) objArr[0], (Map) objArr[1], (l) objArr[2], (List) objArr[3], (d.a) objArr[4]);
            return null;
        } else if (hashCode != 90991720) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a();
            return null;
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public g(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
        super(context, iVar, objArr);
        this.n = 0L;
        this.p = false;
        b bVar = this.o;
        if (bVar == null) {
            this.o = b.a();
        } else {
            bVar.b();
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, com.alibaba.android.bindingx.core.e
    public void a(String str, Map<String, Object> map, l lVar, List<Map<String, Object>> list, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d9171", new Object[]{this, str, map, lVar, list, aVar});
            return;
        }
        super.a(str, map, lVar, list, aVar);
        if (this.o == null) {
            this.o = b.a();
        }
        a("start", 0L, new Object[0]);
        this.o.b();
        this.o.a(this);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        long j = 0;
        if (this.n == 0) {
            this.n = AnimationUtils.currentAnimationTimeMillis();
            this.p = false;
        } else {
            j = AnimationUtils.currentAnimationTimeMillis() - this.n;
        }
        try {
            if (com.alibaba.android.bindingx.core.h.f2229a) {
                com.alibaba.android.bindingx.core.h.b(String.format(Locale.getDefault(), "[TimingHandler] timing elapsed. (t:%d)", Long.valueOf(j)));
            }
            JSMath.applyTimingValuesToScope(this.d, j);
            if (!this.p) {
                a(this.f2232a, this.d, "timing");
            }
            this.p = a(this.k, this.d);
        } catch (Exception e) {
            com.alibaba.android.bindingx.core.h.a("runtime error", e);
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        a("end", System.currentTimeMillis() - this.n, new Object[0]);
        d();
        b bVar = this.o;
        if (bVar != null) {
            bVar.b();
        }
        this.n = 0L;
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler, com.alibaba.android.bindingx.core.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        d();
        b bVar = this.o;
        if (bVar != null) {
            bVar.c();
            this.o = null;
        }
        this.n = 0L;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void d(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
            return;
        }
        a("exit", (long) ((Double) map.get("t")).doubleValue(), new Object[0]);
        b bVar = this.o;
        if (bVar != null) {
            bVar.b();
        }
        this.n = 0L;
        if (this.j == null || TextUtils.isEmpty(this.g)) {
            return;
        }
        this.j.a(this.g);
        this.j = null;
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            a(BindingXConstants.STATE_INTERCEPTOR, (long) ((Double) map.get("t")).doubleValue(), Collections.singletonMap(BindingXConstants.STATE_INTERCEPTOR, str));
        }
    }

    private void a(String str, long j, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f0e351f", new Object[]{this, str, new Long(j), objArr});
        } else if (this.c == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            hashMap.put("t", Long.valueOf(j));
            hashMap.put("token", this.g);
            if (objArr != null && objArr.length > 0 && (objArr[0] instanceof Map)) {
                hashMap.putAll((Map) objArr[0]);
            }
            this.c.a(hashMap);
            com.alibaba.android.bindingx.core.h.b(">>>>>>>>>>>fire event:(" + str + "," + j + riy.BRACKET_END_STR);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.b.a
    public void g_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b513655f", new Object[]{this});
        } else {
            e();
        }
    }
}
