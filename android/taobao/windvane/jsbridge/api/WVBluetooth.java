package android.taobao.windvane.jsbridge.api;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.i;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class WVBluetooth extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVBluetooth";
    private BluetoothAdapter mBTAdapter = null;
    private BluetoothGatt mBluetoothGatt = null;
    private WVCallBackContext mConnectCallback = null;
    private WVCallBackContext mReadValueCallback = null;
    private WVCallBackContext mWriteValueCallback = null;
    private BluetoothAdapter.LeScanCallback mLeScanCallback = null;
    private Set<String> mKnownDevices = new HashSet();
    private WVCallBackContext mGetServiceCallback = null;
    private int mCurrentConnectionState = -1;
    private final BluetoothGattCallback mGattCallback = new BluetoothGattCallback() { // from class: android.taobao.windvane.jsbridge.api.WVBluetooth.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6dd994f", new Object[]{this, bluetoothGatt, new Integer(i), new Integer(i2)});
                return;
            }
            WVBluetooth.access$302(WVBluetooth.this, i2);
            m.c(WVBluetooth.TAG, "onConnectionStateChange: " + i + "," + i2);
            if (WVBluetooth.access$400(WVBluetooth.this) != null) {
                if (i2 == 2) {
                    WVBluetooth.access$400(WVBluetooth.this).success();
                } else {
                    WVBluetooth.access$400(WVBluetooth.this).error();
                }
                WVBluetooth.access$402(WVBluetooth.this, null);
            }
            if (WVBluetooth.access$500(WVBluetooth.this) == null || i2 != 0) {
                return;
            }
            try {
                new JSONObject().put("deviceId", WVBluetooth.access$500(WVBluetooth.this).getDevice().getAddress());
                WVBluetooth.access$600(WVBluetooth.this).fireEvent("WV.Event.WVBluetooth.GATTServerDisconnected", "");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfefbb5", new Object[]{this, bluetoothGatt, new Integer(i)});
                return;
            }
            m.c(WVBluetooth.TAG, "onServicesDiscovered : " + i);
            if (WVBluetooth.access$700(WVBluetooth.this) == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
                try {
                    jSONArray.put(new JSONObject().put("serviceId", bluetoothGattService.getUuid()));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            r rVar = new r();
            rVar.a(ServiceNode.TAG, jSONArray);
            WVBluetooth.access$700(WVBluetooth.this).success(rVar);
            WVBluetooth.access$702(WVBluetooth.this, null);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2bb9c47", new Object[]{this, bluetoothGatt, bluetoothGattCharacteristic, new Integer(i)});
                return;
            }
            m.c(WVBluetooth.TAG, "onCharacteristicRead : " + i);
            if (WVBluetooth.access$800(WVBluetooth.this) == null) {
                return;
            }
            r rVar = new r();
            if (i == 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("value", Base64.encodeToString(bluetoothGattCharacteristic.getValue(), 2));
                    rVar.a("value", jSONObject);
                    WVBluetooth.access$800(WVBluetooth.this).success(rVar);
                } catch (Throwable th) {
                    th.printStackTrace();
                    WVBluetooth.access$800(WVBluetooth.this).error();
                }
            } else {
                rVar.a("msg", "FAILED_TO_READ: " + i);
                WVBluetooth.access$800(WVBluetooth.this).error(rVar);
            }
            WVBluetooth.access$802(WVBluetooth.this, null);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcde96d2", new Object[]{this, bluetoothGatt, bluetoothGattCharacteristic, new Integer(i)});
                return;
            }
            m.c(WVBluetooth.TAG, "onCharacteristicWrite : " + i);
            if (WVBluetooth.access$900(WVBluetooth.this) != null) {
                r rVar = new r();
                if (i == 0) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("value", Base64.encodeToString(bluetoothGattCharacteristic.getValue(), 2));
                        rVar.a("value", jSONObject);
                        WVBluetooth.access$900(WVBluetooth.this).success(rVar);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        WVBluetooth.access$900(WVBluetooth.this).error(th.getMessage());
                    }
                } else {
                    rVar.a("msg", "FAILED_TO_WRITE: " + i);
                    WVBluetooth.access$900(WVBluetooth.this).error(rVar);
                }
            }
            WVBluetooth.access$902(WVBluetooth.this, null);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67e4f326", new Object[]{this, bluetoothGatt, bluetoothGattCharacteristic});
                return;
            }
            m.c(WVBluetooth.TAG, "onCharacteristicChanged : " + bluetoothGattCharacteristic.getUuid());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("deviceId", WVBluetooth.access$500(WVBluetooth.this).getDevice().getAddress());
                jSONObject.put("serviceId", bluetoothGattCharacteristic.getService().getUuid().toString());
                jSONObject.put("characteristicId", bluetoothGattCharacteristic.getUuid().toString());
                jSONObject.put("value", Base64.encodeToString(bluetoothGattCharacteristic.getValue(), 2));
                WVBluetooth.access$1000(WVBluetooth.this).fireEvent("WV.Event.WVBluetooth.characteristicValueChanged", jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb20eefa", new Object[]{this, bluetoothGatt, bluetoothGattDescriptor, new Integer(i)});
                return;
            }
            m.c(WVBluetooth.TAG, "onDescriptorWrite : " + bluetoothGattDescriptor.getCharacteristic().getUuid());
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1a12f21", new Object[]{this, bluetoothGatt, new Integer(i), new Integer(i2)});
                return;
            }
            m.c(WVBluetooth.TAG, "onReadRemoteRssi : " + i);
        }
    };

    static {
        kge.a(-754979871);
    }

    public static /* synthetic */ Object ipc$super(WVBluetooth wVBluetooth, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ BluetoothAdapter access$000(WVBluetooth wVBluetooth) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BluetoothAdapter) ipChange.ipc$dispatch("3e6575be", new Object[]{wVBluetooth}) : wVBluetooth.mBTAdapter;
    }

    public static /* synthetic */ Set access$100(WVBluetooth wVBluetooth) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6d104195", new Object[]{wVBluetooth}) : wVBluetooth.mKnownDevices;
    }

    public static /* synthetic */ IWVWebView access$1000(WVBluetooth wVBluetooth) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("cef7c426", new Object[]{wVBluetooth}) : wVBluetooth.mWebView;
    }

    public static /* synthetic */ IWVWebView access$200(WVBluetooth wVBluetooth) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("c9197b3", new Object[]{wVBluetooth}) : wVBluetooth.mWebView;
    }

    public static /* synthetic */ int access$302(WVBluetooth wVBluetooth, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d459ab8c", new Object[]{wVBluetooth, new Integer(i)})).intValue();
        }
        wVBluetooth.mCurrentConnectionState = i;
        return i;
    }

    public static /* synthetic */ WVCallBackContext access$400(WVBluetooth wVBluetooth) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("cd5f184a", new Object[]{wVBluetooth}) : wVBluetooth.mConnectCallback;
    }

    public static /* synthetic */ WVCallBackContext access$402(WVBluetooth wVBluetooth, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("97d9b3ab", new Object[]{wVBluetooth, wVCallBackContext});
        }
        wVBluetooth.mConnectCallback = wVCallBackContext;
        return wVCallBackContext;
    }

    public static /* synthetic */ BluetoothGatt access$500(WVBluetooth wVBluetooth) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BluetoothGatt) ipChange.ipc$dispatch("85a02df4", new Object[]{wVBluetooth}) : wVBluetooth.mBluetoothGatt;
    }

    public static /* synthetic */ IWVWebView access$600(WVBluetooth wVBluetooth) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("eec4992f", new Object[]{wVBluetooth}) : wVBluetooth.mWebView;
    }

    public static /* synthetic */ WVCallBackContext access$700(WVBluetooth wVBluetooth) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("1cf4ec67", new Object[]{wVBluetooth}) : wVBluetooth.mGetServiceCallback;
    }

    public static /* synthetic */ WVCallBackContext access$702(WVBluetooth wVBluetooth, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("5193a348", new Object[]{wVBluetooth, wVCallBackContext});
        }
        wVBluetooth.mGetServiceCallback = wVCallBackContext;
        return wVCallBackContext;
    }

    public static /* synthetic */ WVCallBackContext access$800(WVBluetooth wVBluetooth) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("e226ddc6", new Object[]{wVBluetooth}) : wVBluetooth.mReadValueCallback;
    }

    public static /* synthetic */ WVCallBackContext access$802(WVBluetooth wVBluetooth, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("3a26f327", new Object[]{wVBluetooth, wVCallBackContext});
        }
        wVBluetooth.mReadValueCallback = wVCallBackContext;
        return wVCallBackContext;
    }

    public static /* synthetic */ WVCallBackContext access$900(WVBluetooth wVBluetooth) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("a758cf25", new Object[]{wVBluetooth}) : wVBluetooth.mWriteValueCallback;
    }

    public static /* synthetic */ WVCallBackContext access$902(WVBluetooth wVBluetooth, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("22ba4306", new Object[]{wVBluetooth, wVCallBackContext});
        }
        wVBluetooth.mWriteValueCallback = wVCallBackContext;
        return wVCallBackContext;
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
        if ("requestAuthorization".equals(str)) {
            requestAuthorization(str2, wVCallBackContext);
            return true;
        } else if ("scan".equals(str)) {
            findDevices(str2, wVCallBackContext);
            return true;
        } else {
            if ("stopScan".equals(str)) {
                stopScan(str2, wVCallBackContext);
            } else if ("connect".equals(str)) {
                connectDevice(str2, wVCallBackContext);
                return true;
            } else if ("disconnect".equals(str)) {
                disconnect(str2, wVCallBackContext);
                return true;
            } else if ("getServices".equals(str)) {
                getServices(str2, wVCallBackContext);
                return true;
            } else if ("getCharacteristics".equals(str)) {
                getCharacteristics(str2, wVCallBackContext);
                return true;
            } else if ("writeValue".equals(str)) {
                writeValue(str2, wVCallBackContext);
                return true;
            } else if ("readValue".equals(str)) {
                readValue(str2, wVCallBackContext);
                return true;
            } else if ("startNotifications".equals(str)) {
                setNotifications(str2, true, wVCallBackContext);
                return true;
            } else if ("stopNotifications".equals(str)) {
                setNotifications(str2, false, wVCallBackContext);
                return true;
            }
            return false;
        }
    }

    public void requestAuthorization(String str, final WVCallBackContext wVCallBackContext) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d534acf8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                strArr = new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT", com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION};
            } else {
                strArr = new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION};
            }
            android.taobao.windvane.runtimepermission.b.a(this.mContext, strArr).a(new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVBluetooth.1
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
                    if (WVBluetooth.access$000(WVBluetooth.this) == null) {
                        rVar.a("msg", "DEVICE_NOT_SUPPORT");
                        rVar.a("state", "unsupported");
                        wVCallBackContext.error(rVar);
                    } else if (!WVBluetooth.access$000(WVBluetooth.this).isEnabled() && !WVBluetooth.access$000(WVBluetooth.this).enable()) {
                        rVar.a("msg", "BLUETOOTH_POWERED_OFF");
                        rVar.a("state", "poweredOff");
                        wVCallBackContext.error(rVar);
                    } else {
                        try {
                            jSONObject.put("state", "poweredOn");
                            rVar.a("state", "poweredOn");
                            rVar.a("value", jSONObject);
                            wVCallBackContext.success(rVar);
                        } catch (Throwable unused) {
                            wVCallBackContext.error();
                        }
                    }
                }
            }).b(new i(wVCallBackContext, WVResultWrapper.USER_DENIED, "unauthorized")).b();
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error(e.getMessage());
        }
    }

    public void getServices(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3826a022", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter == null) {
            rVar.a("msg", "DEVICE_NOT_SUPPORT");
            wVCallBackContext.error(rVar);
        } else if (bluetoothAdapter.isEnabled()) {
            try {
                String optString = new JSONObject(str).optString("deviceId", "");
                if (this.mBluetoothGatt == null || !optString.equals(this.mBluetoothGatt.getDevice().getAddress())) {
                    rVar.a("msg", "DEVICE_NOT_CONNECT");
                    wVCallBackContext.error(rVar);
                    return;
                }
            } catch (Throwable th) {
                rVar.a("msg", th.getCause());
                wVCallBackContext.error(rVar);
            }
            BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
            if (bluetoothGatt == null) {
                return;
            }
            this.mGetServiceCallback = wVCallBackContext;
            bluetoothGatt.discoverServices();
            m.c(TAG, "Attempting to start service discovery");
        } else {
            wVCallBackContext.error();
        }
    }

    public void getCharacteristics(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6404d0", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter == null) {
            rVar.a("msg", "DEVICE_NOT_SUPPORT");
            wVCallBackContext.error(rVar);
            return;
        }
        if (bluetoothAdapter.isEnabled()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("deviceId", "");
                String optString2 = jSONObject.optString("serviceId", "");
                if (this.mBluetoothGatt != null && optString.equals(this.mBluetoothGatt.getDevice().getAddress())) {
                    BluetoothGattService service = this.mBluetoothGatt.getService(UUID.fromString(optString2));
                    JSONArray jSONArray = new JSONArray();
                    for (BluetoothGattCharacteristic bluetoothGattCharacteristic : service.getCharacteristics()) {
                        jSONArray.put(new JSONObject().put("characteristicId", bluetoothGattCharacteristic.getUuid()));
                    }
                    rVar.a("characteristics", jSONArray);
                    wVCallBackContext.success(rVar);
                }
                rVar.a("msg", "DEVICE_NOT_CONNECT");
                wVCallBackContext.error();
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                wVCallBackContext.error(th.getMessage());
            }
        }
        wVCallBackContext.error();
    }

    public void findDevices(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98185b32", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter == null) {
            rVar.a("msg", "DEVICE_NOT_SUPPORT");
            wVCallBackContext.error(rVar);
        } else if (!bluetoothAdapter.isEnabled()) {
            rVar.a("msg", "BLUETOOTH_DISABLED");
            wVCallBackContext.error(rVar);
        } else {
            if (this.mLeScanCallback == null) {
                this.mLeScanCallback = new BluetoothAdapter.LeScanCallback() { // from class: android.taobao.windvane.jsbridge.api.WVBluetooth.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
                    public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d30d3c88", new Object[]{this, bluetoothDevice, new Integer(i), bArr});
                            return;
                        }
                        try {
                            String address = bluetoothDevice.getAddress();
                            if (WVBluetooth.access$100(WVBluetooth.this).contains(address)) {
                                return;
                            }
                            WVBluetooth.access$100(WVBluetooth.this).add(address);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", bluetoothDevice.getName());
                            jSONObject.put("deviceId", bluetoothDevice.getAddress());
                            WVBluetooth.access$200(WVBluetooth.this).fireEvent("WV.Event.WVBluetooth.discoverDevice", jSONObject.toString());
                            m.c(WVBluetooth.TAG, "find device : " + bluetoothDevice.getName() + " ads : " + bluetoothDevice.getAddress());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                };
            }
            this.mKnownDevices.clear();
            this.mBTAdapter.startLeScan(this.mLeScanCallback);
            wVCallBackContext.success();
        }
    }

    public void stopScan(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c0ea2d", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter == null) {
            rVar.a("msg", "DEVICE_NOT_SUPPORT");
            wVCallBackContext.error(rVar);
        } else if (!bluetoothAdapter.isEnabled()) {
            rVar.a("msg", "BLUETOOTH_DISABLED");
            wVCallBackContext.error(rVar);
        } else {
            this.mBTAdapter.stopLeScan(this.mLeScanCallback);
            wVCallBackContext.success();
        }
    }

    public void connectDevice(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f707f2e", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter == null) {
            rVar.a("msg", "DEVICE_NOT_SUPPORT");
            wVCallBackContext.error(rVar);
        } else if (!bluetoothAdapter.isEnabled()) {
            rVar.a("msg", "BLUETOOTH_DISABLED");
            wVCallBackContext.error(rVar);
        } else {
            try {
                String optString = new JSONObject(str).optString("deviceId", "");
                if (!TextUtils.isEmpty(optString)) {
                    connect(optString);
                    this.mConnectCallback = wVCallBackContext;
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                wVCallBackContext.error();
            }
            rVar.a("msg", "FAILED_TO_CONNECT");
            wVCallBackContext.error(rVar);
        }
    }

    public void writeValue(String str, WVCallBackContext wVCallBackContext) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("860a99a0", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter == null) {
            rVar.a("msg", "DEVICE_NOT_SUPPORT");
            wVCallBackContext.error(rVar);
        } else if (!bluetoothAdapter.isEnabled()) {
            rVar.a("msg", "BLUETOOTH_DISABLED");
            wVCallBackContext.error(rVar);
        } else if (this.mCurrentConnectionState != 2) {
            rVar.a("msg", "BLUETOOTH_NOT_ACTIVE: " + this.mCurrentConnectionState);
            wVCallBackContext.error(rVar);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                optString = jSONObject.optString("deviceId", "");
                optString2 = jSONObject.optString("serviceId", "");
                optString3 = jSONObject.optString("characteristicId", "");
                optString4 = jSONObject.optString("value", "");
            } catch (Throwable th) {
                th.printStackTrace();
                rVar.a("msg", th.getCause());
            }
            if (this.mBluetoothGatt != null && optString.equals(this.mBluetoothGatt.getDevice().getAddress())) {
                BluetoothGattCharacteristic characteristic = this.mBluetoothGatt.getService(UUID.fromString(optString2)).getCharacteristic(UUID.fromString(optString3));
                m.b(TAG, "get characteristic: " + optString3);
                if (characteristic != null) {
                    characteristic.setValue(Base64.decode(optString4, 2));
                    if (this.mBluetoothGatt.writeCharacteristic(characteristic)) {
                        this.mWriteValueCallback = wVCallBackContext;
                        return;
                    }
                    rVar.a("msg", "FAILED_TO_WRITE_CHARACTERISTIC: " + characteristic.getProperties());
                    wVCallBackContext.error(rVar);
                    return;
                }
                rVar.a("msg", "FAILED_TO_WRITE");
                wVCallBackContext.error(rVar);
                return;
            }
            rVar.a("msg", "DEVICE_NOT_CONNECT");
            wVCallBackContext.error(rVar);
        }
    }

    public void readValue(String str, WVCallBackContext wVCallBackContext) {
        String optString;
        String optString2;
        String optString3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc9b4b09", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter == null) {
            rVar.a("msg", "DEVICE_NOT_SUPPORT");
            wVCallBackContext.error(rVar);
        } else if (!bluetoothAdapter.isEnabled()) {
            rVar.a("msg", "BLUETOOTH_DISABLED");
            wVCallBackContext.error(rVar);
        } else if (this.mCurrentConnectionState != 2) {
            rVar.a("msg", "BLUETOOTH_NOT_ACTIVE: " + this.mCurrentConnectionState);
            wVCallBackContext.error(rVar);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                optString = jSONObject.optString("deviceId", "");
                optString2 = jSONObject.optString("serviceId", "");
                optString3 = jSONObject.optString("characteristicId", "");
                jSONObject.optString("value", "");
            } catch (Throwable th) {
                wVCallBackContext.error(th.getMessage());
            }
            if (this.mBluetoothGatt != null && optString.equals(this.mBluetoothGatt.getDevice().getAddress())) {
                BluetoothGattCharacteristic characteristic = this.mBluetoothGatt.getService(UUID.fromString(optString2)).getCharacteristic(UUID.fromString(optString3));
                if (characteristic != null) {
                    if (this.mBluetoothGatt.readCharacteristic(characteristic)) {
                        this.mReadValueCallback = wVCallBackContext;
                    } else {
                        rVar.a("msg", "FAILED_TO_READ_CHARACTERISTIC: " + characteristic.getProperties());
                        wVCallBackContext.error(rVar);
                    }
                }
                rVar.a("msg", "FAILED_TO_READ");
                wVCallBackContext.error(rVar);
                return;
            }
            rVar.a("msg", "DEVICE_NOT_CONNECT");
            wVCallBackContext.error(rVar);
        }
    }

    public void disconnect(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df190ea", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter == null) {
            rVar.a("msg", "DEVICE_NOT_SUPPORT");
            wVCallBackContext.error(rVar);
        } else if (!bluetoothAdapter.isEnabled()) {
            rVar.a("msg", "BLUETOOTH_DISABLED");
            wVCallBackContext.error(rVar);
        } else {
            try {
                this.mBluetoothGatt.disconnect();
                this.mBluetoothGatt = null;
                wVCallBackContext.success();
            } catch (Throwable th) {
                th.printStackTrace();
                wVCallBackContext.error();
                rVar.a("msg", "FAILED_TO_CONNECT");
                wVCallBackContext.error(rVar);
            }
        }
    }

    public boolean connect(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1bbc7ff", new Object[]{this, str})).booleanValue();
        }
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter == null || str == null) {
            m.d(TAG, "BluetoothAdapter not initialized or unspecified address.");
            return false;
        }
        BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
        if (remoteDevice == null) {
            m.d(TAG, "Device not found.  Unable to connect.");
            return false;
        }
        this.mBluetoothGatt = remoteDevice.connectGatt(this.mContext, false, this.mGattCallback);
        m.b(TAG, "Trying to create a new connection.");
        return true;
    }

    public void setNotifications(String str, boolean z, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5282aba", new Object[]{this, str, new Boolean(z), wVCallBackContext});
            return;
        }
        r rVar = new r();
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter == null) {
            rVar.a("msg", "DEVICE_NOT_SUPPORT");
            wVCallBackContext.error(rVar);
        } else if (!bluetoothAdapter.isEnabled()) {
            rVar.a("msg", "BLUETOOTH_DISABLED");
            wVCallBackContext.error(rVar);
        } else if (this.mCurrentConnectionState != 2) {
            rVar.a("msg", "BLUETOOTH_NOT_ACTIVE: " + this.mCurrentConnectionState);
            wVCallBackContext.error(rVar);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("deviceId", "");
                String optString2 = jSONObject.optString("serviceId", "");
                String optString3 = jSONObject.optString("characteristicId", "");
                jSONObject.optString("value", "");
                if (this.mBluetoothGatt != null && optString.equals(this.mBluetoothGatt.getDevice().getAddress())) {
                    BluetoothGattCharacteristic characteristic = this.mBluetoothGatt.getService(UUID.fromString(optString2)).getCharacteristic(UUID.fromString(optString3));
                    if (characteristic == null) {
                        return;
                    }
                    if (this.mBluetoothGatt.setCharacteristicNotification(characteristic, z)) {
                        List<BluetoothGattDescriptor> descriptors = characteristic.getDescriptors();
                        if (descriptors != null && descriptors.size() > 0) {
                            for (BluetoothGattDescriptor bluetoothGattDescriptor : descriptors) {
                                if (z) {
                                    bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                                } else {
                                    bluetoothGattDescriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                                }
                                this.mBluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
                            }
                        }
                        wVCallBackContext.success();
                        return;
                    }
                    rVar.a("msg", "FAILED_TO_SET_NOTIFICATION");
                    wVCallBackContext.error(rVar);
                    return;
                }
                rVar.a("msg", "DEVICE_NOT_CONNECT");
                wVCallBackContext.error(rVar);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
