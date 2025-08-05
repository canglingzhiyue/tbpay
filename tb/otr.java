package tb;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;

/* loaded from: classes8.dex */
public class otr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HomeChildRecyclerView f32412a;
    private RecyclerView.OnScrollListener b;
    private HomeChildRecyclerView.a c;
    private String d = "notALlVisible";
    private ots e;

    static {
        kge.a(-1551607116);
    }

    public static /* synthetic */ HomeChildRecyclerView a(otr otrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HomeChildRecyclerView) ipChange.ipc$dispatch("2566f8ed", new Object[]{otrVar}) : otrVar.f32412a;
    }

    public static /* synthetic */ void a(otr otrVar, boolean z, otp otpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8b1e0e", new Object[]{otrVar, new Boolean(z), otpVar});
        } else {
            otrVar.a(z, otpVar);
        }
    }

    public static /* synthetic */ boolean a(otr otrVar, HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d82f9491", new Object[]{otrVar, homeChildRecyclerView})).booleanValue() : otrVar.c(homeChildRecyclerView);
    }

    public otr(HomeChildRecyclerView homeChildRecyclerView, otp otpVar, ksk kskVar) {
        this.f32412a = homeChildRecyclerView;
        a(this.f32412a, otpVar);
        b(this.f32412a, otpVar);
        if (a(kskVar)) {
            this.e = new ots(otpVar, homeChildRecyclerView);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a(this.f32412a);
        b(this.f32412a);
        ots otsVar = this.e;
        if (otsVar == null) {
            return;
        }
        otsVar.a();
    }

    private void a(HomeChildRecyclerView homeChildRecyclerView, otp otpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bf350f", new Object[]{this, homeChildRecyclerView, otpVar});
        } else if (homeChildRecyclerView == null) {
            e.e("NativeCompleteVisibleStatus", "homeChildRecyclerView == null");
        } else {
            this.b = a(otpVar);
            ViewParent parent = homeChildRecyclerView.getParent();
            if (!(parent instanceof RecyclerView)) {
                return;
            }
            ((RecyclerView) parent).addOnScrollListener(this.b);
        }
    }

    private void a(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4c97aa", new Object[]{this, homeChildRecyclerView});
        } else if (this.b == null) {
            e.e("NativeCompleteVisibleStatus", "mScrollListener == null");
        } else {
            ViewParent parent = homeChildRecyclerView.getParent();
            if (!(parent instanceof RecyclerView)) {
                return;
            }
            ((RecyclerView) parent).removeOnScrollListener(this.b);
        }
    }

    private void b(HomeChildRecyclerView homeChildRecyclerView, otp otpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996d5fd0", new Object[]{this, homeChildRecyclerView, otpVar});
            return;
        }
        this.c = c(homeChildRecyclerView, otpVar);
        homeChildRecyclerView.addDispatchTouchEventListener(this.c);
    }

    private void b(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760e136b", new Object[]{this, homeChildRecyclerView});
        } else {
            homeChildRecyclerView.removeDispatchTouchEventListener(this.c);
        }
    }

    private RecyclerView.OnScrollListener a(final otp otpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("b0f8a97b", new Object[]{this, otpVar}) : new RecyclerView.OnScrollListener() { // from class: tb.otr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode != 2142696127) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                otr otrVar = otr.this;
                otr.a(otrVar, otr.a(otrVar, otr.a(otrVar)), otpVar);
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0) {
                    return;
                }
                otr otrVar = otr.this;
                otr.a(otrVar, otr.a(otrVar, otr.a(otrVar)), otpVar);
            }
        };
    }

    private HomeChildRecyclerView.a c(final HomeChildRecyclerView homeChildRecyclerView, final otp otpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HomeChildRecyclerView.a) ipChange.ipc$dispatch("837e488a", new Object[]{this, homeChildRecyclerView, otpVar}) : new HomeChildRecyclerView.a() { // from class: tb.otr.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView.a
            public void a(MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
                } else if (motionEvent.getAction() != 2) {
                } else {
                    otr otrVar = otr.this;
                    otr.a(otrVar, otr.a(otrVar, homeChildRecyclerView), otpVar);
                }
            }
        };
    }

    private boolean c(HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51cf8f30", new Object[]{this, homeChildRecyclerView})).booleanValue();
        }
        int d = d(homeChildRecyclerView);
        ViewParent parent = homeChildRecyclerView.getParent();
        return (parent instanceof RecyclerView) && d >= ((RecyclerView) parent).getHeight();
    }

    private int d(HomeChildRecyclerView homeChildRecyclerView) {
        RecyclerView recyclerView;
        int a2;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d910ae0", new Object[]{this, homeChildRecyclerView})).intValue();
        }
        ViewParent parent = homeChildRecyclerView.getParent();
        if (!(parent instanceof RecyclerView) || (a2 = a((recyclerView = (RecyclerView) parent))) != recyclerView.getAdapter().getItemCount() - 1 || (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(a2)) == null || findViewHolderForAdapterPosition.itemView == null) {
            return -1;
        }
        return recyclerView.getHeight() - findViewHolderForAdapterPosition.itemView.getTop();
    }

    private int a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46606589", new Object[]{this, recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] findLastVisibleItemPositions = ((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null);
            int i = -1;
            for (int i2 = 0; i2 < findLastVisibleItemPositions.length; i2++) {
                if (findLastVisibleItemPositions[i2] >= 0 && (i == -1 || i < findLastVisibleItemPositions[i2])) {
                    i = findLastVisibleItemPositions[i2];
                }
            }
            return i;
        } else if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        } else {
            try {
                return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            } catch (Exception e) {
                e.e("NativeCompleteVisibleStatus", "RecommendViewExposureListener getLastVisiblePos exception:" + e.getMessage());
                return -1;
            }
        }
    }

    private void a(boolean z, otp otpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0058ed1", new Object[]{this, new Boolean(z), otpVar});
            return;
        }
        if (z && "notALlVisible".equals(this.d)) {
            otpVar.a();
            this.d = "allVisible";
            e.e("NativeCompleteVisibleStatus", "通知是全屏展示了");
        }
        if (z || !"allVisible".equals(this.d)) {
            return;
        }
        otpVar.b();
        this.d = "notALlVisible";
        e.e("NativeCompleteVisibleStatus", "通知不是全屏展示了");
    }

    private boolean a(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1b1abf9", new Object[]{this, kskVar})).booleanValue();
        }
        e.e("NativeCompleteVisibleStatus", "当前的容器类型是：" + kskVar.b());
        return kskVar == ksk.REC_ORDER_LIST_CATAPULT || kskVar == ksk.REC_ORDER_LIST;
    }
}
