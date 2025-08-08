package android.taobao.windvane.extra.uc.remotefetch;

import android.taobao.windvane.jsbridge.api.WVDevelopTool;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.ihq;
import tb.ihu;
import tb.ihw;
import tb.kge;

/* loaded from: classes2.dex */
public class WVUCRemoteFetcher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUCRemoteFetcher";
    private static final String UC_CORE_REMOTE_SO_NAME = "kernelu4_7z_uc";

    /* loaded from: classes2.dex */
    public interface WVUCFetcherCallback {
        void onFetchFail(Throwable th);

        void onFetchSuccess(String str);
    }

    static {
        kge.a(-1432412901);
    }

    public static String getCoreRemoteSoName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6808ac97", new Object[0]) : UC_CORE_REMOTE_SO_NAME;
    }

    public static /* synthetic */ boolean access$000(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38fae185", new Object[]{str})).booleanValue() : isValidRemoteSoPath(str);
    }

    private static boolean isValidRemoteSoPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28b786e", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return new File(str).exists();
        }
        return false;
    }

    public static String fetchUCRemoteLocal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1042083c", new Object[0]);
        }
        if (WVDevelopTool.isEnableUCRemoteDebug()) {
            String uCRemoteDebugFilePath = WVDevelopTool.getUCRemoteDebugFilePath();
            if (!StringUtils.isEmpty(uCRemoteDebugFilePath)) {
                m.e(TAG, "use uc remote debug file path:" + uCRemoteDebugFilePath);
                return uCRemoteDebugFilePath;
            }
        }
        ihw a2 = ihq.b().a(UC_CORE_REMOTE_SO_NAME);
        return (!a2.g() || !isValidRemoteSoPath(a2.b())) ? "" : a2.b();
    }

    public static boolean hasUCRemoteLocal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7280108", new Object[0])).booleanValue() : !StringUtils.isEmpty(fetchUCRemoteLocal());
    }

    public static void fetchUCRemote(final WVUCFetcherCallback wVUCFetcherCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac86fce", new Object[]{wVUCFetcherCallback});
            return;
        }
        try {
            String fetchUCRemoteLocal = fetchUCRemoteLocal();
            if (StringUtils.isEmpty(fetchUCRemoteLocal) || !isValidRemoteSoPath(fetchUCRemoteLocal)) {
                ihq.b().a(UC_CORE_REMOTE_SO_NAME, new ihu() { // from class: android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.ihu
                    public void onFetchFinished(ihw ihwVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e2928fec", new Object[]{this, ihwVar});
                        } else if (!ihwVar.g() || !WVUCRemoteFetcher.access$000(ihwVar.b())) {
                            WVUCFetcherCallback wVUCFetcherCallback2 = WVUCFetcherCallback.this;
                            if (wVUCFetcherCallback2 == null) {
                                return;
                            }
                            wVUCFetcherCallback2.onFetchFail(ihwVar.f());
                        } else {
                            WVUCFetcherCallback wVUCFetcherCallback3 = WVUCFetcherCallback.this;
                            if (wVUCFetcherCallback3 == null) {
                                return;
                            }
                            wVUCFetcherCallback3.onFetchSuccess(ihwVar.b());
                        }
                    }
                });
            } else if (wVUCFetcherCallback == null) {
            } else {
                wVUCFetcherCallback.onFetchSuccess(fetchUCRemoteLocal);
            }
        } catch (Throwable th) {
            if (wVUCFetcherCallback == null) {
                return;
            }
            wVUCFetcherCallback.onFetchFail(th);
        }
    }
}
