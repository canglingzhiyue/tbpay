package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.android.tbtheme.kit.g;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.message.lab.comfrm.util.ExtentionFunctionKt;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u0010J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$J8\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010'2\b\u0010+\u001a\u0004\u0018\u00010'J\u0006\u0010,\u001a\u00020\u0010R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R7\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/taobao/mytaobao/pagev2/ui/TitleBarHelperV2;", "", "()V", "<set-?>", "Landroid/widget/FrameLayout;", "flActionBar", "getFlActionBar", "()Landroid/widget/FrameLayout;", "lazyInitThemeTask", "Ljava/lang/Runnable;", "themeColorChangeListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "themeColor", "", "getThemeColorChangeListener", "()Lkotlin/jvm/functions/Function1;", "setThemeColorChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "tvBtn1", "Landroid/widget/TextView;", "tvBtn2", "tvTitle", "considerInitTheme", "ctx", "Landroid/content/Context;", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "generateActionBarView", "initViews", "rv", "Lcom/taobao/mytaobao/view/MTPtrRecyclerView;", "lazyInitTitleBarTheme", "setActionBarRootViewClickListener", "clickListener", "Landroid/view/View$OnClickListener;", "updateActionBar", "nick", "", "customerServiceTxt", "customerServiceUrl", "settingButtonTxt", "settingButtonUrl", "updateTheme", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Runnable f34446a;
    private FrameLayout b;
    private TextView c;
    private TextView d;
    private TextView e;
    private rul<? super Integer, t> f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/taobao/mytaobao/pagev2/ui/TitleBarHelperV2$initViews$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrolled", "", OrderConfigs.RECYCLERVIEW, "Landroid/support/v7/widget/RecyclerView;", "dx", "", "dy", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 806944192) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            RecyclerView.ViewHolder findFirstVisibleViewHoler;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            q.c(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (i2 == 0 || (findFirstVisibleViewHoler = ExtentionFunctionKt.findFirstVisibleViewHoler(recyclerView)) == null) {
                return;
            }
            if (findFirstVisibleViewHoler.getAdapterPosition() > 0) {
                FrameLayout a2 = xow.this.a();
                if (a2 == null) {
                    return;
                }
                a2.setVisibility(0);
                return;
            }
            View view = findFirstVisibleViewHoler.itemView;
            q.a((Object) view, "firstVH.itemView");
            if (view.getHeight() > 0) {
                View view2 = findFirstVisibleViewHoler.itemView;
                q.a((Object) view2, "firstVH.itemView");
                if (view2.getTop() < this.b) {
                    FrameLayout a3 = xow.this.a();
                    if (a3 == null) {
                        return;
                    }
                    a3.setVisibility(0);
                    return;
                }
            }
            FrameLayout a4 = xow.this.a();
            if (a4 == null) {
                return;
            }
            a4.setVisibility(4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public b(Context context) {
            this.b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            FrameLayout a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ThemeFrameLayout a3 = j.a().a(this.b, new g("mytaobao", 1, mxo.g()));
            if (a3 != null && (a2 = xow.this.a()) != null) {
                a2.addView(a3, 0, new FrameLayout.LayoutParams(-1, -1));
            }
            xow.this.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f34449a;

        public c(String str) {
            this.f34449a = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, it});
            } else if (this.f34449a == null) {
            } else {
                q.a((Object) it, "it");
                Nav.from(it.getContext()).toUri(this.f34449a);
                com.taobao.mytaobao.base.c.x = this.f34449a;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f34450a;

        public d(String str) {
            this.f34450a = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, it});
            } else if (this.f34450a == null) {
            } else {
                q.a((Object) it, "it");
                Nav.from(it.getContext()).toUri(this.f34450a);
                com.taobao.mytaobao.base.c.x = this.f34450a;
            }
        }
    }

    static {
        kge.a(-707417026);
    }

    public final FrameLayout a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this}) : this.b;
    }

    public final void a(rul<? super Integer, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc03baf", new Object[]{this, rulVar});
        } else {
            this.f = rulVar;
        }
    }

    public final void a(Context ctx, MTPtrRecyclerView rv) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5595266c", new Object[]{this, ctx, rv});
            return;
        }
        q.c(ctx, "ctx");
        q.c(rv, "rv");
        rv.addOnScrollListener(new a(-DisplayUtil.dip2px(20.0f)));
        c(ctx);
        a(ctx);
    }

    private final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!mxa.c()) {
        } else {
            b(context);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Runnable runnable = this.f34446a;
        if (runnable == null) {
            return;
        }
        mtz.f31263a.removeCallbacks(runnable);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ThemeData b2 = j.a().b("mytaobao");
        if (b2 == null) {
            return;
        }
        int a2 = mxq.a(b2.getActionbarTextColor(), -1);
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(a2);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTextColor(a2);
        }
        TextView textView3 = this.e;
        if (textView3 != null) {
            textView3.setTextColor(a2);
        }
        rul<? super Integer, t> rulVar = this.f;
        if (rulVar == null) {
            return;
        }
        rulVar.mo2421invoke(Integer.valueOf(a2));
    }

    public final void a(View.OnClickListener clickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, clickListener});
            return;
        }
        q.c(clickListener, "clickListener");
        FrameLayout frameLayout = this.b;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setOnClickListener(clickListener);
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        if (str != null && (textView = this.c) != null) {
            textView.setText(str);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        TextView textView3 = this.d;
        if (textView3 != null) {
            textView3.setOnClickListener(new c(str3));
        }
        TextView textView4 = this.e;
        if (textView4 != null) {
            textView4.setText(str4);
        }
        TextView textView5 = this.e;
        if (textView5 == null) {
            return;
        }
        textView5.setOnClickListener(new d(str5));
    }

    private final void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        b bVar = new b(context);
        mtz.f31263a.postDelayed(bVar, 2000L);
        this.f34446a = bVar;
    }

    private final void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        int dip2px = DensityUtil.dip2px(context, 10.0f);
        int f = mxo.f();
        int dip2px2 = DensityUtil.dip2px(context, 48.0f) + f;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(0, f, DensityUtil.dip2px(context, 6.0f), 0);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        textView.setText(R.string.mytaobao_title);
        textView.setGravity(16);
        int i = (int) 4279308561L;
        textView.setTextColor(i);
        textView.setMaxLines(1);
        textView.setTextSize(2, 17.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.c = textView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        layoutParams.leftMargin = DensityUtil.dip2px(context, 16.0f);
        linearLayout.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setPadding(dip2px, 0, 0, 0);
        textView2.setTextColor(i);
        textView2.setTextSize(2, 16.0f);
        textView2.setText("客服");
        this.d = textView2;
        linearLayout.addView(textView2, -2, -1);
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        textView3.setPadding(dip2px, 0, dip2px, 0);
        textView3.setTextColor(i);
        textView3.setTextSize(2, 16.0f);
        textView3.setText("设置");
        this.e = textView3;
        linearLayout.addView(textView3, -2, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor((int) 4294111986L);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, dip2px2));
        frameLayout.addView(linearLayout, -1, -1);
        frameLayout.setVisibility(4);
        this.b = frameLayout;
    }
}
