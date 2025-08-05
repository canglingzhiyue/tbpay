package com.taobao.android.detail.ttdetail.skeleton.navbar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Outline;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.kge;
import tb.soy;

/* loaded from: classes5.dex */
public class CartBarViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CART_COUNT_CHANGE = "OpenCartItemCountChange";
    public static final String CART_BAR_MAXIMUM = "99+";
    public static final String UT_KEY_CART_BADGE = "CartBadge";
    public static final String UT_KEY_COUNT = "count";
    public static final String UT_KEY_TEXT = "text";
    public static final String UT_VALUE_CART_BADGE = "allitemcount";
    private static int c;
    private static int d;
    private static boolean e;
    private static int f;

    /* renamed from: a  reason: collision with root package name */
    private CartBarBroadcast f10906a;
    private final Context b;
    private soy.b.a g;

    private static boolean h(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b4137ff8", new Object[]{new Integer(i)})).booleanValue() : i <= 9;
    }

    public static /* synthetic */ int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        f = i;
        return i;
    }

    public static /* synthetic */ Context a(CartBarViewHolder cartBarViewHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b3fc79fb", new Object[]{cartBarViewHolder}) : cartBarViewHolder.b;
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : e;
    }

    public static /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : c;
    }

    public static /* synthetic */ String b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)}) : g(i);
    }

    public static /* synthetic */ int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : d;
    }

    public static /* synthetic */ boolean c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{new Integer(i)})).booleanValue() : h(i);
    }

    public static /* synthetic */ void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{new Integer(i)});
        } else {
            j(i);
        }
    }

    public static /* synthetic */ void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{new Integer(i)});
        } else {
            i(i);
        }
    }

    static {
        kge.a(-421249196);
        e = false;
        f = 0;
    }

    public CartBarViewHolder(Context context) {
        this.b = context;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f10906a == null) {
        } else {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.f10906a);
        }
    }

    public void a(soy.b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ec36c0", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    public boolean a(View view, d dVar, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75c6ae58", new Object[]{this, view, dVar, new Boolean(z), new Integer(i)})).booleanValue();
        }
        try {
            return b(view, dVar, z, i);
        } catch (Exception e2) {
            i.a("CartBarViewHolder", "error msg=" + e2.getMessage());
            return false;
        }
    }

    public boolean b(View view, d dVar, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53ba1437", new Object[]{this, view, dVar, new Boolean(z), new Integer(i)})).booleanValue();
        }
        if (!(dVar instanceof TaoDetailActionBarV3)) {
            return false;
        }
        final TaoDetailActionBarV3 taoDetailActionBarV3 = (TaoDetailActionBarV3) dVar;
        taoDetailActionBarV3.addItemView(view, i);
        final ViewParent parent = view.getParent();
        if (!(parent instanceof FrameLayout)) {
            return false;
        }
        ((FrameLayout) parent).post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.CartBarViewHolder.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) parent;
                int[] iArr = new int[2];
                frameLayout.getLocationOnScreen(iArr);
                TextView a2 = CartBarViewHolder.this.a(iArr[0], iArr[1], frameLayout.getWidth());
                if (a2 == null) {
                    return;
                }
                taoDetailActionBarV3.getMiniAppContainer().addView(a2);
            }
        });
        return true;
    }

    public TextView a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("2fa8e0af", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        e = true;
        soy.b.a aVar = this.g;
        if (aVar == null || !aVar.e) {
            return null;
        }
        int i4 = this.g.f;
        f = i4;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(h(i4) ? com.taobao.android.detail.ttdetail.utils.f.a(this.b, 18.0f) : com.taobao.android.detail.ttdetail.utils.f.a(this.b, 24.0f), h(i4) ? com.taobao.android.detail.ttdetail.utils.f.a(this.b, 18.0f) : com.taobao.android.detail.ttdetail.utils.f.a(this.b, 17.0f));
        float f2 = i;
        float f3 = i3;
        c = (int) ((0.5f * f3) + f2);
        d = (int) (f2 + (f3 * 0.4f));
        layoutParams.leftMargin = h(i4) ? c : d;
        layoutParams.topMargin = i2;
        TextView f4 = f(i4);
        f4.setLayoutParams(layoutParams);
        a(f4, this.g);
        return f4;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : f;
    }

    private TextView f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("96ff352a", new Object[]{this, new Integer(i)});
        }
        TextView textView = new TextView(this.b);
        textView.setBackgroundColor(Color.parseColor("#ff5000"));
        textView.setTextColor(-1);
        textView.setTextSize(0, com.taobao.android.detail.ttdetail.utils.f.a(this.b, 10.0f));
        textView.setText(g(i));
        if (e) {
            j(i);
        } else {
            i(i);
        }
        textView.setGravity(17);
        if (i == 0) {
            textView.setVisibility(8);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            textView.setClipToOutline(true);
            textView.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.CartBarViewHolder.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), com.taobao.android.detail.ttdetail.utils.f.a(CartBarViewHolder.a(CartBarViewHolder.this), 9.0f));
                    }
                }
            });
        }
        return textView;
    }

    private void a(TextView textView, soy.b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5860fb34", new Object[]{this, textView, aVar});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("OpenCartItemCountChange");
        if (this.f10906a != null) {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.f10906a);
        }
        this.f10906a = new CartBarBroadcast(textView, aVar);
        LocalBroadcastManager.getInstance(this.b).registerReceiver(this.f10906a, intentFilter);
    }

    private static String g(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d8e41eb", new Object[]{new Integer(i)}) : i > 99 ? "99+" : String.valueOf(i);
    }

    private static void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{new Integer(i)});
        } else {
            new HashMap().put("count", String.valueOf(i));
        }
    }

    private static void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d3132", new Object[]{new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("count", String.valueOf(i));
        hashMap.put("CartBadge", "allitemcount");
        hashMap.put("text", g(i));
    }

    /* loaded from: classes5.dex */
    public static class CartBarBroadcast extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<TextView> f10909a;
        private soy.b.a b;

        static {
            kge.a(-7151458);
        }

        public CartBarBroadcast(TextView textView, soy.b.a aVar) {
            this.f10909a = new WeakReference<>(textView);
            this.b = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null) {
            } else {
                try {
                    TextView textView = this.f10909a.get();
                    if (textView == null) {
                        return;
                    }
                    int intExtra = intent.getIntExtra("itemCount", 0);
                    CartBarViewHolder.a(intExtra);
                    if (intExtra <= 0) {
                        i = 8;
                    }
                    textView.setVisibility(i);
                    textView.setText(CartBarViewHolder.b(intExtra));
                    if (CartBarViewHolder.a()) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                        layoutParams.leftMargin = CartBarViewHolder.c(intExtra) ? CartBarViewHolder.b() : CartBarViewHolder.c();
                        textView.setLayoutParams(layoutParams);
                        CartBarViewHolder.d(intExtra);
                    } else {
                        CartBarViewHolder.e(intExtra);
                    }
                    if (this.b == null) {
                        return;
                    }
                    this.b.f = intExtra;
                } catch (Exception e) {
                    i.a("CartBarViewHolder", "onReceive error=" + e.getMessage());
                }
            }
        }
    }
}
