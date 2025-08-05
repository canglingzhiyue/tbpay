package tb;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.split.core.splitinstall.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.android.detail2.core.framework.base.weex.e;
import com.taobao.android.detail2.core.framework.data.net.prerequest.NewDetailPreRequester;
import com.taobao.android.preload.c;
import com.taobao.android.preload.h;
import com.taobao.android.preload.i;
import com.taobao.android.preload.j;
import com.taobao.android.preload.k;
import com.taobao.android.weex_framework.q;
import com.taobao.tao.TBMainHost;
import com.taobao.utils.Global;
import java.util.WeakHashMap;
import tb.bho;

/* loaded from: classes.dex */
public class flp implements fmj, fmm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PRELOAD_LITE_DETAIL_FEATURE_NAME = "ugc_imagecontent_detailpage";
    public static final String PRELOAD_REQUESTER_BIZ_NAME = "new_detail";
    public static final String PRELOAD_REQUESTER_BIZ_NAME_LITE = "lite_detail";

    /* renamed from: a  reason: collision with root package name */
    private static WeakHashMap<String, fmh> f28038a;
    private a b = new a();
    private c.a c = new c.a() { // from class: tb.flp.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.preload.c.a
        public int a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue() : fkt.a(Global.getApplication());
        }
    };

    public static /* synthetic */ void a(flp flpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c9122e", new Object[]{flpVar});
        } else {
            flpVar.d();
        }
    }

    static {
        kge.a(-1073125797);
        kge.a(34088396);
        kge.a(766678834);
        f28038a = new WeakHashMap<>();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c();
        h a2 = i.a("new_detail");
        a2.a(new NewDetailPreRequester());
        a2.a(new com.taobao.android.detail2.core.framework.data.net.prerequest.a());
        j a3 = k.a("new_detail");
        if (a3 == null) {
            return;
        }
        a3.a(this.c);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        g a2 = com.alibaba.android.split.core.splitinstall.h.a(Global.getApplication());
        if (b.a().c(PRELOAD_LITE_DETAIL_FEATURE_NAME) == null) {
            fjt.a(fjt.TAG_RENDER, "图文requester不是dynamicFeature，在包内可以直接访问");
            d();
        } else if (b.a().c(PRELOAD_LITE_DETAIL_FEATURE_NAME) != null && a2.a().contains(PRELOAD_LITE_DETAIL_FEATURE_NAME)) {
            fjt.a(fjt.TAG_RENDER, "图文requester远程化模块可以访问插件包代码");
            d();
        } else {
            bhm.a().a(PRELOAD_LITE_DETAIL_FEATURE_NAME, new bho.a() { // from class: tb.flp.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bho.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    } else if (i != 3) {
                    } else {
                        fjt.a(fjt.TAG_RENDER, "图文requester远程化模块onFeatureStatusChange，status=3");
                        flp.a(flp.this);
                    }
                }
            }, AsyncTask.THREAD_POOL_EXECUTOR);
        }
    }

    private void d() {
        fjt.a("new_detail异常", "registerLiteDetailRequesterImpl执行");
        h a2 = i.a(PRELOAD_REQUESTER_BIZ_NAME_LITE);
        a2.a(new com.taobao.android.detail2.core.framework.data.net.prerequest.b());
        try {
            a2.a((icj) Class.forName("com.taobao.ugc.imagecontent.detailpage.prerequest.ImageContentPreRequester").newInstance());
        } catch (ClassNotFoundException e) {
            fjt.a("new_detail异常", "registerLiteDetailRequesterImpl类加载异常", e);
        } catch (IllegalAccessException e2) {
            fjt.a("new_detail异常", "registerLiteDetailRequesterImpl类加载异常", e2);
        } catch (InstantiationException e3) {
            fjt.a("new_detail异常", "registerLiteDetailRequesterImpl类加载异常", e3);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            fmh.a((fmj) this);
        }
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        fjt.c(fjt.TAG_RENDER, "registerActivityLifeCycle调用");
        application.registerActivityLifecycleCallbacks(this.b);
    }

    private void b(fmh fmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7568d38", new Object[]{this, fmhVar});
        } else if (fmhVar == null) {
        } else {
            fmhVar.a(new e());
            new fjf().a(fmhVar);
            fmhVar.a((fmm) this);
        }
    }

    @Override // tb.fmj
    public void a(fmh fmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d386b7", new Object[]{this, fmhVar});
        } else if (fmhVar == null) {
        } else {
            c(fmhVar);
            b(fmhVar);
        }
    }

    private void c(fmh fmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5d993b9", new Object[]{this, fmhVar});
        } else if (fmhVar == null) {
        } else {
            f28038a.put(String.valueOf(fmhVar.c()), fmhVar);
        }
    }

    public static fmh a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fmh) ipChange.ipc$dispatch("7c6f51b3", new Object[]{str});
        }
        WeakHashMap<String, fmh> weakHashMap = f28038a;
        if (weakHashMap != null && weakHashMap.size() != 0 && !TextUtils.isEmpty(str)) {
            return f28038a.get(str);
        }
        return null;
    }

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        if (uri != null) {
            return uri.getQueryParameter("controllerId");
        }
        return null;
    }

    public static fmh b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fmh) ipChange.ipc$dispatch("ca6c2fe7", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        String a2 = a(uri);
        if (!TextUtils.isEmpty(a2)) {
            return a(a2);
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-191580106);
            kge.a(-1894394539);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }

        private a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            TBMainHost.a();
            if (TBMainHost.fromActivity(activity) == null) {
                return;
            }
            fjt.a(fjt.TAG_RENDER, "首页Activity onDestroy");
            q.a().b();
        }
    }
}
