package com.taobao.browser.jsbridge;

import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import android.taobao.windvane.config.j;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVLocation;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.runtimepermission.b;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.alipay.android.msp.utils.UserLocation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.tao.homepage.a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.noa;
import tb.riy;

/* loaded from: classes6.dex */
public class WVLocationProxy extends WVLocation {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int REQUEST_CODE = 0;
    private static final String TAG = "WVLocationProxy";
    private WVCallBackContext prevCallback;
    private ArrayList<WVCallBackContext> mCallbacks = new ArrayList<>();
    private String mParams = "";
    private boolean mGetLocationAfterResult = false;

    static {
        kge.a(-1087073193);
    }

    public static /* synthetic */ Object ipc$super(WVLocationProxy wVLocationProxy, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ String access$000(WVLocationProxy wVLocationProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5ba7588d", new Object[]{wVLocationProxy}) : wVLocationProxy.mParams;
    }

    public static /* synthetic */ void access$100(WVLocationProxy wVLocationProxy, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6683a2", new Object[]{wVLocationProxy, tBLocationDTO});
        } else {
            wVLocationProxy.dealLocationData(tBLocationDTO);
        }
    }

    @Override // android.taobao.windvane.jsbridge.api.WVLocation, android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        this.mParams = str2;
        this.prevCallback = wVCallBackContext;
        if (!"getLocation".equals(str)) {
            return false;
        }
        try {
            if (j.commonConfig.bd) {
                this.mGetLocationAfterResult = new JSONObject(str2).optBoolean("getLocationAfterResult", false);
                if (ActivityCompat.checkSelfPermission(this.mContext, a.ACCESS_FINE_LOCATION) == 0) {
                    getLocation(wVCallBackContext, this.mParams);
                } else {
                    if (this.mContext instanceof Activity) {
                        ActivityCompat.requestPermissions((Activity) this.mContext, new String[]{a.ACCESS_FINE_LOCATION}, 0);
                    }
                    if (!this.mGetLocationAfterResult) {
                        getLocation(wVCallBackContext, this.mParams);
                    }
                }
            } else {
                b.a(this.mContext, new String[]{a.ACCESS_FINE_LOCATION}).a(new Runnable() { // from class: com.taobao.browser.jsbridge.WVLocationProxy.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        WVLocationProxy wVLocationProxy = WVLocationProxy.this;
                        wVLocationProxy.getLocation(wVCallBackContext, WVLocationProxy.access$000(wVLocationProxy));
                    }
                }).b(new Runnable() { // from class: com.taobao.browser.jsbridge.WVLocationProxy.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        r rVar = new r();
                        rVar.a("msg", "no permission");
                        wVCallBackContext.error(rVar);
                    }
                }).b();
            }
        } catch (Exception e) {
            try {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }

    private void dealLocationData(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428cff62", new Object[]{this, tBLocationDTO});
            return;
        }
        ArrayList<WVCallBackContext> arrayList = this.mCallbacks;
        if (arrayList == null || arrayList.isEmpty()) {
            m.c(TAG, "GetLocation wrapResult callbackContext is null");
        } else if (tBLocationDTO != null && tBLocationDTO.isNavSuccess()) {
            double doubleValue = Double.valueOf(tBLocationDTO.getLongitude()).doubleValue();
            double doubleValue2 = Double.valueOf(tBLocationDTO.getLatitude()).doubleValue();
            if (doubleValue > -1.0E-6d && doubleValue < 1.0E-6d && doubleValue2 > -1.0E-6d && doubleValue2 < 1.0E-6d) {
                m.e(TAG, "getLocation: longitude and latitude is zero.");
                Iterator<WVCallBackContext> it = this.mCallbacks.iterator();
                while (it.hasNext()) {
                    r rVar = new r();
                    rVar.a("msg", "longitude=[" + doubleValue + "]; latitude=[" + doubleValue2 + riy.ARRAY_END_STR);
                    it.next().error(rVar);
                }
                this.mCallbacks.clear();
                return;
            }
            r rVar2 = new r();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("longitude", doubleValue);
                jSONObject.put("latitude", doubleValue2);
                jSONObject.put(UserLocation.KEY_DOUBLE_ACCURACY, tBLocationDTO.getAccuracy());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            rVar2.b();
            rVar2.a("coords", jSONObject);
            if (m.a()) {
                m.b(TAG, " getLocation success. longitude: " + doubleValue + " latitude: " + doubleValue2);
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("city", tBLocationDTO.getCityName());
                jSONObject2.put(noa.KEY_CITY_CODE, tBLocationDTO.getCityCode());
                jSONObject2.put("areaCode", tBLocationDTO.getAreaCode());
                jSONObject2.put("area", tBLocationDTO.getAreaName());
                jSONObject2.put("addressLine", tBLocationDTO.getAddress());
                if (m.a()) {
                    m.b(TAG, " getAddress success. " + tBLocationDTO.getAddress());
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            rVar2.a("address", jSONObject2);
            Iterator<WVCallBackContext> it2 = this.mCallbacks.iterator();
            while (it2.hasNext()) {
                it2.next().success(rVar2);
            }
            this.mCallbacks.clear();
        } else {
            Iterator<WVCallBackContext> it3 = this.mCallbacks.iterator();
            while (it3.hasNext()) {
                WVCallBackContext next = it3.next();
                r rVar3 = new r();
                if (tBLocationDTO == null) {
                    rVar3.a("msg", "location = null");
                    m.e(TAG, "location = null");
                } else {
                    rVar3.a("msg", "fail to location, errCode=[" + tBLocationDTO.getErrorCode() + riy.ARRAY_END_STR);
                    m.e(TAG, "fail to location");
                }
                next.error(rVar3);
            }
            this.mCallbacks.clear();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r8.equals("TWO_MIN") != false) goto L17;
     */
    @Override // android.taobao.windvane.jsbridge.api.WVLocation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getLocation(android.taobao.windvane.jsbridge.WVCallBackContext r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.jsbridge.WVLocationProxy.getLocation(android.taobao.windvane.jsbridge.WVCallBackContext, java.lang.String):void");
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        } else if (this.mGetLocationAfterResult && i == 0 && strArr != null && iArr != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (TextUtils.equals(strArr[i2], a.ACCESS_FINE_LOCATION)) {
                    if (iArr[i2] == 0) {
                        getLocation(this.prevCallback, this.mParams);
                    } else {
                        r rVar = new r("HY_NO_PERMISSION");
                        WVCallBackContext wVCallBackContext = this.prevCallback;
                        if (wVCallBackContext != null) {
                            wVCallBackContext.error(rVar);
                        }
                        Iterator<WVCallBackContext> it = this.mCallbacks.iterator();
                        while (it.hasNext()) {
                            it.next().error(rVar);
                        }
                        this.mCallbacks.clear();
                    }
                }
            }
        }
    }

    @Override // android.taobao.windvane.jsbridge.api.WVLocation, android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
