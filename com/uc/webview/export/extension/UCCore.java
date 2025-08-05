package com.uc.webview.export.extension;

import android.content.Context;
import android.webkit.ValueCallback;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.io.d;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.extension.INetworkDelegate;
import com.uc.webview.export.extension.U4Engine;
import com.uc.webview.export.extension.UCPlayer;
import com.uc.webview.export.internal.interfaces.INetLogger;
import com.uc.webview.export.internal.interfaces.INetwork;
import com.uc.webview.export.internal.interfaces.INetworkDecider;
import com.uc.webview.export.internal.setup.UCSetupException;
import com.uc.webview.export.utility.SetupTask;
import java.io.File;
import java.util.Map;

@Deprecated
/* loaded from: classes9.dex */
public final class UCCore {
    public static final String ADAPTER_BUILD_VERSOPM = "adapter_build_version";
    public static final String BUSINESS_INIT_BY_NEW_CORE_DEX_DIR = "bit_by_new_dex_dir";
    public static final String BUSINESS_INIT_BY_NEW_CORE_ZIP_FILE = "bit_by_new_zip_file";
    public static final String BUSINESS_INIT_BY_OLD_CORE_DEX_DIR = "bit_by_old_dex_dir";
    public static final int CORE_EVENT_CONSOLE_CALLBACK = 6;
    public static final int CORE_EVENT_DELETE_SERVICEWORKER_CACHE = 4;
    public static final int CORE_EVENT_DELETE_SERVICEWORKER_CACHE_SYNC = -1;
    public static final int CORE_EVENT_HTTP2_HOST_LIST = 8;
    public static final int CORE_EVENT_INIT_WPK = 13;
    public static final int CORE_EVENT_MAX_REQUEST_LIMITATION = 7;
    public static final int CORE_EVENT_ON_ACTIVITY_RECREATE = 11;
    public static final int CORE_EVENT_SERVICEWORKER_PUSHMESSAGE = -1;
    public static final int CORE_EVENT_SET_MAX_CACHESIZE = 10;
    public static final int CORE_EVENT_SET_WPK_CALLBACK = 14;
    public static final int CORE_EVENT_SET_WPK_COMMON_CUSTOM_FILELDS = 15;
    public static final int CORE_EVENT_SET_WPK_CONFIGS = 16;
    private static final boolean DEBUG = false;
    public static final int DELETE_CORE_POLICY_ALL = 63;
    public static final int DELETE_CORE_POLICY_FILE_VERIFY_FAILED = 16;
    public static final int DELETE_CORE_POLICY_LOAD_SO_ERROR = 2;
    public static final int DELETE_CORE_POLICY_MULTI_CRASH = 4;
    public static final int DELETE_CORE_POLICY_NONE = 0;
    public static final int DELETE_CORE_POLICY_OTHER = 32;
    public static final int DELETE_CORE_POLICY_SO_HASH_MISMATCH = 8;
    public static final int DELETE_CORE_POLICY_SO_SIZE_MISMATCH = 1;
    public static final String EVENT_INIT_CORE_SUCCESS = "be_init_success";
    public static final String LOAD_POLICY_SPECIFIED_ONLY = "SPECIFIED_ONLY";
    public static final String OPTION_BUSINESS_DECOMPRESS_ROOT_PATH = "bo_dec_r_p";
    public static final String OPTION_BUSINESS_INIT_TYPE = "bo_init_type";
    public static final String OPTION_CONTEXT = "CONTEXT";
    public static final String OPTION_DECOMPRESS_AND_ODEX_CALLBACK = "bo_dec_odex_cb";
    public static final String OPTION_DECOMPRESS_CALLBACK = "bo_dec_cl";
    public static final String OPTION_DELETE_AFTER_EXTRACT = "bo_del_aft_extract";
    public static final String OPTION_DELETE_CORE_POLICY = "delete_core";
    public static final String OPTION_DELETE_OLD_DEX_DIR = "bo_dex_old_dex_dir";
    public static final String OPTION_DEX_FILE_PATH = "dexFilePath";
    public static final String OPTION_DISTINGUISH_JS_ERROR = "distinguish_js_error";
    public static final String OPTION_FORCE_USE_BUSINESS_DECOMPRESS_ROOT_PATH = "bo_f_u_dec_r_p";
    public static final String OPTION_INIT_IN_SETUP_THREAD = "init_setup_thread";
    public static final String OPTION_LOAD_POLICY = "loadPolicy";
    public static final String OPTION_LOG_CONFIG = "log_conf";
    public static final String OPTION_MULTI_CORE_TYPE = "MULTI_CORE_TYPE";
    public static final String OPTION_MULTI_UNKNOWN_CRASH_DISABLE = "disable_multi_unknown_crash";
    public static final String OPTION_NEW_UCM_ZIP_FILE = "bo_new_ucm_zf";
    public static final String OPTION_NEW_UCM_ZIP_TYPE = "bo_new_ucm_z_type";
    public static final String OPTION_OLD_DEX_DIR_PATH = "bo_old_dex_dp";
    public static final String OPTION_PRIVATE_DATA_DIRECTORY_SUFFIX = "PRIVATE_DATA_DIRECTORY_SUFFIX";
    public static final String OPTION_PROMISE_SPECIAL_VERSION_CORE_INIT = "bo_prom_sp_v_c_i";
    public static final String OPTION_PROVIDED_KEYS = "provided_keys";
    public static final String OPTION_SETUP_THREAD_PRIORITY = "setup_priority";
    public static final String OPTION_SKIP_PRECONDITIONS_IO_CHECK = "bo_skip_io_dc";
    public static final String OPTION_STARTUP_POLICY = "startup_policy";
    public static final String OPTION_START_INIT_UC_CORE = "bo_s_i_uc_core";
    public static final String OPTION_USE_SYSTEM_WEBVIEW = "SYSTEM_WEBVIEW";
    public static final String OPTION_USE_UC_PLAYER = "ucPlayer";
    public static final String OPTION_VERIFY_POLICY = "VERIFY_POLICY";
    public static final String OPTION_WEBVIEW_MULTI_PROCESS = "webview_multi_process";
    public static final String OPTION_WEBVIEW_MULTI_PROCESS_ENABLE_SERVICE_SPEEDUP = "webview_multi_process_enable_service_speedup";
    public static final String OPTION_WEBVIEW_MULTI_PROCESS_FALLBACK_TIMEOUT = "webview_multi_process_fallback_timeout";
    public static final int PRE_INIT_EVENT_DECOMPRESS = 0;
    public static final int PRE_INIT_EVENT_ICU = 9;
    public static final int PRE_INIT_EVENT_INIT_WEBVIEW_PROVIDER = 6;
    public static final int PRE_INIT_EVENT_LOAD_CORE_CLASS = 3;
    public static final int PRE_INIT_EVENT_LOAD_IO = 1;
    public static final int PRE_INIT_EVENT_LOAD_JAR = 4;
    public static final int PRE_INIT_EVENT_LOAD_SDK_CLASS = 2;
    public static final int PRE_INIT_EVENT_LOAD_SO = 5;
    public static final int PRE_INIT_EVENT_PAK = 8;
    public static final int PRE_INIT_EVENT_START_CORE_ENGINE = 7;
    public static final int STARTUP_POLICY_DEFAULT = 0;
    public static final int STARTUP_POLICY_NONE = 0;
    private static final String TAG = "UCCore";
    public static final int VERIFY_POLICY_ALL = 1073741871;
    public static final int VERIFY_POLICY_ALL_FULL_HASH = -1073741697;
    public static final int VERIFY_POLICY_ASYNC = Integer.MIN_VALUE;
    public static final int VERIFY_POLICY_BROWSER_IF = 2;
    public static final int VERIFY_POLICY_CORE_IMPL = 4;
    public static final int VERIFY_POLICY_NONE = 0;
    public static final int VERIFY_POLICY_PAK = 32;
    public static final int VERIFY_POLICY_PAK_FULL_HASH = 64;
    public static final int VERIFY_POLICY_PAK_QUICK = 536870912;
    public static final int VERIFY_POLICY_QUICK = 1073741824;
    public static final int VERIFY_POLICY_SDK_SHELL = 1;
    public static final int VERIFY_POLICY_SO = 8;
    public static final int VERIFY_POLICY_SO_FULL_HASH = 16;
    public static final int VERIFY_POLICY_SO_QUICK = 268435456;
    public static final int VERIFY_POLICY_WITH_MD5 = 1048576;
    public static final int VERIFY_POLICY_WITH_SHA1 = 2097152;
    public static final int VERIFY_POLICY_WITH_SHA256 = 4194304;
    public static final int WEBVIEW_MULTI_PROCESS_ISOLATE = 2;
    public static final int WEBVIEW_MULTI_PROCESS_NONE = 0;
    public static final int WEBVIEW_MULTI_PROCESS_NORMAL = 1;

    /* loaded from: classes9.dex */
    public interface Callable<V, T> {
        V call(T t) throws Exception;
    }

    public static void clearHttpCache(Runnable runnable) {
        StorageUtils.clearHttpCache(runnable);
    }

    public static void clearPrecacheResources(String[] strArr) {
        StorageUtils.clearPrecacheResources(strArr);
    }

    public static void computeHttpCacheSize(ValueCallback<Long> valueCallback) {
        StorageUtils.computeHttpCacheSize(valueCallback);
    }

    public static boolean extractWebCoreLibraryIfNeeded(Context context, String str, String str2, String str3, boolean z) throws UCSetupException {
        U4Engine.extractFile(context, new File(str), new File(str3), z);
        return true;
    }

    public static String getExtractDirPath(Context context, String str) {
        return U4Engine.getExtractDir(context, new File(str)).getAbsolutePath();
    }

    public static String getExtractDirPath(String str, String str2) {
        return d.a(new File(str), PathUtils.generateName(new File(str2))).getAbsolutePath();
    }

    public static void getResourceFromHttpCache(String str, ValueCallback<WebResourceResponse> valueCallback) {
        StorageUtils.getResourceFromHttpCache(str, valueCallback);
    }

    public static Object notifyCoreEvent(int i, Object obj) {
        return notifyCoreEvent(i, obj, null);
    }

    public static Object notifyCoreEvent(int i, Object obj, ValueCallback<Object> valueCallback) {
        return null;
    }

    public static Object preInitCore(int i, Context context, Object[] objArr) {
        return null;
    }

    public static void precacheResources(Map<String, WebResourceResponse> map, Map<String, String> map2) {
        StorageUtils.precacheResources(map, map2);
    }

    public static void reloadFonts() {
        StorageUtils.reloadFonts();
    }

    public static boolean setGlobalOption(String str, Object obj) {
        return false;
    }

    public static void setNetLogger(INetLogger iNetLogger) {
    }

    public static void setNetworkDelegate(int i, INetworkDelegate iNetworkDelegate) {
        INetworkDelegate.Instance.set(i, iNetworkDelegate);
    }

    public static void setThirdNetwork(INetwork iNetwork, INetworkDecider iNetworkDecider) {
    }

    public static SetupTask setup(String str, Object obj) {
        return SetupTask.getInstance().setup(str, obj);
    }

    public static void startTCPDevtools(String str, int i) {
    }

    public static void updateDnsCache(String[] strArr) {
        StorageUtils.updateDnsCache(strArr);
    }

    public static void updateUCPlayer(Context context, String str, java.util.concurrent.Callable<Boolean> callable) throws UCSetupException {
        updateUCPlayer(context, str, callable, null);
    }

    public static void updateUCPlayer(Context context, String str, final java.util.concurrent.Callable<Boolean> callable, final Map<String, ValueCallback> map) throws UCSetupException {
        UCPlayer.createUpdater().setContext(context).setUrl(str).setClient(new UCPlayer.UpdaterClient() { // from class: com.uc.webview.export.extension.UCCore.1
            private static ValueCallback a(Map<String, ValueCallback> map2, String str2) {
                if (map2 == null) {
                    return null;
                }
                return map2.get(str2);
            }

            @Override // com.uc.webview.export.extension.UCPlayer.UpdaterClient
            public final boolean onDownloadStart(String str2, U4Engine.IDownloadHandle iDownloadHandle) {
                try {
                    if (callable == null) {
                        return true;
                    }
                    return ((Boolean) callable.call()).booleanValue();
                } catch (Throwable unused) {
                    return false;
                }
            }

            @Override // com.uc.webview.export.extension.UCPlayer.UpdaterClient
            public final void onFailed(UCKnownException uCKnownException) {
                ValueCallback a2 = a(map, "exception");
                if (a2 != null) {
                    a2.onReceiveValue(null);
                }
            }

            @Override // com.uc.webview.export.extension.UCPlayer.UpdaterClient
            public final void onSuccess(String str2) {
                ValueCallback a2 = a(map, "success");
                if (a2 != null) {
                    a2.onReceiveValue(null);
                }
            }
        }).start();
    }
}
