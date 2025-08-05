package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.a;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.b;
import com.taobao.android.purchase.aura.f;
import java.io.File;
import java.util.List;
import tb.arc;

/* loaded from: classes6.dex */
public class idv extends ids {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final nhm f28946a;
    private String b = TBBuyPageMode.halfPageMode;

    static {
        kge.a(281586453);
    }

    public static /* synthetic */ Object ipc$super(idv idvVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2008176955) {
            super.a((FragmentActivity) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == -605313163) {
            super.g((FragmentActivity) objArr[0]);
            return null;
        } else if (hashCode != 1761381431) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.e((FragmentActivity) objArr[0]);
            return null;
        }
    }

    public idv(nhm nhmVar) {
        this.f28946a = nhmVar;
    }

    @Override // tb.ids
    public void b(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c95e35a", new Object[]{this, fragmentActivity});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(fragmentActivity);
        frameLayout.setBackgroundColor(0);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        fragmentActivity.setContentView(frameLayout);
    }

    @Override // tb.ids
    public void a(FragmentActivity fragmentActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884da6c5", new Object[]{this, fragmentActivity, str});
            return;
        }
        super.a(fragmentActivity, str);
        if (str != null) {
            this.b = str;
        }
        a(fragmentActivity);
        if (!baw.a() || !new File("/data/local/tmp/.forceNativeRender").exists()) {
            return;
        }
        fragmentActivity.getIntent().putExtra("needNativeContainer", "true");
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        activity.overridePendingTransition(0, 0);
        Window window = activity.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
            window.getDecorView().setBackgroundResource(17170445);
            window.clearFlags(2);
            if (Build.VERSION.SDK_INT >= 19) {
                window.addFlags(67108864);
            }
        }
        ((ViewGroup) activity.findViewById(16908290)).setBackgroundColor(0);
    }

    @Override // tb.ids
    public void a(FragmentActivity fragmentActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9545db37", new Object[]{this, fragmentActivity, view});
        } else if (view == null) {
            arc.a().b("contentView为空了", arc.a.a().b("TBBuyHalfScreenPageRender").b());
            fke.a(fragmentActivity);
        } else {
            bxe.a().a(fragmentActivity, this.f28946a.g(), this.f28946a.b());
        }
    }

    private void a(FragmentActivity fragmentActivity, aqt<Fragment> aqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78720467", new Object[]{this, fragmentActivity, aqtVar});
            return;
        }
        List<Fragment> fragments = fragmentActivity.getSupportFragmentManager().getFragments();
        if (fragments == null) {
            return;
        }
        for (Fragment fragment : fragments) {
            aqtVar.a(fragment);
        }
    }

    @Override // tb.ids
    public void a(FragmentActivity fragmentActivity, final int i, final int i2, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ec1a18", new Object[]{this, fragmentActivity, new Integer(i), new Integer(i2), intent});
        } else {
            a(fragmentActivity, new aqt<Fragment>() { // from class: tb.idv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqt
                public void a(Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2f0514a", new Object[]{this, fragment});
                    } else {
                        fragment.onActivityResult(i, i2, intent);
                    }
                }
            });
        }
    }

    @Override // tb.ids
    public void a(FragmentActivity fragmentActivity, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a2c895", new Object[]{this, fragmentActivity, jSONObject});
        } else {
            a(fragmentActivity, new aqt<Fragment>() { // from class: tb.idv.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqt
                public void a(Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2f0514a", new Object[]{this, fragment});
                    } else if (!(fragment instanceof a)) {
                    } else {
                        ((a) fragment).dataUpdate(jSONObject);
                    }
                }
            });
        }
    }

    @Override // tb.ids
    public void a(FragmentActivity fragmentActivity, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ad1479", new Object[]{this, fragmentActivity, new Boolean(z)});
        } else {
            a(fragmentActivity, new aqt<Fragment>() { // from class: tb.idv.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqt
                public void a(Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2f0514a", new Object[]{this, fragment});
                    } else if (!(fragment instanceof b)) {
                    } else {
                        ((b) fragment).refreshPage(z);
                    }
                }
            });
        }
    }

    @Override // tb.ids
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else {
            this.f28946a.invokeEvent(str, jSONObject);
        }
    }

    @Override // tb.ids
    public void g(final FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbeba775", new Object[]{this, fragmentActivity});
            return;
        }
        super.g(fragmentActivity);
        a(fragmentActivity, new aqt<Fragment>() { // from class: tb.idv.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqt
            public void a(Fragment fragment) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2f0514a", new Object[]{this, fragment});
                } else if (!(fragment instanceof f) || ((f) fragment).onBackPressed()) {
                } else {
                    fke.a(fragmentActivity);
                }
            }
        });
    }

    @Override // tb.ids
    public void e(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68fc8c37", new Object[]{this, fragmentActivity});
            return;
        }
        super.e(fragmentActivity);
        if (Build.VERSION.SDK_INT >= 5) {
            fragmentActivity.overridePendingTransition(0, 0);
        }
        this.f28946a.b(fragmentActivity);
    }

    @Override // tb.ids
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    @Override // tb.ids
    public String f(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e4e018a", new Object[]{this, fragmentActivity});
        }
        List<Fragment> fragments = fragmentActivity.getSupportFragmentManager().getFragments();
        if (fragments == null) {
            return "native";
        }
        for (Fragment fragment : fragments) {
            if ((fragment instanceof b) && "weex".equals(((b) fragment).getRenderContainer())) {
                return "weex";
            }
        }
        return "native";
    }
}
