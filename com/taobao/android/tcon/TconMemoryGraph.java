package com.taobao.android.tcon;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.zip.GZIPOutputStream;
import tb.byz;
import tb.bzh;

/* loaded from: classes.dex */
public class TconMemoryGraph extends TconMallocBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static native void nativeStartHeapProfiling(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8);

    private static native boolean nativeStopHeapProfiling();

    private static native void nativeUpdateMapsFile();

    public static boolean init(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3847dd2c", new Object[]{application})).booleanValue();
        }
        String a2 = a.a().a("tcon", "memgraph_config");
        try {
            JSONObject parseObject = JSON.parseObject(a2);
            if (parseObject == null || !"true".equals(parseObject.getString("enable_memgraph"))) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            String str = Build.MODEL;
            JSONObject jSONObject = new JSONObject() { // from class: com.taobao.android.tcon.TconMemoryGraph.1
                {
                    put("29", "Mi 10");
                    put("28", "VTR-AL00");
                }
            };
            if (parseObject.containsKey("memgraph_whitelist")) {
                jSONObject = parseObject.getJSONObject("memgraph_whitelist");
            }
            if ((!"*".equals(jSONObject.getString(String.valueOf(i))) && (bzh.a(str) || !jSONObject.containsKey(String.valueOf(i)) || !jSONObject.getString(String.valueOf(i)).toLowerCase().contains(str.toLowerCase()))) || !loadRequiredLibrary()) {
                return false;
            }
            final long config = config(100L, parseObject, "sample_rate");
            final long config2 = config(1000L, parseObject, "small_zone_num");
            final long config3 = config(1000L, parseObject, "medium_zone_num");
            final long config4 = config(500L, parseObject, "large_zone_num");
            final long config5 = config(100L, parseObject, "super_zone_num");
            final long config6 = config(64L, parseObject, "small_zone_size");
            final long config7 = config(1024L, parseObject, "medium_zone_size");
            final long config8 = config(1048576L, parseObject, "large_zone_size");
            reportData(application, application.getFilesDir().getAbsolutePath(), "true".equals(parseObject.getString("forceUpload")));
            final short random = (short) (Math.random() * 5.0d);
            final String absolutePath = application.getFilesDir().getAbsolutePath();
            if (random == 0) {
                return startMallocProfiling(absolutePath, config, config2, config3, config4, config5, config6, config7, config8);
            }
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.android.tcon.TconMemoryGraph.2
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private boolean k = false;
                private short l = 0;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                        return;
                    }
                    if (!this.k) {
                        short s = this.l;
                        this.l = (short) (s + 1);
                        if (s > random && TconMemoryGraph.startMallocProfiling(absolutePath, config, config2, config3, config4, config5, config6, config7, config8)) {
                            this.k = true;
                        }
                    }
                    if (!this.k) {
                        return;
                    }
                    TconMemoryGraph.updateMapsFile();
                }
            });
            return true;
        } catch (Exception unused) {
            Log.e(TconInitializer.TCON_TAG, "invalid memgraph config" + a2);
            return false;
        }
    }

    public static boolean startMallocProfiling(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a08abbf1", new Object[]{str, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6), new Long(j7), new Long(j8)})).booleanValue();
        }
        nativeStartHeapProfiling(str, j, j2, j3, j4, j5, j6, j7, j8);
        return replaceSystemMalloc();
    }

    public static boolean stopMallocProfiling() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df111847", new Object[0])).booleanValue() : nativeStopHeapProfiling();
    }

    public static void updateMapsFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca32e723", new Object[0]);
        } else {
            nativeUpdateMapsFile();
        }
    }

    public static String compressData(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5d4e683", new Object[]{str});
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        copy(fileInputStream, gZIPOutputStream);
        gZIPOutputStream.close();
        return byz.b(byteArrayOutputStream.toByteArray());
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad894149", new Object[]{inputStream, outputStream});
            return;
        }
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static boolean deleteFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea11bd1c", new Object[]{str})).booleanValue();
        }
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            return file.delete();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x008f, code lost:
        if (checkAndInstallNativeCrashCallback(r10) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void reportData(android.app.Application r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tcon.TconMemoryGraph.reportData(android.app.Application, java.lang.String, boolean):void");
    }

    private static long config(long j, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0e677b3", new Object[]{new Long(j), jSONObject, str})).longValue();
        }
        String string = jSONObject.getString(str);
        if (string == null) {
            return j;
        }
        try {
            long parseLong = Long.parseLong(string);
            return parseLong > 1 ? parseLong : j;
        } catch (Exception unused) {
            return j;
        }
    }
}
