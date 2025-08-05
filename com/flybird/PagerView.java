package com.flybird;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.alipay.android.app.template.LogCatLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class PagerView extends ListView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MyListAdapter f7197a;
    public List<View> b;
    public ViewItemObserver c;
    public View d;
    public float e;
    public float f;
    public float g;
    public boolean h;

    /* loaded from: classes4.dex */
    public class MyListAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public MyListAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : PagerView.this.b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : PagerView.this.b.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup}) : PagerView.this.b.get(i);
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue() : PagerView.this.b.size();
        }
    }

    /* loaded from: classes4.dex */
    public interface ViewItemObserver {
        void onItemChanged(int i);
    }

    public PagerView(Context context) {
        super(context);
        this.b = new ArrayList();
        this.g = 0.15f;
        this.h = false;
        a();
    }

    public static /* synthetic */ Object ipc$super(PagerView pagerView, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.flybird.PagerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
                int firstVisiblePosition;
                int lastVisiblePosition;
                boolean z;
                IpChange ipChange2 = $ipChange;
                int i2 = 1;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
                } else if (i != 0 || (firstVisiblePosition = PagerView.this.getFirstVisiblePosition()) == (lastVisiblePosition = PagerView.this.getLastVisiblePosition()) || lastVisiblePosition != firstVisiblePosition + 1) {
                } else {
                    View childAt = absListView.getChildAt(0);
                    LogCatLog.d("PagerView", "currentY: " + PagerView.this.f + ", lastY: " + PagerView.this.e + ", firstView.getBottom(): " + childAt.getBottom() + ", getHeight(): " + PagerView.this.getHeight());
                    PagerView pagerView = PagerView.this;
                    float f = pagerView.f;
                    float f2 = pagerView.e;
                    if (f > f2) {
                        PagerView pagerView2 = PagerView.this;
                        if (childAt.getBottom() > pagerView2.g * pagerView2.getHeight()) {
                            LogCatLog.d("PagerView", "onScrollStateChanged: case 1");
                            z = true;
                        } else {
                            LogCatLog.d("PagerView", "onScrollStateChanged: case 2");
                            z = false;
                        }
                    } else {
                        if (f < f2) {
                            PagerView pagerView3 = PagerView.this;
                            if (pagerView.getHeight() - childAt.getBottom() > pagerView3.g * pagerView3.getHeight()) {
                                LogCatLog.d("PagerView", "onScrollStateChanged: case 3");
                            } else {
                                LogCatLog.d("PagerView", "onScrollStateChanged: case 4");
                                z = true;
                            }
                        }
                        z = false;
                    }
                    PagerView pagerView4 = PagerView.this;
                    pagerView4.getClass();
                    if (z) {
                        pagerView4.smoothScrollBy(childAt.getBottom() - pagerView4.getHeight(), 5000);
                        i2 = 0;
                    } else {
                        pagerView4.smoothScrollBy(childAt.getBottom(), 5000);
                    }
                    PagerView pagerView5 = PagerView.this;
                    ViewItemObserver viewItemObserver = pagerView5.c;
                    if (viewItemObserver == null) {
                        return;
                    }
                    pagerView5.d = null;
                    viewItemObserver.onItemChanged(firstVisiblePosition + i2);
                }
            }
        });
        setFriction(ViewConfiguration.getScrollFriction() * 20.0f);
        setVerticalScrollBarEnabled(false);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        LogCatLog.d("PagerView", "onTouchEvent, action: " + action + " ev: " + motionEvent);
        if (action == 1) {
            this.f = motionEvent.getY();
            int firstVisiblePosition = getFirstVisiblePosition();
            int lastVisiblePosition = getLastVisiblePosition();
            if (firstVisiblePosition != lastVisiblePosition && lastVisiblePosition == firstVisiblePosition + 1) {
                View childAt = getChildAt(0);
                if (Math.abs(this.f - this.e) > 5.0f) {
                    float f = this.f;
                    float f2 = this.e;
                    boolean z = f <= f2 ? !(f >= f2 || ((float) (getHeight() - childAt.getBottom())) > this.g * ((float) getHeight())) : ((float) childAt.getBottom()) > this.g * ((float) getHeight());
                    LogCatLog.d("PagerView", "checkForReset, step 2, isDown: " + z);
                    if (z) {
                        smoothScrollBy(-2, 15);
                    } else {
                        smoothScrollBy(2, 15);
                    }
                }
            }
            this.h = false;
            return true;
        }
        if (!this.h && action == 2) {
            this.e = motionEvent.getY();
            this.h = true;
        }
        if (action == 0) {
            this.e = motionEvent.getY();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCurrentPage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18fd536", new Object[]{this, new Integer(i)});
        } else {
            setSelection(i);
        }
    }

    public void setViewItemObserver(ViewItemObserver viewItemObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7c353eb", new Object[]{this, viewItemObserver});
        } else {
            this.c = viewItemObserver;
        }
    }
}
