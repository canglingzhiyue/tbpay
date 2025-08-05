package com.taobao.tao.linklog;

import android.os.SystemClock;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.i;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import java.util.Map;
import tb.bpp;
import tb.kge;

/* loaded from: classes.dex */
public class RecommendLinkLogAdapter implements ILinkLogAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RecommendLinkLogAdapter";
    private static boolean enableUmbrella2LogInfo;
    private UMLinkLogInterface umbrella;

    static {
        kge.a(-1627894980);
        kge.a(-242592983);
        enableUmbrella2LogInfo = true;
    }

    public RecommendLinkLogAdapter() {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.umbrella = bpp.a();
            e.e("LinkLog", "cos time:" + (SystemClock.uptimeMillis() - uptimeMillis));
        } catch (Throwable unused) {
            e.e(TAG, "umbrella Fetcher error");
        }
    }

    @Override // com.taobao.tao.linklog.ILinkLogAdapter
    public i createLinkId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("2b8159b5", new Object[]{this, str});
        }
        try {
            if (this.umbrella != null) {
                return this.umbrella.createLinkId(str);
            }
            return null;
        } catch (Throwable th) {
            e.a(TAG, "createLinkId error", th);
            return null;
        }
    }

    @Override // com.taobao.tao.linklog.ILinkLogAdapter
    public void logInfo(String str, String str2, String str3, i iVar, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf17", new Object[]{this, str, str2, str3, iVar, map, aVar});
            return;
        }
        try {
            if (enableUmbrella2LogInfo && this.umbrella != null) {
                this.umbrella.logInfo(str, str2, str3, iVar, map, aVar);
            }
        } catch (Throwable th) {
            e.a(TAG, "logInfo error", th);
        }
    }

    @Override // com.taobao.tao.linklog.ILinkLogAdapter
    public void logError(String str, String str2, String str3, i iVar, String str4, String str5, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d12f15", new Object[]{this, str, str2, str3, iVar, str4, str5, map, aVar});
            return;
        }
        try {
            if (enableUmbrella2LogInfo && this.umbrella != null) {
                this.umbrella.logError(str, str2, str3, iVar, str4, str5, map, aVar);
            }
        } catch (Throwable th) {
            e.a(TAG, "logError error", th);
        }
    }

    @Override // com.taobao.tao.linklog.ILinkLogAdapter
    public void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        try {
            if (this.umbrella == null) {
                UmbrellaTracker.commitSuccessStability(str, str2, str3, str3, str5, map);
            } else {
                this.umbrella.commitSuccess(str, str2, str3, str4, str5, map);
            }
        } catch (Throwable th) {
            e.a(TAG, "commitSuccess error", th);
        }
    }

    @Override // com.taobao.tao.linklog.ILinkLogAdapter
    public void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        try {
            if (this.umbrella == null) {
                UmbrellaTracker.commitFailureStability(str, str2, str3, str4, str5, map, str6, str7);
            } else {
                this.umbrella.commitFailure(str, str2, str3, str4, str5, map, str6, str7);
            }
        } catch (Throwable th) {
            e.a(TAG, "commitFailure error", th);
        }
    }

    public static void checkEnableUmbrella2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc10e60a", new Object[0]);
        } else {
            enableUmbrella2LogInfo = "true".equals(j.a("enableUmbrella2loginfo", "true"));
        }
    }
}
