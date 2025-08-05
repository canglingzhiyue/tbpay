package android.taobao.windvane.jsbridge.api;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Vibrator;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.b;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.i;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.net.URLDecoder;
import org.json.JSONException;
import org.json.JSONObject;
import tb.dlu;
import tb.kge;

/* loaded from: classes2.dex */
public class WVMotion extends e implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SHAKE_STOP = 1;
    private static final String TAG = "WVMotion";
    private android.taobao.windvane.jsbridge.api.a blowSensor;
    private Vibrator vibrator;
    private b mShakeListener = null;
    private SensorManager sm = null;
    private long currentTime = 0;
    private long currentTime2 = 0;
    private long frequency = 0;
    private long frequency2 = 0;
    private WVCallBackContext mCallback = null;
    public SensorEventListener mSensorListener = new SensorEventListener() { // from class: android.taobao.windvane.jsbridge.api.WVMotion.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            } else if (9 != sensorEvent.sensor.getType() || WVMotion.access$100(WVMotion.this) > System.currentTimeMillis() - WVMotion.access$200(WVMotion.this)) {
            } else {
                float[] fArr = sensorEvent.values;
                String str = "{\"x\":\"" + ((-fArr[0]) / 10.0f) + "\",\"y\":\"" + ((-fArr[1]) / 10.0f) + "\",\"z\":\"" + ((-fArr[2]) / 10.0f) + "\"}";
                if (WVMotion.access$300(WVMotion.this) != null) {
                    WVMotion.access$300(WVMotion.this).fireEvent("motion.gyro", str);
                } else {
                    WVMotion.access$400(WVMotion.this);
                }
                WVMotion.access$202(WVMotion.this, System.currentTimeMillis());
            }
        }
    };
    public SensorEventListener mSensorListener2 = new SensorEventListener() { // from class: android.taobao.windvane.jsbridge.api.WVMotion.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            } else if (4 != sensorEvent.sensor.getType() || WVMotion.access$500(WVMotion.this) > System.currentTimeMillis() - WVMotion.access$600(WVMotion.this)) {
            } else {
                float[] fArr = sensorEvent.values;
                String str = "{\"alpha\":\"" + fArr[0] + "\",\"beta\":\"" + fArr[1] + "\",\"gama\":\"" + fArr[2] + "\"}";
                if (WVMotion.access$300(WVMotion.this) != null) {
                    WVMotion.access$300(WVMotion.this).fireEvent("WV.Event.Motion.RotationRate", str);
                } else {
                    WVMotion.access$700(WVMotion.this);
                }
                WVMotion.access$602(WVMotion.this, System.currentTimeMillis());
            }
        }
    };
    private Handler handler = new Handler(Looper.getMainLooper(), this);

    static {
        kge.a(-49128605);
        kge.a(-1043440182);
    }

    public static /* synthetic */ Object ipc$super(WVMotion wVMotion, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode != 797441118) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onPause();
            return null;
        }
    }

    public static /* synthetic */ boolean access$000(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3cffad6b", new Object[]{wVMotion})).booleanValue() : wVMotion.isAlive;
    }

    public static /* synthetic */ long access$100(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("571b2bfa", new Object[]{wVMotion})).longValue() : wVMotion.frequency;
    }

    public static /* synthetic */ long access$200(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7136aa99", new Object[]{wVMotion})).longValue() : wVMotion.currentTime;
    }

    public static /* synthetic */ long access$202(WVMotion wVMotion, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d01483b5", new Object[]{wVMotion, new Long(j)})).longValue();
        }
        wVMotion.currentTime = j;
        return j;
    }

    public static /* synthetic */ WVCallBackContext access$300(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("9a98324f", new Object[]{wVMotion}) : wVMotion.mCallback;
    }

    public static /* synthetic */ void access$400(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56da7e3", new Object[]{wVMotion});
        } else {
            wVMotion.stopListenGyro();
        }
    }

    public static /* synthetic */ long access$500(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bf892676", new Object[]{wVMotion})).longValue() : wVMotion.frequency2;
    }

    public static /* synthetic */ long access$600(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d9a4a515", new Object[]{wVMotion})).longValue() : wVMotion.currentTime2;
    }

    public static /* synthetic */ long access$602(WVMotion wVMotion, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7565d8b9", new Object[]{wVMotion, new Long(j)})).longValue();
        }
        wVMotion.currentTime2 = j;
        return j;
    }

    public static /* synthetic */ void access$700(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c023c0", new Object[]{wVMotion});
        } else {
            wVMotion.stopListenRota();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, final String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("listeningShake".equals(str)) {
            listeningShake(wVCallBackContext, str2);
        } else if (dlu.API_VIBRATE.equals(str)) {
            vibrate(wVCallBackContext, str2);
        } else if ("listenBlow".equals(str)) {
            try {
                android.taobao.windvane.runtimepermission.b.a(this.mContext, new String[]{"android.permission.RECORD_AUDIO"}).a(new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVMotion.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            WVMotion.this.listenBlow(wVCallBackContext, str2);
                        }
                    }
                }).b(new i(wVCallBackContext, "NO_PERMISSION")).b();
            } catch (Exception unused) {
            }
        } else if ("stopListenBlow".equals(str)) {
            stopListenBlow(wVCallBackContext, str2);
        } else if ("listenGyro".equals(str)) {
            listenGyro(wVCallBackContext, str2);
        } else if (!"listenRotationRate".equals(str)) {
            return false;
        } else {
            listenRotationRate(wVCallBackContext, str2);
        }
        return true;
    }

    public synchronized void listeningShake(WVCallBackContext wVCallBackContext, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6252f859", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        long j = 500;
        long j2 = 1000;
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLDecoder.decode(str, "utf-8");
            } catch (Exception unused) {
                m.e(TAG, "listeningShake: param decode error, param=" + str);
                z2 = true;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                z = jSONObject.getBoolean("on");
                j = jSONObject.optLong("frequency", 500L);
                j2 = jSONObject.optLong("checkFrequency", 1000L);
            } catch (JSONException unused2) {
                m.e(TAG, "listeningShake: param parse to JSON error, param=" + str);
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return;
            }
        } else {
            z = false;
        }
        if (z2) {
            if (m.a()) {
                m.d(TAG, "listeningShake: isFail");
            }
            wVCallBackContext.error(rVar);
        } else if (z) {
            m.e(TAG, "listeningShake: start ...");
            if (this.mShakeListener != null) {
                this.mShakeListener.d();
            }
            this.mShakeListener = new b(this.mContext, j2);
            this.mShakeListener.a(new a(wVCallBackContext, j));
            wVCallBackContext.success(rVar);
        } else {
            m.e(TAG, "listeningShake: stop.");
            Message message = new Message();
            message.what = 1;
            message.obj = wVCallBackContext;
            if (this.handler != null) {
                this.handler.sendMessage(message);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 1) {
            stopShake();
            if (message.obj instanceof WVCallBackContext) {
                ((WVCallBackContext) message.obj).success(new r());
            }
            return true;
        } else if (i != 4101) {
            if (i != 4102) {
                return false;
            }
            WVCallBackContext wVCallBackContext = this.mCallback;
            if (wVCallBackContext != null) {
                wVCallBackContext.error(new r());
            }
            return true;
        } else if (!this.isAlive) {
            return true;
        } else {
            r rVar = new r();
            rVar.b();
            rVar.a(aw.PARAM_VRPASS, "1");
            WVCallBackContext wVCallBackContext2 = this.mCallback;
            if (wVCallBackContext2 != null) {
                wVCallBackContext2.fireEvent("motion.blow", rVar.d());
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class a implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WVCallBackContext b;
        private long c;
        private long d = 0;

        static {
            kge.a(2065361965);
            kge.a(1681836035);
        }

        public a(WVCallBackContext wVCallBackContext, long j) {
            this.b = null;
            this.c = 0L;
            this.b = wVCallBackContext;
            this.c = j;
        }

        @Override // android.taobao.windvane.jsbridge.api.b.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!WVMotion.access$000(WVMotion.this)) {
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.d < this.c) {
                    return;
                }
                r rVar = new r();
                rVar.b();
                WVCallBackContext wVCallBackContext = this.b;
                if (wVCallBackContext != null) {
                    wVCallBackContext.fireEvent("motion.shake", rVar.d());
                }
                this.d = currentTimeMillis;
            }
        }
    }

    private void stopListenGyro() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76239f3f", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.sm;
        if (sensorManager == null) {
            return;
        }
        SensorEventListener sensorEventListener = this.mSensorListener;
        if (sensorEventListener != null) {
            sensorManager.unregisterListener(sensorEventListener);
        }
        this.sm = null;
    }

    private void stopListenRota() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de76a47a", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.sm;
        if (sensorManager == null) {
            return;
        }
        SensorEventListener sensorEventListener = this.mSensorListener2;
        if (sensorEventListener != null) {
            sensorManager.unregisterListener(sensorEventListener);
        }
        this.sm = null;
    }

    private void stopShake() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc7daab", new Object[]{this});
            return;
        }
        b bVar = this.mShakeListener;
        if (bVar == null) {
            return;
        }
        bVar.d();
        this.mShakeListener = null;
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        stopShake();
        stopListenGyro();
        stopListenRota();
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
            this.vibrator = null;
        }
        this.mCallback = null;
        android.taobao.windvane.jsbridge.api.a aVar = this.blowSensor;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onResume() {
        SensorEventListener sensorEventListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.sm;
        if (sensorManager != null && (sensorEventListener = this.mSensorListener) != null) {
            sensorManager.registerListener(sensorEventListener, sensorManager.getDefaultSensor(9), 3);
        }
        b bVar = this.mShakeListener;
        if (bVar != null) {
            bVar.c();
        }
        android.taobao.windvane.jsbridge.api.a aVar = this.blowSensor;
        if (aVar != null) {
            aVar.a();
        }
        super.onResume();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onPause() {
        SensorEventListener sensorEventListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.sm;
        if (sensorManager != null && (sensorEventListener = this.mSensorListener) != null) {
            sensorManager.unregisterListener(sensorEventListener);
        }
        b bVar = this.mShakeListener;
        if (bVar != null) {
            bVar.b();
        }
        android.taobao.windvane.jsbridge.api.a aVar = this.blowSensor;
        if (aVar != null) {
            aVar.b();
        }
        super.onPause();
    }

    public synchronized void vibrate(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e224e5bd", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        try {
            int optInt = new JSONObject(str).optInt("duration", 350);
            if (optInt < 0) {
                optInt = 350;
            }
            if (this.vibrator == null) {
                this.vibrator = (Vibrator) this.mContext.getSystemService("vibrator");
            }
            this.vibrator.vibrate(optInt);
            m.b(TAG, "vibrate: start ...");
            wVCallBackContext.success(new r());
        } catch (JSONException unused) {
            m.e(TAG, "vibrate: param parse to JSON error, param=" + str);
            rVar.a("HY_PARAM_ERR");
            wVCallBackContext.error(rVar);
        }
    }

    public synchronized void stopListenBlow(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7846109", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (m.a()) {
            m.b(TAG, "stopListenBlow: stopped. " + str);
        }
        if (this.blowSensor != null) {
            this.blowSensor.b();
            this.blowSensor = null;
        }
        wVCallBackContext.success(new r());
    }

    public synchronized void listenBlow(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf549e7", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (m.a()) {
            m.b(TAG, "listenBlow: start. " + str);
        }
        this.mCallback = wVCallBackContext;
        if (this.blowSensor != null) {
            this.blowSensor.b();
        }
        this.blowSensor = new android.taobao.windvane.jsbridge.api.a(this.handler);
        this.blowSensor.a();
        wVCallBackContext.success(new r());
    }

    public synchronized void listenRotationRate(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210b35b3", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (m.a()) {
            m.b(TAG, "listenRotationRate:  " + str);
        }
        r rVar = new r();
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.frequency2 = jSONObject.optInt("frequency", 100);
            boolean optBoolean = jSONObject.optBoolean("on");
            this.mCallback = wVCallBackContext;
            if (this.sm == null) {
                this.sm = (SensorManager) this.mContext.getSystemService("sensor");
            }
            if (optBoolean) {
                this.sm.registerListener(this.mSensorListener2, this.sm.getDefaultSensor(4), 3);
                this.currentTime = System.currentTimeMillis();
            } else {
                stopListenRota();
            }
            wVCallBackContext.success(new r());
        } catch (JSONException unused) {
            m.e(TAG, "vibrate: param parse to JSON error, param=" + str);
            rVar.a("HY_PARAM_ERR");
            wVCallBackContext.error(rVar);
        }
    }

    public synchronized void listenGyro(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4c80a4", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (m.a()) {
            m.b(TAG, "listenGyro:  " + str);
        }
        r rVar = new r();
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.frequency = jSONObject.optInt("frequency", 100);
            boolean optBoolean = jSONObject.optBoolean("on");
            this.mCallback = wVCallBackContext;
            if (this.sm == null) {
                this.sm = (SensorManager) this.mContext.getSystemService("sensor");
            }
            if (optBoolean) {
                this.sm.registerListener(this.mSensorListener, this.sm.getDefaultSensor(9), 3);
                this.currentTime = System.currentTimeMillis();
            } else {
                stopListenGyro();
            }
            wVCallBackContext.success(new r());
        } catch (JSONException unused) {
            m.e(TAG, "vibrate: param parse to JSON error, param=" + str);
            rVar.a("HY_PARAM_ERR");
            wVCallBackContext.error(rVar);
        }
    }
}
