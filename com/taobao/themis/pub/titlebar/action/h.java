package com.taobao.themis.pub.titlebar.action;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.utils.k;
import com.taobao.uikit.actionbar.TBActionView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/taobao/themis/pub/titlebar/action/PubLoadingMoreAction;", "Lcom/taobao/themis/pub/titlebar/action/PubBaseMoreAction;", "()V", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "setCustomIconColor", "", "themis_pub_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class h extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-800522057);
    }

    @Override // com.taobao.themis.pub.titlebar.action.d
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.container.ui.titlebar.a
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        q.d(context, "context");
        b(context);
        if (h() == null) {
            View inflate = View.inflate(context, R.layout.tms_tb_more_view, null);
            if (inflate == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.actionbar.TBActionView");
            }
            TBActionView tBActionView = (TBActionView) inflate;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(k.a(context, 45.0f), k.a(context, 48.0f));
            layoutParams.gravity = 17;
            tBActionView.setLayoutParams(layoutParams);
            t tVar = t.INSTANCE;
            a(tBActionView);
        }
        return h();
    }
}
