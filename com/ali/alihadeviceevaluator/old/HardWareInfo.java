package com.ali.alihadeviceevaluator.old;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.aks;
import tb.alf;
import tb.alh;

/* loaded from: classes.dex */
public class HardWareInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f1802a;
    public String b;
    public int c;
    public float d;
    public float e;
    public float[] f;
    public String g;
    public String h;
    public long i;
    public String j;
    public ViewGroup n;
    public OnlineGLSurfaceView o;
    public String p;
    public boolean q;
    private m r = new m();
    public float m = aks.a().d().f25405a;
    public int k = aks.a().d().b;
    public int l = aks.a().d().c;

    /* loaded from: classes2.dex */
    public class OnlineGLSurfaceView extends GLSurfaceView {
        public a mRenderer;

        public OnlineGLSurfaceView(Context context) {
            super(context);
            setEGLConfigChooser(8, 8, 8, 8, 0, 0);
            HardWareInfo.this.getClass();
            this.mRenderer = new a();
            setRenderer(this.mRenderer);
            Log.e("HardWareInfo", "OnlineGLSurfaceView");
        }
    }

    public static /* synthetic */ m a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("d67161e1", new Object[]{hardWareInfo}) : hardWareInfo.r;
    }

    public HardWareInfo(Context context) {
        File filesDir;
        BufferedReader bufferedReader;
        this.c = 0;
        if (context.getFilesDir() != null) {
            this.p = filesDir.getAbsolutePath() + "/deviceInfo";
        } else {
            this.p = "";
        }
        File file = new File(this.p);
        if (file.exists()) {
            this.q = true;
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    try {
                        bufferedReader = new BufferedReader(new FileReader(file));
                        try {
                            try {
                                this.f1802a = bufferedReader.readLine();
                                this.b = bufferedReader.readLine();
                                String readLine = bufferedReader.readLine();
                                if (readLine != null) {
                                    this.c = Integer.parseInt(readLine);
                                }
                                String readLine2 = bufferedReader.readLine();
                                if (readLine2 != null) {
                                    this.d = Float.parseFloat(readLine2);
                                }
                                String readLine3 = bufferedReader.readLine();
                                if (readLine3 != null) {
                                    this.e = Float.parseFloat(readLine3);
                                    if (this.e <= 0.0f) {
                                        this.e = this.d;
                                    }
                                }
                                String readLine4 = bufferedReader.readLine();
                                if (this.f == null) {
                                    this.f = new float[d()];
                                }
                                if (readLine4 != null) {
                                    try {
                                        String[] split = readLine4.split(",");
                                        if (split != null && split.length > 0) {
                                            for (int i = 0; i < split.length; i++) {
                                                this.f[i] = Float.parseFloat(split[i]);
                                            }
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                                this.g = bufferedReader.readLine();
                                this.h = bufferedReader.readLine();
                                String readLine5 = bufferedReader.readLine();
                                if (readLine5 != null) {
                                    this.i = Long.parseLong(readLine5);
                                }
                                try {
                                    String readLine6 = bufferedReader.readLine();
                                    if (!TextUtils.isEmpty(readLine6)) {
                                        this.j = readLine6;
                                    } else {
                                        this.j = b();
                                    }
                                } catch (Throwable unused) {
                                }
                                String str = "load local file succ: cpuBrand=" + this.f1802a + ", cpuName=" + this.b + ",cpuCount=" + this.c + ",maxFreq=" + this.d + ",minFreq=" + this.e + ",freqCount=" + this.f.length + ",GpuName" + this.g + ",GpuBrand=" + this.h + ",GpuFreq=" + this.i + ",CpuArch=" + this.j;
                                bufferedReader.close();
                            } catch (Throwable th) {
                                th = th;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            bufferedReader2 = bufferedReader;
                            Log.e(alf.TAG, "load local file failed!!");
                            e.printStackTrace();
                            if (bufferedReader2 != null) {
                                bufferedReader2.close();
                            }
                            d();
                            e();
                            c();
                            b();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        d();
        e();
        c();
        b();
    }

    public void a() {
        BufferedWriter bufferedWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.q && this.g != null && alh.a()) {
            this.q = true;
            File file = new File(this.p);
            if (file.exists()) {
                file.delete();
            }
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    bufferedWriter = new BufferedWriter(new FileWriter(file));
                    try {
                        bufferedWriter.write(this.f1802a);
                        bufferedWriter.newLine();
                        bufferedWriter.write(this.b);
                        bufferedWriter.newLine();
                        bufferedWriter.write(String.valueOf(this.c));
                        bufferedWriter.newLine();
                        bufferedWriter.write(String.valueOf(this.d));
                        bufferedWriter.newLine();
                        bufferedWriter.write(String.valueOf(this.e));
                        bufferedWriter.newLine();
                        StringBuilder sb = new StringBuilder(50);
                        if (this.f != null && this.f.length > 0) {
                            for (int i = 0; i < this.f.length; i++) {
                                sb.append(this.f[i]);
                                if (i < this.f.length - 1) {
                                    sb.append(',');
                                }
                            }
                        }
                        bufferedWriter.write(sb.toString());
                        bufferedWriter.newLine();
                        bufferedWriter.write(this.g);
                        bufferedWriter.newLine();
                        bufferedWriter.write(this.h);
                        bufferedWriter.newLine();
                        bufferedWriter.write(String.valueOf(this.i));
                        bufferedWriter.newLine();
                        bufferedWriter.write(String.valueOf(this.j));
                        bufferedWriter.newLine();
                        try {
                            bufferedWriter.flush();
                            bufferedWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedWriter2 = bufferedWriter;
                        e.printStackTrace();
                        this.q = false;
                        if (bufferedWriter2 == null) {
                            return;
                        }
                        try {
                            bufferedWriter2.flush();
                            bufferedWriter2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.flush();
                                bufferedWriter.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                }
            } catch (Exception e5) {
                e = e5;
            }
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.q) {
        } else {
            try {
                if (!(context instanceof Activity)) {
                    return;
                }
                this.n = (ViewGroup) ((Activity) context).getWindow().getDecorView();
                if (this.n == null) {
                    return;
                }
                this.o = new OnlineGLSurfaceView(context);
                this.o.setAlpha(0.0f);
                this.n.addView(this.o, new ViewGroup.LayoutParams(1, 1));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public String b() {
        String str;
        int lastIndexOf;
        String str2 = "UnKnown";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.j)) {
            return this.j;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String readLine = bufferedReader.readLine();
            while (true) {
                if (readLine == null) {
                    str = str2;
                    break;
                } else if (!readLine.contains("AArch") && !readLine.contains("ARM") && !readLine.contains("Intel(R)") && !readLine.contains("model name")) {
                    readLine = bufferedReader.readLine();
                } else {
                    int indexOf = readLine.indexOf(ResponseProtocolType.COMMENT);
                    if (indexOf >= 0) {
                        readLine = readLine.substring(indexOf + 2);
                        if (!readLine.contains("Intel(R)")) {
                            lastIndexOf = readLine.indexOf(32);
                        } else {
                            lastIndexOf = readLine.lastIndexOf(41) + 1;
                        }
                        if (lastIndexOf > 0) {
                            str = readLine.substring(0, lastIndexOf);
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            bufferedReader.close();
            str2 = str;
        } catch (Exception unused) {
        }
        this.j = str2;
        return str2;
    }

    public float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue();
        }
        float f = this.d;
        if (f > 0.0f && this.f != null) {
            return f;
        }
        if (this.f == null) {
            this.f = new float[d()];
        }
        for (int i = 0; i < d(); i++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
                    FileReader fileReader = new FileReader(file);
                    String readLine = new BufferedReader(fileReader).readLine();
                    fileReader.close();
                    if (readLine != null) {
                        float parseLong = ((float) Long.parseLong(readLine)) / 1000000.0f;
                        this.f[i] = parseLong;
                        if (this.d < parseLong) {
                            this.d = parseLong;
                        }
                        if (this.e == 0.0f) {
                            this.e = parseLong;
                        } else if (this.e > parseLong) {
                            this.e = parseLong;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (this.e == 0.0f) {
            this.e = this.d;
        }
        if (this.q) {
            this.q = false;
            a();
        }
        return this.d;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        if (this.c == 0) {
            this.c = Runtime.getRuntime().availableProcessors();
        }
        return this.c;
    }

    public void e() {
        String str;
        String upperCase = Build.HARDWARE.toUpperCase();
        if (!TextUtils.isEmpty(upperCase)) {
            if (!TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.f1802a)) {
                return;
            }
            if (upperCase.contains("EXYNOS")) {
                str = upperCase.replace("samsung", "");
            } else {
                try {
                    Method declaredMethod = Class.forName("android.os.Build").getDeclaredMethod("getString", String.class);
                    declaredMethod.setAccessible(true);
                    str = (String) declaredMethod.invoke(Build.class, "ro.board.platform");
                    if (str != null) {
                        try {
                            if (str.equals("mtk")) {
                                str = upperCase;
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                    str = null;
                }
                if (upperCase != null && upperCase.length() >= 4 && (TextUtils.isEmpty(str) || str.equals("unknown") || str.contains("samsungexynos") || str.contains("mrvl"))) {
                    str = upperCase;
                }
            }
            if (str != null) {
                str = str.toUpperCase();
            }
            if (str == null) {
                return;
            }
            if (!str.contains("EXYNOS") && !str.contains("SMDK") && !str.contains("UNIVERSAL")) {
                if (!str.contains("MSM") && !str.contains("APQ") && !str.contains("QSD") && !str.contains("SDM")) {
                    if (!str.contains("REDHOOKBAY") && !str.contains("MOOREFIELD") && !str.contains("MERRIFIELD")) {
                        if (str.contains("MT")) {
                            this.f1802a = "联发科";
                        } else if (str.contains("OMAP")) {
                            this.f1802a = "德州仪器";
                        } else if (str.contains("PXA")) {
                            this.f1802a = "Marvell";
                        } else if (!str.contains("HI") && !str.contains("K3")) {
                            if (!str.contains("SP") && !str.contains(p1.j)) {
                                if (!str.contains("TEGRA") && !str.contains("NVIDIA")) {
                                    if (str.startsWith("LC")) {
                                        this.f1802a = "联芯科技";
                                    } else {
                                        this.f1802a = upperCase;
                                    }
                                } else {
                                    this.f1802a = "NVIDIA";
                                }
                            } else {
                                this.f1802a = "展讯";
                            }
                        } else {
                            this.f1802a = "华为海思";
                        }
                    } else {
                        this.f1802a = "英特尔";
                    }
                } else {
                    this.f1802a = "高通";
                }
            } else {
                this.f1802a = "三星";
            }
            this.b = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
        r4 = new java.io.File(r3[r2].getAbsolutePath() + "/max_freq");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
        if (r4.exists() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
        r4 = new java.io.File(r3[r2].getAbsolutePath() + "/max_gpuclk");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
        if (r4.exists() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
        r2 = new java.io.FileReader(r4);
        r3 = new java.io.BufferedReader(r2).readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
        if (r3 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
        r3 = java.lang.Long.parseLong(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
        if (r3 <= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
        r7 = (r3 / 1000) / 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ef, code lost:
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        r2.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long f() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.alihadeviceevaluator.old.HardWareInfo.f():long");
    }

    public long a(String str) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{this, str})).longValue();
        }
        long j2 = 0;
        try {
            File file = new File(str);
            if (!file.exists() || !file.isDirectory()) {
                j = 0;
            } else {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return 0L;
                }
                j = 0;
                for (File file2 : listFiles) {
                    try {
                        if (file2 != null && file2.getName().contains("kgsl") && file2.isDirectory()) {
                            j = a(file2.getAbsolutePath());
                            if (j > 0) {
                                return j;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            File file3 = new File(str + "/max_freq");
            if (!file3.exists()) {
                file3 = new File(str + "/max_gpuclk");
            }
            if (file3.exists()) {
                FileReader fileReader = new FileReader(file3);
                String readLine = new BufferedReader(fileReader).readLine();
                if (readLine != null) {
                    long parseLong = Long.parseLong(readLine);
                    if (parseLong > 0) {
                        try {
                            j = (parseLong / 1000) / 1000;
                        } catch (Exception unused2) {
                            return parseLong;
                        }
                    } else {
                        j2 = parseLong;
                        fileReader.close();
                        return j2;
                    }
                }
                j2 = j;
                fileReader.close();
                return j2;
            }
            return j;
        } catch (Exception unused3) {
            return j2;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.n == null) {
        } else {
            Log.e("HardWareInfo", "remove GLView");
            try {
                this.n.removeView(this.o);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.o = null;
            this.n = null;
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        if (this.r.e == 0) {
            this.r.a(this);
        }
        return this.r.e;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.r.c;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.r.d;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.r.f1812a;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.r.b;
    }

    /* loaded from: classes2.dex */
    public class a implements GLSurfaceView.Renderer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d186971d", new Object[]{this, gl10});
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("893091d9", new Object[]{this, gl10, new Integer(i), new Integer(i2)});
            }
        }

        public a() {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b2ea8368", new Object[]{this, gl10, eGLConfig});
                return;
            }
            try {
                HardWareInfo.this.g = gl10.glGetString(7937);
                HardWareInfo.this.h = gl10.glGetString(7936);
                Log.e("HardWareInfo", "onSurfaceCreated");
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ali.alihadeviceevaluator.old.HardWareInfo.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Log.e("HardWareInfo", "run destroy");
                        HardWareInfo.this.g();
                    }
                });
                try {
                    HardWareInfo.this.i = HardWareInfo.this.f();
                } catch (Throwable unused) {
                }
                HardWareInfo.a(HardWareInfo.this).a(HardWareInfo.this);
            } catch (Throwable unused2) {
            }
        }
    }
}
