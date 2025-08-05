package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.hjl;
import tb.hni;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes5.dex */
public class ese implements shm, snd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int f27517a;
    private static final String[] b;
    private FluidContext c;
    private psy d;
    private boolean g;
    private int e = 0;
    private int f = 0;
    private Set<String> h = new HashSet();
    private Handler i = new Handler(Looper.getMainLooper());
    private boolean j = oeb.a("ShortVideo.enableCardMonitor", true);
    private Runnable k = new Runnable() { // from class: tb.ese.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ArrayList arrayList = new ArrayList();
            ese.a(ese.this, (ViewGroup) ese.a(ese.this).B(), arrayList);
            if (arrayList.size() == 0) {
                ese.a(ese.this, "noPlayer", (Map) null);
            } else if (arrayList.size() > 1) {
                ese.a(ese.this, "multiPlayer", (Map) null);
            } else if (arrayList.size() != 1) {
            } else {
                ViewGroup viewGroup = (ViewGroup) arrayList.get(0);
                if (viewGroup.getWidth() != 0 && viewGroup.getHeight() != 0) {
                    return;
                }
                ese.a(ese.this, "emptyPlayerSize", (Map) null);
            }
        }
    };

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        }
    }

    @Override // tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
        }
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
        }
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa3311", new Object[]{this, pswVar, aVar, new Integer(i), list});
        }
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
        }
    }

    @Override // tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    @Override // tb.shm
    public void onWillActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
        }
    }

    @Override // tb.shm
    public void onWillDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
        }
    }

    public static /* synthetic */ psy a(ese eseVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psy) ipChange.ipc$dispatch("47c68d4f", new Object[]{eseVar}) : eseVar.d;
    }

    public static /* synthetic */ void a(ese eseVar, ViewGroup viewGroup, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ded0e431", new Object[]{eseVar, viewGroup, list});
        } else {
            eseVar.a(viewGroup, list);
        }
    }

    public static /* synthetic */ void a(ese eseVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0704a9a", new Object[]{eseVar, str, map});
        } else {
            eseVar.a(str, map);
        }
    }

    public static /* synthetic */ boolean a(ese eseVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ca5526", new Object[]{eseVar, new Integer(i)})).booleanValue() : eseVar.a(i);
    }

    public static /* synthetic */ boolean a(ese eseVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ca94f7", new Object[]{eseVar, new Boolean(z)})).booleanValue();
        }
        eseVar.g = z;
        return z;
    }

    public static /* synthetic */ int b(ese eseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5f4e475", new Object[]{eseVar})).intValue();
        }
        int i = eseVar.f;
        eseVar.f = i + 1;
        return i;
    }

    public static /* synthetic */ void b(ese eseVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e7d839", new Object[]{eseVar, str, map});
        } else {
            eseVar.b(str, map);
        }
    }

    public static /* synthetic */ boolean c(ese eseVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c477eb07", new Object[]{eseVar})).booleanValue() : eseVar.g;
    }

    public static /* synthetic */ int d(ese eseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2faf177", new Object[]{eseVar})).intValue();
        }
        int i = eseVar.e;
        eseVar.e = i + 1;
        return i;
    }

    public static /* synthetic */ int e(ese eseVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a17df7f8", new Object[]{eseVar})).intValue() : eseVar.e;
    }

    public static /* synthetic */ FluidContext f(ese eseVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("5687e002", new Object[]{eseVar}) : eseVar.c;
    }

    static {
        kge.a(230897611);
        kge.a(267465044);
        kge.a(1755210026);
        f27517a = oeb.a("ShortVideo.checkPlayStateTimeout", 1000);
        b = oeb.a("ShortVideo.excludedErrorCode", "-10604").split(",");
    }

    private void a(ViewGroup viewGroup, List<ViewGroup> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6716bf98", new Object[]{this, viewGroup, list});
            return;
        }
        if (viewGroup.getTag(R.id.fluid_sdk_tag_is_video_view) != null) {
            list.add(viewGroup);
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                a((ViewGroup) viewGroup.getChildAt(i), list);
            }
        }
    }

    public ese(FluidContext fluidContext, psy psyVar) {
        this.c = fluidContext;
        this.d = psyVar;
        if (this.j) {
            psyVar.t().a(this);
            psyVar.P().addVideoPlayerListener(new hni.a() { // from class: tb.ese.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == 1047453045) {
                        super.onVideoProgressChanged((psw) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // tb.hni.a, tb.hni
                public void onVideoError(psw pswVar, Object obj, int i, int i2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("a8308feb", new Object[]{this, pswVar, obj, new Integer(i), new Integer(i2)});
                        return;
                    }
                    ese.b(ese.this);
                    if (!ese.c(ese.this)) {
                        ese.d(ese.this);
                        if (ese.e(ese.this) > 1) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("what", Integer.valueOf(i));
                            hashMap.put("extra", Integer.valueOf(i2));
                            ese.a(ese.this, "playerError", hashMap);
                        }
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("what", Integer.valueOf(i));
                    hashMap2.put("extra", Integer.valueOf(i2));
                    ese.b(ese.this, "playerError", hashMap2);
                }

                @Override // tb.hni.a, tb.hni
                public void onVideoProgressChanged(psw pswVar, int i, int i2, int i3) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3e6edd75", new Object[]{this, pswVar, new Integer(i), new Integer(i2), new Integer(i3)});
                        return;
                    }
                    super.onVideoProgressChanged(pswVar, i, i2, i3);
                    ese.a(ese.this, true);
                }
            });
            psyVar.P().a(new hjl.a() { // from class: tb.ese.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                    if (str.hashCode() == 779811250) {
                        return new Boolean(super.onInfo((psw) objArr[0], (IMediaPlayer) objArr[1], ((Number) objArr[2]).longValue(), ((Number) objArr[3]).longValue(), ((Number) objArr[4]).longValue(), objArr[5]));
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // tb.hjl.a, tb.hjl
                public boolean onError(psw pswVar, IMediaPlayer iMediaPlayer, int i, int i2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("193dfed2", new Object[]{this, pswVar, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                    }
                    if (ese.a(ese.this, i)) {
                        return false;
                    }
                    if (!ese.c(ese.this)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("what", Integer.valueOf(i));
                        hashMap.put("extra", Integer.valueOf(i2));
                        ese.a(ese.this, "playerError", hashMap);
                    }
                    ese.b(ese.this);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("what", Integer.valueOf(i));
                    hashMap2.put("extra", Integer.valueOf(i2));
                    ese.b(ese.this, "playerError", hashMap2);
                    return false;
                }

                @Override // tb.hjl.a, tb.hjl
                public boolean onInfo(psw pswVar, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("2e7af9b2", new Object[]{this, pswVar, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                    }
                    if (3 == j) {
                        ese.a(ese.this, true);
                    }
                    return super.onInfo(pswVar, iMediaPlayer, j, j2, j3, obj);
                }
            });
        }
    }

    @Override // tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
            return;
        }
        oec.a(new Runnable() { // from class: tb.ese.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((ILifecycleService) ese.f(ese.this).getService(ILifecycleService.class)).addPageLifecycleListener(ese.this);
                }
            }
        });
        a.c D = pswVar.D();
        if (D != null && !D.v() && !((ICollectionService) this.c.getService(ICollectionService.class)).isCollectionPage(this.c)) {
            a("noPermission", (Map) null);
            return;
        }
        psy psyVar = this.d;
        if (!(psyVar instanceof sii) && !(psyVar instanceof sic)) {
            return;
        }
        this.i.postDelayed(this.k, f27517a);
    }

    @Override // tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
            return;
        }
        this.e = 0;
        this.g = false;
        this.f = 0;
        this.i.removeCallbacks(this.k);
        oec.a(new Runnable() { // from class: tb.ese.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((ILifecycleService) ese.f(ese.this).getService(ILifecycleService.class)).removePageLifecycleListener(ese.this);
                }
            }
        });
    }

    @Override // tb.shm
    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
        } else {
            oec.a(new Runnable() { // from class: tb.ese.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ((ILifecycleService) ese.f(ese.this).getService(ILifecycleService.class)).removePageLifecycleListener(ese.this);
                    }
                }
            });
        }
    }

    private void a(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (this.h.contains(str)) {
        } else {
            this.h.add(str);
            if (map == null) {
                map = new HashMap();
            }
            a(map);
            ((ITrackService) this.c.getService(ITrackService.class)).getTrackTint().a(t.MODULE_FULL_PAGE, "blackScreen", str, map);
            spz.c("CardMonitor", "reportBlackScreen:" + str + " args:" + map);
        }
    }

    private void b(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        if (map == null) {
            map = new HashMap();
        }
        a(map);
        map.put("hasFirstFrame", Boolean.valueOf(this.g));
        map.put("count", Integer.valueOf(this.f));
        ((ITrackService) this.c.getService(ITrackService.class)).getTrackTint().a(t.MODULE_FULL_PAGE, "playerState", str, map);
        spz.c("CardMonitor", "reportBlackScreen:" + str + " args:" + map);
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        psy psyVar = this.d;
        if (!(psyVar instanceof sii) && !(psyVar instanceof sic)) {
            return;
        }
        this.i.removeCallbacks(this.k);
        this.i.postDelayed(this.k, f27517a);
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.i.removeCallbacks(this.k);
        }
    }

    private void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        map.put("type", Integer.valueOf(this.d.c()));
        map.put("contentId", this.d.D().g());
        map.put("position", Integer.valueOf(this.d.r()));
        map.put("bizType", this.c.getInstanceConfig().getBizType());
        sps sessionParams = ((ISceneConfigService) this.c.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams == null) {
            return;
        }
        Map<String, String> c = sessionParams.c();
        if (c != null) {
            map.put("sceneSource", c.get("sceneSource"));
        }
        map.put("source", sessionParams.c);
        map.put("sessionType", sessionParams.b);
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        for (String str : b) {
            if (TextUtils.equals(str, String.valueOf(i))) {
                return true;
            }
        }
        return false;
    }
}
