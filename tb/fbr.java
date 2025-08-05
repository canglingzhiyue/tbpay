package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.model.viewmodel.main.d;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.wrapper.ext.windvane.webview.DetailHybridWebView;

/* loaded from: classes5.dex */
public class fbr extends c<d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String g;
    private DetailHybridWebView h;
    private FrameLayout i;

    static {
        kge.a(1507624301);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(fbr fbrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e83d0fe2", new Object[]{fbrVar});
        } else {
            fbrVar.g();
        }
    }

    public fbr(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.H5ViewHolder");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.i = null;
        }
        DetailHybridWebView detailHybridWebView = this.h;
        if (detailHybridWebView == null) {
            return;
        }
        detailHybridWebView.setHeightChangedListener(null);
        this.h.destroy();
        this.h = null;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.i = new FrameLayout(context);
        try {
            if (this.h != null && !this.h.isDestroied()) {
                this.h.destroy();
            }
        } catch (Throwable th) {
            i.a("[WebView-Destroy]H5ViewHolder", "WebView-Destroy error", th);
            ecg.d(context, Log.getStackTraceString(th));
        }
        this.h = new DetailHybridWebView(context);
        this.h.setOverScrollMode(2);
        this.h.enableLoadingAnim();
        this.h.setHeightChangedListener(new DetailHybridWebView.c() { // from class: tb.fbr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.wrapper.ext.windvane.webview.DetailHybridWebView.c
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    fbr.a(fbr.this);
                }
            }
        });
        this.i.addView(this.h);
        return this.i;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270b8cd5", new Object[]{this, dVar});
            return;
        }
        this.g = dVar.f9767a;
        if (TextUtils.isEmpty(this.g)) {
            return;
        }
        this.h.loadUrl(this.g);
        if (dVar.b <= 0) {
            return;
        }
        this.h.getLayoutParams().height = epo.b(dVar.b);
        g();
    }
}
