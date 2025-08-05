package com.taobao.tao.recommend4.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import tb.kge;
import tb.ksk;
import tb.lap;
import tb.osl;
import tb.osm;
import tb.otf;

/* loaded from: classes8.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f21003a;
    private final osm.a b;
    private final osl c;
    private String d;
    private final View e;
    private View.OnTouchListener f;
    private int g;
    private int h;
    private RecyclerView.OnScrollListener i;
    private JSONObject j;
    private HomeChildRecyclerView.a k;

    static {
        kge.a(1633582578);
    }

    public static /* synthetic */ float a(o oVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22edc3b4", new Object[]{oVar, new Float(f)})).floatValue();
        }
        oVar.f21003a = f;
        return f;
    }

    public static /* synthetic */ int a(o oVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22edcefa", new Object[]{oVar, new Integer(i)})).intValue();
        }
        oVar.g = i;
        return i;
    }

    public static /* synthetic */ View.OnTouchListener a(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnTouchListener) ipChange.ipc$dispatch("a7aacc0e", new Object[]{oVar}) : oVar.f;
    }

    public static /* synthetic */ void a(o oVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d369bd6", new Object[]{oVar, view});
        } else {
            oVar.d(view);
        }
    }

    public static /* synthetic */ void a(o oVar, View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16a566b", new Object[]{oVar, view, motionEvent});
        } else {
            oVar.a(view, motionEvent);
        }
    }

    public static /* synthetic */ boolean a(o oVar, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d5eba", new Object[]{oVar, view, new Integer(i), new Integer(i2)})).booleanValue() : oVar.a(view, i, i2);
    }

    public static /* synthetic */ int b(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c92f39b0", new Object[]{oVar})).intValue() : oVar.h;
    }

    public static /* synthetic */ int b(o oVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cb870d9", new Object[]{oVar, new Integer(i)})).intValue();
        }
        oVar.h = i;
        return i;
    }

    public static /* synthetic */ void b(o oVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76623f5", new Object[]{oVar, view});
        } else {
            oVar.f(view);
        }
    }

    public o(View view, String str, osl oslVar, osm.a aVar) {
        this.d = str;
        this.c = oslVar;
        this.b = aVar;
        this.e = view;
        a(this.e);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b(this.e);
        e(this.e);
        g(this.e);
    }

    public void a(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b1abf5", new Object[]{this, kskVar});
        } else {
            this.d = kskVar.a();
        }
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (!(view instanceof HomeChildRecyclerView)) {
        } else {
            this.k = c(view);
            ((HomeChildRecyclerView) view).addDispatchTouchEventListener(this.k);
        }
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (!(view instanceof HomeChildRecyclerView)) {
        } else {
            ((HomeChildRecyclerView) view).removeDispatchTouchEventListener(this.k);
        }
    }

    private HomeChildRecyclerView.a c(final View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HomeChildRecyclerView.a) ipChange.ipc$dispatch("ad775b13", new Object[]{this, view}) : new HomeChildRecyclerView.a() { // from class: com.taobao.tao.recommend4.recyclerview.o.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView.a
            public void a(MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
                    return;
                }
                if (o.a(o.this) == null) {
                    o.a(o.this, view);
                    o.b(o.this, view);
                }
                if (motionEvent.getAction() != 0) {
                    return;
                }
                o.a(o.this, motionEvent.getRawY());
            }
        };
    }

    private void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89069007", new Object[]{this, view});
        } else if (!(view instanceof HomeChildRecyclerView)) {
        } else {
            ViewParent parent = view.getParent();
            if (!(parent instanceof RecyclerView)) {
                return;
            }
            this.f = h(view);
            ((RecyclerView) parent).setOnTouchListener(this.f);
        }
    }

    private void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85081ee6", new Object[]{this, view});
        } else if (!(view instanceof HomeChildRecyclerView)) {
        } else {
            ViewParent parent = view.getParent();
            if (!(parent instanceof RecyclerView)) {
                return;
            }
            ((RecyclerView) parent).setOnTouchListener(null);
            this.f = null;
        }
    }

    private void f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8109adc5", new Object[]{this, view});
        } else if (!(view instanceof HomeChildRecyclerView)) {
        } else {
            ViewParent parent = view.getParent();
            if (!(parent instanceof RecyclerView)) {
                return;
            }
            this.i = b();
            ((RecyclerView) parent).addOnScrollListener(this.i);
        }
    }

    private void g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0b3ca4", new Object[]{this, view});
        } else if (!(view instanceof HomeChildRecyclerView)) {
        } else {
            ViewParent parent = view.getParent();
            if (!(parent instanceof RecyclerView)) {
                return;
            }
            ((RecyclerView) parent).removeOnScrollListener(this.i);
        }
    }

    private RecyclerView.OnScrollListener b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("c7e6bd97", new Object[]{this}) : new RecyclerView.OnScrollListener() { // from class: com.taobao.tao.recommend4.recyclerview.o.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
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
                if (o.b(o.this) != 0) {
                    o.a(o.this, i2);
                }
                super.onScrolled(recyclerView, i, i2);
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                o.b(o.this, i);
                super.onScrollStateChanged(recyclerView, i);
            }
        };
    }

    private View.OnTouchListener h(final View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnTouchListener) ipChange.ipc$dispatch("5101c255", new Object[]{this, view}) : new View.OnTouchListener() { // from class: com.taobao.tao.recommend4.recyclerview.o.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view2, motionEvent})).booleanValue();
                }
                if (o.a(o.this, view, (int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && 1 == motionEvent.getAction()) {
                    o.a(o.this, view, motionEvent);
                }
                return false;
            }
        };
    }

    private boolean a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c25114e", new Object[]{this, view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        return i2 >= i4 && i2 <= view.getMeasuredHeight() + i4 && i >= i3 && i <= view.getMeasuredWidth() + i3;
    }

    private void a(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff88cff", new Object[]{this, view, motionEvent});
            return;
        }
        JSONObject c = c();
        if (c == null) {
            lap.a("buyAfterRecommend", "dispatchTouchEvent", "服务端数据没下发");
        } else if (!c.getBooleanValue("enable")) {
            lap.a("buyAfterRecommend", "dispatchTouchEvent", "服务端开关关闭");
        } else {
            a(c.getJSONObject("config"), view, motionEvent);
        }
    }

    private boolean a(View view, MotionEvent motionEvent, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4164c86", new Object[]{this, view, motionEvent, new Float(f), new Integer(i)})).booleanValue();
        }
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop() / 3;
        boolean z = this.f21003a - motionEvent.getRawY() > ((float) scaledTouchSlop) || this.g > 0;
        lap.a("buyAfterRecommend", "checkIsNeedDoAnimation", "当前的距离：" + motionEvent.getRawY() + " 按下手指的时候的距离：" + this.f21003a + "滑动的阈值：" + scaledTouchSlop);
        boolean z2 = view.getTop() > i + 10;
        boolean a2 = a(view, f);
        lap.a("buyAfterRecommend", "checkIsNeedDoAnimation", "当前是否是向上滚动：" + z + " 当前是否距离顶部的距离小于需要做动画的间距：" + z2 + "当前信息流露头的距离是否达标：" + a2);
        return z && z2 && a2;
    }

    private boolean a(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3af19a", new Object[]{this, view, new Float(f)})).booleanValue();
        }
        if (!(view.getParent() instanceof RecyclerView)) {
            lap.a("buyAfterRecommend", "isInfoFlowVisibleRateMoreThanThreshold", "该视图的父组件不是recycleView");
            return false;
        }
        int height = ((RecyclerView) view.getParent()).getHeight();
        lap.a("buyAfterRecommend", "isInfoFlowVisibleRateMoreThanThreshold", "recycleViewHeight: " + height + "当前的view距离顶部的距离: " + view.getTop());
        return ((float) (height - view.getTop())) / ((float) height) > f;
    }

    private JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        if (this.j == null) {
            this.j = this.c.a(this.d);
        }
        JSONObject jSONObject = this.j;
        if (jSONObject == null || jSONObject.isEmpty()) {
            lap.a("buyAfterRecommend", "getInteractiveUpgradeConfig", "coldEffectConfig == null");
            return null;
        }
        return this.j.getJSONObject("interactiveUpgrade");
    }

    private void a(JSONObject jSONObject, View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d84c11df", new Object[]{this, jSONObject, view, motionEvent});
            return;
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            lap.a("buyAfterRecommend", "dispatchTouchEvent", "config == null");
            jSONObject = JSONObject.parseObject("{\"animationTime\":\"300\",\"recmdVisibleRate\":\"0.16\",\"marginTopDistance\":\"0\"}");
        }
        int intValue = jSONObject.getIntValue("animationTime");
        int intValue2 = jSONObject.getIntValue("marginTopDistance");
        if (!a(view, motionEvent, jSONObject.getFloatValue("recmdVisibleRate"), intValue2)) {
            return;
        }
        this.b.a(new otf(intValue2, new AccelerateDecelerateInterpolator(), intValue));
        lap.a("buyAfterRecommend", "processTouchEvent", "通知执行动画了");
    }
}
