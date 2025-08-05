package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.heytap.mcssdk.constant.MessageConstant;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.mcs.aidl.IMcsSdkService;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class cvf {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f26545a;
    private static final int[] b;
    private static String c;
    private static int d;
    private static String e;
    private static boolean f;
    private Context g;
    private List<cvt> h;
    private List<cvq> i;
    private String j;
    private String k;
    private String l;
    private ICallBackResultService m;
    private ISetAppNotificationCallBackService n;
    private IGetAppNotificationCallBackService o;
    private ConcurrentHashMap<Integer, cvj> p;

    /* loaded from: classes4.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final cvf f26547a;

        static {
            kge.a(130810966);
            f26547a = new cvf();
        }
    }

    static {
        kge.a(-404110973);
        kge.a(1490018250);
        f26545a = new int[]{99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115};
        b = new int[]{99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115, 115, 100, 107, 46, 97, 99, 116, 105, 111, 110, 46, 82, 69, 67, 69, 73, 86, 69, 95, 83, 68, 75, 95, 77, 69, 83, 83, 65, 71, 69};
        c = "";
        d = 0;
    }

    private cvf() {
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.l = null;
        synchronized (cvf.class) {
            if (d > 0) {
                throw new RuntimeException("PushService can't create again!");
            }
            d++;
        }
        a(new cvo());
        a(new cvn());
        a(new cvs());
        a(new cvr());
        this.p = new ConcurrentHashMap<>();
    }

    public static cvf a() {
        return a.f26547a;
    }

    private void a(int i, String str, JSONObject jSONObject) {
        if (b(i)) {
            ICallBackResultService iCallBackResultService = this.m;
            if (iCallBackResultService == null) {
                return;
            }
            iCallBackResultService.onError(c(i), "api_call_too_frequently");
            return;
        }
        try {
            this.g.startService(b(i, str, jSONObject));
        } catch (Exception e2) {
            cvy.b("startMcsService--Exception" + e2.getMessage());
        }
    }

    private synchronized void a(cvq cvqVar) {
        if (cvqVar != null) {
            this.i.add(cvqVar);
        }
    }

    private synchronized void a(cvt cvtVar) {
        if (cvtVar != null) {
            this.h.add(cvtVar);
        }
    }

    private boolean a(cvj cvjVar) {
        long a2 = cvjVar.a();
        long currentTimeMillis = System.currentTimeMillis();
        cvy.a("checkTimeNeedUpdate : lastedTime " + a2 + " currentTime:" + currentTimeMillis);
        return currentTimeMillis - a2 > 1000;
    }

    private Intent b(int i, String str, JSONObject jSONObject) {
        Intent intent = new Intent();
        intent.setAction(c(this.g));
        intent.setPackage(b(this.g));
        intent.putExtra("type", i);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("versionName", cwc.c(this.g, this.g.getPackageName()));
            jSONObject2.putOpt("versionCode", Integer.valueOf(cwc.b(this.g, this.g.getPackageName())));
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.putOpt(next, jSONObject.get(next));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            intent.putExtra("extra", jSONObject2.toString());
            throw th;
        }
        intent.putExtra("extra", jSONObject2.toString());
        intent.putExtra("params", str);
        intent.putExtra("appPackage", this.g.getPackageName());
        intent.putExtra("appKey", this.j);
        intent.putExtra("appSecret", this.k);
        intent.putExtra("registerID", this.l);
        intent.putExtra("sdkVersion", i());
        return intent;
    }

    private void b(int i, JSONObject jSONObject) {
        a(i, "", jSONObject);
    }

    private cvj d(int i) {
        String str;
        if (!this.p.containsKey(Integer.valueOf(i))) {
            cvj cvjVar = new cvj(System.currentTimeMillis(), 1);
            this.p.put(Integer.valueOf(i), cvjVar);
            cvy.a("addCommandToMap :appBean is null");
            return cvjVar;
        }
        cvj cvjVar2 = this.p.get(Integer.valueOf(i));
        if (a(cvjVar2)) {
            cvjVar2.a(1);
            cvjVar2.a(System.currentTimeMillis());
            str = "addCommandToMap : appLimitBean.setCount(1)";
        } else {
            cvjVar2.a(cvjVar2.b() + 1);
            str = "addCommandToMap :appLimitBean.getCount() + 1";
        }
        cvy.a(str);
        return cvjVar2;
    }

    private String e(Context context) {
        boolean z;
        boolean z2;
        if (TextUtils.isEmpty(c)) {
            c = new String(cvg.a("Y29tLm1jcy5hY3Rpb24uUkVDRUlWRV9TREtfTUVTU0FHRQ=="));
        }
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(c), 8192);
        if (Build.VERSION.SDK_INT >= 24) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                String str = resolveInfo.serviceInfo.packageName;
                try {
                    z = false;
                    z2 = (context.getPackageManager().getApplicationInfo(str, 0).flags & 1) == 1;
                    if (context.getPackageManager().getPackageUid(str, 0) == context.getPackageManager().getPackageUid("android", 0)) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (z2 || z) {
                    return str;
                }
            }
            return null;
        }
        return null;
    }

    private boolean f(Context context) {
        if (this.g == null) {
            this.g = context.getApplicationContext();
        }
        String b2 = b(this.g);
        return cwc.a(this.g, b2) && cwc.b(this.g, b2) >= 1019 && cwc.a(this.g, b2, "supportOpenPush");
    }

    public static String i() {
        return "3.1.0";
    }

    public static int j() {
        return 3100;
    }

    private boolean o() {
        return this.g != null;
    }

    private boolean p() {
        return this.l != null;
    }

    private boolean q() throws IllegalArgumentException {
        return o() && p();
    }

    public cvf a(Context context, boolean z) {
        if (context != null) {
            a(context);
            new cvi().a(this.g);
            cvy.a(z);
            return this;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    public void a(int i) {
        if (!b(i)) {
            final Intent b2 = b(i, "", null);
            this.g.bindService(b2, new ServiceConnection() { // from class: tb.cvf.1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    Bundle bundle = new Bundle();
                    bundle.putAll(b2.getExtras());
                    try {
                        IMcsSdkService.Stub.asInterface(iBinder).process(bundle);
                    } catch (Exception e2) {
                        cvy.a("bindMcsService exception:" + e2);
                    }
                    cvf.this.g.unbindService(this);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                }
            }, 1);
            return;
        }
        ICallBackResultService iCallBackResultService = this.m;
        if (iCallBackResultService == null) {
            return;
        }
        iCallBackResultService.onError(c(i), "api_call_too_frequently");
    }

    public void a(int i, JSONObject jSONObject) {
        if (!q()) {
            cvy.a(cvy.TAG, "please call the register first!");
            return;
        }
        a(MessageConstant.CommandId.COMMAND_SET_NOTIFICATION_TYPE, i + "", jSONObject);
    }

    public void a(Context context) {
        this.g = context.getApplicationContext();
        if (e == null) {
            String e2 = e(this.g);
            if (e2 == null) {
                e = cwc.a(f26545a);
                f = false;
                return;
            }
            e = e2;
            f = true;
        }
    }

    public void a(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        if (context == null) {
            if (iCallBackResultService == null) {
                return;
            }
            iCallBackResultService.onRegister(-2, null);
            return;
        }
        if (this.g == null) {
            this.g = context.getApplicationContext();
        }
        if (!cwc.c(this.g)) {
            if (iCallBackResultService == null) {
                return;
            }
            iCallBackResultService.onRegister(-2, null);
            return;
        }
        this.j = str;
        this.k = str2;
        this.m = iCallBackResultService;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.putOpt(Constants.KEY_APP_VERSION_CODE, Integer.valueOf(cwc.b(context)));
            jSONObject.putOpt(Constants.KEY_APP_VERSION_NAME, cwc.a(context));
        } catch (JSONException e2) {
            cvy.b("register-Exception:" + e2.getMessage());
        }
        b(MessageConstant.CommandId.COMMAND_REGISTER, jSONObject);
    }

    public void a(ICallBackResultService iCallBackResultService) {
        this.m = iCallBackResultService;
    }

    public void a(IGetAppNotificationCallBackService iGetAppNotificationCallBackService) {
        if (o()) {
            this.o = iGetAppNotificationCallBackService;
            b(MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_GET, null);
            return;
        }
        IGetAppNotificationCallBackService iGetAppNotificationCallBackService2 = this.o;
        if (iGetAppNotificationCallBackService2 == null) {
            return;
        }
        iGetAppNotificationCallBackService2.onGetAppNotificationSwitch(-2, 0);
    }

    public void a(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        if (o()) {
            this.n = iSetAppNotificationCallBackService;
            b(MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_OPEN, null);
            return;
        }
        ISetAppNotificationCallBackService iSetAppNotificationCallBackService2 = this.n;
        if (iSetAppNotificationCallBackService2 == null) {
            return;
        }
        iSetAppNotificationCallBackService2.onSetAppNotificationSwitch(-2);
    }

    public void a(String str) {
        this.l = str;
    }

    public void a(String str, String str2) {
        this.j = str;
        this.k = str2;
    }

    public void a(List<Integer> list, int i, int i2, int i3, int i4, JSONObject jSONObject) throws IllegalArgumentException {
        if (!q()) {
            if (e() == null) {
                return;
            }
            e().onSetPushTime(-2, "please call the register first!");
        } else if (list == null || list.size() <= 0 || i < 0 || i2 < 0 || i3 < i || i3 > 23 || i4 < i2 || i4 > 59) {
            throw new IllegalArgumentException("params are not all right,please check params");
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("weekDays", cvk.a(list));
                jSONObject2.put("startHour", i);
                jSONObject2.put("startMin", i2);
                jSONObject2.put("endHour", i3);
                jSONObject2.put("endMin", i4);
                a(MessageConstant.CommandId.COMMAND_SET_PUSH_TIME, jSONObject2.toString(), jSONObject);
            } catch (JSONException e2) {
                cvy.a(cvy.TAG, e2.getLocalizedMessage());
            }
        }
    }

    public void a(JSONObject jSONObject) {
        if (o()) {
            b(MessageConstant.CommandId.COMMAND_UNREGISTER, jSONObject);
        } else if (e() == null) {
        } else {
            e().onUnRegister(-2);
        }
    }

    public String b(Context context) {
        boolean z;
        if (e == null) {
            String e2 = e(context);
            if (e2 == null) {
                e = cwc.a(f26545a);
                z = false;
            } else {
                e = e2;
                z = true;
            }
            f = z;
        }
        return e;
    }

    public List<cvq> b() {
        return this.i;
    }

    public void b(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        this.j = str;
        this.k = str2;
        this.g = context.getApplicationContext();
        this.m = iCallBackResultService;
        a(jSONObject);
    }

    public void b(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        if (o()) {
            this.n = iSetAppNotificationCallBackService;
            b(MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_CLOSE, null);
        } else if (e() == null) {
        } else {
            this.n.onSetAppNotificationSwitch(-2);
        }
    }

    public void b(JSONObject jSONObject) {
        if (o()) {
            b(MessageConstant.CommandId.COMMAND_REGISTER, jSONObject);
        } else if (e() == null) {
        } else {
            e().onRegister(-2, null);
        }
    }

    public boolean b(int i) {
        return (i == 12291 || i == 12312 || d(i).b() <= 2) ? false : true;
    }

    public int c(int i) {
        switch (i) {
            case MessageConstant.CommandId.COMMAND_REGISTER /* 12289 */:
                return -1;
            case MessageConstant.CommandId.COMMAND_UNREGISTER /* 12290 */:
                return -2;
            case MessageConstant.CommandId.COMMAND_STATISTIC /* 12291 */:
                return -14;
            default:
                switch (i) {
                    case MessageConstant.CommandId.COMMAND_SET_PUSH_TIME /* 12298 */:
                        return -11;
                    case MessageConstant.CommandId.COMMAND_PAUSE_PUSH /* 12299 */:
                        return -3;
                    case MessageConstant.CommandId.COMMAND_RESUME_PUSH /* 12300 */:
                        return -4;
                    default:
                        switch (i) {
                            case MessageConstant.CommandId.COMMAND_GET_PUSH_STATUS /* 12306 */:
                                return -10;
                            case MessageConstant.CommandId.COMMAND_SET_NOTIFICATION_TYPE /* 12307 */:
                                return -6;
                            case MessageConstant.CommandId.COMMAND_CLEAR_NOTIFICATION_TYPE /* 12308 */:
                                return -7;
                            case MessageConstant.CommandId.COMMAND_GET_NOTIFICATION_STATUS /* 12309 */:
                                return -5;
                            case MessageConstant.CommandId.COMMAND_SET_NOTIFICATION_SETTINGS /* 12310 */:
                                return -8;
                            case MessageConstant.CommandId.COMMAND_CLEAR_PKG_NOTIFICATION /* 12311 */:
                                return -9;
                            case MessageConstant.CommandId.COMMAND_SEND_INSTANT_ACK /* 12312 */:
                                return -13;
                            case MessageConstant.CommandId.COMMAND_NOTIFICATION_ALLOWANCE /* 12313 */:
                                return -12;
                            default:
                                switch (i) {
                                    case MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_OPEN /* 12316 */:
                                        return -15;
                                    case MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_CLOSE /* 12317 */:
                                        return -16;
                                    case MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_GET /* 12318 */:
                                        return -17;
                                    default:
                                        return 0;
                                }
                        }
                }
        }
    }

    public String c(Context context) {
        if (e == null) {
            e(context);
        }
        if (f) {
            if (TextUtils.isEmpty(c)) {
                c = new String(cvg.a("Y29tLm1jcy5hY3Rpb24uUkVDRUlWRV9TREtfTUVTU0FHRQ=="));
            }
            return c;
        }
        return cwc.a(b);
    }

    public List<cvt> c() {
        return this.h;
    }

    public void c(JSONObject jSONObject) {
        if (q()) {
            b(MessageConstant.CommandId.COMMAND_PAUSE_PUSH, jSONObject);
        } else {
            cvy.a(cvy.TAG, "please call the register first!");
        }
    }

    public String d() {
        return this.l;
    }

    public void d(JSONObject jSONObject) {
        if (q()) {
            b(MessageConstant.CommandId.COMMAND_RESUME_PUSH, jSONObject);
        } else {
            cvy.a(cvy.TAG, "please call the register first!");
        }
    }

    public boolean d(Context context) {
        return f(context);
    }

    public ICallBackResultService e() {
        return this.m;
    }

    public void e(JSONObject jSONObject) {
        if (q()) {
            b(MessageConstant.CommandId.COMMAND_GET_NOTIFICATION_STATUS, jSONObject);
        } else if (e() == null) {
        } else {
            e().onGetNotificationStatus(-2, 0);
        }
    }

    public IGetAppNotificationCallBackService f() {
        return this.o;
    }

    public void f(JSONObject jSONObject) {
        if (q()) {
            b(MessageConstant.CommandId.COMMAND_CLEAR_NOTIFICATION_TYPE, jSONObject);
        } else {
            cvy.a(cvy.TAG, "please call the register first!");
        }
    }

    public ISetAppNotificationCallBackService g() {
        return this.n;
    }

    public void g(JSONObject jSONObject) {
        if (q()) {
            b(MessageConstant.CommandId.COMMAND_SET_NOTIFICATION_SETTINGS, jSONObject);
        } else {
            cvy.a(cvy.TAG, "please call the register first!");
        }
    }

    public void h() {
        if (q()) {
            b(MessageConstant.CommandId.COMMAND_GET_PUSH_STATUS, null);
        } else if (e() == null) {
        } else {
            e().onGetPushStatus(-2, 0);
        }
    }

    public void h(JSONObject jSONObject) {
        if (o()) {
            b(MessageConstant.CommandId.COMMAND_CLEAR_PKG_NOTIFICATION, jSONObject);
        } else {
            cvy.a(cvy.TAG, "please call the register first!");
        }
    }

    public void i(JSONObject jSONObject) {
        if (q()) {
            b(MessageConstant.CommandId.COMMAND_CANCEL_NOTIFICATION, jSONObject);
        } else {
            cvy.a(cvy.TAG, "please call the register first!");
        }
    }

    public String k() {
        if (o()) {
            Context context = this.g;
            return cwc.c(context, b(context));
        }
        return "";
    }

    public int l() {
        if (o()) {
            Context context = this.g;
            return cwc.b(context, b(context));
        }
        return 0;
    }

    public void m() {
        if (o()) {
            a(MessageConstant.CommandId.COMMAND_NOTIFICATION_ALLOWANCE);
        } else {
            cvy.a(cvy.TAG, "please call the register first!");
        }
    }

    public Context n() {
        return this.g;
    }
}
