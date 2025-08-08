package com.flybird;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;
import com.alipay.android.app.template.Base64;
import com.alipay.android.app.template.DtmElementClickListener;
import com.alipay.android.app.template.EventHandler;
import com.alipay.android.app.template.FBBridge;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.FBFocusable;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.app.template.FBPluginFactory;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.app.template.JSPluginManager;
import com.alipay.android.app.template.LogCatLog;
import com.alipay.android.app.template.OnLoadCallback;
import com.alipay.android.app.template.OnTemplateClickListener;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.alipay.android.app.template.TemplatePasswordService;
import com.alipay.android.app.template.Tracker;
import com.alipay.android.app.template.event.TElementEventHandler;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.alipay.birdnest.util.InvokeThreadPoolTask;
import com.alipay.birdnest.util.UiUtil;
import com.alipay.birdnest.view.SystemDefaultDialog;
import com.alipay.mobile.common.logging.api.antevent.AntEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.flybird.FBRootFrameLayout;
import com.flybird._FBDocumentInitializer;
import com.flybird.support.basics.AppContextHolder;
import com.flybird.support.basics.e;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taopai.business.util.y;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.cul;
import tb.cun;
import tb.drm;
import tb.idz;
import tb.ieb;
import tb.ied;
import tb.riy;

/* loaded from: classes4.dex */
public class FBDocument implements FBContext, FBRootFrameLayout.OnSizeChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JS_EXCEPTION_ACTION = "com.flybird.js.exception";
    public static final Object NO_RESULT = new Object();

    /* renamed from: a */
    public static final String f7116a;
    public static final String b;
    public static final Pattern c;
    public static final Pattern d;
    public static String e;
    public static final FBContext.JsExecOptions f;
    public static final FBContext.JsExecOptions g;
    public static final FBContext.JsExecOptions h;
    public static final FBContext.JsExecOptions i;
    public final String A;
    public volatile boolean B;
    public OnTemplateClickListener C;
    public TElementEventHandler D;
    public final int E;
    public FBPartialVisibilityHelper K;
    public String L;
    public String M;
    public String N;
    public TemplatePasswordService Q;
    public TemplateKeyboardService R;
    public int actionBarHeight;
    public boolean e0;
    public boolean f0;
    public final Resources j;
    public Context k;
    public BirdNestEngine k0;
    public String l0;
    public FBView mRoot;
    @Deprecated
    public final Map<String, String> n0;
    public long o0;
    public HandlerThread p0;
    public BirdNestEngine.Params param;
    public Handler q0;
    public volatile WeakReference<Thread> r0;
    public final ConditionVariable s0;
    public Boolean t0;
    public FBNav u;
    public final BirdNestEngine.ThemeColorProvider u0;
    public FBRootFrameLayout v;
    public String x;
    public final String y;
    public final String z;
    public boolean l = false;
    public boolean m = false;
    public ArrayList<String> n = new ArrayList<>();
    public e o = null;
    public e p = null;
    public Map<String, String> q = null;
    public boolean r = false;
    public boolean s = false;
    public float t = 1.0f;
    public boolean w = false;
    public HashMap<String, FBView> F = new HashMap<>();
    public HashMap<String, FBLabel> G = new HashMap<>();
    public ArrayList<CountDownTimer> H = new ArrayList<>();
    public ArrayList<FBScrollView> I = new ArrayList<>();
    public ArrayList<FBHScrollView> J = new ArrayList<>();
    public HashMap<String, String> O = new HashMap<>();
    public volatile long mCore = 0;
    public boolean P = false;
    public final int[] screenSize = {-1, -1};
    public boolean S = true;
    public TemplateKeyboardService T = UiUtil.genDefaultKeyboardService();
    public ViewGroup U = null;
    public FBFocusable V = null;
    public final Set<InvokeThreadPoolTask.TaskResult> W = Collections.newSetFromMap(new ConcurrentHashMap());
    public Dialog X = null;
    public List<FBClickCallBack> Y = new ArrayList();
    public boolean Z = true;
    public Runnable a0 = new Runnable() { // from class: com.flybird.FBDocument.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            FBDocument.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FBDocument.a(FBDocument.this, true);
            }
        }
    };
    public Handler b0 = new Handler(Looper.getMainLooper());
    public boolean c0 = false;
    public boolean d0 = false;
    public FBPluginFactory g0 = null;
    public FBPluginCtx h0 = null;
    public boolean i0 = false;
    public final Map<String, Object> j0 = new HashMap();
    public ClickMode m0 = ClickMode.GLOBAL_PROTECT_CLICK;

    /* renamed from: com.flybird.FBDocument$15 */
    /* loaded from: classes4.dex */
    public class AnonymousClass15 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ String f7123a;
        public final /* synthetic */ long b;

        public AnonymousClass15(String str, long j) {
            FBDocument.this = r1;
            this.f7123a = str;
            this.b = j;
        }

        public /* synthetic */ void a(long j, DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a55f29b9", new Object[]{this, new Long(j), dialogInterface, new Integer(i)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ok", "ok");
            } catch (JSONException e) {
                FBLogger.e(AnonymousClass15.class.getName(), "exception", e);
            }
            FBDocument.this.callJsMethod(j, new Object[]{jSONObject});
        }

        public /* synthetic */ void b(long j, DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc7d1a98", new Object[]{this, new Long(j), dialogInterface, new Integer(i)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cancel", "ok");
            } catch (JSONException e) {
                FBLogger.e(AnonymousClass15.class.getName(), "exception", e);
            }
            FBDocument.this.callJsMethod(j, new Object[]{jSONObject});
        }

        public static /* synthetic */ void lambda$MGrO947T0TR3oA3bQ9U1BjcbpbM(AnonymousClass15 anonymousClass15, long j, DialogInterface dialogInterface, int i) {
            anonymousClass15.b(j, dialogInterface, i);
        }

        /* renamed from: lambda$_BY9JUkFWj-uxSzAxPrtXyKmKQg */
        public static /* synthetic */ void m652lambda$_BY9JUkFWjuxSzAxPrtXyKmKQg(AnonymousClass15 anonymousClass15, long j, DialogInterface dialogInterface, int i) {
            anonymousClass15.a(j, dialogInterface, i);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(this.f7123a);
                String optString = jSONObject.optString("title");
                String optString2 = jSONObject.optString("message");
                String optString3 = jSONObject.optString(MspFlybirdDefine.FLYBIRD_DIALOG_OK);
                String optString4 = jSONObject.optString(MspFlybirdDefine.FLYBIRD_DIALOG_CANCEL);
                JSONObject optJSONObject = jSONObject.optJSONObject("okBehaviorInfo");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("cancelBehaviorInfo");
                Context context = FBDocument.this.k;
                final long j = this.b;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.flybird.-$$Lambda$FBDocument$15$_BY9JUkFWj-uxSzAxPrtXyKmKQg
                    {
                        FBDocument.AnonymousClass15.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        FBDocument.AnonymousClass15.m652lambda$_BY9JUkFWjuxSzAxPrtXyKmKQg(FBDocument.AnonymousClass15.this, j, dialogInterface, i);
                    }
                };
                final long j2 = this.b;
                SystemDefaultDialog.showDialog(context, optString, optString2, optString3, onClickListener, optJSONObject, optString4, new DialogInterface.OnClickListener() { // from class: com.flybird.-$$Lambda$FBDocument$15$MGrO947T0TR3oA3bQ9U1BjcbpbM
                    {
                        FBDocument.AnonymousClass15.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        FBDocument.AnonymousClass15.lambda$MGrO947T0TR3oA3bQ9U1BjcbpbM(FBDocument.AnonymousClass15.this, j2, dialogInterface, i);
                    }
                }, optJSONObject2);
            } catch (Throwable th) {
                FBLogger.e("FBDocument", "confirm", th);
            }
        }
    }

    /* renamed from: com.flybird.FBDocument$16 */
    /* loaded from: classes4.dex */
    public class AnonymousClass16 extends InvokeThreadPoolTask {
        public final /* synthetic */ long b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ long f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass16(ExecutorService executorService, long j, boolean z, String str, String str2, long j2) {
            super(executorService);
            FBDocument.this = r1;
            this.b = j;
            this.c = z;
            this.d = str;
            this.e = str2;
            this.f = j2;
        }
    }

    /* loaded from: classes4.dex */
    public enum ClickMode {
        GLOBAL_PROTECT_CLICK,
        INDIVIDUAL_PROTECT_CLICK,
        NO_PROTECT_CLICK
    }

    /* loaded from: classes4.dex */
    public static final class Duktape implements Closeable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public volatile long f7137a;

        public Duktape(long j) {
            this.f7137a = j;
        }

        public static native long createContext();

        public static native long dukV2CreateContext();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            if (this.f7137a != 0) {
                long j = this.f7137a;
                this.f7137a = 0L;
                destroyContext(j);
            }
        }

        public final native void destroyContext(long j);

        public synchronized void dukV2Close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("898ec509", new Object[]{this});
                return;
            }
            if (this.f7137a != 0) {
                long j = this.f7137a;
                this.f7137a = 0L;
                dukV2DestroyContext(j);
            }
        }

        public final native void dukV2DestroyContext(long j);

        public final native Object dukV2Evaluate(long j, String str, String str2);

        public synchronized Object dukV2Evaluate(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("84d48c88", new Object[]{this, str, str2});
            }
            return dukV2Evaluate(this.f7137a, str, str2);
        }

        public final native void dukV2Set(long j, String str, Object obj, Object[] objArr);

        public synchronized <T> void dukV2Set(String str, Class<T> cls, T t) {
            Method[] methods;
            IpChange ipChange = $ipChange;
            if (!(ipChange instanceof IpChange)) {
                if (cls.isInterface()) {
                    if (cls.getInterfaces().length <= 0) {
                        if (cls.isInstance(t)) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Method method : cls.getMethods()) {
                                if (linkedHashMap.put(method.getName(), method) != null) {
                                    throw new UnsupportedOperationException(method.getName() + " is overloaded in " + cls);
                                }
                            }
                            dukV2Set(this.f7137a, str, t, linkedHashMap.values().toArray());
                            return;
                        }
                        throw new IllegalArgumentException(t.getClass() + " is not an instance of " + cls);
                    }
                    throw new UnsupportedOperationException(cls + " must not extend other interfaces");
                } else {
                    throw new UnsupportedOperationException("Only interfaces can be bound. Received: " + cls);
                }
            }
            ipChange.ipc$dispatch("fd603cbc", new Object[]{this, str, cls, t});
        }

        public synchronized Object evaluate(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c89693fe", new Object[]{this, str, str2});
            }
            return evaluate(this.f7137a, str, str2);
        }

        public final native String evaluate(long j, String str, String str2);

        public synchronized void finalize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
                return;
            }
            if (this.f7137a != 0) {
                FBLogger.e(Duktape.class.getName(), "Duktape instance leaked!");
            }
        }

        public synchronized Object dukV2Evaluate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("a510e112", new Object[]{this, str});
            }
            return dukV2Evaluate(this.f7137a, str, "?");
        }

        public synchronized String evaluate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5c31d776", new Object[]{this, str});
            }
            return evaluate(this.f7137a, str, a.ATOM_eval);
        }
    }

    /* loaded from: classes4.dex */
    public static final class DuktapeException extends RuntimeException {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String STACK_TRACE_CLASS_NAME = "JavaScript";
        private static final Pattern STACK_TRACE_PATTERN = Pattern.compile("\\s*at ([^\\s]+) \\(([^\\s]+(?<!cpp)):(\\d+)\\).*$");

        public DuktapeException(String str) {
            super(getErrorMessage(str));
            addDuktapeStack(this, str);
        }

        private static void addDuktapeStack(Throwable th, String str) {
            StackTraceElement[] stackTrace;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3b1aceb", new Object[]{th, str});
                return;
            }
            String[] split = str.split("\n", -1);
            if (split.length <= 1) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (!z && stackTraceElement.isNativeMethod() && stackTraceElement.getClassName().equals(Duktape.class.getName()) && (stackTraceElement.getMethodName().equals("evaluate") || stackTraceElement.getMethodName().equals("call"))) {
                    for (int i = 1; i < split.length; i++) {
                        StackTraceElement stackTraceElement2 = toStackTraceElement(split[i]);
                        if (stackTraceElement2 != null) {
                            arrayList.add(stackTraceElement2);
                        }
                    }
                    z = true;
                }
                arrayList.add(stackTraceElement);
            }
            th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
        }

        private static String getErrorMessage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1b20a93a", new Object[]{str});
            }
            int indexOf = str.indexOf(10);
            return indexOf > 0 ? str.substring(0, indexOf) : str;
        }

        private static StackTraceElement toStackTraceElement(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StackTraceElement) ipChange.ipc$dispatch("3dc82cdb", new Object[]{str});
            }
            Matcher matcher = STACK_TRACE_PATTERN.matcher(str);
            if (matcher.matches()) {
                return new StackTraceElement(STACK_TRACE_CLASS_NAME, matcher.group(1), matcher.group(2), Integer.parseInt(matcher.group(3)));
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static class FBContextHandle implements FBPluginCtx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public FBDocument f7138a;

        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f7138a == null;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnBlur(long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2cb39d96", new Object[]{this, new Long(j)})).booleanValue() : a() || FBView.nativePlatformOnBlur(j);
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public int deliverOnChange(long j, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aa3fd266", new Object[]{this, new Long(j), str})).intValue();
            }
            if (!a()) {
                return FBView.nativePlatformOnChange(j, str);
            }
            return 0;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnClick(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ce5b1f9d", new Object[]{this, new Long(j)})).booleanValue();
            }
            if (a()) {
                return true;
            }
            FBDocument fBDocument = this.f7138a;
            if (fBDocument != null && fBDocument.getElementEventObserver() != null) {
                this.f7138a.getElementEventObserver().onEvent(TElementEventHandler.EventType.CLICK, null, null, this.f7138a);
            }
            return FBView.nativePlatformOnClick(j);
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnFocus(long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be94a24d", new Object[]{this, new Long(j)})).booleanValue() : a() || FBView.nativePlatformOnFocus(j);
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public int deliverOnInput(long j, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("68f7f894", new Object[]{this, new Long(j), str})).intValue();
            }
            if (!a()) {
                return FBView.nativePlatformOnInput(j, str);
            }
            return 0;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnKeyDown(long j, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d26cae7", new Object[]{this, new Long(j), new Integer(i)})).booleanValue() : a() || FBView.nativePlatformOnKeyDown(j, i);
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnLongpress(long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f9c9f73e", new Object[]{this, new Long(j)})).booleanValue() : a() || FBView.nativePlatformOnLongpress(j);
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnMouseDown(long j, int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aace2d7e", new Object[]{this, new Long(j), new Integer(i), new Integer(i2)})).booleanValue() : a() || FBView.nativePlatformOnMouseDown(j, i, i2);
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnMouseMove(long j, int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9736f", new Object[]{this, new Long(j), new Integer(i), new Integer(i2)})).booleanValue() : a() || FBView.nativePlatformOnMouseMove(j, i, i2);
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnMouseUp(long j, int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77904525", new Object[]{this, new Long(j), new Integer(i), new Integer(i2)})).booleanValue() : a() || FBView.nativePlatformOnMouseUp(j, i, i2);
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public Object getBodyView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("53d68ce", new Object[]{this});
            }
            FBDocument fBDocument = this.f7138a;
            if (fBDocument != null) {
                return fBDocument.mRoot;
            }
            return null;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public TemplateKeyboardService getDefaultKeyboardService() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplateKeyboardService) ipChange.ipc$dispatch("4611c4d7", new Object[]{this});
            }
            FBDocument fBDocument = this.f7138a;
            if (fBDocument != null) {
                return fBDocument.T;
            }
            return null;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public FBContext getFbContext() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FBContext) ipChange.ipc$dispatch("af71ea12", new Object[]{this}) : this.f7138a;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public Dialog getShowingDialog() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Dialog) ipChange.ipc$dispatch("62965b11", new Object[]{this});
            }
            FBDocument fBDocument = this.f7138a;
            if (fBDocument != null) {
                return fBDocument.X;
            }
            return null;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public TemplateKeyboardService getTemplateKeyboardService() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplateKeyboardService) ipChange.ipc$dispatch("588103d2", new Object[]{this});
            }
            FBDocument fBDocument = this.f7138a;
            if (fBDocument != null) {
                return fBDocument.R;
            }
            return null;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public TemplatePasswordService getTemplatePasswordService() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplatePasswordService) ipChange.ipc$dispatch("1170c352", new Object[]{this});
            }
            FBDocument fBDocument = this.f7138a;
            if (fBDocument != null) {
                return fBDocument.Q;
            }
            return null;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean hasInput() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("24eec1db", new Object[]{this})).booleanValue();
            }
            FBDocument fBDocument = this.f7138a;
            return fBDocument != null && fBDocument.c0;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean isFullscreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9d663290", new Object[]{this})).booleanValue();
            }
            FBDocument fBDocument = this.f7138a;
            return fBDocument != null && fBDocument.P;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean isOnloadFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("97d8620d", new Object[]{this})).booleanValue();
            }
            FBDocument fBDocument = this.f7138a;
            return fBDocument != null && fBDocument.isOnloadFinish();
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public int nativeExecuteJs(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7afdec8b", new Object[]{this, str})).intValue();
            }
            if (!a() && this.f7138a.mCore != 0) {
                return FBDocument.nativeExcuteJs(this.f7138a.mCore, str);
            }
            return -1;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public void safeExecuteJs(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf9a0e62", new Object[]{this, str});
                return;
            }
            FBDocument fBDocument = this.f7138a;
            if (a() || fBDocument == null || fBDocument.mCore == 0) {
                return;
            }
            FBDocument.a(fBDocument, str);
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public void setAutoFocus(FBFocusable fBFocusable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("393021ed", new Object[]{this, fBFocusable});
                return;
            }
            FBDocument fBDocument = this.f7138a;
            if (fBDocument == null) {
                return;
            }
            fBDocument.V = fBFocusable;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public void setHasInput(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9204e9b", new Object[]{this, new Boolean(z)});
                return;
            }
            FBDocument fBDocument = this.f7138a;
            if (fBDocument == null) {
                return;
            }
            fBDocument.c0 = z;
        }
    }

    static {
        String str = new String(new byte[]{1});
        f7116a = str;
        String str2 = new String(new byte[]{2});
        b = str2;
        c = Pattern.compile(str);
        d = Pattern.compile(str2);
        e = "";
        f = FBContext.JsExecOptions.create().setAsyncMode(1).setCallbackMode(0).setBlockTimeoutMs(5000);
        g = FBContext.JsExecOptions.create().setAsyncMode(0).setCallbackMode(0).setBlockTimeoutMs(60000);
        h = FBContext.JsExecOptions.create().setAsyncMode(1).setCallbackMode(0).setBlockTimeoutMs(60000);
        i = FBContext.JsExecOptions.create().setAsyncMode(0).setCallbackMode(0);
        FBContext.JsExecOptions.create().setAsyncMode(1).setCallbackMode(0);
    }

    public FBDocument(BirdNestEngine.Params params) {
        this.C = null;
        this.actionBarHeight = 0;
        this.e0 = true;
        this.f0 = false;
        HashMap hashMap = new HashMap();
        this.n0 = hashMap;
        this.o0 = 0L;
        this.r0 = new WeakReference<>(null);
        this.s0 = new ConditionVariable();
        this.t0 = null;
        a(false, params.prepareTiming);
        e a2 = e.a();
        idz.a();
        AppContextHolder.feedAppContext(params.context);
        GlobalCacheForApi.a();
        this.k = params.context;
        this.param = params;
        String str = params.tid;
        this.y = str;
        this.z = params.tversion;
        this.A = params.ttime;
        if (BirdNestEngine.useSkipOldSwitches) {
            this.f0 = false;
        } else {
            this.f0 = getSwitch("birdnest_useOldActionSheet_v87", false);
        }
        c();
        a(params);
        FBLogger.d("FBDocument", "FBDocument()，tid: " + params.tid + ", biz: " + params.businessId);
        this.j = params.contextResources;
        this.actionBarHeight = params.actionBarHeight;
        a(params.getEngine());
        BirdNestEngine.ThemeColorProvider themeColorProvider = this.k0.getConfig().getThemeColorProvider();
        this.E = themeColorProvider != null ? themeColorProvider.themeBitsForCurrentDocument(this) : 0;
        this.u0 = themeColorProvider;
        BirdNestEngine.SettingProvider settingProvider = this.k0.getConfig().getSettingProvider();
        if (settingProvider != null) {
            Platform.d = settingProvider.getSwitch("gray_tb_design_token_231222", false);
        } else {
            Platform.d = false;
        }
        EventHandler eventHandler = params.dtmEventListener;
        if (eventHandler != null) {
            this.C = new DtmElementClickListener(eventHandler, params.businessId, this.k0.getConfig().getLogTracer());
        }
        FBDocumentAssistor.a(this.k);
        hashMap.clear();
        hashMap.put(y.TEMPLATE_ID, str);
        if (!params.createImmediately) {
            return;
        }
        Context context = this.k;
        this.mRoot = new FBView(context, new FBBodyFrameLayout(context), this);
        f();
        if (BirdNestEngine.useSkipOldSwitches) {
            this.e0 = true;
        } else {
            this.e0 = getSwitch("birdnest_large_width_protect", true);
        }
        FBDocumentAssistor.b(this, a2, 21, "Doc:create");
    }

    public static /* synthetic */ boolean a(FBDocument fBDocument, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80e64329", new Object[]{fBDocument, new Boolean(z)})).booleanValue();
        }
        fBDocument.Z = z;
        return z;
    }

    public Void b(int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("fc632983", new Object[]{this, new Integer(i2)});
        }
        if (this.r && this.mCore != 0) {
            if (this.q == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("tpl_time", this.A);
                hashMap.put("tpl_version", this.z);
                this.q = hashMap;
            }
            if (this.o != null) {
                nativeSendPrepareTiming(this.mCore, this.o.f7234a);
                Platform.a(1, 21L, 0L, this.y, "Doc:preparePoint", this.q);
                this.o = null;
            }
            if (this.p != null) {
                nativeSendRenderTiming(this.mCore, this.p.f7234a);
                Platform.a(1, 21L, 0L, this.y, "Doc:renderPoint", this.q);
                this.p = null;
            }
            nativeMarkRenderSeqEventTiming(this.mCore, SystemClock.elapsedRealtimeNanos(), i2);
            HashMap hashMap2 = new HashMap(this.q);
            hashMap2.put("size", String.valueOf(i2));
            Platform.a(1, 21L, 0L, this.y, "Doc:drawPoint", hashMap2);
        }
        return null;
    }

    @Deprecated
    public static Duktape createDuk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Duktape) ipChange.ipc$dispatch("c30cab20", new Object[0]);
        }
        idz.a();
        long createContext = Duktape.createContext();
        if (createContext != 0) {
            return new Duktape(createContext);
        }
        throw new OutOfMemoryError("Cannot create Duktape instance");
    }

    public static Duktape createDukV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Duktape) ipChange.ipc$dispatch("10704a84", new Object[0]);
        }
        idz.a();
        long dukV2CreateContext = Duktape.dukV2CreateContext();
        if (dukV2CreateContext != 0) {
            return new Duktape(dukV2CreateContext);
        }
        throw new OutOfMemoryError("Cannot create Duktape instance");
    }

    public /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        View innerView = FBView.getInnerView(mo650getBodyView());
        if (innerView == null) {
            return;
        }
        innerView.setFocusableInTouchMode(true);
        innerView.setFocusable(true);
    }

    public /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            e a2 = FBDocumentAssistor.a(this);
            FBDocumentAssistor.a(this, FBDocumentAssistor.a(this), 21, "Doc:test_inner");
            FBDocumentAssistor.a(this, a2, 21, "Doc:test_outer");
        } catch (Throwable th) {
            cun.a("FBDocument", "testing err", th);
        }
    }

    public static /* synthetic */ void lambda$6NgluXnbVvuAsIaLWSeeV2jJQ7I(FBDocument fBDocument) {
        fBDocument.d();
    }

    /* renamed from: lambda$6aXsv1p2TpXDiJN-Bj3RQ5oy5Yc */
    public static /* synthetic */ Pair m646lambda$6aXsv1p2TpXDiJNBj3RQ5oy5Yc(FBDocument fBDocument, FBDocument fBDocument2, long j, long j2, Void r6) {
        return fBDocument.a(fBDocument2, j, j2, r6);
    }

    /* renamed from: lambda$9f6aBeqAA0g8-cQC8hnwz6W66Ko */
    public static /* synthetic */ void m647lambda$9f6aBeqAA0g8cQC8hnwz6W66Ko(FBDocument fBDocument, FBDocument fBDocument2, long j, long j2) {
        fBDocument.a(fBDocument2, j, j2);
    }

    /* renamed from: lambda$OW5CpU-v0z0rbg2GPRV-X7m1_1E */
    public static /* synthetic */ void m648lambda$OW5CpUv0z0rbg2GPRVX7m1_1E(FBDocument fBDocument, String str, String str2) {
        fBDocument.a(str, str2);
    }

    public static /* synthetic */ void lambda$XEmsIchhlj_xWvnwWXDMGkC42E8(FBDocument fBDocument) {
        fBDocument.e();
    }

    public static /* synthetic */ Void lambda$cbmQLxNvMA3iIBCyruA5UkLo6Sw(FBDocument fBDocument, int i2) {
        return fBDocument.b(i2);
    }

    public static /* synthetic */ Pair lambda$dLlVOcymOAJs7dfFuB7wHN4ZcFc(FBDocument fBDocument, long j, Object[] objArr, Void r4) {
        return fBDocument.a(j, objArr, r4);
    }

    /* renamed from: lambda$uUVKxB1rsVgcKne-AHPHNR3F840 */
    public static /* synthetic */ Pair m649lambda$uUVKxB1rsVgcKneAHPHNR3F840(FBDocument fBDocument, boolean z, String str, Void r3) {
        return fBDocument.a(z, str, r3);
    }

    public static native int nativeCallJsMethod(long j, long j2, Object[] objArr);

    public static native int nativeCallJsMethodWithJson(long j, long j2, String str);

    public static native int nativeCoreBuildDom(long j, String str, String str2, int i2, boolean z);

    public static native int nativeCoreLayoutAndNotify(long j);

    public static native int nativeCoreLoad(long j, String str, String str2, int i2, boolean z);

    public static native long nativeCoreNew(FBDocument fBDocument, boolean z);

    public static native int nativeCoreReLoadData(long j, String str);

    public static native void nativeDestroyCore(long j);

    public static native int nativeExcuteJs(long j, String str);

    public static native String nativeExecuteJsWithResult(long j, String str);

    public static native void nativeInvokeCallback(long j, String str, String str2);

    public static native void nativeMarkRenderSeqEventTiming(long j, long j2, int i2);

    public static native void nativeSendPrepareTiming(long j, long j2);

    public static native void nativeSendRenderTiming(long j, long j2);

    public static native void nativeSetRemParams(long j, float f2, boolean z);

    public static native String queryViewId(long j, String str);

    public static void setTidToDebug(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428ceb5c", new Object[]{str});
        } else {
            e = str;
        }
    }

    public void addCoreSampleLog(int i2, long j, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1e9bac", new Object[]{this, new Integer(i2), new Long(j), new Long(j2), str});
        } else {
            Platform.a(i2, j, j2, this.y, str, null);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String str = Platform.f5257a;
        BirdNestEngine.useValueCache = true;
        _FBDocumentInitializer.CachingModel cachingModel = (_FBDocumentInitializer.CachingModel) drm.b("Timed:EngineDocSwitches");
        if (cachingModel == null) {
            return;
        }
        this.m = cachingModel.b;
        this.n = cachingModel.c;
        BirdNestEngine.rollbackAntEvent = false;
        BirdNestEngine.useLogBatch = cachingModel.d;
        BirdNestEngine.useNoFootprint = cachingModel.e;
        BirdNestEngine.useDelayedTorchBind = false;
        BirdNestEngine.useSkipOldSwitches = cachingModel.f;
        BirdNestEngine.useDelayedImgLoading = cachingModel.h;
        BirdNestEngine.useSimpleActionSplit = cachingModel.i;
        BirdNestEngine.globalPerfRatioOf10000 = cachingModel.j;
        drm.f26925a = cachingModel.g;
        BirdNestEngine.optimizationFlag = String.valueOf(cachingModel.k);
    }

    @Override // com.alipay.android.app.template.FBContext
    @Deprecated
    public int callJsMethod(long j, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a30e8ef", new Object[]{this, new Long(j), objArr})).intValue();
        }
        try {
            if (this.mCore == 0) {
                cun.a("FBDocument_js_call", "dynamic exception case 000-005, this: " + this);
                return -1;
            }
            e a2 = FBDocumentAssistor.a(this);
            int nativeCallJsMethod = nativeCallJsMethod(this.mCore, j, objArr);
            FBDocumentAssistor.a(this, a2, 21, "Doc:nativeCallJsMethod_api");
            return nativeCallJsMethod;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public boolean configRemScaled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6938bfd", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.android.app.template.FBContext
    public void destroy(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226d31e4", new Object[]{this, map});
            return;
        }
        e a2 = FBDocumentAssistor.a(this);
        ArrayList<CountDownTimer> arrayList = this.H;
        if (arrayList != null) {
            Iterator<CountDownTimer> it = arrayList.iterator();
            while (it.hasNext()) {
                CountDownTimer next = it.next();
                if (next.isTimerFinishing) {
                    FBLogger.e("FBDocument", "already has timer finishing, ignore destroying core!");
                    this.mCore = 0L;
                }
                next.pause();
            }
        }
        if (this.B) {
            FBLogger.e("FBDocument", "already has event in processing, ignore destroying core!");
            this.mCore = 0L;
        }
        Set<InvokeThreadPoolTask.TaskResult> set = this.W;
        if (set != null && !set.isEmpty()) {
            Handler handler = InvokeThreadPoolTask.HandlerInstanceHolder.f5271a;
            for (InvokeThreadPoolTask.TaskResult taskResult : set) {
                handler.removeMessages(16, taskResult);
            }
        }
        this.W.clear();
        this.j0.clear();
        if (this.Y.size() > 0) {
            for (FBClickCallBack fBClickCallBack : this.Y) {
                fBClickCallBack.clear();
            }
            this.Y.clear();
        }
        try {
            TemplateKeyboardService templateKeyboardService = this.R;
            if (templateKeyboardService != null) {
                Context context = this.k;
                if (context instanceof Activity) {
                    templateKeyboardService.destroyKeyboard(((Activity) context).getWindow().getDecorView());
                    this.R = null;
                }
            }
        } catch (Throwable th) {
            if (!BirdNestEngine.useNoFootprint) {
                Tracker.recordFootprint("In FBDocument.destroy() destroyKeyboard failed", th.getMessage(), "", null);
            }
        }
        this.g0 = null;
        FBPluginCtx fBPluginCtx = this.h0;
        if (fBPluginCtx != null && (fBPluginCtx instanceof FBContextHandle)) {
            ((FBContextHandle) fBPluginCtx).f7138a = null;
            this.h0 = null;
        }
        HashMap<String, FBLabel> hashMap = this.G;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.C = null;
        FBNav fBNav = this.u;
        if (fBNav != null) {
            fBNav.destroy();
            this.u = null;
        }
        FBView fBView = this.mRoot;
        if (fBView != null) {
            fBView.destroy();
            this.mRoot = null;
        }
        ArrayList<FBScrollView> arrayList2 = this.I;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList<FBHScrollView> arrayList3 = this.J;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        ArrayList<CountDownTimer> arrayList4 = this.H;
        if (arrayList4 != null) {
            Iterator<CountDownTimer> it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.H.clear();
        }
        HashMap<String, FBView> hashMap2 = this.F;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        FBRootFrameLayout fBRootFrameLayout = this.v;
        if (fBRootFrameLayout != null) {
            fBRootFrameLayout.setOnSizeChangedListener(null);
            if (getEngine() != null) {
                try {
                    this.v.setTag(getEngine().getTagId(), null);
                } catch (IllegalArgumentException e2) {
                    FBLogger.e("FBDocument", e2);
                }
            }
            this.v = null;
        }
        FBPartialVisibilityHelper fBPartialVisibilityHelper = this.K;
        if (fBPartialVisibilityHelper != null) {
            synchronized (fBPartialVisibilityHelper) {
                fBPartialVisibilityHelper.c = null;
            }
        }
        this.V = null;
        this.U = null;
        if (this.mCore == 0) {
            FBLogger.e("FBDocument", "异常场景，重复 destroy FBDocument, options: " + map);
        }
        synchronized (this) {
            if (this.mCore != 0) {
                long j = this.mCore;
                this.mCore = 0L;
                e a3 = FBDocumentAssistor.a(this);
                nativeDestroyCore(j);
                FBDocumentAssistor.a(this, a3, 21, "Doc:nativeDestroyCore");
            }
        }
        this.a0 = null;
        this.T = null;
        this.param = null;
        this.k = null;
        this.k0 = null;
        j();
        FBDocumentAssistor.a(this, a2, 21, "Doc:destroy");
    }

    public void dispatchCoreTask(int i2, final FBDocument fBDocument, final long j, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39df5025", new Object[]{this, new Integer(i2), fBDocument, new Long(j), new Long(j2)});
            return;
        }
        cun.b("FBDocument", "dispatchCoreTask: get " + i2 + ", " + j + ", " + j2);
        if (i2 == 1) {
            a(6, this, i, (FBContext.JsExecCallback) null, new cul() { // from class: com.flybird.-$$Lambda$FBDocument$6aXsv1p2TpXDiJN-Bj3RQ5oy5Yc
                @Override // tb.cul
                public final Object apply(Object obj) {
                    return FBDocument.m646lambda$6aXsv1p2TpXDiJNBj3RQ5oy5Yc(FBDocument.this, fBDocument, j, j2, (Void) obj);
                }
            });
        } else if (i2 != 2) {
            cun.a("FBDocument", "dispatchCoreTask: unknown type: " + i2);
        } else {
            ieb.b.submit(new Runnable() { // from class: com.flybird.-$$Lambda$FBDocument$9f6aBeqAA0g8-cQC8hnwz6W66Ko
                {
                    FBDocument.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FBDocument.m647lambda$9f6aBeqAA0g8cQC8hnwz6W66Ko(FBDocument.this, fBDocument, j, j2);
                }
            });
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    @Deprecated
    public int executeJs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("314d87a2", new Object[]{this, str})).intValue();
        }
        if (this.mCore == 0) {
            FBLogger.e("FBDocument", "dynamic exception case 000-003, this: " + this);
            return -1;
        }
        try {
            return nativeExcuteJs(this.mCore, str);
        } catch (Throwable th) {
            FBLogger.e(getClass().getName() + "executeJs", th);
            return -1;
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    @Deprecated
    public String executeJsWithResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86f7484e", new Object[]{this, str});
        }
        if (this.mCore == 0) {
            FBLogger.e("FBDocument", "dynamic exception case 000-004, this: " + this);
            return null;
        }
        try {
            return nativeExecuteJsWithResult(this.mCore, str);
        } catch (Throwable th) {
            FBLogger.e(getClass().getName() + "executeJs", th);
            return null;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (!StringUtils.isEmpty(e) && e.equals(this.param.tid)) {
            final String str = this.param.tid;
            FBLogger.d("FBDocument", "got tidToDebug: " + e);
            this.b0.post(new Runnable() { // from class: com.flybird.FBDocument.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    FBDocument.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Context context = FBDocument.this.k;
                    Toast.makeText(context, "即将调试模板:" + str + "，请在 vs code 执行 attach 操作", 1).show();
                }
            });
            this.param.jsDebugger = true;
        }
        BirdNestEngine.Params params = this.param;
        if (params != null) {
            int i2 = params.initialWinWidth;
            if (i2 != 0) {
                this.screenSize[0] = i2;
            }
            int i3 = params.initialWinHeight;
            if (i3 != 0) {
                this.screenSize[1] = i3;
            }
        }
        if (params != null && params.jsDebugger) {
            if (this.p0 == null) {
                HandlerThread handlerThread = new HandlerThread("Duk-js-debugger");
                this.p0 = handlerThread;
                handlerThread.start();
                this.q0 = new Handler(this.p0.getLooper());
            }
            this.q0.post(new Runnable() { // from class: com.flybird.FBDocument.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    FBDocument.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    int i4 = 1;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String str3 = FBDocument.this.param.tplJson;
                    if (StringUtils.isEmpty(str3)) {
                        str3 = FBDocument.this.param.tplHtml;
                    }
                    if (StringUtils.isEmpty(str3)) {
                        throw new IllegalArgumentException("The template content is empty!");
                    }
                    if (str3 == null || str3.contains(riy.BLOCK_START_STR)) {
                        str2 = str3;
                    } else {
                        String str4 = new String(Base64.decode(str3));
                        if (!BirdNestEngine.useNoFootprint) {
                            if (!str4.contains(riy.BLOCK_START_STR)) {
                                i4 = 2;
                            }
                            Tracker.recordFootprint(FBDocument.this.k0.getEngineLogTracer(), FBDocument.this.y, "function: loadTemplate, check point " + i4 + ", invalid tpl content: " + str4 + ", stacktrace: " + FBDocument.a(Thread.currentThread().getStackTrace()));
                        }
                        str2 = str4;
                    }
                    FBDocument fBDocument = FBDocument.this;
                    final String str5 = fBDocument.param.varJson;
                    fBDocument.mCore = FBDocument.nativeCoreNew(fBDocument, AppContextHolder.b);
                    if (FBDocument.this.mCore != 0) {
                        FBDocument fBDocument2 = FBDocument.this;
                        fBDocument2.updateDensity(fBDocument2.mCore, FBTools.getDp(FBDocument.this.k));
                        long j = FBDocument.this.mCore;
                        FBDocument fBDocument3 = FBDocument.this;
                        FBDocument.nativeSetRemParams(j, fBDocument3.t, fBDocument3.s);
                    }
                    if (FBDocument.nativeCoreBuildDom(FBDocument.this.mCore, str2, str5, 0, FBDocument.this.param.jsDebugger) != 0) {
                        FBLogger.e("FBDocument", "==========nativeCoreBuildDom faild========== ");
                        return;
                    }
                    FBDocument.this.b0.post(new Runnable() { // from class: com.flybird.FBDocument.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            AnonymousClass4.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            FBDocument fBDocument4;
                            BirdNestEngine.Params params2;
                            OnLoadCallback onLoadCallback;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            if (FBDocument.nativeCoreLayoutAndNotify(FBDocument.this.mCore) != 0) {
                                FBLogger.e("FBDocument", "==========nativeCoreLayoutAndNotify faild========== ");
                            }
                            FBDocument.this.getClass();
                            FBDocument fBDocument5 = FBDocument.this;
                            fBDocument5.i0 = true;
                            if (fBDocument5.param.callback == null || fBDocument5.mCore == 0 || (params2 = (fBDocument4 = FBDocument.this).param) == null || (onLoadCallback = params2.callback) == null) {
                                return;
                            }
                            onLoadCallback.onLoadFinish(fBDocument4, false);
                        }
                    });
                }
            });
            return;
        }
        if (this.mCore != 0) {
            FBLogger.e("FBDocument", "模板加载重入");
        }
        e eVar = new e();
        String str2 = this.param.tplJson;
        if (StringUtils.isEmpty(str2)) {
            str2 = this.param.tplHtml;
        }
        if (!StringUtils.isEmpty(str2)) {
            if (str2 != null && !str2.contains(riy.BLOCK_START_STR)) {
                String str3 = new String(Base64.decode(str2));
                if (!BirdNestEngine.useNoFootprint) {
                    Tracker.recordFootprint(this.k0.getEngineLogTracer(), this.y, "function: loadTemplate, check point " + (!str3.contains(riy.BLOCK_START_STR) ? 2 : 1) + ", invalid tpl content: " + str3 + ", stacktrace: " + a(Thread.currentThread().getStackTrace()));
                }
                str2 = str3;
            }
            String str4 = this.param.varJson;
            a(Thread.currentThread());
            e a2 = FBDocumentAssistor.a(this);
            this.mCore = nativeCoreNew(this, AppContextHolder.b);
            FBDocumentAssistor.a(this, a2, 21, "Doc:nativeCoreNew");
            if (this.mCore != 0) {
                shouldSampleLog(this.mCore, 3);
                this.r = shouldSampleLog(this.mCore, 1);
                shouldSampleLog(this.mCore, 2);
                updateDensity(this.mCore, FBTools.getDp(this.k));
                nativeSetRemParams(this.mCore, this.t, this.s);
            }
            e a3 = FBDocumentAssistor.a(this);
            long j = this.mCore;
            BirdNestEngine.Params params2 = this.param;
            int nativeCoreLoad = nativeCoreLoad(j, str2, str4, params2.renderOptFlag, params2.jsDebugger);
            FBDocumentAssistor.a(this, a3, 21, "Doc:nativeCoreLoad");
            if (this.mRoot == null || b() == null) {
                Map<String, Object> map = this.param.extParams;
                String valueOf = (map == null || !map.containsKey("tplId")) ? null : String.valueOf(this.param.extParams.get("tplId"));
                if (valueOf != null) {
                    FBLogger.e("FBDocument", "birdnest_render_local_failed, tid: " + valueOf);
                    Tracker.errorPoint(this.k0.getConfig().getLogTracer(), valueOf, "birdnest render local tpl failed! tplId: " + valueOf);
                } else {
                    FBLogger.e("FBDocument", "birdnest_render_local_failed_unknown_tplId");
                    Tracker.errorPoint(this.k0.getConfig().getLogTracer(), "unknown", "birdnest render local tpl failed! unknown tplid");
                }
            }
            if (nativeCoreLoad == 0) {
                this.i0 = true;
                if (this.param.callback != null) {
                    this.b0.post(new Runnable() { // from class: com.flybird.FBDocument.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            FBDocument.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            FBDocument fBDocument;
                            BirdNestEngine.Params params3;
                            OnLoadCallback onLoadCallback;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (FBDocument.this.mCore == 0 || (params3 = (fBDocument = FBDocument.this).param) == null || (onLoadCallback = params3.callback) == null) {
                            } else {
                                onLoadCallback.onLoadFinish(fBDocument, false);
                            }
                        }
                    });
                }
                h();
                if (!this.r) {
                    return;
                }
                FBDocumentAssistor.a(this, eVar, 21, "Doc:loadTemplate");
                return;
            }
            FBLogger.e("FBDocument", "load failed, tplContent: \n<<<<<<\n" + str2 + "\n======\ndataOrJs: " + str4 + "\n>>>>>>\n");
            StringBuilder sb = new StringBuilder();
            sb.append("template or data passed to document is invalid! template:");
            sb.append(str2);
            sb.append(" dataOrJs: ");
            sb.append(str4);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
            Tracker.exceptionPoint(this.k0.getConfig().getLogTracer(), this.y, "load failed", illegalArgumentException);
            throw illegalArgumentException;
        }
        throw new IllegalArgumentException("The template content is empty!");
    }

    public FBView findViewById(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBView) ipChange.ipc$dispatch("8b320212", new Object[]{this, str}) : this.F.get(str);
    }

    public void flushCoreSampleLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95053cbe", new Object[]{this});
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            this.H.get(i2).start();
        }
        if (!this.w) {
            for (FBView fBView : this.F.values()) {
                fBView.onLoadFinish();
            }
            this.w = true;
        }
        a(Thread.currentThread());
        FBView fBView2 = this.mRoot;
        if (fBView2 == null || fBView2.getInnerView() == null) {
            return;
        }
        this.mRoot.getInnerView().requestLayout();
    }

    @Override // com.alipay.android.app.template.FBContext
    public FBFocusable getAutoFocusable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBFocusable) ipChange.ipc$dispatch("69b70b5f", new Object[]{this}) : this.V;
    }

    public String getBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.M;
    }

    @Override // com.alipay.android.app.template.FBContext
    public float getBodyOpacity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b386c5ca", new Object[]{this})).floatValue() : this.mRoot.getOpacity();
    }

    public ClickMode getClickMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClickMode) ipChange.ipc$dispatch("339414ba", new Object[]{this}) : this.m0;
    }

    public String getClientInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b68dd74a", new Object[]{this});
        }
        BirdNestEngine birdNestEngine = this.k0;
        return (birdNestEngine == null || birdNestEngine.getConfig() == null || this.k0.getConfig().getDevicePropProvider() == null) ? "" : this.k0.getConfig().getDevicePropProvider().getProperty("getClientInfo", null);
    }

    @Override // com.alipay.android.app.template.FBContext
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        if (this.v == null) {
            if (this.p == null) {
                this.p = new e();
            }
            FBRootFrameLayout fBRootFrameLayout = new FBRootFrameLayout(this.k);
            fBRootFrameLayout.setOnSizeChangedListener(this);
            try {
                fBRootFrameLayout.addView(b());
            } catch (NullPointerException e2) {
                Context context = this.k;
                String name = context != null ? context.getClass().getName() : "unknown";
                try {
                    AntEvent.Builder builder = new AntEvent.Builder();
                    builder.setEventID("10111088");
                    builder.setBizType("paymonitor");
                    builder.addExtParam("type", ErrorType.DEFAULT);
                    builder.addExtParam("location", "FBDocument#getContentView");
                    builder.addExtParam("detail", "NullPointerException");
                    AntEvent build = builder.build();
                    if (BirdNestEngine.useLogBatch) {
                        BirdNestEngine.eventBatchRunner.a(build);
                    } else {
                        build.send();
                    }
                } catch (Exception unused) {
                }
                FBLogger.e("FBDocument", "严重错误，调用时序有严重问题, context: " + name, e2);
                BirdNestEngine.LogTracer engineLogTracer = this.param.getEngine().getEngineLogTracer();
                String str = this.y;
                Tracker.exceptionPoint(engineLogTracer, str, "严重错误，调用时序有严重问题, context: " + name, e2);
            }
            fBRootFrameLayout.setTag(getEngine().getTagId(), this);
            this.v = fBRootFrameLayout;
        }
        return this.v;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.k;
    }

    public String getCustomAttr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ecf637", new Object[]{this, str});
        }
        OnTemplateClickListener onTemplateClickListener = this.C;
        return onTemplateClickListener != null ? onTemplateClickListener.onGetCustomAttr(this, str) : "";
    }

    @Override // com.alipay.android.app.template.FBContext
    public TemplateKeyboardService getDefaultKeyboardService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateKeyboardService) ipChange.ipc$dispatch("4611c4d7", new Object[]{this}) : this.T;
    }

    public TElementEventHandler getElementEventObserver() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TElementEventHandler) ipChange.ipc$dispatch("ec6e8117", new Object[]{this}) : this.D;
    }

    public BirdNestEngine getEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BirdNestEngine) ipChange.ipc$dispatch("66fb5877", new Object[]{this}) : this.k0;
    }

    public boolean getGlobalClick() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2dee9b7a", new Object[]{this})).booleanValue() : this.Z;
    }

    @Deprecated
    public String getIndexUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de74d426", new Object[]{this}) : this.x;
    }

    public HashMap<String, String> getLogParam4() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("f56ce75f", new Object[]{this}) : this.O;
    }

    @Override // com.alipay.android.app.template.FBContext
    public Object getParameter(String str, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("36c81d12", new Object[]{this, str, obj}) : this.j0.get(str);
    }

    @Override // com.alipay.android.app.template.FBContext
    public Map<String, ?> getParameters() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("367605c", new Object[]{this}) : this.j0;
    }

    public String getProp(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4534ba2c", new Object[]{this, str, str2});
        }
        e a2 = FBDocumentAssistor.a(this);
        if (this.k == null) {
            FBLogger.d("FBDocument", "document.getProp mContext == null");
            return null;
        }
        String performGetProp = JSPluginManager.getInstanse().performGetProp(this.k, str, str2);
        FBLogger.d("FBDocument", "document.getProp oldway name: " + str + ", args: " + str2 + ", result: " + performGetProp);
        StringBuilder sb = new StringBuilder();
        sb.append("Doc:getProp_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        FBDocumentAssistor.a(this, a2, 21, sb.toString());
        return performGetProp;
    }

    public String getRawSwitch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79708ca9", new Object[]{this, str});
        }
        try {
            BirdNestEngine engine = getEngine();
            return engine != null ? engine.getConfig().getSettingProvider().getRawSwitch(str, "") : "";
        } catch (Throwable th) {
            FBLogger.e("FBDocument", th);
            return "";
        }
    }

    public float getRemScale() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("96fedfbd", new Object[]{this})).floatValue() : this.t;
    }

    public int getScrollTop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b52de596", new Object[]{this, str})).intValue();
        }
        try {
            FBView findViewById = findViewById(str);
            if (findViewById != null) {
                return findViewById.getScrollTop();
            }
        } catch (Throwable th) {
            FBLogger.e("FBDocument", th);
        }
        return 0;
    }

    @Override // com.alipay.android.app.template.FBContext
    public Dialog getShowingDialog() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Dialog) ipChange.ipc$dispatch("62965b11", new Object[]{this}) : this.X;
    }

    public String getSpmId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c146b0e4", new Object[]{this}) : this.L;
    }

    public String getStorageForKey(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2efbe118", new Object[]{this, str, new Boolean(z)}) : FBDocumentAssistor.a(getEngine().inMemKV, str, z);
    }

    public boolean getSwitch(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c2620fd", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (str.equals("bn_rollback_scroll_change")) {
            return false;
        }
        try {
            BirdNestEngine engine = getEngine();
            return engine != null ? engine.getConfig().getSettingProvider().getSwitch(str, z) : z;
        } catch (Throwable th) {
            FBLogger.e("FBDocument", th);
            return z;
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public TemplateKeyboardService getTemplateKeyboardService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateKeyboardService) ipChange.ipc$dispatch("588103d2", new Object[]{this}) : this.R;
    }

    public String getTid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this}) : this.y;
    }

    public String getViewEncryptValue(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2c1d7f88", new Object[]{this, str}) : this.F.get(str).getEncryptValue();
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            ieb.d.submit(new Runnable() { // from class: com.flybird.-$$Lambda$FBDocument$XEmsIchhlj_xWvnwWXDMGkC42E8
                {
                    FBDocument.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FBDocument.lambda$XEmsIchhlj_xWvnwWXDMGkC42E8(FBDocument.this);
                }
            });
        }
    }

    public void handleJSException(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9c7b83", new Object[]{this, str, str2, str3});
            return;
        }
        if (str == null) {
            str = this.y;
        }
        FBDocumentAssistor.a(str, str2, str3);
    }

    public void handleTplContent(int i2, String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5506bc5f", new Object[]{this, new Integer(i2), str, str2});
        } else if (!StringUtils.isEmpty(str2)) {
            if ("content".equals(str)) {
                String[] split2 = str2.split(";");
                if (split2 == null) {
                    return;
                }
                for (String str3 : split2) {
                    String[] split3 = str3.split(":");
                    if (split3 != null && split3.length == 2) {
                        String trim = split3[0].trim();
                        String trim2 = split3[1].trim();
                        if ("spmId".equals(trim)) {
                            this.L = trim2;
                        } else if ("bizType".equals(trim)) {
                            this.M = trim2;
                        }
                    }
                }
            } else if ("param".equals(str) && (split = str2.split(";")) != null) {
                for (String str4 : split) {
                    String[] split4 = str4.split(":");
                    if (split4 != null && split4.length == 2) {
                        this.O.put(split4[0].trim(), split4[1].trim());
                    }
                }
            }
        }
    }

    public void handleTwoArgsFunc(final String str, final long j, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d04298", new Object[]{this, str, new Long(j), str2});
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b0.post(new Runnable() { // from class: com.flybird.FBDocument.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    FBDocument.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FBDocument fBDocument = FBDocument.this;
                    String str3 = str;
                    long j2 = j;
                    String str4 = str2;
                    String str5 = FBDocument.JS_EXCEPTION_ACTION;
                    fBDocument.a(str3, j2, str4);
                }
            });
        } else {
            a(str, j, str2);
        }
    }

    public void handleWindowSizeChanged(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7e4302", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (this.mCore == 0 || this.k == null) {
        } else {
            FBLogger.d("FBDocument", "handleWindowSizeChanged, width: " + i2 + ", height: " + i3);
            int[] iArr = this.screenSize;
            iArr[0] = i2;
            iArr[1] = i3;
            nativeUpdateScreenSize(this.mCore, i2, i3);
            FBView fBView = this.mRoot;
            if (fBView == null) {
                return;
            }
            layout(fBView);
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public boolean hasInput() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24eec1db", new Object[]{this})).booleanValue() : this.c0;
    }

    public boolean hiddenKeyboardService(View view, boolean z) {
        boolean z2;
        TemplateKeyboardService templateKeyboardService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f78fdd11", new Object[]{this, view, new Boolean(z)})).booleanValue();
        }
        try {
            z2 = (this.S || (templateKeyboardService = this.R) == null) ? false : templateKeyboardService.hideKeyboard(view);
            if (!z) {
                return z2;
            }
            if (!z2) {
                try {
                    if (!this.T.hideKeyboard(view)) {
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    FBLogger.e("FBDocument", th);
                    return z2;
                }
            }
            return true;
        } catch (Throwable th2) {
            th = th2;
            z2 = false;
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        BirdNestEngine.Params params = this.param;
        return params != null && params.tmFlagsPrerenderV2;
    }

    public boolean invoke(int i2, final String str, final String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66b53cd0", new Object[]{this, new Integer(i2), str, str2, new Long(j)})).booleanValue();
        }
        boolean z = (i2 & 1) != 0;
        boolean z2 = (i2 & 2) != 0;
        if (z && z2) {
            this.k0.getDetachedExecutorService().submit(new Runnable() { // from class: com.flybird.-$$Lambda$FBDocument$OW5CpU-v0z0rbg2GPRV-X7m1_1E
                {
                    FBDocument.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FBDocument.m648lambda$OW5CpUv0z0rbg2GPRVX7m1_1E(FBDocument.this, str, str2);
                }
            });
            return true;
        }
        if (this.k != null && this.mCore != 0) {
            long j2 = this.mCore;
            if (JSPluginManager.getInstanse().containsInvoke(this.k, str)) {
                this.W.add(new AnonymousClass16(this.k0.getInvokeExecutorService(), j2, z2, str, str2, j).a());
                return true;
            }
        }
        return false;
    }

    public String invokeNode(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9ff6941", new Object[]{this, str, str2, str3});
        }
        try {
            FBView findViewById = findViewById(str);
            if (findViewById == null) {
                return null;
            }
            return findViewById.invoke(str2, str3);
        } catch (Throwable th) {
            FBLogger.e("FBDocument", th);
            return null;
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public boolean isFullscreen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d663290", new Object[]{this})).booleanValue() : this.P;
    }

    @Override // com.alipay.android.app.template.FBContext
    public boolean isJsDebuggerEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("528cc958", new Object[]{this})).booleanValue();
        }
        BirdNestEngine.Params params = this.param;
        return params != null && params.jsDebugger;
    }

    @Override // com.alipay.android.app.template.FBContext
    public boolean isOnloadFinish() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97d8620d", new Object[]{this})).booleanValue() : this.w;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        }
    }

    public void layout(FBView fBView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7336f48e", new Object[]{this, fBView});
        } else if (this.mCore == 0 || this.k == null || fBView == null || fBView.mNode == 0) {
        } else {
            e a2 = FBDocumentAssistor.a(this);
            nativeNodeDirtyLayout(fBView.mNode);
            nativeCoreLayout(this.mCore);
            FBDocumentAssistor.a(this, a2, 21, "Doc:nativeCoreLayout_api");
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public void layoutNodeWithDimensions(long j, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ec12be", new Object[]{this, new Long(j), new Integer(i2), new Integer(i3)});
        } else if (this.k == null || this.mCore == 0) {
        } else {
            e a2 = FBDocumentAssistor.a(this);
            nativeNodeSetMeasure(j, i2, i3);
            nativeCoreLayout(this.mCore);
            FBDocumentAssistor.a(this, a2, 21, "Doc:nativeCoreLayout_apiDimen");
        }
    }

    public final native void nativeCallCoreFuncPtr(FBDocument fBDocument, long j, long j2);

    public final native void nativeCoreLayout(long j);

    public final native void nativeNodeDirtyLayout(long j);

    public final native void nativeNodeSetMeasure(long j, int i2, int i3);

    public final native void nativeUpdateScreenSize(long j, int i2, int i3);

    public void onLoadFinish() {
        FBView fBView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23670df", new Object[]{this});
        } else if (i()) {
            cun.c("FBDocument", "tmFlags: rearranged onload cancelled here");
        } else {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                g();
            } else {
                Runnable runnable = new Runnable() { // from class: com.flybird.FBDocument.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        FBDocument.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            FBDocument fBDocument = FBDocument.this;
                            String str = FBDocument.JS_EXCEPTION_ACTION;
                            fBDocument.g();
                            if (BirdNestEngine.useNoFootprint) {
                                return;
                            }
                            BirdNestEngine.LogTracer2 logTracer = FBDocument.this.k0.getConfig().getLogTracer();
                            FBDocument fBDocument2 = FBDocument.this;
                            Tracker.recordPerformance(logTracer, fBDocument2.y, fBDocument2.n0);
                        } catch (Exception e2) {
                            FBLogger.e("FBDocument", "ui render failed, fbDocument destroyed!" + e2.getMessage());
                        }
                    }
                };
                if (this.m) {
                    this.b0.postAtFrontOfQueue(runnable);
                } else {
                    this.b0.post(runnable);
                }
            }
            Context context = null;
            FBView fBView2 = this.mRoot;
            if (fBView2 != null && fBView2.getInnerView() != null) {
                context = this.mRoot.getInnerView().getContext();
            }
            if (context == null) {
                context = this.k;
            }
            if (context != null && (fBView = this.mRoot) != null) {
                int innerViewTag = fBView.getInnerViewTag();
                View innerView = this.mRoot.getInnerView();
                FBView fBView3 = this.mRoot;
                FBView.dispatchOnLongClickEvent(false, false, innerView, fBView3, fBView3, innerViewTag);
                return;
            }
            FBLogger.e("FBDocument", "mRoot is null or ctx is null");
        }
    }

    @Override // com.flybird.FBRootFrameLayout.OnSizeChangedListener
    public void onSizeChanged(final int i2, final int i3, int i4, int i5) {
        FBView fBView;
        FBView fBView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else if (this.k == null || (fBView = this.mRoot) == null || fBView.getInnerView() == null || i2 == 0 || i3 == 0 || (fBView2 = this.mRoot) == null) {
        } else {
            fBView2.getInnerView().post(new Runnable() { // from class: com.flybird.FBDocument.20
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    FBDocument.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FBView fBView3 = FBDocument.this.mRoot;
                    if (fBView3 == null || fBView3.getInnerView() == null) {
                        return;
                    }
                    boolean z2 = (i2 == FBDocument.this.mRoot.getInnerView().getWidth() || i2 == FBDocument.this.screenSize[0]) ? false : true;
                    if (i3 == FBDocument.this.mRoot.getInnerView().getHeight() || i3 == FBDocument.this.screenSize[1]) {
                        z = false;
                    }
                    FBLogger.d("FBDocument", "onSizeChanged, autoAdaptWindow: " + FBDocument.this.l + ", heightChanged: " + z + ", widthChanged: " + z2);
                    FBDocument fBDocument = FBDocument.this;
                    if (fBDocument.e0 && i2 > 8192) {
                        FBLogger.d("FBDocument", "过宽保护逻辑生效, w: " + i2);
                        return;
                    }
                    if (z2 || (z && fBDocument.l)) {
                        fBDocument.handleWindowSizeChanged(i2, i3);
                    }
                    FBView fBView4 = FBDocument.this.mRoot;
                    if (fBView4 == null || fBView4.getInnerView() == null) {
                        return;
                    }
                    FBDocument.this.mRoot.getInnerView().setVisibility(0);
                }
            });
        }
    }

    public void openUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf7b396", new Object[]{this, str});
        } else {
            getEngine().getConfig().getUiWidgetProvider().openWebPage(str, this.N, this.k);
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public View queryView(String str) {
        HashMap<String, FBView> hashMap;
        FBView fBView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bea78320", new Object[]{this, str});
        }
        if (this.mCore == 0) {
            FBLogger.e("FBDocument", "dynamic exception case 000-006, this: " + this);
            return null;
        }
        if (!StringUtils.isEmpty(str)) {
            String queryViewId = queryViewId(this.mCore, str);
            if (!StringUtils.isEmpty(queryViewId) && (hashMap = this.F) != null && (fBView = hashMap.get(queryViewId)) != null) {
                return fBView.getInnerView();
            }
        } else {
            FBLogger.e("FBDocument", "dynamic exception case 000-007, this: " + this);
        }
        return null;
    }

    @Override // com.alipay.android.app.template.FBContext
    public void reloadData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73108f34", new Object[]{this, str});
            return;
        }
        this.p = new e();
        reloadDataWithResult(str);
    }

    @Override // com.alipay.android.app.template.FBContext
    public FBContext.ReloadResult reloadDataWithResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBContext.ReloadResult) ipChange.ipc$dispatch("3e5a4917", new Object[]{this, str});
        }
        if (this.mCore == 0) {
            FBLogger.e("FBDocument", "dynamic exception case 000-002, this: " + this + ", json: " + str);
            return FBContext.ReloadResult.INVALID_STATE;
        }
        if (this.mCore != 0) {
            updateDensity(this.mCore, FBTools.getDp(this.k));
        }
        a(Thread.currentThread());
        nativeCoreReLoadData(this.mCore, str);
        if (this.param.callback != null || i()) {
            this.b0.post(new Runnable() { // from class: com.flybird.FBDocument.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    FBDocument.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (FBDocument.this.mCore == 0) {
                    } else {
                        FBDocument fBDocument = FBDocument.this;
                        if (fBDocument.param == null) {
                            return;
                        }
                        if (!fBDocument.w && fBDocument.i()) {
                            cun.c("FBDocument", "tmFlags: rearranged onload trigger here");
                            FBDocument.this.g();
                        }
                        FBDocument.this.a(Thread.currentThread());
                        FBDocument fBDocument2 = FBDocument.this;
                        OnLoadCallback onLoadCallback = fBDocument2.param.callback;
                        if (onLoadCallback == null) {
                            return;
                        }
                        onLoadCallback.onLoadFinish(fBDocument2, true);
                    }
                }
            });
        }
        return FBContext.ReloadResult.OK;
    }

    @Override // com.alipay.android.app.template.FBContext
    public void safeCallJsMethod(final long j, final Object[] objArr, FBContext.JsExecOptions jsExecOptions, FBContext.JsExecCallback jsExecCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf9e004", new Object[]{this, new Long(j), objArr, jsExecOptions, jsExecCallback});
        } else {
            a(2, this, jsExecOptions, jsExecCallback, new cul() { // from class: com.flybird.-$$Lambda$FBDocument$dLlVOcymOAJs7dfFuB7wHN4ZcFc
                @Override // tb.cul
                public final Object apply(Object obj) {
                    return FBDocument.lambda$dLlVOcymOAJs7dfFuB7wHN4ZcFc(FBDocument.this, j, objArr, (Void) obj);
                }
            });
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public void safeExecuteJs(final String str, FBContext.JsExecOptions jsExecOptions, FBContext.JsExecCallback jsExecCallback) {
        IpChange ipChange = $ipChange;
        final boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365c932b", new Object[]{this, str, jsExecOptions, jsExecCallback});
            return;
        }
        if (jsExecCallback != null && jsExecOptions.getCallbackMode() != 0) {
            z = true;
        }
        a(1, this, jsExecOptions, jsExecCallback, new cul() { // from class: com.flybird.-$$Lambda$FBDocument$uUVKxB1rsVgcKne-AHPHNR3F840
            @Override // tb.cul
            public final Object apply(Object obj) {
                return FBDocument.m649lambda$uUVKxB1rsVgcKneAHPHNR3F840(FBDocument.this, z, str, (Void) obj);
            }
        });
    }

    @Deprecated
    public void setActionBarHeight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329d9fda", new Object[]{this, new Integer(i2)});
        } else {
            this.actionBarHeight = i2;
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public void setAutoFocusable(FBFocusable fBFocusable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a168f53", new Object[]{this, fBFocusable});
        } else {
            this.V = fBFocusable;
        }
    }

    public void setBizSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f0025d", new Object[]{this, str});
        } else {
            this.N = str;
        }
    }

    public void setClickMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d87eda", new Object[]{this, str});
        } else if ("global".equals(str)) {
            this.m0 = ClickMode.GLOBAL_PROTECT_CLICK;
        } else if ("individual".equals(str)) {
            this.m0 = ClickMode.INDIVIDUAL_PROTECT_CLICK;
        } else if (!"none".equals(str)) {
        } else {
            this.m0 = ClickMode.NO_PROTECT_CLICK;
        }
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.k = context;
        }
    }

    public void setElementEventObserver(TElementEventHandler tElementEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e8ee0f", new Object[]{this, tElementEventHandler});
        } else {
            this.D = tElementEventHandler;
        }
    }

    public void setGlobalClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e21b2a", new Object[]{this, new Boolean(z)});
        } else {
            setGlobalClick(z, 600L);
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public void setHasInput(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9204e9b", new Object[]{this, new Boolean(z)});
        } else {
            this.c0 = z;
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public void setParameter(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832e3a94", new Object[]{this, str, obj});
            return;
        }
        this.j0.put(str, obj);
        if (BirdNestEngine.Params.KEY_INDEX_URL.equals(str)) {
            this.x = (String) obj;
        } else {
            BirdNestEngine.Params.KEY_VIRTUAL_HOST.equals(str);
        }
    }

    public int setProp(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f628bf3", new Object[]{this, str, str2})).intValue();
        }
        e a2 = FBDocumentAssistor.a(this);
        if (this.k == null) {
            FBLogger.d("FBDocument", "document.setProp mContext == null");
            return -1;
        } else if ("focusableInTouchMode".equals(str)) {
            try {
                if (!new JSONObject(str2).optBoolean("value")) {
                    return 0;
                }
                Runnable runnable = new Runnable() { // from class: com.flybird.-$$Lambda$FBDocument$6NgluXnbVvuAsIaLWSeeV2jJQ7I
                    {
                        FBDocument.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FBDocument.lambda$6NgluXnbVvuAsIaLWSeeV2jJQ7I(FBDocument.this);
                    }
                };
                if (ieb.b()) {
                    runnable.run();
                } else {
                    ieb.c.post(runnable);
                }
                return 1;
            } catch (Throwable unused) {
                return -1;
            }
        } else {
            int performSetProp = JSPluginManager.getInstanse().performSetProp(this.k, str, str2);
            FBLogger.d("FBDocument", "document.setProp oldway name: " + str + ", args: " + str2 + ", result: " + performSetProp);
            StringBuilder sb = new StringBuilder();
            sb.append("Doc:setProp_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            FBDocumentAssistor.a(this, a2, 21, sb.toString());
            return performSetProp;
        }
    }

    public void setStorage(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c76ac80", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            FBDocumentAssistor.a(getEngine().inMemKV, str, str2, z);
        }
    }

    public final native boolean shouldSampleLog(long j, int i2);

    public void submit(String str) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fadd8a9", new Object[]{this, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object opt = jSONObject.opt("action");
            if (opt != null && (opt instanceof JSONObject)) {
                JSONObject optJSONObject = jSONObject.optJSONObject("action");
                if (optJSONObject.has("name")) {
                    String string = optJSONObject.getString("name");
                    if ((StringUtils.equals(string, "loc:back") || StringUtils.equals(string, "loc:exit")) && (context = this.k) != null && (context instanceof Activity)) {
                        hiddenKeyboardService(((Activity) context).getWindow().getDecorView(), true);
                    }
                }
            }
        } catch (Throwable th) {
            FBLogger.e("FBDocument", "parseAction", th);
        }
        OnTemplateClickListener onTemplateClickListener = this.C;
        if (onTemplateClickListener == null) {
            return;
        }
        onTemplateClickListener.onEvent(this, str, true);
    }

    public final native void updateDensity(long j, float f2);

    public void updateLayout(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c030cfa4", new Object[]{this, str});
        } else if (this.mCore != 0 && this.k0 != null) {
            if (!isOnloadFinish()) {
                this.o0 = System.currentTimeMillis();
            }
            final e a2 = FBDocumentAssistor.a(this);
            String str2 = "init";
            if (Looper.myLooper() != Looper.getMainLooper()) {
                final ConditionVariable conditionVariable = new ConditionVariable();
                Runnable runnable = new Runnable() { // from class: com.flybird.FBDocument.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        FBDocument.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            FBDocument fBDocument = FBDocument.this;
                            if (fBDocument.k0 != null && !fBDocument.isOnloadFinish()) {
                                long currentTimeMillis = System.currentTimeMillis() - FBDocument.this.o0;
                                if (currentTimeMillis > 1000) {
                                    Tracker.errorPoint(FBDocument.this.k0.getConfig().getLogTracer(), FBDocument.this.y, "schedule from " + Thread.currentThread() + " thread to ui thread cost: " + currentTimeMillis);
                                }
                                FBDocument.this.n0.put("bd_uiScheduleTime", String.valueOf(currentTimeMillis));
                            }
                            FBDocument fBDocument2 = FBDocument.this;
                            e eVar = a2;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Doc:updateLayout_wait_");
                            sb.append(!FBDocument.this.isOnloadFinish() ? "init" : "run");
                            FBDocumentAssistor.c(fBDocument2, eVar, 21, sb.toString());
                            FBDocument.this.a(str);
                            if (FBDocument.this.d0) {
                            }
                        } catch (Throwable th) {
                            try {
                                LogCatLog.e("FBDocument", th);
                            } finally {
                                if (!FBDocument.this.d0) {
                                    conditionVariable.open();
                                }
                            }
                        }
                    }
                };
                if (this.m) {
                    this.b0.postAtFrontOfQueue(runnable);
                } else {
                    this.b0.post(runnable);
                }
                if (this.d0) {
                    return;
                }
                conditionVariable.block();
                StringBuilder sb = new StringBuilder();
                sb.append("Doc:updateLayout_bg_");
                if (isOnloadFinish()) {
                    str2 = "run";
                }
                sb.append(str2);
                FBDocumentAssistor.c(this, a2, 21, sb.toString());
                return;
            }
            a(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Doc:updateLayout_fg_");
            if (isOnloadFinish()) {
                str2 = "run";
            }
            sb2.append(str2);
            FBDocumentAssistor.a(this, a2, 21, sb2.toString());
        } else {
            FBLogger.e("FBDocument", "FBDocument has been destroyed!");
        }
    }

    public void updateRemScale(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885b0b00", new Object[]{this, new Float(f2)});
        } else {
            this.t = f2;
        }
    }

    public void a(boolean z, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d5956f", new Object[]{this, new Boolean(z), eVar});
        } else if (!z && this.o != null) {
        } else {
            this.o = eVar;
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    /* renamed from: getBodyView */
    public FBView mo650getBodyView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBView) ipChange.ipc$dispatch("19685dcf", new Object[]{this}) : this.mRoot;
    }

    @Override // com.alipay.android.app.template.FBContext
    /* renamed from: getNav */
    public FBNav mo651getNav() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBNav) ipChange.ipc$dispatch("5fd489cf", new Object[]{this}) : this.u;
    }

    public void setGlobalClick(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4861c0da", new Object[]{this, new Boolean(z), new Long(j)});
            return;
        }
        this.Z = z;
        if (z) {
            return;
        }
        if (j == 2000) {
            this.b0.removeCallbacks(this.a0);
        }
        this.b0.postDelayed(this.a0, j);
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("935bc097", new Object[]{stackTraceElementArr});
        }
        StringBuilder sb = new StringBuilder();
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                sb.append(stackTraceElement.toString());
            }
        }
        return sb.toString();
    }

    public final void a(BirdNestEngine.Params params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5666c31e", new Object[]{this, params});
            return;
        }
        Map<String, String> map = params.appParams;
        if (map == null) {
            return;
        }
        if (StringUtils.equals(map.get("autoadaptwindow"), "true")) {
            this.l = true;
        }
        if (StringUtils.equals(params.appParams.get("asynclayout"), "true")) {
            this.d0 = true;
        }
        if (params.appParams.containsKey("actionSheetType")) {
            this.l0 = params.appParams.get("actionSheetType");
        }
        if (configRemScaled()) {
            if (StringUtils.equals(params.appParams.get("pixelToRem"), "true")) {
                this.s = true;
            }
            if (params.appParams.containsKey("scale")) {
                this.t = Float.parseFloat(params.appParams.get("scale"));
            }
        }
        if (StringUtils.equals(params.appParams.get("useAgednessVersion"), "true")) {
            FBLogger.d("FBDocument", "useAgednessVersion: true");
            Platform.e = true;
            return;
        }
        FBLogger.d("FBDocument", "useAgednessVersion: false");
        Platform.e = false;
    }

    public static void a(FBDocument fBDocument, final long j, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d615a9", new Object[]{fBDocument, new Long(j), str, str2});
        } else if (fBDocument == null) {
        } else {
            a(5, fBDocument, f, (FBContext.JsExecCallback) null, new cul() { // from class: com.flybird.-$$Lambda$iPCKJ4zYDSkhkp4_-663zizm78Q
                @Override // tb.cul
                public final Object apply(Object obj) {
                    return FBDocument.a(FBDocument.this, j, str, str2, (Void) obj);
                }
            });
        }
    }

    public static /* synthetic */ Pair a(FBDocument fBDocument, long j, String str, String str2, Void r9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("45ff781a", new Object[]{fBDocument, new Long(j), str, str2, r9});
        }
        try {
            long j2 = 0;
            if (fBDocument.mCore != 0) {
                j2 = j;
            }
            nativeInvokeCallback(j2, str, str2);
            return null;
        } catch (Throwable th) {
            cun.a("FBDocument_js_call", "safeNativeInvokeCallback error " + j + " event: " + str + " param: " + str2, th);
            return null;
        }
    }

    public static /* synthetic */ void b(cul culVar, cul culVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed147d5", new Object[]{culVar, culVar2});
        } else {
            culVar2.apply((Pair) culVar.apply(null));
        }
    }

    public /* synthetic */ Pair a(boolean z, String str, Void r7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("72cb7967", new Object[]{this, new Boolean(z), str, r7});
        }
        int i2 = 100;
        if (z) {
            String executeJsWithResult = executeJsWithResult(str);
            if (executeJsWithResult != null) {
                i2 = 1;
            }
            return new Pair(Integer.valueOf(i2), executeJsWithResult);
        }
        if (executeJs(str) != -1) {
            i2 = 1;
        }
        return new Pair(Integer.valueOf(i2), "");
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        FBView fBView = this.mRoot;
        if (fBView == null) {
            return null;
        }
        return fBView.getInnerView();
    }

    public /* synthetic */ Pair a(long j, Object[] objArr, Void r8) {
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("981055c6", new Object[]{this, new Long(j), objArr, r8});
        }
        if (callJsMethod(j, objArr) == -1) {
            i2 = 100;
        }
        return new Pair(Integer.valueOf(i2), "");
    }

    public static void a(FBDocument fBDocument, final long j, final String str, FBContext.JsExecOptions jsExecOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ce81bf", new Object[]{fBDocument, new Long(j), str, jsExecOptions});
        } else {
            a(3, fBDocument, jsExecOptions, (FBContext.JsExecCallback) null, new cul() { // from class: com.flybird.-$$Lambda$mEKfH7_42YhZ887zOBBVSbShwoI
                @Override // tb.cul
                public final Object apply(Object obj) {
                    return FBDocument.a(FBDocument.this, j, str, (Void) obj);
                }
            });
        }
    }

    public static /* synthetic */ Pair a(FBDocument fBDocument, long j, String str, Void r7) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1eab5a90", new Object[]{fBDocument, new Long(j), str, r7});
        }
        if (fBDocument != null) {
            try {
                j2 = fBDocument.mCore;
            } catch (Throwable th) {
                cun.a("FBDocument_js_call", "safeCallJsMethodWithJson error " + fBDocument + " funcKey: " + j + " json: " + str, th);
                return null;
            }
        } else {
            j2 = 0;
        }
        nativeCallJsMethodWithJson(j2, j, str);
        return null;
    }

    public static void a(FBDocument fBDocument, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89da2599", new Object[]{fBDocument, str});
        } else {
            a(4, fBDocument, h, (FBContext.JsExecCallback) null, new cul() { // from class: com.flybird.-$$Lambda$_KlqFRaViMENnArlC-hn1UFAgRs
                @Override // tb.cul
                public final Object apply(Object obj) {
                    return FBDocument.a(FBDocument.this, str, (Void) obj);
                }
            });
        }
    }

    public static /* synthetic */ Pair a(FBDocument fBDocument, String str, Void r5) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e3738c0a", new Object[]{fBDocument, str, r5});
        }
        if (fBDocument != null) {
            try {
                j = fBDocument.mCore;
            } catch (Throwable th) {
                cun.a("FBDocument_js_call", "safeExecJsCodeForPlugin error " + fBDocument + " code: " + str, th);
                return null;
            }
        } else {
            j = 0;
        }
        nativeExcuteJs(j, str);
        return null;
    }

    public static void a(int i2, FBDocument fBDocument, FBContext.JsExecOptions jsExecOptions, FBContext.JsExecCallback jsExecCallback, cul<Void, Pair<Integer, String>> culVar) {
        int i3;
        IpChange ipChange = $ipChange;
        int i4 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d6d0c1", new Object[]{new Integer(i2), fBDocument, jsExecOptions, jsExecCallback, culVar});
            return;
        }
        boolean b2 = ieb.b();
        boolean a2 = fBDocument.a();
        int asyncMode = jsExecOptions.getAsyncMode();
        int callbackMode = jsExecOptions.getCallbackMode();
        int i5 = 101;
        if (asyncMode != 0 || a2) {
            if (asyncMode == 0 && a2) {
                i3 = 101;
            } else if (asyncMode == 2 && b2) {
                throw new RuntimeException("ASYNC_MODE_ONLY_SYNC cannot be used on main thread");
            } else {
                if (asyncMode != 2 || b2 || a2) {
                    if (asyncMode != 2 || b2 || !a2) {
                        if (asyncMode == 1 && b2 && a2) {
                            i3 = 104;
                        } else if (asyncMode != 1 || !b2 || a2) {
                            if (asyncMode != 1 || b2 || !a2) {
                                if (asyncMode != 1 || b2 || a2) {
                                    cun.a("unknown input combination: async_mode:" + asyncMode + ", curr_is_main:" + b2 + ", safe_is_main:" + a2);
                                    i3 = 0;
                                }
                            }
                        }
                    }
                    i3 = 103;
                }
                i3 = 102;
            }
            if (jsExecCallback != null || callbackMode == 0) {
                i4 = 201;
            } else if (callbackMode == 1) {
                i4 = 202;
            } else if (callbackMode == 2) {
                i4 = 203;
            } else {
                cun.a("unknown input combination: " + callbackMode + ", " + jsExecCallback);
            }
            if (i3 == 103 || callbackMode != 0) {
                i5 = i3;
            }
            long blockTimeoutMs = jsExecOptions.getBlockTimeoutMs();
            cun.b("FBDocument_js_call", "safeExecuteJs " + i2 + " async_mode:" + asyncMode + ", curr_is_main:" + b2 + ", safe_is_main:" + a2 + " -> running:" + i5 + " callback:" + i4 + " block:" + blockTimeoutMs);
            a(fBDocument, i5, i4, blockTimeoutMs, jsExecCallback, culVar);
        }
        i3 = 100;
        if (jsExecCallback != null) {
        }
        i4 = 201;
        if (i3 == 103) {
        }
        i5 = i3;
        long blockTimeoutMs2 = jsExecOptions.getBlockTimeoutMs();
        cun.b("FBDocument_js_call", "safeExecuteJs " + i2 + " async_mode:" + asyncMode + ", curr_is_main:" + b2 + ", safe_is_main:" + a2 + " -> running:" + i5 + " callback:" + i4 + " block:" + blockTimeoutMs2);
        a(fBDocument, i5, i4, blockTimeoutMs2, jsExecCallback, culVar);
    }

    @Override // com.alipay.android.app.template.FBContext
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            destroy(null);
        }
    }

    public static void a(FBDocument fBDocument, int i2, final int i3, final long j, final FBContext.JsExecCallback jsExecCallback, final cul culVar) throws RuntimeException {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3477affa", new Object[]{fBDocument, new Integer(i2), new Integer(i3), new Long(j), jsExecCallback, culVar});
            return;
        }
        final cul culVar2 = new cul() { // from class: com.flybird.-$$Lambda$jC3SNphNwHCs7SB4fkqVDrlnaC4
            @Override // tb.cul
            public final Object apply(Object obj) {
                return FBDocument.a(FBContext.JsExecCallback.this, i3, (Pair) obj);
            }
        };
        switch (i2) {
            case 100:
                ieb.f28958a.submit(new Runnable() { // from class: com.flybird.-$$Lambda$90U1QeAJo7SY2SoEWZvcVWjNTmw
                    @Override // java.lang.Runnable
                    public final void run() {
                        FBDocument.a(FBDocument.this, j, culVar, culVar2);
                    }
                });
                return;
            case 101:
                ieb.c.post(new Runnable() { // from class: com.flybird.-$$Lambda$yjz478N7rDYYLZPpu-FP62rxdbA
                    @Override // java.lang.Runnable
                    public final void run() {
                        FBDocument.c(cul.this, culVar2);
                    }
                });
                return;
            case 102:
                if (!fBDocument.a()) {
                    z = fBDocument.s0.block(j);
                }
                if (z) {
                    ieb.c.post(new Runnable() { // from class: com.flybird.-$$Lambda$uSKJTrH37WJ9fOCoryBSb7MLnc0
                        @Override // java.lang.Runnable
                        public final void run() {
                            FBDocument.b(cul.this, culVar2);
                        }
                    });
                    return;
                }
                cun.a("FBDocument_js_call", "safeExecuteJsFiring: timeout 1. time: " + j);
                culVar2.apply(new Pair(101, ""));
                return;
            case 103:
                final ConditionVariable conditionVariable = new ConditionVariable();
                final AtomicReference atomicReference = new AtomicReference(null);
                ieb.c.post(new Runnable() { // from class: com.flybird.-$$Lambda$DR36_YfY41kCaOy7ZvHWbFIdGnE
                    @Override // java.lang.Runnable
                    public final void run() {
                        FBDocument.a(atomicReference, culVar, conditionVariable);
                    }
                });
                if (conditionVariable.block(j)) {
                    culVar2.apply(atomicReference.get());
                    return;
                }
                cun.a("FBDocument_js_call", "safeExecuteJsFiring: timeout 2. time: " + j);
                culVar2.apply(new Pair(101, ""));
                return;
            case 104:
                culVar2.apply((Pair) culVar.apply(null));
                return;
            default:
                cun.a("FBDocument_js_call", "safeExecuteJsFiring: unknown running_strategy:" + i2);
                return;
        }
    }

    public static /* synthetic */ void a(FBContext.JsExecCallback jsExecCallback, Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3ded43", new Object[]{jsExecCallback, pair});
        } else {
            jsExecCallback.onJsExecuted(((Integer) pair.first).intValue(), (String) pair.second);
        }
    }

    public static Void a(final FBContext.JsExecCallback jsExecCallback, int i2, final Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("cd544d8f", new Object[]{jsExecCallback, new Integer(i2), pair});
        }
        if (pair == null || jsExecCallback == null) {
            return null;
        }
        try {
            switch (i2) {
                case 201:
                    return null;
                case 202:
                    Runnable runnable = new Runnable() { // from class: com.flybird.-$$Lambda$-YLQnaH-7sQLo9oueXgzFBMtTg0
                        @Override // java.lang.Runnable
                        public final void run() {
                            FBDocument.a(FBContext.JsExecCallback.this, pair);
                        }
                    };
                    if (ieb.b()) {
                        runnable.run();
                        break;
                    } else {
                        ieb.c.post(runnable);
                        break;
                    }
                case 203:
                    jsExecCallback.onJsExecuted(((Integer) pair.first).intValue(), (String) pair.second);
                    break;
                default:
                    cun.a("unknown callback_strategy:" + i2);
                    break;
            }
            return null;
        } catch (Throwable th) {
            cun.a("FBDocument_js_call", "safeExecuteJsFiring: error caught on callback", th);
            return null;
        }
    }

    public static /* synthetic */ void a(cul culVar, cul culVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12385254", new Object[]{culVar, culVar2});
        } else {
            culVar2.apply((Pair) culVar.apply(null));
        }
    }

    public static /* synthetic */ void a(AtomicReference atomicReference, cul culVar, ConditionVariable conditionVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("877bcfbe", new Object[]{atomicReference, culVar, conditionVariable});
            return;
        }
        atomicReference.set(culVar.apply(null));
        conditionVariable.open();
    }

    public final void a(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d0af99", new Object[]{this, thread});
            return;
        }
        cun.b("FBDocument", "jsSafeThread: " + this + " " + this.r0.get() + " -> " + thread);
        this.r0 = new WeakReference<>(thread);
        ExecutorService executorService = ieb.f28958a;
        if (thread != Looper.getMainLooper().getThread()) {
            return;
        }
        this.s0.open();
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Thread thread = this.r0.get();
        ExecutorService executorService = ieb.f28958a;
        return thread == Looper.getMainLooper().getThread();
    }

    public static void a(FBDocument fBDocument, long j, final cul culVar, final cul culVar2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e08f301", new Object[]{fBDocument, new Long(j), culVar, culVar2});
            return;
        }
        if (!fBDocument.a()) {
            z = fBDocument.s0.block(j);
        }
        if (z) {
            ieb.c.post(new Runnable() { // from class: com.flybird.-$$Lambda$TPL7N4z4PKElPww5lM2S1GOK3vA
                @Override // java.lang.Runnable
                public final void run() {
                    FBDocument.a(cul.this, culVar2);
                }
            });
            return;
        }
        cun.a("FBDocument_js_call", "safeExecuteJsFiring: timeout 0. time: " + j);
        culVar2.apply(new Pair(101, ""));
    }

    /* JADX WARN: Removed duplicated region for block: B:413:0x02af A[Catch: all -> 0x0549, TRY_LEAVE, TryCatch #3 {all -> 0x0549, blocks: (B:292:0x0043, B:294:0x004b, B:296:0x004f, B:300:0x0056, B:302:0x0063, B:303:0x0083, B:305:0x0086, B:307:0x008d, B:309:0x009a, B:312:0x00a9, B:314:0x00b8, B:316:0x00bc, B:317:0x00cc, B:413:0x02af, B:414:0x02b2, B:319:0x00d1, B:321:0x00d7, B:322:0x00e4, B:324:0x00ec, B:325:0x00f5, B:327:0x00fd, B:329:0x0105, B:331:0x010d, B:333:0x0115, B:334:0x011d, B:336:0x0125, B:337:0x012d, B:339:0x0135, B:340:0x013d, B:342:0x0145, B:343:0x014e, B:345:0x0156, B:347:0x015f, B:356:0x018a, B:357:0x0193, B:359:0x019c, B:360:0x01a7, B:362:0x01ad, B:364:0x01b9, B:365:0x01c3, B:367:0x01cc, B:369:0x01d8, B:370:0x01e2, B:372:0x01ea, B:374:0x01ee, B:376:0x01f7, B:385:0x0221, B:387:0x0230, B:389:0x0235, B:391:0x023e, B:394:0x0253, B:395:0x025b, B:397:0x0263, B:398:0x026b, B:400:0x0274, B:401:0x027c, B:403:0x0284, B:407:0x0293, B:409:0x029d, B:308:0x0094, B:301:0x005d, B:349:0x0168, B:350:0x0171, B:352:0x0177, B:378:0x0200, B:379:0x0209, B:381:0x020f), top: B:536:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:555:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBDocument.a(java.lang.String):void");
    }

    public static /* synthetic */ void c(cul culVar, cul culVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6a3d56", new Object[]{culVar, culVar2});
        } else {
            culVar2.apply((Pair) culVar.apply(null));
        }
    }

    public final void a(final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
            return;
        }
        FBView fBView = this.mRoot;
        if (fBView != null) {
            View innerView = fBView.getInnerView();
            Context context = this.k;
            if ((innerView instanceof FBBodyFrameLayout) && (context instanceof Activity)) {
                ((FBBodyFrameLayout) innerView).setOnNextDispatchDraw(new Callable() { // from class: com.flybird.-$$Lambda$FBDocument$cbmQLxNvMA3iIBCyruA5UkLo6Sw
                    {
                        FBDocument.this = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return FBDocument.lambda$cbmQLxNvMA3iIBCyruA5UkLo6Sw(FBDocument.this, i2);
                    }
                });
                return;
            }
        }
        cun.b("DRAWING", "Drawing action SKIPPED for ctx " + hashCode() + ", len " + i2 + ", root " + fBView + " android_ctx " + this.k);
    }

    public /* synthetic */ void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        String[] a2 = ied.a(str);
        if (a2[0] == null) {
            return;
        }
        JSPluginManager instanse = JSPluginManager.getInstanse();
        String str3 = a2[0];
        str3.hashCode();
        if (str3.equals(JSPluginManager.INVOKE_NS_EXTHUB)) {
            instanse.invokeOnExtHub(this.k, a2[1], str2, this, 0L);
        } else if (!str3.equals(JSPluginManager.INVOKE_NS_FB)) {
            JSPlugin registeredPlugin = instanse.getRegisteredPlugin(this.k, this.k0, JSPlugin.FromCall.INVOKE, str, false);
            if (registeredPlugin == null) {
                return;
            }
            instanse.invokeOnJSPlugin(this.k, str, str2, this, 0L, registeredPlugin);
        } else if (a(a2[1], str2, 0L)) {
        } else {
            JSPlugin registeredPlugin2 = instanse.getRegisteredPlugin(this.k, this.k0, JSPlugin.FromCall.INVOKE, a2[1], false);
            if (registeredPlugin2 != null) {
                instanse.invokeOnJSPlugin(this.k, a2[1], str2, this, 0L, registeredPlugin2);
            } else {
                instanse.invokeOnExtHub(this.k, a2[1], str2, this, 0L);
            }
        }
    }

    public final boolean a(String str, String str2, long j) {
        FBBridge fBBridge;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dba98cc", new Object[]{this, str, str2, new Long(j)})).booleanValue();
        }
        BirdNestEngine.Params params = this.param;
        if (params != null && this.mCore != 0 && (fBBridge = params.eventBridge) != null && (obj = params.eventTarget) != null) {
            return fBBridge.sendOriginEvent(str, str2, obj, this.mCore, j, this);
        }
        return false;
    }

    public final void a(String str, final long j, String str2) {
        String[] strArr;
        String str3;
        final boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa210a1c", new Object[]{this, str, new Long(j), str2});
        } else if (StringUtils.equals(str2, "toast")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("text")) {
                    return;
                }
                Toast.makeText(this.k, jSONObject.getString("text"), 0).show();
                if (j == 0) {
                    return;
                }
                this.b0.post(new Runnable() { // from class: com.flybird.FBDocument.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        FBDocument.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            FBDocument.this.callJsMethod(j, null);
                        }
                    }
                });
            } catch (Throwable th) {
                FBLogger.e("FBDocument", "toast", th);
            }
        } else if (StringUtils.equals(str2, "confirm")) {
            this.b0.post(new AnonymousClass15(str, j));
        } else if (StringUtils.equals(str2, "asyncSubmit")) {
            if (this.C == null) {
                return;
            }
            FBClickCallBack fBClickCallBack = new FBClickCallBack(j, this);
            this.Y.add(fBClickCallBack);
            this.C.onAsyncEvent(this, str, fBClickCallBack);
        } else if (StringUtils.equals(str2, "actionSheet")) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                JSONArray optJSONArray = jSONObject2.optJSONArray("btns");
                String optString = jSONObject2.optString("title");
                boolean optBoolean = jSONObject2.optBoolean("needCancel");
                int length = optJSONArray.length();
                String[] strArr2 = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr2[i2] = optJSONArray.getString(i2);
                }
                if (jSONObject2.has("cancelBtn")) {
                    strArr = new String[length + 1];
                    System.arraycopy(strArr2, 0, strArr, 0, length);
                    strArr[length] = jSONObject2.getString("cancelBtn");
                    str3 = StringUtils.equals(this.l0, "AUActionSheet") ? jSONObject2.getString("cancelBtn") : "";
                    z = true;
                } else {
                    strArr = strArr2;
                    str3 = "";
                    z = false;
                }
                final int length2 = strArr.length;
                if (this.f0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.k);
                    if (!StringUtils.isEmpty(optString)) {
                        builder.setTitle(optString);
                    }
                    builder.setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.flybird.FBDocument.10
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            FBDocument.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i3)});
                            } else if (z && i3 == length2 - 1) {
                                dialogInterface.dismiss();
                            } else {
                                JSONObject jSONObject3 = new JSONObject();
                                try {
                                    jSONObject3.put("index", i3);
                                } catch (JSONException e2) {
                                    FBLogger.e(AnonymousClass10.class.getName(), "exception", e2);
                                }
                                FBDocument.this.callJsMethod(j, new Object[]{jSONObject3});
                            }
                        }
                    });
                    if (optBoolean) {
                        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.flybird.FBDocument.11
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            {
                                FBDocument.this = this;
                            }

                            @Override // android.content.DialogInterface.OnCancelListener
                            public void onCancel(DialogInterface dialogInterface) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                                    return;
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                try {
                                    jSONObject3.put("index", length2 - 1);
                                } catch (JSONException e2) {
                                    FBLogger.e(AnonymousClass11.class.getName(), "exception", e2);
                                }
                                FBDocument.this.callJsMethod(j, new Object[]{jSONObject3});
                            }
                        });
                    }
                    builder.create().show();
                    return;
                }
                Dialog createDialog = this.k0.getConfig().getUiWidgetProvider().createDialog(this.k, StringUtils.equals(this.l0, "AUActionSheet") ? "AUActionSheet" : "actionSheet", optString, str3, strArr, new AdapterView.OnItemClickListener() { // from class: com.flybird.FBDocument.12
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        FBDocument.this = this;
                    }

                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i3), new Long(j2)});
                        } else if (z && i3 == length2 - 1) {
                        } else {
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put("index", i3);
                            } catch (JSONException e2) {
                                FBLogger.e(AnonymousClass12.class.getName(), "exception", e2);
                            }
                            FBDocument.this.callJsMethod(j, new Object[]{jSONObject3});
                        }
                    }
                });
                if (optBoolean) {
                    createDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.flybird.FBDocument.13
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            FBDocument.this = this;
                        }

                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(DialogInterface dialogInterface) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                                return;
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put("index", length2 - 1);
                            } catch (JSONException e2) {
                                FBLogger.e(AnonymousClass13.class.getName(), "exception", e2);
                            }
                            FBDocument.this.callJsMethod(j, new Object[]{jSONObject3});
                        }
                    });
                }
                if (createDialog == null) {
                    return;
                }
                createDialog.show();
            } catch (Throwable th2) {
                FBLogger.e("FBDocument", "actionSheet", th2);
            }
        } else if (StringUtils.equals(str2, "alert")) {
            try {
                JSONObject jSONObject3 = new JSONObject(str);
                SystemDefaultDialog.showDialog(this.k, jSONObject3.optString("title"), jSONObject3.optString("message"), jSONObject3.optString(a.ATOM_EXT_button), new DialogInterface.OnClickListener() { // from class: com.flybird.FBDocument.14
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        FBDocument.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i3)});
                        } else {
                            FBDocument.this.callJsMethod(j, null);
                        }
                    }
                }, null, null, null, null);
            } catch (Throwable th3) {
                FBLogger.e("FBDocument", "alert", th3);
            }
        } else if (StringUtils.equals(str2, "picker")) {
            try {
                JSONObject jSONObject4 = new JSONObject(str);
                JSONArray jSONArray = jSONObject4.getJSONArray("btns");
                String optString2 = jSONObject4.optString("title");
                if (jSONArray == null || jSONArray.length() <= 0) {
                    return;
                }
                String[] strArr3 = new String[jSONArray.length()];
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    strArr3[i3] = jSONArray.getString(i3);
                }
                a(strArr3, j, optString2);
            } catch (Throwable th4) {
                FBLogger.e("FBDocument", "picker", th4);
            }
        } else if (StringUtils.equals(str2, "submit")) {
            submit(str);
        }
    }

    public final void a(String[] strArr, final long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df86677", new Object[]{this, strArr, new Long(j), str});
        } else if (strArr.length <= 0) {
        } else {
            if (this.f0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.k);
                if (str == null) {
                    str = "";
                }
                builder.setTitle(str);
                builder.setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.flybird.FBDocument.18
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        FBDocument.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("index", i2);
                        } catch (JSONException e2) {
                            FBLogger.e(AnonymousClass18.class.getName(), "exception", e2);
                        }
                        FBDocument.this.callJsMethod(j, new Object[]{jSONObject});
                    }
                });
                builder.create().show();
                return;
            }
            Dialog createDialog = this.k0.getConfig().getUiWidgetProvider().createDialog(this.k, "actionSheet", str, "", strArr, new AdapterView.OnItemClickListener() { // from class: com.flybird.FBDocument.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    FBDocument.this = this;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i2), new Long(j2)});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("index", i2);
                    } catch (JSONException e2) {
                        FBLogger.e(AnonymousClass19.class.getName(), "exception", e2);
                    }
                    FBDocument.this.callJsMethod(j, new Object[]{jSONObject});
                }
            });
            if (createDialog == null) {
                return;
            }
            createDialog.show();
        }
    }

    public /* synthetic */ Pair a(FBDocument fBDocument, long j, long j2, Void r13) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("94420b40", new Object[]{this, fBDocument, new Long(j), new Long(j2), r13});
        }
        if (fBDocument != null && fBDocument.mCore == 0) {
            cun.b("FBDocument", "dispatchCoreTask: 1 " + j + ", " + j2 + " core destroyed, ignoring");
            return null;
        }
        cun.b("FBDocument", "dispatchCoreTask: 1 " + j + ", " + j2 + " of core " + fBDocument);
        nativeCallCoreFuncPtr(this, j, j2);
        return null;
    }

    public /* synthetic */ void a(FBDocument fBDocument, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bdb524f", new Object[]{this, fBDocument, new Long(j), new Long(j2)});
        } else if (fBDocument != null && fBDocument.mCore == 0) {
            cun.b("FBDocument", "dispatchCoreTask: 2 " + j + ", " + j2 + " core destroyed, ignoring");
        } else {
            cun.b("FBDocument", "dispatchCoreTask: 2 " + j + ", " + j2 + " of core " + fBDocument);
            nativeCallCoreFuncPtr(this, j, j2);
        }
    }

    public void a(BirdNestEngine birdNestEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f3e768", new Object[]{this, birdNestEngine});
        } else {
            this.k0 = birdNestEngine;
        }
    }
}
