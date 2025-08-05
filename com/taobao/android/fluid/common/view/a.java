package com.taobao.android.fluid.common.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class a extends PagerSnapHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private InterfaceC0490a f12436a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final Handler f = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.fluid.common.view.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else {
                a.this.a();
            }
        }
    };
    private boolean g;

    /* renamed from: com.taobao.android.fluid.common.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0490a {
        void a();

        void a(int i);

        void a(boolean z);
    }

    static {
        kge.a(273378444);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1700525134) {
            if (hashCode == -1209126298) {
                return new Integer(super.findTargetSnapPosition((RecyclerView.LayoutManager) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
            }
            if (hashCode != -464207520) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.findSnapView((RecyclerView.LayoutManager) objArr[0]);
        }
        return super.calculateDistanceToFinalSnap((RecyclerView.LayoutManager) objArr[0], (View) objArr[1]);
    }

    @Override // android.support.v7.widget.PagerSnapHelper, android.support.v7.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("9aa40bb2", new Object[]{this, layoutManager, view});
        }
        if (this.g) {
            return new int[2];
        }
        return super.calculateDistanceToFinalSnap(layoutManager, view);
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        if (view != null) {
            Object tag = view.getTag(R.id.fluid_sdk_footer_loading);
            if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.widget.PagerSnapHelper, android.support.v7.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e454c160", new Object[]{this, layoutManager});
        }
        View findSnapView = super.findSnapView(layoutManager);
        if (findSnapView != null) {
            int position = layoutManager.getPosition(findSnapView);
            int itemCount = layoutManager.getItemCount();
            spz.c("TBVideoPagerSnapHelper", "findSnapView position=" + position + " childCount=" + itemCount + " snapView=" + findSnapView);
            if (position == itemCount - 2) {
                View childAt = layoutManager.getChildAt(layoutManager.getChildCount() - 1);
                boolean a2 = a(childAt);
                spz.c("TBVideoPagerSnapHelper", "findSnapView isFooter=" + a2);
                if (a2) {
                    return childAt;
                }
            }
            InterfaceC0490a interfaceC0490a = this.f12436a;
            if (interfaceC0490a != null && position != -1) {
                interfaceC0490a.a(position);
                if (this.c) {
                    this.c = false;
                    this.f12436a.a(this.c);
                }
                this.b = false;
                this.d = false;
                this.e = false;
            }
        }
        return findSnapView;
    }

    @Override // android.support.v7.widget.PagerSnapHelper, android.support.v7.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7ee3266", new Object[]{this, layoutManager, new Integer(i), new Integer(i2)})).intValue();
        }
        int findTargetSnapPosition = super.findTargetSnapPosition(layoutManager, i, i2);
        InterfaceC0490a interfaceC0490a = this.f12436a;
        if (interfaceC0490a != null && findTargetSnapPosition != -1) {
            interfaceC0490a.a(findTargetSnapPosition);
            if (i2 < 0 && findTargetSnapPosition == 0) {
                if (this.d && this.b) {
                    if (this.c) {
                        this.c = false;
                        this.f12436a.a(this.c);
                    }
                    this.f12436a.a();
                }
                this.b = true;
                this.d = true;
                return findTargetSnapPosition;
            } else if (i2 > 0 && findTargetSnapPosition == layoutManager.getItemCount()) {
                if (this.e && this.b) {
                    if (this.c) {
                        this.c = false;
                        this.f12436a.a(this.c);
                    }
                    this.f12436a.a();
                }
                this.b = true;
                this.e = true;
                return findTargetSnapPosition;
            } else {
                if (this.b && !this.c) {
                    this.c = true;
                    this.f12436a.a(this.c);
                }
                this.b = true;
                this.d = false;
                this.e = false;
                this.f.removeMessages(0);
                this.f.sendEmptyMessageDelayed(0, 1000L);
            }
        }
        return findTargetSnapPosition;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.d = false;
        this.e = false;
        this.b = false;
        InterfaceC0490a interfaceC0490a = this.f12436a;
        if (interfaceC0490a == null || !this.c) {
            return;
        }
        this.c = false;
        interfaceC0490a.a(this.c);
    }

    public void a(InterfaceC0490a interfaceC0490a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e18977", new Object[]{this, interfaceC0490a});
        } else {
            this.f12436a = interfaceC0490a;
        }
    }
}
