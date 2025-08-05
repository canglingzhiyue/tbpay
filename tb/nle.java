package tb;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ItemInfo;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.view.RecommendTouchView;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.q;
import tb.cew;
import tb.qmv;

/* loaded from: classes6.dex */
public class nle extends nlf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DXRootView h;
    private ItemInfo i;
    private Handler j;

    static {
        kge.a(1556091566);
    }

    public static /* synthetic */ Object ipc$super(nle nleVar, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.nlf
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.nlf
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ ItemInfo a(nle nleVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemInfo) ipChange.ipc$dispatch("7efd8dd3", new Object[]{nleVar}) : nleVar.i;
    }

    public static /* synthetic */ void a(nle nleVar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ff702", new Object[]{nleVar, new Integer(i), new Boolean(z)});
        } else {
            nleVar.a(i, z);
        }
    }

    public static /* synthetic */ void a(nle nleVar, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff2240c", new Object[]{nleVar, str, new Integer(i), new Boolean(z)});
        } else {
            nleVar.a(str, i, z);
        }
    }

    public nle(Context context, hka hkaVar, String str) {
        super(context, hkaVar, str);
        this.j = new Handler();
    }

    @Override // tb.nlf
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.i = (ItemInfo) pqj.a(this.d, ItemInfo.class);
        this.h = qmz.a(this.b.l(), this.f31547a, TextUtils.isEmpty(this.g) ? "taolive_boom_panel" : this.g);
        if (this.h == null) {
            return;
        }
        RecommendTouchView recommendTouchView = new RecommendTouchView(this.f31547a);
        recommendTouchView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recommendTouchView.setPadding(0, 0, 0, h());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        recommendTouchView.addView(this.h, layoutParams);
        this.c.addView(recommendTouchView);
        recommendTouchView.setRecommendTouchListener(new View.OnTouchListener() { // from class: tb.nle.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                if (motionEvent.getAction() == 0) {
                    nle.this.b.a(true, true);
                    nle.this.b.b(nle.this.k(), nle.a(nle.this));
                }
                return false;
            }
        });
        a(true);
        this.b.a(j(), this.i);
        a(8);
    }

    @Override // tb.nlf
    public ItemInfo a(qmv.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemInfo) ipChange.ipc$dispatch("dda82e23", new Object[]{this, aVar}) : this.i;
    }

    @Override // tb.nlf
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.d.put(str, obj);
        }
    }

    @Override // tb.nlf
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.h == null || this.d == null) {
        } else {
            JSONObject jSONObject = this.d;
            if (this.b.f() == null) {
                z2 = false;
            }
            jSONObject.put("isSupport0yg", (Object) Boolean.valueOf(z2));
            this.d.put("isNeedShowAnimal", (Object) Boolean.valueOf(z));
            this.d.put("futureTime", (Object) Long.valueOf(System.currentTimeMillis() + cew.a.CONFIG_TRACK_1022_INTERVAL_TIME));
            qmz.a(this.b.l(), this.h, new JSONObject(this.d), this.b.g());
        }
    }

    @Override // tb.nlf
    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.h;
    }

    @Override // tb.nlf
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        this.h = null;
        this.i = null;
        a(0, true);
        Handler handler = this.j;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.j = null;
    }

    @Override // tb.nlf
    public void a(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        Handler handler = this.j;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: tb.nle.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    nle.a(nle.this, i, false);
                }
            }
        });
    }

    private void a(int i, boolean z) {
        ItemInfo itemInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (z || (hkk.D() && (itemInfo = this.i) != null && itemInfo.displayStyleExtend != null && l.d(this.i.displayStyleExtend.getString("isNeedHideALive")))) {
            a("dynamic_h5_sdk", i, true);
        }
        a("tl-showcase-common", i, true);
        a("tl-chat", i, true);
        a("tl-top-select_comment", i, true);
        a("tl-important-event", i, true);
    }

    private void a(final String str, final int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a352a7e3", new Object[]{this, str, new Integer(i), new Boolean(z)});
        } else if (this.b.w == null) {
        } else {
            View viewByName = this.b.w.getViewByName(str);
            if (viewByName != null) {
                viewByName.setVisibility(i);
                viewByName.setAlpha(i == 0 ? 1.0f : 0.0f);
                String str2 = hka.f28714a;
                q.b(str2, viewByName + " setVisibilityRoomFrame " + str + " " + i + " " + z);
            } else if (!z || this.j == null || this.b.o() == null || this.b.o().k() == null) {
            } else {
                this.j.postDelayed(new Runnable() { // from class: tb.nle.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            nle.a(nle.this, str, i, false);
                        }
                    }
                }, this.b.o().k().b(str));
            }
        }
    }
}
