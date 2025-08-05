package io.unicorn.adapter.muise;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.instance.WeexCanalMainInstance;
import com.taobao.android.weex.instance.WeexCanalSubInstance;
import com.taobao.android.weex_framework.ui.i;
import com.taobao.android.weex_framework.ui.n;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_framework.util.s;
import io.unicorn.adapter.UnicornAdapterJNI;
import io.unicorn.embedding.android.RenderMode;
import io.unicorn.embedding.android.TransparencyMode;
import io.unicorn.embedding.android.f;
import io.unicorn.embedding.android.h;
import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.embedding.engine.a;
import io.unicorn.embedding.engine.b;
import io.unicorn.embedding.engine.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import tb.juh;
import tb.jui;
import tb.juk;
import tb.kge;

/* loaded from: classes9.dex */
public class UnicornMuiseJNI {
    private static final String PREFIX_ENGINE_ID = "Weex_";

    static {
        kge.a(626473230);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bindUnicornComponentWithEngine(io.unicorn.embedding.engine.a aVar, String str, WeexInstanceImpl weexInstanceImpl, long j, juk jukVar) {
        s.a("bindUnicornComponentWithEngine");
        bindUnicornEngineId(aVar.f().getUnicornEngineId(), j);
        aVar.j().a(weexInstanceImpl);
        h.a a2 = h.a(str).a(true);
        WeexUnicornConfig a3 = weexInstanceImpl.getInstanceConfig().a();
        if (a3 == null) {
            a3 = new WeexUnicornConfig();
        }
        RenderMode renderMode = RenderMode.surface;
        if (a3.b() == WeexUnicornConfig.RenderMode.texture) {
            renderMode = RenderMode.texture;
        } else if (a3.b() == WeexUnicornConfig.RenderMode.image) {
            renderMode = RenderMode.image;
        } else if (a3.b() == WeexUnicornConfig.RenderMode.offscreen) {
            renderMode = RenderMode.offscreen;
        }
        a2.a(renderMode);
        if (a3.a()) {
            a2.a(TransparencyMode.transparent);
        }
        final i k = jukVar.k();
        if (k != null) {
            a2.a(new f() { // from class: io.unicorn.adapter.muise.UnicornMuiseJNI.3
                @Override // io.unicorn.embedding.android.f
                public View a(Context context, Bundle bundle) {
                    return i.this.a(context, bundle);
                }

                @Override // io.unicorn.embedding.android.f
                public void a(Runnable runnable) {
                    i.this.a(runnable);
                }
            });
        }
        h a4 = a2.a(weexInstanceImpl.getContext());
        a4.a(j);
        jukVar.b(a4);
        s.b("bindUnicornComponentWithEngine");
    }

    private static void bindUnicornEngineId(long j, long j2) {
        if (j != 0) {
            nativeBindUnicornEngineId(j, j2);
        }
    }

    public static void createEmbedUnicornComponent(WeexInstanceImpl weexInstanceImpl, String str, double d, double d2, int i) {
        if (weexInstanceImpl == null || weexInstanceImpl.isDestroyed()) {
            return;
        }
        WeexInstance a2 = ((juk) weexInstanceImpl.getExtend(juh.class)).a(weexInstanceImpl.getContext(), str, i, com.taobao.android.weex_framework.util.i.b(weexInstanceImpl.getContext(), (float) d), com.taobao.android.weex_framework.util.i.b(weexInstanceImpl.getContext(), (float) d2));
        a2.initWithURL(str);
        a2.render(null);
    }

    public static void createEmbedUnicornComponentAsync(final WeexInstanceImpl weexInstanceImpl, final String str, final double d, final double d2, final int i) {
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new o() { // from class: io.unicorn.adapter.muise.UnicornMuiseJNI.4
            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                if (WeexInstanceImpl.this == null) {
                    return;
                }
                s.a("createEmbedUnicornComponentAsync");
                synchronized (WeexInstanceImpl.this) {
                    if (WeexInstanceImpl.this.isDestroyed()) {
                        s.b("createEmbedUnicornComponentAsync");
                        return;
                    }
                    WeexInstance b = ((juk) WeexInstanceImpl.this.getExtend(juh.class)).b(WeexInstanceImpl.this.getContext(), str, i, com.taobao.android.weex_framework.util.i.b(WeexInstanceImpl.this.getContext(), (float) d), com.taobao.android.weex_framework.util.i.b(WeexInstanceImpl.this.getContext(), (float) d2));
                    b.initWithURL(str);
                    b.render(null);
                    s.b("createEmbedUnicornComponentAsync");
                }
            }
        });
    }

    public static void createUnicornComponent(WeexInstanceImpl weexInstanceImpl, long j) {
        String str;
        boolean z;
        s.a("createUnicornComponent");
        int instanceId = weexInstanceImpl.getInstanceId();
        final juk jukVar = (juk) weexInstanceImpl.getExtend(juh.class);
        boolean m = jukVar.m();
        ArrayList arrayList = new ArrayList(jukVar.j());
        Context context = weexInstanceImpl.getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getIntent() != null) {
                arrayList.addAll(Arrays.asList(d.a(activity.getIntent()).a()));
            }
        }
        boolean z2 = weexInstanceImpl instanceof WeexCanalSubInstance;
        boolean z3 = false;
        if (z2) {
            str = ((WeexCanalSubInstance) weexInstanceImpl).a((String[]) arrayList.toArray(new String[0]));
        } else {
            str = PREFIX_ENGINE_ID + instanceId;
        }
        if (m) {
            bindUnicornEngineId(b.a().a(PREFIX_ENGINE_ID + jukVar.n().getInstanceId()).f().getUnicornEngineId(), j);
            s.b("createUnicornComponent");
            return;
        }
        io.unicorn.embedding.engine.a aVar = null;
        if (!z2 && com.taobao.android.weex_framework.util.f.m() && context != null && (aVar = b.a().b()) != null) {
            s.a("reuseUnicornEngine");
            aVar.d(context, (String[]) arrayList.toArray(new String[0]));
            b.a().a(str, aVar);
            s.b("reuseUnicornEngine");
        }
        if (aVar == null) {
            z = arrayList.contains("--enable-async-shell-setup=true") && !z2;
            if (z) {
                arrayList.add("--use-async-setup=true");
                aVar = createUnicornEngineAsync(weexInstanceImpl, (String[]) arrayList.toArray(new String[0]), str, j, jukVar);
            } else {
                aVar = createUnicornEngine(weexInstanceImpl, str, (String[]) arrayList.toArray(new String[0]));
            }
        } else {
            z = false;
        }
        if (!z2) {
            z3 = true;
        }
        aVar.a(z3);
        aVar.a(new a.InterfaceC1058a() { // from class: io.unicorn.adapter.muise.UnicornMuiseJNI.2
            @Override // io.unicorn.embedding.engine.a.InterfaceC1058a
            public void a() {
            }

            @Override // io.unicorn.embedding.engine.a.InterfaceC1058a
            public void b() {
                Map<Integer, WeexInstance> l = juk.this.l();
                for (Map.Entry<Integer, WeexInstance> entry : l.entrySet()) {
                    entry.getValue().destroy();
                }
                l.clear();
            }
        });
        if (!z) {
            bindUnicornComponentWithEngine(aVar, str, weexInstanceImpl, j, jukVar);
        }
        s.b("createUnicornComponent");
    }

    public static void createUnicornComponentController(final WeexInstanceImpl weexInstanceImpl, final long j) {
        s.a("createUnicornComponentController");
        ((juk) weexInstanceImpl.getExtend(juh.class)).a(new n() { // from class: io.unicorn.adapter.muise.UnicornMuiseJNI.1
            @Override // com.taobao.android.weex_framework.ui.n
            public void a(WeexInstanceImpl weexInstanceImpl2) {
                UnicornMuiseJNI.createUnicornComponent(WeexInstanceImpl.this, j);
            }
        });
        s.b("createUnicornComponentController");
    }

    private static io.unicorn.embedding.engine.a createUnicornEngine(WeexInstanceImpl weexInstanceImpl, String str, String[] strArr) {
        s.a("createUnicornEngine");
        Context context = weexInstanceImpl.getContext();
        io.unicorn.embedding.engine.a a2 = b.a().a(str);
        if (a2 == null && UnicornAdapterJNI.instance().libraryLoaded() && context != null) {
            a2 = new io.unicorn.embedding.engine.a(context, (String[]) null, strArr);
            b.a().a(str, a2);
        }
        s.b("createUnicornEngine");
        return a2;
    }

    private static io.unicorn.embedding.engine.a createUnicornEngineAsync(final WeexInstanceImpl weexInstanceImpl, String[] strArr, final String str, final long j, final juk jukVar) {
        s.a("createUnicornEngine");
        Context context = weexInstanceImpl.getContext();
        io.unicorn.embedding.engine.a a2 = b.a().a(str);
        if (a2 == null && UnicornAdapterJNI.instance().libraryLoaded() && context != null) {
            final io.unicorn.embedding.engine.a aVar = new io.unicorn.embedding.engine.a(context, true);
            g.d("create engine async put engine with id:" + str);
            b.a().a(str, aVar);
            aVar.a(new FlutterJNI.d() { // from class: io.unicorn.adapter.muise.UnicornMuiseJNI.5
                @Override // io.unicorn.embedding.engine.FlutterJNI.d
                public void a() {
                    if (!WeexInstanceImpl.this.isDestroyed()) {
                        g.d("shell async onReady success");
                        UnicornMuiseJNI.bindUnicornComponentWithEngine(aVar, str, WeexInstanceImpl.this, j, jukVar);
                        return;
                    }
                    g.d("shell async onReady return, isDestroyed");
                    aVar.a();
                    b.a().b(str);
                }
            });
            aVar.b(context, strArr);
            a2 = aVar;
        }
        s.b("createUnicornEngine");
        return a2;
    }

    public static void createUnicornEngineGroup(WeexInstanceImpl weexInstanceImpl) {
        WeexCanalMainInstance weexCanalMainInstance = (WeexCanalMainInstance) weexInstanceImpl;
        weexCanalMainInstance.a(new a(weexInstanceImpl.getContext(), null, (String[]) weexCanalMainInstance.b().toArray(new String[0])));
    }

    public static void createWidgetUnicornComponent(WeexInstanceImpl weexInstanceImpl, double d, double d2, int i, HashMap<String, String> hashMap) {
        ((jui) weexInstanceImpl.getExtend(jui.class)).a(i, hashMap);
    }

    public static void destroyEmbedUnicornComponent(WeexInstanceImpl weexInstanceImpl, int i) {
        destroyExternalUnicornComponent(weexInstanceImpl, i);
    }

    public static void destroyExternalUnicornComponent(WeexInstanceImpl weexInstanceImpl, int i) {
        if (weexInstanceImpl == null) {
            return;
        }
        ((jui) weexInstanceImpl.getExtend(jui.class)).a(i);
        juk jukVar = (juk) weexInstanceImpl.getExtend(juh.class);
        WeexInstance b = jukVar.b(i);
        if (b == null) {
            return;
        }
        jukVar.c(i);
        b.destroy();
    }

    public static void destroyRenderEngine(long j) {
        nativeDestroyRenderEngine(j);
    }

    public static void destroyWidgetUnicornComponent(WeexInstanceImpl weexInstanceImpl, int i) {
        destroyExternalUnicornComponent(weexInstanceImpl, i);
    }

    public static HashMap<String, String> getPerformanceInfo(long j) {
        return nativeGetUnicornMuiseFirstScreenInfo(j, false);
    }

    public static HashMap<String, String> getUnicornMuiseFirstScreenInfo(long j) {
        return nativeGetUnicornMuiseFirstScreenInfo(j, true);
    }

    private static native void nativeBindUnicornEngineId(long j, long j2);

    private static native void nativeDestroyRenderEngine(long j);

    private static native HashMap<String, String> nativeGetUnicornMuiseFirstScreenInfo(long j, boolean z);

    public static void updateEmbedUnicornComponent(WeexInstanceImpl weexInstanceImpl, String str, double d, double d2, int i) {
        destroyEmbedUnicornComponent(weexInstanceImpl, i);
        createEmbedUnicornComponent(weexInstanceImpl, str, d, d2, i);
    }

    public static void updateWidgetUnicornComponent(WeexInstanceImpl weexInstanceImpl, String str, double d, double d2, int i) {
    }
}
