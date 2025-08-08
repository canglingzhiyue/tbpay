package com.loc;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import org.json.JSONObject;
import tb.noa;

/* loaded from: classes4.dex */
public final class i {
    a c;
    private Context d;
    private WebView f;

    /* renamed from: a  reason: collision with root package name */
    Object f7817a = new Object();
    private AMapLocationClient e = null;
    private String g = "AMap.Geolocation.cbk";
    AMapLocationClientOption b = null;
    private volatile boolean h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements AMapLocationListener {
        a() {
        }

        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            if (i.this.h) {
                i.this.b(i.b(aMapLocation));
            }
        }
    }

    public i(Context context, WebView webView) {
        this.f = null;
        this.c = null;
        this.d = context.getApplicationContext();
        this.f = webView;
        this.c = new a();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[Catch: Throwable -> 0x0076, TryCatch #3 {Throwable -> 0x0076, blocks: (B:21:0x004f, B:23:0x0056, B:24:0x005a, B:26:0x0063, B:30:0x0069, B:32:0x006e, B:25:0x005e), top: B:43:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[Catch: Throwable -> 0x0076, TryCatch #3 {Throwable -> 0x0076, blocks: (B:21:0x004f, B:23:0x0056, B:24:0x005a, B:26:0x0063, B:30:0x0069, B:32:0x006e, B:25:0x005e), top: B:43:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[Catch: Throwable -> 0x0076, TRY_LEAVE, TryCatch #3 {Throwable -> 0x0076, blocks: (B:21:0x004f, B:23:0x0056, B:24:0x005a, B:26:0x0063, B:30:0x0069, B:32:0x006e, B:25:0x005e), top: B:43:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r10) {
        /*
            r9 = this;
            com.amap.api.location.AMapLocationClientOption r0 = r9.b
            if (r0 != 0) goto Lb
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption
            r0.<init>()
            r9.b = r0
        Lb:
            r0 = 5
            r1 = 30000(0x7530, double:1.4822E-319)
            r3 = 1
            r4 = 0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4d
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r10 = "to"
            long r1 = r5.optLong(r10, r1)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r10 = "useGPS"
            int r10 = r5.optInt(r10, r3)     // Catch: java.lang.Throwable -> L4d
            if (r10 != r3) goto L27
            r10 = 1
            goto L28
        L27:
            r10 = 0
        L28:
            java.lang.String r6 = "watch"
            int r6 = r5.optInt(r6, r4)     // Catch: java.lang.Throwable -> L4e
            if (r6 != r3) goto L33
            r6 = 1
            goto L34
        L33:
            r6 = 0
        L34:
            java.lang.String r7 = "interval"
            int r0 = r5.optInt(r7, r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r7 = "callback"
            r8 = 0
            java.lang.String r5 = r5.optString(r7, r8)     // Catch: java.lang.Throwable -> L4f
            boolean r7 = android.text.StringUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L4f
            if (r7 != 0) goto L4a
        L47:
            r9.g = r5     // Catch: java.lang.Throwable -> L4f
            goto L4f
        L4a:
            java.lang.String r5 = "AMap.Geolocation.cbk"
            goto L47
        L4d:
            r10 = 0
        L4e:
            r6 = 0
        L4f:
            com.amap.api.location.AMapLocationClientOption r5 = r9.b     // Catch: java.lang.Throwable -> L76
            r5.setHttpTimeOut(r1)     // Catch: java.lang.Throwable -> L76
            if (r10 == 0) goto L5e
            com.amap.api.location.AMapLocationClientOption r10 = r9.b     // Catch: java.lang.Throwable -> L76
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy     // Catch: java.lang.Throwable -> L76
        L5a:
            r10.setLocationMode(r1)     // Catch: java.lang.Throwable -> L76
            goto L63
        L5e:
            com.amap.api.location.AMapLocationClientOption r10 = r9.b     // Catch: java.lang.Throwable -> L76
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Battery_Saving     // Catch: java.lang.Throwable -> L76
            goto L5a
        L63:
            com.amap.api.location.AMapLocationClientOption r10 = r9.b     // Catch: java.lang.Throwable -> L76
            if (r6 != 0) goto L68
            goto L69
        L68:
            r3 = 0
        L69:
            r10.setOnceLocation(r3)     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L76
            com.amap.api.location.AMapLocationClientOption r10 = r9.b     // Catch: java.lang.Throwable -> L76
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L76
            r10.setInterval(r0)     // Catch: java.lang.Throwable -> L76
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.i.a(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(AMapLocation aMapLocation) {
        String locationDetail;
        JSONObject jSONObject = new JSONObject();
        String str = "errorInfo";
        if (aMapLocation == null) {
            jSONObject.put("errorCode", -1);
            locationDetail = "unknownError";
        } else if (aMapLocation.getErrorCode() == 0) {
            jSONObject.put("errorCode", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("x", aMapLocation.getLongitude());
            jSONObject2.put("y", aMapLocation.getLatitude());
            jSONObject2.put("precision", aMapLocation.getAccuracy());
            jSONObject2.put("type", aMapLocation.getLocationType());
            jSONObject2.put("country", aMapLocation.getCountry());
            jSONObject2.put("province", aMapLocation.getProvince());
            jSONObject2.put("city", aMapLocation.getCity());
            jSONObject2.put(noa.KEY_CITY_CODE, aMapLocation.getCityCode());
            jSONObject2.put("district", aMapLocation.getDistrict());
            jSONObject2.put("adCode", aMapLocation.getAdCode());
            jSONObject2.put("street", aMapLocation.getStreet());
            jSONObject2.put("streetNum", aMapLocation.getStreetNum());
            jSONObject2.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_floor, aMapLocation.getFloor());
            jSONObject2.put("address", aMapLocation.getAddress());
            jSONObject.put("result", jSONObject2);
            return jSONObject.toString();
        } else {
            jSONObject.put("errorCode", aMapLocation.getErrorCode());
            jSONObject.put(str, aMapLocation.getErrorInfo());
            str = "locationDetail";
            locationDetail = aMapLocation.getLocationDetail();
        }
        jSONObject.put(str, locationDetail);
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str) {
        try {
            if (this.f == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 19) {
                this.f.post(new Runnable() { // from class: com.loc.i.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebView webView = i.this.f;
                        webView.loadUrl("javascript:" + i.this.g + "('" + str + "')");
                    }
                });
                return;
            }
            WebView webView = this.f;
            webView.evaluateJavascript("javascript:" + this.g + "('" + str + "')", new ValueCallback<String>() { // from class: com.loc.i.1
                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
        } catch (Throwable th) {
            fr.a(th, "H5LocationClient", "callbackJs()");
        }
    }

    public final void a() {
        if (this.f == null || this.d == null || Build.VERSION.SDK_INT < 17 || this.h) {
            return;
        }
        try {
            this.f.getSettings().setJavaScriptEnabled(true);
            this.f.addJavascriptInterface(this, "AMapAndroidLoc");
            if (!StringUtils.isEmpty(this.f.getUrl())) {
                this.f.reload();
            }
            if (this.e == null) {
                this.e = new AMapLocationClient(this.d);
                this.e.setLocationListener(this.c);
            }
            this.h = true;
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        synchronized (this.f7817a) {
            this.h = false;
            if (this.e != null) {
                this.e.unRegisterLocationListener(this.c);
                this.e.stopLocation();
                this.e.onDestroy();
                this.e = null;
            }
            this.b = null;
        }
    }

    @JavascriptInterface
    public final void getLocation(String str) {
        synchronized (this.f7817a) {
            if (!this.h) {
                return;
            }
            a(str);
            if (this.e != null) {
                this.e.setLocationOption(this.b);
                this.e.stopLocation();
                this.e.startLocation();
            }
        }
    }

    @JavascriptInterface
    public final void stopLocation() {
        AMapLocationClient aMapLocationClient;
        if (this.h && (aMapLocationClient = this.e) != null) {
            aMapLocationClient.stopLocation();
        }
    }
}
