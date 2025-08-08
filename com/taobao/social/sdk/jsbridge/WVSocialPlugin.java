package com.taobao.social.sdk.jsbridge;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.application.common.c;
import com.taobao.social.sdk.net.ISocialBusinessListener;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.vividsocial.utils.g;
import com.taobao.vividsocial.utils.h;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.och;
import tb.rij;

/* loaded from: classes8.dex */
public class WVSocialPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WVCallBackContext commentCallback;
    private PreBroadcastReceiver mPreBroadcastReceiver;

    static {
        kge.a(-115202536);
    }

    public static /* synthetic */ Object ipc$super(WVSocialPlugin wVSocialPlugin, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode != -1504501726) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDestroy();
            return null;
        }
    }

    public static /* synthetic */ WVCallBackContext access$000(WVSocialPlugin wVSocialPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("4eb5da41", new Object[]{wVSocialPlugin}) : wVSocialPlugin.commentCallback;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("like".equals(str)) {
            doLike(str2, wVCallBackContext);
            return true;
        } else if ("cancelLike".equals(str)) {
            cancelLike(str2, wVCallBackContext);
            return true;
        } else if ("countAndStatus".equals(str)) {
            getCountAndStatus(str2, wVCallBackContext);
            return true;
        } else if ("report".equals(str)) {
            report(str2, wVCallBackContext);
            return true;
        } else if ("openMiniUgc".equals(str)) {
            openUgc(str2, wVCallBackContext);
            return true;
        } else if (!"openPopComment".equals(str)) {
            return false;
        } else {
            openPopComment(str2, wVCallBackContext);
            return true;
        }
    }

    /* loaded from: classes8.dex */
    public class PreBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1257930905);
        }

        public static /* synthetic */ Object ipc$super(PreBroadcastReceiver preBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ IntentFilter a(PreBroadcastReceiver preBroadcastReceiver) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IntentFilter) ipChange.ipc$dispatch("4b1752dd", new Object[]{preBroadcastReceiver}) : preBroadcastReceiver.a();
        }

        private IntentFilter a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IntentFilter) ipChange.ipc$dispatch("1d6bc313", new Object[]{this});
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("taobao.comment.publish.broadcast");
            return intentFilter;
        }

        public PreBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !"taobao.comment.publish.broadcast".equalsIgnoreCase(intent.getAction())) {
            } else {
                String stringExtra = intent.getStringExtra("data");
                if (WVSocialPlugin.access$000(WVSocialPlugin.this) == null) {
                    return;
                }
                if (!StringUtils.isEmpty(stringExtra)) {
                    WVSocialPlugin.access$000(WVSocialPlugin.this).success(stringExtra);
                    return;
                }
                r rVar = new r();
                rVar.a("HY_FAILED");
                String stringExtra2 = intent.getStringExtra("errorMsg");
                if (StringUtils.isEmpty(stringExtra2)) {
                    return;
                }
                rVar.a("errorMsg", stringExtra2);
                WVSocialPlugin.access$000(WVSocialPlugin.this).error(rVar);
            }
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                g.a(context);
                ((Activity) context).getWindow().setSoftInputMode(48);
            } catch (Exception e) {
                e.printStackTrace();
                TLog.loge("commentSDK", "windvane initialize fail:" + e);
            }
        }
        super.initialize(context, iWVWebView);
    }

    private void openUgc(String str, WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12c927f5", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mPreBroadcastReceiver = new PreBroadcastReceiver();
        try {
            LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this.mPreBroadcastReceiver, PreBroadcastReceiver.a(this.mPreBroadcastReceiver));
        } catch (Throwable th) {
            th.printStackTrace();
            TLog.loge("commentSDK", "wvplugin  regit Broadcast Receivers error");
        }
        String str2 = null;
        if (!StringUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
            try {
                str2 = parseObject.getString("url");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Pair<String, Uri> sureSessionId = a.sureSessionId(str2);
        String str3 = (String) sureSessionId.first;
        Uri uri = (Uri) sureSessionId.second;
        a.registerListener(str3, wVCallBackContext);
        if (uri != null) {
            if (rij.e()) {
                Intent intent = new Intent();
                intent.setData(uri);
                h.a();
                com.taobao.vividsocial.upgrade.h.b(intent, "4");
                com.taobao.vividsocial.upgrade.h.b(intent, c.b());
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("ACTION", "taobao.comment.publish.broadcast");
            this.commentCallback = wVCallBackContext;
            Nav.from(this.mContext).withExtras(bundle).toUri(uri);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isCancel", (Object) "false");
        jSONObject.put("errorMsg", (Object) "参数无效");
        a.commentCallback(str3, false, false, false, jSONObject);
    }

    private void openPopComment(String str, WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1747da06", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Uri uri = null;
        if (!StringUtils.isEmpty(str)) {
            JSONObject parseObject2 = JSON.parseObject(str);
            long currentTimeMillis = System.currentTimeMillis();
            if (parseObject2 != null) {
                try {
                    String string = parseObject2.getString("param");
                    Uri.Builder buildUpon = Uri.parse("http://h5.m.taobao.com/comment/poplist.htm?").buildUpon();
                    if (!StringUtils.isEmpty(string) && (parseObject = JSON.parseObject(string)) != null) {
                        new Bundle().putLong("windvaneStartTime", currentTimeMillis);
                        for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                            buildUpon.appendQueryParameter(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                        }
                        uri = buildUpon.build();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        Pair<String, Uri> sureSessionId = a.sureSessionId(uri);
        String str2 = (String) sureSessionId.first;
        Uri uri2 = (Uri) sureSessionId.second;
        a.registerListener(str2, wVCallBackContext);
        if (uri2 != null) {
            this.commentCallback = wVCallBackContext;
            Nav.from(this.mContext).toUri(uri2);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMsg", (Object) "参数无效");
        a.commentCallback(str2, false, false, false, jSONObject);
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            if (this.mPreBroadcastReceiver == null) {
                return;
            }
            LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(this.mPreBroadcastReceiver);
            this.mPreBroadcastReceiver = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (!(this.mContext instanceof Activity)) {
            return;
        }
        och.updateCurrentActivity((Activity) this.mContext);
    }

    private void doLike(String str, final WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0b0390", new Object[]{this, str, wVCallBackContext});
        } else if (StringUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null) {
        } else {
            try {
                och.getInstance().like(getRequestParams(parseObject), new ISocialBusinessListener() { // from class: com.taobao.social.sdk.jsbridge.WVSocialPlugin.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.social.sdk.net.ISocialBusinessListener
                    public void onSuccess(MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
                        } else {
                            wVCallBackContext.success(String.valueOf(mtopResponse.getDataJsonObject()));
                        }
                    }

                    @Override // com.taobao.social.sdk.net.ISocialBusinessListener
                    public void onError(ISocialBusinessListener.ErrorType errorType, String str2, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str2, str3});
                        } else {
                            wVCallBackContext.error(str3);
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void cancelLike(String str, final WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c15a9f3f", new Object[]{this, str, wVCallBackContext});
        } else if (StringUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null) {
        } else {
            try {
                och.getInstance().cancelLike(getRequestParams(parseObject), new ISocialBusinessListener() { // from class: com.taobao.social.sdk.jsbridge.WVSocialPlugin.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.social.sdk.net.ISocialBusinessListener
                    public void onSuccess(MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
                        } else {
                            wVCallBackContext.success(String.valueOf(mtopResponse.getDataJsonObject()));
                        }
                    }

                    @Override // com.taobao.social.sdk.net.ISocialBusinessListener
                    public void onError(ISocialBusinessListener.ErrorType errorType, String str2, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str2, str3});
                        } else {
                            wVCallBackContext.error(str3);
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void getCountAndStatus(String str, final WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803bdc9e", new Object[]{this, str, wVCallBackContext});
        } else if (StringUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null) {
        } else {
            try {
                och.getInstance().getCountAndStatus(getRequestParams(parseObject), new ISocialBusinessListener() { // from class: com.taobao.social.sdk.jsbridge.WVSocialPlugin.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.social.sdk.net.ISocialBusinessListener
                    public void onSuccess(MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
                        } else {
                            wVCallBackContext.success(String.valueOf(mtopResponse.getDataJsonObject()));
                        }
                    }

                    @Override // com.taobao.social.sdk.net.ISocialBusinessListener
                    public void onError(ISocialBusinessListener.ErrorType errorType, String str2, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str2, str3});
                        } else {
                            wVCallBackContext.error(str3);
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void report(String str, final WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69eef82", new Object[]{this, str, wVCallBackContext});
        } else if (StringUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null) {
        } else {
            try {
                och.getInstance().report(getRequestParams(parseObject), new ISocialBusinessListener() { // from class: com.taobao.social.sdk.jsbridge.WVSocialPlugin.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.social.sdk.net.ISocialBusinessListener
                    public void onSuccess(MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
                        } else if (mtopResponse == null) {
                        } else {
                            wVCallBackContext.success(String.valueOf(mtopResponse.getDataJsonObject()));
                        }
                    }

                    @Override // com.taobao.social.sdk.net.ISocialBusinessListener
                    public void onError(ISocialBusinessListener.ErrorType errorType, String str2, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str2, str3});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("result", (Object) str3);
                        wVCallBackContext.error(jSONObject.toJSONString());
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private Map<String, String> getRequestParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8758721f", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            hashMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }
}
