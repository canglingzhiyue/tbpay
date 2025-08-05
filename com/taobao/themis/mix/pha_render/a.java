package com.taobao.themis.mix.pha_render;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.monitor.procedure.s;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.controller.DowngradeType;
import com.taobao.pha.core.e;
import com.taobao.pha.core.n;
import com.taobao.pha.core.p;
import com.taobao.pha.core.tabcontainer.c;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.utils.d;
import com.taobao.themis.utils.f;
import com.taobao.themis.utils.k;
import com.taobao.weex.common.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.nfc;
import tb.nfz;
import tb.ngn;
import tb.qpm;
import tb.qqc;
import tb.qqn;
import tb.qqo;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u001a\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\"\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\n\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J\b\u0010&\u001a\u00020\u0012H\u0016J\"\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0012\u0010,\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\u0016H\u0016J\b\u0010/\u001a\u00020\u0016H\u0016J\u0010\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u0010H\u0016J\u0018\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H\u0002R\u000e\u0010\b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/taobao/themis/mix/pha_render/TMSTinyPHARender;", "Lcom/taobao/themis/kernel/runtime/TMSBaseRender;", "Lcom/taobao/pha/core/EventTarget$IEventListener;", "mPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", "mManifest", "", "(Lcom/taobao/themis/kernel/page/ITMSPage;Ljava/lang/String;)V", RPCDataItems.SWITCH_TAG_LOG, "mAppController", "Lcom/taobao/pha/core/controller/AppController;", "mChildFragmentManager", "Landroid/support/v4/app/FragmentManager;", "mPHAAdapter", "Lcom/taobao/pha/core/PHAAdapter;", "mRenderListener", "Lcom/taobao/themis/kernel/runtime/TMSRenderListener;", "mRootView", "Landroid/view/View;", "navigationBarHeight", "", "destroy", "", "doRender", "execJSToRender", "script", "", "name", e.RECORD_FIREEVENT, "event", "params", "Lcom/alibaba/fastjson/JSON;", "fireEventOld", "fireTargetEvent", "target", "getCurrentPageSnapshot", "Landroid/graphics/Bitmap;", "getRenderType", "getView", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "Lcom/taobao/pha/core/EventTarget$Event;", "onPause", "onResume", "render", DataReceiveMonitor.CB_LISTENER, "showErrorView", "errorCode", "errorMsg", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a extends qqn implements e.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String c;
    private View d;
    private AppController e;
    private FragmentManager f;
    private n g;
    private int h;
    private qqo j;
    private final String m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/taobao/themis/mix/pha_render/TMSTinyPHARender$render$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.mix.pha_render.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC0949a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ViewTreeObserver$OnGlobalLayoutListenerC0949a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            a.a(a.this);
            a.this.b().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    static {
        kge.a(-971740705);
        kge.a(722755957);
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
            case 1468831987:
                super.a((String) objArr[0], (String) objArr[1], (JSON) objArr[2]);
                return null;
            case 1914437276:
                super.b((String) objArr[0], (JSON) objArr[1]);
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : nfc.PHA_MONITOR_MODULE;
    }

    public static final /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e71a10", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ITMSPage mPage, String mManifest) {
        super(mPage);
        q.d(mPage, "mPage");
        q.d(mManifest, "mManifest");
        this.m = mManifest;
        this.c = "TMSTinyPHARender";
        View inflate = LayoutInflater.from(this.f33035a.o()).inflate(R.layout.tms_tiny_pha_root_container, (ViewGroup) null);
        q.b(inflate, "LayoutInflater.from(mIns…pha_root_container, null)");
        this.d = inflate;
        this.g = p.b();
        this.h = k.a((Context) this.f33035a.o(), 44.0f) + k.b(this.f33035a.o());
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
        if (qqc.a(this.b)) {
            this.f33035a.k().b("homePageRenderType", "H5");
        }
        this.j = listener;
        this.d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC0949a());
    }

    private final void c() {
        Fragment currentFragment;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        qpm f = this.b.f();
        Fragment fragment = null;
        this.f = (f == null || (currentFragment = f.getCurrentFragment()) == null) ? null : currentFragment.getChildFragmentManager();
        if (this.f == null) {
            qpm f2 = this.b.f();
            this.f = f2 != null ? f2.getCurrentFragmentManager() : null;
        }
        if (this.f33035a == null || this.g == null || this.f == null) {
            return;
        }
        String str = this.m;
        if (!(str == null || str.length() == 0)) {
            String g = this.f33035a.g();
            if (g == null || g.length() == 0) {
                z = true;
            }
            if (!z) {
                int a2 = com.taobao.pha.core.manifest.e.a().a(Uri.parse(this.f33035a.g()), this.m);
                Bundle bundle = new Bundle();
                bundle.putInt("manifest_uri_hashcode", a2);
                bundle.putString(nfc.PHA_MONITOR_DIMENSION_MANIFEST_URL, this.f33035a.g());
                if (this.h > 0) {
                    this.h = Math.round(this.h * (750.0f / k.a(this.f33035a.o())));
                }
                bundle.putInt("navigationBarHeight", this.h);
                Fragment instantiate = Fragment.instantiate(this.f33035a.o(), PHAFragmentHostNew.class.getName(), bundle);
                if (!(instantiate instanceof PHAFragmentHostNew)) {
                    return;
                }
                PHAFragmentHostNew pHAFragmentHostNew = (PHAFragmentHostNew) instantiate;
                pHAFragmentHostNew.setEventListener(this);
                pHAFragmentHostNew.setDowngradeUrl(com.taobao.themis.kernel.utils.k.u(this.f33035a));
                pHAFragmentHostNew.setPage(this.b);
                Activity o = this.f33035a.o();
                q.b(o, "mInstance.activity");
                pHAFragmentHostNew.setExternalMethodChannel(new b(o, this.b));
                FragmentManager fragmentManager = this.f;
                q.a(fragmentManager);
                fragmentManager.beginTransaction().replace(R.id.pha_fragment_container, instantiate).commitNowAllowingStateLoss();
                this.e = pHAFragmentHostNew.getAppController();
                s sVar = s.f18233a;
                qpm f3 = this.b.f();
                if (f3 != null) {
                    fragment = f3.getCurrentFragment();
                }
                sVar.b(fragment).a("ignoreTinyAppData", (Object) true);
                AppController appController = this.e;
                if (appController == null) {
                    return;
                }
                q.a(appController);
                if (appController.o()) {
                }
                return;
            }
        }
        b(com.taobao.themis.kernel.e.TMS_ERR_ENGINE_MIX_DATA, "manifest异常");
    }

    @Override // tb.qqq
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.d;
    }

    @Override // tb.qqq
    public void a(String event, JSON json) {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8072587d", new Object[]{this, event, json});
            return;
        }
        q.d(event, "event");
        if (this.e == null) {
            return;
        }
        if (json == null) {
            clone = new JSONObject();
        } else if (json instanceof JSONObject) {
            clone = ((JSONObject) json).clone();
        } else {
            clone = json instanceof JSONArray ? ((JSONArray) json).clone() : null;
        }
        String a2 = ngn.a(event, clone, "Triver");
        AppController appController = this.e;
        if (appController == null) {
            return;
        }
        q.a(appController);
        appController.J().evaluateJavaScript(a2);
    }

    @Override // tb.qqn, tb.qqq
    public void b(String event, JSON json) {
        List<nfz> y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("721bfe9c", new Object[]{this, event, json});
            return;
        }
        q.d(event, "event");
        super.b(event, json);
        StringBuilder sb = new StringBuilder();
        sb.append("\n                (function() {\n                    dispatchEvent(new CustomEvent('");
        sb.append(event);
        sb.append("', { detail: ");
        sb.append(json != null ? json.toJSONString() : null);
        sb.append(" }));\n                })()\n            ");
        String sb2 = sb.toString();
        AppController appController = this.e;
        if (appController == null || (y = appController.y()) == null) {
            return;
        }
        for (nfz nfzVar : y) {
            if (nfzVar != null) {
                nfzVar.evaluateJavaScript(sb2);
            }
        }
    }

    @Override // tb.qqn, tb.qqq
    public void a(String target, String event, JSON json) {
        List<nfz> y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578c98f3", new Object[]{this, target, event, json});
            return;
        }
        q.d(target, "target");
        q.d(event, "event");
        super.a(target, event, json);
        StringBuilder sb = new StringBuilder();
        sb.append("\n                (function() {\n                   if (typeof ");
        sb.append(target);
        sb.append(" === 'undefined') {\n                       return;\n                   }\n                   ");
        sb.append(target);
        sb.append(".dispatchEvent(new CustomEvent('");
        sb.append(event);
        sb.append("', { detail: ");
        sb.append(json != null ? json.toJSONString() : null);
        sb.append(" }));\n                })()\n            ");
        String sb2 = sb.toString();
        AppController appController = this.e;
        if (appController == null || (y = appController.y()) == null) {
            return;
        }
        for (nfz nfzVar : y) {
            if (nfzVar != null) {
                nfzVar.evaluateJavaScript(sb2);
            }
        }
    }

    private final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            this.b.b().a(new com.taobao.themis.kernel.e(str, str2, ""));
        }
    }

    @Override // com.taobao.pha.core.e.b
    public void onEvent(e.a aVar) {
        String str;
        qqo qqoVar;
        qqo qqoVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a413d714", new Object[]{this, aVar});
        } else if (aVar == null || (str = aVar.f18737a) == null) {
        } else {
            switch (str.hashCode()) {
                case -17167915:
                    if (str.equals("whitescreen")) {
                    }
                    return;
                case 3584332:
                    if (!str.equals("uct2")) {
                        return;
                    }
                    return;
                case 902341427:
                    if (!str.equals(Constants.Event.PAGESTART) || (qqoVar = this.j) == null) {
                        return;
                    }
                    qqoVar.a();
                    return;
                case 1308176501:
                    if (!str.equals("downgrade") || aVar.c == null || !aVar.c.containsKey("downgradeType")) {
                        return;
                    }
                    Object obj = aVar.c.get("downgradeType");
                    if (q.a(obj, Integer.valueOf(DowngradeType.MANIFEST_DATA_EMPTY.ordinal())) || q.a(obj, Integer.valueOf(DowngradeType.WORKER_LOAD_FAILED.ordinal())) || q.a(obj, Integer.valueOf(DowngradeType.UC_NOT_READY.ordinal())) || q.a(obj, Integer.valueOf(DowngradeType.FRAGMENT_ATTACH_FAILED.ordinal()))) {
                        return;
                    }
                    q.a(obj, Integer.valueOf(DowngradeType.EMPTY_CONTEXT.ordinal()));
                    return;
                case 1997744980:
                    if (!str.equals("pageloaded") || (qqoVar2 = this.j) == null) {
                        return;
                    }
                    qqoVar2.b();
                    return;
                default:
                    return;
            }
        }
    }

    @Override // tb.qqq
    public Bitmap di_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("db94d7df", new Object[]{this});
        }
        if (f.a((ViewGroup) this.d, SurfaceView.class) != null) {
            TMSLogger.d(this.c, "can't get page snapshot due to SurfaceView");
            return null;
        }
        View view = this.d;
        if (view != null) {
            if (f.a((ViewGroup) view, TextureView.class) != null) {
                TMSLogger.d(this.c, "can't get page snapshot due to TextureView");
                return null;
            }
            View view2 = this.d;
            return d.a(view2, view2.getWidth(), this.d.getHeight(), 0, 0);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // tb.qqn, tb.qqq
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        AppController appController = this.e;
        if (appController == null) {
            return;
        }
        appController.onResume();
    }

    @Override // tb.qqn, tb.qqq
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        AppController appController = this.e;
        if (appController == null) {
            return;
        }
        appController.onPause();
    }

    @Override // tb.qqn, tb.qqq
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.a(i, i2, intent);
        AppController appController = this.e;
        if (appController == null) {
            return;
        }
        appController.a(i, i2, intent);
    }

    @Override // tb.qqn, tb.qqq
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        this.f = null;
        n nVar = this.g;
        if (nVar != null) {
            nVar.a((c) null);
        }
        this.g = null;
        AppController appController = this.e;
        if (appController != null) {
            appController.onDestroy();
        }
        this.e = null;
    }
}
