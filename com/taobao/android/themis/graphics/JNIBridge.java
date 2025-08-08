package com.taobao.android.themis.graphics;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.themis.graphics.IRiverBackend;
import com.taobao.android.themis.graphics.audio.AudioContextFactory;
import com.taobao.android.themis.graphics.audio.AudioContextProxy;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class JNIBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "themis_gfx:JNIBridge";
    private static e sLibraryLoadedListener;
    private boolean isAttached;
    private final b mAPIDispatcher;
    private AudioContextFactory mAduioContextFactory;
    private boolean mCallAsyncAPIWithoutDecode;
    private Long mNativeInstancePtr;
    private g mOnAPIStatsListener;
    private c mOnJSErrorListener;
    private d mOnJSMemoryListener;
    private f mOnJSNotResponseListener;
    private h mOnSourceMapListener;
    private final Handler mUIHandler = new Handler(Looper.getMainLooper());

    /* loaded from: classes6.dex */
    public interface b {
        JSONObject a(JSONObject jSONObject);

        void a(JSONObject jSONObject, a aVar);

        void a(String str, a aVar);

        void a(ByteBuffer byteBuffer, a aVar);
    }

    /* loaded from: classes6.dex */
    public interface c {
        void a(String str, String str2);
    }

    /* loaded from: classes6.dex */
    public interface d {
        void a(int i, int i2, int i3, int i4);

        void a(int i, int i2, int i3, String str);

        void a(String str);
    }

    /* loaded from: classes6.dex */
    public interface e {
        void a();
    }

    /* loaded from: classes6.dex */
    public interface f {
        void a(int i, double d);

        void a(String str);
    }

    /* loaded from: classes6.dex */
    public interface g {
        void a(double d, double d2, double d3, List<String> list, List<String> list2, Map<String, Double> map);
    }

    /* loaded from: classes6.dex */
    public interface h {
        String a(String str);
    }

    private native long nativeAttach(JNIBridge jNIBridge, String str, int i, String str2, boolean z);

    private native void nativeCreateAppContext(long j, HashMap<String, String> hashMap);

    private native boolean nativeDetach(long j);

    private native void nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i);

    private native void nativeExecuteByteCodeInAppContext(long j, byte[] bArr, String str, String str2);

    private native void nativeExecuteByteCodeInCurrentThread(long j, byte[] bArr, String str, String str2);

    private native void nativeExecuteByteCodeInMainContext(long j, byte[] bArr, String str);

    private native void nativeExecuteScriptInAppContext(long j, String str, String str2, String str3);

    private native void nativeExecuteScriptInCurrentThread(long j, String str, String str2, String str3);

    private native void nativeExecuteScriptInMainContext(long j, String str, String str2);

    private native void nativeFireGlobalEventInMainContext(long j, String str, String str2, boolean z);

    public static native long nativeGenTraceId();

    private native boolean nativeHasRegisterGlobalEventInMainContext(long j, String str);

    private native void nativeInvokeJSCallbackInMainContext(long j, long j2, String str, byte[] bArr, boolean z);

    private native void nativeInvokeJSCallbackInMainContextFast(long j, long j2, ByteBuffer byteBuffer, byte[] bArr, boolean z);

    private native void nativeInvokeJSMethodInAppContext(long j, String str, JSParam[] jSParamArr);

    private native void nativeInvokeJSMethodInMainContext(long j, String str, JSParam[] jSParamArr);

    private native void nativeOrangeConfigUpdate(String str);

    public static native void nativeTimelineStart();

    public static native void nativeTimelineStop();

    public static native void nativeTraceAsyncBegin0(String str, long j);

    public static native void nativeTraceAsyncBegin1(String str, long j, String str2, String str3);

    public static native void nativeTraceAsyncEnd0(String str, long j);

    public static native void nativeTraceAsyncEnd1(String str, long j, String str2, String str3);

    public static native void nativeTraceBegin0(String str);

    public static native void nativeTraceBegin1(String str, String str2, String str3);

    public static native void nativeTraceBegin2(String str, String str2, String str3, String str4, String str5);

    public static native void nativeTraceEnd(String str);

    public static native void nativeTraceFlowBegin(String str, long j);

    public static native void nativeTraceFlowEnd(String str, long j);

    public static native void nativeTraceFlowStep(String str, long j);

    public static /* synthetic */ boolean access$000(JNIBridge jNIBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("895bafca", new Object[]{jNIBridge})).booleanValue() : jNIBridge.isAttached;
    }

    public static /* synthetic */ void access$100(JNIBridge jNIBridge, long j, long j2, ByteBuffer byteBuffer, byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42dc303", new Object[]{jNIBridge, new Long(j), new Long(j2), byteBuffer, bArr, new Boolean(z)});
        } else {
            jNIBridge.nativeInvokeJSCallbackInMainContextFast(j, j2, byteBuffer, bArr, z);
        }
    }

    public static /* synthetic */ void access$200(JNIBridge jNIBridge, long j, long j2, String str, byte[] bArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2aa49b", new Object[]{jNIBridge, new Long(j), new Long(j2), str, bArr, new Boolean(z)});
        } else {
            jNIBridge.nativeInvokeJSCallbackInMainContext(j, j2, str, bArr, z);
        }
    }

    public static /* synthetic */ c access$300(JNIBridge jNIBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("70e81b5d", new Object[]{jNIBridge}) : jNIBridge.mOnJSErrorListener;
    }

    public static /* synthetic */ d access$400(JNIBridge jNIBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2974dbdb", new Object[]{jNIBridge}) : jNIBridge.mOnJSMemoryListener;
    }

    public static /* synthetic */ f access$500(JNIBridge jNIBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("e2019c78", new Object[]{jNIBridge}) : jNIBridge.mOnJSNotResponseListener;
    }

    public static /* synthetic */ g access$600(JNIBridge jNIBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("9a8e5cf6", new Object[]{jNIBridge}) : jNIBridge.mOnAPIStatsListener;
    }

    public void setAudioContextFactory(AudioContextFactory audioContextFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b9705b", new Object[]{this, audioContextFactory});
        } else {
            this.mAduioContextFactory = audioContextFactory;
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final JNIBridge f15527a;
        private final long b;
        private final Long c;
        private final boolean d;

        public a(Long l, JNIBridge jNIBridge, long j) {
            this.c = l;
            this.f15527a = jNIBridge;
            this.b = j;
            this.d = false;
        }

        public a(Long l, JNIBridge jNIBridge, long j, boolean z) {
            this.c = l;
            this.f15527a = jNIBridge;
            this.b = j;
            this.d = z;
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else {
                a(jSONObject, null);
            }
        }

        public void a(JSONObject jSONObject, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4acae4f", new Object[]{this, jSONObject, bArr});
            } else {
                a(jSONObject, bArr, false);
            }
        }

        public void a(JSONObject jSONObject, byte[] bArr, boolean z) {
            JNIBridge jNIBridge;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90e9ce65", new Object[]{this, jSONObject, bArr, new Boolean(z)});
            } else if (this.c == null || (jNIBridge = this.f15527a) == null || !JNIBridge.access$000(jNIBridge)) {
                com.taobao.android.riverlogger.e.a(RVLLevel.Error, JNIBridge.TAG, "unexpected error when invoke js callback: maybe native is not attached");
            } else if (this.d) {
                JNIBridge.access$100(this.f15527a, this.c.longValue(), this.b, com.taobao.android.themis.graphics.e.a().a(jSONObject), bArr, z);
            } else {
                try {
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    RVLLevel rVLLevel = RVLLevel.Error;
                    com.taobao.android.riverlogger.e.a(rVLLevel, "themis_gfx|invokeJSCallback", "unexpected error when invoke js callback: " + th.getMessage());
                    str = "";
                }
                JNIBridge.access$200(this.f15527a, this.c.longValue(), this.b, str, bArr, z);
            }
        }
    }

    public JNIBridge(b bVar, boolean z) {
        this.mAPIDispatcher = bVar;
        this.mCallAsyncAPIWithoutDecode = z;
        TMSGraphicsLibraryInit.b();
    }

    public static void setOnLibraryLoadedListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87893b88", new Object[]{eVar});
        } else {
            sLibraryLoadedListener = eVar;
        }
    }

    public void setOnJSErrorListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea673349", new Object[]{this, cVar});
        } else {
            this.mOnJSErrorListener = cVar;
        }
    }

    public void setOnJSMemoryListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd333175", new Object[]{this, dVar});
        } else {
            this.mOnJSMemoryListener = dVar;
        }
    }

    public void setOnJSNotResponseListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af1f412", new Object[]{this, fVar});
        } else {
            this.mOnJSNotResponseListener = fVar;
        }
    }

    public void setOnAPIStatsListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b666a72d", new Object[]{this, gVar});
        } else {
            this.mOnAPIStatsListener = gVar;
        }
    }

    public void setOnSourceMapListener(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e877346", new Object[]{this, hVar});
        } else {
            this.mOnSourceMapListener = hVar;
        }
    }

    private boolean isAttached() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f518279", new Object[]{this})).booleanValue() : this.isAttached && this.mNativeInstancePtr != null;
    }

    public boolean attach(String str, IRiverBackend.EngineType engineType, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98920080", new Object[]{this, str, engineType, str2, new Boolean(z)})).booleanValue();
        }
        if (this.isAttached) {
            return false;
        }
        int i = engineType == IRiverBackend.EngineType.Qking ? 0 : 1;
        if (StringUtils.isEmpty(str2)) {
            str2 = "";
        }
        this.mNativeInstancePtr = Long.valueOf(nativeAttach(this, str, i, str2, z));
        if (this.mNativeInstancePtr != null) {
            this.isAttached = true;
            return true;
        }
        com.taobao.android.riverlogger.e.a(RVLLevel.Error, TAG, "failed to attach wRiver backend...");
        return false;
    }

    public void createAppContext(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1ab422", new Object[]{this, hashMap});
        } else if (!isAttached()) {
        } else {
            nativeCreateAppContext(this.mNativeInstancePtr.longValue(), hashMap);
        }
    }

    public boolean detach() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7b39a9e", new Object[]{this})).booleanValue();
        }
        if (isAttached()) {
            z = nativeDetach(this.mNativeInstancePtr.longValue());
            this.isAttached = false;
            this.mNativeInstancePtr = null;
        } else {
            z = false;
        }
        sLibraryLoadedListener = null;
        return z;
    }

    public void executeScriptInMainContext(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09b3fac", new Object[]{this, str, str2});
        } else if (!isAttached() || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            nativeExecuteScriptInMainContext(this.mNativeInstancePtr.longValue(), str, str2);
        }
    }

    public void executeBytecodeInMainContext(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89226bf", new Object[]{this, bArr, str});
        } else if (!isAttached() || bArr == null || bArr.length <= 0 || StringUtils.isEmpty(str)) {
        } else {
            nativeExecuteByteCodeInMainContext(this.mNativeInstancePtr.longValue(), bArr, str);
        }
    }

    public void executeScriptInAppContext(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7222b578", new Object[]{this, str, str2, str3});
        } else if (!isAttached() || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            nativeExecuteScriptInAppContext(this.mNativeInstancePtr.longValue(), str, str2, str3);
        }
    }

    public void executeBytecodeInAppContext(byte[] bArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b63f5f", new Object[]{this, bArr, str, str2});
        } else if (!isAttached() || bArr == null || bArr.length <= 0 || StringUtils.isEmpty(str)) {
        } else {
            nativeExecuteByteCodeInAppContext(this.mNativeInstancePtr.longValue(), bArr, str, str2);
        }
    }

    public void executeScriptInCurrentThread(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("719e1ca3", new Object[]{this, str, str2, str3});
        } else if (!isAttached() || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            nativeExecuteScriptInCurrentThread(this.mNativeInstancePtr.longValue(), str, str2, str3);
        }
    }

    public void executeByteCodeInCurrentThread(byte[] bArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a383d156", new Object[]{this, bArr, str, str2});
        } else if (!isAttached() || bArr == null || bArr.length <= 0 || StringUtils.isEmpty(str)) {
        } else {
            nativeExecuteByteCodeInCurrentThread(this.mNativeInstancePtr.longValue(), bArr, str, str2);
        }
    }

    public void invokeJSMethodInMainContext(String str, JSParam[] jSParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709b180e", new Object[]{this, str, jSParamArr});
        } else if (!isAttached() || StringUtils.isEmpty(str) || jSParamArr == null) {
        } else {
            nativeInvokeJSMethodInMainContext(this.mNativeInstancePtr.longValue(), str, jSParamArr);
        }
    }

    public void invokeJSMethodInAppContext(String str, JSParam[] jSParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1f5048", new Object[]{this, str, jSParamArr});
        } else if (!isAttached() || StringUtils.isEmpty(str) || jSParamArr == null) {
        } else {
            nativeInvokeJSMethodInAppContext(this.mNativeInstancePtr.longValue(), str, jSParamArr);
        }
    }

    public void fireGlobalEventInMainContext(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361bb065", new Object[]{this, str, jSONObject, new Boolean(z)});
        } else if (!isAttached() || StringUtils.isEmpty(str) || jSONObject == null) {
        } else {
            try {
                nativeFireGlobalEventInMainContext(this.mNativeInstancePtr.longValue(), str, jSONObject.toString(), z);
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, TAG, "failed to fire global event (" + str + ") because of:" + th.getMessage());
            }
        }
    }

    public boolean hasRegisterGlobalEventInMainContext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f43d3ac", new Object[]{this, str})).booleanValue();
        }
        if (isAttached() && !StringUtils.isEmpty(str)) {
            try {
                return nativeHasRegisterGlobalEventInMainContext(this.mNativeInstancePtr.longValue(), str);
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, TAG, "failed to query global event (" + str + ") because of:" + th.getMessage());
            }
        }
        return false;
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de8be6e", new Object[]{this, byteBuffer, new Integer(i)});
        } else if (!isAttached() || byteBuffer == null || i <= 0) {
        } else {
            nativeDispatchPointerDataPacket(this.mNativeInstancePtr.longValue(), byteBuffer, i);
        }
    }

    public void updateOrangeConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ccf82b", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject.parse(str);
                nativeOrangeConfigUpdate(str);
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, "themis_gfx", "JNIBridge updateOrangeConfig cause error: " + th.getMessage());
            }
        }
    }

    public static void onLibraryLoaded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca188908", new Object[0]);
            return;
        }
        e eVar = sLibraryLoadedListener;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    public void callAriverAPI(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33627422", new Object[]{this, str, new Long(j)});
        } else if (this.mAPIDispatcher == null || StringUtils.isEmpty(str)) {
        } else {
            try {
                Long.toString(j);
                if (this.mCallAsyncAPIWithoutDecode) {
                    b bVar = this.mAPIDispatcher;
                    if (str == null) {
                        str = "";
                    }
                    bVar.a(str, new a(this.mNativeInstancePtr, this, j));
                    return;
                }
                this.mAPIDispatcher.a(JSON.parseObject(str), new a(this.mNativeInstancePtr, this, j));
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, "themis_gfx|callAriverAPI", "failed to execute callAriverAPI because of error params:" + th.getMessage());
            }
        }
    }

    public void callAriverAPIFastPath(ByteBuffer byteBuffer, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e491eb2c", new Object[]{this, byteBuffer, new Long(j)});
        } else if (this.mAPIDispatcher == null || byteBuffer == null) {
        } else {
            try {
                Long.toString(j);
                if (this.mCallAsyncAPIWithoutDecode) {
                    this.mAPIDispatcher.a(byteBuffer, new a(this.mNativeInstancePtr, this, j, true));
                } else {
                    this.mAPIDispatcher.a(com.taobao.android.themis.graphics.e.a().a(byteBuffer), new a(this.mNativeInstancePtr, this, j, true));
                }
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, "themis_gfx|callAriverAPI", "failed to execute callAriverAPI because of error params:" + th.getMessage());
            }
        }
    }

    public String callAriverAPISync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6dae9b63", new Object[]{this, str});
        }
        if (this.mAPIDispatcher == null || StringUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONObject a2 = this.mAPIDispatcher.a(JSON.parseObject(str));
            return a2 != null ? a2.toString() : "";
        } finally {
        }
    }

    public ByteBuffer callAriverAPISyncFastPath(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("6227607e", new Object[]{this, byteBuffer});
        }
        if (this.mAPIDispatcher == null || byteBuffer == null) {
            return null;
        }
        try {
            JSONObject a2 = this.mAPIDispatcher.a(com.taobao.android.themis.graphics.e.a().a(byteBuffer));
            if (a2 == null) {
                return null;
            }
            return com.taobao.android.themis.graphics.e.a().a(a2);
        } finally {
        }
    }

    public void notifyJSError(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e8c6f1", new Object[]{this, str, str2});
        } else if (this.mOnJSErrorListener == null) {
        } else {
            this.mUIHandler.post(new Runnable() { // from class: com.taobao.android.themis.graphics.JNIBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        JNIBridge.access$300(JNIBridge.this).a(str, str2);
                    }
                }
            });
        }
    }

    public void notifyLargeJSMemoryAllocated(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d88a95c", new Object[]{this, str});
        } else if (this.mOnJSMemoryListener == null) {
        } else {
            this.mUIHandler.post(new Runnable() { // from class: com.taobao.android.themis.graphics.JNIBridge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        JNIBridge.access$400(JNIBridge.this).a(str);
                    } catch (Throwable th) {
                        RVLLevel rVLLevel = RVLLevel.Error;
                        com.taobao.android.riverlogger.e.a(rVLLevel, "themis_gfx|memory", "failed to execute notifyLargeJSMemoryAllocated because of error:" + th.getMessage());
                    }
                }
            });
        }
    }

    public void notifyJSOutOfMemoryException(final int i, final int i2, final int i3, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a76eab", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), str});
        } else if (this.mOnJSMemoryListener == null) {
        } else {
            this.mUIHandler.post(new Runnable() { // from class: com.taobao.android.themis.graphics.JNIBridge.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        JNIBridge.access$400(JNIBridge.this).a(i, i2, i3, str);
                    } catch (Throwable th) {
                        RVLLevel rVLLevel = RVLLevel.Error;
                        com.taobao.android.riverlogger.e.a(rVLLevel, "themis_gfx|memory", "failed to execute notifyJSOutOfMemoryException because of error:" + th.getMessage());
                    }
                }
            });
        }
    }

    public void notifyJSMemoryUsageWhenExit(final int i, final int i2, final int i3, final int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fba4cd", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.mOnJSMemoryListener == null) {
        } else {
            this.mUIHandler.post(new Runnable() { // from class: com.taobao.android.themis.graphics.JNIBridge.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        JNIBridge.access$400(JNIBridge.this).a(i, i2, i3, i4);
                    } catch (Throwable th) {
                        RVLLevel rVLLevel = RVLLevel.Error;
                        com.taobao.android.riverlogger.e.a(rVLLevel, "themis_gfx|memory", "failed to execute notifyJSMemoryUsageWhenExit because of error:" + th.getMessage());
                    }
                }
            });
        }
    }

    public void notifyJSThreadNotResponse(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2792e429", new Object[]{this, str});
        } else if (this.mOnJSNotResponseListener == null) {
        } else {
            this.mUIHandler.post(new Runnable() { // from class: com.taobao.android.themis.graphics.JNIBridge.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        JNIBridge.access$500(JNIBridge.this).a(str);
                    } catch (Throwable th) {
                        RVLLevel rVLLevel = RVLLevel.Error;
                        com.taobao.android.riverlogger.e.a(rVLLevel, "themis_gfx|jnr", "failed to execute notifyJSThreadNotResponse because of error:" + th.getMessage());
                    }
                }
            });
        }
    }

    public void notifyJSJankCount(final int i, final double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d63ab", new Object[]{this, new Integer(i), new Double(d2)});
        } else if (this.mOnJSNotResponseListener == null) {
        } else {
            this.mUIHandler.post(new Runnable() { // from class: com.taobao.android.themis.graphics.JNIBridge.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        JNIBridge.access$500(JNIBridge.this).a(i, d2);
                    } catch (Throwable th) {
                        RVLLevel rVLLevel = RVLLevel.Error;
                        com.taobao.android.riverlogger.e.a(rVLLevel, "themis_gfx|jnr", "failed to execute notifyJSJankCountWhenExit because of error:" + th.getMessage());
                    }
                }
            });
        }
    }

    public void notifyAPIStatsReceived(final double d2, final double d3, final double d4, final List<String> list, final List<String> list2, final HashMap<String, Double> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5f5ee9", new Object[]{this, new Double(d2), new Double(d3), new Double(d4), list, list2, hashMap});
        } else if (this.mOnAPIStatsListener == null) {
        } else {
            this.mUIHandler.post(new Runnable() { // from class: com.taobao.android.themis.graphics.JNIBridge.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        JNIBridge.access$600(JNIBridge.this).a(d2, d3, d4, list, list2, hashMap);
                    } catch (Throwable th) {
                        RVLLevel rVLLevel = RVLLevel.Error;
                        com.taobao.android.riverlogger.e.a(rVLLevel, "themis_gfx|jnr", "failed to execute notifyAPIStatsReceived because of error:" + th.getMessage());
                    }
                }
            });
        }
    }

    public String notifyOnGetSourceMapForPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4801474", new Object[]{this, str});
        }
        h hVar = this.mOnSourceMapListener;
        if (hVar != null) {
            try {
                String a2 = hVar.a(str);
                return a2 != null ? a2 : "";
            } catch (Throwable th) {
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, "themis_gfx|sourcemap", "failed to execute notifyOnGetSourceMapForPath because of error:" + th.getMessage());
            }
        }
        return "";
    }

    public AudioContextProxy createAudioContext(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioContextProxy) ipChange.ipc$dispatch("9623b45", new Object[]{this, new Long(j), str});
        }
        AudioContextFactory audioContextFactory = this.mAduioContextFactory;
        if (audioContextFactory == null) {
            return null;
        }
        return audioContextFactory.createAudioContextProxy(j, str);
    }
}
