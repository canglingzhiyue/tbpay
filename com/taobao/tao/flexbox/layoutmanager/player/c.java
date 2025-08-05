package com.taobao.tao.flexbox.layoutmanager.player;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.bl;
import com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import com.taobao.tao.flexbox.layoutmanager.component.m;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.event.h;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.ksx;
import tb.ksz;
import tb.oeb;
import tb.ogg;
import tb.ogv;
import tb.ohg;
import tb.suz;

/* loaded from: classes8.dex */
public class c implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static int f20466a = 0;
    public static boolean b = false;
    public static float c = 0.0f;
    private static c d = null;
    public static final String image_test_biz_name = "guangguangvideo";
    public static final int image_test_optimise_biz_code = 9103;
    public static final int image_test_origin_biz_code = 9104;
    private ksz e;
    private InterfaceC0852c g;
    private d h;
    private Map<String, Object> i;
    private WeakReference<Context> l;
    private boolean f = false;
    private HashMap<String, b> j = new HashMap<>(f20466a);
    private String k = "";
    private Map<String, a> m = new HashMap();

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f20468a;
        public int b;

        static {
            kge.a(1896774478);
        }
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public IPlayBack f20469a;
        public TBVideoComponent b;
        public String c;

        static {
            kge.a(-1152878638);
        }

        public b(IPlayBack iPlayBack, TBVideoComponent tBVideoComponent, String str) {
            this.f20469a = iPlayBack;
            this.b = tBVideoComponent;
            this.c = str;
        }
    }

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.player.c$c  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0852c {
        void a(bl blVar);

        void a(boolean z);
    }

    /* loaded from: classes8.dex */
    public interface d {
        void a(b bVar);
    }

    public static /* synthetic */ ksz a(c cVar, ksz kszVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksz) ipChange.ipc$dispatch("b380bb9b", new Object[]{cVar, kszVar});
        }
        cVar.e = kszVar;
        return kszVar;
    }

    static {
        kge.a(1940964743);
        kge.a(2045580165);
        f20466a = 1;
        b = false;
        c = 0.5f;
        d = null;
    }

    public static synchronized c a() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("94082edb", new Object[0]);
            }
            if (d == null) {
                d = new c();
            }
            return d;
        }
    }

    private c() {
        Variation variation;
        VariationSet activate = UTABTest.activate("Android_guangguang", "multiplay");
        if (activate != null && (variation = activate.getVariation("count")) != null) {
            f20466a = variation.getValueAsInt(1);
        }
        VariationSet activate2 = UTABTest.activate("Android_guangguang", "autoplay_strategy");
        if (activate2 != null) {
            Variation variation2 = activate2.getVariation("scrollPlayNextEnable");
            if (variation2 != null) {
                b = variation2.getValueAsBoolean(false);
            }
            Variation variation3 = activate2.getVariation("areaRate");
            if (variation3 == null) {
                return;
            }
            c = 1.0f - variation3.getValueAsFloat(0.5f);
        }
    }

    public HashMap<String, b> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this});
        }
        a(false);
        return this.j;
    }

    public boolean a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        if (d()) {
            return false;
        }
        ksz kszVar = this.e;
        if (kszVar != null) {
            if (kszVar == null) {
                return true;
            }
            return kszVar.a(context);
        }
        if (!this.f) {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.player.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (oeb.a("fixAppSettingProvider", true)) {
                            c.a(c.this, com.taobao.global.setting.c.a(context, "tab2").b());
                        } else {
                            c.a(c.this, new ksx(context));
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
        this.f = true;
        return false;
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : "true".equals(ohg.a().a("weitao_switch", "liveplayer_degrade", "false"));
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : "true".equals(ohg.a().a("weitao_switch", "fix_liveplayer_black", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        com.taobao.application.common.d a2 = com.taobao.application.common.c.a();
        return a2 != null && a2.a("deviceLevel", -1) == 2;
    }

    public boolean a(TBVideoComponent tBVideoComponent, Context context, int i, int i2, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        IPlayBack iPlayBack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("711a2ee8", new Object[]{this, tBVideoComponent, context, new Integer(i), new Integer(i2), str, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)})).booleanValue();
        }
        TBVideoComponent.c viewParams = tBVideoComponent.getViewParams();
        b bVar = this.j.get(str);
        if (bVar != null) {
            ogg.a("PlayerManager", "视频存在，直接播放视频" + str);
            bVar.f20469a.m1270h();
            this.k = str;
            return true;
        }
        if (viewParams.aO_()) {
            if (TextUtils.isEmpty(viewParams.O)) {
                ogg.a("playVideo failed for liveUrl empty");
                return false;
            }
        } else if (TextUtils.isEmpty(viewParams.f) && TextUtils.isEmpty(viewParams.e)) {
            ogg.a("playVideo failed for videoId empty");
            return false;
        }
        if (viewParams.aO_() && j()) {
            ogg.a("playVideo failed for downgrade live");
            return false;
        } else if (tBVideoComponent.l()) {
            ogg.a("playVideo failed for host isFinishing");
            return false;
        } else {
            if (viewParams.aO_()) {
                iPlayBack = new com.taobao.tao.flexbox.layoutmanager.player.a(tBVideoComponent);
            } else {
                IPlayBack dVar = new com.taobao.tao.flexbox.layoutmanager.player.d(tBVideoComponent);
                ((com.taobao.tao.flexbox.layoutmanager.player.d) dVar).b(z2);
                iPlayBack = dVar;
            }
            b bVar2 = new b(iPlayBack, tBVideoComponent, str);
            bl a2 = iPlayBack.a(context, i, i2, g(str), z, tBVideoComponent, z3, z4);
            iPlayBack.a(this);
            a(bVar2, str);
            b bVar3 = this.j.get(str);
            if (bVar3 != null) {
                bVar3.f20469a.a(bVar3.b.k());
            }
            try {
                if (this.g != null && a2 != null) {
                    a2.o();
                    this.g.a(a2);
                }
            } catch (Throwable th) {
                ogg.a("PlayerManager", th.getMessage());
            }
            return true;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        b bVar = this.j.get(str);
        if (bVar == null || !(bVar.f20469a instanceof com.taobao.tao.flexbox.layoutmanager.player.d)) {
            return;
        }
        ((com.taobao.tao.flexbox.layoutmanager.player.d) bVar.f20469a).g();
        this.l = new WeakReference<>(bVar.b.getNode().N());
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        b bVar = this.j.get(str);
        if (bVar == null || !(bVar.f20469a instanceof com.taobao.tao.flexbox.layoutmanager.player.d)) {
            return;
        }
        ((com.taobao.tao.flexbox.layoutmanager.player.d) bVar.f20469a).h();
        this.l = null;
    }

    public b c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("31026429", new Object[]{this, str}) : a(false, str);
    }

    public b a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("53f093ab", new Object[]{this, new Boolean(z), str});
        }
        b bVar = this.j.get(str);
        if (bVar == null || !bVar.c.equals(str)) {
            return null;
        }
        if (bVar.f20469a != null) {
            if (bVar.b != null) {
                bVar.b.b(bVar.f20469a.e());
            }
            bVar.f20469a.a(z, bVar.b.k());
            i(str);
        }
        this.l = null;
        return this.j.remove(str);
    }

    public void b(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31b0915", new Object[]{this, new Boolean(z), str});
            return;
        }
        b bVar = this.j.get(str);
        if (bVar == null || !bVar.c.equals(str)) {
            return;
        }
        if (bVar.f20469a != null) {
            if (bVar.b != null) {
                bVar.b.j();
                bVar.b.b(bVar.f20469a.e());
            }
            j(bVar.c);
        }
        this.l = null;
        this.j.remove(str);
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue() : this.j.containsKey(str);
    }

    public void c(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1c97f4", new Object[]{this, new Boolean(z), str});
            return;
        }
        b bVar = this.j.get(str);
        if (bVar == null) {
            return;
        }
        bVar.f20469a.a(z);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        a(false);
        return ogv.a(this.j, f20466a);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        a(false);
        for (b bVar : this.j.values()) {
            if (bVar != null && bVar.f20469a != null && bVar.f20469a.d()) {
                return true;
            }
        }
        return false;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, b> entry : this.j.entrySet()) {
                b value = entry.getValue();
                if (value != null && value.f20469a != null && value.b != null && (value.b.l() || (z && oeb.aJ() && value.b.g()))) {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c((String) it.next());
            }
        } catch (Throwable th) {
            ogg.b("checkValidVideo " + th.getMessage());
        }
    }

    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        WeakReference<Context> weakReference = this.l;
        return f() && (weakReference == null || weakReference.get() == context);
    }

    private void a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d26fb327", new Object[]{this, bVar, str});
            return;
        }
        b bVar2 = this.j.get(str);
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null && bVar != null && bVar2.b == bVar.b) {
            return;
        }
        if (this.j.size() >= f20466a && this.j.containsKey(this.k)) {
            c(this.k);
        }
        this.k = str;
        this.j.put(str, bVar);
    }

    private void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        b bVar = this.j.get(str);
        if (bVar == null || !(bVar.f20469a instanceof com.taobao.tao.flexbox.layoutmanager.player.d)) {
            return;
        }
        if (((com.taobao.tao.flexbox.layoutmanager.player.d) bVar.f20469a).c() || ((com.taobao.tao.flexbox.layoutmanager.player.d) bVar.f20469a).d()) {
            a aVar = new a();
            aVar.f20468a = bVar.c;
            aVar.b = ((com.taobao.tao.flexbox.layoutmanager.player.d) bVar.f20469a).b();
            a(aVar, bVar.c);
            return;
        }
        j(bVar.c);
    }

    private void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be9f888", new Object[]{this, aVar, str});
        } else if (aVar == null || TextUtils.isEmpty(str)) {
        } else {
            this.m.put(str, aVar);
        }
    }

    private void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else {
            this.m.remove(str);
        }
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        b bVar = this.j.get(str);
        return (bVar == null || bVar.f20469a == null || (!bVar.f20469a.c() && !bVar.f20469a.d())) ? false : true;
    }

    public int f(String str) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("669e4a6a", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str) || (aVar = this.m.get(str)) == null) {
            return 0;
        }
        return aVar.b;
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{this, str})).booleanValue() : f(str) > 0;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Map<String, a> map = this.m;
        if (map == null) {
            return;
        }
        map.clear();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.e
    public boolean a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6838e3d1", new Object[]{this, hVar})).booleanValue();
        }
        switch (hVar.c) {
            case 0:
                return f(hVar);
            case 1:
                return g(hVar);
            case 2:
                return h(hVar);
            case 3:
                return d(hVar);
            case 4:
                return e(hVar);
            case 5:
                return i(hVar);
            case 6:
                return j(hVar);
            case 7:
                return c(hVar);
            case 8:
                return b(hVar);
            default:
                return false;
        }
    }

    private boolean b(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc40192", new Object[]{this, hVar})).booleanValue();
        }
        if (hVar != null && hVar.b != null && hVar.b.f20463a != null) {
            TBVideoComponent tBVideoComponent = hVar.b.f20463a;
            aa node = tBVideoComponent.getNode();
            if (node.e(TBVideoComponent.MSG_VIDEOSTATE_CHANGE) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("state", suz.VIDEO_STATE_CHANGE_ARGS_STATE_PROGRESS_UPDATE);
                hashMap.put("currentTime", Integer.valueOf(hVar.b.d));
                tBVideoComponent.sendMessage(node, TBVideoComponent.MSG_VIDEOSTATE_CHANGE, null, hashMap, null);
                return true;
            }
        }
        return false;
    }

    private boolean c(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef4f1f53", new Object[]{this, hVar})).booleanValue();
        }
        if (hVar != null && hVar.b != null && hVar.b.f20463a != null) {
            TBVideoComponent tBVideoComponent = hVar.b.f20463a;
            aa node = tBVideoComponent.getNode();
            if (node.e(TBVideoComponent.MSG_VIDEOSTATE_CHANGE) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("state", "destroy");
                tBVideoComponent.sendMessage(node, TBVideoComponent.MSG_VIDEOSTATE_CHANGE, null, hashMap, null);
                return true;
            }
        }
        return false;
    }

    private boolean d(h hVar) {
        b next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32da3d14", new Object[]{this, hVar})).booleanValue();
        }
        Iterator<b> it = this.j.values().iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (next.b != null) {
                return next.b.a((Object) null);
            }
        }
        return false;
    }

    private boolean e(h hVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76655ad5", new Object[]{this, hVar})).booleanValue();
        }
        for (b bVar : this.j.values()) {
            if (bVar != null && bVar.f20469a == hVar.b) {
                aa node = bVar.b.getNode();
                if (node.e(TBVideoComponent.MSG_VIDEOSTATE_CHANGE) != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("state", "play");
                    bVar.b.sendMessage(node, TBVideoComponent.MSG_VIDEOSTATE_CHANGE, null, hashMap, null);
                }
                z = true;
            }
        }
        return z;
    }

    private boolean f(h hVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9f07896", new Object[]{this, hVar})).booleanValue();
        }
        for (b bVar : this.j.values()) {
            if (bVar != null && bVar.f20469a == hVar.b) {
                aa node = bVar.b.getNode();
                if (node.e(TBVideoComponent.MSG_VIDEOSTATE_CHANGE) != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("state", "pause");
                    bVar.b.sendMessage(node, TBVideoComponent.MSG_VIDEOSTATE_CHANGE, null, hashMap, null);
                }
                z = true;
            }
        }
        return z;
    }

    private boolean g(h hVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd7b9657", new Object[]{this, hVar})).booleanValue();
        }
        for (b bVar : this.j.values()) {
            int f = f(bVar.c);
            if (f > 1000) {
                IPlayBack iPlayBack = bVar.f20469a;
                if (hVar != null && hVar.b == iPlayBack && f != iPlayBack.b() && iPlayBack.a()) {
                    iPlayBack.a(f);
                    z = true;
                }
            }
        }
        return z;
    }

    private boolean h(h hVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4106b418", new Object[]{this, hVar})).booleanValue();
        }
        ArrayList<String> arrayList = new ArrayList();
        for (b bVar : this.j.values()) {
            if (bVar != null && bVar.f20469a == hVar.b) {
                aa node = bVar.b.getNode();
                if (node.e(TBVideoComponent.MSG_VIDEOSTATE_CHANGE) != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("state", "complete");
                    bVar.b.sendMessage(node, TBVideoComponent.MSG_VIDEOSTATE_CHANGE, null, hashMap, null);
                }
                z = true;
            }
            if (bVar.f20469a != null && hVar.b == bVar.f20469a) {
                arrayList.add(bVar.c);
            }
        }
        for (String str : arrayList) {
            c(str);
        }
        return z;
    }

    private boolean i(h hVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8491d1d9", new Object[]{this, hVar})).booleanValue();
        }
        ArrayList<String> arrayList = new ArrayList();
        for (b bVar : this.j.values()) {
            if (bVar != null && bVar.f20469a == hVar.b) {
                aa node = bVar.b.getNode();
                if (node.e(TBVideoComponent.MSG_VIDEOSTATE_CHANGE) != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("state", "error");
                    bVar.b.sendMessage(node, TBVideoComponent.MSG_VIDEOSTATE_CHANGE, null, hashMap, null);
                }
                z = true;
            }
            if (bVar.f20469a != null && hVar.b == bVar.f20469a) {
                arrayList.add(bVar.c);
            }
        }
        for (String str : arrayList) {
            c(str);
        }
        return z;
    }

    private boolean j(h hVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c81cef9a", new Object[]{this, hVar})).booleanValue();
        }
        for (b bVar : this.j.values()) {
            if (bVar != null && bVar.f20469a == hVar.b) {
                InterfaceC0852c interfaceC0852c = this.g;
                if (interfaceC0852c != null) {
                    interfaceC0852c.a(true);
                    ogg.d("AVSDK_PlayerManagerSharePlayer", "handleVideoFirstFrameRender 首帧加载成功");
                }
                d dVar = this.h;
                if (dVar != null) {
                    dVar.a(bVar);
                    ogg.d("TNodePlayerPrefetchManager", "handleVideoFirstFrameRender 首帧加载成功");
                }
                z = true;
            }
        }
        return z;
    }

    public int h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb017cec", new Object[]{this, str})).intValue();
        }
        b bVar = this.j.get(str);
        if (bVar != null && bVar.f20469a != null) {
            return bVar.f20469a.d;
        }
        return 0;
    }

    public List<aa> a(Component component, boolean z) {
        aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4e21916", new Object[]{this, component, new Boolean(z)});
        }
        ArrayList arrayList = null;
        r0 = null;
        m.c cVar = null;
        arrayList = null;
        if (component != null && component.getView() != null) {
            ArrayList arrayList2 = new ArrayList();
            if (component instanceof m) {
                m mVar = (m) component;
                int[] findVisibleItemPositionRange = mVar.getView().findVisibleItemPositionRange(true);
                RecyclerView.Adapter adapter = mVar.getView().getAdapter();
                if (adapter instanceof m.c) {
                    cVar = (m.c) adapter;
                } else if (adapter instanceof TRecyclerView.HeaderViewAdapter) {
                    RecyclerView.Adapter wrappedAdapter = ((TRecyclerView.HeaderViewAdapter) adapter).getWrappedAdapter();
                    if (wrappedAdapter instanceof m.c) {
                        cVar = (m.c) wrappedAdapter;
                    }
                }
                if (cVar != null) {
                    for (int i = findVisibleItemPositionRange[0]; i <= findVisibleItemPositionRange[1] && i >= 0; i++) {
                        aa a3 = cVar.a(i);
                        if (a3 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            a3.a("tbplayer", 2, arrayList3, false, false);
                            arrayList2.addAll(arrayList3);
                        }
                    }
                }
            } else if (component instanceof ScrollViewComponent) {
                List<aa> findVisibleItems = ((ScrollViewComponent) component).findVisibleItems();
                if (findVisibleItems != null) {
                    for (aa aaVar : findVisibleItems) {
                        ArrayList arrayList4 = new ArrayList();
                        aaVar.a("tbplayer", 2, arrayList4, false, false);
                        arrayList2.addAll(arrayList4);
                    }
                }
            } else if ((component instanceof com.taobao.tao.flexbox.layoutmanager.component.c) && (a2 = ((com.taobao.tao.flexbox.layoutmanager.component.c) component).a()) != null) {
                ArrayList arrayList5 = new ArrayList();
                a2.a("tbplayer", 2, arrayList5, false, false);
                arrayList2.addAll(arrayList5);
            }
            ArrayList arrayList6 = new ArrayList();
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                aa aaVar2 = (aa) it.next();
                Component I = aaVar2.I();
                boolean z2 = I instanceof TBVideoComponent;
                if (z2 && ((TBVideoComponent) I).h()) {
                    arrayList6.add(aaVar2);
                } else {
                    if (arrayList6.size() > 0 && z2) {
                        TBVideoComponent tBVideoComponent = (TBVideoComponent) I;
                        if (tBVideoComponent.b) {
                            tBVideoComponent.b = false;
                        }
                    }
                    if (z2 && ((TBVideoComponent) I).i()) {
                        arrayList.add(aaVar2);
                    }
                }
            }
            if (z) {
                return arrayList6;
            }
        }
        return arrayList;
    }

    public boolean h() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        Iterator<b> it = this.j.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            b next = it.next();
            if (next != null && (next.f20469a instanceof com.taobao.tao.flexbox.layoutmanager.player.d)) {
                z = true;
                break;
            }
        }
        return !z;
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.i = map;
        }
    }

    public Map<String, Object> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this}) : this.i;
    }

    public void a(InterfaceC0852c interfaceC0852c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f468afc", new Object[]{this, interfaceC0852c});
        } else {
            this.g = interfaceC0852c;
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f46ff5b", new Object[]{this, dVar});
        } else {
            this.h = dVar;
        }
    }
}
