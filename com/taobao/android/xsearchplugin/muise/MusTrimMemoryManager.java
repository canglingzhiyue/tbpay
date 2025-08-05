package com.taobao.android.xsearchplugin.muise;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.q;
import tb.iru;
import tb.kge;

/* loaded from: classes6.dex */
public final class MusTrimMemoryManager extends d implements LifecycleObserver, ComponentCallbacks2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f16252a;
    private final ArrayList<b<?, ?>> b;
    private final Context c;
    private final iru<?> d;

    static {
        kge.a(172473546);
        kge.a(-418195541);
        kge.a(2139684418);
    }

    public static /* synthetic */ Object ipc$super(MusTrimMemoryManager musTrimMemoryManager, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        }
    }

    public MusTrimMemoryManager(Context context, iru<?> widgetModelAdapter) {
        q.c(context, "context");
        q.c(widgetModelAdapter, "widgetModelAdapter");
        this.c = context;
        this.d = widgetModelAdapter;
        this.f16252a = "MusTrimMemoryManager";
        this.b = new ArrayList<>();
        this.c.registerComponentCallbacks(this);
        Context context2 = this.c;
        if (context2 instanceof LifecycleOwner) {
            ((LifecycleOwner) context2).getLifecycle().addObserver(this);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        String str = this.f16252a;
        com.taobao.android.searchbaseframe.util.k.a(str, "onTrimMemory: " + i);
        if (q.a(this.d.d(), this.d.b())) {
            Iterator<b<?, ?>> it = a().iterator();
            while (it.hasNext()) {
                b<?, ?> musCell = it.next();
                q.a((Object) musCell, "musCell");
                if (!musCell.Q() && musCell.i) {
                    b(musCell);
                    i2++;
                }
            }
        } else {
            Iterator<b<?, ?>> it2 = a().iterator();
            while (it2.hasNext()) {
                b<?, ?> musCell2 = it2.next();
                q.a((Object) musCell2, "musCell");
                b(musCell2);
                i2++;
            }
        }
        String str2 = this.f16252a;
        com.taobao.android.searchbaseframe.util.k.a(str2, "destroy " + i2 + " cells when trim memory");
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.c.unregisterComponentCallbacks(this);
        if (!(!a().isEmpty())) {
            return;
        }
        a().clear();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
        } else {
            e();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Iterator<b<?, ?>> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().H();
        }
        this.b.clear();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Iterator<b<?, ?>> it = a().iterator();
        while (it.hasNext()) {
            b<?, ?> musCell = it.next();
            q.a((Object) musCell, "musCell");
            if (!musCell.Q()) {
                b(musCell);
                i++;
            }
        }
        String str = this.f16252a;
        com.taobao.android.searchbaseframe.util.k.e(str, "destroy " + i + " cells when tab leave");
    }

    private final void b(b<?, ?> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51716fc1", new Object[]{this, bVar});
            return;
        }
        View itemView = bVar.itemView;
        q.a((Object) itemView, "itemView");
        itemView.getLayoutParams().height = itemView.getHeight();
        bVar.G();
        if (!bVar.Q()) {
            return;
        }
        this.b.add(bVar);
    }
}
