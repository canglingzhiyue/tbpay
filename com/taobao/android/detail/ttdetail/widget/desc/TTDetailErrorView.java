package com.taobao.android.detail.ttdetail.widget.desc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/taobao/android/detail/ttdetail/widget/desc/TTDetailErrorView;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mErrorTipView", "Landroid/widget/TextView;", "mErrorTitleView", "mLinearLayout", "Landroid/widget/LinearLayout;", "mListener", "Lcom/taobao/android/detail/ttdetail/widget/desc/TTDetailErrorView$OnErrorViewButtonClickListener;", "init", "", "loadEmpty", "onClick", "v", "Landroid/view/View;", "setOnReloadButtonClickListener", DataReceiveMonitor.CB_LISTENER, "OnErrorViewButtonClickListener", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes5.dex */
public final class TTDetailErrorView extends RelativeLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView mErrorTipView;
    private TextView mErrorTitleView;
    private LinearLayout mLinearLayout;
    private a mListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/taobao/android/detail/ttdetail/widget/desc/TTDetailErrorView$OnErrorViewButtonClickListener;", "", "onErrorViewBtnClick", "", "v", "Landroid/view/View;", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes5.dex */
    public interface a {
        void a(View view);
    }

    static {
        kge.a(413959638);
        kge.a(-1201612728);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTDetailErrorView(Context context) {
        super(context);
        q.c(context, "context");
        init(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTDetailErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.c(context, "context");
        init(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTDetailErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q.c(context, "context");
        init(context);
    }

    public final TTDetailErrorView setOnReloadButtonClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailErrorView) ipChange.ipc$dispatch("6a833cfc", new Object[]{this, aVar});
        }
        this.mListener = aVar;
        return this;
    }

    private final void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_error_view, (ViewGroup) this, true);
        this.mErrorTitleView = (TextView) findViewById(R.id.tt_detail_errorview_title);
        this.mErrorTipView = (TextView) findViewById(R.id.tt_detail_errorview_tip);
        this.mLinearLayout = (LinearLayout) findViewById(R.id.tt_detail_reload_linear);
        LinearLayout linearLayout = this.mLinearLayout;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setOnClickListener(this);
    }

    public final void loadEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef62190e", new Object[]{this});
            return;
        }
        TextView textView = this.mErrorTitleView;
        if (textView != null) {
            textView.setText(R.string.tt_detail_desc_empty_title);
        }
        TextView textView2 = this.mErrorTipView;
        if (textView2 != null) {
            textView2.setText(R.string.tt_detail_desc_empty_tip);
        }
        LinearLayout linearLayout = this.mLinearLayout;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, v});
            return;
        }
        q.c(v, "v");
        a aVar = this.mListener;
        if (aVar == null) {
            return;
        }
        aVar.a(v);
    }
}
