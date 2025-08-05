package com.taobao.android.artry.arflow;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alipay.zoloz.hardware.camera.preview.utils.SPManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.c;
import com.taobao.android.artry.constants.ResultCode;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import com.taobao.android.nnrruntime.OpenGLUtils;
import com.taobao.android.tb3dspace.artry.ArTryJSFlowMiniAppBundleImpl;
import com.taobao.android.tb3dspace.artry.SetupAREngineLifeListener;
import com.taobao.android.tb3dspace.artry.TryShoeScreenShotCallBack;
import com.taobao.android.tb3dspace.artry.TryShoeScreenShotEventReceiver;
import com.taobao.android.tb3dspace.makeup.XRMakeupView;
import com.taobao.android.tb3dspace.tryshoe.TryShoeView;
import com.taobao.android.tb3dspace.util.TB3DSpace;
import com.taobao.android.tb3dspace.view.ErrorPageView;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import com.taobao.android.xrappos.scene.Scene;
import com.taobao.android.xrappos.threads.SequenceExecutor;
import com.taobao.android.xrappos.v2.view.XRAppOSView;
import com.taobao.android.xrspace.XRSpace;
import com.taobao.cameralink.manager.b;
import com.taobao.cameralink.manager.interfaces.ICLLifeListener;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import tb.cal;
import tb.dpv;
import tb.dqe;
import tb.jyx;
import tb.kge;

/* loaded from: classes4.dex */
public class ARTryJSFlowForMiniApp implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final String f9031a;
    private BroadcastReceiver b;
    private FrameLayout c;
    private Activity d;
    private String g;
    private String j;
    private String k;
    private String l;
    private TryShoeView r;
    private String s;
    private XRMakeupView m = null;
    private int n = -100;
    private Handler t = new Handler(Looper.getMainLooper());
    private c e = null;
    private c f = null;

    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z, ResultCode resultCode);
    }

    /* renamed from: lambda$8K3O-UeSIvVaBOko-jrOFK8HxP0 */
    public static /* synthetic */ void m832lambda$8K3OUeSIvVaBOkojrOFK8HxP0(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, dpv dpvVar) {
        aRTryJSFlowForMiniApp.h(dpvVar);
    }

    /* renamed from: lambda$FbdwtsNXxsGaUQiVY-JU5pZp97I */
    public static /* synthetic */ void m833lambda$FbdwtsNXxsGaUQiVYJU5pZp97I(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        aRTryJSFlowForMiniApp.f();
    }

    public static /* synthetic */ void lambda$GS7GM36XrJHROryQY3EsOh56Evw(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, dpv dpvVar) {
        aRTryJSFlowForMiniApp.g(dpvVar);
    }

    public static /* synthetic */ void lambda$HqUNAFOdZpSnDtRczibn8eBt774(dpv dpvVar, boolean z, JSONObject jSONObject) {
        a(dpvVar, z, jSONObject);
    }

    public static /* synthetic */ void lambda$LoaO87HnPn0K0aCQpZWle5dqID0(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, int i, int i2, int i3, int i4, com.alibaba.fastjson.JSONObject jSONObject, dpv dpvVar) {
        aRTryJSFlowForMiniApp.b(i, i2, i3, i4, jSONObject, dpvVar);
    }

    public static /* synthetic */ void lambda$TwBlzRVOFW3i44LwBeEMBSCdET0(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, int i, int i2, int i3, int i4, com.alibaba.fastjson.JSONObject jSONObject, dpv dpvVar) {
        aRTryJSFlowForMiniApp.a(i, i2, i3, i4, jSONObject, dpvVar);
    }

    public static /* synthetic */ void lambda$_AZl5a9TIOEG8_s7wQHgygmcbgY(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, dpv dpvVar) {
        aRTryJSFlowForMiniApp.f(dpvVar);
    }

    /* renamed from: lambda$fafRa54EoP7q-KDmz0oBmoGAbhk */
    public static /* synthetic */ void m834lambda$fafRa54EoP7qKDmz0oBmoGAbhk(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, dpv dpvVar) {
        aRTryJSFlowForMiniApp.d(dpvVar);
    }

    public static /* synthetic */ void lambda$nIpspEROcxv_r9JxAkvW0wZD0Lg(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, dpv dpvVar) {
        aRTryJSFlowForMiniApp.e(dpvVar);
    }

    /* renamed from: lambda$sfFV1G1u-7TT2wMdwvISnvxYX4E */
    public static /* synthetic */ void m835lambda$sfFV1G1u7TT2wMdwvISnvxYX4E(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        aRTryJSFlowForMiniApp.h();
    }

    /* renamed from: lambda$t8DQ-yuWH-0m-IbcxITDG41LX1s */
    public static /* synthetic */ void m836lambda$t8DQyuWH0mIbcxITDG41LX1s(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        aRTryJSFlowForMiniApp.i();
    }

    public static /* synthetic */ c a(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("5f765447", new Object[]{aRTryJSFlowForMiniApp, cVar});
        }
        aRTryJSFlowForMiniApp.e = cVar;
        return cVar;
    }

    public static /* synthetic */ XRMakeupView a(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, XRMakeupView xRMakeupView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XRMakeupView) ipChange.ipc$dispatch("4f184a87", new Object[]{aRTryJSFlowForMiniApp, xRMakeupView});
        }
        aRTryJSFlowForMiniApp.m = xRMakeupView;
        return xRMakeupView;
    }

    public static /* synthetic */ TryShoeView a(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TryShoeView) ipChange.ipc$dispatch("2ee40d6f", new Object[]{aRTryJSFlowForMiniApp}) : aRTryJSFlowForMiniApp.r;
    }

    public static /* synthetic */ TryShoeView a(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, TryShoeView tryShoeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TryShoeView) ipChange.ipc$dispatch("6f759307", new Object[]{aRTryJSFlowForMiniApp, tryShoeView});
        }
        aRTryJSFlowForMiniApp.r = tryShoeView;
        return tryShoeView;
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f9031a;
    }

    public static /* synthetic */ void a(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, ViewGroup viewGroup, XRAppOSView xRAppOSView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb38275b", new Object[]{aRTryJSFlowForMiniApp, viewGroup, xRAppOSView});
        } else {
            aRTryJSFlowForMiniApp.a(viewGroup, xRAppOSView);
        }
    }

    public static /* synthetic */ void a(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, com.alibaba.fastjson.JSONObject jSONObject, dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e91bea7", new Object[]{aRTryJSFlowForMiniApp, jSONObject, dpvVar});
        } else {
            aRTryJSFlowForMiniApp.e(jSONObject, dpvVar);
        }
    }

    public static /* synthetic */ FrameLayout b(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("548122cb", new Object[]{aRTryJSFlowForMiniApp}) : aRTryJSFlowForMiniApp.c;
    }

    public static /* synthetic */ c b(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("18f2ea08", new Object[]{aRTryJSFlowForMiniApp, cVar});
        }
        aRTryJSFlowForMiniApp.f = cVar;
        return cVar;
    }

    public static /* synthetic */ void b(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, com.alibaba.fastjson.JSONObject jSONObject, dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79d0a28", new Object[]{aRTryJSFlowForMiniApp, jSONObject, dpvVar});
        } else {
            aRTryJSFlowForMiniApp.j(jSONObject, dpvVar);
        }
    }

    public static /* synthetic */ c c(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("8f25a5cd", new Object[]{aRTryJSFlowForMiniApp}) : aRTryJSFlowForMiniApp.e;
    }

    public static /* synthetic */ c d(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("fdacb70e", new Object[]{aRTryJSFlowForMiniApp}) : aRTryJSFlowForMiniApp.f;
    }

    public static /* synthetic */ String e(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8eb6f095", new Object[]{aRTryJSFlowForMiniApp}) : aRTryJSFlowForMiniApp.s;
    }

    public static /* synthetic */ Activity f(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("20bd2a1e", new Object[]{aRTryJSFlowForMiniApp}) : aRTryJSFlowForMiniApp.d;
    }

    public static /* synthetic */ String g(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9053ed97", new Object[]{aRTryJSFlowForMiniApp}) : aRTryJSFlowForMiniApp.l;
    }

    public static /* synthetic */ XRMakeupView h(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (XRMakeupView) ipChange.ipc$dispatch("f4cd4ca", new Object[]{aRTryJSFlowForMiniApp}) : aRTryJSFlowForMiniApp.m;
    }

    static {
        kge.a(1716001642);
        kge.a(1496463527);
        f9031a = ARTryJSFlowForMiniApp.class.getSimpleName();
    }

    public void a(String str, Activity activity, Map<String, String> map, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31a6904", new Object[]{this, str, activity, map, frameLayout});
            return;
        }
        this.c = frameLayout;
        a(str, activity, map);
    }

    public View a(String str, Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e98c1b03", new Object[]{this, str, activity, map});
        }
        this.d = activity;
        this.j = str;
        if (this.c == null) {
            this.c = new FrameLayout(activity.getApplicationContext());
        }
        return this.c;
    }

    @Override // com.taobao.android.artry.arflow.d
    public void a(String str, com.alibaba.fastjson.JSONObject jSONObject, dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02cd3c4", new Object[]{this, str, jSONObject, dpvVar});
        } else if (!TextUtils.equals(str, "applyEffect")) {
        } else {
            b(jSONObject.getString("apiName"), jSONObject.getJSONObject("apiParam"), dpvVar);
        }
    }

    public void b(String str, com.alibaba.fastjson.JSONObject jSONObject, dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8dd7a3", new Object[]{this, str, jSONObject, dpvVar});
        } else if (TextUtils.equals(str, "setupOrUpdateAREngine")) {
            c(jSONObject, dpvVar);
        } else if (TextUtils.equals(str, "fetchPageUrl")) {
            if (dpvVar == null) {
                return;
            }
            dpvVar.a("pageUrl", this.j);
            com.taobao.android.artry.common.c.a(true, (com.taobao.android.artry.common.a) dpvVar);
        } else if (TextUtils.equals(str, "fetchFps")) {
            i(jSONObject, dpvVar);
        } else if (TextUtils.equals(str, "downloadResources")) {
            b(jSONObject, dpvVar);
        } else if (TextUtils.equals(str, "pauseOrResumeARFoundation")) {
            jSONObject.getBooleanValue("active");
        } else if (TextUtils.equals(str, "updateARFrameConfig")) {
            f(jSONObject, dpvVar);
            g(jSONObject, dpvVar);
        } else if (!TextUtils.equals(str, "takeARTryFrameSnapshot")) {
        } else {
            h(jSONObject, dpvVar);
        }
    }

    private void a(ViewGroup viewGroup, XRAppOSView xRAppOSView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce1a88d4", new Object[]{this, viewGroup, xRAppOSView});
        } else if (viewGroup == null || xRAppOSView == null) {
        } else {
            viewGroup.removeView(xRAppOSView);
            xRAppOSView.destroy();
        }
    }

    private void b(com.alibaba.fastjson.JSONObject jSONObject, dpv dpvVar) {
        TryShoeView tryShoeView;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49b75ed", new Object[]{this, jSONObject, dpvVar});
            return;
        }
        try {
            jSONArray = jSONObject.getJSONArray("needDownloadResources");
        } catch (Throwable th) {
            String str = "downloadResources: throwable " + th;
        }
        if (jSONArray != null && jSONArray.size() != 0) {
            String string = jSONArray.getString(0);
            if (string != null && string.endsWith(WeexZipModule.NAME)) {
                return;
            }
            this.s = string;
            if (TextUtils.isEmpty(this.s)) {
                return;
            }
            com.taobao.android.artry.common.c.a(true, (com.taobao.android.artry.common.a) dpvVar);
            if ("AR_SHOE_2".equals(this.l) && (tryShoeView = this.r) != null) {
                tryShoeView.updateNNRPathWithUrl(this.s);
                return;
            } else if ("AR_GLASS".equals(this.l) && this.f != null) {
                if (TextUtils.isEmpty(this.s)) {
                    return;
                }
                this.f.loadModel(this.s, b(a(this.s)));
                return;
            } else if (!"AR_WATCH".equals(this.l) || this.e == null || TextUtils.isEmpty(this.s)) {
                return;
            } else {
                this.e.loadModel(this.s, b(a(this.s)));
                return;
            }
        }
        this.s = "";
    }

    private void j(final com.alibaba.fastjson.JSONObject jSONObject, final dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9057e2e5", new Object[]{this, jSONObject, dpvVar});
            return;
        }
        try {
            List createGraphParamsByJson = ArTryJSFlowMiniAppBundleImpl.createGraphParamsByJson(jSONObject, this.d);
            String string = jSONObject.getString(FluidInstanceAnalysis.KEY_SOURCE);
            if (!TextUtils.equals(string, this.k)) {
                this.k = string;
            }
            if (com.taobao.android.artry.utils.d.a(createGraphParamsByJson)) {
                return;
            }
            ArTryJSFlowMiniAppBundleImpl.createSourceAndViewParam(jSONObject, (b) createGraphParamsByJson.get(createGraphParamsByJson.size() - 1), this.c);
            if (createGraphParamsByJson.size() > 0) {
                b bVar = (b) createGraphParamsByJson.get(0);
                String str = this.l;
                if ((str == null || !str.equals("MAKEUP_ONLY")) && bVar.b != null && bVar.b.equals("MAKEUP_ONLY")) {
                    if ("AR_SHOE_2".equals(this.l)) {
                        this.t.post(new Runnable() { // from class: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            {
                                ARTryJSFlowForMiniApp.this = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this) == null) {
                                } else {
                                    ARTryJSFlowForMiniApp.b(ARTryJSFlowForMiniApp.this).removeView(ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this));
                                    ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this).destroy();
                                    ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this, (TryShoeView) null);
                                }
                            }
                        });
                    }
                    if ("AR_WATCH".equals(this.l)) {
                        this.t.post(new Runnable() { // from class: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.13
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            {
                                ARTryJSFlowForMiniApp.this = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (ARTryJSFlowForMiniApp.c(ARTryJSFlowForMiniApp.this) == null) {
                                } else {
                                    ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp = ARTryJSFlowForMiniApp.this;
                                    ARTryJSFlowForMiniApp.a(aRTryJSFlowForMiniApp, ARTryJSFlowForMiniApp.b(aRTryJSFlowForMiniApp), ARTryJSFlowForMiniApp.c(ARTryJSFlowForMiniApp.this).getXRAppOSView());
                                    ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this, (c) null);
                                }
                            }
                        });
                    }
                    if ("AR_GLASS".equals(this.l)) {
                        this.t.post(new Runnable() { // from class: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.17
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            {
                                ARTryJSFlowForMiniApp.this = this;
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (ARTryJSFlowForMiniApp.d(ARTryJSFlowForMiniApp.this) == null) {
                                } else {
                                    ARTryJSFlowForMiniApp.b(ARTryJSFlowForMiniApp.this).removeView(ARTryJSFlowForMiniApp.d(ARTryJSFlowForMiniApp.this).getXRAppOSView());
                                    ARTryJSFlowForMiniApp.d(ARTryJSFlowForMiniApp.this).destroy();
                                    ARTryJSFlowForMiniApp.b(ARTryJSFlowForMiniApp.this, (c) null);
                                }
                            }
                        });
                    }
                    this.l = bVar.b;
                    this.t.post(new Runnable() { // from class: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.18
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            ARTryJSFlowForMiniApp.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this, jSONObject, dpvVar);
                            }
                        }
                    });
                    return;
                }
                String str2 = this.l;
                if ((str2 == null || str2.equals("MAKEUP_ONLY")) && bVar.b != null && !bVar.b.equals("MAKEUP_ONLY")) {
                    XRMakeupView xRMakeupView = this.m;
                    if (xRMakeupView != null) {
                        xRMakeupView.destroy();
                        FrameLayout frameLayout = this.c;
                        if (frameLayout != null) {
                            frameLayout.removeView(this.m);
                        }
                        this.m = null;
                    }
                    this.l = bVar.b;
                }
            }
            ICLLifeListener setupAREngineLifeListener = new SetupAREngineLifeListener();
            ((SetupAREngineLifeListener) setupAREngineLifeListener).mCallback = dpvVar;
            ((b) createGraphParamsByJson.get(createGraphParamsByJson.size() - 1)).a(setupAREngineLifeListener);
            if (createGraphParamsByJson.size() <= 0) {
                return;
            }
            String str3 = ((b) createGraphParamsByJson.get(0)).b;
            this.l = str3;
            this.t.post(new Runnable() { // from class: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    ARTryJSFlowForMiniApp.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this) != null) {
                        if (ARTryJSFlowForMiniApp.b(ARTryJSFlowForMiniApp.this) != null) {
                            ARTryJSFlowForMiniApp.b(ARTryJSFlowForMiniApp.this).removeView(ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this));
                        }
                        ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this).destroy();
                        ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this, (TryShoeView) null);
                    }
                    if (ARTryJSFlowForMiniApp.c(ARTryJSFlowForMiniApp.this) != null) {
                        ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp = ARTryJSFlowForMiniApp.this;
                        ARTryJSFlowForMiniApp.a(aRTryJSFlowForMiniApp, ARTryJSFlowForMiniApp.b(aRTryJSFlowForMiniApp), ARTryJSFlowForMiniApp.c(ARTryJSFlowForMiniApp.this).getXRAppOSView());
                        ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this, (c) null);
                    }
                    if (ARTryJSFlowForMiniApp.d(ARTryJSFlowForMiniApp.this) == null) {
                        return;
                    }
                    ARTryJSFlowForMiniApp.b(ARTryJSFlowForMiniApp.this).removeView(ARTryJSFlowForMiniApp.d(ARTryJSFlowForMiniApp.this).getXRAppOSView());
                    ARTryJSFlowForMiniApp.d(ARTryJSFlowForMiniApp.this).destroy();
                    ARTryJSFlowForMiniApp.b(ARTryJSFlowForMiniApp.this, (c) null);
                }
            });
            if (str3.equals("AR_SHOE_2")) {
                a(dpvVar);
            }
            if (str3.equals("AR_WATCH")) {
                b(dpvVar);
            }
            if (!"AR_GLASS".equals(str3)) {
                return;
            }
            c(dpvVar);
        } catch (Throwable th) {
            if (dpvVar == null) {
                return;
            }
            dpvVar.a("exceptionDescribe", com.taobao.android.artry.utils.d.a(th));
            com.taobao.android.artry.common.c.a(false, ResultCode.ENGINE_GRAPH_NULL_FROM_WALLE, dpvVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(final com.alibaba.fastjson.JSONObject r8, final tb.dpv r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r2] = r8
            r8 = 2
            r1[r8] = r9
            java.lang.String r8 = "7e13038c"
            r0.ipc$dispatch(r8, r1)
            return
        L18:
            if (r8 == 0) goto L3f
            java.lang.String r0 = "graphParams"
            com.alibaba.fastjson.JSONArray r0 = r8.getJSONArray(r0)     // Catch: java.lang.Throwable -> L3f
            r1 = 0
        L21:
            int r4 = r8.size()     // Catch: java.lang.Throwable -> L40
            if (r3 >= r4) goto L40
            com.alibaba.fastjson.JSONObject r4 = r0.getJSONObject(r3)     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L3c
            java.lang.String r5 = "MAKEUP_ONLY"
            java.lang.String r6 = "graphType"
            java.lang.String r4 = r4.getString(r6)     // Catch: java.lang.Throwable -> L40
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L3c
            r1 = 1
        L3c:
            int r3 = r3 + 1
            goto L21
        L3f:
            r1 = 0
        L40:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "setupOrUpdateAREngine: isMakeUp val "
            r0.append(r2)
            r0.append(r1)
            r0.toString()
            boolean r0 = com.taobao.android.artry.utils.d.c()
            if (r0 != 0) goto L8e
            if (r1 == 0) goto L65
            android.app.Activity r0 = r7.d
            com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp$6 r1 = new com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp$6
            r1.<init>()
            java.lang.String r8 = "TB3DSpace"
            com.taobao.android.artry.arflow.ARTryViewContainer.fetchModular(r0, r8, r1)
            return
        L65:
            android.content.BroadcastReceiver r0 = r7.b
            if (r0 != 0) goto L82
            com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp$7 r0 = new com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp$7
            r0.<init>()
            r7.b = r0
            android.app.Activity r8 = r7.d
            android.support.v4.content.LocalBroadcastManager r8 = android.support.v4.content.LocalBroadcastManager.getInstance(r8)
            android.content.BroadcastReceiver r9 = r7.b
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "TB3DSPACE_INSTALL_SUCCESS"
            r0.<init>(r1)
            r8.registerReceiver(r9, r0)
        L82:
            android.app.Activity r8 = r7.d
            com.taobao.android.nav.Nav r8 = com.taobao.android.nav.Nav.from(r8)
            java.lang.String r9 = "https://go/installxrspace3d"
            r8.toUri(r9)
            return
        L8e:
            r7.j(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.c(com.alibaba.fastjson.JSONObject, tb.dpv):void");
    }

    private void a(final dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59a792e", new Object[]{this, dpvVar});
            return;
        }
        this.s = null;
        if (!TB3DSpace.init3dSpace()) {
            Log.e(f9031a, "tb3dspace init failed");
            h();
            return;
        }
        OpenGLUtils.a(new Runnable() { // from class: com.taobao.android.artry.arflow.-$$Lambda$ARTryJSFlowForMiniApp$GS7GM36XrJHROryQY3EsOh56Evw
            @Override // java.lang.Runnable
            public final void run() {
                ARTryJSFlowForMiniApp.lambda$GS7GM36XrJHROryQY3EsOh56Evw(ARTryJSFlowForMiniApp.this, dpvVar);
            }
        }, new Runnable() { // from class: com.taobao.android.artry.arflow.-$$Lambda$ARTryJSFlowForMiniApp$_AZl5a9TIOEG8_s7wQHgygmcbgY
            @Override // java.lang.Runnable
            public final void run() {
                ARTryJSFlowForMiniApp.lambda$_AZl5a9TIOEG8_s7wQHgygmcbgY(ARTryJSFlowForMiniApp.this, dpvVar);
            }
        });
    }

    public /* synthetic */ void g(final dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7caca034", new Object[]{this, dpvVar});
        } else {
            this.t.post(new Runnable() { // from class: com.taobao.android.artry.arflow.-$$Lambda$ARTryJSFlowForMiniApp$8K3O-UeSIvVaBOko-jrOFK8HxP0
                @Override // java.lang.Runnable
                public final void run() {
                    ARTryJSFlowForMiniApp.m832lambda$8K3OUeSIvVaBOkojrOFK8HxP0(ARTryJSFlowForMiniApp.this, dpvVar);
                }
            });
        }
    }

    public /* synthetic */ void h(dpv dpvVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2fa6b5", new Object[]{this, dpvVar});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        TryShoeView tryShoeView = this.r;
        if (tryShoeView == null) {
            TryShoeView tryShoeView2 = new TryShoeView(this.d, true);
            this.r = tryShoeView2;
            for (int childCount = this.c.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.c.getChildAt(childCount);
                if ((childAt instanceof XRMakeupView) || (childAt instanceof XRAppOSView)) {
                    if (childAt instanceof XRAppOSView) {
                        ((XRAppOSView) childAt).destroy();
                    }
                    this.c.removeView(childAt);
                    g();
                    this.c.addView((View) tryShoeView2, (ViewGroup.LayoutParams) layoutParams);
                    str = this.s;
                    if (str != null && str.endsWith("nnr")) {
                        tryShoeView2.updateNNRPathWithUrl(this.s);
                    }
                }
            }
            this.c.addView((View) tryShoeView2, (ViewGroup.LayoutParams) layoutParams);
            str = this.s;
            if (str != null) {
                tryShoeView2.updateNNRPathWithUrl(this.s);
            }
        } else {
            tryShoeView.resume();
        }
        String[] strArr = {"output_video", "foot_visible"};
        JSONArray jSONArray = new JSONArray(strArr.length);
        jSONArray.addAll(Arrays.asList(strArr));
        if (dpvVar != null) {
            dpvVar.a("supportedDataNameArrayInFrame", jSONArray).a("currentGraphType", "AR_SHOE_2").a("isDownload", "false").a("walleTime", "100").a("sourceDuration", "100").a(jyx.c.POINT_NAME, "100");
        }
        if (!TextUtils.isEmpty("5") && TextUtils.isDigitsOnly("5") && dpvVar != null) {
            dpvVar.a("graphVersion", Integer.valueOf("5"));
        }
        if (!TextUtils.isEmpty(this.g) && dpvVar != null) {
            dpvVar.a("monitorSessionId", this.g);
        }
        com.taobao.android.artry.common.c.a(true, (com.taobao.android.artry.common.a) dpvVar);
    }

    public /* synthetic */ void f(dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e2999b3", new Object[]{this, dpvVar});
            return;
        }
        this.t.post(new Runnable() { // from class: com.taobao.android.artry.arflow.-$$Lambda$ARTryJSFlowForMiniApp$sfFV1G1u-7TT2wMdwvISnvxYX4E
            {
                ARTryJSFlowForMiniApp.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ARTryJSFlowForMiniApp.m835lambda$sfFV1G1u7TT2wMdwvISnvxYX4E(ARTryJSFlowForMiniApp.this);
            }
        });
        com.taobao.android.artry.common.c.a(false, (com.taobao.android.artry.common.a) dpvVar);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar != null) {
            cVar.destroy();
            this.e = null;
        }
        c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.destroy();
            this.f = null;
        }
        XRMakeupView xRMakeupView = this.m;
        if (xRMakeupView == null) {
            return;
        }
        xRMakeupView.destroy();
        this.m = null;
    }

    private void b(final dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41d7faf", new Object[]{this, dpvVar});
            return;
        }
        this.s = null;
        if (!XRSpace.init(this.d)) {
            Log.e(f9031a, "tb3dspace init failed");
            this.t.post(new Runnable() { // from class: com.taobao.android.artry.arflow.-$$Lambda$ARTryJSFlowForMiniApp$t8DQ-yuWH-0m-IbcxITDG41LX1s
                {
                    ARTryJSFlowForMiniApp.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ARTryJSFlowForMiniApp.m836lambda$t8DQyuWH0mIbcxITDG41LX1s(ARTryJSFlowForMiniApp.this);
                }
            });
            com.taobao.android.artry.common.c.a(false, (com.taobao.android.artry.common.a) dpvVar);
            return;
        }
        this.t.post(new Runnable() { // from class: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                ARTryJSFlowForMiniApp.this = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:58:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r4 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.AnonymousClass21.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 1
                    if (r1 == 0) goto L12
                    java.lang.Object[] r1 = new java.lang.Object[r2]
                    r2 = 0
                    r1[r2] = r4
                    java.lang.String r2 = "5c510192"
                    r0.ipc$dispatch(r2, r1)
                    return
                L12:
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    com.taobao.android.artry.c r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.c(r0)
                    if (r0 == 0) goto L33
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    android.widget.FrameLayout r1 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.b(r0)
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    com.taobao.android.artry.c r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.c(r3)
                    com.taobao.android.xrappos.v2.view.XRAppOSView r3 = r3.getXRAppOSView()
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.a(r0, r1, r3)
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    r1 = 0
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.a(r0, r1)
                L33:
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    com.taobao.android.xrspace.artry.impl.ARTryWatchImpl r1 = new com.taobao.android.xrspace.artry.impl.ARTryWatchImpl
                    r1.<init>()
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.a(r0, r1)
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    com.taobao.android.artry.c r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.c(r0)
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r1 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    android.app.Activity r1 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.f(r1)
                    r0.init(r1)
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    android.widget.FrameLayout r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.b(r0)
                    int r0 = r0.getChildCount()
                    int r0 = r0 - r2
                L57:
                    if (r0 < 0) goto L85
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r1 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    android.widget.FrameLayout r1 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.b(r1)
                    android.view.View r1 = r1.getChildAt(r0)
                    boolean r3 = r1 instanceof com.taobao.android.tb3dspace.makeup.XRMakeupView
                    if (r3 != 0) goto L73
                    boolean r3 = r1 instanceof com.taobao.android.xrappos.v2.view.XRAppOSView
                    if (r3 != 0) goto L73
                    boolean r3 = r1 instanceof android.opengl.GLSurfaceView
                    if (r3 == 0) goto L70
                    goto L73
                L70:
                    int r0 = r0 + (-1)
                    goto L57
                L73:
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    android.widget.FrameLayout r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.b(r0)
                    r0.removeView(r1)
                    boolean r0 = r1 instanceof com.taobao.android.xrappos.v2.view.XRAppOSView
                    if (r0 == 0) goto L85
                    com.taobao.android.xrappos.v2.view.XRAppOSView r1 = (com.taobao.android.xrappos.v2.view.XRAppOSView) r1
                    r1.destroy()
                L85:
                    tb.dpv r0 = r2
                    if (r0 == 0) goto L9c
                    java.lang.String r1 = "currentGraphType"
                    java.lang.String r3 = "AR_WATCH"
                    r0.a(r1, r3)
                    tb.dpv r0 = r2
                    r1 = 5
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.lang.String r3 = "graphVersion"
                    r0.a(r3, r1)
                L9c:
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    java.lang.String r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.e(r0)
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto Lc7
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    java.lang.String r1 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.e(r0)
                    java.lang.String r0 = r0.a(r1)
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r1 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    java.lang.String r0 = r1.b(r0)
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r1 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    com.taobao.android.artry.c r1 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.c(r1)
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    java.lang.String r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.e(r3)
                    r1.loadModel(r3, r0)
                Lc7:
                    android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
                    r1 = -1
                    r0.<init>(r1, r1)
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r1 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    android.widget.FrameLayout r1 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.b(r1)
                    com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                    com.taobao.android.artry.c r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.c(r3)
                    com.taobao.android.xrappos.v2.view.XRAppOSView r3 = r3.getXRAppOSView()
                    r1.addView(r3, r0)
                    tb.dpv r0 = r2
                    com.taobao.android.artry.common.c.a(r2, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.AnonymousClass21.run():void");
            }
        });
    }

    public /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar != null) {
            a(this.c, cVar.getXRAppOSView());
            this.e = null;
        }
        h();
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : str.substring(str.lastIndexOf("/") + 1, str.lastIndexOf("."));
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        return "/Uniq/" + str + ".json";
    }

    private void c(final dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a08630", new Object[]{this, dpvVar});
            return;
        }
        this.s = null;
        if (!XRSpace.init(this.d)) {
            Log.e(f9031a, "tb3dspace init failed");
            com.taobao.android.artry.common.c.a(false, (com.taobao.android.artry.common.a) dpvVar);
            this.t.post(new Runnable() { // from class: com.taobao.android.artry.arflow.-$$Lambda$ARTryJSFlowForMiniApp$FbdwtsNXxsGaUQiVY-JU5pZp97I
                {
                    ARTryJSFlowForMiniApp.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ARTryJSFlowForMiniApp.m833lambda$FbdwtsNXxsGaUQiVYJU5pZp97I(ARTryJSFlowForMiniApp.this);
                }
            });
            return;
        }
        this.t.post(new Runnable() { // from class: com.taobao.android.artry.arflow.-$$Lambda$ARTryJSFlowForMiniApp$nIpspEROcxv_r9JxAkvW0wZD0Lg
            @Override // java.lang.Runnable
            public final void run() {
                ARTryJSFlowForMiniApp.lambda$nIpspEROcxv_r9JxAkvW0wZD0Lg(ARTryJSFlowForMiniApp.this, dpvVar);
            }
        });
    }

    public /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        c cVar = this.f;
        if (cVar != null) {
            this.c.removeView(cVar.getXRAppOSView());
            this.f.destroy();
            this.f = null;
        }
        for (int childCount = this.c.getChildCount() - 1; childCount >= 0; childCount--) {
            XRAppOSView childAt = this.c.getChildAt(childCount);
            if ((childAt instanceof XRMakeupView) || (childAt instanceof XRAppOSView)) {
                if (childAt instanceof XRAppOSView) {
                    childAt.destroy();
                }
                this.c.removeView(childAt);
                h();
            }
        }
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void e(tb.dpv r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r5 = "9fa69332"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            com.taobao.android.artry.c r0 = r4.f
            if (r0 == 0) goto L27
            android.widget.FrameLayout r1 = r4.c
            com.taobao.android.xrappos.v2.view.XRAppOSView r0 = r0.getXRAppOSView()
            r1.removeView(r0)
            com.taobao.android.artry.c r0 = r4.f
            r0.destroy()
        L27:
            com.taobao.android.xrspace.artry.impl.ARTryGlassImpl r0 = new com.taobao.android.xrspace.artry.impl.ARTryGlassImpl
            r0.<init>()
            r4.f = r0
            com.taobao.android.artry.c r0 = r4.f
            android.app.Activity r1 = r4.d
            r0.init(r1)
            android.widget.FrameLayout r0 = r4.c
            int r0 = r0.getChildCount()
            int r0 = r0 - r2
        L3c:
            if (r0 < 0) goto L5e
            android.widget.FrameLayout r1 = r4.c
            android.view.View r1 = r1.getChildAt(r0)
            boolean r3 = r1 instanceof com.taobao.android.tb3dspace.makeup.XRMakeupView
            if (r3 != 0) goto L50
            boolean r3 = r1 instanceof com.taobao.android.xrappos.v2.view.XRAppOSView
            if (r3 == 0) goto L4d
            goto L50
        L4d:
            int r0 = r0 + (-1)
            goto L3c
        L50:
            android.widget.FrameLayout r0 = r4.c
            r0.removeView(r1)
            boolean r0 = r1 instanceof com.taobao.android.xrappos.v2.view.XRAppOSView
            if (r0 == 0) goto L5e
            com.taobao.android.xrappos.v2.view.XRAppOSView r1 = (com.taobao.android.xrappos.v2.view.XRAppOSView) r1
            r1.destroy()
        L5e:
            if (r5 == 0) goto L71
            java.lang.String r0 = "currentGraphType"
            java.lang.String r1 = "AR_GLASS"
            r5.a(r0, r1)
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "graphVersion"
            r5.a(r1, r0)
        L71:
            java.lang.String r0 = r4.s
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L8a
            java.lang.String r0 = r4.s
            java.lang.String r0 = r4.a(r0)
            java.lang.String r0 = r4.b(r0)
            com.taobao.android.artry.c r1 = r4.f
            java.lang.String r3 = r4.s
            r1.loadModel(r3, r0)
        L8a:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            android.widget.FrameLayout r1 = r4.c
            com.taobao.android.artry.c r3 = r4.f
            com.taobao.android.xrappos.v2.view.XRAppOSView r3 = r3.getXRAppOSView()
            r1.addView(r3, r0)
            com.taobao.android.artry.common.c.a(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.e(tb.dpv):void");
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        View errorPageView = new ErrorPageView(this.d);
        Button refreshButton = errorPageView.getRefreshButton();
        if (refreshButton != null) {
            refreshButton.setVisibility(8);
        }
        TextView tipText = errorPageView.getTipText();
        if (tipText != null) {
            tipText.setText("当前机型不支持该功能");
        }
        this.c.addView(errorPageView, new FrameLayout.LayoutParams(-1, -1));
    }

    private void d(final com.alibaba.fastjson.JSONObject jSONObject, final dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("378a912b", new Object[]{this, jSONObject, dpvVar});
            return;
        }
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject("arViewParam");
        final int intValue = jSONObject2.getIntValue("arViewLeft");
        final int intValue2 = jSONObject2.getIntValue("arViewTop");
        final int intValue3 = jSONObject2.getIntValue("arViewWidth");
        final int intValue4 = jSONObject2.getIntValue("arViewHeight");
        if (this.m == null) {
            this.m = new XRMakeupView(this.d);
        }
        TB3DSpace.initMakeUp(new Runnable() { // from class: com.taobao.android.artry.arflow.-$$Lambda$ARTryJSFlowForMiniApp$TwBlzRVOFW3i44LwBeEMBSCdET0
            @Override // java.lang.Runnable
            public final void run() {
                ARTryJSFlowForMiniApp.lambda$TwBlzRVOFW3i44LwBeEMBSCdET0(ARTryJSFlowForMiniApp.this, intValue, intValue2, intValue3, intValue4, jSONObject, dpvVar);
            }
        }, new Runnable() { // from class: com.taobao.android.artry.arflow.-$$Lambda$ARTryJSFlowForMiniApp$fafRa54EoP7q-KDmz0oBmoGAbhk
            @Override // java.lang.Runnable
            public final void run() {
                ARTryJSFlowForMiniApp.m834lambda$fafRa54EoP7qKDmz0oBmoGAbhk(ARTryJSFlowForMiniApp.this, dpvVar);
            }
        });
    }

    public /* synthetic */ void a(final int i, final int i2, final int i3, final int i4, final com.alibaba.fastjson.JSONObject jSONObject, final dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1adc8b8e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), jSONObject, dpvVar});
        } else {
            dqe.a().post(new Runnable() { // from class: com.taobao.android.artry.arflow.-$$Lambda$ARTryJSFlowForMiniApp$LoaO87HnPn0K0aCQpZWle5dqID0
                @Override // java.lang.Runnable
                public final void run() {
                    ARTryJSFlowForMiniApp.lambda$LoaO87HnPn0K0aCQpZWle5dqID0(ARTryJSFlowForMiniApp.this, i, i2, i3, i4, jSONObject, dpvVar);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void b(int r16, int r17, int r18, int r19, com.alibaba.fastjson.JSONObject r20, final tb.dpv r21) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            r14 = 0
            if (r2 == 0) goto L45
            r2 = 7
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r14] = r0
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r8)
            r2[r3] = r4
            r3 = 2
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r9)
            r2[r3] = r4
            r3 = 3
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r10)
            r2[r3] = r4
            r3 = 4
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r11)
            r2[r3] = r4
            r3 = 5
            r2[r3] = r12
            r3 = 6
            r2[r3] = r13
            java.lang.String r3 = "c8631ad"
            r1.ipc$dispatch(r3, r2)
            return
        L45:
            android.widget.FrameLayout r1 = r0.c
            int r1 = r1.getChildCount()
            int r1 = r1 - r3
        L4c:
            if (r1 < 0) goto L6e
            android.widget.FrameLayout r2 = r0.c
            android.view.View r2 = r2.getChildAt(r1)
            boolean r3 = r2 instanceof com.taobao.android.tb3dspace.makeup.XRMakeupView
            if (r3 != 0) goto L60
            boolean r3 = r2 instanceof com.taobao.android.xrappos.v2.view.XRAppOSView
            if (r3 == 0) goto L5d
            goto L60
        L5d:
            int r1 = r1 + (-1)
            goto L4c
        L60:
            android.widget.FrameLayout r1 = r0.c
            r1.removeView(r2)
            boolean r1 = r2 instanceof com.taobao.android.xrappos.v2.view.XRAppOSView
            if (r1 == 0) goto L6e
            com.taobao.android.xrappos.v2.view.XRAppOSView r2 = (com.taobao.android.xrappos.v2.view.XRAppOSView) r2
            r2.destroy()
        L6e:
            com.taobao.android.tb3dspace.makeup.XRMakeupView r1 = r0.m
            android.widget.FrameLayout r2 = r0.c
            r7 = 0
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r1.realAdd(r2, r3, r4, r5, r6, r7)
            r1 = -1
            if (r10 > 0) goto L82
            r10 = -1
        L82:
            if (r11 > 0) goto L85
            r11 = -1
        L85:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r10, r11)
            if (r8 >= 0) goto L8d
            r8 = 0
        L8d:
            r1.leftMargin = r8
            if (r9 >= 0) goto L92
            r9 = 0
        L92:
            r1.topMargin = r9
            com.taobao.android.tb3dspace.makeup.XRMakeupView r2 = r0.m
            r2.setLayoutParams(r1)
            com.taobao.android.tb3dspace.makeup.XRMakeupView r1 = r0.m
            com.taobao.android.artry.arflow.-$$Lambda$ARTryJSFlowForMiniApp$HqUNAFOdZpSnDtRczibn8eBt774 r2 = new com.taobao.android.artry.arflow.-$$Lambda$ARTryJSFlowForMiniApp$HqUNAFOdZpSnDtRczibn8eBt774
            r2.<init>()
            r1.setup(r12, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.b(int, int, int, int, com.alibaba.fastjson.JSONObject, tb.dpv):void");
    }

    public static /* synthetic */ void a(dpv dpvVar, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca578e18", new Object[]{dpvVar, new Boolean(z), jSONObject});
        } else if (dpvVar == null) {
        } else {
            dpvVar.a("currentGraphType", "MAKEUP_ONLY");
            dpvVar.a("graphVersion", (Object) 2);
            dpvVar.a("isDownload", (Object) 0);
            try {
                com.taobao.android.artry.common.c.a(z, ResultCode.values()[Integer.parseInt(jSONObject.getString("code"))], dpvVar);
            } catch (Throwable unused) {
            }
        }
    }

    public /* synthetic */ void d(dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1238cb1", new Object[]{this, dpvVar});
            return;
        }
        for (int childCount = this.c.getChildCount() - 1; childCount >= 0; childCount--) {
            XRAppOSView childAt = this.c.getChildAt(childCount);
            if ((childAt instanceof XRMakeupView) || (childAt instanceof XRAppOSView)) {
                this.c.removeView(childAt);
                if (childAt instanceof XRAppOSView) {
                    childAt.destroy();
                }
                h();
                com.taobao.android.artry.common.c.a(false, (com.taobao.android.artry.common.a) dpvVar);
            }
        }
        h();
        com.taobao.android.artry.common.c.a(false, (com.taobao.android.artry.common.a) dpvVar);
    }

    private void e(com.alibaba.fastjson.JSONObject jSONObject, dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1021eca", new Object[]{this, jSONObject, dpvVar});
        } else {
            d(jSONObject, dpvVar);
        }
    }

    private void f(com.alibaba.fastjson.JSONObject jSONObject, final dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa79ac69", new Object[]{this, jSONObject, dpvVar});
        } else if (!com.taobao.android.artry.utils.d.c()) {
        } else {
            final com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject("effectConfigArray");
            if (com.taobao.android.artry.utils.d.a((Map) jSONObject2)) {
                com.taobao.android.artry.common.c.a(true, (com.taobao.android.artry.common.a) dpvVar);
                return;
            }
            final Set<String> keySet = jSONObject2.keySet();
            SequenceExecutor.getInstance().post(new Runnable() { // from class: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.22
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    ARTryJSFlowForMiniApp.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    char[] cArr;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    boolean z = ARTryJSFlowForMiniApp.g(ARTryJSFlowForMiniApp.this) != null && ARTryJSFlowForMiniApp.g(ARTryJSFlowForMiniApp.this).equals("MAKEUP_ONLY");
                    if ("AR_SHOE_2".equals(ARTryJSFlowForMiniApp.g(ARTryJSFlowForMiniApp.this))) {
                        com.taobao.android.artry.common.c.a(true, (com.taobao.android.artry.common.a) dpvVar);
                        return;
                    }
                    for (String str : keySet) {
                        if (!z || str.equals("LIPSTICK")) {
                            try {
                                JSONArray jSONArray = jSONObject2.getJSONArray(str);
                                cArr = new char[jSONArray.size()];
                                for (int i = 0; i < cArr.length; i++) {
                                    cArr[i] = (char) jSONArray.getIntValue(i);
                                }
                            } catch (Throwable unused) {
                                Log.e(ARTryJSFlowForMiniApp.a(), "failed to parse flat buffer binary array...");
                                cArr = null;
                            }
                            if (cArr != null && z && str.equals("LIPSTICK")) {
                                ARTryJSFlowForMiniApp.h(ARTryJSFlowForMiniApp.this).applyLipstickConfig(ARTryJSFlowForMiniApp.h(ARTryJSFlowForMiniApp.this).convertLipstickConfigWithFlatBuffer(cArr));
                                return;
                            }
                        }
                    }
                    com.taobao.android.artry.common.c.a(true, (com.taobao.android.artry.common.a) dpvVar);
                }
            });
        }
    }

    private void g(com.alibaba.fastjson.JSONObject jSONObject, dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f13a08", new Object[]{this, jSONObject, dpvVar});
            return;
        }
        String str = this.l;
        if ((str != null && str.equals("MAKEUP_ONLY")) || "AR_SHOE_2".equals(this.l)) {
            return;
        }
        com.alibaba.fastjson.JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            jSONObject2 = jSONObject.getJSONObject("arFrameItems");
        }
        if (jSONObject2 == null) {
        }
    }

    private void h(com.alibaba.fastjson.JSONObject jSONObject, final dpv dpvVar) {
        c cVar;
        c cVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d68c7a7", new Object[]{this, jSONObject, dpvVar});
            return;
        }
        String str = this.l;
        if (str != null && str.equals("MAKEUP_ONLY")) {
            XRMakeupView xRMakeupView = this.m;
            if (xRMakeupView == null) {
                com.taobao.android.artry.common.c.a(false, ResultCode.FAILURE_INTERNAL, dpvVar);
            } else {
                xRMakeupView.takePicture(new cal() { // from class: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        ARTryJSFlowForMiniApp.this = this;
                    }

                    @Override // tb.cal
                    public void onComplete(boolean z, JSONObject jSONObject2) {
                        IpChange ipChange2 = $ipChange;
                        int i = 0;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8f409ee9", new Object[]{this, new Boolean(z), jSONObject2});
                            return;
                        }
                        if (jSONObject2 != null && jSONObject2.has("snapshotInfo")) {
                            try {
                                dpvVar.a("snapshotInfo", jSONObject2.get("snapshotInfo"));
                            } catch (JSONException unused) {
                            }
                        }
                        try {
                            i = Integer.parseInt(jSONObject2.getString("code"));
                        } catch (Throwable unused2) {
                        }
                        com.taobao.android.artry.common.c.a(z, ResultCode.values()[i], dpvVar);
                    }
                });
            }
        } else if ("AR_SHOE_2".equals(this.l)) {
            this.r.getScreenShot(new TryShoeScreenShotCallBack(this.d, dpvVar, jSONObject.getString("uploadBizId"), jSONObject.getBooleanValue("needBase64Output"), jSONObject.getBooleanValue("needUploadPicture")));
        } else if (!"AR_WATCH".equals(this.l) && !"AR_GLASS".equals(this.l)) {
        } else {
            boolean booleanValue = jSONObject.getBooleanValue("needUploadPicture");
            boolean booleanValue2 = jSONObject.getBooleanValue("needBase64Output");
            String string = jSONObject.getString("uploadBizId");
            Scene scene = null;
            if ("AR_WATCH".equals(this.l) && (cVar2 = this.e) != null) {
                scene = cVar2.getScene();
            } else if ("AR_GLASS".equals(this.l) && (cVar = this.f) != null) {
                scene = cVar.getScene();
            }
            if (scene == null || scene.isExpired()) {
                com.taobao.android.artry.common.c.a(false, ResultCode.FAILURE_TAKE_PICTURE_ERROR, dpvVar);
            } else if (scene == null) {
            } else {
                scene.setEventReceiver(new TryShoeScreenShotEventReceiver(booleanValue2, booleanValue, dpvVar, this.d, string));
                scene.takeScreenshot(0);
            }
        }
    }

    private void i(com.alibaba.fastjson.JSONObject jSONObject, dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e05546", new Object[]{this, jSONObject, dpvVar});
        } else if (dpvVar == null) {
        } else {
            dpvVar.a(SPManager.FPS_KEY, Float.valueOf(0.0f));
            com.taobao.android.artry.common.c.a(true, (com.taobao.android.artry.common.a) dpvVar);
        }
    }

    @Override // com.taobao.android.artry.arflow.d
    public void b() {
        TryShoeView tryShoeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String str = this.l;
        if (str != null && str.equals("MAKEUP_ONLY")) {
            XRMakeupView xRMakeupView = this.m;
            if (xRMakeupView == null) {
                return;
            }
            xRMakeupView.resume();
        } else if (!"AR_SHOE_2".equals(this.l) || (tryShoeView = this.r) == null) {
        } else {
            tryShoeView.resume();
        }
    }

    @Override // com.taobao.android.artry.arflow.d
    public void c() {
        TryShoeView tryShoeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String str = this.l;
        if (str != null && str.equals("MAKEUP_ONLY")) {
            XRMakeupView xRMakeupView = this.m;
            if (xRMakeupView == null) {
                return;
            }
            xRMakeupView.pause();
        } else if (!"AR_SHOE_2".equals(this.l) || (tryShoeView = this.r) == null) {
        } else {
            tryShoeView.pause();
        }
    }

    @Override // com.taobao.android.artry.arflow.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.t.post(new Runnable() { // from class: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                ARTryJSFlowForMiniApp.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this) != null) {
                    if (ARTryJSFlowForMiniApp.b(ARTryJSFlowForMiniApp.this) != null) {
                        ARTryJSFlowForMiniApp.b(ARTryJSFlowForMiniApp.this).removeView(ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this));
                    }
                    ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this).destroy();
                    ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this, (TryShoeView) null);
                }
                if (ARTryJSFlowForMiniApp.c(ARTryJSFlowForMiniApp.this) != null) {
                    ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp = ARTryJSFlowForMiniApp.this;
                    ARTryJSFlowForMiniApp.a(aRTryJSFlowForMiniApp, ARTryJSFlowForMiniApp.b(aRTryJSFlowForMiniApp), ARTryJSFlowForMiniApp.c(ARTryJSFlowForMiniApp.this).getXRAppOSView());
                    ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this, (c) null);
                }
                if (ARTryJSFlowForMiniApp.d(ARTryJSFlowForMiniApp.this) != null) {
                    ARTryJSFlowForMiniApp.b(ARTryJSFlowForMiniApp.this).removeView(ARTryJSFlowForMiniApp.d(ARTryJSFlowForMiniApp.this).getXRAppOSView());
                    ARTryJSFlowForMiniApp.d(ARTryJSFlowForMiniApp.this).destroy();
                    ARTryJSFlowForMiniApp.b(ARTryJSFlowForMiniApp.this, (c) null);
                }
                if (ARTryJSFlowForMiniApp.g(ARTryJSFlowForMiniApp.this) == null || !ARTryJSFlowForMiniApp.g(ARTryJSFlowForMiniApp.this).equals("MAKEUP_ONLY") || ARTryJSFlowForMiniApp.h(ARTryJSFlowForMiniApp.this) == null) {
                    return;
                }
                ARTryJSFlowForMiniApp.h(ARTryJSFlowForMiniApp.this).destroy();
                if (ARTryJSFlowForMiniApp.b(ARTryJSFlowForMiniApp.this) != null) {
                    ARTryJSFlowForMiniApp.b(ARTryJSFlowForMiniApp.this).removeView(ARTryJSFlowForMiniApp.h(ARTryJSFlowForMiniApp.this));
                }
                ARTryJSFlowForMiniApp.a(ARTryJSFlowForMiniApp.this, (XRMakeupView) null);
            }
        });
        if (this.b == null) {
            return;
        }
        LocalBroadcastManager.getInstance(this.d).unregisterReceiver(this.b);
    }

    public void a(com.alibaba.fastjson.JSONObject jSONObject, final dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23e84e", new Object[]{this, jSONObject, dpvVar});
            return;
        }
        String str = this.l;
        if (str == null || !str.equals("MAKEUP_ONLY")) {
            return;
        }
        XRMakeupView xRMakeupView = this.m;
        if (xRMakeupView == null) {
            com.taobao.android.artry.common.c.a(false, ResultCode.FAILURE_INTERNAL, dpvVar);
        } else {
            xRMakeupView.applyEffect(jSONObject, new cal() { // from class: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    ARTryJSFlowForMiniApp.this = this;
                }

                @Override // tb.cal
                public void onComplete(boolean z, JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f409ee9", new Object[]{this, new Boolean(z), jSONObject2});
                    } else if (jSONObject2 == null) {
                    } else {
                        try {
                            com.taobao.android.artry.common.c.a(z, ResultCode.values()[Integer.parseInt(jSONObject2.getString("code"))], dpvVar);
                        } catch (Throwable th) {
                            ARTryJSFlowForMiniApp.a();
                            String str2 = "onComplete: e " + th;
                        }
                    }
                }
            });
        }
    }

    public void e() {
        XRMakeupView xRMakeupView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String str = this.l;
        if (str == null || !str.equals("MAKEUP_ONLY") || (xRMakeupView = this.m) == null) {
            return;
        }
        xRMakeupView.clearAllEffect();
    }
}
