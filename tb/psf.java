package tb;

import android.content.Context;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.e;
import com.taobao.taolive.sdk.ui.media.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import tb.psi;

/* loaded from: classes8.dex */
public class psf implements pqu, psi.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f32851a;
    private static psf b;
    private LinkedHashMap<String, psj> c;
    private boolean d;
    private int e;

    @Override // tb.pqu
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : f32851a;
    }

    static {
        kge.a(2110527178);
        kge.a(-1317704444);
        kge.a(1654403951);
        f32851a = psf.class.getSimpleName();
    }

    private psf(Context context) {
    }

    public static psf a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psf) ipChange.ipc$dispatch("34c7ebc3", new Object[]{context});
        }
        if (b == null) {
            b = new psf(context);
        }
        return b;
    }

    public psj a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psj) ipChange.ipc$dispatch("7c73f42d", new Object[]{this, str});
        }
        LinkedHashMap<String, psj> linkedHashMap = this.c;
        if (linkedHashMap != null && linkedHashMap.size() > 0) {
            return this.c.get(str);
        }
        return null;
    }

    public void b(String str) {
        LinkedHashMap<String, psj> linkedHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (pro.e(str) || (linkedHashMap = this.c) == null || linkedHashMap.size() <= 0) {
        } else {
            this.c.remove(str);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static LinkedHashMap<String, psj> a(LinkedHashMap<String, psj> linkedHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("c3b4bca0", new Object[]{linkedHashMap});
        }
        ListIterator listIterator = new ArrayList(linkedHashMap.entrySet()).listIterator(linkedHashMap.size());
        LinkedHashMap<String, psj> linkedHashMap2 = new LinkedHashMap<>();
        while (listIterator.hasPrevious()) {
            Map.Entry entry = (Map.Entry) listIterator.previous();
            linkedHashMap2.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap2;
    }

    public void a(psj psjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3972b1", new Object[]{this, psjVar});
        } else if (psjVar == null || psjVar.f32864a == null) {
        } else {
            int i = this.e;
            if (i <= 0) {
                i = prr.t();
            }
            if (this.c == null) {
                this.c = new LinkedHashMap<>(i);
            }
            if (this.c.size() == i) {
                LinkedHashMap<String, psj> a2 = a(this.c);
                ListIterator listIterator = new ArrayList(a2.entrySet()).listIterator(a2.size());
                if (listIterator.hasPrevious()) {
                    e((String) ((Map.Entry) listIterator.previous()).getKey());
                }
            }
            this.c.put(psjVar.f, psjVar);
        }
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        psj a2 = a(str);
        if (a2 != null && a2.e != null) {
            return a2.e.L();
        }
        return null;
    }

    private psj a(final Context context, boolean z, boolean z2, final pse pseVar, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psj) ipChange.ipc$dispatch("b8e66007", new Object[]{this, context, new Boolean(z), new Boolean(z2), pseVar, str});
        }
        e eVar = new e(g.b());
        eVar.a(context);
        eVar.h(false);
        eVar.e(z);
        eVar.f(z2);
        eVar.e_(true);
        eVar.a(true);
        eVar.d(pseVar.e);
        eVar.d(pseVar.f);
        eVar.g(pseVar.i);
        if (2 == pseVar.f) {
            eVar.c(pseVar.k);
        } else {
            eVar.c(false);
        }
        if (pseVar.m == null) {
            if (!StringUtils.isEmpty(pseVar.c)) {
                eVar.a((MediaData) null, pseVar.c);
            }
        } else {
            eVar.a(pseVar.m, (String) null);
        }
        eVar.a(pro.f(pseVar.n));
        final psi psiVar = new psi(pseVar.m);
        psiVar.a(this);
        final psj psjVar = new psj(pseVar, pseVar.i, psiVar, eVar, str);
        psjVar.a(new pqy(this));
        psjVar.a(psiVar);
        a(psjVar);
        final Runnable b2 = b(pseVar, psjVar);
        final Runnable a2 = a(pseVar, psjVar);
        IMediaPlayer.g gVar = new IMediaPlayer.g() { // from class: tb.psf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                pqy pqyVar;
                Runnable runnable;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (j == 3 && psjVar.j != null) {
                    psjVar.j.post(new Runnable() { // from class: tb.psf.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (pseVar.f32850a == null) {
                            } else {
                                pseVar.f32850a.onVideoStart();
                                psjVar.g = false;
                                HashMap hashMap = new HashMap();
                                hashMap.put("event_type", "playviewtoken_start");
                                if (!pro.e(pseVar.i)) {
                                    hashMap.put("feed_id", pseVar.i);
                                }
                                prl.a(prl.POINT_VIDEOPALY_CTRNAME, hashMap);
                            }
                        }
                    });
                    if (b2 != null) {
                        pqyVar = psjVar.j;
                        runnable = b2;
                    } else {
                        if (a2 != null) {
                            pqyVar = psjVar.j;
                            runnable = a2;
                        }
                        psjVar.a(new psa() { // from class: tb.psf.1.2
                        });
                    }
                    pqyVar.postDelayed(runnable, pseVar.d * 1000);
                    psjVar.a(new psa() { // from class: tb.psf.1.2
                    });
                }
                return false;
            }
        };
        eVar.a(new IMediaPlayer.e() { // from class: tb.psf.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                String d = psf.d();
                TLog.loge(d, "errorListenr onError " + i);
                if (prr.s() && pseVar != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event_type", "playviewtoken_error");
                    if (!pro.e(pseVar.i)) {
                        hashMap.put("feed_id", pseVar.i);
                        prl.a(prl.POINT_VIDEOPALY_CTRNAME, hashMap);
                    }
                    psjVar.g = false;
                    if (psiVar.a(context, pseVar, iMediaPlayer, i, i2, str)) {
                        return true;
                    }
                    psf.this.e(str);
                    if (a2 != null && pseVar.b != null) {
                        pseVar.b.a();
                    }
                }
                return false;
            }
        });
        eVar.a(gVar);
        return psjVar;
    }

    public Runnable a(final pse pseVar, final psj psjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("40339615", new Object[]{this, pseVar, psjVar});
        }
        if (pseVar != null && psjVar != null && prr.q() && pseVar.d > 0) {
            return new Runnable() { // from class: tb.psf.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    pse pseVar2 = pseVar;
                    if (2 != pseVar2.f || !pseVar.k) {
                        psf.this.e(psjVar.f);
                    }
                    if (pseVar2.b == null) {
                        return;
                    }
                    pseVar2.b.a();
                }
            };
        }
        return null;
    }

    public Runnable b(final pse pseVar, final psj psjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("975186f4", new Object[]{this, pseVar, psjVar});
        }
        if (pseVar != null && psjVar != null && prr.p() && pseVar.d > 0) {
            return new Runnable() { // from class: tb.psf.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (2 != pseVar.f) {
                        psf.this.e(psjVar.f);
                    } else if (pseVar.k) {
                    } else {
                        psf.this.e(psjVar.f);
                    }
                }
            };
        }
        return null;
    }

    public boolean a(Context context, pse pseVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd97f1c", new Object[]{this, context, pseVar, str})).booleanValue();
        }
        if (pseVar == null) {
            return false;
        }
        boolean n = prr.n();
        boolean o = prr.o();
        LinkedHashMap<String, psj> linkedHashMap = this.c;
        if (linkedHashMap == null || linkedHashMap.size() <= 0) {
            return a(context, pseVar, n, o, str);
        }
        psj a2 = a(str);
        if (a2 != null && a2.f32864a != null) {
            if (a2.f32864a.f32850a == pseVar.f32850a) {
                return true;
            }
            if (pseVar.g < a2.f32864a.g) {
                return false;
            }
            e(str);
        }
        return a(context, pseVar, n, o, str);
    }

    private boolean a(Context context, pse pseVar, boolean z, boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb3e1e1c", new Object[]{this, context, pseVar, new Boolean(z), new Boolean(z2), str})).booleanValue();
        }
        if (!b() && pseVar != null) {
            if (a(str) != null) {
                e(str);
            }
            psj a2 = a(context, z, z2, pseVar, str);
            if (a2.e != null && !a2.g) {
                if (pseVar.f32850a != null) {
                    pseVar.f32850a.onVideoRequestAccept();
                }
                if (!pro.e(a2.b)) {
                    String str2 = f32851a;
                    TLog.loge(str2, "startVideo：" + a2.b);
                }
                a2.e.i(prr.r());
                a2.g = true;
                return true;
            }
        }
        return false;
    }

    public void e(String str) {
        psj a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else if (b() || pro.e(str) || (a2 = a(str)) == null || a2.e == null) {
        } else {
            String str2 = a2.b;
            if (a2.f32864a != null && a2.f32864a.f32850a != null) {
                a2.f32864a.f32850a.onVideoStop();
                a2.f32864a = null;
                if (!pro.e(str2)) {
                    String str3 = f32851a;
                    TLog.loge(str3, "stopVideo：" + str2);
                }
            }
            a2.e.o();
            a2.e.c();
            a2.g = false;
            if (a2.j != null) {
                a2.j.removeCallbacksAndMessages(null);
            }
            if (a2.c != null) {
                a2.c.a();
                a2.c = null;
            }
            b(str);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!prr.u()) {
            return false;
        }
        return this.d;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TLog.loge(f32851a, "destroy");
        this.d = false;
        LinkedHashMap<String, psj> linkedHashMap = this.c;
        if (linkedHashMap != null && linkedHashMap.size() > 0) {
            ListIterator listIterator = new ArrayList(this.c.entrySet()).listIterator(this.c.size());
            while (listIterator.hasPrevious()) {
                psj psjVar = (psj) ((Map.Entry) listIterator.previous()).getValue();
                if (psjVar != null && !pro.e(psjVar.f)) {
                    if (psjVar.j != null) {
                        psjVar.j.removeCallbacksAndMessages(null);
                    }
                    e(psjVar.f);
                }
            }
        }
        LinkedHashMap<String, psj> linkedHashMap2 = this.c;
        if (linkedHashMap2 != null) {
            linkedHashMap2.clear();
        }
        this.c = null;
        b = null;
    }

    public ViewGroup g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("3b94875d", new Object[]{this, str});
        }
        psj a2 = a(str);
        if (a2 != null && a2.e != null) {
            return a2.e.G();
        }
        return null;
    }

    public boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb017cfd", new Object[]{this, str})).booleanValue();
        }
        psj a2 = a(str);
        if (a2 != null && a2.e != null) {
            return a2.e.l();
        }
        return false;
    }

    @Override // tb.psi.a
    public void a(Context context, pse pseVar, boolean z, boolean z2, boolean z3, String str) {
        psj a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27be510", new Object[]{this, context, pseVar, new Boolean(z), new Boolean(z2), new Boolean(z3), str});
        } else if (pseVar == null || (a2 = a(str)) == null || a2.e == null || a2.d) {
        } else {
            HashMap hashMap = new HashMap();
            if (!pro.e(pseVar.i)) {
                hashMap.put("event_type", "playviewtoken_retry");
                hashMap.put("feed_id", pseVar.i);
                prl.a(prl.POINT_VIDEOPALY_CTRNAME, hashMap);
                String str2 = f32851a;
                TLog.loge(str2, "video retry,feedId:" + pseVar.i);
            }
            a(context, pseVar, z2, z3, str);
            a2.d = true;
        }
    }
}
