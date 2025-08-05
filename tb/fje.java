package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.media.videodecide.b;
import com.taobao.android.detail2.core.framework.data.model.MainMediaInfo;
import com.taobao.android.detail2.core.framework.data.model.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class fje {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<fmd, fje> q;

    /* renamed from: a  reason: collision with root package name */
    private Context f27998a;
    private boolean d;
    private boolean f;
    private fhi m;
    private MainMediaInfo n;
    private int o;
    private fmd p;
    private String r;
    private String s;
    private fjd t;
    private Runnable v;
    private Set<String> b = new HashSet();
    private List<String> c = new ArrayList(3);
    private int e = 0;
    private boolean g = false;
    private int h = 5000;
    private int i = 3;
    private float j = -1.0f;
    private boolean k = false;
    private boolean l = false;
    private boolean u = false;
    private Handler w = new Handler(Looper.getMainLooper()) { // from class: tb.fje.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (fje.a(fje.this)) {
                fjt.a("PreLoadManagerNew", "handleMessage isStopped, not preload！");
            } else if (fje.b(fje.this) != null && fje.b(fje.this).c()) {
                fjt.a("PreLoadManagerNew", "handleMessage isPoor not preload！");
            } else {
                fjt.b("PreLoadManagerNew", "handleMessage---");
                MainMediaInfo c = fje.c(fje.this);
                if (c == null || c.data == null) {
                    return;
                }
                fje fjeVar = fje.this;
                fjeVar.a(fje.d(fjeVar), c);
            }
        }
    };

    public static /* synthetic */ String a(fje fjeVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e00ba59f", new Object[]{fjeVar, str});
        }
        fjeVar.s = str;
        return str;
    }

    public static /* synthetic */ void a(fje fjeVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c54f68d", new Object[]{fjeVar, new Long(j)});
        } else {
            fjeVar.a(j);
        }
    }

    public static /* synthetic */ void a(fje fjeVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3228091", new Object[]{fjeVar, context});
        } else {
            fjeVar.a(context);
        }
    }

    public static /* synthetic */ boolean a(fje fjeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e8a7e31b", new Object[]{fjeVar})).booleanValue() : fjeVar.f;
    }

    public static /* synthetic */ String b(fje fjeVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19d6477e", new Object[]{fjeVar, str});
        }
        fjeVar.r = str;
        return str;
    }

    public static /* synthetic */ fjd b(fje fjeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fjd) ipChange.ipc$dispatch("d8a7e9ce", new Object[]{fjeVar}) : fjeVar.t;
    }

    public static /* synthetic */ MainMediaInfo c(fje fjeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MainMediaInfo) ipChange.ipc$dispatch("92690ade", new Object[]{fjeVar}) : fjeVar.d();
    }

    public static /* synthetic */ Context d(fje fjeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f349a792", new Object[]{fjeVar}) : fjeVar.f27998a;
    }

    public static /* synthetic */ String e(fje fjeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eac270e5", new Object[]{fjeVar}) : fjeVar.s;
    }

    public static /* synthetic */ List f(fje fjeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("64eba32b", new Object[]{fjeVar}) : fjeVar.c;
    }

    public static /* synthetic */ Set g(fje fjeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a7f06f4c", new Object[]{fjeVar}) : fjeVar.b;
    }

    public static /* synthetic */ Runnable h(fje fjeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("e44de436", new Object[]{fjeVar}) : fjeVar.v;
    }

    public static /* synthetic */ Handler i(fje fjeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("86ef2d47", new Object[]{fjeVar}) : fjeVar.w;
    }

    static {
        kge.a(780844941);
        q = new HashMap<>();
    }

    public static fje a(fmd fmdVar) {
        fje fjeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fje) ipChange.ipc$dispatch("733650ea", new Object[]{fmdVar});
        }
        fje fjeVar2 = q.get(fmdVar);
        if (fjeVar2 != null) {
            return fjeVar2;
        }
        synchronized (fje.class) {
            fjeVar = q.get(fmdVar);
            if (fjeVar == null) {
                fjeVar = new fje(fmdVar);
                q.put(fmdVar, fjeVar);
            }
        }
        return fjeVar;
    }

    private fje(fmd fmdVar) {
        this.p = fmdVar;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.g = true;
        this.i = 3;
        this.j = 0.8f;
        fjd.f27997a = 6.0f;
        fjd.b = 3.0f;
        fjd.c = 1.0f;
        fjt.a(sny.TAG, "PreLoadManagerNew abparams isABNewEnable=" + this.g + " queueDepth=" + this.i + " preDownloadSize=" + this.j + " healthBufferLevel=" + fjd.f27997a + " poorBufferLevel=" + fjd.b);
        if (this.j > 0.0f) {
            return;
        }
        this.j = 1.0f;
    }

    public void a(fhi fhiVar, int i, int i2, int i3) {
        MainMediaInfo W;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec86372", new Object[]{this, fhiVar, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (fhiVar == null || (W = fhiVar.W()) == null) {
        } else {
            if (this.n != W) {
                this.m = fhiVar;
                this.n = W;
                this.d = false;
                fmd fmdVar = this.p;
                if (fmdVar == null) {
                    return;
                }
                this.f27998a = fmdVar.c().getContext();
                if (this.l && TextUtils.equals(this.s, b(this.n))) {
                    a(this.f27998a);
                }
                List<d> m = this.p.m();
                if (m == null) {
                    return;
                }
                this.o = m.indexOf(this.m);
                if (this.o < 0) {
                    fjt.a("PreLoadManagerNew", "progressPreDownload mPlayingIndex=-1. return");
                    return;
                }
                this.u = a(this.n);
                if (this.n.data != null) {
                    String b = b(this.n);
                    StringBuilder sb = new StringBuilder();
                    sb.append("preloadstatus playing mPlayingIndex=");
                    sb.append(this.o);
                    sb.append(" ; contentid=");
                    sb.append(b);
                    sb.append(" hasdownload:");
                    Set<String> set = this.b;
                    sb.append(set != null ? Boolean.valueOf(set.contains(b)) : "null");
                    sb.append("; disenableCurrentVideoPreload=");
                    sb.append(this.u);
                    fjt.a("PreLoadManagerNew", sb.toString());
                }
            }
            if (this.u) {
                return;
            }
            if (this.t == null) {
                this.t = new fjd();
            }
            this.t.a(i, i2, i3);
            if (this.t.b()) {
                a(0L);
            } else if (!this.t.c()) {
            } else {
                fjt.a("PreLoadManagerNew", "toLoadNext preloadstatus ---> isPoor --> 尝试取消cancelPreload ");
                a(this.f27998a);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        fjt.a("PreLoadManagerNew", "stop ---- ");
        this.f = true;
        a(this.f27998a);
        q.remove(this.p);
    }

    private void a(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.w.removeMessages(100);
        this.w.removeCallbacks(this.v);
        if (context != null && (str = this.r) != null && str.length() > 0) {
            fjt.a("PreLoadManagerNew", "cancelPreload ---- mCurrentPreloadUrl = " + this.r);
            oyx.a(context, this.r);
        }
        this.s = null;
        this.r = null;
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (this.f) {
            fjt.a("PreLoadManagerNew", "toLoadNext isStopped, not proceed！");
        } else {
            String str = this.r;
            if (str != null && str.length() > 0) {
                fjt.a("PreLoadManagerNew", "preloadstatus toLoadNext is reloading, not proceed！mPreloadingUrl=" + this.r);
            } else if (this.d && c()) {
            } else {
                fjt.b("PreLoadManagerNew", "toLoadNext preloadstatus ---> healthy --> delayMillis=" + j);
                this.w.removeMessages(100);
                Message obtain = Message.obtain();
                obtain.what = 100;
                this.w.sendMessageDelayed(obtain, j);
            }
        }
    }

    private boolean c() {
        List<d> m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        fmd fmdVar = this.p;
        if (fmdVar == null || (m = fmdVar.m()) == null || m.size() == this.e) {
            return true;
        }
        fjt.a("PreLoadManagerNew", "reCheckDepthFull， 列表变化，");
        this.e = m.size();
        this.d = false;
        return false;
    }

    private MainMediaInfo d() {
        List<d> m;
        MainMediaInfo W;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainMediaInfo) ipChange.ipc$dispatch("54fa0ecc", new Object[]{this});
        }
        fmd fmdVar = this.p;
        if (fmdVar == null || (m = fmdVar.m()) == null) {
            return null;
        }
        int i = this.o + 1;
        while (i - this.o <= this.i && i < m.size()) {
            if (m.get(i) instanceof fhi) {
                fhi fhiVar = (fhi) m.get(i);
                if (fhiVar != null && (W = fhiVar.W()) != null && W.data != null && "video".equals(W.type) && (str = W.data.contentId) != null && !this.b.contains(str)) {
                    fjt.b("PreLoadManagerNew", "-----> findNextMedia preloadstatus mPlayingIndex=" + this.o + " index=" + i + " contentId=" + str + " mHasDownloadSet=" + this.b);
                    return W;
                }
                i++;
            }
        }
        this.d = true;
        return null;
    }

    public void a(final Context context, MainMediaInfo mainMediaInfo) {
        List<String> list;
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ac4c21", new Object[]{this, context, mainMediaInfo});
        } else if (mainMediaInfo == null || mainMediaInfo.data == null) {
        } else {
            final String str = mainMediaInfo.data.contentId;
            String str2 = mainMediaInfo.data.videoResourceStr;
            final JSONObject jSONObject = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str2);
                    try {
                        if (fkt.av()) {
                            if (mainMediaInfo.config != null && mainMediaInfo.config.enableStreamOpti) {
                                jSONObject = b.a(jSONObject2, null, true, true, this.m);
                            } else {
                                fjt.a("PreLoadManagerNew", "config is null or enableStreamOpti is false. abort.");
                                jSONObject = jSONObject2;
                            }
                        } else {
                            jSONObject = b.a(jSONObject2, null, true, true, this.m);
                        }
                    } catch (Exception e) {
                        e = e;
                        jSONObject = jSONObject2;
                        fjt.a("PreLoadManagerNew", "预下载码率决策错误", e);
                        if (jSONObject != null) {
                        }
                        list = this.c;
                        if (list != null) {
                            this.c.clear();
                        }
                        this.v = new Runnable() { // from class: tb.fje.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                fjt.a("PreLoadManagerNew", "预下载超时了。取消当前视频，下载下一个");
                                if (TextUtils.equals(fje.e(fje.this), str)) {
                                    fje.a(fje.this, context);
                                    fje.a(fje.this, (String) null);
                                    fje.b(fje.this, null);
                                    if (fje.f(fje.this) != null) {
                                        if (fje.f(fje.this).size() <= 0 || !TextUtils.equals((CharSequence) fje.f(fje.this).get(0), str)) {
                                            fje.f(fje.this).add(str);
                                        } else {
                                            fje.g(fje.this).add(str);
                                            fje.f(fje.this).clear();
                                        }
                                    }
                                }
                                fje.a(fje.this, 500L);
                            }
                        };
                        int i = (int) (this.j * 1024.0f * 1024.0f);
                        HashMap hashMap = new HashMap();
                        hashMap.put("from", mainMediaInfo.data.videoSource);
                        hashMap.put(oyw.VIDEO_PLAY_SCENES, mainMediaInfo.data.videoPlayScenes);
                        a2 = oyx.a(context, jSONObject, i, new com.taobao.mediaplay.d() { // from class: tb.fje.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.mediaplay.d
                            public void a(String str3) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                                }
                            }

                            @Override // com.taobao.mediaplay.d
                            public void a(int i2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                                    return;
                                }
                                fjt.a("PreLoadManagerNew", "preDownloadCurrent =====>" + str + " onfinish size=" + i2);
                                b.a(jSONObject, i2, true);
                                fje.i(fje.this).removeCallbacks(fje.h(fje.this));
                                if (i2 > 0) {
                                    fje.g(fje.this).add(str);
                                }
                                if (TextUtils.equals(fje.e(fje.this), str)) {
                                    fje.a(fje.this, (String) null);
                                    fje.b(fje.this, null);
                                }
                                fje.a(fje.this, 500L);
                            }

                            @Override // com.taobao.mediaplay.d
                            public void b(int i2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
                                    return;
                                }
                                fjt.b("PreLoadManagerNew", "preDownloadCurrent ------" + str + " onProgress。 i = " + i2);
                                b.a(jSONObject, i2, false);
                            }
                        }, hashMap);
                        this.r = a2;
                        this.s = str;
                        fjt.a("PreLoadManagerNew", "preDownloadCurrent start " + str + "downloadSize=" + i + "url=" + a2);
                        if (a2 == null) {
                        }
                        fjt.a("PreLoadManagerNew", str + "url为空，创建下载失败了，直接取消，下载下一个 ");
                        this.v.run();
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            if (jSONObject != null && this.j < 0.0f) {
                return;
            }
            list = this.c;
            if (list != null && list.size() > 0 && !TextUtils.equals(this.c.get(0), str)) {
                this.c.clear();
            }
            this.v = new Runnable() { // from class: tb.fje.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    fjt.a("PreLoadManagerNew", "预下载超时了。取消当前视频，下载下一个");
                    if (TextUtils.equals(fje.e(fje.this), str)) {
                        fje.a(fje.this, context);
                        fje.a(fje.this, (String) null);
                        fje.b(fje.this, null);
                        if (fje.f(fje.this) != null) {
                            if (fje.f(fje.this).size() <= 0 || !TextUtils.equals((CharSequence) fje.f(fje.this).get(0), str)) {
                                fje.f(fje.this).add(str);
                            } else {
                                fje.g(fje.this).add(str);
                                fje.f(fje.this).clear();
                            }
                        }
                    }
                    fje.a(fje.this, 500L);
                }
            };
            int i2 = (int) (this.j * 1024.0f * 1024.0f);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("from", mainMediaInfo.data.videoSource);
            hashMap2.put(oyw.VIDEO_PLAY_SCENES, mainMediaInfo.data.videoPlayScenes);
            a2 = oyx.a(context, jSONObject, i2, new com.taobao.mediaplay.d() { // from class: tb.fje.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.mediaplay.d
                public void a(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                    }
                }

                @Override // com.taobao.mediaplay.d
                public void a(int i22) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i22)});
                        return;
                    }
                    fjt.a("PreLoadManagerNew", "preDownloadCurrent =====>" + str + " onfinish size=" + i22);
                    b.a(jSONObject, i22, true);
                    fje.i(fje.this).removeCallbacks(fje.h(fje.this));
                    if (i22 > 0) {
                        fje.g(fje.this).add(str);
                    }
                    if (TextUtils.equals(fje.e(fje.this), str)) {
                        fje.a(fje.this, (String) null);
                        fje.b(fje.this, null);
                    }
                    fje.a(fje.this, 500L);
                }

                @Override // com.taobao.mediaplay.d
                public void b(int i22) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i22)});
                        return;
                    }
                    fjt.b("PreLoadManagerNew", "preDownloadCurrent ------" + str + " onProgress。 i = " + i22);
                    b.a(jSONObject, i22, false);
                }
            }, hashMap2);
            this.r = a2;
            this.s = str;
            fjt.a("PreLoadManagerNew", "preDownloadCurrent start " + str + "downloadSize=" + i2 + "url=" + a2);
            if (a2 == null && a2.length() > 0) {
                this.w.postDelayed(this.v, this.h);
                return;
            }
            fjt.a("PreLoadManagerNew", str + "url为空，创建下载失败了，直接取消，下载下一个 ");
            this.v.run();
        }
    }

    public boolean a(MainMediaInfo mainMediaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c83d02d", new Object[]{this, mainMediaInfo})).booleanValue();
        }
        if (mainMediaInfo == null) {
            return false;
        }
        try {
            if (!a(this.p).k) {
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static String b(MainMediaInfo mainMediaInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e1e36b6", new Object[]{mainMediaInfo}) : (mainMediaInfo == null || mainMediaInfo.data == null) ? "" : mainMediaInfo.data.contentId;
    }
}
