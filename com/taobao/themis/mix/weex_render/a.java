package com.taobao.themis.mix.weex_render;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.d;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.ljl;
import tb.qpv;
import tb.qqn;
import tb.qqo;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\"\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\fH\u0016J\b\u0010!\u001a\u00020\fH\u0016J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/taobao/themis/mix/weex_render/TMSWeexFragmentRender;", "Lcom/taobao/themis/kernel/runtime/TMSBaseRender;", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "mRenderUrl", "", "(Lcom/taobao/themis/kernel/page/ITMSPage;Ljava/lang/String;)V", "mRootView", "Landroid/view/ViewGroup;", "mWeexFragment", "Lcom/taobao/android/weex_ability/page/WeexFragment;", "destroy", "", "execJSToRender", "script", "", "name", "fireEventOld", "event", "params", "Lcom/alibaba/fastjson/JSON;", "getCurrentPageSnapshot", "Landroid/graphics/Bitmap;", "getRenderType", "getView", "Landroid/view/View;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onPause", "onResume", "render", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/runtime/TMSRenderListener;", "Companion", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a extends qqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0950a Companion;
    private final ViewGroup c;
    private WeexFragment d;
    private final String g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "copyResult", "", "onPixelCopyFinished"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    static final class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean[] f22589a;
        final /* synthetic */ CountDownLatch b;

        b(boolean[] zArr, CountDownLatch countDownLatch) {
            this.f22589a = zArr;
            this.b = countDownLatch;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public final void onPixelCopyFinished(int i) {
            this.f22589a[0] = i == 0;
            this.b.countDown();
        }
    }

    static {
        kge.a(717819005);
        Companion = new C0950a(null);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -69967319:
                super.a((qqo) objArr[0]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 94685804:
                super.e();
                return null;
            case 95609325:
                super.f();
                return null;
            case 2045969029:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.qqq
    public void a(String script, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, script, str});
        } else {
            q.d(script, "script");
        }
    }

    @Override // tb.qqq
    public void a(byte[] script, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3ac339", new Object[]{this, script, str});
        } else {
            q.d(script, "script");
        }
    }

    @Override // tb.qqq
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "Weex";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ITMSPage mPage, String mRenderUrl) {
        super(mPage);
        q.d(mPage, "mPage");
        q.d(mRenderUrl, "mRenderUrl");
        this.g = mRenderUrl;
        this.c = new FrameLayout(this.f33035a.o());
        ((FrameLayout) this.c).setId(R.id.tms_weex_fragment);
    }

    public static final /* synthetic */ WeexFragment a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexFragment) ipChange.ipc$dispatch("c509d46c", new Object[]{aVar}) : aVar.d;
    }

    public static final /* synthetic */ void a(a aVar, WeexFragment weexFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13ad44", new Object[]{aVar, weexFragment});
        } else {
            aVar.d = weexFragment;
        }
    }

    public static final /* synthetic */ String b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d48f3805", new Object[]{aVar}) : aVar.g;
    }

    public static final /* synthetic */ f c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("721f041", new Object[]{aVar}) : aVar.f33035a;
    }

    public static final /* synthetic */ ViewGroup d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("95e06dbc", new Object[]{aVar}) : aVar.c;
    }

    @Override // tb.qqn, tb.qqq
    public void a(qqo listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd46229", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        super.a(listener);
        if (this.f33035a.o() == null) {
            return;
        }
        this.c.getViewTreeObserver().addOnGlobalLayoutListener(new c());
        TMSLogger.a("TMSWeexRender", "WeexRender do render");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/themis/mix/weex_render/TMSWeexFragmentRender$render$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            a aVar = a.this;
            a.a(aVar, WeexFragment.newInstance(a.b(aVar), a.b(a.this), null, null, null));
            WeexFragment a2 = a.a(a.this);
            if (a2 != null) {
                a2.setOnDowngradeListener(C0951a.INSTANCE);
            }
            WeexFragment a3 = a.a(a.this);
            if (a3 != null) {
                a3.setRenderListener(new b());
            }
            Activity o = a.c(a.this).o();
            if (o == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            FragmentTransaction beginTransaction = ((FragmentActivity) o).getSupportFragmentManager().beginTransaction();
            beginTransaction.add(a.d(a.this).getId(), a.a(a.this), "ali_mus_fragment_tag");
            beginTransaction.commit();
            a.this.b().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDowngrade"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.themis.mix.weex_render.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class C0951a implements WeexFragment.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final C0951a INSTANCE = new C0951a();

            @Override // com.taobao.android.weex_ability.page.WeexFragment.a
            public final void bj_() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fa549e1e", new Object[]{this});
                } else {
                    TMSLogger.d("TMSWeexRender", "onDowngrade");
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J$\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016J,\u0010\u000f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016J,\u0010\u0013\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0015"}, d2 = {"com/taobao/themis/mix/weex_render/TMSWeexFragmentRender$render$1$onGlobalLayout$2", "Lcom/taobao/android/weex_framework/IMUSRenderListener;", "onDestroyed", "", "instance", "Lcom/taobao/android/weex_framework/MUSDKInstance;", "onFatalException", "Lcom/taobao/android/weex_framework/MUSInstance;", "type", "", "errorMsg", "", "onForeground", "onJSException", "onPrepareSuccess", "onRefreshFailed", "isFatal", "", "onRefreshSuccess", "onRenderFailed", ljl.RENDER_SUCCESS_TIME, "themis_mix_release"}, k = 1, mv = {1, 4, 1})
        /* loaded from: classes9.dex */
        public static final class b implements g {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // com.taobao.android.weex_framework.g
            public void onForeground(p pVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
                } else {
                    TMSLogger.b("TMSWeexRender", "weex instance onForeground");
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onPrepareSuccess(p pVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
                } else {
                    TMSLogger.b("TMSWeexRender", "weex instance prepare success");
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRenderSuccess(p pVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                } else {
                    TMSLogger.b("TMSWeexRender", "weex instance render success");
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRenderFailed(p pVar, int i, String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                    return;
                }
                TMSLogger.d("TMSWeexRender", "onRenderFailed, type: " + i + ", errorMsg: " + str + ", isFatal: " + z);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRefreshSuccess(p pVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
                } else {
                    TMSLogger.b("TMSWeexRender", "weex instance refresh success");
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRefreshFailed(p pVar, int i, String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                    return;
                }
                TMSLogger.d("TMSWeexRender", "onRefreshFailed, type: " + i + ", errorMsg: " + str + ", isFatal: " + z);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onJSException(p pVar, int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
                    return;
                }
                qpv.a(a.c(a.this), str == null ? "" : str);
                TMSLogger.d("TMSWeexRender", "onJSException, type: " + i + ", errorMsg: " + str);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onFatalException(p pVar, int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
                    return;
                }
                TMSLogger.d("TMSWeexRender", "onFatalException, type: " + i + ", errorMsg: " + str);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onDestroyed(MUSDKInstance mUSDKInstance) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                } else {
                    TMSLogger.d("TMSWeexRender", "weex instance destroy");
                }
            }
        }
    }

    @Override // tb.qqq
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }

    @Override // tb.qqq
    public void a(String event, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8072587d", new Object[]{this, event, json});
            return;
        }
        q.d(event, "event");
        WeexFragment weexFragment = this.d;
        if (weexFragment == null) {
            return;
        }
        if (!(json instanceof JSONObject)) {
            json = null;
        }
        weexFragment.fireEvent(event, (JSONObject) json);
    }

    @Override // tb.qqn, tb.qqq
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            super.a();
        }
    }

    @Override // tb.qqn, tb.qqq
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            super.e();
        }
    }

    @Override // tb.qqn, tb.qqq
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WeexFragment weexFragment = this.d;
        if (weexFragment != null) {
            weexFragment.onActivityResult(i, i2, intent);
        }
        super.a(i, i2, intent);
    }

    @Override // tb.qqn, tb.qqq
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        WeexFragment weexFragment = this.d;
        if (weexFragment != null) {
            weexFragment.onDestroy();
        }
        super.f();
    }

    @Override // tb.qqq
    public Bitmap di_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("db94d7df", new Object[]{this});
        }
        if (!n.t()) {
            return null;
        }
        SurfaceView surfaceView = (SurfaceView) com.taobao.themis.utils.f.a(this.c, SurfaceView.class);
        if (surfaceView != null) {
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(this.c.getWidth(), this.c.getHeight(), Bitmap.Config.ARGB_8888);
            surfaceView.getLocationInWindow(new int[2]);
            boolean[] zArr = new boolean[1];
            CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                HandlerThread handlerThread = new HandlerThread("themis_snapshot");
                handlerThread.start();
                if (Build.VERSION.SDK_INT >= 24) {
                    PixelCopy.request(surfaceView, new Rect(0, 0, surfaceView.getWidth(), surfaceView.getHeight()), createBitmap, new b(zArr, countDownLatch), new Handler(handlerThread.getLooper()));
                    countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                }
                handlerThread.quit();
                if (!zArr[0]) {
                    return null;
                }
                return createBitmap;
            } catch (Throwable th) {
                TMSLogger.b("TMSWeexRender", th.getMessage(), th);
                return null;
            }
        }
        TextureView textureView = (TextureView) com.taobao.themis.utils.f.a(this.c, TextureView.class);
        if (textureView != null) {
            return textureView.getBitmap();
        }
        ViewGroup viewGroup = this.c;
        return d.a(viewGroup, viewGroup.getWidth(), this.c.getHeight(), 0, 0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/mix/weex_render/TMSWeexFragmentRender$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.mix.weex_render.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0950a {
        static {
            kge.a(-316326011);
        }

        private C0950a() {
        }

        public /* synthetic */ C0950a(o oVar) {
            this();
        }
    }
}
