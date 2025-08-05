package com.taobao.collection.receiver;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.ActivityCompat;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.c;
import com.taobao.collection.dto.BeaconRecord;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.kge;
import tb.nea;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROAD_CAST_ACTION = "com.taobao.lbs.collection.BLUETOOTH_SCAN_RESULT";
    public static final String BROAD_CAST_IBEACON_KEY = "devices_list";
    public static final String UUID_FEATURE_KEY = "uuid";

    /* renamed from: a  reason: collision with root package name */
    private BluetoothAdapter f16921a;
    private Handler b;
    private Looper c;
    private Runnable d;
    private Lock e;
    private Context f;
    private Map<String, BeaconRecord.IBeacon> g;
    private Set<String> h;
    private boolean i;

    static {
        kge.a(-1394628274);
    }

    public static /* synthetic */ BluetoothAdapter a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BluetoothAdapter) ipChange.ipc$dispatch("54fdd90b", new Object[]{aVar}) : aVar.f16921a;
    }

    public static /* synthetic */ Handler a(a aVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("92435f9e", new Object[]{aVar, handler});
        }
        aVar.b = handler;
        return handler;
    }

    public static /* synthetic */ Looper a(a aVar, Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Looper) ipChange.ipc$dispatch("92f99242", new Object[]{aVar, looper});
        }
        aVar.c = looper;
        return looper;
    }

    public static /* synthetic */ void a(a aVar, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc5defb3", new Object[]{aVar, str, list});
        } else {
            aVar.a(str, list);
        }
    }

    public static /* synthetic */ Lock b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Lock) ipChange.ipc$dispatch("1aa7d440", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ Map c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("16d8ae2f", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ Looper d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Looper) ipChange.ipc$dispatch("c14f24d0", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ Runnable e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("549aa418", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ Handler f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("fbf8c469", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ boolean g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d919682", new Object[]{aVar})).booleanValue() : aVar.i;
    }

    public static /* synthetic */ Set h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("d900ef6e", new Object[]{aVar}) : aVar.h;
    }

    public a(Context context, Set<String> set) {
        this.b = null;
        this.c = null;
        this.e = new ReentrantLock();
        this.g = new ConcurrentHashMap();
        this.h = null;
        this.i = true;
        if (c()) {
            this.f = context;
            this.h = set;
            BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
            if (Build.VERSION.SDK_INT < 18) {
                return;
            }
            this.f16921a = bluetoothManager.getAdapter();
        }
    }

    public a(Context context) {
        this.b = null;
        this.c = null;
        this.e = new ReentrantLock();
        this.g = new ConcurrentHashMap();
        this.h = null;
        this.i = true;
        if (c()) {
            this.f = context;
            BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
            if (Build.VERSION.SDK_INT >= 18) {
                this.f16921a = bluetoothManager.getAdapter();
            }
            this.i = false;
        }
    }

    public void a(final long j) {
        Set<String> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (!c()) {
            nea.c("lbs_sdk.coll_IBeaconHandle", "startScanWithTimeWindow isEnvCheck false");
        } else if (this.i && ((set = this.h) == null || set.isEmpty())) {
            nea.c("lbs_sdk.coll_IBeaconHandle", "startScanWithTimeWindow serviceUuids empty");
        } else {
            final C0649a c0649a = new C0649a();
            a();
            b();
            this.d = new Runnable() { // from class: com.taobao.collection.receiver.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this) == null || c0649a == null) {
                    } else {
                        if (Build.VERSION.SDK_INT >= 18) {
                            try {
                                if (ActivityCompat.checkSelfPermission(Globals.getApplication(), "android.permission.BLUETOOTH_ADMIN") == 0) {
                                    a.a(a.this).stopLeScan(c0649a);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        a.b(a.this).lock();
                        ArrayList arrayList = new ArrayList(a.c(a.this).values());
                        try {
                            Collections.sort(arrayList, new Comparator<BeaconRecord.IBeacon>() { // from class: com.taobao.collection.receiver.a.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.util.Comparator
                                public /* synthetic */ int compare(BeaconRecord.IBeacon iBeacon, BeaconRecord.IBeacon iBeacon2) {
                                    IpChange ipChange3 = $ipChange;
                                    return ipChange3 instanceof IpChange ? ((Number) ipChange3.ipc$dispatch("6a9be197", new Object[]{this, iBeacon, iBeacon2})).intValue() : a(iBeacon, iBeacon2);
                                }

                                public int a(BeaconRecord.IBeacon iBeacon, BeaconRecord.IBeacon iBeacon2) {
                                    IpChange ipChange3 = $ipChange;
                                    return ipChange3 instanceof IpChange ? ((Number) ipChange3.ipc$dispatch("d27a0da1", new Object[]{this, iBeacon, iBeacon2})).intValue() : Integer.valueOf(iBeacon2.getRssi()).compareTo(Integer.valueOf(iBeacon.getRssi()));
                                }
                            });
                            a.a(a.this, a.BROAD_CAST_ACTION, arrayList);
                        } finally {
                            a.b(a.this).unlock();
                            if (a.d(a.this) != null) {
                                a.d(a.this).quit();
                            }
                        }
                    }
                }
            };
            nea.c("lbs_sdk.coll_IBeaconHandle", "[startScanWithTimeWindow] start scan");
            new Thread(new Runnable() { // from class: com.taobao.collection.receiver.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a.a(a.this, Looper.myLooper());
                    if (a.d(a.this) == null) {
                        Looper.prepare();
                    }
                    a.a(a.this, Looper.myLooper());
                    a.a(a.this, new Handler());
                    a.f(a.this).postDelayed(a.e(a.this), j);
                    if (Build.VERSION.SDK_INT >= 18) {
                        try {
                            if (ActivityCompat.checkSelfPermission(Globals.getApplication(), "android.permission.BLUETOOTH_ADMIN") == 0) {
                                a.a(a.this).startLeScan(c0649a);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    Looper.loop();
                }
            }, "BLE_SCAN_THREAD").start();
        }
    }

    /* renamed from: com.taobao.collection.receiver.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public class C0649a implements BluetoothAdapter.LeScanCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-210494553);
            kge.a(-506956483);
        }

        private C0649a() {
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d30d3c88", new Object[]{this, bluetoothDevice, new Integer(i), bArr});
                return;
            }
            BeaconRecord.IBeacon a2 = BeaconRecord.a(bluetoothDevice, i, bArr);
            if (a2 == null) {
                return;
            }
            if (a.g(a.this)) {
                if (a.h(a.this) == null || a.h(a.this).isEmpty() || !a.h(a.this).contains(a2.proximityUuid)) {
                    return;
                }
                Map c = a.c(a.this);
                c.put(a2.proximityUuid + a2.major + a2.minor, a2);
                return;
            }
            Map c2 = a.c(a.this);
            c2.put(a2.proximityUuid + a2.major + a2.minor, a2);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Runnable runnable = this.d;
        if (runnable == null) {
            return;
        }
        this.b.removeCallbacks(runnable);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.e.lock();
        try {
            this.g.clear();
        } finally {
            this.e.unlock();
        }
    }

    private void a(String str, List<BeaconRecord.IBeacon> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
            return;
        }
        Intent intent = new Intent(str);
        intent.putExtra(BROAD_CAST_IBEACON_KEY, JSON.toJSONString(list));
        intent.setPackage(this.f.getPackageName());
        this.f.sendBroadcast(intent);
        nea.d("lbs_sdk.coll_IBeaconHandle", "扫描到的Beacon: " + list);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (c.a()) {
            return c.b();
        }
        return false;
    }
}
