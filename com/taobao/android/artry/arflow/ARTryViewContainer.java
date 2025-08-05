package com.taobao.android.artry.arflow;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.splitinstall.o;
import com.alibaba.android.split.core.tasks.e;
import com.alibaba.android.split.k;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp;
import com.taobao.android.artry.common.a;
import com.taobao.android.artry.common.c;
import com.taobao.android.artry.constants.ResultCode;
import com.taobao.android.mnncv.MNNCV;
import com.taobao.android.tb3dspace.makeup.XRMakeupView;
import com.taobao.android.tb3dspace.util.TB3DSpace;
import com.taobao.tao.TaoPackageInfo;
import tb.cal;
import tb.dpv;
import tb.dpx;
import tb.kge;

/* loaded from: classes4.dex */
public class ARTryViewContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ARTryViewContainer";
    private static int mSessionId;
    private static o mSplitInstallStateUpdatedListener;
    private ARTryJSFlowForMiniApp mARTryJSFlowForMiniApp;
    private String mBizUrl;
    private String mCurrentGraphType;
    private boolean mForbidSimplestGraph;
    private boolean mInitARSimplestGraph;
    private long mSimpleGraphStartDuration;
    private long mSimpleGraphStartStartLoadingTime;

    /* renamed from: com.taobao.android.artry.arflow.ARTryViewContainer$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static class AnonymousClass2 implements ARTryJSFlowForMiniApp.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f9044a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ dpv c;

        public AnonymousClass2(Context context, JSONObject jSONObject, dpv dpvVar) {
            this.f9044a = context;
            this.b = jSONObject;
            this.c = dpvVar;
        }

        @Override // com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.a
        public void a(boolean z, ResultCode resultCode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bf1133", new Object[]{this, new Boolean(z), resultCode});
            } else if (z) {
                TB3DSpace.initMakeUp(new Runnable() { // from class: com.taobao.android.artry.arflow.ARTryViewContainer.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        MNNCV.init(AnonymousClass2.this.f9044a);
                        XRMakeupView.downloadResources(AnonymousClass2.this.b, new cal() { // from class: com.taobao.android.artry.arflow.ARTryViewContainer.2.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.cal
                            public void onComplete(boolean z2, org.json.JSONObject jSONObject) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("8f409ee9", new Object[]{this, new Boolean(z2), jSONObject});
                                    return;
                                }
                                AnonymousClass2.this.c.a("info", jSONObject);
                                c.a(z2, z2 ? ResultCode.SUCCESS : ResultCode.CV_ALGORITHM_ERROR, AnonymousClass2.this.c);
                            }
                        });
                    }
                }, new Runnable() { // from class: com.taobao.android.artry.arflow.ARTryViewContainer.2.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            c.a(false, ResultCode.ENGINE_FAILED_LOAD_SO, AnonymousClass2.this.c);
                        }
                    }
                });
            } else {
                c.a(false, ResultCode.ENGINE_SO_DOWNLOAD_ERROR, this.c);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(ARTryViewContainer aRTryViewContainer, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue() : mSessionId;
    }

    public static /* synthetic */ int access$002(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550b9d", new Object[]{new Integer(i)})).intValue();
        }
        mSessionId = i;
        return i;
    }

    static {
        kge.a(-129709110);
        mSessionId = -100;
    }

    public ARTryViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInitARSimplestGraph = false;
        this.mForbidSimplestGraph = true;
        this.mSimpleGraphStartDuration = -1L;
        this.mSimpleGraphStartStartLoadingTime = -1L;
    }

    public ARTryViewContainer(Activity activity, String str) {
        super(activity.getApplicationContext());
        this.mInitARSimplestGraph = false;
        this.mForbidSimplestGraph = true;
        this.mSimpleGraphStartDuration = -1L;
        this.mSimpleGraphStartStartLoadingTime = -1L;
        setBizUrl(str);
        init(activity);
    }

    public void init(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1470fda9", new Object[]{this, activity});
            return;
        }
        this.mARTryJSFlowForMiniApp = new ARTryJSFlowForMiniApp();
        this.mARTryJSFlowForMiniApp.a(this.mBizUrl, activity, null, this);
        if (this.mForbidSimplestGraph) {
            return;
        }
        this.mInitARSimplestGraph = true;
    }

    public void forbidSimplestGraph(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de54946", new Object[]{this, new Boolean(z)});
        } else {
            this.mForbidSimplestGraph = z;
        }
    }

    public void setBizUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1daa6f", new Object[]{this, str});
        } else {
            this.mBizUrl = str;
        }
    }

    public boolean setupAREngine(JSONObject jSONObject, dpx dpxVar) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84be9681", new Object[]{this, jSONObject, dpxVar})).booleanValue();
        }
        dpv dpvVar = new dpv();
        dpvVar.a(dpxVar);
        if (jSONObject != null && jSONObject.getJSONArray("graphParams") != null && (jSONArray = jSONObject.getJSONArray("graphParams")) != null && jSONArray.size() > 0) {
            this.mCurrentGraphType = jSONArray.getJSONObject(0).getString("graphType");
        }
        return onAction("setupOrUpdateAREngine", jSONObject, dpvVar);
    }

    public boolean applyAREffect(JSONObject jSONObject, dpx dpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("956d741", new Object[]{this, jSONObject, dpxVar})).booleanValue();
        }
        if (this.mARTryJSFlowForMiniApp == null) {
            return false;
        }
        dpv dpvVar = new dpv();
        dpvVar.a(dpxVar);
        String str = this.mCurrentGraphType;
        if (str != null && str.equals("MAKEUP_ONLY")) {
            this.mARTryJSFlowForMiniApp.a(jSONObject, dpvVar);
        }
        return true;
    }

    public boolean clearAllEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("273e6cd0", new Object[]{this})).booleanValue();
        }
        if (this.mARTryJSFlowForMiniApp == null) {
            return false;
        }
        String str = this.mCurrentGraphType;
        if (str != null && str.equals("MAKEUP_ONLY")) {
            this.mARTryJSFlowForMiniApp.e();
        }
        return true;
    }

    private boolean onAction(String str, JSONObject jSONObject, dpv dpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6e43cb4", new Object[]{this, str, jSONObject, dpvVar})).booleanValue();
        }
        if (this.mARTryJSFlowForMiniApp == null) {
            return false;
        }
        if (TextUtils.equals(str, "fetchSimpleGraphLoadingDuration")) {
            dpvVar.a("simpleGraphLoadingDuration", Long.valueOf(this.mSimpleGraphStartDuration));
            c.a(true, (a) dpvVar);
            return true;
        }
        this.mARTryJSFlowForMiniApp.b(str, jSONObject, dpvVar);
        return true;
    }

    public void takePicture(dpx dpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d07ddb02", new Object[]{this, dpxVar});
        } else {
            captureScreenshot(false, false, null, dpxVar);
        }
    }

    public static void downloadResources(Context context, JSONObject jSONObject, final dpx dpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c77930", new Object[]{context, jSONObject, dpxVar});
            return;
        }
        dpv dpvVar = new dpv();
        dpvVar.a(new dpx() { // from class: com.taobao.android.artry.arflow.ARTryViewContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dpx
            public void a(boolean z, JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject2});
                    return;
                }
                dpx dpxVar2 = dpx.this;
                if (dpxVar2 == null) {
                    return;
                }
                dpxVar2.a(z, jSONObject2);
            }
        });
        fetchModular(context, "TB3DSpace", new AnonymousClass2(context, jSONObject, dpvVar));
    }

    public static void fetchModular(Context context, final String str, final ARTryJSFlowForMiniApp.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f6ee5f", new Object[]{context, str, aVar});
            return;
        }
        String str2 = TaoPackageInfo.sTTID;
        String str3 = "process: " + str2;
        if ("TB3DSpace".equals(str) && "212200".equals(str2)) {
            if (aVar == null) {
                return;
            }
            aVar.a(true, ResultCode.SUCCESS);
            return;
        }
        g c = com.taobao.appbundle.c.Companion.a().c();
        if (c == null) {
            if (aVar == null) {
                return;
            }
            aVar.a(false, ResultCode.FAILURE_INTERNAL);
            return;
        }
        try {
            k.a().a(context, false, str);
            if (b.a().c(str) != null && c.a().contains(str)) {
                String str4 = "模块已经安装完成：" + str;
                if (aVar == null) {
                    return;
                }
                aVar.a(true, ResultCode.SUCCESS);
                return;
            }
            mSplitInstallStateUpdatedListener = new o() { // from class: com.taobao.android.artry.arflow.ARTryViewContainer.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.listener.b
                public /* synthetic */ void onStateUpdate(m mVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
                    } else {
                        a(mVar);
                    }
                }

                public void a(m mVar) {
                    int b;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("398f1780", new Object[]{this, mVar});
                        return;
                    }
                    mVar.g();
                    if (mVar == null || mVar.a() != ARTryViewContainer.access$000() || (b = mVar.b()) == 2 || b == 3 || b == 4) {
                        return;
                    }
                    if (b != 5) {
                        if (b != 6) {
                            if (b == 10) {
                                return;
                            }
                            return;
                        }
                        ARTryJSFlowForMiniApp.a aVar2 = aVar;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.a(false, ResultCode.FAILURE_INTERNAL);
                        return;
                    }
                    Log.e(ARTryViewContainer.TAG, "模块安装完成：" + str);
                    ARTryJSFlowForMiniApp.a aVar3 = aVar;
                    if (aVar3 == null) {
                        return;
                    }
                    aVar3.a(true, ResultCode.SUCCESS);
                }
            };
            c.a(mSplitInstallStateUpdatedListener);
            c.a(j.a().a(str).a()).a(new e<Integer>() { // from class: com.taobao.android.artry.arflow.ARTryViewContainer.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.tasks.e
                public /* synthetic */ void onSuccess(Integer num) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, num});
                    } else {
                        a(num);
                    }
                }

                public void a(Integer num) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6cdec50f", new Object[]{this, num});
                    } else if (num == null) {
                    } else {
                        ARTryViewContainer.access$002(num.intValue());
                    }
                }
            }).a(new com.alibaba.android.split.core.tasks.d() { // from class: com.taobao.android.artry.arflow.ARTryViewContainer.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.split.core.tasks.d
                public void onFailure(Exception exc) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                        return;
                    }
                    ARTryJSFlowForMiniApp.a aVar2 = ARTryJSFlowForMiniApp.a.this;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(false, ResultCode.ENGINE_SO_DOWNLOAD_ERROR);
                }
            });
        } catch (Throwable unused) {
            if (aVar == null) {
                return;
            }
            aVar.a(false, ResultCode.FAILURE_INTERNAL);
        }
    }

    private void captureScreenshot(boolean z, boolean z2, String str, final dpx dpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77f7f521", new Object[]{this, new Boolean(z), new Boolean(z2), str, dpxVar});
            return;
        }
        dpv dpvVar = new dpv();
        dpvVar.a(new dpx() { // from class: com.taobao.android.artry.arflow.ARTryViewContainer.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dpx
            public void a(boolean z3, JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z3), jSONObject});
                    return;
                }
                dpx dpxVar2 = dpxVar;
                if (dpxVar2 == null) {
                    return;
                }
                dpxVar2.a(z3, jSONObject);
            }
        });
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("needUploadPicture", (Object) Boolean.valueOf(z));
        jSONObject.put("needBase64Output", (Object) Boolean.valueOf(z2));
        jSONObject.put("uploadBizId", (Object) str);
        this.mARTryJSFlowForMiniApp.b("takeARTryFrameSnapshot", jSONObject, dpvVar);
    }

    public void resume() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else if (this.mInitARSimplestGraph || ((str = this.mCurrentGraphType) != null && str.equals("MAKEUP_ONLY"))) {
            ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp = this.mARTryJSFlowForMiniApp;
            if (aRTryJSFlowForMiniApp == null) {
                return;
            }
            aRTryJSFlowForMiniApp.b();
        } else {
            this.mInitARSimplestGraph = true;
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp = this.mARTryJSFlowForMiniApp;
        if (aRTryJSFlowForMiniApp == null) {
            return;
        }
        aRTryJSFlowForMiniApp.c();
    }

    public void destroy() {
        o oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp = this.mARTryJSFlowForMiniApp;
        if (aRTryJSFlowForMiniApp != null) {
            aRTryJSFlowForMiniApp.d();
            this.mARTryJSFlowForMiniApp = null;
        }
        g c = com.taobao.appbundle.c.Companion.a().c();
        if (c == null || (oVar = mSplitInstallStateUpdatedListener) == null) {
            return;
        }
        c.b(oVar);
    }
}
