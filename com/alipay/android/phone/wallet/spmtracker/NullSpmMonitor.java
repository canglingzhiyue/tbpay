package com.alipay.android.phone.wallet.spmtracker;

import android.view.View;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class NullSpmMonitor implements ISpmMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void behaviorClick(Object obj, String str, String str2, int i, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a36c9a5", new Object[]{this, obj, str, str2, new Integer(i), str3, map});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void behaviorExpose(Object obj, String str, String str2, int i, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41c1e005", new Object[]{this, obj, str, str2, new Integer(i), str3, map});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void behaviorSlide(Object obj, String str, String str2, int i, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9366124e", new Object[]{this, obj, str, str2, new Integer(i), str3, map});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public String getLastClickSpmId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("757147ea", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public String getLastClickSpmIdByPage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111689e8", new Object[]{this, obj});
        }
        return null;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public String getMiniPageId(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b560df46", new Object[]{this, obj});
        }
        return null;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public String getPageChInfo(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55127945", new Object[]{this, obj});
        }
        return null;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public String getPageId(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a357e75d", new Object[]{this, obj});
        }
        return null;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public String getPageSpm(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d082bb92", new Object[]{this, obj});
        }
        return null;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public String getSrcSpm(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c73dbbfb", new Object[]{this, obj});
        }
        return null;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public Object getTopPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("90bbacfd", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public Map<String, String> getTracerInfo(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f07fdf29", new Object[]{this, obj});
        }
        return null;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public boolean isPageStarted(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24fde60f", new Object[]{this, obj})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void mergeExpose(Object obj, String str, String str2, int i, String str3, Map<String, String> map, String str4, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b407742e", new Object[]{this, obj, str, str2, new Integer(i), str3, map, str4, new Integer(i2)});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void pageOnCreate(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20237517", new Object[]{this, obj, str});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void pageOnDestroy(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914a0eef", new Object[]{this, obj});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void pageOnPause(Object obj, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed765a6", new Object[]{this, obj, str, str2, map});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void pageOnPause(Object obj, String str, String str2, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee8b1f0", new Object[]{this, obj, str, str2, map, str3});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void pageOnResume(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8240d748", new Object[]{this, obj, str});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void setContentTag(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d76d6f2", new Object[]{this, view, str});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void setHomePageTabSpms(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86bbbcc0", new Object[]{this, list});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void setIsDebug(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821af06", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void setLastClickSpm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2018bd1", new Object[]{this, str});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void setMergeConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d20c69", new Object[]{this, str});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void setSpmTag(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182978a9", new Object[]{this, view, str});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void setSpmTag(View view, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed064f4b", new Object[]{this, view, str, new Boolean(z)});
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public void upateSrcSpm(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18536d0", new Object[]{this, obj, str});
        }
    }
}
