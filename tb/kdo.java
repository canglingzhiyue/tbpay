package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ScheduleComposer;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.h;
import com.taobao.bootimage.view.a;
import java.util.List;
import tb.kdu;

/* loaded from: classes.dex */
public class kdo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a c;
    private final kdu.a d = new kdu.a() { // from class: tb.kdo.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.kdu.a
        public void a(kdt kdtVar, int i, String str, Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39a1d782", new Object[]{this, kdtVar, new Integer(i), str, activity});
            } else if (i != 0 || h.a(activity.getLocalClassName()).e().b()) {
            } else {
                kdo.a(kdo.this, activity);
                kdo.a(kdo.this, new a(activity.getLocalClassName(), kdtVar, kdo.a(kdo.this), kdo.b(kdo.this)));
                kdo.b(kdo.this).a(activity, kdtVar, kdo.c(kdo.this));
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final kds f29984a = new kds();
    private final kdr b = new kdr();

    static {
        kge.a(-190051863);
    }

    public static /* synthetic */ a a(kdo kdoVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("98193bb0", new Object[]{kdoVar, aVar});
        }
        kdoVar.c = aVar;
        return aVar;
    }

    public static /* synthetic */ kds a(kdo kdoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kds) ipChange.ipc$dispatch("3c5c806a", new Object[]{kdoVar}) : kdoVar.f29984a;
    }

    public static /* synthetic */ void a(kdo kdoVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febcdeb4", new Object[]{kdoVar, activity});
        } else {
            kdoVar.b(activity);
        }
    }

    public static /* synthetic */ kdr b(kdo kdoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kdr) ipChange.ipc$dispatch("23fe56aa", new Object[]{kdoVar}) : kdoVar.b;
    }

    public static /* synthetic */ a c(kdo kdoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("90d5f645", new Object[]{kdoVar}) : kdoVar.c;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.f29984a.b() != null && this.f29984a.b().size() > 0) {
            z = true;
        }
        kej.a("AdBootInfoController", "isExistCache " + z);
        return z;
    }

    public List<LinkedSplashData> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.f29984a.b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        kej.a("AdBootInfoController", "loadAdCache");
        this.f29984a.a();
    }

    public void a(BootImageInfo bootImageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75806d8e", new Object[]{this, bootImageInfo});
            return;
        }
        this.f29984a.a(bootImageInfo.itemId);
        this.f29984a.a(bootImageInfo.itemId, bootImageInfo.periodSeconds);
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (activity == null) {
        } else {
            new kdq(this.f29984a, activity).a(this.d);
        }
    }

    private void b(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
        } else if (activity == null || (intent = activity.getIntent()) == null) {
        } else {
            intent.putExtra(ScheduleComposer.PARCEL_KEY_BOOT_IMAGE_AD, true);
        }
    }

    public void a(List<LinkedSplashData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        kej.a("AdBootInfoController", "saveAdInfo");
        this.f29984a.a(list);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        kej.a("AdBootInfoController", "clearAdvInfo");
        this.f29984a.c();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b.f();
        kej.a("AdBootInfoController", "advView exitAdView");
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }
}
