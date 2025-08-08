package com.taobao.search.sf;

import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import com.taobao.search.common.util.r;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes8.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static boolean c;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19451a = r.bS();
    private final LinkedList<com.taobao.android.weex_framework.p> b = new LinkedList<>();

    static {
        kge.a(-1639818348);
        Companion = new a(null);
    }

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(286514652);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public static final /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f8ac8da", new Object[]{aVar});
            } else {
                aVar.a();
            }
        }

        private final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (h.b()) {
            } else {
                h.a(true);
                AppMonitor.register("TBSearchLeak", "MusLeak", MeasureSet.create(), DimensionSet.create());
            }
        }
    }

    public static final /* synthetic */ void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    public static final /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : c;
    }

    public final void a(com.taobao.android.weex_framework.p instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, instance});
            return;
        }
        q.c(instance, "instance");
        if (!this.f19451a) {
            return;
        }
        this.b.add(instance);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f19451a) {
        } else {
            Iterator<com.taobao.android.weex_framework.p> it = this.b.iterator();
            q.a((Object) it, "instances.iterator()");
            while (it.hasNext()) {
                com.taobao.android.weex_framework.p next = it.next();
                q.a((Object) next, "iterator.next()");
                com.taobao.android.weex_framework.p pVar = next;
                if (!pVar.isDestroyed()) {
                    b(pVar);
                    pVar.destroy();
                }
            }
            this.b.clear();
        }
    }

    public final void a(String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, name});
            return;
        }
        q.c(name, "name");
        a.a(Companion);
        AppMonitor.Counter.commit("TBSearchLeak", "MusLeak", name, 1.0d);
    }

    private final void b(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("194dea44", new Object[]{this, pVar});
            return;
        }
        a.a(Companion);
        String str = (String) pVar.getTag(SFMuiseSDK.MUISE_BUNDLE_TYPE);
        if (StringUtils.isEmpty(str)) {
            if (pVar == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.weex_framework.MUSDKInstance");
            }
            str = ((MUSDKInstance) pVar).getInstanceEnv("bundleUrl");
        }
        if (StringUtils.isEmpty(str)) {
            return;
        }
        AppMonitor.Counter.commit("TBSearchLeak", "MusLeak", str, 1.0d);
    }
}
