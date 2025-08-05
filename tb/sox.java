package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.performance.config.PerfConst;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.android.fluid.framework.preload.cache.b;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import tb.snd;

/* loaded from: classes5.dex */
public class sox {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean h;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33784a;
    private Context b;
    private boolean e;
    private boolean g;
    private com.taobao.android.fluid.framework.data.datamodel.a o;
    private int p;
    private String q;
    private String r;
    private sow s;
    private Runnable u;
    private final Set<String> c = new HashSet();
    private final List<String> d = new ArrayList(3);
    private int f = 0;
    private int j = 5000;
    private int k = 3;
    private float l = 0.8f;
    private final Handler v = new Handler(Looper.getMainLooper()) { // from class: tb.sox.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            if (!(sox.b(sox.this) || (sox.c(sox.this) != null && sox.c(sox.this).c()))) {
                com.taobao.android.fluid.framework.data.datamodel.a d = sox.d(sox.this);
                if (d == null || d.a() == null || !sox.e(sox.this)) {
                    sox.a(sox.this);
                    return;
                } else {
                    sox.a(sox.this, d, (int) (sox.f(sox.this) * 1024.0f * 1024.0f), (a) null);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("handleMessage isStopped ");
            sb.append(sox.b(sox.this));
            sb.append(" isPoor: ");
            if (sox.c(sox.this) == null || !sox.c(sox.this).c()) {
                z = false;
            }
            sb.append(z);
            spz.c("PreLoadManagerNew", sb.toString());
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public interface a {
        void a(String str);

        void b(String str);
    }

    public static /* synthetic */ String a(sox soxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2d5e2da", new Object[]{soxVar, str});
        }
        soxVar.r = str;
        return str;
    }

    public static /* synthetic */ void a(sox soxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff25fbbc", new Object[]{soxVar});
        } else {
            soxVar.e();
        }
    }

    public static /* synthetic */ void a(sox soxVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e599f288", new Object[]{soxVar, new Long(j)});
        } else {
            soxVar.a(j);
        }
    }

    public static /* synthetic */ void a(sox soxVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d741fb8c", new Object[]{soxVar, context});
        } else {
            soxVar.a(context);
        }
    }

    public static /* synthetic */ void a(sox soxVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, HashMap hashMap, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0436bd7", new Object[]{soxVar, aVar, new Integer(i), hashMap, aVar2});
        } else {
            soxVar.a(aVar, i, hashMap, aVar2);
        }
    }

    public static /* synthetic */ void a(sox soxVar, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f6bfc2a", new Object[]{soxVar, aVar, new Integer(i), aVar2});
        } else {
            soxVar.a(aVar, i, aVar2);
        }
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        h = z;
        return z;
    }

    public static /* synthetic */ String b(sox soxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dca084b9", new Object[]{soxVar, str});
        }
        soxVar.q = str;
        return str;
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : h;
    }

    public static /* synthetic */ boolean b(sox soxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eda90241", new Object[]{soxVar})).booleanValue() : soxVar.g;
    }

    public static /* synthetic */ sow c(sox soxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sow) ipChange.ipc$dispatch("106891cd", new Object[]{soxVar}) : soxVar.s;
    }

    public static /* synthetic */ com.taobao.android.fluid.framework.data.datamodel.a d(sox soxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.fluid.framework.data.datamodel.a) ipChange.ipc$dispatch("3e01723b", new Object[]{soxVar}) : soxVar.f();
    }

    public static /* synthetic */ boolean e(sox soxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b93215c4", new Object[]{soxVar})).booleanValue() : soxVar.d();
    }

    public static /* synthetic */ float f(sox soxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a7b51c31", new Object[]{soxVar})).floatValue() : soxVar.l;
    }

    public static /* synthetic */ String g(sox soxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("40976e1e", new Object[]{soxVar}) : soxVar.r;
    }

    public static /* synthetic */ Context h(sox soxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f8c0af3b", new Object[]{soxVar}) : soxVar.b;
    }

    public static /* synthetic */ List i(sox soxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a4f1a203", new Object[]{soxVar}) : soxVar.d;
    }

    public static /* synthetic */ Set j(sox soxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("b2433574", new Object[]{soxVar}) : soxVar.c;
    }

    public static /* synthetic */ FluidContext k(sox soxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("270439c2", new Object[]{soxVar}) : soxVar.f33784a;
    }

    public static /* synthetic */ Runnable l(sox soxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("2938f6ed", new Object[]{soxVar}) : soxVar.u;
    }

    public static /* synthetic */ String m(sox soxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44a373d8", new Object[]{soxVar}) : soxVar.q;
    }

    public static /* synthetic */ Handler n(sox soxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("540a7fdd", new Object[]{soxVar}) : soxVar.v;
    }

    static {
        kge.a(1605635582);
        h = false;
    }

    public sox(FluidContext fluidContext) {
        this.f33784a = fluidContext;
        ((ILifecycleService) this.f33784a.getService(ILifecycleService.class)).addPageLifecycleListener(new snd.a() { // from class: tb.sox.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.snd.a, tb.snd
            public void onStop() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                    return;
                }
                spz.c("PreLoadManagerNew", "[cachevideo]page is stopped, try  preDownloadUnexposeContent");
                sox.a(sox.this);
            }
        });
    }

    public void a(com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245451bf", new Object[]{this, aVar, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (aVar == null) {
        } else {
            if (this.o != aVar) {
                this.o = aVar;
                this.e = false;
                this.b = this.f33784a.getContext();
                if (TextUtils.equals(this.r, a(aVar))) {
                    a(this.b);
                }
                List<com.taobao.android.fluid.framework.data.datamodel.a> unmodifiableMediaSetList = ((IDataService) this.f33784a.getService(IDataService.class)).getUnmodifiableMediaSetList();
                if (unmodifiableMediaSetList == null) {
                    return;
                }
                this.p = unmodifiableMediaSetList.indexOf(this.o);
                if (this.p < 0) {
                    spz.c("PreLoadManagerNew", "progressPreDownload mPlayingIndex=-1. return");
                    return;
                } else if (aVar.a() != null) {
                    String g = aVar.a().g();
                    spz.c("PreLoadManagerNew", "preloadstatus playing mPlayingIndex=" + this.p + " ; contentid=" + g);
                }
            }
            if (this.s == null) {
                this.s = new sow();
            }
            this.s.a(aVar.a().g(), i, i2, i3);
            if (this.s.b()) {
                a(0L);
            } else if (!this.s.c()) {
            } else {
                a(this.b);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        spz.c("PreLoadManagerNew", "stop ---- ");
        this.g = true;
        a(this.b);
    }

    private void a(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.v.removeMessages(100);
        Runnable runnable = this.u;
        if (runnable != null) {
            this.v.removeCallbacks(runnable);
        }
        if (context != null && (str = this.q) != null && str.length() > 0) {
            spz.c("PreLoadManagerNew", "cancelPreload ---- mCurrentPreloadUrl = " + this.q);
            oyx.a(context, this.q);
        }
        this.r = null;
        this.q = null;
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (this.g) {
            spz.c("PreLoadManagerNew", "toLoadNext isStopped, not proceed！");
        } else {
            String str = this.q;
            if (str != null && str.length() > 0) {
                spz.c("PreLoadManagerNew", "preloadstatus toLoadNext is reloading, not proceed！mPreloadingUrl=" + this.q);
            } else if (this.e && c()) {
            } else {
                spz.a("PreLoadManagerNew", "toLoadNext preloadstatus ---> healthy --> delayMillis=" + j);
                this.v.removeMessages(100);
                Message obtain = Message.obtain();
                obtain.what = 100;
                this.v.sendMessageDelayed(obtain, j);
            }
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        List<com.taobao.android.fluid.framework.data.datamodel.a> unmodifiableMediaSetList = ((IDataService) this.f33784a.getService(IDataService.class)).getUnmodifiableMediaSetList();
        if (unmodifiableMediaSetList == null || unmodifiableMediaSetList.size() == this.f) {
            return true;
        }
        spz.c("PreLoadManagerNew", "reCheckDepthFull， 列表变化，");
        this.f = unmodifiableMediaSetList.size();
        this.e = false;
        return false;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : ((ILifecycleService) this.f33784a.getService(ILifecycleService.class)).getPageState() == 2;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        final DetailCacheData c = b.b().c();
        if (c == null) {
            return;
        }
        com.taobao.android.fluid.framework.data.datamodel.a mediaSetData = c.getMediaSetData();
        if (son.a(PerfConst.FEATURE_FIX_CACHE_MEDIASET, false) && mediaSetData == null && c.getMediaContentDetailData() != null) {
            try {
                spz.c("PreLoadManagerNew", "[cachevideo] preDownloadUnexposeContent try to use getMediaContentDetailData.");
                mediaSetData = new com.taobao.android.fluid.framework.data.datamodel.a((MediaContentDetailData) JSON.toJavaObject(c.getMediaContentDetailData(), MediaContentDetailData.class), c.getMediaContentDetailJson());
            } catch (Throwable th) {
                spz.c("PreLoadManagerNew", "[cachevideo] preDownloadUnexposeContent eror:" + th.getMessage());
            }
        }
        if (mediaSetData == null || mediaSetData.a() == null || !soq.h()) {
            return;
        }
        spz.c("PreLoadManagerNew", "[cachevideo] predownload unexpose content:" + mediaSetData.a().g());
        a(mediaSetData, (int) sop.a().b().c, new a() { // from class: tb.sox.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.sox.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                spz.c("PreLoadManagerNew", " predownload unexpose content cancel:" + str);
            }

            @Override // tb.sox.a
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    return;
                }
                spz.c("PreLoadManagerNew", " predownload unexpose content error:" + str);
                if (!son.a(PerfConst.FEATURE_SAVE_DOWNLOAD_ERROR_STATE, false)) {
                    return;
                }
                c.hasDownLoadError = true;
            }
        });
    }

    private com.taobao.android.fluid.framework.data.datamodel.a f() {
        String g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fluid.framework.data.datamodel.a) ipChange.ipc$dispatch("3104e9e9", new Object[]{this});
        }
        List<com.taobao.android.fluid.framework.data.datamodel.a> unmodifiableMediaSetList = ((IDataService) this.f33784a.getService(IDataService.class)).getUnmodifiableMediaSetList();
        if (unmodifiableMediaSetList == null) {
            return null;
        }
        for (int i = this.p + 1; i - this.p <= this.k && i < unmodifiableMediaSetList.size(); i++) {
            com.taobao.android.fluid.framework.data.datamodel.a aVar = unmodifiableMediaSetList.get(i);
            if (aVar != null) {
                aVar.b = i;
            }
            if (aVar != null && aVar.a() != null && !aVar.a().N() && aVar.a().z() && (g = aVar.a().g()) != null && !this.c.contains(g)) {
                return aVar;
            }
        }
        this.e = true;
        return null;
    }

    private void a(final com.taobao.android.fluid.framework.data.datamodel.a aVar, final int i, final a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26d70cd6", new Object[]{this, aVar, new Integer(i), aVar2});
            return;
        }
        final HashMap<String, String> b = sov.b(this.f33784a);
        Runnable runnable = new Runnable() { // from class: tb.sox.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    sox.a(sox.this, aVar, i, b, aVar2);
                }
            }
        };
        if (son.m()) {
            com.taobao.android.fluid.framework.performance.b.a(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(final com.taobao.android.fluid.framework.data.datamodel.a r17, int r18, java.util.HashMap<java.lang.String, java.lang.String> r19, final tb.sox.a r20) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sox.a(com.taobao.android.fluid.framework.data.datamodel.a, int, java.util.HashMap, tb.sox$a):void");
    }

    private static String a(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b77a86bc", new Object[]{aVar}) : (aVar == null || aVar.a() == null) ? "" : aVar.a().g();
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        ogg.a("PreLoadManagerNew", "check isVideoCached videoResourceStr=" + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            boolean b = oyx.b(Globals.getApplication(), new JSONObject(str));
            ogg.a("PreLoadManagerNew", "check isVideoCached=" + b);
            return b;
        } catch (JSONException e) {
            spz.c("PreLoadManagerNew", "isVideoCached error:" + e);
            e.printStackTrace();
            return false;
        }
    }
}
