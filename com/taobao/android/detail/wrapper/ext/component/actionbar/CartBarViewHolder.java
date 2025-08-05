package com.taobao.android.detail.wrapper.ext.component.actionbar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Outline;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.ehv;
import tb.emu;
import tb.eqb;
import tb.fgr;
import tb.kge;

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
    private CartBarBroadcast f11111a;
    private final Context b;

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
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("2682bc06", new Object[]{cartBarViewHolder}) : cartBarViewHolder.b;
    }

    public static /* synthetic */ String b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)}) : g(i);
    }

    public static /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : e;
    }

    public static /* synthetic */ boolean c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{new Integer(i)})).booleanValue() : h(i);
    }

    public static /* synthetic */ int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : c;
    }

    public static /* synthetic */ void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{new Integer(i)});
        } else {
            j(i);
        }
    }

    public static /* synthetic */ int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue() : d;
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
        kge.a(1967910891);
        e = false;
        f = 0;
    }

    public CartBarViewHolder(Context context) {
        this.b = context;
        emu.a("com.taobao.android.detail.wrapper.ext.component.actionbar.CartBarViewHolder");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f11111a == null) {
        } else {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.f11111a);
        }
    }

    public boolean a(View view, ehv ehvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("292820f1", new Object[]{this, view, ehvVar, new Boolean(z)})).booleanValue();
        }
        try {
            return b(view, ehvVar, z, 0);
        } catch (Exception e2) {
            i.a("CartBarViewHolder", "error msg=" + e2.getMessage());
            return false;
        }
    }

    public boolean a(View view, ehv ehvVar, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbdc6fba", new Object[]{this, view, ehvVar, new Boolean(z), new Integer(i)})).booleanValue();
        }
        try {
            return b(view, ehvVar, z, i);
        } catch (Exception e2) {
            i.a("CartBarViewHolder", "error msg=" + e2.getMessage());
            return false;
        }
    }

    public boolean b(View view, ehv ehvVar, boolean z, int i) {
        ViewGroup a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38fc33d9", new Object[]{this, view, ehvVar, new Boolean(z), new Integer(i)})).booleanValue();
        }
        if (ehvVar instanceof TaoDetailActionBarV2) {
            if (!fgr.a("enableCartBar", true) || (a2 = a(z)) == null) {
                return false;
            }
            view.setBackgroundColor(0);
            if (z) {
                a2.setBackgroundResource(R.drawable.x_detail_action_bar_circular_bg_v2);
            }
            a2.addView(view, 0);
            ((TaoDetailActionBarV2) ehvVar).addCustomView(a2);
            ViewParent parent = a2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).setClipChildren(false);
            }
            return true;
        } else if (!(ehvVar instanceof TaoDetailActionBarV3) || !fgr.a("enable_ttnavibar_cart_count", true)) {
            return false;
        } else {
            final TaoDetailActionBarV3 taoDetailActionBarV3 = (TaoDetailActionBarV3) ehvVar;
            taoDetailActionBarV3.addItemView(view, i);
            final ViewParent parent2 = view.getParent();
            if (!(parent2 instanceof FrameLayout)) {
                return false;
            }
            ((DetailActivity) this.b).A().post(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.CartBarViewHolder.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FrameLayout frameLayout = (FrameLayout) parent2;
                    int[] iArr = new int[2];
                    frameLayout.getLocationOnScreen(iArr);
                    TextView a3 = CartBarViewHolder.this.a(iArr[0], iArr[1], frameLayout.getWidth());
                    if (a3 == null) {
                        return;
                    }
                    taoDetailActionBarV3.getMiniAppContainer().addView(a3);
                }
            });
            return true;
        }
    }

    private ViewGroup a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("3e9e2d29", new Object[]{this, new Boolean(z)});
        }
        e = false;
        JSONObject f2 = f();
        if (f2 == null || !f2.getBooleanValue("showBadge")) {
            return null;
        }
        int intValue = f2.getIntValue("count");
        f = intValue;
        FrameLayout frameLayout = new FrameLayout(this.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(h(intValue) ? DensityUtil.dip2px(this.b, 18.0f) : DensityUtil.dip2px(this.b, 24.0f), h(intValue) ? DensityUtil.dip2px(this.b, 18.0f) : DensityUtil.dip2px(this.b, 17.0f));
        layoutParams.gravity = 49;
        layoutParams.leftMargin = DensityUtil.dip2px(this.b, 9.0f);
        layoutParams.bottomMargin = DensityUtil.dip2px(this.b, 6.0f);
        TextView f3 = f(intValue);
        f3.setLayoutParams(layoutParams);
        frameLayout.setClipChildren(false);
        frameLayout.addView(f3);
        if (z) {
            frameLayout.setBackgroundResource(R.drawable.x_detail_action_bar_circular_bg_v2);
        }
        a(f3, f2);
        return frameLayout;
    }

    public TextView a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("2fa8e0af", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        e = true;
        JSONObject f2 = f();
        if (f2 == null || !f2.getBooleanValue("showBadge")) {
            return null;
        }
        int intValue = f2.getIntValue("count");
        f = intValue;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(h(intValue) ? DensityUtil.dip2px(this.b, 18.0f) : DensityUtil.dip2px(this.b, 24.0f), h(intValue) ? DensityUtil.dip2px(this.b, 18.0f) : DensityUtil.dip2px(this.b, 17.0f));
        float f3 = i;
        float f4 = i3;
        c = (int) ((0.5f * f4) + f3);
        d = (int) (f3 + (f4 * 0.4f));
        layoutParams.leftMargin = h(intValue) ? c : d;
        layoutParams.topMargin = i2;
        TextView f5 = f(intValue);
        f5.setLayoutParams(layoutParams);
        a(f5, f2);
        return f5;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : f;
    }

    private TextView f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("96ff352a", new Object[]{this, new Integer(i)});
        }
        TextView textView = new TextView(this.b);
        textView.setBackgroundColor(Color.parseColor("#ff5000"));
        textView.setTextColor(-1);
        textView.setTextSize(0, DensityUtil.dip2px(this.b, 10.0f));
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
            textView.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.CartBarViewHolder.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), DensityUtil.dip2px(CartBarViewHolder.a(CartBarViewHolder.this), 9.0f));
                    }
                }
            });
        }
        return textView;
    }

    private JSONObject f() {
        com.taobao.android.detail.datasdk.model.datamodel.node.c C;
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar;
        TradeNode e2;
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        Context context = this.b;
        if ((context instanceof DetailActivity) && (C = ((DetailActivity) context).C()) != null && (bVar = C.f10055a) != null && (e2 = eqb.e(bVar)) != null && (data = e2.getData()) != null) {
            return data.getJSONObject("cartIcon");
        }
        return null;
    }

    private void a(TextView textView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ed4794", new Object[]{this, textView, jSONObject});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("OpenCartItemCountChange");
        if (this.f11111a != null) {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.f11111a);
        }
        this.f11111a = new CartBarBroadcast(textView, jSONObject);
        LocalBroadcastManager.getInstance(this.b).registerReceiver(this.f11111a, intentFilter);
    }

    private static String g(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d8e41eb", new Object[]{new Integer(i)}) : i > 99 ? "99+" : String.valueOf(i);
    }

    private static void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("count", String.valueOf(i));
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Detail", 2201, "Page_Detail_Show_Button-ShoppingCart-Badge", null, null, hashMap).build());
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
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Detail", 2201, "Page_Detail_Button-ShoppingCart_Badge", null, null, hashMap).build());
    }

    /* loaded from: classes5.dex */
    public static class CartBarBroadcast extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<TextView> f11114a;
        private JSONObject b;

        static {
            kge.a(1770885351);
        }

        public CartBarBroadcast(TextView textView, JSONObject jSONObject) {
            this.f11114a = new WeakReference<>(textView);
            this.b = jSONObject;
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
                    TextView textView = this.f11114a.get();
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
                    if (CartBarViewHolder.c()) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                        layoutParams.leftMargin = CartBarViewHolder.c(intExtra) ? CartBarViewHolder.d() : CartBarViewHolder.e();
                        textView.setLayoutParams(layoutParams);
                        CartBarViewHolder.d(intExtra);
                    } else {
                        CartBarViewHolder.e(intExtra);
                    }
                    if (this.b == null) {
                        return;
                    }
                    this.b.put("count", (Object) Integer.valueOf(intExtra));
                } catch (Exception e) {
                    i.a("CartBarViewHolder", "onReceive error=" + e.getMessage());
                }
            }
        }
    }
}
