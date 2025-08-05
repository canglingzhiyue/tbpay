package com.taobao.themis.pub.titlebar.action;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.R;
import com.taobao.themis.utils.k;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubGameCloseMoreAction;", "Lcom/taobao/themis/kernel/container/ui/titlebar/Action;", "()V", "mIVClose", "Landroid/widget/ImageView;", "mMoreCloseContainer", "Landroid/widget/RelativeLayout;", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class f extends com.taobao.themis.kernel.container.ui.titlebar.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RelativeLayout f22767a;
    private ImageView b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22768a;

        public a(Context context) {
            this.f22768a = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            Context context = this.f22768a;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null) {
                return;
            }
            activity.finish();
        }
    }

    static {
        kge.a(-451170271);
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        q.d(context, "context");
        if (this.f22767a == null) {
            ImageView imageView = null;
            View inflate = View.inflate(context, R.layout.tms_game_close_action, null);
            if (inflate == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
            }
            RelativeLayout relativeLayout = (RelativeLayout) inflate;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(k.a(context, 75.0f), k.a(context, 29.0f));
            layoutParams.rightMargin = k.a(context, 12.0f);
            t tVar = t.INSTANCE;
            relativeLayout.setLayoutParams(layoutParams);
            t tVar2 = t.INSTANCE;
            this.f22767a = relativeLayout;
            RelativeLayout relativeLayout2 = this.f22767a;
            if (relativeLayout2 != null) {
                imageView = (ImageView) relativeLayout2.findViewById(R.id.right_close);
            }
            this.b = imageView;
            ImageView imageView2 = this.b;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new a(context));
            }
        }
        return this.f22767a;
    }
}
