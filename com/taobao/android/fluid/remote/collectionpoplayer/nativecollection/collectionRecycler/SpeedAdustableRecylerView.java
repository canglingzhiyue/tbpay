package com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import tb.kge;

/* loaded from: classes5.dex */
public class SpeedAdustableRecylerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PAN_DISTANCE = 20;
    public static final double VELOCITY_SPEED = 0.7d;
    private int distanceY;
    private LockableRecycerView.a onDragListener;
    private float startX;
    private float startY;

    static {
        kge.a(464779031);
    }

    public static /* synthetic */ Object ipc$super(SpeedAdustableRecylerView speedAdustableRecylerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != 1852077959) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.fling(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public SpeedAdustableRecylerView(Context context) {
        super(context);
        this.startY = -1.0f;
        this.startX = -1.0f;
        this.distanceY = 20;
    }

    public SpeedAdustableRecylerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.startY = -1.0f;
        this.startX = -1.0f;
        this.distanceY = 20;
    }

    public SpeedAdustableRecylerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.startY = -1.0f;
        this.startX = -1.0f;
        this.distanceY = 20;
    }

    @Override // android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6e647787", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : super.fling((int) (i * 0.7d), (int) (i2 * 0.7d));
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        LockableRecycerView.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
        } else if (actionMasked == 1) {
            if (Float.compare(this.startY, -1.0f) == 0) {
                this.startY = motionEvent.getY();
            }
            if (Float.compare(this.startX, -1.0f) == 0) {
                this.startX = motionEvent.getX();
            }
            if (this.startY - motionEvent.getY() > this.distanceY) {
                LockableRecycerView.a aVar2 = this.onDragListener;
                if (aVar2 != null) {
                    aVar2.c();
                }
            } else if (this.startY - motionEvent.getY() < (-this.distanceY) && (aVar = this.onDragListener) != null) {
                aVar.b();
            }
            this.startY = -1.0f;
        } else if (actionMasked == 2) {
            if (Float.compare(this.startY, -1.0f) == 0) {
                this.startY = motionEvent.getY();
            }
            if (Float.compare(this.startX, -1.0f) == 0) {
                this.startX = motionEvent.getX();
            }
        } else {
            this.startY = -1.0f;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void addOnDragListener(LockableRecycerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7feb24fc", new Object[]{this, aVar});
        } else {
            this.onDragListener = aVar;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class a extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final int PRELOAD_THRES;

        /* renamed from: a  reason: collision with root package name */
        private boolean f12691a = false;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
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

        public abstract void a();

        public abstract void b();

        static {
            kge.a(-810370874);
            PRELOAD_THRES = com.taobao.android.fluid.business.videocollection.poplayer.b.d();
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (i != 0) {
                return;
            }
            if ((linearLayoutManager.getItemCount() - 1) - linearLayoutManager.findLastCompletelyVisibleItemPosition() <= PRELOAD_THRES && this.f12691a) {
                a();
            }
            if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() > PRELOAD_THRES || this.f12691a) {
                return;
            }
            b();
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (i2 <= 0) {
                z = false;
            }
            this.f12691a = z;
        }
    }
}
