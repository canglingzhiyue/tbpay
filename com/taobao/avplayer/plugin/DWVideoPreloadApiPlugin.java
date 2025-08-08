package com.taobao.avplayer.plugin;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.aa;
import com.taobao.mediaplay.d;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import com.taobao.taobaoavsdk.Tracer.c;
import com.taobao.taobaoavsdk.cache.library.i;
import com.taobao.taobaoavsdk.util.b;
import java.util.HashMap;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.kkr;
import tb.oyw;

/* loaded from: classes6.dex */
public class DWVideoPreloadApiPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<String, String> preloadLoadMap;

    public static /* synthetic */ Object ipc$super(DWVideoPreloadApiPlugin dWVideoPreloadApiPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ HashMap access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("3d0ed1a", new Object[0]) : preloadLoadMap;
    }

    public static /* synthetic */ IWVWebView access$100(DWVideoPreloadApiPlugin dWVideoPreloadApiPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("823c3d89", new Object[]{dWVideoPreloadApiPlugin}) : dWVideoPreloadApiPlugin.mWebView;
    }

    public static /* synthetic */ IWVWebView access$200(DWVideoPreloadApiPlugin dWVideoPreloadApiPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("4a9a6228", new Object[]{dWVideoPreloadApiPlugin}) : dWVideoPreloadApiPlugin.mWebView;
    }

    public static /* synthetic */ IWVWebView access$300(DWVideoPreloadApiPlugin dWVideoPreloadApiPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("12f886c7", new Object[]{dWVideoPreloadApiPlugin}) : dWVideoPreloadApiPlugin.mWebView;
    }

    static {
        kge.a(-1173023978);
        preloadLoadMap = new HashMap<>();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWVideoPreloadApiPlugin);
        if (wVCallBackContext == null) {
            return false;
        }
        if ("precacheVideo".equals(str)) {
            return start(str2, wVCallBackContext);
        }
        if (!"cancel".equals(str)) {
            return false;
        }
        return cancel(str2, wVCallBackContext);
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    public String getResult(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d52f5b28", new Object[]{this, str, str2, str3});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", str);
            if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3)) {
                jSONObject.put(str2, str3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public String getResult(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf4fcc94", new Object[]{this, str, str2, str3, str4, str5});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", str);
            if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3)) {
                jSONObject.put(str2, str3);
            }
            if (!StringUtils.isEmpty(str4) && !StringUtils.isEmpty(str5)) {
                jSONObject.put(str4, str5);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* loaded from: classes6.dex */
    public class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private int c;

        static {
            kge.a(2029507441);
            kge.a(-878894432);
        }

        public a(String str, int i) {
            this.b = str + "_" + new Random().nextInt(1000);
            this.c = i;
        }

        @Override // com.taobao.mediaplay.d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            AVSDKLog.v(c.MODULE_SDK_PAGE, "preload onStart " + str);
            synchronized (DWVideoPreloadApiPlugin.class) {
                DWVideoPreloadApiPlugin.access$000().put(this.b, str);
            }
            WVStandardEventCenter.postNotificationToJS(DWVideoPreloadApiPlugin.access$100(DWVideoPreloadApiPlugin.this), "TBVideoPreCache.onStarted", DWVideoPreloadApiPlugin.this.getResult(this.b, null, null));
        }

        @Override // com.taobao.mediaplay.d
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            AVSDKLog.v(c.MODULE_SDK_PAGE, "preload onFinish " + i);
            synchronized (DWVideoPreloadApiPlugin.class) {
                DWVideoPreloadApiPlugin.access$000().remove(this.b);
            }
            WVStandardEventCenter.postNotificationToJS(DWVideoPreloadApiPlugin.access$200(DWVideoPreloadApiPlugin.this), "TBVideoPreCache.onCompleted", DWVideoPreloadApiPlugin.this.getResult(this.b, null, null));
        }

        @Override // com.taobao.mediaplay.d
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                return;
            }
            AVSDKLog.v(c.MODULE_SDK_PAGE, "preload onProgress " + i);
            int i2 = this.c;
            float f = i2 == 0 ? (i / 1024.0f) / 1024.0f : i / i2;
            DWVideoPreloadApiPlugin dWVideoPreloadApiPlugin = DWVideoPreloadApiPlugin.this;
            String str = this.b;
            String format = String.format("%.2f", Float.valueOf(f));
            WVStandardEventCenter.postNotificationToJS(DWVideoPreloadApiPlugin.access$300(DWVideoPreloadApiPlugin.this), "TBVideoPreCache.onProgress", dWVideoPreloadApiPlugin.getResult(str, kkr.PERCENT, format, "bytes", "" + i));
        }
    }

    private boolean start(String str, WVCallBackContext wVCallBackContext) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed324d34", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWVideoPreloadApiPlugin);
        if (StringUtils.isEmpty(str)) {
            wVCallBackContext.error();
            return false;
        }
        HashMap hashMap = (HashMap) com.alibaba.fastjson.JSONObject.parseObject(str, HashMap.class);
        if (hashMap == null) {
            wVCallBackContext.error();
            return false;
        }
        String str2 = "";
        String obj = hashMap.get("videoId") == null ? str2 : hashMap.get("videoId").toString();
        int b = hashMap.get("preloadSize") == null ? 0 : b.b(hashMap.get("preloadSize").toString());
        HashMap hashMap2 = new HashMap();
        if (hashMap.get(MusLiveVideo.ATTR_PLAY_SCENES) != null) {
            hashMap2.put(MusLiveVideo.ATTR_PLAY_SCENES, hashMap.get(MusLiveVideo.ATTR_PLAY_SCENES).toString());
        } else if (hashMap.get(oyw.VIDEO_PLAY_SCENES) != null) {
            hashMap2.put(MusLiveVideo.ATTR_PLAY_SCENES, hashMap.get(oyw.VIDEO_PLAY_SCENES).toString());
        }
        if (hashMap.get("from") != null) {
            hashMap2.put("from", hashMap.get("from").toString());
        }
        if (hashMap.get("videoChannel") != null) {
            hashMap2.put("videoChannel", hashMap.get("videoChannel").toString());
        }
        if (hashMap.get("PanoType") != null) {
            String obj2 = hashMap.get("PanoType").toString();
            if ("ERP".equals(obj2) || "EAC".equals(obj2)) {
                hashMap2.put("panoType", obj2);
            }
        }
        AVSDKLog.e(c.MODULE_SDK_PAGE, "DWVideoPreloadApiPlugin precacheVideo videoId=" + obj + ", preloadSize=" + b);
        if (hashMap.get("PCResult") != null) {
            str2 = hashMap.get("PCResult").toString();
        }
        if (!StringUtils.isEmpty(str2)) {
            try {
                z = aa.a(this.mContext, new JSONObject(str2), hashMap2, b, new a(obj, b));
            } catch (JSONException unused) {
                AVSDKLog.e(c.MODULE_SDK_PAGE, "JSONException error in start() function when use playcontrol Data");
                z = false;
            }
        } else {
            z = aa.a(this.mContext, obj, hashMap2, b, new a(obj, b));
        }
        if (z) {
            wVCallBackContext.success();
            return true;
        }
        wVCallBackContext.error();
        return false;
    }

    private boolean cancel(String str, WVCallBackContext wVCallBackContext) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b469394c", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            wVCallBackContext.error();
            return false;
        }
        HashMap hashMap = (HashMap) com.alibaba.fastjson.JSONObject.parseObject(str, HashMap.class);
        if (hashMap == null) {
            wVCallBackContext.error();
            return false;
        }
        if (hashMap.get("token") != null) {
            String obj = hashMap.get("token").toString();
            synchronized (DWVideoPreloadApiPlugin.class) {
                str2 = preloadLoadMap.get(obj);
                preloadLoadMap.remove(obj);
            }
            if (!StringUtils.isEmpty(str2)) {
                AVSDKLog.e(c.MODULE_SDK_PAGE, "DWVideoPreloadApiPlugin cancel url=" + str2);
                i a2 = oyw.a(this.mContext);
                if (a2 != null) {
                    a2.a(str2);
                }
                wVCallBackContext.success();
            }
        } else {
            wVCallBackContext.error();
        }
        return true;
    }
}
