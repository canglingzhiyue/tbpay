package com.taobao.android.change.app.icon.biz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.core.Constrant;
import com.taobao.android.change.app.icon.core.a;
import com.taobao.android.change.app.icon.core.b;
import com.taobao.android.change.app.icon.model.AppIconComponentName;
import com.taobao.android.change.app.icon.model.ChangeAppIconJSModel;
import com.taobao.android.change.app.icon.utils.g;
import com.taobao.android.change.app.icon.utils.h;
import com.taobao.linkmanager.afc.windvane.DeviceInfoJsBridge;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.igb;
import tb.igc;
import tb.kge;

/* loaded from: classes4.dex */
public class ChangeAppIconBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BASE64PNG = "base64png";
    public static final String KEY_CHANGETYPE = "changeType";
    public static final String KEY_CURRENTICON = "currentIcon";
    public static final String KEY_DEVICEBRAND = "deviceBrand";
    public static final String KEY_DEVICEMODEL = "deviceModel";
    public static final String KEY_ICONNAME = "iconName";
    public static final String KEY_OSVERSION = "osVersion";
    public static final String KEY_RESULT = "result";
    public static final String KEY_SUPPORTEDICONS = "supportedIcons";
    private static final String TAG = "ChangeIconAlternateBridge";
    private ChangeAppIconReceiver mChangeAppIconReceiver;

    static {
        kge.a(1159872347);
    }

    public static /* synthetic */ Object ipc$super(ChangeAppIconBridge changeAppIconBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("supportsAlternateIcons".equals(str)) {
            supportsAlternateIcons(str2, wVCallBackContext);
            return true;
        } else if ("listIcons".equals(str)) {
            listIcons(str2, wVCallBackContext);
            return true;
        } else if ("setIcon".equals(str)) {
            setIcon(str2, wVCallBackContext);
            return true;
        } else if ("changeAppIcon".equals(str)) {
            changeAppIcon(str2, wVCallBackContext);
            return true;
        } else if (DeviceInfoJsBridge.ACTION.equals(str)) {
            getDeviceInfo(str2, wVCallBackContext);
            return true;
        } else {
            wVCallBackContext.error();
            return false;
        }
    }

    public void supportsAlternateIcons(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28084cb2", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            r rVar = new r();
            rVar.a("result", Boolean.valueOf(com.taobao.android.change.app.icon.utils.c.a(com.taobao.android.change.app.icon.utils.c.ORANGE_KEY_CHANGE_APP_SUPPORT_JS_CHANGE_APP_ICON, "true")));
            wVCallBackContext.success(rVar);
        } catch (Exception e) {
            callError(wVCallBackContext, e);
        }
    }

    public void listIcons(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e76fd6a", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, AppIconComponentName> entry : igc.c().entrySet()) {
                AppIconComponentName value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(KEY_ICONNAME, value.iconName);
                String a2 = com.taobao.android.change.app.icon.utils.d.a(this.mContext, value);
                jSONObject.put(KEY_BASE64PNG, a2);
                if (StringUtils.isEmpty(a2)) {
                    g.c(g.PAGE_NAME, "listIcons", value.iconName, "base64Str null", null);
                }
                jSONArray.put(jSONObject);
            }
            AppIconComponentName d = igc.d(this.mContext);
            r rVar = new r();
            rVar.a(KEY_CURRENTICON, d.iconName);
            rVar.a(KEY_SUPPORTEDICONS, jSONArray);
            wVCallBackContext.success(rVar);
        } catch (Exception e) {
            callError(wVCallBackContext, e);
        }
    }

    public void setIcon(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dedc189", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            r rVar = new r();
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(KEY_ICONNAME);
            String optString2 = jSONObject.optString("changeType");
            HashMap hashMap = new HashMap();
            hashMap.put(KEY_ICONNAME, optString);
            AppIconComponentName appIconComponentName = igc.c().get(optString);
            if (appIconComponentName == null) {
                g.c(g.PAGE_NAME, "setIcon", "model is null", null, hashMap);
                wVCallBackContext.onFailure(rVar);
                return;
            }
            if (StringUtils.isEmpty(optString2)) {
                optString2 = Constrant.ChangeType.SILENT;
            }
            rVar.a("changeType", optString2);
            hashMap.put("model", appIconComponentName.toString());
            hashMap.put("changeType", optString2);
            g.c(g.PAGE_NAME, "setIcon", "success", null, hashMap);
            if (StringUtils.equals(optString2, Constrant.ChangeType.SILENT)) {
                if (this.mChangeAppIconReceiver != null) {
                    LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.mChangeAppIconReceiver);
                    this.mChangeAppIconReceiver = null;
                }
                this.mChangeAppIconReceiver = new ChangeAppIconReceiver(wVCallBackContext);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(a.ACTION_CHANGE_APP_ICON_RESULT);
                LocalBroadcastManager.getInstance(this.mContext).registerReceiver(this.mChangeAppIconReceiver, intentFilter);
                igc.a(this.mContext, appIconComponentName);
            } else if (StringUtils.equals(optString2, Constrant.ChangeType.BG)) {
                wVCallBackContext.onSuccess(rVar);
                igc.a(appIconComponentName);
            } else if (StringUtils.equals(optString2, Constrant.ChangeType.NOW)) {
                wVCallBackContext.onSuccess(rVar);
                igc.b(appIconComponentName);
            } else {
                wVCallBackContext.onFailure(rVar);
            }
        } catch (Exception e) {
            callError(wVCallBackContext, e);
        }
    }

    public void changeAppIcon(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ef0f38", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            final r rVar = new r();
            ChangeAppIconJSModel changeAppIconJSModel = (ChangeAppIconJSModel) h.a(str, ChangeAppIconJSModel.class);
            if (changeAppIconJSModel == null) {
                wVCallBackContext.onFailure(rVar);
            } else if (!changeAppIconJSModel.isBackgroud()) {
                igc.a(this.mContext, changeAppIconJSModel);
            } else {
                b.a().a(changeAppIconJSModel, new igb() { // from class: com.taobao.android.change.app.icon.biz.ChangeAppIconBridge.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.igb
                    public void a(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        }
                    }

                    @Override // tb.igb
                    public void a(Bundle bundle) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
                            return;
                        }
                        boolean z = bundle.getBoolean("result");
                        boolean z2 = bundle.getBoolean(Constrant.KEY_MORE_ICONS);
                        boolean z3 = bundle.getBoolean(Constrant.KEY_TIME_OUT);
                        AdapterForTLog.loge(ChangeAppIconBridge.TAG, "onResult result:" + z + " moreIcons:" + z2 + " timeOut:" + z3);
                        rVar.a("result", Boolean.valueOf(z));
                        rVar.a(Constrant.KEY_MORE_ICONS, Boolean.valueOf(z2));
                        rVar.a(Constrant.KEY_TIME_OUT, Boolean.valueOf(z3));
                        wVCallBackContext.success(rVar);
                    }
                });
            }
        } catch (Exception e) {
            callError(wVCallBackContext, e);
        }
    }

    public void getDeviceInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d3316e8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            r rVar = new r();
            rVar.a("deviceBrand", Build.BRAND);
            rVar.a(KEY_DEVICEMODEL, Build.MODEL);
            rVar.a("osVersion", Build.VERSION.RELEASE);
            wVCallBackContext.onSuccess(rVar);
        } catch (Exception e) {
            callError(wVCallBackContext, e);
        }
    }

    private void callError(WVCallBackContext wVCallBackContext, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e160b8", new Object[]{this, wVCallBackContext, exc});
            return;
        }
        AdapterForTLog.loge(TAG, "callError error", exc);
        exc.printStackTrace();
        wVCallBackContext.onFailure(new r());
    }

    /* loaded from: classes4.dex */
    public static class ChangeAppIconReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WVCallBackContext f9315a;

        static {
            kge.a(-775717936);
        }

        public ChangeAppIconReceiver(WVCallBackContext wVCallBackContext) {
            this.f9315a = wVCallBackContext;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                if (this.f9315a == null) {
                    return;
                }
                r rVar = new r();
                if (!StringUtils.equals(intent.getAction(), a.ACTION_CHANGE_APP_ICON_RESULT)) {
                    return;
                }
                boolean booleanExtra = intent.getBooleanExtra("result", false);
                boolean booleanExtra2 = intent.getBooleanExtra(Constrant.KEY_MORE_ICONS, false);
                boolean booleanExtra3 = intent.getBooleanExtra(Constrant.KEY_TIME_OUT, false);
                int intExtra = intent.getIntExtra(Constrant.KEY_ENABLE_LAUNCHER, 1);
                AdapterForTLog.loge(ChangeAppIconBridge.TAG, "recv result:" + booleanExtra + " moreIcons:" + booleanExtra2 + " timeOut:" + booleanExtra3 + " enableLaunchers:" + intExtra);
                rVar.a("result", Boolean.valueOf(booleanExtra));
                rVar.a(Constrant.KEY_MORE_ICONS, Boolean.valueOf(booleanExtra2));
                rVar.a(Constrant.KEY_TIME_OUT, Boolean.valueOf(booleanExtra3));
                rVar.a(Constrant.KEY_ENABLE_LAUNCHER, Integer.valueOf(intExtra));
                if (booleanExtra) {
                    this.f9315a.success(rVar);
                } else {
                    this.f9315a.onFailure(rVar);
                }
                LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
                this.f9315a = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
