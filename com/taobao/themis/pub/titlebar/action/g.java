package com.taobao.themis.pub.titlebar.action;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.utils.k;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubLoadingBackAction;", "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "()V", "mBackContainer", "Landroid/widget/FrameLayout;", "mClickListener", "Landroid/view/View$OnClickListener;", "mImageView", "Landroid/widget/ImageView;", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "setOnBackClickListener", "", "clickListener", "setStyle", "style", "Lcom/taobao/themis/kernel/container/Window$Theme;", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class g extends com.taobao.themis.kernel.container.ui.titlebar.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f22769a;
    private ImageView b;
    private View.OnClickListener c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/taobao/themis/pub/titlebar/action/PubLoadingBackAction$getView$1$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public a(Context context) {
            this.b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            g.a(g.this);
            if (g.b(g.this) != null) {
                View.OnClickListener b = g.b(g.this);
                if (b == null) {
                    return;
                }
                b.onClick(view);
                return;
            }
            Context context = this.b;
            if (!(context instanceof Activity)) {
                return;
            }
            ((Activity) context).finish();
        }
    }

    static {
        kge.a(1553388745);
    }

    public static final /* synthetic */ ITMSPage a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("5cc1ae42", new Object[]{gVar}) : gVar.d();
    }

    public static final /* synthetic */ View.OnClickListener b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("1995f6e7", new Object[]{gVar}) : gVar.c;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        q.d(context, "context");
        if (this.f22769a == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, k.a(context, 48.0f)));
            frameLayout.setContentDescription("返回");
            frameLayout.setOnClickListener(new a(context));
            t tVar = t.INSTANCE;
            this.f22769a = frameLayout;
            ImageView imageView = new ImageView(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(k.a(context, 39.0f), k.a(context, 26.0f));
            layoutParams.gravity = 17;
            t tVar2 = t.INSTANCE;
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setBackgroundResource(R.drawable.tms_pub_title_back_bg_dark);
            imageView.setImageResource(R.drawable.tms_pub_back);
            imageView.setPadding(k.a(context, 17.5f), k.a(context, 6.5f), k.a(context, 14.75f), k.a(context, 6.5f));
            t tVar3 = t.INSTANCE;
            this.b = imageView;
            FrameLayout frameLayout2 = this.f22769a;
            if (frameLayout2 != null) {
                frameLayout2.addView(this.b);
            }
        }
        return this.f22769a;
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public void a(Window.Theme style) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209b885a", new Object[]{this, style});
            return;
        }
        q.d(style, "style");
        if (Window.Theme.LIGHT == style) {
            ImageView imageView = this.b;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.tms_pub_white);
            }
            ImageView imageView2 = this.b;
            if (imageView2 == null) {
                return;
            }
            imageView2.setBackgroundResource(R.drawable.tms_pub_title_back_bg_light);
            return;
        }
        ImageView imageView3 = this.b;
        if (imageView3 != null) {
            imageView3.setImageResource(R.drawable.tms_pub_back);
        }
        ImageView imageView4 = this.b;
        if (imageView4 == null) {
            return;
        }
        imageView4.setBackgroundResource(R.drawable.tms_pub_title_back_bg_dark);
    }
}
