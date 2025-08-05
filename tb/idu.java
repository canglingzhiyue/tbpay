package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.utils.i;
import com.taobao.android.purchase.core.utils.b;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import tb.arc;

/* loaded from: classes6.dex */
public class idu extends ids {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f28944a;
    private final nhm b;
    private FragmentActivity c;
    private boolean d;
    private OnScreenChangedListener e;
    private final int f;
    private final int g;
    private final boolean h;

    static {
        kge.a(919590257);
    }

    public static /* synthetic */ Object ipc$super(idu iduVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2008176955:
                super.a((FragmentActivity) objArr[0], (String) objArr[1]);
                return null;
            case -1350238568:
                super.d((FragmentActivity) objArr[0]);
                return null;
            case -605313163:
                super.g((FragmentActivity) objArr[0]);
                return null;
            case 1761381431:
                super.e((FragmentActivity) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.ids
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : TBBuyPageMode.fullPageMode;
    }

    @Override // tb.ids
    public String f(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e4e018a", new Object[]{this, fragmentActivity}) : "native";
    }

    public static /* synthetic */ nhm a(idu iduVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nhm) ipChange.ipc$dispatch("dcb40f55", new Object[]{iduVar}) : iduVar.b;
    }

    public idu(nhm nhmVar, int i, int i2) {
        this(nhmVar, i, i2, false);
    }

    public idu(nhm nhmVar, int i, int i2, boolean z) {
        this.f28944a = "TBBuyFullScreenPageRender";
        this.d = false;
        this.b = nhmVar;
        this.f = i;
        this.g = i2;
        this.h = z;
    }

    @Override // tb.ids
    public void a(FragmentActivity fragmentActivity, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884da6c5", new Object[]{this, fragmentActivity, str});
            return;
        }
        super.a(fragmentActivity, str);
        this.c = fragmentActivity;
        if (!AliBuyPerfSwitcher.enableInteractionPerf() || i.a((Context) fragmentActivity)) {
            z = false;
        }
        this.d = z;
        if (!i.a((Context) fragmentActivity)) {
            return;
        }
        arc.a().a("当前进入大屏模式");
        c(fragmentActivity);
    }

    private void c(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60d70f9", new Object[]{this, fragmentActivity});
            return;
        }
        this.e = new OnScreenChangedListener() { // from class: tb.idu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onScreenChanged(int i, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                } else {
                    idu.a(idu.this).refreshPage(false);
                }
            }
        };
        h.a().c(this.e);
    }

    @Override // tb.ids
    public void b(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c95e35a", new Object[]{this, fragmentActivity});
            return;
        }
        if (AliBuyPerfSwitcher.enablePreloadView()) {
            fragmentActivity.setContentView(ijt.b(fragmentActivity, this.f), new ViewGroup.LayoutParams(-1, -1));
        } else {
            fragmentActivity.setContentView(this.f);
        }
        b((Activity) fragmentActivity);
        this.b.a((Activity) fragmentActivity);
        a(fragmentActivity);
    }

    @Override // tb.ids
    public void a(FragmentActivity fragmentActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9545db37", new Object[]{this, fragmentActivity, view});
        } else if (view == null) {
            arc.a().b("contentView为空了", arc.a.a().b("TBBuyFullScreenPageRender").b());
            fke.a(fragmentActivity);
        } else {
            this.b.a(fragmentActivity, (ViewGroup) view.findViewById(this.g));
            this.b.h();
            this.b.f();
            this.b.i();
        }
    }

    @Override // tb.ids
    public void a(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ec1a18", new Object[]{this, fragmentActivity, new Integer(i), new Integer(i2), intent});
        } else {
            this.b.a(fragmentActivity, i, i2, intent);
        }
    }

    @Override // tb.ids
    public void d(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af84fe98", new Object[]{this, fragmentActivity});
            return;
        }
        super.d(fragmentActivity);
        this.b.a(fragmentActivity);
    }

    @Override // tb.ids
    public void a(FragmentActivity fragmentActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a2c895", new Object[]{this, fragmentActivity, jSONObject});
        } else {
            this.b.dataUpdate(jSONObject);
        }
    }

    @Override // tb.ids
    public void a(FragmentActivity fragmentActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ad1479", new Object[]{this, fragmentActivity, new Boolean(z)});
        } else {
            this.b.refreshPage(z);
        }
    }

    @Override // tb.ids
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else {
            this.b.invokeEvent(str, jSONObject);
        }
    }

    @Override // tb.ids
    public void g(FragmentActivity fragmentActivity) {
        FragmentActivity fragmentActivity2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbeba775", new Object[]{this, fragmentActivity});
            return;
        }
        super.g(fragmentActivity);
        if (!this.h && (fragmentActivity2 = this.c) != null && this.d) {
            fragmentActivity2.overridePendingTransition(R.anim.purchase_slide_in_from_right_anim, R.anim.purchase_slide_out_to_right_anim);
        }
        fke.a(fragmentActivity);
    }

    @Override // tb.ids
    public void e(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68fc8c37", new Object[]{this, fragmentActivity});
            return;
        }
        super.e(fragmentActivity);
        this.b.b(fragmentActivity);
        if (this.e == null) {
            return;
        }
        h.a().d(this.e);
    }

    private void a(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        View findViewById = activity.findViewById(R.id.btn_back);
        if (findViewById == null) {
            arc.a().b("找不到id为R.id.btn_back的View", arc.a.a().b("TBBuyFullScreenPageRender").b());
        } else {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: tb.idu.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        fke.a(activity);
                    }
                }
            });
        }
    }

    private void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        if (!this.h && this.c != null && this.d) {
            activity.overridePendingTransition(R.anim.purchase_slide_in_from_right_anim, R.anim.purchase_slide_out_to_right_anim);
        }
        c(activity);
    }

    private void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{this, activity});
            return;
        }
        SystemBarDecorator systemBarDecorator = new SystemBarDecorator(activity);
        if (b.a(ige.a(activity))) {
            systemBarDecorator.enableImmersiveStatusBar(true);
        } else {
            systemBarDecorator.enableImmersiveStatusBar();
        }
    }
}
