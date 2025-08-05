package com.taobao.themis.inside.Initializer.kernel;

import android.app.Application;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.s;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.n;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TMSInitializer:TMSBaseInitTask";

    /* renamed from: a  reason: collision with root package name */
    private final String f22419a;

    static {
        kge.a(1590336376);
    }

    public abstract TMSInitTaskExecutorType a();

    public abstract String b();

    public void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fb02dd", new Object[]{this, application, hashMap});
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public a(String str) {
        this.f22419a = str;
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
        } else if (n.h(b())) {
            TMSLogger.d(TAG, "Skip black list task: " + b());
        } else {
            c();
            try {
                b(application, hashMap);
            } catch (Throwable th) {
                TMSLogger.d(TAG, "Init task execute fail: " + th.getLocalizedMessage());
                TMSLogger.a(TAG, th);
            }
            d();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        g d = s.f18233a.d();
        d.a(this.f22419a + "-start-" + b(), SystemClock.uptimeMillis());
        TMSLogger.d(TAG, this.f22419a + "-start-" + b());
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        g d = s.f18233a.d();
        d.a(this.f22419a + "-end-" + b(), SystemClock.uptimeMillis());
        TMSLogger.d(TAG, this.f22419a + "-end-" + b());
    }
}
