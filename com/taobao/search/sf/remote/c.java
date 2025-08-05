package com.taobao.search.sf.remote;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.tasks.e;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.tao.Globals;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.bhc;
import tb.bhf;
import tb.imn;
import tb.ius;
import tb.kge;

/* loaded from: classes8.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static RemoteWidgetFactory f19480a;
    private static boolean b;
    private static TaowiseRemoteWidgetFactory c;

    static {
        kge.a(-336253183);
        INSTANCE = new c();
    }

    private c() {
    }

    public static final /* synthetic */ RemoteWidgetFactory a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteWidgetFactory) ipChange.ipc$dispatch("fced24e9", new Object[]{cVar}) : f19480a;
    }

    public static final /* synthetic */ void a(c cVar, RemoteWidgetFactory remoteWidgetFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9059cfab", new Object[]{cVar, remoteWidgetFactory});
        } else {
            f19480a = remoteWidgetFactory;
        }
    }

    public static final /* synthetic */ void a(c cVar, TaowiseRemoteWidgetFactory taowiseRemoteWidgetFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491e2c6b", new Object[]{cVar, taowiseRemoteWidgetFactory});
        } else {
            c = taowiseRemoteWidgetFactory;
        }
    }

    public static final /* synthetic */ void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f592fd", new Object[]{cVar, new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static final /* synthetic */ TaowiseRemoteWidgetFactory b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaowiseRemoteWidgetFactory) ipChange.ipc$dispatch("625c11f4", new Object[]{cVar}) : c;
    }

    public static final /* synthetic */ boolean c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ccc86779", new Object[]{cVar})).booleanValue() : b;
    }

    public final void a(imn core) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf4cace", new Object[]{this, core});
            return;
        }
        q.c(core, "core");
        RemoteWidgetFactory remoteWidgetFactory = f19480a;
        if (remoteWidgetFactory != null) {
            remoteWidgetFactory.registerRemoteWidget(core);
            return;
        }
        Application application = Globals.getApplication();
        h.a(application).a(j.a().a(bhf.a(application, RemoteWidgetFactory.class).a(new b(core)).a()).a());
    }

    /* loaded from: classes8.dex */
    public static final class b implements bhc.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ imn f19482a;

        @Override // tb.bhc.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
            }
        }

        public b(imn imnVar) {
            this.f19482a = imnVar;
        }

        @Override // tb.bhc.b
        public void a(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                return;
            }
            if (!(obj instanceof RemoteWidgetFactory)) {
                obj = null;
            }
            RemoteWidgetFactory remoteWidgetFactory = (RemoteWidgetFactory) obj;
            if (remoteWidgetFactory == null) {
                return;
            }
            c.a(c.INSTANCE, remoteWidgetFactory);
            RemoteWidgetFactory a2 = c.a(c.INSTANCE);
            if (a2 == null) {
                return;
            }
            a2.registerRemoteWidget(this.f19482a);
        }
    }

    public final void b(String widgetName, d remoteWidgetParam, com.taobao.search.sf.remote.b widgetCallback) {
        ius<?, ? extends View, ?> createRemoteWidget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5cf95b5", new Object[]{this, widgetName, remoteWidgetParam, widgetCallback});
            return;
        }
        q.c(widgetName, "widgetName");
        q.c(remoteWidgetParam, "remoteWidgetParam");
        q.c(widgetCallback, "widgetCallback");
        TaowiseRemoteWidgetFactory taowiseRemoteWidgetFactory = c;
        if (taowiseRemoteWidgetFactory == null) {
            try {
                com.alibaba.flexa.compat.c.a("com.taobao.taowise.remote.TwRemoteFactoryImpl", new C0789c(widgetName, remoteWidgetParam, widgetCallback));
            } catch (Throwable unused) {
            }
        } else if (taowiseRemoteWidgetFactory == null || (createRemoteWidget = taowiseRemoteWidgetFactory.createRemoteWidget(widgetName, remoteWidgetParam)) == null) {
        } else {
            try {
                widgetCallback.a(createRemoteWidget);
            } catch (Throwable th) {
                k.a("RemoteWidgetCreator", "创建语音搜失败", th);
            }
        }
    }

    /* renamed from: com.taobao.search.sf.remote.c$c  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C0789c implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19483a;
        public final /* synthetic */ d b;
        public final /* synthetic */ com.taobao.search.sf.remote.b c;

        /* renamed from: com.taobao.search.sf.remote.c$c$a */
        /* loaded from: classes8.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Class b;

            public a(Class cls) {
                this.b = cls;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.INSTANCE;
                Object newInstance = this.b.newInstance();
                if (newInstance != null) {
                    c.a(cVar, (TaowiseRemoteWidgetFactory) newInstance);
                    TaowiseRemoteWidgetFactory b = c.b(c.INSTANCE);
                    if (b == null) {
                        q.a();
                    }
                    ius<?, ? extends View, ?> createRemoteWidget = b.createRemoteWidget(C0789c.this.f19483a, C0789c.this.b);
                    if (createRemoteWidget == null) {
                        return;
                    }
                    try {
                        C0789c.this.c.a(createRemoteWidget);
                        return;
                    } catch (Throwable th) {
                        k.a("RemoteWidgetCreator", "创建语音搜失败", th);
                        return;
                    }
                }
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.remote.TaowiseRemoteWidgetFactory");
            }
        }

        /* renamed from: com.taobao.search.sf.remote.c$c$b */
        /* loaded from: classes8.dex */
        public static final class b<TResult> implements e<Integer> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // com.alibaba.android.split.core.tasks.e
            public /* synthetic */ void onSuccess(Integer num) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, num});
                } else {
                    a(num);
                }
            }

            public final void a(Integer num) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
                } else {
                    c.INSTANCE.b(C0789c.this.f19483a, C0789c.this.b, C0789c.this.c);
                }
            }
        }

        public C0789c(String str, d dVar, com.taobao.search.sf.remote.b bVar) {
            this.f19483a = str;
            this.b = dVar;
            this.c = bVar;
        }

        @Override // com.alibaba.flexa.compat.c.a
        public void onClassLoaded(Class<?> aClass) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, aClass});
                return;
            }
            q.c(aClass, "aClass");
            new Handler(Looper.getMainLooper()).post(new a(aClass));
        }

        @Override // com.alibaba.flexa.compat.c.a
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            k.a("RemoteWidgetCreator", "问问语音搜类未找到");
            if (c.c(c.INSTANCE)) {
                return;
            }
            c.a(c.INSTANCE, true);
            h.a(Globals.getApplication()).a(j.a().a("taowise_android_aar").a()).a(new b());
        }
    }

    public final void a(String widgetName, d remoteWidgetParam, com.taobao.search.sf.remote.b widgetCallback) {
        ius<?, ? extends View, ?> createRemoteWidget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede32834", new Object[]{this, widgetName, remoteWidgetParam, widgetCallback});
            return;
        }
        q.c(widgetName, "widgetName");
        q.c(remoteWidgetParam, "remoteWidgetParam");
        q.c(widgetCallback, "widgetCallback");
        RemoteWidgetFactory remoteWidgetFactory = f19480a;
        if (remoteWidgetFactory == null) {
            Activity a2 = remoteWidgetParam.a();
            h.a(a2).a(j.a().a(bhf.a(a2, RemoteWidgetFactory.class).a(new a(widgetName, remoteWidgetParam, widgetCallback)).a()).a());
            return;
        }
        if (remoteWidgetFactory != null && (createRemoteWidget = remoteWidgetFactory.createRemoteWidget(widgetName, remoteWidgetParam)) != null) {
            try {
                widgetCallback.a(createRemoteWidget);
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class a implements bhc.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19481a;
        public final /* synthetic */ d b;
        public final /* synthetic */ com.taobao.search.sf.remote.b c;

        @Override // tb.bhc.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
            }
        }

        public a(String str, d dVar, com.taobao.search.sf.remote.b bVar) {
            this.f19481a = str;
            this.b = dVar;
            this.c = bVar;
        }

        @Override // tb.bhc.b
        public void a(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                return;
            }
            if (!(obj instanceof RemoteWidgetFactory)) {
                obj = null;
            }
            RemoteWidgetFactory remoteWidgetFactory = (RemoteWidgetFactory) obj;
            if (remoteWidgetFactory == null) {
                return;
            }
            c.a(c.INSTANCE, remoteWidgetFactory);
            ius<?, ? extends View, ?> createRemoteWidget = remoteWidgetFactory.createRemoteWidget(this.f19481a, this.b);
            if (createRemoteWidget == null) {
                return;
            }
            try {
                this.c.a(createRemoteWidget);
            } catch (Throwable unused) {
            }
        }
    }
}
