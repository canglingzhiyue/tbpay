package android.taobao.windvane.extra.performance2;

import android.taobao.windvane.util.a;
import android.taobao.windvane.util.m;
import android.taobao.windvane.util.p;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class WVWPManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVWPManager";
    private static volatile WVWPManager sInstance;
    private final Map<Integer, WVWPData> wvwpMap = new ConcurrentHashMap();

    static {
        kge.a(1063616491);
    }

    private WVWPManager() {
    }

    public static WVWPManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVWPManager) ipChange.ipc$dispatch("ffe49ba8", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (WVWPManager.class) {
                if (sInstance == null) {
                    sInstance = new WVWPManager();
                }
            }
        }
        return sInstance;
    }

    public void onViewInit(int i, WVWPData wVWPData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857c570d", new Object[]{this, new Integer(i), wVWPData});
        } else {
            this.wvwpMap.put(Integer.valueOf(i), wVWPData);
        }
    }

    public void onDestroy(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24115721", new Object[]{this, new Integer(i)});
        } else {
            this.wvwpMap.remove(Integer.valueOf(i));
        }
    }

    public WVWPData findDataByUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVWPData) ipChange.ipc$dispatch("8a3326ab", new Object[]{this, str});
        }
        for (WVWPData wVWPData : this.wvwpMap.values()) {
            try {
                if (wVWPData.webviewWeakRef != null) {
                    IWVWebView iWVWebView = wVWPData.webviewWeakRef.get();
                    if (iWVWebView instanceof IPerformance) {
                        String cachedUrl = ((IPerformance) iWVWebView).getCachedUrl();
                        boolean isPreInit = ((IPerformance) iWVWebView).isPreInit();
                        if (TextUtils.equals(p.d(cachedUrl), p.d(str))) {
                            if (!isPreInit) {
                                return wVWPData;
                            }
                            m.e(TAG, "isPreInit, abort upload white page:" + cachedUrl);
                            return null;
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            } catch (Throwable th) {
                m.e(TAG, a.a(th));
            }
        }
        return null;
    }
}
