package android.taobao.windvane.jsbridge.api;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.o;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class WVBluetoothSilence extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVBluetoothSilence";
    private BluetoothAdapter mBTAdapter = null;

    static {
        kge.a(-2127711872);
    }

    public static /* synthetic */ Object ipc$super(WVBluetoothSilence wVBluetoothSilence, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ BluetoothAdapter access$000(WVBluetoothSilence wVBluetoothSilence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BluetoothAdapter) ipChange.ipc$dispatch("466f4319", new Object[]{wVBluetoothSilence}) : wVBluetoothSilence.mBTAdapter;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        this.mBTAdapter = BluetoothAdapter.getDefaultAdapter();
        super.initialize(context, iWVWebView);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"checkStatus".equals(str)) {
            return false;
        }
        checkStatus(str2, wVCallBackContext);
        return true;
    }

    public void checkStatus(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6737de8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            android.taobao.windvane.runtimepermission.a.a(this.mContext, new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION}).a(new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVBluetoothSilence.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    r rVar = new r();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (WVBluetoothSilence.access$000(WVBluetoothSilence.this) == null) {
                            rVar.a("msg", "DEVICE_NOT_SUPPORT");
                            rVar.a("state", "unsupported");
                            wVCallBackContext.error(rVar);
                        } else if (!WVBluetoothSilence.access$000(WVBluetoothSilence.this).isEnabled()) {
                            rVar.a("msg", "BLUETOOTH_POWERED_OFF");
                            rVar.a("state", "poweredOff");
                            wVCallBackContext.error(rVar);
                        } else {
                            jSONObject.put("state", "poweredOn");
                            rVar.a("state", "poweredOn");
                            rVar.a("value", jSONObject);
                            wVCallBackContext.success(rVar);
                        }
                    } catch (Throwable unused) {
                        wVCallBackContext.error();
                    }
                }
            }).a(new o(wVCallBackContext, WVResultWrapper.USER_DENIED, "unauthorized")).a();
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error(e.getMessage());
        }
    }
}
