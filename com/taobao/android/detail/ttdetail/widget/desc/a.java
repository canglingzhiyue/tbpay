package com.taobao.android.detail.ttdetail.widget.desc;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.util.n;
import android.taobao.windvane.webview.m;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.c;
import com.taobao.android.detail.ttdetail.skeleton.desc.web.a;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.widget.desc.TTDetailErrorView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.ecg;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/android/detail/ttdetail/widget/desc/TTDetailBrowserUIModel;", "Landroid/taobao/windvane/webview/WVUIModel;", "context", "Landroid/content/Context;", ecg.UMB_FEATURE_WEB_VIEW, "Landroid/taobao/windvane/extra/uc/WVUCWebView;", "(Landroid/content/Context;Landroid/taobao/windvane/extra/uc/WVUCWebView;)V", "mContext", "mErrorView", "Landroid/view/View;", "mWebView", "createErrorView", "Lcom/taobao/android/detail/ttdetail/widget/desc/TTDetailErrorView;", "loadErrorPage", "", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes5.dex */
public final class a extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f10995a;
    private View b;
    private final WVUCWebView c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/taobao/android/detail/ttdetail/widget/desc/TTDetailBrowserUIModel$createErrorView$1$1", "Lcom/taobao/android/detail/ttdetail/widget/desc/TTDetailErrorView$OnErrorViewButtonClickListener;", "onErrorViewBtnClick", "", "v", "Landroid/view/View;", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
    /* renamed from: com.taobao.android.detail.ttdetail.widget.desc.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0433a implements TTDetailErrorView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0433a() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.desc.TTDetailErrorView.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                return;
            }
            c.a(a.a(a.this), new a.C0430a(a.C0430a.HIDE_ERROR));
            a.b(a.this).reload();
            a.this.hideErrorPage();
        }
    }

    static {
        kge.a(1908926820);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1246152312) {
            super.loadErrorPage();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ Context a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("fc383d14", new Object[]{aVar}) : aVar.f10995a;
    }

    public static final /* synthetic */ WVUCWebView b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("dc679c3a", new Object[]{aVar}) : aVar.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, WVUCWebView webView) {
        super(context, webView);
        q.c(context, "context");
        q.c(webView, "webView");
        this.f10995a = context;
        this.c = webView;
    }

    @Override // android.taobao.windvane.webview.m
    public void loadErrorPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a46c678", new Object[]{this});
            return;
        }
        c.a(this.f10995a, new a.C0430a(a.C0430a.SHOW_ERROR));
        i.a("DetailHybridWebView", "url load error");
        if (this.b == null && (n.a(this.f10995a) instanceof Activity)) {
            this.b = a();
            setErrorView(this.b);
        }
        super.loadErrorPage();
    }

    private final TTDetailErrorView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailErrorView) ipChange.ipc$dispatch("fd94487", new Object[]{this});
        }
        TTDetailErrorView tTDetailErrorView = new TTDetailErrorView(this.f10995a);
        tTDetailErrorView.setOnReloadButtonClickListener(new C0433a());
        return tTDetailErrorView;
    }
}
