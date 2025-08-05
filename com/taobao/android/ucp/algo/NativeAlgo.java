package com.taobao.android.ucp.algo;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.g;
import com.taobao.android.behavir.util.i;
import com.taobao.android.behavir.util.k;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.behavixswitch.j;
import com.taobao.android.behavix.bhxbridge.BHXCXXBaseBridge;
import com.taobao.android.behavix.task.d;
import com.taobao.tao.log.TLog;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import tb.dsb;
import tb.jbg;
import tb.kge;

/* loaded from: classes.dex */
public class NativeAlgo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_BUFFER_SIZE = 2147483639;
    private static final String SP_GROUP = "UCPNativeAlgo";
    private static final String SP_MODEL_STORE_KEY = "_ucp_mnn_model_url";
    private static Handler downloadHandler;
    private static Handler executeHandler;
    private static HandlerThread ucpNativeAlgoThreadDownload;
    private static HandlerThread ucpNativeAlgoThreadExecute;

    static {
        kge.a(1663390278);
    }

    private static native String execute(String str, String str2);

    private static native void setupManagers(String str);

    private static native void setupRootDir(String str);

    public static /* synthetic */ String access$000(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a953ef5", new Object[]{str, str2}) : execute(str, str2);
    }

    public static /* synthetic */ JSONObject access$100(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("319d08ed", new Object[]{map}) : buildModelErrorResult(map);
    }

    public static /* synthetic */ Map access$200(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("df6caaff", new Object[]{bArr, str}) : unzip(bArr, str);
    }

    public static /* synthetic */ void access$300(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58bc884", new Object[]{str});
        } else {
            putLocalUrl(str);
        }
    }

    public static /* synthetic */ void access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("906ef47b", new Object[0]);
        } else {
            setupModelAndConfig();
        }
    }

    public static Handler getExecuteHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("fe149374", new Object[0]) : executeHandler;
    }

    public static boolean isEnableNativeAlgo(String str) {
        JSONArray parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a54398c", new Object[]{str})).booleanValue();
        }
        if (!innerIsEnableNativeAlgo()) {
            return false;
        }
        String b = a.b(j.b.K_NATIVE_ALGO_NAMES, "[\"cml_cc_ucp2_home_pop_worker\"]");
        if (!TextUtils.isEmpty(b) && (parseArray = JSON.parseArray(b)) != null) {
            if (parseArray.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean innerIsEnableNativeAlgo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ccd1938", new Object[0])).booleanValue();
        }
        try {
            if (!BHXCXXBaseBridge.LoadCXXLib()) {
            }
            return false;
        } catch (Throwable unused) {
            TLog.logd("UCP", "innerIsEnableNativeAlgo error");
            return false;
        }
    }

    public static void initializeNativeAlgo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f9a641", new Object[0]);
        } else if (!innerIsEnableNativeAlgo()) {
        } else {
            setupModelAndConfig();
        }
    }

    private static void setupModelAndConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bf5cb4", new Object[0]);
            return;
        }
        try {
            if (!innerIsEnableNativeAlgo()) {
                return;
            }
            setupRootDir(k.a() + "NativeAlgoRoot/NativeAlgo" + File.separator);
        } catch (Exception e) {
            dsb.a("UCP_setupModelAndConfig_error", null, null, e);
        }
    }

    public static void run(final String str, final Map<String, Object> map, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8da7445", new Object[]{str, map, dVar});
        } else if (!innerIsEnableNativeAlgo()) {
            dVar.a("NativeAlgo", IDecisionResult.ENGINE_ERROR, "模型执行失败", buildModelErrorResult(map));
        } else {
            if (executeHandler == null) {
                synchronized (NativeAlgo.class) {
                    if (executeHandler == null) {
                        HandlerThread a2 = jbg.a("UCPNativeAlgoExecute");
                        ucpNativeAlgoThreadExecute = a2;
                        a2.start();
                        executeHandler = new Handler(ucpNativeAlgoThreadExecute.getLooper());
                    }
                }
            }
            executeHandler.post(new i.a() { // from class: com.taobao.android.ucp.algo.NativeAlgo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavix.utils.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = (JSONObject) JSON.parse(NativeAlgo.access$000(str, new JSONObject(map).toString()));
                    if (jSONObject == null) {
                        JSONObject access$100 = NativeAlgo.access$100(map);
                        access$100.put("error", (Object) "native algo result empty");
                        dVar.a("NativeAlgo", "5001", "模型执行失败", access$100);
                    } else if (jSONObject.getBoolean("success").booleanValue()) {
                        dVar.a("NativeAlgo", jSONObject);
                    } else {
                        JSONObject access$1002 = NativeAlgo.access$100(map);
                        String string = jSONObject.getString("msg");
                        if (!TextUtils.isEmpty(string)) {
                            access$1002.put("error", (Object) g.a("msg", string));
                        }
                        dVar.a("NativeAlgo", "5002", "模型执行失败了", access$1002);
                    }
                }
            });
        }
    }

    private static JSONObject buildModelErrorResult(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f1feaf14", new Object[]{map});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("input", (Object) map);
        jSONObject2.put("msg", (Object) "native algo failed");
        jSONObject.put("model", (Object) jSONObject2);
        return jSONObject;
    }

    public static void downloadCDNResource(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2f8404", new Object[]{str});
        } else if (!innerIsEnableNativeAlgo() || TextUtils.isEmpty(str) || TextUtils.equals(getLocalUrl(), str)) {
        } else {
            if (downloadHandler == null) {
                synchronized (NativeAlgo.class) {
                    if (downloadHandler == null) {
                        HandlerThread a2 = jbg.a("UCPNativeAlgoDownload");
                        ucpNativeAlgoThreadDownload = a2;
                        a2.start();
                        downloadHandler = new Handler(ucpNativeAlgoThreadDownload.getLooper());
                    }
                }
            }
            downloadHandler.post(new i.a() { // from class: com.taobao.android.ucp.algo.NativeAlgo.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavix.utils.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                        InputStream inputStream = httpURLConnection.getInputStream();
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        httpURLConnection.disconnect();
                        inputStream.close();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.flush();
                        if (byteArray == null) {
                            return;
                        }
                        Map access$200 = NativeAlgo.access$200(byteArray, k.a() + "NativeAlgoRoot" + File.separator);
                        if (access$200 != null && !access$200.isEmpty()) {
                            NativeAlgo.access$300(str);
                            NativeAlgo.access$400();
                        }
                    } catch (IOException unused) {
                    }
                }
            });
        }
    }

    private static Map<String, byte[]> unzip(byte[] bArr, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("614575f5", new Object[]{bArr, str});
        }
        if (bArr == null || TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new ByteArrayInputStream(bArr)));
            loop0: while (true) {
                z = false;
                while (true) {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        break loop0;
                    }
                    try {
                        byte[] bArr2 = new byte[8192];
                        String name = nextEntry.getName();
                        if (!nextEntry.getName().contains("../") && !nextEntry.isDirectory()) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            String str2 = str + name;
                            File file = new File(new File(str2).getParent());
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            while (true) {
                                int read = zipInputStream.read(bArr2, 0, 8192);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                            hashMap.put(str2, byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.flush();
                            z = true;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            zipInputStream.close();
            z2 = z;
        } catch (Throwable unused2) {
            hashMap.clear();
        }
        if (z2) {
            return hashMap;
        }
        return null;
    }

    private static SharedPreferences getSharedPreferences() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[0]);
        }
        Application b = com.taobao.android.behavix.d.b();
        if (b == null) {
            return null;
        }
        return b.getSharedPreferences(SP_GROUP, 0);
    }

    private static String getLocalUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d83b8fbf", new Object[0]);
        }
        SharedPreferences sharedPreferences = getSharedPreferences();
        return sharedPreferences != null ? sharedPreferences.getString(SP_MODEL_STORE_KEY, "") : "";
    }

    private static void putLocalUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3908c84", new Object[]{str});
            return;
        }
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(SP_MODEL_STORE_KEY, str);
        edit.apply();
    }
}
