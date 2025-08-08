package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.android.bindingx.core.internal.s;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.kge;
import tb.mto;
import tb.riy;

/* loaded from: classes2.dex */
public class e extends AbstractEventHandler implements View.OnTouchListener, s.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private s n;
    private double o;

    static {
        kge.a(1637651836);
        kge.a(-468432129);
        kge.a(865768304);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    public e(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
        super(context, iVar, objArr);
        this.n = new s(this);
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void d(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
        } else {
            a("exit", ((Double) map.get("r")).doubleValue(), new Object[0]);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.AbstractEventHandler
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            a(BindingXConstants.STATE_INTERCEPTOR, ((Double) map.get("r")).doubleValue(), Collections.singletonMap(BindingXConstants.STATE_INTERCEPTOR, str));
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        View a2 = this.i.b().a(str, StringUtils.isEmpty(this.f) ? this.e : this.f);
        if (a2 == null) {
            com.alibaba.android.bindingx.core.h.d("[RotationHandler] onCreate failed. sourceView not found:" + str);
            return false;
        }
        a2.setOnTouchListener(this);
        com.alibaba.android.bindingx.core.h.b("[RotationHandler] onCreate success. {source:" + str + ",type:" + str2 + riy.BLOCK_END_STR);
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.e
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        View a2 = this.i.b().a(str, StringUtils.isEmpty(this.f) ? this.e : this.f);
        com.alibaba.android.bindingx.core.h.b("remove touch listener success.[" + str + "," + str2 + riy.ARRAY_END_STR);
        if (a2 == null) {
            return false;
        }
        a2.setOnTouchListener(null);
        return true;
    }

    private void a(String str, double d, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ebd565", new Object[]{this, str, new Double(d), objArr});
        } else if (this.c == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            hashMap.put("rotation", Double.valueOf(d));
            hashMap.put("token", this.g);
            if (objArr != null && objArr.length > 0 && (objArr[0] instanceof Map)) {
                hashMap.putAll((Map) objArr[0]);
            }
            this.c.a(hashMap);
            com.alibaba.android.bindingx.core.h.b(">>>>>>>>>>>fire event:(" + str + "," + d + riy.BRACKET_END_STR);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue() : this.n.a(motionEvent);
    }

    @Override // com.alibaba.android.bindingx.core.internal.s.a
    public void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10d15c1", new Object[]{this, sVar});
            return;
        }
        try {
            this.o += sVar.b();
            if (com.alibaba.android.bindingx.core.h.f2229a) {
                com.alibaba.android.bindingx.core.h.b(String.format(Locale.getDefault(), "[RotationHandler] current rotation in degrees: %f", Double.valueOf(this.o)));
            }
            JSMath.applyRotationInDegreesToScope(this.d, this.o);
            if (a(this.k, this.d)) {
                return;
            }
            a(this.f2232a, this.d, "rotation");
        } catch (Exception e) {
            com.alibaba.android.bindingx.core.h.a("runtime error", e);
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.s.a
    public void b(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24983382", new Object[]{this, sVar});
            return;
        }
        com.alibaba.android.bindingx.core.h.b("[RotationHandler] rotation gesture begin");
        a("start", mto.a.GEO_NOT_SUPPORT, new Object[0]);
    }

    @Override // com.alibaba.android.bindingx.core.internal.s.a
    public void c(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68235143", new Object[]{this, sVar});
            return;
        }
        com.alibaba.android.bindingx.core.h.b("[RotationHandler] rotation gesture end");
        a("end", this.o, new Object[0]);
        this.o = mto.a.GEO_NOT_SUPPORT;
    }
}
