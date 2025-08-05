package tb;

import android.support.v4.view.ViewPager;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.gateway.dispatch.a;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;

/* loaded from: classes8.dex */
public class ots {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ViewPager f32415a;
    private ViewPager.OnPageChangeListener b;

    static {
        kge.a(1293920113);
    }

    public static /* synthetic */ void a(ots otsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f896c8ea", new Object[]{otsVar});
        } else {
            otsVar.b();
        }
    }

    public static /* synthetic */ ViewPager b(ots otsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager) ipChange.ipc$dispatch("c6c52917", new Object[]{otsVar}) : otsVar.f32415a;
    }

    public ots(otp otpVar, HomeChildRecyclerView homeChildRecyclerView) {
        this.f32415a = a(homeChildRecyclerView);
        a(homeChildRecyclerView, otpVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a.b().a(new Runnable() { // from class: tb.ots.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ots.a(ots.this);
                    }
                }
            }, 0L);
        }
    }

    private void a(HomeChildRecyclerView homeChildRecyclerView, otp otpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bf350f", new Object[]{this, homeChildRecyclerView, otpVar});
        } else if (this.f32415a == null) {
            e.e("OrderListTriggerEnhance", "mViewPager == null");
        } else {
            this.b = b(homeChildRecyclerView, otpVar);
            this.f32415a.addOnPageChangeListener(this.b);
            e.e("OrderListTriggerEnhance", "register viewPager listener success");
        }
    }

    private void b() {
        ViewPager viewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.b;
        if (onPageChangeListener == null || (viewPager = this.f32415a) == null) {
            e.e("OrderListTriggerEnhance", "mPageChangeListener == null || mViewPager == null");
            return;
        }
        viewPager.removeOnPageChangeListener(onPageChangeListener);
        e.e("OrderListTriggerEnhance", "remove viewPager listener success");
    }

    private ViewPager a(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("d29d2196", new Object[]{this, homeChildRecyclerView});
        }
        if (homeChildRecyclerView == null) {
            return null;
        }
        myb nestedScrollParent = homeChildRecyclerView.getNestedScrollParent();
        if (!(nestedScrollParent instanceof ViewGroup)) {
            return null;
        }
        ViewParent viewParent = (ViewGroup) nestedScrollParent;
        while (viewParent != null) {
            viewParent = viewParent.getParent();
            e.e("OrderListTriggerEnhance", "getViewPager, target:" + viewParent.getClass().getSimpleName());
            if (viewParent instanceof ViewPager) {
                return (ViewPager) viewParent;
            }
            if (viewParent instanceof ViewGroup) {
                if (viewParent instanceof ViewPager.DecorView) {
                    break;
                }
            } else {
                break;
            }
        }
        return null;
    }

    private ViewPager.OnPageChangeListener b(final HomeChildRecyclerView homeChildRecyclerView, final otp otpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager.OnPageChangeListener) ipChange.ipc$dispatch("10c4a24", new Object[]{this, homeChildRecyclerView, otpVar}) : new ViewPager.OnPageChangeListener() { // from class: tb.ots.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                } else if (ots.b(ots.this).findFocus() == homeChildRecyclerView.getNestedScrollParent()) {
                } else {
                    e.e("OrderListTriggerEnhance", "onPageSelected");
                    otpVar.b();
                }
            }
        };
    }
}
