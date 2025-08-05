package com.taobao.android.detail.core.async;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.tao.Globals;
import java.lang.reflect.Field;
import java.util.List;
import tb.ear;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_ASYNC_CREATE_VIEW_SIZE = 25;
    public static final String TAG = "AsyncPreloadDX2";

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f9374a;

    static {
        kge.a(1125316345);
    }

    private b() {
        emu.a("com.taobao.android.detail.core.async.AsyncPreloadDX2");
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1a46ccf3", new Object[0]);
        }
        if (f9374a == null) {
            synchronized (b.class) {
                if (f9374a == null) {
                    f9374a = new b();
                }
            }
        }
        return f9374a;
    }

    public void a(List<DinamicTemplate> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        String a2 = com.taobao.android.detail.core.performance.a.a(TAG);
        i.c(a2, "startAsyncCreateView templates " + list.size());
        a aVar = new a(list);
        aVar.setName("async-render-dx2-thread");
        aVar.start();
    }

    public com.taobao.android.dinamic.view.b a(Context context, ViewGroup viewGroup, DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamic.view.b) ipChange.ipc$dispatch("f208262f", new Object[]{this, context, viewGroup, dinamicTemplate}) : ear.a().b(context, viewGroup, dinamicTemplate, null);
    }

    /* loaded from: classes4.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public List<DinamicTemplate> f9375a;

        static {
            kge.a(-1998484074);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(List<DinamicTemplate> list) {
            this.f9375a = list;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                a(this.f9375a);
            }
        }

        private void a(List<DinamicTemplate> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else if (list == null) {
            } else {
                String a2 = com.taobao.android.detail.core.performance.a.a(b.TAG);
                i.d(a2, "asyncCreateTemplateView " + list.size() + "...");
                ear.a().a(Globals.getApplication(), list);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            List<DinamicTemplate> list = this.f9375a;
            if (list != null && list.size() != 0) {
                try {
                    Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(Looper.getMainLooper());
                    if (obj instanceof ThreadLocal) {
                        ((ThreadLocal) obj).set(Looper.getMainLooper());
                    }
                    try {
                        a();
                    } catch (Exception e) {
                        i.a(com.taobao.android.detail.core.performance.a.a(b.TAG), "runInner", e);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
