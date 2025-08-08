package com.taobao.tbpoplayer.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.TextureView;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.style.StyleModel;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.f;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.q;
import com.taobao.tbpoplayer.view.jsbridge.PopLayerWeex2Module;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.json.JSONTokener;
import tb.bzt;
import tb.kge;
import tb.qoa;
import tb.sep;

/* loaded from: classes9.dex */
public class PopLayerWeex2View extends PopLayerBaseView<View, d> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEW_TYPE = "weex2";
    public static final String WEEX_TAG_KEY = "PopLayerView";
    private p mInstance;
    private boolean mIsRenderDone;
    private final List<Pair<String, String>> mLostReceivedEvent;
    private long mRenderStartTimeStamp;
    private sep mScreenTypeListener;
    private float mSnapshotScale;
    private TextureView mTextureView;

    static {
        kge.a(200693050);
    }

    public static /* synthetic */ Object ipc$super(PopLayerWeex2View popLayerWeex2View, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1896705494:
                super.syncJumpToUrlInfo((String) objArr[0]);
                return null;
            case -1265876613:
                super.onActivityStart();
                return null;
            case -475248713:
                super.onActivityStop();
                return null;
            case 358419887:
                super.onViewUIAdded();
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

    public static /* synthetic */ boolean access$000(PopLayerWeex2View popLayerWeex2View) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27dda230", new Object[]{popLayerWeex2View})).booleanValue() : popLayerWeex2View.mIsRenderDone;
    }

    public static /* synthetic */ boolean access$002(PopLayerWeex2View popLayerWeex2View, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f888aea", new Object[]{popLayerWeex2View, new Boolean(z)})).booleanValue();
        }
        popLayerWeex2View.mIsRenderDone = z;
        return z;
    }

    public static /* synthetic */ List access$100(PopLayerWeex2View popLayerWeex2View) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("72f00efa", new Object[]{popLayerWeex2View}) : popLayerWeex2View.mLostReceivedEvent;
    }

    public static /* synthetic */ PopRequest access$200(PopLayerWeex2View popLayerWeex2View) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopRequest) ipChange.ipc$dispatch("a597b674", new Object[]{popLayerWeex2View}) : popLayerWeex2View.mPopRequest;
    }

    public static /* synthetic */ long access$300(PopLayerWeex2View popLayerWeex2View) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf8db6a3", new Object[]{popLayerWeex2View})).longValue() : popLayerWeex2View.mRenderStartTimeStamp;
    }

    public static /* synthetic */ p access$400(PopLayerWeex2View popLayerWeex2View) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("6de09dad", new Object[]{popLayerWeex2View}) : popLayerWeex2View.mInstance;
    }

    public static /* synthetic */ void access$500(PopLayerWeex2View popLayerWeex2View, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af970a45", new Object[]{popLayerWeex2View, str, str2});
        } else {
            popLayerWeex2View.closeOnException(str, str2);
        }
    }

    public PopLayerWeex2View(Context context) {
        super(context);
        this.mRenderStartTimeStamp = 0L;
        this.mIsRenderDone = false;
        this.mLostReceivedEvent = new ArrayList();
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void resetContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
            return;
        }
        super.resetContext(context);
        this.mInstance.resetContext(context);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void init(final Context context, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef24561", new Object[]{this, context, dVar});
            return;
        }
        super.init(context, (Context) dVar);
        MUSEngine.initApplicationAsync(PopLayer.getReference().getApp(), new MUSEngine.a() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWeex2View$YoxJa3-yk5O67KBW6BV1LQUseQc
            @Override // com.taobao.android.weex_framework.MUSEngine.a
            public final void afterInitFinished() {
                PopLayerWeex2View.this.lambda$init$46$PopLayerWeex2View(context, dVar);
            }
        });
    }

    public /* synthetic */ void lambda$init$46$PopLayerWeex2View(final Context context, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8c4058", new Object[]{this, context, dVar});
        } else {
            post(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWeex2View$X_S9CB_MHKGrTVzeSSNpBSEoZqI
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeex2View.this.lambda$null$45$PopLayerWeex2View(context, dVar);
                }
            });
        }
    }

    public /* synthetic */ void lambda$null$45$PopLayerWeex2View(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a750f930", new Object[]{this, context, dVar});
        } else {
            doInit(context, dVar);
        }
    }

    private void doInit(Context context, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3933a216", new Object[]{this, context, dVar});
            return;
        }
        try {
            MUSEngine.registerModule("poplayer", PopLayerWeex2Module.class);
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.init", new Object[0]);
            setVisibility(4);
            setUseTouchPointBitmap(false);
            if (com.taobao.tbpoplayer.info.a.a().O()) {
                setUseCacheMark(false);
            }
            long K = com.taobao.tbpoplayer.info.a.a().K();
            if (K < 0) {
                K = 0;
            }
            if (K > 100) {
                K = 100;
            }
            this.mSnapshotScale = ((float) K) / 100.0f;
            String str = dVar.x().params;
            JSONObject jSONObject = !StringUtils.isEmpty(str) ? (JSONObject) new JSONTokener(str).nextValue() : null;
            if (jSONObject == null) {
                closeOnException("PARAMS_PARSE_ERROR", "params=" + dVar.x().params);
                return;
            }
            setPenetrateAlpha((int) (dVar.x().modalThreshold * 255.0d));
            setPopRequest(dVar);
            String optString = jSONObject.optString("url");
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.loadUrl=%s", optString);
            if (StringUtils.isEmpty(optString)) {
                closeOnException("URL_EMPTY", "");
                return;
            }
            this.mScreenTypeListener = new sep(context);
            this.mScreenTypeListener.a(this);
            MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
            mUSInstanceConfig.c(optString);
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
            mUSInstanceConfig.f(false);
            mUSInstanceConfig.d(true);
            mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
            mUSInstanceConfig.a(new f() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWeex2View$T5BEDyFuWwIDHW8HsRQ_jTSPCik
                @Override // com.taobao.android.weex_framework.f
                public final void onCreateView(View view) {
                    PopLayerWeex2View.this.lambda$doInit$47$PopLayerWeex2View(view);
                }
            });
            this.mInstance = q.a().a(context, mUSInstanceConfig);
            this.mInstance.setTag(WEEX_TAG_KEY, this);
            this.mInstance.registerRenderListener(new g() { // from class: com.taobao.tbpoplayer.view.PopLayerWeex2View.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.g
                public void onForeground(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6fafc624", new Object[]{this, pVar});
                    } else {
                        com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onForeground.", new Object[0]);
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onPrepareSuccess(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9635d60b", new Object[]{this, pVar});
                    } else {
                        com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onPrepareSuccess.", new Object[0]);
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRenderSuccess(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                        return;
                    }
                    try {
                        com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onRenderSuccess.", new Object[0]);
                        if (PopLayerWeex2View.access$000(PopLayerWeex2View.this)) {
                            return;
                        }
                        PopLayerWeex2View.access$002(PopLayerWeex2View.this, true);
                        PopLayerWeex2View.this.addInnerView();
                        PopLayerWeex2View.this.showCloseButton(dVar.x().showCloseBtn);
                        if (!PopLayerWeex2View.access$100(PopLayerWeex2View.this).isEmpty()) {
                            for (Pair pair : PopLayerWeex2View.access$100(PopLayerWeex2View.this)) {
                                PopLayerWeex2View.this.onReceiveEvent((String) pair.first, (String) pair.second);
                            }
                        }
                        ((d) PopLayerWeex2View.access$200(PopLayerWeex2View.this)).t().F = String.valueOf(SystemClock.elapsedRealtime() - PopLayerWeex2View.access$300(PopLayerWeex2View.this));
                        View renderRoot = PopLayerWeex2View.access$400(PopLayerWeex2View.this).getRenderRoot();
                        if (renderRoot == null || Build.VERSION.SDK_INT < 16) {
                            return;
                        }
                        renderRoot.setImportantForAccessibility(2);
                    } catch (Throwable th) {
                        com.alibaba.poplayer.utils.c.a("PopLayerWeexView.onRenderSuccess.error.", th);
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRenderFailed(p pVar, int i, String str2, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str2, new Boolean(z)});
                        return;
                    }
                    com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onRenderFailed.type=%s.errorMsg=%s.isFatal=%s", Integer.valueOf(i), str2, Boolean.valueOf(z));
                    PopLayerWeex2View popLayerWeex2View = PopLayerWeex2View.this;
                    PopLayerWeex2View.access$500(popLayerWeex2View, "WEEX2_RENDER_FAIL", "type=" + i + ".errorMsg=" + str2 + ".isFatal=" + z);
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRefreshSuccess(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
                    } else {
                        com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onRefreshSuccess.", new Object[0]);
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRefreshFailed(p pVar, int i, String str2, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str2, new Boolean(z)});
                    } else {
                        com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onRefreshFailed.type=%s.errorMsg=%s.isFatal=%s", Integer.valueOf(i), str2, Boolean.valueOf(z));
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onJSException(p pVar, int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str2});
                    } else {
                        com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onJSException.type=%s.errorMsg=%s", Integer.valueOf(i), str2);
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onFatalException(p pVar, int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str2});
                        return;
                    }
                    com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onFatalException.type=%s.errorMsg=%s", Integer.valueOf(i), str2);
                    PopLayerWeex2View popLayerWeex2View = PopLayerWeex2View.this;
                    PopLayerWeex2View.access$500(popLayerWeex2View, "WEEX2_FATAL_EXCEPTION", "type=" + i + ".errorMsg=" + str2);
                }

                @Override // com.taobao.android.weex_framework.g
                public void onDestroyed(MUSDKInstance mUSDKInstance) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                    } else {
                        com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onDestroyed.", new Object[0]);
                    }
                }
            });
            this.mInstance.initWithURL(Uri.parse(optString));
            this.mInstance.render(getInitData(), null);
            dVar.t().E = String.valueOf(SystemClock.elapsedRealtime() - dVar.t().ak);
            this.mRenderStartTimeStamp = SystemClock.elapsedRealtime();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.preRenderWeex.error.", th);
            closeOnException("RENDER_VIEW_CREATED_RENDER_START_FAIL", "");
        }
    }

    public /* synthetic */ void lambda$doInit$47$PopLayerWeex2View(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0593d1c", new Object[]{this, view});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onCreateView.", new Object[0]);
            if (view == 0) {
                closeOnException("RENDER_VIEW_CREATED_NULL", "weex2RenderOnViewCreatedViewIsNull");
                return;
            }
            if (this.mInnerView != 0) {
                removeView((View) this.mInnerView);
                com.alibaba.poplayer.utils.c.a("PopLayerWeexView.onViewCreated.mInnerView already been added.remove it.", new Object[0]);
            }
            removeCloseButton();
            this.mInnerView = view;
            ((View) this.mInnerView).setClickable(true);
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onViewCreated.done.", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.onViewCreated.error.", th);
        }
    }

    private com.alibaba.fastjson.JSONObject getInitData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("312669f7", new Object[]{this});
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        if (((d) this.mPopRequest).q()) {
            StyleModel styleModel = ((d) this.mPopRequest).x().styleConfigs;
            int parseInt = Integer.parseInt(styleModel.width);
            int parseInt2 = Integer.parseInt(styleModel.height);
            jSONObject.put("widthPx", (Object) Integer.valueOf((int) com.alibaba.poplayer.utils.g.a(getContext(), Float.parseFloat(styleModel.width))));
            jSONObject.put("heightPx", (Object) Integer.valueOf((int) com.alibaba.poplayer.utils.g.a(getContext(), Float.parseFloat(styleModel.height))));
            jSONObject.put("widthRpx", (Object) Integer.valueOf(parseInt));
            jSONObject.put("heightRpx", (Object) Integer.valueOf(parseInt2));
        }
        return jSONObject;
    }

    private void closeOnException(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35293633", new Object[]{this, str, str2});
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWeex2View$nlRH7HEGFkSz2ZOQ_62dHxu9Ngg
                {
                    PopLayerWeex2View.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeex2View.this.lambda$closeOnException$48$PopLayerWeex2View(str, str2);
                }
            };
            if (Looper.myLooper() != Looper.getMainLooper()) {
                post(runnable);
            } else {
                runnable.run();
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.closeOnException error.", th);
        }
    }

    public /* synthetic */ void lambda$closeOnException$48$PopLayerWeex2View(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415ead4e", new Object[]{this, str, str2});
        } else {
            close(OnePopModule.OnePopLoseReasonCode.OnViewErrorClose, String.valueOf(str), String.valueOf(str2), null);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PenetrateFrame
    public Pair<Bitmap, Float> getScaleSnapshotBitMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("280b7c78", new Object[]{this});
        }
        if (this.mTextureView == null) {
            View renderView = this.mInstance.getRenderView();
            if (renderView instanceof TextureView) {
                this.mTextureView = (TextureView) renderView;
            }
        }
        return new Pair<>(this.mTextureView.getBitmap((int) (getWidth() * this.mSnapshotScale), (int) (getHeight() * this.mSnapshotScale)), Float.valueOf(this.mSnapshotScale));
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
            com.alibaba.poplayer.utils.f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWeex2View$GNZX1XcCKKMA3HffjiC7QRnTJfg
                {
                    PopLayerWeex2View.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeex2View.this.lambda$destroyView$49$PopLayerWeex2View();
                }
            });
            this.mInnerView = null;
            removeCloseButton();
            c.a().b(((d) this.mPopRequest).z());
            if (this.mScreenTypeListener == null) {
                return;
            }
            this.mScreenTypeListener.a();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.destroyView.error.", th);
        }
    }

    public /* synthetic */ void lambda$destroyView$49$PopLayerWeex2View() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c1df0e", new Object[]{this});
            return;
        }
        try {
            if (this.mInstance == null) {
                return;
            }
            this.mInstance.destroy();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeexView.destroy.error.", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onViewUIAdded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155d0daf", new Object[]{this});
            return;
        }
        try {
            super.onViewUIAdded();
            if (this.mInstance == null) {
                return;
            }
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onViewUIAdded", new Object[0]);
            this.mInstance.onViewAppear();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("Weex onViewUIAdded error", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        super.onActivityStart();
        com.alibaba.poplayer.utils.f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWeex2View$Obaq7KBkYHwVOcsZPvb-_UAgJLY
            {
                PopLayerWeex2View.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PopLayerWeex2View.this.lambda$onActivityStart$50$PopLayerWeex2View();
            }
        });
    }

    public /* synthetic */ void lambda$onActivityStart$50$PopLayerWeex2View() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb46b2cf", new Object[]{this});
            return;
        }
        try {
            if (this.mInstance == null) {
                return;
            }
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onActivityStart", new Object[0]);
            this.mInstance.onActivityStart();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View onActivityStart error", th);
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
            com.alibaba.poplayer.utils.f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWeex2View$JrWFwSr5EoSXY0YVgDfuFkYOgMI
                {
                    PopLayerWeex2View.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeex2View.this.lambda$onActivityResumed$51$PopLayerWeex2View();
                }
            });
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("Weex onActivityResumed error", th);
        }
    }

    public /* synthetic */ void lambda$onActivityResumed$51$PopLayerWeex2View() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d62b47b", new Object[]{this});
            return;
        }
        try {
            if (this.mInstance == null) {
                return;
            }
            this.mInstance.dispatchEvent(MUSEventTarget.MUS_WINDOW_TARGET, "WV.Event.APP.Active", new com.alibaba.fastjson.JSONObject());
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onActivityResumed.send event:WV.Event.APP.Active", new Object[0]);
            this.mInstance.onActivityResume();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View onActivityResumed error", th);
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
            com.alibaba.poplayer.utils.f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWeex2View$5__hX2wRzgH-8iTMxo7eNpcgXRE
                {
                    PopLayerWeex2View.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeex2View.this.lambda$onActivityPaused$52$PopLayerWeex2View();
                }
            });
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("Weex onActivityPaused error", th);
        }
    }

    public /* synthetic */ void lambda$onActivityPaused$52$PopLayerWeex2View() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c0c78f", new Object[]{this});
            return;
        }
        try {
            if (this.mInstance == null) {
                return;
            }
            this.mInstance.dispatchEvent(MUSEventTarget.MUS_WINDOW_TARGET, "WV.Event.APP.Background", new com.alibaba.fastjson.JSONObject());
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onActivityPaused.send event:WV.Event.APP.Background", new Object[0]);
            this.mInstance.onActivityPause();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View onActivityPaused error", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        try {
            super.onActivityStop();
            com.alibaba.poplayer.utils.f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWeex2View$hjOTBJJPutETjwgRsW5joEiZuak
                {
                    PopLayerWeex2View.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWeex2View.this.lambda$onActivityStop$53$PopLayerWeex2View();
                }
            });
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("Weex onActivityStop error", th);
        }
    }

    public /* synthetic */ void lambda$onActivityStop$53$PopLayerWeex2View() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf3b02fc", new Object[]{this});
            return;
        }
        try {
            if (this.mInstance == null) {
                return;
            }
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onActivityStop", new Object[0]);
            this.mInstance.onActivityStop();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View onActivityStop error", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onReceiveEvent(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12978511", new Object[]{this, str, str2});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onReceiveEvent{%s,%s}.mIsRenderDone=%s", str, str2, Boolean.valueOf(this.mIsRenderDone));
            if (!this.mIsRenderDone) {
                this.mLostReceivedEvent.add(new Pair<>(str, str2));
            } else {
                com.alibaba.poplayer.utils.f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWeex2View$YxzhifIMXbcfeDHn1zDoCTZFAuk
                    {
                        PopLayerWeex2View.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PopLayerWeex2View.this.lambda$onReceiveEvent$54$PopLayerWeex2View(str, str2);
                    }
                });
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View.onReceiveEvent error.", th);
        }
    }

    public /* synthetic */ void lambda$onReceiveEvent$54$PopLayerWeex2View(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2238df8b", new Object[]{this, str, str2});
            return;
        }
        try {
            if (this.mInstance == null) {
                return;
            }
            this.mInstance.dispatchEvent(MUSEventTarget.MUS_WINDOW_TARGET, str, JSON.parseObject(str2));
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWeex2View onReceiveEvent error", th);
        }
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

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public String getNativeNotifyInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58e6e2f5", new Object[]{this});
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        try {
            if (getPopRequest() != null) {
                BaseConfigItem x = getPopRequest().x();
                jSONObject.put("PopTimes", (Object) (bzt.a().a(x.uuid, -1) + ""));
                jSONObject.put("Event", (Object) getPopRequest().y().toString());
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("getNativeNotifyInfo.error.", th);
        }
        return jSONObject.toJSONString();
    }
}
