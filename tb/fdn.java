package tb;

import android.support.v4.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.DetailEvent;
import com.taobao.android.detail.core.event.basic.n;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.request.addon.AddonModel;
import com.taobao.android.detail.wrapper.ext.request.addon.AddonParams;
import com.taobao.android.detail.wrapper.ext.request.addon.AddonRequestClient;
import com.taobao.android.detail.wrapper.fragment.addon.AddonDialogFragment;
import com.taobao.android.trade.boost.request.mtop.a;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public class fdn implements a<AddonModel>, j<edd> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "OpenAddonSubscriber";

    /* renamed from: a  reason: collision with root package name */
    private DetailActivity f27837a;
    private AddonDialogFragment b;
    private AddonModel c;
    private FragmentManager d;
    private boolean e = false;
    private boolean f = false;
    private String g;

    static {
        kge.a(912440666);
        kge.a(-1453870097);
        kge.a(1595456606);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* bridge */ /* synthetic */ void onFailure(MtopResponse mtopResponse) {
    }

    @Override // com.taobao.android.trade.boost.request.mtop.a
    public void onSystemFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
        }
    }

    public static /* synthetic */ AddonDialogFragment a(fdn fdnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AddonDialogFragment) ipChange.ipc$dispatch("b3709a0c", new Object[]{fdnVar}) : fdnVar.b;
    }

    public static /* synthetic */ boolean a(fdn fdnVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2296f270", new Object[]{fdnVar, new Boolean(z)})).booleanValue();
        }
        fdnVar.e = z;
        return z;
    }

    public static /* synthetic */ boolean b(fdn fdnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6da73ed", new Object[]{fdnVar})).booleanValue() : fdnVar.e;
    }

    public static /* synthetic */ FragmentManager c(fdn fdnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("1cb1799d", new Object[]{fdnVar}) : fdnVar.d;
    }

    public static /* synthetic */ boolean d(fdn fdnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3e080ef", new Object[]{fdnVar})).booleanValue() : fdnVar.f;
    }

    public static /* synthetic */ void e(fdn fdnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a263876c", new Object[]{fdnVar});
        } else {
            fdnVar.a();
        }
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(edd eddVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eddVar}) : a(eddVar);
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
        } else {
            a((AddonModel) obj);
        }
    }

    public fdn(DetailActivity detailActivity) {
        this.f27837a = detailActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.pieceTogether.OpenAddonSubscriber");
        d a2 = f.a(this.f27837a);
        if (a2 != null) {
            a2.a(eno.a(n.class), new j() { // from class: tb.fdn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.trade.event.j
                public i handleEvent(Event event) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
                    }
                    fdn.a(fdn.this, true);
                    if (fdn.a(fdn.this) != null && fdn.a(fdn.this).isAdded() && fdn.a(fdn.this).isVisible()) {
                        fdn.a(fdn.this).onTemporaryPause();
                    }
                    return i.SUCCESS;
                }

                @Override // com.taobao.android.trade.event.j
                public ThreadMode getThreadMode() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
                }
            });
            a2.a(eno.a(DetailEvent.class), new j() { // from class: tb.fdn.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.trade.event.j
                public i handleEvent(Event event) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
                    }
                    if (fdn.b(fdn.this)) {
                        if (fdn.a(fdn.this) != null) {
                            fdn.a(fdn.this).onTemporaryResume(fdn.c(fdn.this), fdn.TAG);
                        } else if (fdn.d(fdn.this)) {
                            fdn.e(fdn.this);
                        }
                    }
                    fdn.a(fdn.this, false);
                    return i.SUCCESS;
                }

                @Override // com.taobao.android.trade.event.j
                public ThreadMode getThreadMode() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
                }
            });
        }
    }

    public i a(edd eddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("156b627c", new Object[]{this, eddVar});
        }
        DetailActivity detailActivity = this.f27837a;
        if (detailActivity == null || detailActivity.isFinishing()) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        if (this.e) {
            this.f = true;
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }
        a();
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f = false;
        if (this.d == null) {
            this.d = this.f27837a.getSupportFragmentManager();
        }
        if (this.b == null) {
            this.b = new AddonDialogFragment();
        }
        this.d.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: tb.fdn.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.app.FragmentManager.OnBackStackChangedListener
            public void onBackStackChanged() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2062519", new Object[]{this});
                } else if (fdn.c(fdn.this).getBackStackEntryCount() == 0) {
                    fdn.a(fdn.this).onTemporaryResume(fdn.c(fdn.this), fdn.TAG);
                } else {
                    fdn.a(fdn.this).onTemporaryPause();
                }
            }
        });
        c cVar = this.f27837a.y().t;
        this.g = String.valueOf(System.currentTimeMillis());
        new AddonRequestClient().execute(new AddonParams(cVar.i(), String.valueOf(this.g)), this, epo.f());
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    public void a(AddonModel addonModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("948cc5ea", new Object[]{this, addonModel});
            return;
        }
        DetailActivity detailActivity = this.f27837a;
        if (detailActivity == null || detailActivity.Y()) {
            return;
        }
        this.c = addonModel;
        if (this.c == null || this.f27837a.y() == null || this.f27837a.y().t == null) {
            return;
        }
        this.c.itemId = this.f27837a.y().t.i();
        this.c.sellId = this.f27837a.y().t.h();
        if (addonModel.addOnSession == null || !addonModel.addOnSession.equals(this.g) || this.c.items.size() < 3) {
            return;
        }
        if (!fgy.a(this.b)) {
            this.b.setData(this.c);
            this.b.show(this.d, TAG);
            return;
        }
        this.b.updateData(this.c);
    }
}
