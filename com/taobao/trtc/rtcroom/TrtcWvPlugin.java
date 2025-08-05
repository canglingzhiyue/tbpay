package com.taobao.trtc.rtcroom;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.FailedBinderCallBack;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import com.taobao.trtc.call.TrtcCallImpl;
import com.taobao.trtc.impl.PermissionActivity;
import com.taobao.trtc.rtcroom.h;
import com.taobao.trtc.utils.TrtcLog;
import com.uc.webview.base.cyclone.BSError;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcWvPlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PERMISSION_REQUEST_CODE_FOR_RTC_ROOM = 126;
    private static final int PERMISSION_REQUEST_CODE_FOR_RTC_ROOM_MAKE_CALL = 127;
    private static final String TAG;
    private WVCallBackContext mCallBack;
    private Runnable makeCallRunnable;

    public static /* synthetic */ Object ipc$super(TrtcWvPlugin trtcWvPlugin, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1811143243:
                super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(160794785);
        TAG = TrtcWvPlugin.class.getName();
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f23155a;
        private String b;

        static {
            kge.a(90053613);
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("752db22c", new Object[]{aVar})).intValue() : aVar.f23155a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fba04b26", new Object[]{aVar}) : aVar.b;
        }

        public a() {
            this.f23155a = 200;
            this.b = "";
        }

        public a(int i, String str) {
            this.f23155a = 200;
            this.b = "";
            this.f23155a = i;
            this.b = str;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3e6bb62c", new Object[]{this, new Integer(i)});
            }
            if (i != 200) {
                h.b().c(i, "");
            }
            this.f23155a = i;
            return this;
        }

        public a a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d6dd65e2", new Object[]{this, new Integer(i), str});
            }
            if (i != 200) {
                h.b().c(i, str);
            }
            this.f23155a = i;
            this.b = str;
            return this;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        TrtcLog.d(TAG, "initialize");
        h.b().a(this);
        if (checkCallExist()) {
            h.b().b("initialize");
        } else {
            TrtcLog.b(TAG, "initialize::Call not exist");
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TrtcLog.d(TAG, MessageID.onDestroy);
        if (checkCallExist()) {
            h.b().a(MessageID.onDestroy);
        } else {
            TrtcLog.b(TAG, "onDestroy::Call not exist");
        }
        super.onDestroy();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        String str = TAG;
        TrtcLog.d(str, "onResume, " + this);
        super.onResume();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        String str = TAG;
        TrtcLog.d(str, "onPause, " + this);
        super.onPause();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        char c = 3;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        TrtcLog.d(TAG, ">>>>>> action: " + str + ", params: " + str2 + ", plugin: " + this);
        this.mCallBack = wVCallBackContext;
        try {
            a aVar = null;
            JSONObject parseObject = !TextUtils.isEmpty(str2) ? JSON.parseObject(str2) : null;
            switch (str.hashCode()) {
                case -1696811668:
                    if (str.equals("floatWindow")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -1270090235:
                    if (str.equals("updateFloatWindowConfig")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224575315:
                    if (str.equals("hangUp")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -783779322:
                    if (str.equals("screenInteraction")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -179242825:
                    if (str.equals("queryStats")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 39996780:
                    if (str.equals("makeCall")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 686218487:
                    if (str.equals(com.taobao.desktop.channel.calendar.a.CALENDAR_EVENT_PERMISSION_CHECK)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 746581438:
                    if (str.equals(TBRunTimePermission.REQUEST_PERMISSION_API_NAME)) {
                        break;
                    }
                    c = 65535;
                    break;
                case 871091088:
                    if (str.equals("initialize")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1132708157:
                    if (str.equals("muteAudio")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1246965586:
                    if (str.equals("sendData")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1262683590:
                    if (str.equals("switchPlayout")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1784465137:
                    if (str.equals("deInitialize")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    aVar = h.b().a(this, parseObject);
                    break;
                case 1:
                    h.e();
                    break;
                case 2:
                    aVar = checkPermission(parseObject);
                    break;
                case 3:
                    aVar = requestPermission(parseObject);
                    break;
                case 4:
                    queryStats();
                    break;
                case 5:
                    aVar = makeCall(parseObject);
                    break;
                case 6:
                    aVar = hangUp(parseObject);
                    break;
                case 7:
                    aVar = sendData(parseObject);
                    break;
                case '\b':
                    aVar = muteAudio(parseObject);
                    break;
                case '\t':
                    aVar = switchPlayout(parseObject);
                    break;
                case '\n':
                    aVar = floatWindow(parseObject);
                    break;
                case 11:
                    aVar = updateFloatConfig(parseObject);
                    break;
                case '\f':
                    aVar = screenInteraction(parseObject);
                    break;
                default:
                    TrtcLog.a(TAG, "WvExecute action: " + str + " not implemented");
                    aVar = new a();
                    aVar.a(-101, "action not implemented");
                    break;
            }
            if (aVar != null) {
                sendResult(a.a(aVar), a.b(aVar));
            }
        } catch (Throwable th) {
            String str3 = "action: " + str + " exception: " + th.getMessage();
            TrtcLog.a(TAG, str3);
            this.mCallBack.error(str3);
        }
        return true;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        String str = TAG;
        TrtcLog.d(str, "onRequestPermissionsResult: code: " + i + ", permission: " + Arrays.toString(strArr) + ", result: " + Arrays.toString(iArr));
        if (i == 126) {
            int length = strArr.length;
            int i4 = 0;
            while (i3 < length) {
                String str2 = strArr[i3];
                if (str2.equals("android.permission.RECORD_AUDIO")) {
                    i2 = 1;
                } else if (str2.equals(com.taobao.speech.util.e.CAMERA)) {
                    i2 = 2;
                } else {
                    i4++;
                    i3++;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("permissionType", (Object) Integer.valueOf(i2));
                if (iArr[i4] == 0) {
                    jSONObject.put("result", (Object) 1);
                } else {
                    jSONObject.put("result", (Object) 2);
                }
                notify2Js("onRequestPermissionResult", jSONObject);
                i4++;
                i3++;
            }
        } else if (i != 127) {
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            while (i3 < length2) {
                if (iArr[i3] != 0) {
                    synchronized (this) {
                        this.makeCallRunnable = null;
                    }
                    if (strArr[i5].equals("android.permission.RECORD_AUDIO")) {
                        notifyError2Js(-105, "audio permission deny");
                        return;
                    } else if (!strArr[i5].equals(com.taobao.speech.util.e.CAMERA)) {
                        return;
                    } else {
                        notifyError2Js(-104, "video permission deny");
                        return;
                    }
                }
                i5++;
                i3++;
            }
            synchronized (this) {
                this.makeCallRunnable.run();
                this.makeCallRunnable = null;
            }
        }
    }

    public void notifyError2Js(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ef462a", new Object[]{this, new Integer(i), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        jSONObject.put("msg", (Object) str);
        notify2Js("onError", jSONObject);
    }

    public void notify2Js(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba04e90d", new Object[]{this, str, jSONObject});
        } else {
            notify2Js(str, jSONObject, true);
        }
    }

    public void notify2Js(final String str, JSONObject jSONObject, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8698eb67", new Object[]{this, str, jSONObject, new Boolean(z)});
            return;
        }
        final String jSONString = jSONObject != null ? jSONObject.toJSONString() : "";
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.taobao.trtc.rtcroom.-$$Lambda$TrtcWvPlugin$nW8W-_DtwG3yzPsMft00-GPq0pI
                {
                    TrtcWvPlugin.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TrtcWvPlugin.this.lambda$notify2Js$0$TrtcWvPlugin(z, str, jSONString);
                }
            });
            return;
        }
        if (z) {
            String str2 = TAG;
            TrtcLog.d(str2, "<<<<<< Notify2JS|alive:" + this.isAlive + ", " + str + "|" + jSONString);
        }
        WVStandardEventCenter.postNotificationToJS(this.mWebView, str, jSONString);
    }

    public /* synthetic */ void lambda$notify2Js$0$TrtcWvPlugin(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2239300", new Object[]{this, new Boolean(z), str, str2});
            return;
        }
        if (z) {
            String str3 = TAG;
            TrtcLog.d(str3, "<<<<<< Notify2JS(Main)|alive:" + this.isAlive + ", " + str + "|" + str2);
        }
        WVStandardEventCenter.postNotificationToJS(this.mWebView, str, str2);
    }

    public void sendResult(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385394b7", new Object[]{this, new Integer(i)});
        } else {
            sendResult(i, "");
        }
    }

    public void sendResult(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a79ec1", new Object[]{this, new Integer(i), str});
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("code", i);
            if (TextUtils.isEmpty(str)) {
                str = i != -103 ? i != 200 ? "none" : "success" : "invalid params";
            }
            jSONObject.put("msg", str);
            callBack2JS("result", jSONObject);
        } catch (Throwable unused) {
        }
    }

    public void callBack2JS(String str, org.json.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e22a397", new Object[]{this, str, jSONObject});
            return;
        }
        r rVar = new r();
        rVar.a(str, jSONObject);
        rVar.b();
        String str2 = TAG;
        TrtcLog.d(str2, "<<<<<< callback2JS | " + rVar.d());
        WVCallBackContext wVCallBackContext = this.mCallBack;
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success(rVar);
    }

    public a checkPermission(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e7aa89c2", new Object[]{this, new Integer(i)});
        }
        a aVar = new a();
        aVar.a(200);
        if (i == 1) {
            if (ContextCompat.checkSelfPermission(getContext(), "android.permission.RECORD_AUDIO") != 0) {
                aVar.a(-105);
            }
        } else if (i == 2) {
            if (ContextCompat.checkSelfPermission(getContext(), com.taobao.speech.util.e.CAMERA) != 0) {
                aVar.a(-104);
            }
        } else if (i == 4) {
            if (ContextCompat.checkSelfPermission(getContext(), "android.permission.READ_PHONE_STATE") != 0) {
                aVar.a(BSError.BSDIFF_NEW_FILE_OPEN_FAILED);
            }
        } else if (i == 5) {
            if (!PermissionActivity.a(getContext())) {
                aVar.a(BSError.BSDIFF_NEW_FILE_WRITE_FAILED);
            }
        } else if (i != 3) {
            aVar.a(-103);
        }
        return aVar;
    }

    private a checkPermission(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c36935", new Object[]{this, jSONObject});
        }
        a aVar = new a();
        if (jSONObject == null) {
            return aVar.a(-103);
        }
        return checkPermission(jSONObject.getIntValue("permissionType"));
    }

    private a requestPermission(ArrayList<Integer> arrayList, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2c988c49", new Object[]{this, arrayList, new Integer(i)});
        }
        a aVar = new a();
        Activity activity = getActivity();
        if (activity == null) {
            TrtcLog.a(TAG, "get activity null");
            return aVar.a(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (intValue == 1) {
                arrayList2.add("android.permission.RECORD_AUDIO");
            } else if (intValue == 2) {
                arrayList2.add(com.taobao.speech.util.e.CAMERA);
            } else if (intValue == 4) {
                arrayList2.add("android.permission.READ_PHONE_STATE");
            }
        }
        if (arrayList2.size() == 0) {
            aVar.a(-103);
            return aVar;
        }
        ActivityCompat.requestPermissions(activity, (String[]) arrayList2.toArray(new String[0]), i);
        return aVar.a(200);
    }

    private a requestPermission(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a748cf7c", new Object[]{this, jSONObject});
        }
        a aVar = new a();
        if (jSONObject == null) {
            return aVar.a(-103);
        }
        int intValue = jSONObject.getIntValue("permissionType");
        if (intValue == 5) {
            requestOverlayPermission(new PermissionActivity.a() { // from class: com.taobao.trtc.rtcroom.-$$Lambda$TrtcWvPlugin$HoD0BfyjAqzbhpn9hFBjPjWopq8
                @Override // com.taobao.trtc.impl.PermissionActivity.a
                public final void onPermissionResult(boolean z, Intent intent) {
                    TrtcWvPlugin.this.lambda$requestPermission$1$TrtcWvPlugin(z, intent);
                }
            });
            return aVar;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(intValue));
        return requestPermission(arrayList, 126);
    }

    public /* synthetic */ void lambda$requestPermission$1$TrtcWvPlugin(boolean z, Intent intent) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e443843c", new Object[]{this, new Boolean(z), intent});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("permissionType", (Object) 5);
        if (z) {
            i = 1;
        }
        jSONObject.put("result", (Object) Integer.valueOf(i));
        notify2Js("onRequestPermissionResult", jSONObject);
    }

    private void requestOverlayPermission(PermissionActivity.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e8d18f", new Object[]{this, aVar});
            return;
        }
        try {
            TrtcLog.d(TAG, "start permission activity");
            PermissionActivity.a(aVar);
            Intent intent = new Intent(getContext(), PermissionActivity.class);
            intent.addFlags(268435456);
            intent.putExtra(PermissionActivity.PERMISSION_TYPE_OVERLAY, true);
            intent.putExtra(PermissionActivity.PERMISSION_TYPE_OVERLAY_WITH_DIALOG, false);
            getContext().startActivity(intent);
        } catch (Exception e) {
            String str = TAG;
            TrtcLog.a(str, "start permission activity e: " + e.getMessage());
        }
    }

    private void queryStats() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3d49be", new Object[]{this});
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (h.b() == null) {
                jSONObject.put("stats", 0);
            } else {
                synchronized (h.b().f()) {
                    if (checkEngineInitialized("queryStats") && h.b().k() != null && h.b().l() != null) {
                        h.a l = h.b().l();
                        if (l != null) {
                            jSONObject.put("stats", l.b.ordinal());
                            if (l.b == TrtcCallImpl.CallStatus.E_CALL_STATUS_TALKING) {
                                jSONObject.put("duration", SystemClock.elapsedRealtime() - l.f23179a);
                            } else {
                                jSONObject.put("duration", 0);
                            }
                            jSONObject.put("remoteId", l.c);
                            jSONObject.put(FailedBinderCallBack.CALLER_ID, l.d);
                            jSONObject.put("muteMic", l.e);
                            jSONObject.put("mutePlayout", l.f);
                            jSONObject.put("playoutMode", l.g);
                            jSONObject.put("networkType", h.b().m());
                            jSONObject.put("floatWindow", h.b().n());
                            jSONObject.put("screenInteraction", h.b().o());
                        }
                    }
                    jSONObject.put("stats", 0);
                }
            }
            callBack2JS("callStats", jSONObject);
        } catch (Throwable unused) {
        }
    }

    private a makeCall(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d776aa2a", new Object[]{this, jSONObject});
        }
        if (!checkEngineInitialized("makeCall")) {
            return new a(-106, "uninitialized");
        }
        if (h.b().k().b) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            if (a.a(checkPermission(1)) != 200) {
                arrayList.add(1);
            }
            if (com.taobao.trtc.utils.a.a(jSONObject.getJSONObject("callParams"), "callMode", 0) == 1 && a.a(checkPermission(2)) != 200) {
                arrayList.add(2);
            }
            if (!arrayList.isEmpty()) {
                synchronized (this) {
                    this.makeCallRunnable = new Runnable() { // from class: com.taobao.trtc.rtcroom.-$$Lambda$TrtcWvPlugin$iAYSijoTsolexJGaSJ6qY3RyPhU
                        @Override // java.lang.Runnable
                        public final void run() {
                            TrtcWvPlugin.this.lambda$makeCall$2$TrtcWvPlugin(jSONObject);
                        }
                    };
                }
                return requestPermission(arrayList, 127);
            }
        }
        return h.b().a(jSONObject);
    }

    public /* synthetic */ void lambda$makeCall$2$TrtcWvPlugin(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0a7db2", new Object[]{this, jSONObject});
        } else {
            makeCall(jSONObject);
        }
    }

    private a hangUp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e2c771eb", new Object[]{this, jSONObject});
        }
        if (checkEngineInitialized("hangUp")) {
            return h.b().b(jSONObject);
        }
        return new a(-106, "uninitialized");
    }

    private a sendData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6e1bb310", new Object[]{this, jSONObject});
        }
        if (checkEngineInitialized("sendData")) {
            return h.b().a(jSONObject, 1);
        }
        return new a(-106, "uninitialized");
    }

    private a muteAudio(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5280e47b", new Object[]{this, jSONObject});
        }
        if (checkEngineInitialized("muteAudio")) {
            return h.b().c(jSONObject);
        }
        return new a(-106, "uninitialized");
    }

    private a switchPlayout(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("83dbdb84", new Object[]{this, jSONObject});
        }
        if (checkEngineInitialized("switchPlayout")) {
            return h.b().d(jSONObject);
        }
        return new a(-106, "uninitialized");
    }

    private a floatWindow(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9c55122a", new Object[]{this, jSONObject});
        }
        if (checkEngineInitialized("floatWindow")) {
            return h.b().e(jSONObject);
        }
        return new a(-106, "uninitialized");
    }

    private a updateFloatConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6c565373", new Object[]{this, jSONObject});
        }
        if (checkEngineInitialized("updateFloatWindowConfig")) {
            return h.b().f(jSONObject);
        }
        return new a(-106, "uninitialized");
    }

    private a screenInteraction(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4752efc4", new Object[]{this, jSONObject});
        }
        if (checkEngineInitialized("screenInteraction")) {
            return h.b().g(jSONObject);
        }
        return new a(-106, "uninitialized");
    }

    private boolean checkEngineInitialized(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c668ba1f", new Object[]{this, str})).booleanValue();
        }
        if (h.b() != null && h.b().j()) {
            return true;
        }
        String str2 = TAG;
        TrtcLog.a(str2, "action: " + str + " | WvEngine is not initialized");
        return false;
    }

    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        Context context = this.mContext;
        if (this.mContext == null) {
            return null;
        }
        if (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        return (Activity) context;
    }

    private boolean checkCallExist() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4abac31c", new Object[]{this})).booleanValue();
        }
        if (h.c() || !h.b().j()) {
            return false;
        }
        synchronized (h.b().f()) {
            if (h.b().l() == null) {
                z = false;
            }
        }
        return z;
    }
}
