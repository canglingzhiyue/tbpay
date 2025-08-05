package tb;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.ae;
import com.taobao.taolive.sdk.permisson.a;
import com.taobao.taolive.sdk.playcontrol.c;
import com.taobao.taolive.sdk.ui.component.VideoFrame;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.m;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.u;

/* loaded from: classes8.dex */
public class lrd implements lmy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final com.taobao.alilive.aliliveframework.frame.a f30851a;
    public final VideoFrame b;
    public final Context c;
    private a d;

    static {
        kge.a(300981190);
        kge.a(-224794152);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(lrd lrdVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c576ed90", new Object[]{lrdVar, str, new Boolean(z)});
        } else {
            lrdVar.a(str, z);
        }
    }

    public static /* synthetic */ void a(lrd lrdVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7753439a", new Object[]{lrdVar, new Boolean(z)});
        } else {
            lrdVar.a(z);
        }
    }

    public lrd(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, VideoFrame videoFrame) {
        this.f30851a = aVar;
        this.b = videoFrame;
        this.c = context;
    }

    @Override // tb.lmy
    public void a() {
        VideoFrame videoFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!o.f() || this.d == null || (videoFrame = this.b) == null || videoFrame.getDialogHandler() == null) {
        } else {
            this.b.getDialogHandler().removeCallbacks(this.d);
        }
    }

    @Override // tb.lmy
    public void a(PlayerController2 playerController2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c5ac5e0", new Object[]{this, playerController2, new Boolean(z)});
            return;
        }
        c.a(this.f30851a, this.c, !z);
        if (playerController2 == null) {
            return;
        }
        playerController2.addControllerView();
    }

    @Override // tb.lmy
    public void a(String str, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f296e2", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            b(str, z, z2, c());
        }
    }

    public void b(String str, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbea01", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        String liveContextKey = this.b.getLiveContextKey();
        m.a("VideoFrameAbstractHalfScreenSmall", "lifeCycle stop mLiveContextKey = " + liveContextKey + " id = " + str + " enableCloseSmallWindow = " + z);
        if (this.b.isStatus(0) || this.b.isStatus(2) || c.i(this.f30851a) == VideoStatus.VIDEO_TIMESHIFT_STATUS) {
            boolean isInError = this.b.isInError();
            boolean isInLoading = this.b.isInLoading();
            boolean b = ae.b("KEY_WINDOW_ZOOM_SWITCH", true);
            boolean j = c.j(this.f30851a);
            boolean i = u.i();
            boolean isDisableSmallWindow = this.b.isDisableSmallWindow();
            boolean hasCompleted = this.b.hasCompleted();
            boolean enableShowSmallWindow = this.b.enableShowSmallWindow();
            m.a("VideoFrameAbstractHalfScreenSmall", "lifeCycle stop check mLiveContextKey = " + liveContextKey + " smallSettingSwitch = " + b + " enableShowSmallWindowByConfig = " + z3 + " inSmallMode = " + j + " mDisableSmallWindow = " + isDisableSmallWindow + " mHasCompleted = " + hasCompleted + " inError = " + isInError + " inLoading = " + isInLoading + " isSmallWindowOrange = " + i + " isOpenSmallWindowOnce = " + z2);
            if (!j && !isDisableSmallWindow && !hasCompleted && !isInError && !isInLoading && i && b && enableShowSmallWindow && z2 && z3) {
                m.a("VideoFrameAbstractHalfScreenSmall", "lifeCycle stop ShowSmallWindow mLiveContextKey = " + liveContextKey);
                if (Build.VERSION.SDK_INT >= 24) {
                    if (Settings.canDrawOverlays(this.c)) {
                        a(str, z);
                        return;
                    }
                    com.taobao.taolive.sdk.permisson.a.f21875a = true;
                    if (this.b.getDialogHandler() != null) {
                        this.d = new a(str, z);
                        this.b.getDialogHandler().postDelayed(this.d, 500L);
                    }
                    m.a("VideoFrameAbstractHalfScreenSmall", "lifeCycle stop check smallWindow permission mLiveContextKey = " + liveContextKey);
                    return;
                }
                a(str, z);
            } else if (c.j(this.f30851a)) {
            } else {
                a(true);
            }
        } else if (!this.b.isStatus(3)) {
        } else {
            a(true);
        }
    }

    /* loaded from: classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private boolean c;

        static {
            kge.a(1647451422);
            kge.a(-1390502639);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6f7c1223", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cbafea62", new Object[]{aVar})).booleanValue() : aVar.c;
        }

        public a(String str, boolean z) {
            this.b = str;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                com.taobao.taolive.sdk.permisson.a.a(lrd.this.c, new a.InterfaceC0910a() { // from class: tb.lrd.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            lrd.a(lrd.this, a.a(a.this), a.b(a.this));
                        }
                    }

                    @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                    public void b() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        } else {
                            lrd.a(lrd.this, true);
                        }
                    }
                });
            }
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.f30851a;
        if (aVar != null && aVar.o() != null && this.f30851a.o() != null && this.f30851a.o().abilityCompontent != null) {
            return this.f30851a.o().abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_MiniPlayer);
        }
        return true;
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (!c.a(this.f30851a, this.c, str, !this.b.isStatus(0), z)) {
            a(true);
        } else {
            this.b.removeControllerView();
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        VideoFrame videoFrame = this.b;
        if (videoFrame == null || !videoFrame.pausePlay()) {
            return;
        }
        this.b.setNeedResume(z);
    }
}
