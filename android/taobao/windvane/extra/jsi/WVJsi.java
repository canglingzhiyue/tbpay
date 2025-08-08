package android.taobao.windvane.extra.jsi;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.uc.UCLog;
import android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.b;
import com.taobao.android.riverlogger.e;
import com.taobao.weex.common.Constants;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.export.extension.JSILoader;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;
import java.util.HashMap;
import tb.kge;
import tb.qfy;
import tb.qgm;

/* loaded from: classes2.dex */
public class WVJsi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String ENGINE_TYPE_QUICK_JS = null;
    private static String ENGINE_TYPE_V8 = null;
    private static String JSI_FILE_NAME = null;
    private static String KEY_JSI_ENGINE_PATH = null;
    private static String KEY_JSI_ENGINE_TYPE = null;
    private static String KEY_JSI_SO_PATH = null;
    private static final String MONITOR_POINT = "WVJsi";
    private static final String TAG = "WVJsi";
    private static volatile boolean hasLoadQjsJsi;
    private static volatile boolean hasLoadUCJsi;

    public static /* synthetic */ boolean access$200(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a04487f3", new Object[]{context})).booleanValue() : loadUcJsiIfNecessary(context);
    }

    public static /* synthetic */ boolean access$400(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0a507b1", new Object[]{context})).booleanValue() : loadQjsJsiIfNecessary(context);
    }

    static {
        kge.a(-1103542577);
        hasLoadUCJsi = false;
        hasLoadQjsJsi = false;
        KEY_JSI_SO_PATH = "jsiSoPath";
        KEY_JSI_ENGINE_PATH = "jsEngineSoPath";
        KEY_JSI_ENGINE_TYPE = "engineType";
        ENGINE_TYPE_V8 = Constants.CodeCache.SAVE_PATH;
        ENGINE_TYPE_QUICK_JS = "qjs";
        JSI_FILE_NAME = "libjsi.so";
        try {
            if (UCLog.getInstance().isInited()) {
                return;
            }
            UCLog.getInstance().init(true);
        } catch (Throwable th) {
            m.b("WVJsi", "", th, new Object[0]);
        }
    }

    private static boolean loadQjsJsiIfNecessary(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("881690bf", new Object[]{context})).booleanValue();
        }
        if (!hasLoadQjsJsi) {
            return loadQjsJsi(context);
        }
        return true;
    }

    private static boolean loadUcJsiIfNecessary(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44770d5f", new Object[]{context})).booleanValue();
        }
        if (!hasLoadUCJsi) {
            return loadJsi(context);
        }
        return true;
    }

    private static String getJsiSoPath(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dd834aa", new Object[]{context});
        }
        return context.getApplicationInfo().nativeLibraryDir + "/" + JSI_FILE_NAME;
    }

    private static boolean loadQjsJsi(Context context) {
        qfy qfyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a22fe3b9", new Object[]{context})).booleanValue();
        }
        if (j.commonConfig.cZ && (qfyVar = (qfy) qgm.a().a(qfy.class)) != null) {
            qfyVar.a(context);
        }
        Bundle bundle = new Bundle();
        bundle.putString(KEY_JSI_SO_PATH, getJsiSoPath(context));
        bundle.putString(KEY_JSI_ENGINE_TYPE, ENGINE_TYPE_QUICK_JS);
        try {
            if (JSEngine.loadSo(context, bundle)) {
                hasLoadQjsJsi = true;
                e.a(RVLLevel.Info, "WVJsi/LOAD").a("QJS_LOAD_SUCCESS").a();
            } else {
                e.a(RVLLevel.Error, "WVJsi/LOAD").a("QJS_LOAD_FAIL").a();
            }
            return hasLoadQjsJsi;
        } catch (Throwable th) {
            e.a(RVLLevel.Error, "WVJsi/LOAD").a("QJS_LOAD_FAIL").a("msg", (Object) Log.getStackTraceString(th)).a();
            return hasLoadQjsJsi;
        }
    }

    public static boolean loadJsi(Context context) {
        qfy qfyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59fcd9eb", new Object[]{context})).booleanValue();
        }
        try {
            if (j.commonConfig.cZ && (qfyVar = (qfy) qgm.a().a(qfy.class)) != null) {
                qfyVar.a(context);
            }
            String fetchUCRemoteLocal = WVUCRemoteFetcher.fetchUCRemoteLocal();
            if (StringUtils.isEmpty(fetchUCRemoteLocal)) {
                e.a(RVLLevel.Error, "WVJsi/LOAD").a("V8_LOAD_FAIL").a("msg", (Object) "kernel file, kernelPath is empty").a();
                tryFetchRemoteUC();
                return false;
            }
            File file = new File(fetchUCRemoteLocal);
            HashMap hashMap = new HashMap();
            if (file.isDirectory()) {
                hashMap.put(JSILoader.EXTRA_PARAM_SPECIFIED_DIR, file.getAbsolutePath());
            }
            if (file.isFile() && U4Engine.loadJsiSo(context, JSEngine.class.getClassLoader(), new File(getJsiSoPath(context)), file, false, null)) {
                hasLoadUCJsi = true;
                b a2 = e.a(RVLLevel.Info, "WVJsi/LOAD").a("V8_LOAD_SUCCESS");
                a2.a("msg", (Object) ("kernel file, kernelPath=" + fetchUCRemoteLocal)).a();
            } else if (file.isDirectory() && U4Engine.loadJsiSo(context, JSEngine.class.getClassLoader(), new File(getJsiSoPath(context)), null, false, hashMap)) {
                hasLoadUCJsi = true;
                b a3 = e.a(RVLLevel.Info, "WVJsi/LOAD").a("V8_LOAD_SUCCESS");
                a3.a("msg", (Object) ("kernel dir, kernelPath=" + fetchUCRemoteLocal)).a();
            } else {
                b a4 = e.a(RVLLevel.Error, "WVJsi/LOAD").a("V8_LOAD_FAIL");
                a4.a("msg", (Object) ("failed or use illegal kernelPath =" + fetchUCRemoteLocal)).a();
                tryFetchRemoteUC();
            }
            return hasLoadUCJsi;
        } catch (Throwable th) {
            int i = -1;
            if (th instanceof UCKnownException) {
                i = ((UCKnownException) th).errCode();
            }
            e.a(RVLLevel.Error, "WVJsi/LOAD").a("V8_LOAD_FAIL").a("msg", (Object) Log.getStackTraceString(th)).a("errorCode", Integer.valueOf(i)).a();
            m.b("WVJsi", "loadJsi fail:" + i, th, new Object[0]);
            tryFetchRemoteUC();
            return hasLoadUCJsi;
        }
    }

    private static void tryFetchRemoteUC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e55a33a", new Object[0]);
        } else if (!StringUtils.isEmpty(WVUCRemoteFetcher.fetchUCRemoteLocal())) {
        } else {
            WVUCRemoteFetcher.fetchUCRemote(null);
        }
    }

    public static InstanceBuilder instanceBuilder(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InstanceBuilder) ipChange.ipc$dispatch("35b4d79b", new Object[]{context}) : new InstanceBuilder(context);
    }

    /* loaded from: classes2.dex */
    public static class InstanceBuilder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String bizName;
        private final Context context;
        private String dataDir;
        private String flags;
        private Handler handler;
        private JsiMode jsiMode = JsiMode.V8;
        private String name;
        private int timeout;
        private String version;

        static {
            kge.a(75777361);
        }

        public InstanceBuilder(Context context) {
            this.context = context;
        }

        public InstanceBuilder name(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("e2f331dc", new Object[]{this, str});
            }
            this.name = str;
            return this;
        }

        public InstanceBuilder version(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("906d6169", new Object[]{this, str});
            }
            this.version = str;
            return this;
        }

        public InstanceBuilder dataDir(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("ffb429d4", new Object[]{this, str});
            }
            this.dataDir = str;
            return this;
        }

        public InstanceBuilder flags(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("71711cd8", new Object[]{this, str});
            }
            this.flags = str;
            return this;
        }

        public InstanceBuilder timeout(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("ab6de49b", new Object[]{this, new Integer(i)});
            }
            this.timeout = i;
            return this;
        }

        public InstanceBuilder bizName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("ce0b544f", new Object[]{this, str});
            }
            this.bizName = str;
            return this;
        }

        public InstanceBuilder handler(Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("6bf39781", new Object[]{this, handler});
            }
            this.handler = handler;
            return this;
        }

        public InstanceBuilder mode(JsiMode jsiMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("829080a6", new Object[]{this, jsiMode});
            }
            this.jsiMode = jsiMode;
            return this;
        }

        public InstanceResult build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceResult) ipChange.ipc$dispatch("2129e129", new Object[]{this});
            }
            if (this.jsiMode.isV8Enable()) {
                InstanceResult tryV8Instance = tryV8Instance(this.context);
                if (tryV8Instance.isSuccess()) {
                    return tryV8Instance;
                }
            }
            if (this.jsiMode.isQjsEnable()) {
                return tryQjsInstance(this.context);
            }
            return new InstanceResult(null, new InstanceException("instance create fail:" + this.jsiMode));
        }

        private void commitInstanceSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e1632c8", new Object[]{this, str});
                return;
            }
            try {
                AppMonitor.Alarm.commitSuccess("WindVane", "WVJsi", str + "|" + this.name);
            } catch (Throwable th) {
                m.b("WVJsi", "commitInstanceSuccess fail", th, new Object[0]);
            }
        }

        private void commitInstanceFail(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a93cc2cf", new Object[]{this, str, str2, str3});
                return;
            }
            try {
                AppMonitor.Alarm.commitFail("WindVane", "WVJsi", str + "|" + this.name, str2, str3);
            } catch (Throwable th) {
                m.b("WVJsi", "commitInstanceFail fail", th, new Object[0]);
            }
        }

        private Bundle buildCommonArgs() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("2cb80381", new Object[]{this});
            }
            Bundle bundle = new Bundle();
            bundle.putString("name", this.name);
            bundle.putString("version", this.version);
            bundle.putString("datadir", this.dataDir);
            bundle.putString("flags", this.flags);
            bundle.putInt("timeout", this.timeout);
            return bundle;
        }

        private InstanceResult tryV8Instance(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceResult) ipChange.ipc$dispatch("b8b6eecf", new Object[]{this, context});
            }
            WVJsi.access$200(context);
            if (!JSEngine.isEngineReady(1)) {
                commitInstanceFail(Constants.CodeCache.SAVE_PATH, "V8_NOT_READY", null);
                e.a(RVLLevel.Error, "WVJsi/CREATE").a("V8_NOT_READY").a("name", (Object) this.name).a();
                return new InstanceResult(null, new InstanceException("v8 engine is not ready"));
            }
            Bundle buildCommonArgs = buildCommonArgs();
            buildCommonArgs.putInt("engine", 1);
            try {
                e.a(RVLLevel.Info, "WVJsi/CREATE").a("V8_CREATE_START").a("name", (Object) this.name).a();
                InstanceResult instanceResult = new InstanceResult(JSEngine.createInstance(context, buildCommonArgs, this.handler), null);
                if (instanceResult.isSuccess()) {
                    commitInstanceSuccess(Constants.CodeCache.SAVE_PATH);
                    e.a(RVLLevel.Info, "WVJsi/CREATE").a("V8_CREATE_SUCCESS").a("name", (Object) this.name).a();
                } else {
                    commitInstanceFail(Constants.CodeCache.SAVE_PATH, "CREATE_FAIL", null);
                    e.a(RVLLevel.Error, "WVJsi/CREATE").a("V8_CREATE_FAIL").a("name", (Object) this.name).a();
                }
                return instanceResult;
            } catch (Throwable th) {
                e.a(RVLLevel.Error, "WVJsi/CREATE").a("V8_CREATE_FAIL_EXCEPTION").a("name", (Object) this.name).a("msg", (Object) Log.getStackTraceString(th)).a();
                commitInstanceFail(Constants.CodeCache.SAVE_PATH, "CREATE_FAIL_EXCEPTION", th.getMessage());
                return new InstanceResult(null, new InstanceException("create jsi instance v8 fail", th));
            }
        }

        private InstanceResult tryQjsInstance(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceResult) ipChange.ipc$dispatch("9ccbcbf1", new Object[]{this, context});
            }
            WVJsi.access$400(context);
            if (!JSEngine.isEngineReady(3)) {
                commitInstanceFail("qjs", "QJS_NOT_READY", null);
                return new InstanceResult(null, new InstanceException("qjs engine is not ready"));
            }
            Bundle buildCommonArgs = buildCommonArgs();
            buildCommonArgs.putInt("engine", 3);
            try {
                e.a(RVLLevel.Info, "WVJsi/CREATE").a("QJS_CREATE_START").a("name", (Object) this.name).a();
                InstanceResult instanceResult = new InstanceResult(JSEngine.createInstance(context, buildCommonArgs, this.handler), null);
                if (instanceResult.isSuccess()) {
                    commitInstanceSuccess("qjs");
                    e.a(RVLLevel.Info, "WVJsi/CREATE").a("QJS_CREATE_SUCCESS").a("name", (Object) this.name).a();
                } else {
                    commitInstanceFail("qjs", "CREATE_FAIL", null);
                    e.a(RVLLevel.Error, "WVJsi/CREATE").a("QJS_CREATE_FAIL").a("name", (Object) this.name).a();
                }
                return instanceResult;
            } catch (Throwable th) {
                e.a(RVLLevel.Error, "WVJsi/CREATE").a("QJS_CREATE_FAIL_EXCEPTION").a("name", (Object) this.name).a("msg", (Object) Log.getStackTraceString(th)).a();
                commitInstanceFail("qjs", "CREATE_FAIL_EXCEPTION", th.getMessage());
                return new InstanceResult(null, new InstanceException("create jsi instance qjs fail", th));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class InstanceResult {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Exception exception;
        private final JSEngine jsEngine;

        static {
            kge.a(-2047810649);
        }

        private InstanceResult(JSEngine jSEngine, Exception exc) {
            this.jsEngine = jSEngine;
            this.exception = exc;
        }

        public JSEngine getJsEngine() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSEngine) ipChange.ipc$dispatch("8d6c6b4c", new Object[]{this}) : this.jsEngine;
        }

        public Exception getException() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Exception) ipChange.ipc$dispatch("9ad20156", new Object[]{this}) : this.exception;
        }

        public boolean isSuccess() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue() : this.jsEngine != null;
        }
    }

    /* loaded from: classes2.dex */
    public static class InstanceException extends RuntimeException {
        static {
            kge.a(-1605267323);
        }

        private InstanceException(String str) {
            super(str);
        }

        private InstanceException(String str, Throwable th) {
            super(str, th);
        }

        public InstanceException(Throwable th) {
            super(th);
        }
    }
}
