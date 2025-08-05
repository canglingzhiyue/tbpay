package android.taobao.windvane.jsbridge;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.adm;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class l implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CALL_ALIAS = 7;
    public static final int CALL_DESTROY = 8;
    public static final int CALL_EXECUTE = 0;
    public static final int CALL_METHOD = 1;
    public static final int CLOSED = 4;
    public static final int ERROR_EXECUTE = 6;
    public static final int NO_CLASS = 5;
    public static final int NO_METHOD = 2;
    public static final int NO_PERMISSION = 3;
    public static boolean b;
    private static l c;
    private static Handler d;
    private static Pattern g;
    private boolean e = true;
    private boolean f = false;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<h> f1666a = null;

    static {
        kge.a(-563947510);
        kge.a(-1043440182);
        b = true;
        g = null;
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f1666a != null) {
            Iterator<h> it = this.f1666a.iterator();
            while (it.hasNext()) {
                h next = it.next();
                b(next, "");
                android.taobao.windvane.util.m.c("WVJsBridge", "excute TailJSBridge : " + next.d + " : " + next.e);
            }
            this.f1666a.clear();
            this.f1666a = null;
        }
    }

    public static synchronized l b() {
        synchronized (l.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l) ipChange.ipc$dispatch("a7c1a3e9", new Object[0]);
            }
            if (c == null) {
                c = new l();
            }
            return c;
        }
    }

    private l() {
        d = new Handler(Looper.getMainLooper(), this);
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f) {
        } else {
            this.f = true;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void a(p pVar, h hVar, IJsApiFailedCallBack iJsApiFailedCallBack, IJsApiSucceedCallBack iJsApiSucceedCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e55d547", new Object[]{this, pVar, hVar, iJsApiFailedCallBack, iJsApiSucceedCallBack});
        } else if (hVar == null) {
        } else {
            hVar.h = iJsApiFailedCallBack;
            hVar.i = iJsApiSucceedCallBack;
            if (TextUtils.isEmpty(hVar.f)) {
                hVar.f = "{}";
            }
            android.taobao.windvane.util.m.c("WVJsBridge", "before call object=[" + hVar.d + "].");
            if (hVar.d != null && pVar != null) {
                hVar.b = pVar.a(hVar.d);
                if (hVar.b instanceof e) {
                    a(0, hVar);
                    return;
                } else {
                    a(2, hVar);
                    return;
                }
            }
            android.taobao.windvane.util.m.c("WVJsBridge", "before call param is null");
        }
    }

    public void a(IWVWebView iWVWebView, String str, adm admVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5484b25c", new Object[]{this, iWVWebView, str, admVar});
        } else {
            a(iWVWebView, str, null, null, admVar);
        }
    }

    public void a(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01caed6", new Object[]{this, iWVWebView, str});
        } else {
            a(iWVWebView, str, null, null, null);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [android.taobao.windvane.jsbridge.l$1] */
    private void a(IWVWebView iWVWebView, String str, IJsApiSucceedCallBack iJsApiSucceedCallBack, IJsApiFailedCallBack iJsApiFailedCallBack, adm admVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97229025", new Object[]{this, iWVWebView, str, iJsApiSucceedCallBack, iJsApiFailedCallBack, admVar});
            return;
        }
        android.taobao.windvane.util.m.c("WVJsBridge", "callMethod: url=" + str);
        if (!this.f) {
            android.taobao.windvane.util.m.d("WVJsBridge", "jsbridge is not init.");
            return;
        }
        final h a2 = a(str);
        if (a2 == null) {
            android.taobao.windvane.util.m.d("WVJsBridge", "url format error and call canceled. url=" + str);
            return;
        }
        a2.f1664a = iWVWebView;
        if (admVar != null) {
            a2.j = admVar.getCurId();
        }
        a2.b();
        if (iJsApiSucceedCallBack != null) {
            a2.i = iJsApiSucceedCallBack;
        }
        if (iJsApiFailedCallBack != null) {
            a2.h = iJsApiFailedCallBack;
        }
        final String url = a2.f1664a.getUrl();
        if (b) {
            try {
                JSONObject.parse(a2.f);
                z = false;
            } catch (Throwable th) {
                if (android.taobao.windvane.monitor.o.getJsBridgeMonitor() != null) {
                    android.taobao.windvane.monitor.g jsBridgeMonitor = android.taobao.windvane.monitor.o.getJsBridgeMonitor();
                    String message = th.getMessage();
                    String str2 = a2.f;
                    jsBridgeMonitor.commitParamParseError(url, message, str2, a2.d + "." + a2.e);
                }
                z = true;
            }
            if (z) {
                iWVWebView.evaluateJavascript(String.format("javascript:window.WindVane&&window.WindVane.getParam(%s);", a2.g), new ValueCallback<String>() { // from class: android.taobao.windvane.jsbridge.WVJsBridge$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v2, types: [android.taobao.windvane.jsbridge.WVJsBridge$1$1] */
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str3});
                            return;
                        }
                        if (str3.startsWith("\"")) {
                            str3 = JSONObject.parse(str3).toString();
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            a2.f = str3;
                        }
                        new AsyncTask<Void, Integer, Void>() { // from class: android.taobao.windvane.jsbridge.WVJsBridge$1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                            @Override // android.os.AsyncTask
                            public /* synthetic */ Void doInBackground(Void[] voidArr) {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                            }

                            public Void a(Void... voidArr) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return (Void) ipChange3.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                                }
                                l.this.a(a2, url);
                                return null;
                            }
                        }.execute(new Void[0]);
                    }
                });
                return;
            }
        }
        new AsyncTask<Void, Integer, Void>() { // from class: android.taobao.windvane.jsbridge.l.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
            @Override // android.os.AsyncTask
            public /* synthetic */ Void doInBackground(Void[] voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            public Void a(Void... voidArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                }
                l.this.a(a2, url);
                return null;
            }
        }.execute(new Void[0]);
    }

    public void a(h hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05e7292", new Object[]{this, hVar, str});
            return;
        }
        android.taobao.windvane.util.m.c("WVJsBridge", "callMethod-obj:" + hVar.d + " method:" + hVar.e + " param:" + hVar.f + " sid:" + hVar.g);
        if (!this.e || hVar.f1664a == null) {
            try {
                if (g == null) {
                    g = Pattern.compile(android.taobao.windvane.config.j.commonConfig.aQ);
                }
                Matcher matcher = g.matcher(str);
                if (matcher != null && matcher.matches()) {
                    android.taobao.windvane.util.m.e("WVJsBridge", hVar.d + " always allow jsapi permission " + str);
                }
                android.taobao.windvane.util.m.e("WVJsBridge", "jsbridge is closed.");
                a(4, hVar);
                return;
            } catch (Throwable th) {
                android.taobao.windvane.util.m.e("WVJsBridge", "jsbridge is closed. e：" + th);
                a(4, hVar);
                return;
            }
        }
        if (android.taobao.windvane.config.j.commonConfig.bW) {
            m a2 = m.a();
            if (a2.a(hVar.f1664a)) {
                if (a2.a(str, hVar.d, hVar.e, hVar.f)) {
                    b(hVar, str);
                    return;
                } else {
                    a(3, hVar);
                    return;
                }
            }
        } else if (n.c() != null && !n.c().isEmpty()) {
            for (k kVar : n.c()) {
                if (kVar.a(hVar.f1664a)) {
                    if (kVar.a(str, hVar.d, hVar.e, hVar.f)) {
                        b(hVar, str);
                        return;
                    } else {
                        a(3, hVar);
                        return;
                    }
                }
            }
        }
        if (n.b() != null && !n.b().isEmpty()) {
            for (j jVar : n.b()) {
                if (!jVar.a(str, hVar.d, hVar.e, hVar.f)) {
                    android.taobao.windvane.util.m.d("WVJsBridge", "preprocessor call fail, callMethod cancel.");
                    com.taobao.android.riverlogger.b b2 = com.taobao.android.riverlogger.e.a(RVLLevel.Warn, "Bridge").a("apiAuthCheck", hVar.getCurId()).b(hVar.getPId());
                    com.taobao.android.riverlogger.b b3 = b2.b("3", "NO PERMISSION With Preprocessor.apiAuthCheck, processor is " + jVar.getClass().getName());
                    b3.a(hVar.d + "#" + hVar.e, (Object) hVar.f).a();
                    a(3, hVar);
                    return;
                }
            }
        }
        if (n.a() != null && !n.a().isEmpty()) {
            for (f fVar : n.a()) {
                if (fVar.a(str, hVar, new g())) {
                    android.taobao.windvane.util.m.d("WVJsBridge", "enter  WVAsyncAuthCheck preprocessor  ");
                    com.taobao.android.riverlogger.b b4 = com.taobao.android.riverlogger.e.a(RVLLevel.Warn, "Bridge").a("AsyncApiAuthCheck", hVar.getCurId()).b(hVar.getPId());
                    com.taobao.android.riverlogger.b b5 = b4.b("3", "Preprocessor.AsyncapiAuthCheck success and then return, processor is " + fVar.getClass().getName());
                    b5.a(hVar.d + "#" + hVar.e, (Object) hVar.f).a();
                    return;
                }
            }
        }
        b(hVar, str);
    }

    public static void b(h hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1143f53", new Object[]{hVar, str});
            return;
        }
        Map<String, String> b2 = q.b(hVar.d, hVar.e);
        if (b2 != null) {
            if (android.taobao.windvane.util.m.a()) {
                android.taobao.windvane.util.m.c("WVJsBridge", "call method through alias name. newObject: " + b2.get("name") + " newMethod: " + b2.get("method"));
            }
            hVar.d = b2.get("name");
            hVar.e = b2.get("method");
            a(7, hVar);
        }
        Object jsObject = hVar.f1664a.getJsObject(hVar.d);
        if (jsObject != null) {
            if (jsObject instanceof e) {
                hVar.b = jsObject;
                a(0, hVar);
                return;
            } else if (jsObject instanceof String) {
                android.taobao.windvane.util.m.e("WVJsBridge", "cannot call method for context is null");
                a(8, hVar);
                return;
            } else {
                try {
                    if (hVar.e == null) {
                        return;
                    }
                    Method method = jsObject.getClass().getMethod(hVar.e, Object.class, String.class);
                    if (method.isAnnotationPresent(WindVaneInterface.class)) {
                        hVar.b = jsObject;
                        hVar.c = method;
                        a(1, hVar);
                        return;
                    }
                    android.taobao.windvane.util.m.d("WVJsBridge", "callMethod: Method " + hVar.e + " didn't has @WindVaneInterface annotation, obj=" + hVar.d);
                    return;
                } catch (NoSuchMethodException unused) {
                    android.taobao.windvane.util.m.e("WVJsBridge", "callMethod: Method " + hVar.e + " didn't found. It must has two parameter, Object.class and String.class, obj=" + hVar.d);
                    return;
                }
            }
        }
        android.taobao.windvane.util.m.e("WVJsBridge", "callMethod: Plugin " + hVar.d + " didn't found, you should call WVPluginManager.registerPlugin first.");
        a(5, hVar);
    }

    public static void a(int i, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a0347b", new Object[]{new Integer(i), hVar});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = hVar;
        if (Looper.myLooper() == d.getLooper() || (hVar != null && !hVar.k)) {
            b().handleMessage(obtain);
        } else {
            d.sendMessage(obtain);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        h hVar = (h) message.obj;
        if (hVar == null) {
            android.taobao.windvane.util.m.e("WVJsBridge", "CallMethodContext is null, and do nothing.");
            return false;
        }
        WVCallBackContext wVCallBackContext = new WVCallBackContext(hVar.f1664a, hVar.g, hVar.d, hVar.e, hVar.i, hVar.h);
        if (hVar.b != null) {
            wVCallBackContext.setInstancename(hVar.b.getClass().getName());
        }
        wVCallBackContext.setPid(hVar.j);
        String str = "{}";
        String str2 = "";
        switch (message.what) {
            case 0:
                Object obj = hVar.b;
                android.taobao.windvane.util.m.e("WVJsBridge", "call method=[" + hVar.d + "." + hVar.e + "]. class=" + hVar.b);
                e eVar = (e) obj;
                String str3 = hVar.e;
                if (!TextUtils.isEmpty(hVar.f)) {
                    str = hVar.f;
                }
                if (!eVar.executeSafe(str3, str, wVCallBackContext)) {
                    android.taobao.windvane.util.m.e("WVJsBridge", "WVApiPlugin execute failed.object:" + hVar.d + ", method: " + hVar.e);
                    a(6, hVar);
                } else {
                    try {
                        ConcurrentHashMap<String, Integer> concurrentHashMap = IWVWebView.JsbridgeHis;
                        int i = 1;
                        String str4 = hVar.d + "." + hVar.e;
                        if (concurrentHashMap.containsKey(str4)) {
                            i = Integer.valueOf(concurrentHashMap.get(str4).intValue() + 1);
                        }
                        IWVWebView.JsbridgeHis.put(str4, i);
                    } catch (Exception unused) {
                    }
                }
                return true;
            case 1:
                Object obj2 = hVar.b;
                try {
                    Method method = hVar.c;
                    Object[] objArr = new Object[2];
                    objArr[0] = wVCallBackContext;
                    if (!TextUtils.isEmpty(hVar.f)) {
                        str = hVar.f;
                    }
                    objArr[1] = str;
                    method.invoke(obj2, objArr);
                } catch (Exception e) {
                    android.taobao.windvane.util.m.e("WVJsBridge", "call method " + hVar.c + " exception. " + e.getMessage());
                }
                return true;
            case 2:
                r rVar = new r();
                rVar.a("HY_NO_HANDLER");
                StringBuilder sb = new StringBuilder();
                sb.append("No Method Error: method=[");
                sb.append(hVar.d);
                sb.append(".");
                sb.append(hVar.e);
                sb.append("],url=[");
                if (wVCallBackContext.getWebview() != null) {
                    str2 = wVCallBackContext.getWebview().getUrl();
                }
                sb.append(str2);
                sb.append(riy.ARRAY_END_STR);
                rVar.a("msg", sb.toString());
                wVCallBackContext.error(rVar);
                return true;
            case 3:
                r rVar2 = new r();
                rVar2.a("HY_NO_PERMISSION");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("method=[");
                sb2.append(hVar.d);
                sb2.append(".");
                sb2.append(hVar.e);
                sb2.append("],url=[");
                if (wVCallBackContext.getWebview() != null) {
                    str2 = wVCallBackContext.getWebview().getUrl();
                }
                sb2.append(str2);
                sb2.append(riy.ARRAY_END_STR);
                rVar2.a("msg", sb2.toString());
                wVCallBackContext.error(rVar2);
                return true;
            case 4:
                r rVar3 = new r();
                rVar3.a("HY_CLOSED");
                StringBuilder sb3 = new StringBuilder();
                sb3.append("method=[");
                sb3.append(hVar.d);
                sb3.append(".");
                sb3.append(hVar.e);
                sb3.append("],url=[");
                if (wVCallBackContext.getWebview() != null) {
                    str2 = wVCallBackContext.getWebview().getUrl();
                }
                sb3.append(str2);
                sb3.append(riy.ARRAY_END_STR);
                rVar3.a("msg", sb3.toString());
                wVCallBackContext.error(rVar3);
                return true;
            case 5:
                r rVar4 = new r();
                rVar4.a("HY_NO_HANDLER");
                StringBuilder sb4 = new StringBuilder();
                sb4.append("No Class Error: method=[");
                sb4.append(hVar.d);
                sb4.append(".");
                sb4.append(hVar.e);
                sb4.append("],url=[");
                if (wVCallBackContext.getWebview() != null) {
                    str2 = wVCallBackContext.getWebview().getUrl();
                }
                sb4.append(str2);
                sb4.append(riy.ARRAY_END_STR);
                rVar4.a("msg", sb4.toString());
                wVCallBackContext.error(rVar4);
                return true;
            case 6:
                r rVar5 = new r();
                rVar5.a("HY_ERROR_EXECUTE");
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Execute error:method=[");
                sb5.append(hVar.d);
                sb5.append(".");
                sb5.append(hVar.e);
                sb5.append("],url=[");
                if (wVCallBackContext.getWebview() != null) {
                    str2 = wVCallBackContext.getWebview().getUrl();
                }
                sb5.append(str2);
                sb5.append(riy.ARRAY_END_STR);
                rVar5.a("msg", sb5.toString());
                wVCallBackContext.error(rVar5);
                return true;
            case 7:
                r rVar6 = new r();
                rVar6.a("CALL_ALIAS");
                if (wVCallBackContext.getWebview() != null) {
                    str2 = wVCallBackContext.getWebview().getUrl();
                }
                rVar6.a("msg", str2);
                rVar6.b();
                wVCallBackContext.commitJsBridgeReturn(rVar6);
                return true;
            case 8:
                r rVar7 = new r();
                rVar7.a("HY_FAILED");
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Null Context Error:");
                if (wVCallBackContext.getWebview() != null) {
                    str2 = wVCallBackContext.getWebview().getUrl();
                }
                sb6.append(str2);
                rVar7.a("msg", sb6.toString());
                wVCallBackContext.error(rVar7);
                return true;
            default:
                return false;
        }
    }

    private h a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("fbc7ee84", new Object[]{this, str});
        }
        if (str != null && str.startsWith("hybrid://")) {
            try {
                h hVar = new h();
                int indexOf = str.indexOf(58, 9);
                hVar.d = str.substring(9, indexOf);
                int indexOf2 = str.indexOf(47, indexOf);
                hVar.g = str.substring(indexOf + 1, indexOf2);
                int indexOf3 = str.indexOf(63, indexOf2);
                if (indexOf3 > 0) {
                    hVar.e = str.substring(indexOf2 + 1, indexOf3);
                    hVar.f = str.substring(indexOf3 + 1);
                } else {
                    hVar.e = str.substring(indexOf2 + 1);
                }
                if (hVar.d.length() > 0 && hVar.g.length() > 0) {
                    if (hVar.e.length() > 0) {
                        return hVar;
                    }
                }
            } catch (StringIndexOutOfBoundsException unused) {
            }
        }
        return null;
    }
}
