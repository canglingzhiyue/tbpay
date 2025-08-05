package com.taobao.android.address.wrapper.weex;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.H5PopActivity;
import com.taobao.android.address.a;
import com.taobao.android.address.b;
import com.taobao.android.address.model.RecommendedAddress;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.android.nav.Nav;
import com.taobao.android.purchase.core.address.c;
import com.taobao.location.client.TBLocationClient;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.utils.TBWXConfigManger;
import java.util.HashMap;
import org.json.JSONObject;
import tb.dof;
import tb.efe;
import tb.gvl;
import tb.mqt;

/* loaded from: classes4.dex */
public class AddressKinshipBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_ASYNC_GET_RECOMMEND_ADDRESS = "asyncGetRecommendAddress";
    public static final String ACTION_CHECK_LOCATION_PERMISSION = "checkLocationPermission";
    public static final String ACTION_CHOOSE_ADDRESS = "chooseAddress";
    public static final String ACTION_EDIT_ADDRESS = "callAddressPage";
    public static final String ACTION_EDIT_MAP = "callMapPage";
    public static final String ACTION_GET_ALL_RECOMMEND_ADDRESS = "getAllRecommendAddressData";
    public static final String ACTION_GET_RECOMMEND_ADDRESS = "getRecommendAddress";
    public static final String ACTION_PICK_ADDRESS = "callListPage";
    public static final String ACTION_PICK_ADDRESS_V2 = "callListPageV2";
    public static final String ACTION_REQUEST_LOCATION_PERMISSION = "requestLocationPermission";
    public static final String ACTION_SWITCH_RECOMMEND_ADDRESS = "changeRecommendAddress";
    public static final String ACTION_SYNC_RECOMMEND_ADDRESS = "syncRecommendAddress";
    public static final String ACTION_UPDATE_RECOMMEND_ADDRESS = "updateRecommendAddress";
    public static final String ACTION_UPDATE_RECOMMEND_ADDRESS_STATUS = "updateRecommendAddressStatus";
    public static final String PLUGIN_NAME = "aluAddress";
    public static final String TAG = "aluAddress";
    private final int REQUEST_LOCATION_PERMISSION = 1024;
    public WVCallBackContext mCallback;
    private long mExecuteMs;
    private InnerReceiver mInnerReceiver;

    /* loaded from: classes4.dex */
    public static class InnerReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACTION_AUS_UPLOAD_RESULT = "aus_upload_result";
        public static final String KEY_AUS_OSSBUCKETNAME = "ossBucketName";
        public static final String KEY_AUS_OSSENDPOINT = "ossEndpoint";
        public static final String KEY_AUS_OSSOBJECTKEY = "ossObjectKey";

        /* renamed from: a  reason: collision with root package name */
        public WVCallBackContext f8989a;

        public InnerReceiver(WVCallBackContext wVCallBackContext) {
            this.f8989a = wVCallBackContext;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                if (this.f8989a == null) {
                    return;
                }
                r rVar = new r();
                if (!TextUtils.equals(intent.getAction(), ACTION_AUS_UPLOAD_RESULT)) {
                    return;
                }
                String stringExtra = intent.getStringExtra("ossBucketName");
                String stringExtra2 = intent.getStringExtra(KEY_AUS_OSSENDPOINT);
                String stringExtra3 = intent.getStringExtra("ossObjectKey");
                AdapterForTLog.loge("aluAddress", "recv ossBucketName:" + stringExtra + " ossEndpoint:" + stringExtra2 + " ossObjectKey:" + stringExtra3);
                rVar.a("ossBucketName", stringExtra);
                rVar.a(KEY_AUS_OSSENDPOINT, stringExtra2);
                rVar.a("ossObjectKey", stringExtra3);
                if (TextUtils.isEmpty(stringExtra3)) {
                    this.f8989a.error(rVar);
                } else {
                    this.f8989a.success(rVar);
                }
                LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
                this.f8989a = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(AddressKinshipBridge addressKinshipBridge, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 1257714799) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
    }

    public static /* synthetic */ void access$000(AddressKinshipBridge addressKinshipBridge, WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c90848", new Object[]{addressKinshipBridge, wVCallBackContext, str});
        } else {
            addressKinshipBridge.requestLocationResultCallback(wVCallBackContext, str);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        this.mExecuteMs = System.currentTimeMillis();
        AdapterForTLog.loge("aluAddress", "aluAddress action:" + str + " params:" + str2);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.mExecuteMs);
        dof.a(str, sb.toString(), "", null);
        if (ACTION_CHOOSE_ADDRESS.equals(str)) {
            handleAddress(str2, wVCallBackContext);
            return true;
        } else if (ACTION_PICK_ADDRESS.equals(str)) {
            openAddress("pickAddress", str2, wVCallBackContext);
            return true;
        } else if (ACTION_PICK_ADDRESS_V2.equals(str)) {
            openAddress("pickAddressV2", str2, wVCallBackContext);
            return true;
        } else if (ACTION_EDIT_ADDRESS.equals(str)) {
            openAddress("editAddress", str2, wVCallBackContext);
            return true;
        } else if (ACTION_EDIT_MAP.equals(str)) {
            openAddress("openAddressMap", str2, wVCallBackContext);
            return true;
        } else if (ACTION_GET_RECOMMEND_ADDRESS.equals(str)) {
            getGlobalRecommendAddress(str2, wVCallBackContext);
            return true;
        } else if (ACTION_GET_ALL_RECOMMEND_ADDRESS.equals(str)) {
            getAllGlobalRecommendAddressData(str2, wVCallBackContext);
            return true;
        } else if (ACTION_SYNC_RECOMMEND_ADDRESS.equals(str)) {
            syncGlobalRecommendAddress(str2, wVCallBackContext);
            return true;
        } else if (ACTION_ASYNC_GET_RECOMMEND_ADDRESS.equals(str)) {
            asyncGlobalRecommendAddress(str2, wVCallBackContext);
            return true;
        } else if (ACTION_SWITCH_RECOMMEND_ADDRESS.equals(str)) {
            switchGlobalRecommendAddress(str2, wVCallBackContext);
            return true;
        } else {
            if (ACTION_CHECK_LOCATION_PERMISSION.equals(str)) {
                if (this.mContext != null && (this.mContext instanceof Activity)) {
                    checkLocationPermission(wVCallBackContext);
                    return true;
                }
            } else if (ACTION_REQUEST_LOCATION_PERMISSION.equals(str)) {
                if (this.mContext != null && (this.mContext instanceof Activity)) {
                    requestGPSPermission(wVCallBackContext, true);
                    return true;
                }
            } else if (ACTION_UPDATE_RECOMMEND_ADDRESS.equals(str)) {
                if (this.mContext != null && (this.mContext instanceof Activity)) {
                    updateRecommendAddress(str2, wVCallBackContext);
                    return true;
                }
            } else if (ACTION_UPDATE_RECOMMEND_ADDRESS_STATUS.equals(str)) {
                if (this.mContext != null && (this.mContext instanceof Activity)) {
                    updateRecommendAddressStatus(str2, wVCallBackContext);
                    return true;
                }
            } else if (WindvanePluginRegister.WVTNodeCachePlugin.ACTION_GET_CACHE.equals(str)) {
                if (this.mContext != null && (this.mContext instanceof Activity)) {
                    SharedPreferences sharedPreferences = this.mContext.getSharedPreferences("homepage_common", 0);
                    r rVar = new r();
                    rVar.a("cacheValue", sharedPreferences.getString("tb_homepage_clientCache_lbs", ""));
                    wVCallBackContext.success(rVar);
                    return true;
                }
            } else if ("takePhoto".equals(str)) {
                if (this.mContext != null && (this.mContext instanceof Activity)) {
                    takePhoto((Activity) this.mContext, str2, wVCallBackContext);
                    return true;
                }
            } else if ("isSupportNativeMap".equals(str)) {
                isSupportNativeMap(wVCallBackContext);
                return true;
            } else if ("enableHookNativeBack".equals(str)) {
                enableHookNativeBack(wVCallBackContext);
                return true;
            }
            return false;
        }
    }

    public void enableHookNativeBack(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e897a1c8", new Object[]{this, wVCallBackContext});
            return;
        }
        if (this.mContext instanceof H5PopActivity) {
            H5PopActivity.f = true;
        }
        wVCallBackContext.success();
    }

    private void isSupportNativeMap(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d78e44", new Object[]{this, wVCallBackContext});
            return;
        }
        boolean f = efe.f();
        boolean a2 = mqt.a(this.mContext);
        boolean c = efe.c("isSupportAMap");
        r rVar = new r();
        rVar.a(TBWXConfigManger.WX_SUPPORT_KEY, Boolean.valueOf(a2 && c && !f));
        rVar.a("addressInstall", Boolean.valueOf(a2));
        rVar.a("isSupportNativeMap", Boolean.valueOf(c));
        rVar.a("systemWebView", Boolean.valueOf(f));
        boolean c2 = mqt.c(this.mContext);
        boolean c3 = efe.c("isSupportGMap");
        boolean d = mqt.d(this.mContext);
        if (!c2 || !c3 || !d || f) {
            z = false;
        }
        rVar.a("supportGoogleMap", Boolean.valueOf(z));
        rVar.a("addressOverseaInstall", Boolean.valueOf(c2));
        rVar.a("isSupportNativeGoogleMap", Boolean.valueOf(c3));
        rVar.a("isGooglePlayServicesAvailable", Boolean.valueOf(d));
        dof.a("isSupportNativeMap", rVar.d(), String.valueOf(System.currentTimeMillis() - this.mExecuteMs), null);
        AdapterForTLog.loge("aluAddress", "isSupportNativeMap data:" + rVar.d());
        wVCallBackContext.success(rVar);
    }

    private void handleAddress(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97dfecfa", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mCallback = wVCallBackContext;
        try {
            openPickPage(this.mContext, str);
        } catch (Exception unused) {
            WVCallBackContext wVCallBackContext2 = this.mCallback;
            if (wVCallBackContext2 == null) {
                return;
            }
            callError(wVCallBackContext2, "HY_PARAM_ERR");
        }
    }

    public static void openPickPage(Context context, String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c28beb1", new Object[]{context, str});
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        Bundle bundle = new Bundle();
        bundle.putString(c.K_SELECTED_ADDRESS_ID, jSONObject.getString("addressId"));
        bundle.putString("agencyReceiveDesc", "0");
        bundle.putBoolean(c.K_ENABLE_AGENCY, false);
        bundle.putBoolean("enableKinShip", true);
        bundle.putString("kinShipUserId", jSONObject.getString("relationId"));
        bundle.putInt(c.K_SUPPORT_ABROAD_STATION, 0);
        bundle.putInt(c.K_ENABLE_ABROAD_STATION, 0);
        bundle.putString("source", "");
        bundle.putString(com.taobao.android.address.wrapper.c.l, "");
        Nav.from(context).withExtras(bundle).forResult(700).toUri(gvl.a(context, "https://my.m.taobao.com/deliver/select_address_list.htm"));
    }

    private void asyncGlobalRecommendAddress(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33bc0d85", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            b.a(this.mContext, jSONObject.optString("bizIdentity"), jSONObject.optString("channel"), "frontInvoke", TextUtils.equals(jSONObject.optString(aw.PARAM_FORCE_REFRESH), "true"), jSONObject.optString("bizName"), new a() { // from class: com.taobao.android.address.wrapper.weex.AddressKinshipBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.address.a
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    } else {
                        AddressKinshipBridge.callSuccess(wVCallBackContext, str2);
                    }
                }

                @Override // com.taobao.android.address.a
                public void a(int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str2});
                    } else if (wVCallBackContext == null) {
                    } else {
                        r rVar = new r();
                        rVar.a("code", Integer.valueOf(i));
                        rVar.a("message", str2);
                        wVCallBackContext.error(rVar);
                    }
                }
            });
        } catch (Exception unused) {
            if (wVCallBackContext == null) {
                return;
            }
            callError(wVCallBackContext, "HY_FAILED");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void openAddress(java.lang.String r18, java.lang.String r19, android.taobao.windvane.jsbridge.WVCallBackContext r20) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.address.wrapper.weex.AddressKinshipBridge.openAddress(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        if (this.mContext != null && (this.mContext instanceof Activity)) {
            mqt.a((Activity) this.mContext, i, i2, intent, false);
        }
        if (i == 2001) {
            b.a(i, i2, intent);
        } else if (i == 1024) {
            requestGPSPermission(this.mCallback, false);
        } else {
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra(c.K_DELIVERY_ID);
                if (i == 700) {
                    if (this.mCallback != null && stringExtra != null) {
                        r rVar = new r();
                        rVar.a("HY_SUCCESS");
                        rVar.a("addressId", stringExtra);
                        this.mCallback.success(rVar);
                    } else {
                        callError(this.mCallback, "HY_PARAM_ERR");
                    }
                } else if (this.mCallback != null && stringExtra != null) {
                    r rVar2 = new r();
                    rVar2.a("HY_SUCCESS");
                    rVar2.a("requestCode", i + "");
                    rVar2.a("resultCode", i2 + "");
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        for (String str : extras.keySet()) {
                            String valueOf = String.valueOf(extras.get(str));
                            if (!TextUtils.isEmpty(valueOf)) {
                                rVar2.a(str, valueOf);
                                if (TextUtils.equals(str, c.K_DELIVERY_ID)) {
                                    rVar2.a(com.taobao.android.address.wrapper.c.K_DELIVERY_ID, valueOf);
                                }
                            }
                        }
                    }
                    this.mCallback.success(rVar2);
                } else {
                    callError(this.mCallback, "HY_FAILED");
                }
            } else if (i2 == 0 && i != 700 && this.mCallback != null) {
                r rVar3 = new r();
                rVar3.a("code", "0");
                rVar3.a("HY_FAILED");
                this.mCallback.error(rVar3);
            } else {
                WVCallBackContext wVCallBackContext = this.mCallback;
                if (wVCallBackContext != null) {
                    callError(wVCallBackContext, "HY_FAILED");
                }
            }
            super.onActivityResult(i, i2, intent);
        }
    }

    public static void callSuccess(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80fee493", new Object[]{wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
        } else {
            r rVar = new r();
            rVar.a("HY_SUCCESS");
            rVar.a("data", str);
            wVCallBackContext.success(rVar);
        }
    }

    public static void callError(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d934d8", new Object[]{wVCallBackContext, str});
            return;
        }
        if (wVCallBackContext != null) {
            r rVar = new r();
            rVar.a(str);
            wVCallBackContext.error(rVar);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UTConstant.Args.UT_PROPERTY_SUCCESS, UTConstant.Args.UT_SUCCESS_F);
        dof.a("ChooseAddressResult", "", "", hashMap);
    }

    private void getGlobalRecommendAddress(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a2e25f", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            RecommendedAddress a2 = b.a(this.mContext, new JSONObject(str).optString("bizIdentity"));
            callSuccess(wVCallBackContext, a2 == null ? "" : JSON.toJSONString(a2));
        } catch (Exception unused) {
            if (wVCallBackContext == null) {
                return;
            }
            callError(wVCallBackContext, "HY_FAILED");
        }
    }

    private void getAllGlobalRecommendAddressData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9f9dbe", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            callSuccess(wVCallBackContext, b.b(this.mContext, new JSONObject(str).optString("bizIdentity")));
        } catch (Exception unused) {
            if (wVCallBackContext == null) {
                return;
            }
            callError(wVCallBackContext, "HY_FAILED");
        }
    }

    private void syncGlobalRecommendAddress(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767471a4", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            b.a(this.mContext, jSONObject.optString("bizIdentity"), jSONObject.optString("channel"), "frontInvoke");
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.success();
        } catch (Exception unused) {
            if (wVCallBackContext == null) {
                return;
            }
            callError(wVCallBackContext, "HY_FAILED");
        }
    }

    private void switchGlobalRecommendAddress(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d68223d", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            b.a(this.mContext, jSONObject.optString("bizIdentity"), jSONObject.optString("channel"), jSONObject.optString(ag.KEY_TAOKE_BIZSCENE), new a() { // from class: com.taobao.android.address.wrapper.weex.AddressKinshipBridge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.address.a
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    } else {
                        AddressKinshipBridge.callSuccess(wVCallBackContext, str2);
                    }
                }

                @Override // com.taobao.android.address.a
                public void a(int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str2});
                    } else if (wVCallBackContext == null) {
                    } else {
                        r rVar = new r();
                        rVar.a("HY_SUCCESS");
                        rVar.a("code", Integer.valueOf(i));
                        rVar.a("message", str2);
                        wVCallBackContext.error(rVar);
                    }
                }
            });
        } catch (Exception unused) {
            if (wVCallBackContext == null) {
                return;
            }
            callError(wVCallBackContext, "HY_FAILED");
        }
    }

    private void requestGPSPermission(WVCallBackContext wVCallBackContext, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2aa1486", new Object[]{this, wVCallBackContext, new Boolean(z)});
            return;
        }
        LocationManager locationManager = (LocationManager) this.mContext.getSystemService("location");
        if (locationManager == null || !locationManager.isProviderEnabled("gps")) {
            z2 = false;
        }
        if (z2) {
            requestLocationPermission(wVCallBackContext);
        } else if (z) {
            this.mCallback = wVCallBackContext;
            Intent intent = new Intent();
            intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
            ((Activity) this.mContext).startActivityForResult(intent, 1024);
        } else {
            requestLocationResultCallback(wVCallBackContext, android.taobao.windvane.runtimepermission.a.PERMISSION_DENY);
        }
    }

    private void requestLocationPermission(final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6f1d97", new Object[]{this, wVCallBackContext});
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            if (ContextCompat.checkSelfPermission(this.mContext, com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION) != 0) {
                try {
                    if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) this.mContext, com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION)) {
                        android.taobao.windvane.runtimepermission.b.a(this.mContext, new String[]{com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION}).a(new Runnable() { // from class: com.taobao.android.address.wrapper.weex.AddressKinshipBridge.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    AddressKinshipBridge.access$000(AddressKinshipBridge.this, wVCallBackContext, "grant");
                                }
                            }
                        }).b(new Runnable() { // from class: com.taobao.android.address.wrapper.weex.AddressKinshipBridge.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    AddressKinshipBridge.access$000(AddressKinshipBridge.this, wVCallBackContext, android.taobao.windvane.runtimepermission.a.PERMISSION_DENY);
                                }
                            }
                        }).b();
                        return;
                    }
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + this.mContext.getPackageName()));
                        intent.addCategory("android.intent.category.DEFAULT");
                        ((Activity) this.mContext).startActivityForResult(intent, 999);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    if (wVCallBackContext == null) {
                        return;
                    }
                    wVCallBackContext.error(th.getMessage());
                    return;
                }
            }
            requestLocationResultCallback(wVCallBackContext, "grant");
        }
    }

    private void checkLocationPermission(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97fc4d0", new Object[]{this, wVCallBackContext});
        } else {
            requestLocationResultCallback(wVCallBackContext, TBLocationClient.c() ? "true" : "false");
        }
    }

    private void requestLocationResultCallback(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d160b94", new Object[]{this, wVCallBackContext, str});
        } else if (wVCallBackContext == null) {
        } else {
            r rVar = new r();
            rVar.a("HY_SUCCESS");
            rVar.a("result", str);
            wVCallBackContext.success(rVar);
        }
    }

    @JSMethod(uiThread = true)
    public void updateRecommendAddress(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a93a188f", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            b.a(this.mContext, jSONObject.optString("bizIdentity"), jSONObject.optString("type"), TextUtils.equals(jSONObject.optString("writeClient"), "true"), jSONObject.optString("data"));
            if (wVCallBackContext == null) {
                return;
            }
            r rVar = new r();
            rVar.a("HY_SUCCESS");
            wVCallBackContext.success(rVar);
        } catch (Throwable th) {
            th.printStackTrace();
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.error();
        }
    }

    @JSMethod(uiThread = true)
    public void updateRecommendAddressStatus(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75202161", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            b.c(this.mContext, jSONObject.optString("addressId"), jSONObject.optString("bizName"));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @JSMethod(uiThread = true)
    public void takePhoto(Activity activity, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362b9fcb", new Object[]{this, activity, str, wVCallBackContext});
            return;
        }
        try {
            if (this.mInnerReceiver != null) {
                LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.mInnerReceiver);
                this.mInnerReceiver = null;
            }
            this.mInnerReceiver = new InnerReceiver(wVCallBackContext);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(InnerReceiver.ACTION_AUS_UPLOAD_RESULT);
            LocalBroadcastManager.getInstance(this.mContext).registerReceiver(this.mInnerReceiver, intentFilter);
            boolean a2 = mqt.a(mqt.DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC);
            dof.a("takePhoto", "address", "install:" + a2, null);
            Nav.from(this.mContext).toUri(gvl.a(this.mContext, "https://my.m.taobao.com/deliver/ocr_address.htm"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.mInnerReceiver == null) {
            return;
        }
        LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.mInnerReceiver);
        this.mInnerReceiver = null;
    }
}
