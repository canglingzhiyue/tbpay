package tb;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.e;
import com.taobao.alimama.utils.c;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.utils.Global;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import tb.mtn;

/* loaded from: classes7.dex */
public class mto {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String B;
    private static int C;
    private static short Q;
    private static long R;
    private static float T;
    private static boolean X;
    private static short[] Y;
    private static long Z;
    private static boolean ab;
    private static short[] ac;
    private static long ad;
    private static boolean af;
    private static long ag;
    private static boolean ai;
    public String A;
    private byte[] D;
    private Context E;
    private String H;
    private String I;
    private String O;
    private String P;

    /* renamed from: a  reason: collision with root package name */
    public String f31251a;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public byte h;
    public String i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public String v;
    public double w;
    public double x;
    public boolean y;
    public String z;
    private int F = -1;
    private long G = -1;
    private int J = -1;
    private int K = -1;
    private int L = -1;
    private int M = -1;
    private int N = -1;
    private int S = 0;
    private int aa = 0;
    private int ae = 0;
    private int ah = 0;
    private int U = -1;
    private int V = -1;
    private SensorEventListener W = new SensorEventListener() { // from class: tb.mto.1
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
                return;
            }
            try {
                Sensor sensor = sensorEvent.sensor;
                long currentTimeMillis = System.currentTimeMillis();
                if (sensor.getType() == 5) {
                    mto.a(mto.b(sensorEvent.values[0]));
                    mto.a(currentTimeMillis);
                    mto.a(false);
                } else if (sensor.getType() == 3) {
                    mto.a(mto.a(sensorEvent.values));
                    mto.b(currentTimeMillis);
                    mto.b(false);
                } else if (sensor.getType() == 1) {
                    mto.b(mto.a(sensorEvent.values));
                    mto.c(currentTimeMillis);
                    mto.c(false);
                } else if (sensor.getType() == 19) {
                    mto.c(sensorEvent.values[0]);
                    mto.d(currentTimeMillis);
                    mto.d(false);
                }
                mto.a(mto.this, sensor.getType());
            } catch (Throwable unused) {
            }
        }
    };

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DEFAULT_INT_VALUE = -1;
        public static final double GEO_NOT_SUPPORT = 0.0d;
        public static final int INT_VALUE_ZERO = 0;
        public static final String LOCAL_LATITUDE = "latitude";
        public static final String LOCAL_LONGITUDE = "longitude";
        public static final String VIEW_HEIGHT = "viewH";
        public static final String VIEW_WIDTH = "viewW";

        /* renamed from: a  reason: collision with root package name */
        private static final byte[] f31253a;
        private static final byte[] b;
        private static final byte[] c;

        static {
            kge.a(-760857710);
            f31253a = new byte[]{-1};
            b = new byte[]{-1, -1, -1, -1, -1, -1, -1};
            c = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        }

        public static /* synthetic */ byte[] a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a8212175", new Object[0]) : f31253a;
        }
    }

    public static /* synthetic */ long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue();
        }
        R = j;
        return j;
    }

    public static /* synthetic */ short a(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821b922", new Object[]{new Short(s)})).shortValue();
        }
        Q = s;
        return s;
    }

    public static /* synthetic */ void a(mto mtoVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b03df2d3", new Object[]{mtoVar, new Integer(i)});
        } else {
            mtoVar.a(i);
        }
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        X = z;
        return z;
    }

    public static /* synthetic */ short[] a(float[] fArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (short[]) ipChange.ipc$dispatch("2715511b", new Object[]{fArr}) : b(fArr);
    }

    public static /* synthetic */ short[] a(short[] sArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (short[]) ipChange.ipc$dispatch("271b39ee", new Object[]{sArr});
        }
        Y = sArr;
        return sArr;
    }

    public static /* synthetic */ long b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66fef", new Object[]{new Long(j)})).longValue();
        }
        Z = j;
        return j;
    }

    public static /* synthetic */ short b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d660f4", new Object[]{new Float(f)})).shortValue() : d(f);
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{new Boolean(z)})).booleanValue();
        }
        ab = z;
        return z;
    }

    public static /* synthetic */ short[] b(short[] sArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (short[]) ipChange.ipc$dispatch("8efc66cd", new Object[]{sArr});
        }
        ac = sArr;
        return sArr;
    }

    public static /* synthetic */ float c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b3986", new Object[]{new Float(f)})).floatValue();
        }
        T = f;
        return f;
    }

    public static /* synthetic */ long c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b488e", new Object[]{new Long(j)})).longValue();
        }
        ad = j;
        return j;
    }

    public static /* synthetic */ boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b84ae", new Object[]{new Boolean(z)})).booleanValue();
        }
        af = z;
        return z;
    }

    public static /* synthetic */ long d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad40212d", new Object[]{new Long(j)})).longValue();
        }
        ag = j;
        return j;
    }

    public static /* synthetic */ boolean d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad405d4d", new Object[]{new Boolean(z)})).booleanValue();
        }
        ai = z;
        return z;
    }

    static {
        kge.a(1595683749);
        B = mto.class.getName();
        C = 0;
        Q = (short) -1;
        R = 0L;
        X = false;
        Y = new short[]{-1, -1, -1};
        Z = 0L;
        ab = false;
        ac = new short[]{-1, -1, -1};
        ad = 0L;
        af = false;
        T = -1.0f;
        ag = 0L;
        ai = false;
    }

    private mto() {
    }

    public mto(Context context, Bundle bundle) {
        TBLocationDTO b;
        this.E = context;
        e();
        if (bundle != null) {
            this.w = bundle.getDouble("longitude", a.GEO_NOT_SUPPORT);
            this.x = bundle.getDouble("latitude", a.GEO_NOT_SUPPORT);
        } else {
            this.w = a.GEO_NOT_SUPPORT;
            this.x = a.GEO_NOT_SUPPORT;
            e c = com.taobao.alimama.services.a.d().c();
            if (c != null && (b = c.b()) != null) {
                try {
                    this.w = Double.parseDouble(b.longitude);
                    this.x = Double.parseDouble(b.latitude);
                } catch (Exception unused) {
                }
            }
        }
        c();
    }

    public String a(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String str2 = B;
        TaoLog.Logd(str2, "Encode data:" + a());
        this.z = str;
        return mtn.a(new String(b()));
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("emulator:" + ((Object) sb));
        sb.append("\r\n");
        sb.append("osVersion:" + this.c);
        sb.append("\r\n");
        sb.append("MAC:" + this.e);
        sb.append("\r\n");
        sb.append("IMSI:" + this.f);
        sb.append("\r\n");
        sb.append("deviceId:" + this.g);
        sb.append("\r\n");
        sb.append("deviceType:" + ((int) this.h));
        sb.append("\r\n");
        sb.append("manufacturer:" + this.i);
        sb.append("\r\n");
        sb.append("appWidth:" + this.j);
        sb.append("\r\n");
        sb.append("appHight:" + this.k);
        sb.append("\r\n");
        sb.append("screenDensity:" + this.l);
        sb.append("\r\n");
        sb.append("screenBright:" + this.m);
        sb.append("\r\n");
        sb.append("netType:" + this.n);
        sb.append("\r\n");
        sb.append("netProtocol:" + this.o);
        sb.append("\r\n");
        sb.append("appRunTime:" + C);
        sb.append("\r\n");
        sb.append("touchDownX:" + this.p);
        sb.append("\r\n");
        sb.append("touchDownY:" + this.q);
        sb.append("\r\n");
        sb.append("availPower:" + this.r);
        sb.append("\r\n");
        sb.append("totalMemory:" + this.s);
        sb.append("\r\n");
        sb.append("availMemory:" + this.t);
        sb.append("\r\n");
        sb.append("netTraffic:" + this.u);
        sb.append("\r\n");
        sb.append("packName:" + this.v);
        sb.append("\r\n");
        sb.append("longitude:" + this.w);
        sb.append("\r\n");
        sb.append("latitude:" + this.x);
        sb.append("\r\n");
        sb.append("isRoot:-1");
        sb.append("\r\n");
        sb.append("sensorNum:" + this.F);
        sb.append("\r\n");
        sb.append("deviceElapseTime:" + this.G);
        sb.append("\r\n");
        sb.append("ssid:" + this.H);
        sb.append("\r\n");
        sb.append("bssid:" + this.I);
        sb.append("\r\n");
        sb.append("systemVolume:" + this.J);
        sb.append("\r\n");
        sb.append("callVolume:" + this.K);
        sb.append("\r\n");
        sb.append("ringVolume:" + this.L);
        sb.append("\r\n");
        sb.append("musicVolume:" + this.M);
        sb.append("\r\n");
        sb.append("alarmVolume:" + this.N);
        sb.append("\r\n");
        sb.append("appVersion:" + this.O);
        sb.append("\r\n");
        sb.append("sdkVersion:" + this.P);
        sb.append("\r\n");
        return sb.toString();
    }

    private byte[] b() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a9d5fa14", new Object[]{this});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(byteArrayOutputStream, this.d);
        a(byteArrayOutputStream, this.c);
        a(byteArrayOutputStream, this.e);
        a(byteArrayOutputStream, this.f);
        a(byteArrayOutputStream, this.g);
        byteArrayOutputStream.write(this.h);
        a(byteArrayOutputStream, this.i);
        a(byteArrayOutputStream, this.j);
        a(byteArrayOutputStream, this.k);
        a(byteArrayOutputStream, this.l);
        byteArrayOutputStream.write((byte) this.m);
        byteArrayOutputStream.write((byte) this.n);
        byteArrayOutputStream.write((byte) this.o);
        b(byteArrayOutputStream, C);
        a(byteArrayOutputStream, this.p);
        a(byteArrayOutputStream, this.q);
        byteArrayOutputStream.write((byte) this.r);
        a(byteArrayOutputStream, this.s);
        a(byteArrayOutputStream, this.t);
        a(byteArrayOutputStream, this.u);
        a(byteArrayOutputStream, this.v);
        a(byteArrayOutputStream, this.w, 180);
        a(byteArrayOutputStream, this.x, 180);
        byteArrayOutputStream.write(a.a());
        a(byteArrayOutputStream, this.z);
        a(byteArrayOutputStream, this.A);
        byteArrayOutputStream.write((byte) this.F);
        b(byteArrayOutputStream, (int) this.G);
        a(byteArrayOutputStream, this.H, 32);
        a(byteArrayOutputStream, this.I, 17);
        byteArrayOutputStream.write((byte) this.J);
        byteArrayOutputStream.write((byte) this.K);
        byteArrayOutputStream.write((byte) this.L);
        byteArrayOutputStream.write((byte) this.M);
        byteArrayOutputStream.write((byte) this.N);
        a(byteArrayOutputStream, this.O);
        a(byteArrayOutputStream, this.P);
        f();
        byteArrayOutputStream.write(b(Q));
        byteArrayOutputStream.write(b(this.S));
        byteArrayOutputStream.write(c(Y));
        byteArrayOutputStream.write(b(this.aa));
        byteArrayOutputStream.write(c(ac));
        byteArrayOutputStream.write(b(this.ae));
        byteArrayOutputStream.write(a(T));
        byteArrayOutputStream.write(b(this.ah));
        byteArrayOutputStream.write((byte) this.U);
        byteArrayOutputStream.write((byte) this.V);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = new byte[byteArray.length + 7];
        this.D = mtn.a.a(byteArray);
        a(this.f31251a, bArr, 0);
        a(this.D, bArr, 2);
        a((byte) this.b, bArr, 6);
        System.arraycopy(byteArray, 0, bArr, 7, byteArray.length);
        try {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return Base64.encode(bArr, 0);
        } finally {
            g();
            byteArrayOutputStream.close();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.S = (int) ((currentTimeMillis - R) / 1000);
        if (this.S > 65535) {
            this.S = 65535;
        }
        this.aa = (int) ((currentTimeMillis - Z) / 1000);
        if (this.aa > 65535) {
            this.aa = 65535;
        }
        this.ae = (int) ((currentTimeMillis - ad) / 1000);
        if (this.ae > 65535) {
            this.ae = 65535;
        }
        this.ah = (int) ((currentTimeMillis - ag) / 1000);
        if (this.ah <= 65535) {
            return;
        }
        this.ah = 65535;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Q = (short) -1;
        Y = new short[]{-1, -1, -1};
        ac = new short[]{-1, -1, -1};
        T = -1.0f;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f31251a = "1.5";
        if (C == 0) {
            C = (int) (Global.getStartupTimestamp() / 1000);
        }
        this.b = 1;
        this.c = mtn.b();
        this.d = mtn.a();
        this.e = mtn.a(this.E);
        this.f = mtn.b(this.E);
        this.g = mtn.c(this.E);
        this.h = (byte) 3;
        this.i = mtn.c();
        this.j = mtn.d(this.E);
        this.k = mtn.e(this.E);
        this.p = -1;
        this.q = -1;
        this.r = mtn.l(this.E);
        this.l = mtn.f(this.E);
        this.m = mtn.g(this.E);
        this.n = mtn.h(this.E);
        this.o = mtn.i(this.E);
        this.s = mtn.j(this.E);
        this.t = mtn.k(this.E);
        this.u = -1;
        this.v = mtn.m(this.E);
        this.y = false;
        this.A = "";
        if (c.g()) {
            this.F = mtn.n(this.E);
            this.G = SystemClock.elapsedRealtime();
            long j = this.G;
            if (j > 2147483647L) {
                this.G = j / 1000;
                if (this.G > 2147483647L) {
                    this.G = -1L;
                }
            }
            this.H = mtn.d();
            this.I = mtn.e();
            d();
            this.O = Global.getVersionName();
            this.P = "5.15.6";
        }
        this.U = mtn.o(this.E);
        this.V = mtn.p(this.E);
    }

    public static void a(OutputStream outputStream, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a151e9", new Object[]{outputStream, new Integer(i)});
            return;
        }
        outputStream.write((byte) (i >> 8));
        outputStream.write((byte) i);
    }

    public static void b(OutputStream outputStream, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8725948", new Object[]{outputStream, new Integer(i)});
            return;
        }
        outputStream.write((byte) (i >> 24));
        outputStream.write((byte) (i >> 16));
        outputStream.write((byte) (i >> 8));
        outputStream.write((byte) i);
    }

    public static void a(OutputStream outputStream, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d33a4", new Object[]{outputStream, str});
        } else if (str != null && str.trim().length() > 0) {
            byte[] bytes = str.getBytes();
            outputStream.write((byte) bytes.length);
            outputStream.write(bytes);
        } else {
            outputStream.write(0);
        }
    }

    private static byte[] b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("90f71be3", new Object[]{new Integer(i)}) : new byte[]{(byte) i, (byte) (i >> 8)};
    }

    private static byte[] b(short s) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("90fba799", new Object[]{new Short(s)}) : new byte[]{(byte) s, (byte) (s >> 8)};
    }

    private static byte[] c(short[] sArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f6dd939b", new Object[]{sArr});
        }
        byte[] bArr = new byte[sArr.length * 2];
        for (int i = 0; i < sArr.length; i++) {
            System.arraycopy(b(sArr[i]), 0, bArr, i << 1, 2);
        }
        return bArr;
    }

    public static byte[] a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5c0f8385", new Object[]{new Float(f)});
        }
        byte[] bArr = new byte[4];
        try {
            int floatToIntBits = Float.floatToIntBits(f);
            bArr[0] = (byte) floatToIntBits;
            bArr[1] = (byte) (floatToIntBits >> 8);
            bArr[2] = (byte) (floatToIntBits >> 16);
            bArr[3] = (byte) (floatToIntBits >>> 24);
        } catch (Throwable unused) {
            Arrays.fill(bArr, (byte) -1);
        }
        return bArr;
    }

    private static short d(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad401232", new Object[]{new Float(f)})).shortValue();
        }
        int floatToIntBits = Float.floatToIntBits(f);
        int i = (floatToIntBits >>> 16) & 32768;
        int i2 = Integer.MAX_VALUE & floatToIntBits;
        int i3 = i2 + 4096;
        if (i3 >= 1199570944) {
            return i2 >= 1199570944 ? i3 < 2139095040 ? (short) (i | 31744) : (short) (((floatToIntBits & 8388607) >>> 13) | i | 31744) : (short) (i | 31743);
        } else if (i3 >= 947912704) {
            return (short) (((i3 - 939524096) >>> 13) | i);
        } else {
            if (i3 < 855638016) {
                return (short) i;
            }
            int i4 = i2 >>> 23;
            return (short) (((((floatToIntBits & 8388607) | 8388608) + (8388608 >>> (i4 - 102))) >>> (126 - i4)) | i);
        }
    }

    private static short[] b(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (short[]) ipChange.ipc$dispatch("8ef67dfa", new Object[]{fArr});
        }
        short[] sArr = new short[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            sArr[i] = d(fArr[i]);
        }
        return sArr;
    }

    public static void a(OutputStream outputStream, double d, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c87185f", new Object[]{outputStream, new Double(d), new Integer(i)});
            return;
        }
        int i2 = -1;
        int i3 = (d > a.GEO_NOT_SUPPORT ? 1 : (d == a.GEO_NOT_SUPPORT ? 0 : -1));
        if (i3 != 0) {
            int floor = (int) Math.floor(Math.abs(d));
            i2 = (((int) Math.floor(mtn.a(Math.abs(d)) * 60.0d)) & 63) | 0 | (((i3 > 0 ? floor + 180 : 180 - floor) << 6) & 32704);
        }
        a(outputStream, i2);
    }

    private static void a(String str, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f585aa", new Object[]{str, bArr, new Integer(i)});
            return;
        }
        try {
            String[] split = str.split("\\.");
            bArr[i] = Integer.valueOf(split[0]).byteValue();
            bArr[i + 1] = Integer.valueOf(split[1]).byteValue();
        } catch (Exception unused) {
        }
    }

    private static void a(byte[] bArr, byte[] bArr2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e72d8d", new Object[]{bArr, bArr2, new Integer(i)});
            return;
        }
        int i2 = i + 1;
        bArr2[i] = bArr[0];
        int i3 = i2 + 1;
        bArr2[i2] = bArr[5];
        bArr2[i3] = bArr[10];
        bArr2[i3 + 1] = bArr[15];
    }

    private static void a(byte b, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921ead48", new Object[]{new Byte(b), bArr, new Integer(i)});
        } else {
            bArr[i] = b;
        }
    }

    private static void a(OutputStream outputStream, String str, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d59b3df", new Object[]{outputStream, str, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (StringUtils.isEmpty(str)) {
            outputStream.write(0);
            return;
        }
        byte[] bytes = str.getBytes();
        if (bytes.length > i) {
            bytes = Arrays.copyOf(bytes, i);
        }
        outputStream.write((byte) bytes.length);
        outputStream.write(bytes);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        AudioManager audioManager = (AudioManager) this.E.getSystemService("audio");
        this.J = audioManager.getStreamVolume(1);
        this.K = audioManager.getStreamVolume(0);
        this.L = audioManager.getStreamVolume(2);
        this.M = audioManager.getStreamVolume(3);
        this.N = audioManager.getStreamVolume(4);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        SensorManager sensorManager = (SensorManager) this.E.getSystemService("sensor");
        if (sensorManager == null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(5);
        if (defaultSensor != null && !X) {
            sensorManager.registerListener(this.W, defaultSensor, 3);
            X = true;
        }
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(3);
        if (defaultSensor2 != null && !ab) {
            sensorManager.registerListener(this.W, defaultSensor2, 3);
            ab = true;
        }
        Sensor defaultSensor3 = sensorManager.getDefaultSensor(1);
        if (defaultSensor3 != null && !af) {
            sensorManager.registerListener(this.W, defaultSensor3, 3);
            af = true;
        }
        Sensor defaultSensor4 = sensorManager.getDefaultSensor(19);
        if (defaultSensor4 == null || ai) {
            return;
        }
        sensorManager.registerListener(this.W, defaultSensor4, 3);
        ai = true;
    }

    private void a(int i) {
        Sensor defaultSensor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        SensorManager sensorManager = (SensorManager) this.E.getSystemService("sensor");
        if (sensorManager == null || (defaultSensor = sensorManager.getDefaultSensor(i)) == null) {
            return;
        }
        sensorManager.unregisterListener(this.W, defaultSensor);
    }
}
