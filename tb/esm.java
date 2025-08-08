package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.navigationextern.model.IconIntroductoryDatasource;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.task.Coordinator;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.NavigationTabMsgMode;
import com.taobao.tao.navigation.a;
import com.taobao.tao.navigation.e;
import com.taobao.tao.navigation.f;
import com.taobao.tao.navigation.k;
import com.taobao.tao.navigation.l;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class esm implements IconIntroductoryDatasource.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private omm f27532a;
    private omm b;
    private final Handler e = new Handler(Looper.getMainLooper());
    private volatile boolean f = false;
    private final List<IconIntroductoryDatasource.a> g = new ArrayList();
    private final IconIntroductoryDatasource c = new IconIntroductoryDatasource(this);
    private final e.f d = new eso();

    public static /* synthetic */ void a(esm esmVar, IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21fff8b7", new Object[]{esmVar, aVar});
        } else {
            esmVar.i(aVar);
        }
    }

    public static /* synthetic */ void a(esm esmVar, String str, Drawable drawable, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bd8ef2", new Object[]{esmVar, str, drawable, str2, new Integer(i)});
        } else {
            esmVar.a(str, drawable, str2, i);
        }
    }

    public static /* synthetic */ void a(esm esmVar, String str, String str2, NavigationTabMsgMode navigationTabMsgMode, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2126968", new Object[]{esmVar, str, str2, navigationTabMsgMode, str3});
        } else {
            esmVar.a(str, str2, navigationTabMsgMode, str3);
        }
    }

    public static /* synthetic */ boolean a(esm esmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e77580fd", new Object[]{esmVar})).booleanValue() : esmVar.f;
    }

    public static /* synthetic */ boolean a(esm esmVar, NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a01f1d8", new Object[]{esmVar, navigationTabMsgMode, str})).booleanValue() : esmVar.a(navigationTabMsgMode, str);
    }

    public static /* synthetic */ List b(esm esmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2712278d", new Object[]{esmVar}) : esmVar.g;
    }

    public static /* synthetic */ void b(esm esmVar, IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ec6638", new Object[]{esmVar, aVar});
        } else {
            esmVar.d(aVar);
        }
    }

    public static /* synthetic */ Handler c(esm esmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ff3830eb", new Object[]{esmVar}) : esmVar.e;
    }

    public static /* synthetic */ void c(esm esmVar, IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d8d3b9", new Object[]{esmVar, aVar});
        } else {
            esmVar.b(aVar);
        }
    }

    public static /* synthetic */ void d(esm esmVar, IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c5413a", new Object[]{esmVar, aVar});
        } else {
            esmVar.h(aVar);
        }
    }

    public static /* synthetic */ void e(esm esmVar, IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1aebb", new Object[]{esmVar, aVar});
        } else {
            esmVar.j(aVar);
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!com.taobao.android.navigationextern.e.j()) {
            TLog.loge(a.a(), "NavigationGuardianController", "init failed. switch is off");
        } else {
            this.c.a(context);
            e.a(this.d);
            efv.a().b();
        }
    }

    private omm c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (omm) ipChange.ipc$dispatch("1e6c0b6d", new Object[]{this});
        }
        if (this.f27532a == null) {
            this.f27532a = new e.c();
        }
        return this.f27532a;
    }

    private omm d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (omm) ipChange.ipc$dispatch("261db0cc", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new e.a(new esu());
        }
        return this.b;
    }

    public void a() {
        omm c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (f.f() && !TBRevisionSwitchManager.i().a(ilw.KEY_NEW_DISCOVERY_ENABLE)) {
            c = d();
        } else {
            c = c();
        }
        e.a(c);
    }

    private void b(final IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fb8ba7", new Object[]{this, aVar});
            return;
        }
        String string = aVar.d.getString("disappearDuration");
        try {
            int parseInt = Integer.parseInt(string);
            if (parseInt == 0) {
                hut.b("NavigationGuardianController", "startDelayRemoveOperation duration is 0. cancel delay remove bizCode:" + aVar.e);
                return;
            }
            this.e.postDelayed(new Runnable() { // from class: tb.esm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        esm.a(esm.this, aVar);
                    }
                }
            }, parseInt);
        } catch (NumberFormatException unused) {
            hut.b("NavigationGuardianController", "startDelayRemoveOperation duration parse error. duration: " + string + " bizCode:" + aVar.e);
        }
    }

    private void c(IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ca0a28", new Object[]{this, aVar});
        } else if (NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_INBOX_NUM.equals(aVar.c) || NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_INBOX_TEXT.equals(aVar.c) || NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_OUTBOX_TEXT.equals(aVar.c) || NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_OUTBOX_NUM.equals(aVar.c)) {
            f(aVar);
        } else if (!NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_INBOX.equals(aVar.c) && !NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_OUTBOX.equals(aVar.c)) {
        } else {
            g(aVar);
        }
    }

    private void d(IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779888a9", new Object[]{this, aVar});
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) JSONObject.parse(aVar.f);
            if (jSONObject == null) {
                String a2 = a.a();
                TLog.loge(a2, "NavigationGuardianController", "sendUtExposure jsonObject is null. bizCode:" + aVar.e + " trackInfo:" + aVar.f);
                return;
            }
            k.a(aVar.e, aVar.b, aVar.c, jSONObject.getString("augeTrackInfo"));
        } catch (Throwable th) {
            String a3 = a.a();
            TLog.loge(a3, "NavigationGuardianController", "sendUtExposure error. bizCode:" + aVar.e + " trackInfo:" + aVar.f);
            StringBuilder sb = new StringBuilder();
            sb.append(th);
            sb.append("sendUtExposure error. bizCode:");
            sb.append(aVar.e);
            omr.a("NavigationGuardianController", sb.toString());
        }
    }

    private void a(final String str, final String str2, final NavigationTabMsgMode navigationTabMsgMode, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59135197", new Object[]{this, str, str2, navigationTabMsgMode, str3});
        } else {
            this.e.post(new Runnable() { // from class: tb.esm.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        l.a(str, str2, navigationTabMsgMode, str3);
                    }
                }
            });
        }
    }

    private void a(final String str, final Drawable drawable, final String str2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7330863", new Object[]{this, str, drawable, str2, new Integer(i)});
        } else {
            this.e.post(new Runnable() { // from class: tb.esm.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        l.a(str, drawable, str2, i);
                    }
                }
            });
        }
    }

    private boolean a(NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f6c587", new Object[]{this, navigationTabMsgMode, str})).booleanValue();
        }
        if (navigationTabMsgMode == NavigationTabMsgMode.GUARDIAN_TEXT && (StringUtils.isEmpty(str) || str.length() > 5)) {
            return true;
        }
        return navigationTabMsgMode == NavigationTabMsgMode.GUARDIAN_NUM && !esu.a(str);
    }

    private void e(IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7867072a", new Object[]{this, aVar});
            return;
        }
        Boolean c = l.c(aVar.e);
        if (c == null || c.booleanValue()) {
            hut.b("NavigationGuardianController", "addCommonMark indicatorView is null or selected.");
            return;
        }
        String string = aVar.d.getString(aVar.c);
        NavigationTabMsgMode navigationTabMsgMode = StringUtils.equals(aVar.c, "text") ? NavigationTabMsgMode.GUARDIAN_TEXT : NavigationTabMsgMode.GUARDIAN_NUM;
        if (a(navigationTabMsgMode, string)) {
            hut.b("NavigationGuardianController", "addCommonMark indicatorView failed. " + aVar);
            return;
        }
        a(aVar.e, string, navigationTabMsgMode, aVar.f);
        efv.a().a(aVar.e, aVar.b, 14, aVar.g);
        d(aVar);
        b(aVar);
    }

    private void f(final IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793585ab", new Object[]{this, aVar});
        } else {
            b.h().a(aVar.d.getString(eby.KEY_PIC_URL)).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.esm.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[Catch: Throwable -> 0x00fc, TryCatch #0 {Throwable -> 0x00fc, blocks: (B:6:0x001e, B:8:0x0028, B:11:0x0030, B:13:0x003f, B:16:0x004c, B:18:0x0058, B:22:0x007e, B:24:0x0086, B:26:0x009d, B:28:0x00a3, B:32:0x00b4, B:20:0x0064, B:21:0x0072, B:33:0x00f6), top: B:38:0x001e }] */
                /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[Catch: Throwable -> 0x00fc, TryCatch #0 {Throwable -> 0x00fc, blocks: (B:6:0x001e, B:8:0x0028, B:11:0x0030, B:13:0x003f, B:16:0x004c, B:18:0x0058, B:22:0x007e, B:24:0x0086, B:26:0x009d, B:28:0x00a3, B:32:0x00b4, B:20:0x0064, B:21:0x0072, B:33:0x00f6), top: B:38:0x001e }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public boolean a(com.taobao.phenix.intf.event.SuccPhenixEvent r9) {
                    /*
                        Method dump skipped, instructions count: 313
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: tb.esm.AnonymousClass4.a(com.taobao.phenix.intf.event.SuccPhenixEvent):boolean");
                }
            }).fetch();
        }
    }

    private void g(final IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a04042c", new Object[]{this, aVar});
        } else {
            b.h().a(aVar.d.getString(eby.KEY_PIC_URL)).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.esm.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    Boolean c;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    try {
                        c = l.c(aVar.e);
                    } catch (Throwable th) {
                        hut.b("NavigationGuardianController", "addAlienEffectiveWithoutCommonMark error." + th + " dataCompat:" + aVar);
                        StringBuilder sb = new StringBuilder();
                        sb.append(th);
                        sb.append("_bizCode_");
                        sb.append(aVar.e);
                        omr.a("addAlienEffectiveWithoutCommonMark", sb.toString());
                    }
                    if (c != null && !c.booleanValue()) {
                        esm.a(esm.this, aVar.e, succPhenixEvent.getDrawable(), aVar.f, (aVar.c == null || !aVar.c.contains(NavigationTabConstraints.TAB_ALIEN_EFFECTIVE_INBOX)) ? 11 : 12);
                        efv.a().a(aVar.e, aVar.b, 14, aVar.g);
                        esm.c(esm.this, aVar);
                        esm.b(esm.this, aVar);
                        return true;
                    }
                    TLog.loge(a.a(), "NavigationGuardianController", "addCommonMark indicatorView is null or selected.");
                    return true;
                }
            }).fetch();
        }
    }

    private void h(IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad282ad", new Object[]{this, aVar});
            return;
        }
        try {
            if (NavigationTabConstraints.MATERIAL_TYPE_ALIEN_EFFECTIVE.equals(aVar.b)) {
                c(aVar);
            } else if (!NavigationTabConstraints.MATERIAL_TYPE_COMMON_MARK.equals(aVar.b)) {
            } else {
                e(aVar);
            }
        } catch (Throwable th) {
            hut.b("NavigationGuardianController", "doAddOperation error." + th + " dataCompat:" + aVar);
            StringBuilder sb = new StringBuilder();
            sb.append(th);
            sb.append("_bizCode_");
            sb.append(aVar.e);
            omr.a("doAddOperation", sb.toString());
        }
    }

    private void i(IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba1012e", new Object[]{this, aVar});
            return;
        }
        l.a(aVar.e);
        l.b(aVar.e);
        efv.a().a(aVar.e, aVar.b, 15, null);
    }

    private void j(IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6f7faf", new Object[]{this, aVar});
        } else {
            l.e(aVar.e);
        }
    }

    @Override // com.taobao.android.navigationextern.model.IconIntroductoryDatasource.b
    public void a(final IconIntroductoryDatasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("752d0d26", new Object[]{this, aVar});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.esm.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!esm.a(esm.this)) {
                        esm.b(esm.this).add(aVar);
                    } else if (aVar.f14473a == 11) {
                        esm.d(esm.this, aVar);
                    } else if (aVar.f14473a == 12) {
                        esm.c(esm.this).post(new Runnable() { // from class: tb.esm.6.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    esm.a(esm.this, aVar);
                                }
                            }
                        });
                    } else if (aVar.f14473a != 13) {
                    } else {
                        esm.c(esm.this).post(new Runnable() { // from class: tb.esm.6.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    esm.e(esm.this, aVar);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f = true;
        if (this.g.isEmpty()) {
            TLog.loge(a.a(), "NavigationGuardianController", "onLaunchTaskAttached cacheDataCompat is empty.");
            return;
        }
        for (IconIntroductoryDatasource.a aVar : this.g) {
            a(aVar);
        }
        this.g.clear();
    }
}
