package com.taobao.tbpoplayer.view.nativepop;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.utils.c;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.info.a;
import com.taobao.tbpoplayer.nativerender.h;
import com.taobao.tbpoplayer.view.nativepop.PopLayerNativeView;
import tb.kge;
import tb.qnu;
import tb.qoa;

/* loaded from: classes9.dex */
public class PopLayerNativeView extends PopLayerBaseView<View, d> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEW_TYPE = "native";
    private final Handler mHandler;
    private h mNativePopEngine;

    static {
        kge.a(1036291981);
    }

    public static /* synthetic */ Object ipc$super(PopLayerNativeView popLayerNativeView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1896705494:
                super.syncJumpToUrlInfo((String) objArr[0]);
                return null;
            case 311919889:
                super.onReceiveEvent((String) objArr[0], (String) objArr[1]);
                return null;
            case 406417345:
                super.resetContext((Context) objArr[0]);
                return null;
            case 571929693:
                super.init((Context) objArr[0], (Context) ((PopRequest) objArr[1]));
                return null;
            case 988548963:
                super.onActivityPaused();
                return null;
            case 1889590256:
                super.onActivityResumed();
                return null;
            case 1890078406:
                super.destroyView();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ Object access$002(PopLayerNativeView popLayerNativeView, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dbc8ab3b", new Object[]{popLayerNativeView, obj});
        }
        popLayerNativeView.mInnerView = obj;
        return obj;
    }

    public PopLayerNativeView(Context context) {
        super(context);
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void resetContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
            return;
        }
        super.resetContext(context);
        if (!a.a().A()) {
            return;
        }
        Context context2 = getContext();
        if (!(context2 instanceof MutableContextWrapper)) {
            return;
        }
        ((MutableContextWrapper) context2).setBaseContext(context);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void init(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef24561", new Object[]{this, context, dVar});
            return;
        }
        super.init(context, (Context) dVar);
        setPopRequest(dVar);
        setVisibility(4);
        if (a.a().P()) {
            setUseCacheMark(false);
            setUseTouchPointBitmap(true);
        }
        setPenetrateAlpha((int) (dVar.x().modalThreshold * 255.0d));
        dVar.t().E = "0";
        this.mNativePopEngine = new h(dVar, this.mHandler, new AnonymousClass1(dVar));
        this.mNativePopEngine.p();
    }

    /* renamed from: com.taobao.tbpoplayer.view.nativepop.PopLayerNativeView$1 */
    /* loaded from: classes9.dex */
    public class AnonymousClass1 implements h.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ d f22277a;

        public static /* synthetic */ void lambda$MG_FV2wTv702g9D1YYvqhDRtpKg(AnonymousClass1 anonymousClass1, View view) {
            anonymousClass1.e(view);
        }

        /* renamed from: lambda$Ra1-TAeB4O3xMwve9Qlx_m91Bkg */
        public static /* synthetic */ void m1472lambda$Ra1TAeB4O3xMwve9Qlx_m91Bkg(AnonymousClass1 anonymousClass1, View view) {
            anonymousClass1.d(view);
        }

        public static /* synthetic */ void lambda$YD_hpE4bRzIlcgbH5HdfgdJRUj4(AnonymousClass1 anonymousClass1, View view, d dVar) {
            anonymousClass1.a(view, dVar);
        }

        public static /* synthetic */ void lambda$eVvdIo9uF_pW3Xw3qI4kYokIYWA(AnonymousClass1 anonymousClass1, String str, String str2, String str3) {
            anonymousClass1.b(str, str2, str3);
        }

        public static /* synthetic */ void lambda$qITcaoGbVVk9tSF5lk6dEKFrDHQ(AnonymousClass1 anonymousClass1, String str, String str2) {
            anonymousClass1.b(str, str2);
        }

        public AnonymousClass1(d dVar) {
            PopLayerNativeView.this = r1;
            this.f22277a = dVar;
        }

        @Override // com.taobao.tbpoplayer.nativerender.h.a
        public void a(final View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                return;
            }
            final d dVar = this.f22277a;
            f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.nativepop.-$$Lambda$PopLayerNativeView$1$YD_hpE4bRzIlcgbH5HdfgdJRUj4
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerNativeView.AnonymousClass1.lambda$YD_hpE4bRzIlcgbH5HdfgdJRUj4(PopLayerNativeView.AnonymousClass1.this, view, dVar);
                }
            });
        }

        public /* synthetic */ void a(View view, d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ed0b2ba", new Object[]{this, view, dVar});
                return;
            }
            try {
                PopLayerNativeView.this.clearClickableInfo();
                PopLayerNativeView.access$002(PopLayerNativeView.this, view);
                PopLayerNativeView.this.addInnerView();
                dVar.t().F = String.valueOf(SystemClock.elapsedRealtime() - dVar.t().ak);
            } catch (Throwable th) {
                c.a("PopLayerNativeView.onRenderSuccess.error.", th);
                PopLayerNativeView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "onRenderSuccessError", "", "");
            }
        }

        @Override // com.taobao.tbpoplayer.nativerender.h.a
        public void c(final View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
            } else {
                f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.nativepop.-$$Lambda$PopLayerNativeView$1$MG_FV2wTv702g9D1YYvqhDRtpKg
                    {
                        PopLayerNativeView.AnonymousClass1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PopLayerNativeView.AnonymousClass1.lambda$MG_FV2wTv702g9D1YYvqhDRtpKg(PopLayerNativeView.AnonymousClass1.this, view);
                    }
                });
            }
        }

        public /* synthetic */ void e(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85081ee6", new Object[]{this, view});
                return;
            }
            try {
                PopLayerNativeView.this.clearClickableInfo();
                PopLayerNativeView.this.removeAllViews();
                PopLayerNativeView.this.addView(view);
            } catch (Throwable th) {
                c.a("PopLayerNativeView.onReRenderSuccess.error.", th);
                PopLayerNativeView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "onReRenderSuccessError", "", "");
            }
        }

        @Override // com.taobao.tbpoplayer.nativerender.h.a
        public void b(final View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            } else {
                f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.nativepop.-$$Lambda$PopLayerNativeView$1$Ra1-TAeB4O3xMwve9Qlx_m91Bkg
                    {
                        PopLayerNativeView.AnonymousClass1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PopLayerNativeView.AnonymousClass1.m1472lambda$Ra1TAeB4O3xMwve9Qlx_m91Bkg(PopLayerNativeView.AnonymousClass1.this, view);
                    }
                });
            }
        }

        public /* synthetic */ void d(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89069007", new Object[]{this, view});
                return;
            }
            try {
                PopLayerNativeView.this.clearClickableInfo();
                PopLayerNativeView.this.removeAllViews();
                PopLayerNativeView.this.addView(view);
            } catch (Throwable th) {
                c.a("PopLayerNativeView.onSwitchState.error.", th);
                PopLayerNativeView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, "onSwitchStateError", "", "");
            }
        }

        @Override // com.taobao.tbpoplayer.nativerender.h.a
        public void a(final String str, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            } else {
                f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.nativepop.-$$Lambda$PopLayerNativeView$1$eVvdIo9uF_pW3Xw3qI4kYokIYWA
                    {
                        PopLayerNativeView.AnonymousClass1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PopLayerNativeView.AnonymousClass1.lambda$eVvdIo9uF_pW3Xw3qI4kYokIYWA(PopLayerNativeView.AnonymousClass1.this, str3, str, str2);
                    }
                });
            }
        }

        public /* synthetic */ void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
                return;
            }
            try {
                if (qnu.a(str, false) && PopLayerNativeView.this.isDisplaying() && !PopLayerNativeView.this.isClosed()) {
                    Toast.makeText(PopLayerNativeView.this.getContext(), str, 0).show();
                }
            } catch (Throwable th) {
                c.a("PopLayerNativeView.onRenderFailed.error.", th);
            }
            PopLayerNativeView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, str2, str3, "");
        }

        @Override // com.taobao.tbpoplayer.nativerender.h.a
        public void a(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab835131", new Object[]{this, rect});
            } else {
                PopLayerNativeView.this.addClickableArea(rect);
            }
        }

        public /* synthetic */ void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            } else {
                PopLayerNativeView.this.close(OnePopModule.OnePopLoseReasonCode.OnViewJSClose, str, str2, "");
            }
        }

        @Override // com.taobao.tbpoplayer.nativerender.h.a
        public void a(final String str, final String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            } else {
                f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.nativepop.-$$Lambda$PopLayerNativeView$1$qITcaoGbVVk9tSF5lk6dEKFrDHQ
                    {
                        PopLayerNativeView.AnonymousClass1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PopLayerNativeView.AnonymousClass1.lambda$qITcaoGbVVk9tSF5lk6dEKFrDHQ(PopLayerNativeView.AnonymousClass1.this, str, str2);
                    }
                });
            }
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onReceiveEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12978511", new Object[]{this, str, str2});
            return;
        }
        try {
            super.onReceiveEvent(str, str2);
            if (this.mNativePopEngine == null) {
                return;
            }
            this.mNativePopEngine.c(str, str2);
        } catch (Throwable th) {
            c.a("PopLayerNativeView.onReceiveEvent.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        try {
            removeCloseButton();
            com.taobao.tbpoplayer.view.c.a().b(d.b(this.mPopRequest));
        } catch (Throwable th) {
            c.a("PopLayerWeexView.destroyView.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        try {
            super.onActivityPaused();
            if (this.mNativePopEngine == null) {
                return;
            }
            this.mNativePopEngine.q();
        } catch (Throwable th) {
            c.a("PopLayerNativeView.onActivityPaused.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
            return;
        }
        try {
            super.onActivityResumed();
            if (this.mNativePopEngine == null) {
                return;
            }
            this.mNativePopEngine.r();
        } catch (Throwable th) {
            c.a("PopLayerNativeView.onActivityResumed.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public JSONObject getCurBizTrackInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee79b897", new Object[]{this});
        }
        h hVar = this.mNativePopEngine;
        if (hVar != null) {
            return hVar.s();
        }
        return new JSONObject();
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void syncJumpToUrlInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef2922a", new Object[]{this, str});
            return;
        }
        super.syncJumpToUrlInfo(str);
        qoa.a((d) this.mPopRequest);
    }
}
