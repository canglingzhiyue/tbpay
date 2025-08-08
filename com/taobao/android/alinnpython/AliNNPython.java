package com.taobao.android.alinnpython;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.analytics.core.sync.q;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import tb.ihq;
import tb.mto;

/* loaded from: classes4.dex */
public class AliNNPython {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_WHITELIST = "MODULE_WHITELIST";
    private static String TAG = "AliNNPython";
    private static boolean initialized = false;
    private static Map<String, String> mVmConifgMap = null;
    private static boolean sAliNNPythonAvailable = false;
    private long currentThreadId;
    private long instance;
    private static List<b> pythonInitCallbackList = new ArrayList();
    private static Context sContext = null;
    public static Exception initException = null;
    private static Map<String, AliNNPythonObjectToJavaCallback> convertCallbackMap = new HashMap();
    private String bizName = "AliNNPython";
    public AliNNPythonThreadState threadState = null;

    public static boolean isNewPythonEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fc2abff", new Object[0])).booleanValue();
        }
        return true;
    }

    public static native void nativeAddPythonPath(String str);

    private static native void nativeAddToModuleWhiteList(String str);

    public static native void nativeDeallocInstance(long j);

    private static native int nativeGetPythonFlag();

    public static native void nativeInitialize(String str);

    public static native void nativeLoadPydaiC();

    public static native long nativeNewInstance(Object obj);

    private native Object nativeObjectAsObject(long j, long j2);

    public static native long nativeRedirectStdioToLogCat();

    public static native void setClassRef();

    public native void nativeAddPath(long j, String str);

    public native long nativeCall(long j, String str, String str2);

    public native long nativeCall(long j, String str, String str2, Vector<HashMap<String, Object>> vector);

    public native long nativeCallMethodOfObject(long j, long j2, String str);

    public native long nativeCallMethodOfObject(long j, long j2, String str, Vector<HashMap<String, Object>> vector);

    public native long nativeCallStaticMethod(long j, String str, String str2, String str3, Vector<HashMap<String, Object>> vector, d dVar);

    public native long nativeCurrentThreadId(long j);

    public native void nativeDECREF(long j, long j2);

    public native long nativeImportModule(long j, String str, String str2);

    public native double nativeObjectAsDouble(long j, long j2);

    public native long nativeObjectAsInteger(long j, long j2);

    public native long nativeObjectAsLong(long j, long j2);

    public native HashMap nativeObjectAsMap(long j, long j2);

    public native String nativeObjectAsString(long j, long j2);

    public native long nativeReloadPackage(long j, String str);

    public native long nativeRunFile(long j, String str);

    public native long nativeRunFile(long j, String str, Vector<HashMap<String, Object>> vector);

    public native void nativeStopPythonThread(long j, long j2);

    public native void nativeTestAPI();

    public native long nativeTupleGetItem(long j, long j2, long j3);

    public native long nativeTupleSize(long j, long j2);

    public native void nativeXDECREF(long j, long j2);

    public static boolean nativeAvailable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("131e7ffd", new Object[0])).booleanValue() : sAliNNPythonAvailable;
    }

    public static AliNNPython newAliNNPythonInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliNNPython) ipChange.ipc$dispatch("ab55b8fd", new Object[0]) : new AliNNPython();
    }

    public AliNNPython() {
        this.instance = 0L;
        this.currentThreadId = -1L;
        this.instance = nativeNewInstance(this);
        this.currentThreadId = Thread.currentThread().getId();
    }

    public void setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.bizName = str;
        }
    }

    public static void load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6772aef7", new Object[]{str});
        } else {
            System.load(str);
        }
    }

    public synchronized void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else if (this.instance == 0) {
        } else {
            if (isNewPythonEngine() && this.currentThreadId != Thread.currentThread().getId()) {
                Log.e(TAG, "Python instance release be called by error thread");
                return;
            }
            nativeDeallocInstance(this.instance);
            this.instance = 0L;
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            release();
        }
    }

    public static synchronized void initialize(Context context) {
        synchronized (AliNNPython.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1dcfb91", new Object[]{context});
                return;
            }
            Log.e(RPCDataItems.SWITCH_TAG_LOG, "AlinnPython  initialize");
            if (initialized) {
                return;
            }
            initialized = true;
            if (!sAliNNPythonAvailable) {
                sAliNNPythonAvailable = ihq.a().c("AliNNPython").g();
                String str = "Load Python With RemoteSo - " + sAliNNPythonAvailable;
            }
            if (!nativeAvailable()) {
                Exception exc = new Exception("so load failed");
                initException = exc;
                dispatcherPythonInitCallback(exc, null);
                return;
            }
            sContext = context;
            long currentTimeMillis = System.currentTimeMillis();
            String absolutePath = context.getFilesDir().getAbsolutePath();
            try {
                File file = new File(absolutePath + "/lib/python27.zip");
                if (!file.exists()) {
                    file.getParentFile().mkdirs();
                    file.createNewFile();
                }
                InputStream proxy_open = AssetsDelegate.proxy_open(context.getAssets(), "python27.zip");
                FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsolutePath());
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = proxy_open.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
                proxy_open.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            nativeInitialize(absolutePath);
            setClassRef();
            nativeRedirectStdioToLogCat();
            c.a("AliNNPython", "initialize", "0", true, (float) (System.currentTimeMillis() - currentTimeMillis), 0.0f);
            processModuleWhiteListConfig();
            dispatcherPythonInitCallback(null, null);
        }
    }

    public static void initialize(String str) throws AliNNPythonException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f2fa21", new Object[]{str});
        } else if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        } else {
            nativeInitialize(str);
        }
    }

    @Deprecated
    public static void setPath(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600486f8", new Object[]{str});
            return;
        }
        AliNNPython aliNNPython = new AliNNPython();
        aliNNPython.addPath(str);
        aliNNPython.finalize();
    }

    @Deprecated
    public void addPath(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2846277", new Object[]{this, str});
        } else if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            checkInstance();
            nativeAddPath(this.instance, str);
            c.a(this.bizName, "addPath", "0", true, (float) (System.currentTimeMillis() - currentTimeMillis), 0.0f);
        }
    }

    public static void addPythonPath(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a00afb3", new Object[]{str});
        } else if (!nativeAvailable()) {
            throw new AliNNPythonException("Python not init");
        } else {
            nativeAddPythonPath(str);
        }
    }

    public Vector<HashMap<String, Object>> simpleArguments(Vector<Object> vector) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Vector) ipChange.ipc$dispatch("b02c82ab", new Object[]{this, vector}) : simpleValueArrayToValueArray(vector);
    }

    public Vector<HashMap<String, Object>> simpleValueArrayToValueArray(Vector<Object> vector) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vector) ipChange.ipc$dispatch("6b74a032", new Object[]{this, vector});
        }
        Vector<HashMap<String, Object>> vector2 = new Vector<>();
        for (int i = 0; i < vector.size(); i++) {
            HashMap<String, Object> hashMap = new HashMap<>();
            Object obj = vector.get(i);
            if (obj == null) {
                hashMap.put("type", AmnetConstant.VAL_SUPPORT_ZSTD);
                hashMap.put("value", null);
            } else if (obj.getClass() == String.class) {
                hashMap.put("type", "s");
                hashMap.put("value", obj);
            } else if (obj.getClass() == Float.class) {
                hashMap.put("type", "f");
                hashMap.put("value", obj);
            } else if (obj.getClass() == Double.class) {
                hashMap.put("type", Repeat.D);
                hashMap.put("value", obj);
            } else if (obj.getClass() == Integer.class) {
                hashMap.put("type", q.MSGTYPE_INTERVAL);
                hashMap.put("value", obj);
            } else if (obj.getClass() == Long.class) {
                hashMap.put("type", "l");
                hashMap.put("value", obj);
            } else if (obj.getClass() == Vector.class) {
                hashMap.put("type", "()");
                hashMap.put("value", simpleValueArrayToValueArray((Vector) obj));
            } else if (obj.getClass() == HashMap.class) {
                hashMap.put("type", "{}");
                hashMap.put("value", simpleValueDictToValueDict((Map) obj));
            } else if (obj.getClass() == Boolean.class) {
                hashMap.put("type", Repeat.D);
                hashMap.put("value", Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : mto.a.GEO_NOT_SUPPORT));
            } else if (obj instanceof AliNNPythonJavaToPythonCallback) {
                hashMap.put("type", "tpo");
                hashMap.put("value", obj);
            } else {
                throw new AliNNPythonException("type not supported: " + obj.getClass().getName());
            }
            vector2.add(hashMap);
        }
        return vector2;
    }

    public Vector<HashMap<String, Object>> simpleValueDictToValueDict(Map<String, Object> map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vector) ipChange.ipc$dispatch("ffe345fb", new Object[]{this, map});
        }
        Vector<HashMap<String, Object>> vector = new Vector<>();
        for (String str : map.keySet()) {
            HashMap<String, Object> hashMap = new HashMap<>();
            Object obj = map.get(str);
            hashMap.put("name", str);
            if (obj == null) {
                hashMap.put("type", AmnetConstant.VAL_SUPPORT_ZSTD);
                hashMap.put("value", null);
            } else if (obj.getClass() == String.class) {
                hashMap.put("type", "s");
                hashMap.put("value", obj);
            } else if (obj.getClass() == Float.class) {
                hashMap.put("type", "f");
                hashMap.put("value", obj);
            } else if (obj.getClass() == Double.class) {
                hashMap.put("type", Repeat.D);
                hashMap.put("value", obj);
            } else if (obj.getClass() == Integer.class) {
                hashMap.put("type", q.MSGTYPE_INTERVAL);
                hashMap.put("value", obj);
            } else if (obj.getClass() == Long.class) {
                hashMap.put("type", "l");
                hashMap.put("value", obj);
            } else if (obj.getClass() == Vector.class) {
                hashMap.put("type", "()");
                hashMap.put("value", simpleValueArrayToValueArray((Vector) obj));
            } else if (obj.getClass() == HashMap.class) {
                hashMap.put("type", "{}");
                hashMap.put("value", simpleValueDictToValueDict((Map) obj));
            } else if (obj.getClass() == Boolean.class) {
                hashMap.put("type", Repeat.D);
                hashMap.put("value", Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : mto.a.GEO_NOT_SUPPORT));
            } else if (obj instanceof AliNNPythonJavaToPythonCallback) {
                hashMap.put("type", "tpo");
                hashMap.put("value", obj);
            } else {
                throw new AliNNPythonException("type not supported: " + obj.getClass().getName());
            }
            vector.add(hashMap);
        }
        return vector;
    }

    public long runFile(String str) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c4299ec", new Object[]{this, str})).longValue() : runFile(str, null);
    }

    public long runFile(String str, Vector<HashMap<String, Object>> vector) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7da458", new Object[]{this, str, vector})).longValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        long currentTimeMillis = System.currentTimeMillis();
        checkInstance();
        if (vector == null) {
            vector = new Vector<>();
        }
        long nativeRunFile = nativeRunFile(this.instance, str, vector);
        c.a(this.bizName, "runFile", "0", nativeRunFile != 0, (float) (System.currentTimeMillis() - currentTimeMillis), 0.0f);
        return nativeRunFile;
    }

    public long call(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4203866d", new Object[]{this, str, str2})).longValue() : call(str, str2, null);
    }

    public long call(String str, String str2, Vector<HashMap<String, Object>> vector) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d536d299", new Object[]{this, str, str2, vector})).longValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        long currentTimeMillis = System.currentTimeMillis();
        checkInstance();
        long nativeCall = nativeCall(this.instance, str, str2, vector == null ? new Vector<>() : vector);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        String str3 = this.bizName;
        c.a(str3, str + "." + str2, "0", nativeCall != 0, (float) currentTimeMillis2, 0.0f);
        return nativeCall;
    }

    public long callMethodOfObject(long j, String str) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("576bee06", new Object[]{this, new Long(j), str})).longValue() : callMethodOfObject(j, str, null);
    }

    public long callMethodOfObject(long j, String str, Vector<HashMap<String, Object>> vector) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8c7e5f2", new Object[]{this, new Long(j), str, vector})).longValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        long currentTimeMillis = System.currentTimeMillis();
        checkInstance();
        long nativeCallMethodOfObject = nativeCallMethodOfObject(this.instance, j, str, vector == null ? new Vector<>() : vector);
        c.a(this.bizName, str, "0", nativeCallMethodOfObject != 0, (float) (System.currentTimeMillis() - currentTimeMillis), 0.0f);
        return nativeCallMethodOfObject;
    }

    public long callStaticMethod(String str, String str2, String str3) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1c009b46", new Object[]{this, str, str2, str3})).longValue() : callStaticMethod(str, str2, str3, null, null);
    }

    public long callStaticMethod(String str, String str2, String str3, Vector<HashMap<String, Object>> vector, d dVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66cf5145", new Object[]{this, str, str2, str3, vector, dVar})).longValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        System.currentTimeMillis();
        checkInstance();
        if (vector == null) {
            vector = new Vector<>();
        }
        long nativeCallStaticMethod = nativeCallStaticMethod(this.instance, str, str2, str3, vector, dVar);
        System.currentTimeMillis();
        return nativeCallStaticMethod;
    }

    public long newObject(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f13b980e", new Object[]{this, str, str2})).longValue() : call(str2, str, null);
    }

    public long newObject(String str, String str2, Vector<HashMap<String, Object>> vector) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf141dfa", new Object[]{this, str, str2, vector})).longValue() : call(str2, str, vector);
    }

    public void DECREF(long j) throws AliNNPythonException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b11c6c", new Object[]{this, new Long(j)});
        } else if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        } else {
            nativeDECREF(this.instance, j);
        }
    }

    public void XDECREF(long j) throws AliNNPythonException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c1f514", new Object[]{this, new Long(j)});
        } else if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        } else {
            nativeXDECREF(this.instance, j);
        }
    }

    public void stopPythonThread(long j) throws AliNNPythonException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41e3cf5", new Object[]{this, new Long(j)});
        } else if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        } else {
            nativeStopPythonThread(this.instance, j);
        }
    }

    public long currentThreadId() throws AliNNPythonException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25b6fad9", new Object[]{this})).longValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        return nativeCurrentThreadId(this.instance);
    }

    public String objectAsString(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f78f4e5", new Object[]{this, new Long(j)});
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        if (j == 0) {
            throw new AliNNPythonException("objectAsString: object is null");
        }
        return nativeObjectAsString(this.instance, j);
    }

    public long objectAsLong(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6551ed44", new Object[]{this, new Long(j)})).longValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        if (j == 0) {
            throw new AliNNPythonException("objectAsLong: object is null");
        }
        return nativeObjectAsLong(this.instance, j);
    }

    public long objectAsInteger(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e991304", new Object[]{this, new Long(j)})).longValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        if (j == 0) {
            throw new AliNNPythonException("objectAsLong: object is null");
        }
        return nativeObjectAsInteger(this.instance, j);
    }

    public boolean objectAsBoolean(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9be36a6a", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        if (j == 0) {
            throw new AliNNPythonException("objectAsBoolean: object is null");
        }
        return nativeObjectAsLong(this.instance, j) != 0;
    }

    public double objectAsDouble(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee2e3549", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        if (j == 0) {
            throw new AliNNPythonException("objectAsDouble: object is null");
        }
        return nativeObjectAsDouble(this.instance, j);
    }

    public HashMap objectAsMap(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("91c77f15", new Object[]{this, new Long(j)});
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        if (j == 0) {
            throw new AliNNPythonException("objectAsDouble: object is null");
        }
        return nativeObjectAsMap(this.instance, j);
    }

    public Object objectAsObject(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42a6a425", new Object[]{this, new Long(j)});
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        if (j == 0) {
            throw new AliNNPythonException("objectAsObject: object is null");
        }
        return nativeObjectAsObject(this.instance, j);
    }

    public long tupleSize(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bc754c8", new Object[]{this, new Long(j)})).longValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        if (j == 0) {
            throw new AliNNPythonException("objectAsDouble: object is null");
        }
        return nativeTupleSize(this.instance, j);
    }

    public long tupleGetItem(long j, long j2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6543d1c", new Object[]{this, new Long(j), new Long(j2)})).longValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        if (j == 0) {
            throw new AliNNPythonException("objectAsDouble: object is null");
        }
        return nativeTupleGetItem(this.instance, j, j2);
    }

    public long reloadPackage(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed587732", new Object[]{this, str})).longValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        }
        long currentTimeMillis = System.currentTimeMillis();
        checkInstance();
        long nativeReloadPackage = nativeReloadPackage(this.instance, str);
        c.a(this.bizName, "reloadModule", "0", nativeReloadPackage == 0, (float) (System.currentTimeMillis() - currentTimeMillis), 0.0f);
        return nativeReloadPackage;
    }

    private void checkInstance() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fcdb3c4", new Object[]{this});
        } else if (this.instance == 0) {
            throw new AliNNPythonException("instance is null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean copyAssertFileTo(android.content.Context r5, java.lang.String r6, java.io.File r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.alinnpython.AliNNPython.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r1[r2] = r6
            r5 = 2
            r1[r5] = r7
            java.lang.String r5 = "e02e5c14"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L1f:
            r0 = 0
            boolean r1 = r7.exists()     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            if (r1 != 0) goto L30
            java.io.File r1 = r7.getParentFile()     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            r1.mkdirs()     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            r7.createNewFile()     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
        L30:
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            java.io.InputStream r5 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r5, r6)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7d
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L75
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L75
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L75
            r7 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L6b
        L45:
            int r0 = r5.read(r7)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L6b
            r1 = -1
            if (r0 == r1) goto L50
            r6.write(r7, r3, r0)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L6b
            goto L45
        L50:
            r6.flush()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L6b
            r6.close()     // Catch: java.io.IOException -> L57
            goto L5b
        L57:
            r6 = move-exception
            r6.printStackTrace()
        L5b:
            if (r5 == 0) goto L65
            r5.close()     // Catch: java.io.IOException -> L61
            goto L65
        L61:
            r5 = move-exception
            r5.printStackTrace()
        L65:
            return r2
        L66:
            r7 = move-exception
            r0 = r6
            r6 = r5
            r5 = r7
            goto L98
        L6b:
            r7 = move-exception
            r0 = r6
            r6 = r5
            r5 = r7
            goto L7f
        L70:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
            goto L98
        L75:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
            goto L7f
        L7a:
            r5 = move-exception
            r6 = r0
            goto L98
        L7d:
            r5 = move-exception
            r6 = r0
        L7f:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L8c
            r0.close()     // Catch: java.io.IOException -> L88
            goto L8c
        L88:
            r5 = move-exception
            r5.printStackTrace()
        L8c:
            if (r6 == 0) goto L96
            r6.close()     // Catch: java.io.IOException -> L92
            goto L96
        L92:
            r5 = move-exception
            r5.printStackTrace()
        L96:
            return r3
        L97:
            r5 = move-exception
        L98:
            if (r0 == 0) goto La2
            r0.close()     // Catch: java.io.IOException -> L9e
            goto La2
        L9e:
            r7 = move-exception
            r7.printStackTrace()
        La2:
            if (r6 == 0) goto Lac
            r6.close()     // Catch: java.io.IOException -> La8
            goto Lac
        La8:
            r6 = move-exception
            r6.printStackTrace()
        Lac:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.alinnpython.AliNNPython.copyAssertFileTo(android.content.Context, java.lang.String, java.io.File):boolean");
    }

    public void importModule(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e0338c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || !isNewPythonEngine()) {
        } else {
            nativeImportModule(this.instance, str, str2);
        }
    }

    public static int copyPyLib(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c9b8141", new Object[]{context, str, str2})).intValue();
        }
        if (context == null) {
            context = sContext;
        }
        if (context == null) {
            return 0;
        }
        String absolutePath = context.getFilesDir().getAbsolutePath();
        File file = null;
        try {
            File file2 = new File(absolutePath + "/lib/" + str);
            try {
                if (!file2.exists()) {
                    file2.getParentFile().mkdirs();
                    file2.createNewFile();
                }
                InputStream proxy_open = AssetsDelegate.proxy_open(context.getAssets(), str);
                FileOutputStream fileOutputStream = new FileOutputStream(file2.getAbsolutePath());
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = proxy_open.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        proxy_open.close();
                        e.a(file2, new File(absolutePath + "/lib/" + str2));
                        StringBuilder sb = new StringBuilder();
                        sb.append(absolutePath);
                        sb.append("/lib/");
                        setPath(sb.toString());
                        file2.delete();
                        return 1;
                    }
                }
            } catch (Exception unused) {
                file = file2;
                if (file != null && file.exists()) {
                    file.delete();
                }
                return 0;
            }
        } catch (Exception unused2) {
        }
    }

    public static boolean registerPythonInitCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a7b3d14", new Object[]{bVar})).booleanValue();
        }
        if (bVar == null) {
            return false;
        }
        synchronized (pythonInitCallbackList) {
            if (!pythonInitCallbackList.contains(bVar)) {
                pythonInitCallbackList.add(bVar);
            }
        }
        synchronized (AliNNPython.class) {
            if (initialized) {
                try {
                    if (initException != null) {
                        bVar.a(initException);
                    } else {
                        bVar.a((Map) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return true;
    }

    public static boolean unregisterPythonInitCallback(b bVar) {
        boolean remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a7a03ad", new Object[]{bVar})).booleanValue();
        }
        synchronized (pythonInitCallbackList) {
            remove = pythonInitCallbackList.remove(bVar);
        }
        return remove;
    }

    private static void dispatcherPythonInitCallback(Exception exc, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("430694be", new Object[]{exc, map});
            return;
        }
        synchronized (pythonInitCallbackList) {
            for (b bVar : pythonInitCallbackList) {
                if (exc != null) {
                    try {
                        bVar.a(exc);
                    } catch (Throwable unused) {
                    }
                } else {
                    bVar.a((Map) null);
                }
            }
        }
    }

    public static void setPythonVMConfig(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dea3807", new Object[]{map});
        } else {
            mVmConifgMap = map;
        }
    }

    private static void processModuleWhiteListConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f2f0d5", new Object[0]);
            return;
        }
        Map<String, String> map = mVmConifgMap;
        if (map == null) {
            return;
        }
        String str = map.get(MODULE_WHITELIST);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        nativeAddToModuleWhiteList(str);
    }

    public static void registerPythonObjectConvertCallback(String str, AliNNPythonObjectToJavaCallback aliNNPythonObjectToJavaCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78bfd607", new Object[]{str, aliNNPythonObjectToJavaCallback});
        } else {
            convertCallbackMap.put(str, aliNNPythonObjectToJavaCallback);
        }
    }

    public static AliNNPythonObjectToJavaCallback getObjectConvertCallback(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliNNPythonObjectToJavaCallback) ipChange.ipc$dispatch("6d7e7e5e", new Object[]{str}) : convertCallbackMap.get(str);
    }
}
