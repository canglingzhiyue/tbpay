package com.alibaba.triver.triver_shop.weexview;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.engine.api.Render;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Timer;
import java.util.TimerTask;
import tb.cbc;
import tb.kge;

/* loaded from: classes3.dex */
public class TRNestedRenderContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float currentSendOffsetY;
    private float firstMoveOffsetY;
    private boolean hasScrollHorizontally;
    private boolean innerScrollHorizontally;
    private float lastSendOffsetY;
    private String mWeexViewID;
    private RecyclerView recyclerView;
    private Render render;
    private boolean scrollOnTop;
    private float startX;
    private float startY;
    private Timer timer;
    private boolean touchEnded;
    private boolean touchMoveDispatched;
    private String url;

    static {
        kge.a(1898691509);
    }

    public static /* synthetic */ Object ipc$super(TRNestedRenderContainer tRNestedRenderContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -572887227) {
            super.addView((View) objArr[0]);
            return null;
        } else if (hashCode != 2075560917) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
    }

    public static /* synthetic */ Render access$000(TRNestedRenderContainer tRNestedRenderContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Render) ipChange.ipc$dispatch("db30c9db", new Object[]{tRNestedRenderContainer}) : tRNestedRenderContainer.render;
    }

    public static /* synthetic */ String access$100(TRNestedRenderContainer tRNestedRenderContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f42aceec", new Object[]{tRNestedRenderContainer}) : tRNestedRenderContainer.url;
    }

    public static /* synthetic */ boolean access$200(TRNestedRenderContainer tRNestedRenderContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b164917", new Object[]{tRNestedRenderContainer})).booleanValue() : tRNestedRenderContainer.touchEnded;
    }

    public static /* synthetic */ float access$300(TRNestedRenderContainer tRNestedRenderContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed60fde2", new Object[]{tRNestedRenderContainer})).floatValue() : tRNestedRenderContainer.currentSendOffsetY;
    }

    public static /* synthetic */ float access$400(TRNestedRenderContainer tRNestedRenderContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6fabb2c1", new Object[]{tRNestedRenderContainer})).floatValue() : tRNestedRenderContainer.lastSendOffsetY;
    }

    public static /* synthetic */ float access$402(TRNestedRenderContainer tRNestedRenderContainer, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c227581", new Object[]{tRNestedRenderContainer, new Float(f)})).floatValue();
        }
        tRNestedRenderContainer.lastSendOffsetY = f;
        return f;
    }

    public static /* synthetic */ String access$500(TRNestedRenderContainer tRNestedRenderContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9849e2f0", new Object[]{tRNestedRenderContainer}) : tRNestedRenderContainer.mWeexViewID;
    }

    public void setScrollOnTop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb91126", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollOnTop = z;
        }
    }

    public void setWeexViewID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9ada34", new Object[]{this, str});
        } else {
            this.mWeexViewID = str;
        }
    }

    public void setRender(Render render) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849b1299", new Object[]{this, render});
        } else {
            this.render = render;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f86a6bb", new Object[]{this, recyclerView});
        } else {
            this.recyclerView = recyclerView;
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.render = null;
        this.recyclerView = null;
        Timer timer = this.timer;
        if (timer == null) {
            return;
        }
        timer.cancel();
    }

    public TRNestedRenderContainer(Context context) {
        super(context);
        this.hasScrollHorizontally = false;
        this.innerScrollHorizontally = false;
        this.firstMoveOffsetY = 0.0f;
        this.lastSendOffsetY = 0.0f;
        this.currentSendOffsetY = 0.0f;
        this.scrollOnTop = true;
        this.touchEnded = false;
        this.timer = new Timer(true);
        this.touchMoveDispatched = false;
        final Handler handler = new Handler() { // from class: com.alibaba.triver.triver_shop.weexview.TRNestedRenderContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 673877017) {
                    super.handleMessage((Message) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                super.handleMessage(message);
                if (TRNestedRenderContainer.access$000(TRNestedRenderContainer.this) == null || message.what != 1 || TextUtils.isEmpty(TRNestedRenderContainer.access$100(TRNestedRenderContainer.this)) || TRNestedRenderContainer.access$100(TRNestedRenderContainer.this).indexOf("flagship_loft_show=1") >= 0 || TRNestedRenderContainer.access$200(TRNestedRenderContainer.this) || Math.abs(TRNestedRenderContainer.access$300(TRNestedRenderContainer.this) - TRNestedRenderContainer.access$400(TRNestedRenderContainer.this)) <= 1.0f) {
                    return;
                }
                TRNestedRenderContainer.access$000(TRNestedRenderContainer.this).a("if(window.__WEEX_SCROLL__ && typeof window.__WEEX_SCROLL__ === 'function') {window['__WEEX_SCROLL(" + TRNestedRenderContainer.access$500(TRNestedRenderContainer.this) + ")__'](" + cbc.b(TRNestedRenderContainer.this.getContext(), -TRNestedRenderContainer.access$300(TRNestedRenderContainer.this)) + ")}");
                TRNestedRenderContainer tRNestedRenderContainer = TRNestedRenderContainer.this;
                TRNestedRenderContainer.access$402(tRNestedRenderContainer, TRNestedRenderContainer.access$300(tRNestedRenderContainer));
            }
        };
        this.timer.schedule(new TimerTask() { // from class: com.alibaba.triver.triver_shop.weexview.TRNestedRenderContainer.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Message message = new Message();
                message.what = 1;
                handler.sendMessage(message);
            }
        }, 0L, 16L);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
        } else {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touchEnded = false;
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
            this.hasScrollHorizontally = false;
            this.innerScrollHorizontally = false;
            super.dispatchTouchEvent(motionEvent);
            return false;
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                super.dispatchTouchEvent(motionEvent);
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float f = x - this.startX;
            float f2 = y - this.startY;
            if (!this.touchMoveDispatched) {
                this.touchMoveDispatched = true;
                if (Math.abs(f) > Math.abs(f2)) {
                    this.hasScrollHorizontally = true;
                } else {
                    this.hasScrollHorizontally = false;
                }
            }
            if (canScrollHorizontall(f, f2)) {
                this.hasScrollHorizontally = true;
                if (!canScroll(this, false, (int) f, (int) x, (int) y)) {
                    return false;
                }
                this.innerScrollHorizontally = true;
                return super.dispatchTouchEvent(motionEvent);
            }
            this.hasScrollHorizontally = false;
            this.innerScrollHorizontally = false;
            if (!this.scrollOnTop) {
                this.firstMoveOffsetY = f2;
            } else {
                this.currentSendOffsetY = f2 - this.firstMoveOffsetY;
            }
            return super.dispatchTouchEvent(motionEvent);
        } else {
            this.touchEnded = true;
            this.touchMoveDispatched = false;
            setScrollOnTop(false);
            RecyclerView recyclerView = this.recyclerView;
            if (recyclerView != null && ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0) {
                setScrollOnTop(true);
            }
            this.firstMoveOffsetY = 0.0f;
            this.lastSendOffsetY = 0.0f;
            this.currentSendOffsetY = 0.0f;
            if (this.render != null && !TextUtils.isEmpty(this.url) && this.url.indexOf("flagship_loft_show=1") < 0) {
                if (TextUtils.isEmpty(this.mWeexViewID)) {
                    this.render.a("if(window.__WEEX_SCROLL__ && typeof window.__WEEX_SCROLL__ === 'function') {window.__WEEX_SCROLL__('onTouchEnd')}");
                } else {
                    this.render.a("if(window.__WEEX_SCROLL__ && typeof window.__WEEX_SCROLL__ === 'function') {window['__WEEX_SCROLL(" + this.mWeexViewID + ")__']('onTouchEnd')}");
                }
            }
            if (this.hasScrollHorizontally) {
                this.hasScrollHorizontally = false;
                if (!this.innerScrollHorizontally) {
                    return false;
                }
                this.innerScrollHorizontally = false;
                return super.dispatchTouchEvent(motionEvent);
            }
            super.dispatchTouchEvent(motionEvent);
            return false;
        }
    }

    private boolean canScrollHorizontall(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b1d7456", new Object[]{this, new Float(f), new Float(f2)})).booleanValue() : this.hasScrollHorizontally;
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i2 + scrollX;
                if (i6 < childAt.getLeft() || i6 >= childAt.getRight() || (i5 = i3 + scrollY) < childAt.getTop() || i5 >= childAt.getBottom()) {
                    i4 = childCount;
                } else {
                    i4 = childCount;
                    if (canScroll(childAt, true, i, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
                childCount = i4 - 1;
            }
        }
        return z && view.canScrollHorizontally(-i);
    }
}
