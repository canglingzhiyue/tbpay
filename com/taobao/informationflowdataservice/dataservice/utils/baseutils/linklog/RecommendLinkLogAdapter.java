package com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.i;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.bpp;
import tb.kge;
import tb.lxl;

/* loaded from: classes7.dex */
public class RecommendLinkLogAdapter implements ILinkLogAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RecommendLinkLogAdapter";
    private static boolean enableUmbrella2;
    private static boolean enableUmbrella2LogInfo;
    private UMLinkLogInterface umbrella;

    static {
        kge.a(-1798814432);
        kge.a(64254221);
        enableUmbrella2 = true;
        enableUmbrella2LogInfo = true;
    }

    public RecommendLinkLogAdapter() {
        try {
            if (checkEnableUmbrella2()) {
                this.umbrella = bpp.a();
            } else {
                lxl.c(TAG, "disenableUmbrella2");
            }
        } catch (Throwable unused) {
            lxl.c(TAG, "umbrella Fetcher error");
        }
    }

    @Override // com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.ILinkLogAdapter
    public i createLinkId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("2b8159b5", new Object[]{this, str});
        }
        try {
            if (enableUmbrella2 && this.umbrella != null) {
                return this.umbrella.createLinkId(str);
            }
            return null;
        } catch (Throwable th) {
            lxl.a(TAG, "createLinkId error", th);
            return null;
        }
    }

    @Override // com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.ILinkLogAdapter
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
            lxl.a(TAG, "logInfo error", th);
        }
    }

    @Override // com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.ILinkLogAdapter
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
            lxl.a(TAG, "logError error", th);
        }
    }

    @Override // com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.ILinkLogAdapter
    public void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        try {
            if (enableUmbrella2 && this.umbrella != null) {
                this.umbrella.commitSuccess(str, str2, str3, str4, str5, map);
                return;
            }
            UmbrellaTracker.commitSuccessStability(str, str2, str3, str3, str5, map);
        } catch (Throwable th) {
            lxl.a(TAG, "commitSuccess error", th);
        }
    }

    @Override // com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.ILinkLogAdapter
    public void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        try {
            if (enableUmbrella2 && this.umbrella != null) {
                this.umbrella.commitFailure(str, str2, str3, str4, str5, map, str6, str7);
                return;
            }
            UmbrellaTracker.commitFailureStability(str, str2, str3, str4, str5, map, str6, str7);
        } catch (Throwable th) {
            lxl.a(TAG, "commitFailure error", th);
        }
    }

    public static boolean checkEnableUmbrella2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc10e60e", new Object[0])).booleanValue();
        }
        enableUmbrella2 = true;
        enableUmbrella2LogInfo = true;
        return enableUmbrella2;
    }
}
