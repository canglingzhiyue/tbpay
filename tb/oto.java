package tb;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.NewScrollLogic;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class oto {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View.OnAttachStateChangeListener f32409a;
    private otr b;
    private otq c;
    private final HomeChildRecyclerView d;
    private ksk e;

    static {
        kge.a(-1229147687);
    }

    public static /* synthetic */ ksk a(oto otoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ksk) ipChange.ipc$dispatch("718327b5", new Object[]{otoVar}) : otoVar.e;
    }

    public static /* synthetic */ void a(oto otoVar, HomeChildRecyclerView homeChildRecyclerView, otp otpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2841b395", new Object[]{otoVar, homeChildRecyclerView, otpVar});
        } else {
            otoVar.b(homeChildRecyclerView, otpVar);
        }
    }

    public static /* synthetic */ boolean a(oto otoVar, ksk kskVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("deb9d0ff", new Object[]{otoVar, kskVar})).booleanValue() : otoVar.b(kskVar);
    }

    public oto(HomeChildRecyclerView homeChildRecyclerView, otp otpVar, ksk kskVar) {
        this.d = homeChildRecyclerView;
        this.e = kskVar;
        a(homeChildRecyclerView, otpVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a(this.d);
        otr otrVar = this.b;
        if (otrVar == null) {
            return;
        }
        otrVar.a();
    }

    public void a(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b1abf5", new Object[]{this, kskVar});
        } else {
            this.e = kskVar;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        otq otqVar = this.c;
        if (otqVar == null) {
            return;
        }
        otqVar.a();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        otq otqVar = this.c;
        if (otqVar == null) {
            return;
        }
        otqVar.b();
    }

    public void a(NewScrollLogic.PullState pullState, NewScrollLogic.PullState pullState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722f4868", new Object[]{this, pullState, pullState2});
            return;
        }
        otq otqVar = this.c;
        if (otqVar == null) {
            return;
        }
        otqVar.a(pullState, pullState2);
    }

    private void a(HomeChildRecyclerView homeChildRecyclerView, otp otpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bf350f", new Object[]{this, homeChildRecyclerView, otpVar});
            return;
        }
        this.f32409a = a(otpVar);
        homeChildRecyclerView.addOnAttachStateChangeListener(this.f32409a);
    }

    private void a(HomeChildRecyclerView homeChildRecyclerView) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4c97aa", new Object[]{this, homeChildRecyclerView});
        } else if (homeChildRecyclerView == null || (onAttachStateChangeListener = this.f32409a) == null) {
        } else {
            homeChildRecyclerView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    private View.OnAttachStateChangeListener a(final otp otpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnAttachStateChangeListener) ipChange.ipc$dispatch("5ac04d62", new Object[]{this, otpVar}) : new View.OnAttachStateChangeListener() { // from class: tb.oto.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                    return;
                }
                oto otoVar = oto.this;
                if (!oto.a(otoVar, oto.a(otoVar))) {
                    e.e("CompleteVisibleStatus", "不在白名单");
                } else if (!(view instanceof HomeChildRecyclerView)) {
                    e.e("CompleteVisibleStatus", "当前的容器不是HomeChildRecyclerView");
                } else {
                    oto.a(oto.this, (HomeChildRecyclerView) view, otpVar);
                }
            }
        };
    }

    private void b(HomeChildRecyclerView homeChildRecyclerView, otp otpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996d5fd0", new Object[]{this, homeChildRecyclerView, otpVar});
        } else if (homeChildRecyclerView.getParent() instanceof RecyclerView) {
            this.b = new otr(homeChildRecyclerView, otpVar, this.e);
        } else {
            this.c = new otq(otpVar, this.e);
        }
    }

    private boolean b(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e034b27a", new Object[]{this, kskVar})).booleanValue();
        }
        List<String> d = d();
        if (d.isEmpty()) {
            e.e("CompleteVisibleStatus", "白名单是空");
            return false;
        }
        String b = kskVar.b();
        if (StringUtils.isEmpty(b)) {
            e.e("CompleteVisibleStatus", "当前页面名称为空");
            return false;
        }
        return d.contains(b);
    }

    private List<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String m = j.m();
        if (!StringUtils.isEmpty(m)) {
            arrayList.addAll(Arrays.asList(m.split(",")));
        }
        return arrayList;
    }
}
