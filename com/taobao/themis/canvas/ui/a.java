package com.taobao.themis.canvas.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.n;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/canvas/ui/GameForceUpdateGuide;", "", "mContext", "Landroid/content/Context;", "mModel", "Lcom/taobao/themis/canvas/ui/GameForceUpdateModel;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Landroid/content/Context;Lcom/taobao/themis/canvas/ui/GameForceUpdateModel;Lcom/taobao/themis/kernel/TMSInstance;)V", "hasShown", "", "getInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "mPopWindow", "Landroid/widget/PopupWindow;", "destroy", "", "show", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT, "Landroid/view/View;", "Companion", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0930a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final PopupWindow f22349a;
    private boolean b;
    private final Context c;
    private final com.taobao.themis.canvas.ui.b d;
    private final f e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a.a(a.this).dismiss();
            a.this.a().b().b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                a.a(a.this).dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                a.a(a.this).dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a.a(a.this).dismiss();
            INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) qpt.b(INavigatorAdapter.class);
            if (iNavigatorAdapter != null) {
                Activity o = a.this.a().o();
                q.b(o, "instance.activity");
                Activity activity = o;
                String g = a.this.a().g();
                q.b(g, "instance.url");
                HashMap hashMap = new HashMap();
                hashMap.put("disableTransition", true);
                t tVar = t.INSTANCE;
                iNavigatorAdapter.openURL(activity, g, null, null, hashMap);
            }
            com.taobao.themis.kernel.utils.a.a(new GameForceUpdateGuide$show$4$2(this), 300L);
        }
    }

    static {
        kge.a(1118133620);
        Companion = new C0930a(null);
    }

    public a(Context mContext, com.taobao.themis.canvas.ui.b mModel, f instance) {
        q.d(mContext, "mContext");
        q.d(mModel, "mModel");
        q.d(instance, "instance");
        this.c = mContext;
        this.d = mModel;
        this.e = instance;
        this.f22349a = new PopupWindow(this.c);
    }

    public static final /* synthetic */ PopupWindow a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("72f20b62", new Object[]{aVar}) : aVar.f22349a;
    }

    public final f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("52d36a33", new Object[]{this}) : this.e;
    }

    public final boolean a(View parent) {
        View inflate;
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, parent})).booleanValue();
        }
        q.d(parent, "parent");
        if (this.b) {
            return false;
        }
        boolean a2 = n.a(this.e.h());
        if (a2) {
            inflate = View.inflate(this.c, R.layout.themis_update_notification_guide_landscape, null);
        } else {
            inflate = View.inflate(this.c, R.layout.themis_update_notification_guide, null);
        }
        if (inflate == null) {
            return false;
        }
        TextView textView = (TextView) inflate.findViewById(R.id.content);
        TextView textView2 = (TextView) inflate.findViewById(R.id.left_button);
        TextView textView3 = (TextView) inflate.findViewById(R.id.right_button);
        TextView textView4 = (TextView) inflate.findViewById(R.id.tvTitle);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.ivIcon);
        TUrlImageView tUrlImageView2 = (TUrlImageView) inflate.findViewById(R.id.ivClose);
        if (textView == null || textView2 == null || textView3 == null || tUrlImageView == null || textView4 == null || tUrlImageView2 == null) {
            return false;
        }
        textView4.setText(this.d.c());
        tUrlImageView.setImageUrl(this.d.d(), new PhenixOptions().bitmapProcessors(new com.taobao.phenix.compat.effects.c()));
        textView.setText(this.d.b());
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        if (this.d.a()) {
            textView2.setText("退出游戏");
            textView2.setOnClickListener(new b());
            tUrlImageView2.setVisibility(8);
        } else {
            textView2.setText("忽略");
            textView2.setOnClickListener(new c());
            tUrlImageView2.setVisibility(0);
            tUrlImageView2.setOnClickListener(new d());
        }
        textView3.setOnClickListener(new e());
        Object systemService = this.c.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        FrameLayout frameLayout = new FrameLayout(this.c);
        if (a2) {
            layoutParams = new FrameLayout.LayoutParams((displayMetrics.widthPixels * 750) / 1624, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams((displayMetrics.widthPixels * 590) / 750, -2);
        }
        layoutParams.gravity = 17;
        frameLayout.addView(inflate, layoutParams);
        this.f22349a.setContentView(frameLayout);
        this.f22349a.setOutsideTouchable(false);
        this.f22349a.setFocusable(true);
        this.f22349a.setClippingEnabled(false);
        this.f22349a.setSoftInputMode(16);
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        colorDrawable.setAlpha(100);
        this.f22349a.setBackgroundDrawable(colorDrawable);
        this.f22349a.setHeight(displayMetrics.heightPixels);
        this.f22349a.getContentView().setPadding(0, 0, 0, displayMetrics.heightPixels - displayMetrics2.heightPixels);
        this.f22349a.setWidth(-1);
        Context context = this.c;
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        if (((Activity) context).isFinishing()) {
            return false;
        }
        this.f22349a.showAtLocation(parent, 17, 0, 0);
        this.b = true;
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/canvas/ui/GameForceUpdateGuide$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.canvas.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0930a {
        static {
            kge.a(42338236);
        }

        private C0930a() {
        }

        public /* synthetic */ C0930a(o oVar) {
            this();
        }
    }
}
