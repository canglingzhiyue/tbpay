package com.taobao.android.litecreator.widgets;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends PagerSnapHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f13530a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private Handler g = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.litecreator.widgets.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else {
                c.this.a();
            }
        }
    };

    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(int i);

        void a(boolean z);
    }

    static {
        kge.a(1153345632);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
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
        if (this.f) {
            return new int[2];
        }
        return super.calculateDistanceToFinalSnap(layoutManager, view);
    }

    @Override // android.support.v7.widget.PagerSnapHelper, android.support.v7.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7ee3266", new Object[]{this, layoutManager, new Integer(i), new Integer(i2)})).intValue();
        }
        int findTargetSnapPosition = super.findTargetSnapPosition(layoutManager, i, i2);
        a aVar = this.f13530a;
        if (aVar != null && findTargetSnapPosition != -1) {
            aVar.a();
            this.f13530a.a(findTargetSnapPosition);
            if (i2 < 0 && findTargetSnapPosition == 0) {
                if (this.d && this.b && this.c) {
                    this.c = false;
                    this.f13530a.a(this.c);
                }
                this.b = true;
                this.d = true;
                return findTargetSnapPosition;
            } else if (i2 > 0 && findTargetSnapPosition == layoutManager.getItemCount()) {
                if (this.e && this.b && this.c) {
                    this.c = false;
                    this.f13530a.a(this.c);
                }
                this.b = true;
                this.e = true;
                return findTargetSnapPosition;
            } else {
                if (this.b && !this.c) {
                    this.c = true;
                    this.f13530a.a(this.c);
                }
                this.b = true;
                this.d = false;
                this.e = false;
                this.g.removeMessages(0);
                this.g.sendEmptyMessageDelayed(0, 1000L);
            }
        }
        return findTargetSnapPosition;
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
            a aVar = this.f13530a;
            if (aVar != null && position != -1) {
                aVar.a(position);
                if (this.c) {
                    this.c = false;
                    this.f13530a.a(this.c);
                }
                this.b = false;
                this.d = false;
                this.e = false;
            }
        }
        return findSnapView;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182b371b", new Object[]{this, aVar});
        } else {
            this.f13530a = aVar;
        }
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
        a aVar = this.f13530a;
        if (aVar == null || !this.c) {
            return;
        }
        this.c = false;
        aVar.a(this.c);
    }
}
