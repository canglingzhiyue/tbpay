package android.taobao.windvane.extra.uc.preRender;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.preRender.PreRenderWebView;
import android.taobao.windvane.util.m;
import android.taobao.windvane.util.p;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.URLUtil;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public abstract class BasePreInitManager<WebView extends PreRenderWebView> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTACH_EVENT = "WV.Event.Preload.Attach";
    public static final String INJECT_JS = "injectJs";
    private static final String KEY_EXTRA_FULL_URL = "fullUrl";
    public static final String ONLOAD_EVENT = "WV.Event.Preload.OnLoad";
    public static final String PRE_RENDER_URL_ADDITION = "&_wv_preload=true";
    public static final String PRE_RENDER_URL_ADDITION_JUDGE = "_wv_preload=true";
    public static final String PRE_RENDER_URL_ADDITION_KEY = "_wv_preload";
    public static final String PRE_RENDER_URL_ADDITION_VALUE = "true";
    public static final String TAG = "BasePreInitManager";
    public static final String TIMEOUT = "timeout";
    public Class<WebView> WebViewClass;
    private WebView preWeb;
    private Map<String, WebView> preRenderWebViews = new HashMap();
    private Map<String, WebView> preInitWebViews = new HashMap();
    private Map<String, ScheduleProtocolCallback> callbacks = new HashMap();

    static {
        kge.a(-1359523969);
    }

    public BasePreInitManager() {
        try {
            this.WebViewClass = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        } catch (Exception e) {
            e.printStackTrace();
        }
        String str = "WebViewClass " + this.WebViewClass;
    }

    public void setPreWeb(WebView webview) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461c0913", new Object[]{this, webview});
        } else {
            this.preWeb = webview;
        }
    }

    public WebView getPreWeb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebView) ipChange.ipc$dispatch("8f9e452b", new Object[]{this});
        }
        WebView webview = this.preWeb;
        this.preWeb = null;
        return webview;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.preWeb = null;
        }
    }

    public boolean clearAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c823e69f", new Object[]{this})).booleanValue();
        }
        for (WebView webview : this.preRenderWebViews.values()) {
            if (webview != null) {
                webview.destroy();
            }
        }
        for (WebView webview2 : this.preInitWebViews.values()) {
            if (webview2 != null) {
                webview2.destroy();
            }
        }
        this.preRenderWebViews.clear();
        this.preInitWebViews.clear();
        this.callbacks.clear();
        return true;
    }

    public boolean clearByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b06f490", new Object[]{this, str})).booleanValue();
        }
        String realKey = getRealKey(str);
        WebView remove = this.preRenderWebViews.remove(realKey);
        if (remove != null) {
            remove.destroy();
        }
        WebView remove2 = this.preInitWebViews.remove(realKey);
        if (remove2 != null) {
            remove2.destroy();
        }
        this.callbacks.remove(realKey);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean addPreInitWeb(String str, Context context, ScheduleProtocolCallback scheduleProtocolCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88cc271d", new Object[]{this, str, context, scheduleProtocolCallback})).booleanValue();
        }
        if (!WVCore.getInstance().isUCSupport()) {
            return false;
        }
        String realKey = getRealKey(str);
        if (this.preInitWebViews.containsKey(realKey)) {
            return false;
        }
        this.preInitWebViews.put(realKey, (PreRenderWebView) getNewObject((Class<WebView>) this.WebViewClass, new MutableContextWrapper(context)));
        if (scheduleProtocolCallback != null) {
            this.callbacks.put(realKey, scheduleProtocolCallback);
        }
        m.e(TAG, "add pre init webview success. key=[" + realKey + riy.ARRAY_END_STR);
        return true;
    }

    private String getRealKey(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b0285824", new Object[]{this, str}) : (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) ? removeHash(str) : str;
    }

    private String removeHash(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("14e8de3d", new Object[]{this, str}) : str.split("#")[0];
    }

    public void triggerRender(String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f6925f", new Object[]{this, str, str2, context});
        } else {
            triggerRender(str, str2, context, null);
        }
    }

    public boolean triggerRender(String str, String str2, Context context, ScheduleProtocolCallback scheduleProtocolCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a48b213", new Object[]{this, str, str2, context, scheduleProtocolCallback})).booleanValue() : triggerRender(str, str2, context, scheduleProtocolCallback, null);
    }

    public boolean triggerRender(String str, String str2, Context context, ScheduleProtocolCallback scheduleProtocolCallback, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8dae99a", new Object[]{this, str, str2, context, scheduleProtocolCallback, map})).booleanValue();
        }
        if (str2 == null || str2.isEmpty()) {
            return false;
        }
        m.e(TAG, "triggerRender() called with: key = [" + str + "], url = [" + str2 + "], ctx = [" + context + "], scheduleProtocolCallback = [" + scheduleProtocolCallback + "], args = [" + map + riy.ARRAY_END_STR);
        if (!WVCore.getInstance().isUCSupport()) {
            return false;
        }
        String realKey = getRealKey(str2);
        if (this.preRenderWebViews.containsKey(realKey)) {
            return false;
        }
        for (WebView webview : this.preRenderWebViews.values()) {
            if (webview != null) {
                webview.destroy();
            }
        }
        this.preRenderWebViews.clear();
        WebView remove = this.preInitWebViews.remove(getRealKey(str));
        if (remove == null && context != null) {
            remove = (WebView) getNewObject((Class<WebView>) this.WebViewClass, new MutableContextWrapper(context));
            remove.preRenderInit(str2);
            m.e(TAG, "obtain pre init webview failed by key=[" + str + "], init it");
        } else {
            m.e(TAG, "obtain pre init webview success by key=[" + str + riy.ARRAY_END_STR);
        }
        if (remove == null) {
            m.e(TAG, "triger render failed, for no inited webview");
            return false;
        }
        remove.isPreRender = true;
        if (remove.getUCExtension() != null) {
            remove.getUCExtension().setIsPreRender(true);
        }
        if (map != null && map.containsKey("injectJs")) {
            String str3 = map.get("injectJs");
            if (!StringUtils.isEmpty(str3)) {
                remove.injectJsEarly(str3);
            }
        }
        long j = Long.MAX_VALUE;
        if (map != null && map.containsKey("timeout")) {
            String str4 = map.get("timeout");
            if (!StringUtils.isEmpty(str4)) {
                try {
                    int parseInt = Integer.parseInt(str4);
                    j = System.currentTimeMillis() + parseInt;
                    m.e(TAG, "time=" + parseInt);
                } catch (Exception unused) {
                }
            }
        }
        remove.setExpireTime(j);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        View view = remove.getView();
        view.setTop(0);
        view.setBottom(displayMetrics.heightPixels);
        view.setLeft(0);
        view.setRight(displayMetrics.widthPixels);
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        remove.injectJsEarly("javascript:window._wv_preload=true");
        j.a();
        if (j.commonConfig.ax) {
            remove.loadUrl(p.a(str2, PRE_RENDER_URL_ADDITION_KEY, "true"));
        } else {
            remove.loadUrl(str2.concat(PRE_RENDER_URL_ADDITION));
        }
        this.preRenderWebViews.put(realKey, remove);
        if (scheduleProtocolCallback != null) {
            this.callbacks.put(realKey, scheduleProtocolCallback);
        }
        m.e(TAG, "trigger render success. key=[" + realKey + "],url = [" + str2.concat(PRE_RENDER_URL_ADDITION) + riy.ARRAY_END_STR);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void addPreRenderWeb(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a582d1b", new Object[]{this, str, context});
            return;
        }
        PreRenderWebView preRenderWebView = (PreRenderWebView) getNewObject((Class<WebView>) this.WebViewClass, new MutableContextWrapper(context));
        preRenderWebView.preRenderInit(str);
        preRenderWebView.isPreRender = true;
        j.a();
        if (j.commonConfig.ax) {
            preRenderWebView.loadUrl(p.a(str, PRE_RENDER_URL_ADDITION_KEY, "true"));
        } else {
            preRenderWebView.loadUrl(str.concat(PRE_RENDER_URL_ADDITION));
        }
        this.preRenderWebViews.put(getRealKey(str), preRenderWebView);
        m.e(TAG, "add pre render webview success. key=[" + getRealKey(str) + "], url = [" + str.concat(PRE_RENDER_URL_ADDITION) + riy.ARRAY_END_STR);
    }

    public WebView getPreRender(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebView) ipChange.ipc$dispatch("304f5711", new Object[]{this, str, context}) : getPreRender(str, context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WebView getPreRender(java.lang.String r25, android.content.Context r26, java.util.Map<java.lang.String, java.lang.String> r27) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.preRender.BasePreInitManager.getPreRender(java.lang.String, android.content.Context, java.util.Map):android.taobao.windvane.extra.uc.preRender.PreRenderWebView");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WebView getPreRenderWebView(java.lang.String r10, android.content.Context r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.extra.uc.preRender.BasePreInitManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r9
            r2 = 1
            r1[r2] = r10
            r10 = 2
            r1[r10] = r11
            java.lang.String r10 = "2603d5e"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            android.taobao.windvane.extra.uc.preRender.PreRenderWebView r10 = (android.taobao.windvane.extra.uc.preRender.PreRenderWebView) r10
            return r10
        L1b:
            r0 = 0
            if (r10 == 0) goto Lbe
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L26
            goto Lbe
        L26:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getPreRenderWebView for url: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "BasePreInitManager"
            android.taobao.windvane.util.m.e(r2, r1)
            java.lang.String r1 = r9.getRealKey(r10)
            java.util.Map<java.lang.String, WebView extends android.taobao.windvane.extra.uc.preRender.PreRenderWebView> r2 = r9.preRenderWebViews
            java.lang.Object r2 = r2.get(r1)
            android.taobao.windvane.extra.uc.preRender.PreRenderWebView r2 = (android.taobao.windvane.extra.uc.preRender.PreRenderWebView) r2
            if (r2 != 0) goto L84
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.util.Map<java.lang.String, WebView extends android.taobao.windvane.extra.uc.preRender.PreRenderWebView> r3 = r9.preRenderWebViews
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L58:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L84
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            android.net.Uri r5 = android.net.Uri.parse(r4)
            boolean r6 = r9.isSameUrl(r5, r1)
            if (r6 == 0) goto L58
            boolean r1 = r9.isSameQuery(r5, r1)
            if (r1 == 0) goto L86
            java.util.Map<java.lang.String, WebView extends android.taobao.windvane.extra.uc.preRender.PreRenderWebView> r1 = r9.preRenderWebViews
            java.lang.Object r1 = r1.get(r4)
            android.taobao.windvane.extra.uc.preRender.PreRenderWebView r1 = (android.taobao.windvane.extra.uc.preRender.PreRenderWebView) r1
            r2 = r1
            goto L86
        L84:
            java.lang.String r4 = ""
        L86:
            if (r2 != 0) goto L89
            return r0
        L89:
            boolean r1 = r2.isPreRenderSuccess()
            if (r1 != 0) goto L90
            return r0
        L90:
            long r5 = r2.getExpireTime()
            long r7 = java.lang.System.currentTimeMillis()
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L9d
            return r0
        L9d:
            java.util.Map<java.lang.String, com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback> r1 = r9.callbacks
            java.lang.Object r1 = r1.get(r4)
            com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback r1 = (com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback) r1
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "fullUrl"
            r3.put(r4, r10)
            if (r1 == 0) goto Lb8
            boolean r10 = r1.resolveParameter(r10, r3)
            if (r10 != 0) goto Lb8
            goto Lb9
        Lb8:
            r0 = r2
        Lb9:
            if (r0 == 0) goto Lbe
            r0.setOuterContext(r11)
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.preRender.BasePreInitManager.getPreRenderWebView(java.lang.String, android.content.Context):android.taobao.windvane.extra.uc.preRender.PreRenderWebView");
    }

    private WebView clearCacheInQueue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebView) ipChange.ipc$dispatch("89b10fc5", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        return this.preRenderWebViews.remove(str);
    }

    private boolean isSameUrl(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbeb3d0a", new Object[]{this, uri, uri2})).booleanValue();
        }
        String host = uri.getHost();
        String host2 = uri2.getHost();
        if (!StringUtils.equals(host, host2)) {
            m.e(TAG, "host equal=[false],require=[" + host + "],real=[" + host2 + riy.ARRAY_END_STR);
            return false;
        }
        String path = uri.getPath();
        String path2 = uri2.getPath();
        if (StringUtils.equals(path, path2)) {
            return true;
        }
        m.e(TAG, "path equal=[false],require=[" + path + "],real=[" + path2 + riy.ARRAY_END_STR);
        return false;
    }

    private boolean isSameQuery(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0bab9a3", new Object[]{this, uri, uri2})).booleanValue();
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames == null || queryParameterNames.isEmpty()) {
            return true;
        }
        Set<String> queryParameterNames2 = uri2.getQueryParameterNames();
        if (queryParameterNames2 == null || queryParameterNames2.isEmpty()) {
            m.e(TAG, "real url miss query");
            return false;
        }
        for (String str : queryParameterNames) {
            String queryParameter = uri.getQueryParameter(str);
            String queryParameter2 = uri2.getQueryParameter(str);
            if (!StringUtils.equals(queryParameter, queryParameter2)) {
                try {
                    JSONObject parseObject = JSONObject.parseObject(queryParameter);
                    JSONObject parseObject2 = JSONObject.parseObject(queryParameter2);
                    if (parseObject2 != null && parseObject != null) {
                        for (String str2 : parseObject.keySet()) {
                            if (!StringUtils.equals(parseObject.getString(str2), parseObject2.getString(str2))) {
                                m.e(TAG, "query value is not equal, require=[" + queryParameter + "],real=[" + queryParameter2 + riy.ARRAY_END_STR);
                                return false;
                            }
                        }
                        continue;
                    }
                } catch (Throwable unused) {
                    m.e(TAG, "query value is not equal, require=[" + queryParameter + "],real=[" + queryParameter2 + riy.ARRAY_END_STR);
                    return false;
                }
            }
        }
        return true;
    }

    public <T> T getNewObject(Class<T> cls, Context context) {
        try {
            return cls.getConstructor(Context.class).newInstance(context);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
