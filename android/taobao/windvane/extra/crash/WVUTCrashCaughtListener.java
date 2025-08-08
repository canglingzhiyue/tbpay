package android.taobao.windvane.extra.crash;

import android.taobao.windvane.util.m;
import android.taobao.windvane.util.p;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.uc.webview.export.Build;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import tb.adk;
import tb.adl;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.aem;
import tb.kge;

/* loaded from: classes2.dex */
public class WVUTCrashCaughtListener implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String wv_currentStatus;
    private LinkedList mUrlList = null;
    private String wv_currentUrl = "";

    public static /* synthetic */ LinkedList access$000(WVUTCrashCaughtListener wVUTCrashCaughtListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("1c15c412", new Object[]{wVUTCrashCaughtListener}) : wVUTCrashCaughtListener.mUrlList;
    }

    public static /* synthetic */ String access$102(WVUTCrashCaughtListener wVUTCrashCaughtListener, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a024b73d", new Object[]{wVUTCrashCaughtListener, str});
        }
        wVUTCrashCaughtListener.wv_currentUrl = str;
        return str;
    }

    static {
        kge.a(1738708942);
        kge.a(-1747099954);
        wv_currentStatus = "0";
    }

    public WVUTCrashCaughtListener() {
        init();
    }

    /* loaded from: classes2.dex */
    public class PageStartWVEventListener implements aek {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1416040046);
            kge.a(1845411121);
        }

        public PageStartWVEventListener() {
        }

        @Override // tb.aek
        public ael onEvent(int i, aej aejVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
            }
            if (i == 1001) {
                if (aejVar != null && aejVar.b != null) {
                    String str = aejVar.b;
                    if (WVUTCrashCaughtListener.access$000(WVUTCrashCaughtListener.this) != null) {
                        if (WVUTCrashCaughtListener.access$000(WVUTCrashCaughtListener.this).size() > 9) {
                            WVUTCrashCaughtListener.access$000(WVUTCrashCaughtListener.this).removeFirst();
                        }
                        WVUTCrashCaughtListener.access$000(WVUTCrashCaughtListener.this).addLast(str);
                    }
                    WVUTCrashCaughtListener.access$102(WVUTCrashCaughtListener.this, str);
                    m.a("WV_URL_CHANGE", "current Url : " + str);
                }
                WVUTCrashCaughtListener.wv_currentStatus = "2";
                return null;
            }
            switch (i) {
                case 3001:
                case 3003:
                    WVUTCrashCaughtListener.wv_currentStatus = "1";
                    return null;
                case 3002:
                    WVUTCrashCaughtListener.wv_currentStatus = "0";
                    return null;
                default:
                    return null;
            }
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mUrlList = new LinkedList();
        aem.a().a(new PageStartWVEventListener());
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        int size = this.mUrlList.size();
        HashMap hashMap = new HashMap();
        if (this.mUrlList != null && size > 0) {
            adl a2 = adl.a();
            boolean z = false;
            for (int i = 3; i < size; i++) {
                String str = (String) this.mUrlList.get(i);
                if (!StringUtils.isEmpty(str)) {
                    this.mUrlList.set(i, p.d(str));
                    adk b = a2.b(str);
                    if (!z && b != null) {
                        m.b("WVUTCrashCaughtListener", "found grey page: " + str);
                        hashMap.put(adk.KEY_AIR_TAG, b.b());
                        z = true;
                    }
                }
            }
            hashMap.put("crash_url_list", this.mUrlList.toString());
            hashMap.put("wv_currentUrl", this.wv_currentUrl);
            hashMap.put("wv_currentStatus", wv_currentStatus);
            hashMap.put("uc_version_info", String.format("ucbs %s.%s-impl %s.%s", Build.Version.NAME, Build.TIME, Build.UCM_VERSION, Build.CORE_TIME));
        }
        return hashMap;
    }
}
