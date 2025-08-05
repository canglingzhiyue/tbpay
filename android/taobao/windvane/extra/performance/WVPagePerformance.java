package android.taobao.windvane.extra.performance;

import com.android.alibaba.ip.runtime.IpChange;
import tb.aex;
import tb.kge;

/* loaded from: classes2.dex */
public class WVPagePerformance {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long h5_PP_FP;
    private long h5_PP_FSP;
    private long h5_PP_FSP_uptime;
    private long h5_PP_T1;
    private long h5_PP_T1_uptime;
    private long h5_PP_T2;
    private long h5_PP_T2_uptime;
    private long h5_PP_TTI;
    public long h5_PP_domComplete;
    public long h5_PP_domComplete_uptime;
    private long h5_PP_domContentLoadedEventStart;
    private long h5_PP_domContentLoadedEventStart_uptime;
    public long h5_PP_domLoading;
    public long h5_PP_domLoading_uptime;
    private String h5_PP_errorCode;
    private String h5_PP_errorMessage;
    private long h5_PP_fetchStart;
    private long h5_PP_fetchStart_uptime;
    private long h5_PP_finishLoad;
    private long h5_PP_finishLoad_uptime;
    private long h5_PP_interceptEnd;
    private long h5_PP_interceptStart;
    private boolean h5_PP_isFinished;
    private long h5_PP_loadEventEnd;
    private long h5_PP_loadEventEnd_uptime;
    private long h5_PP_loadEventStart;
    private long h5_PP_loadEventStart_uptime;
    private long h5_PP_navigationStart;
    private long h5_PP_navigationStart_uptime;
    public long h5_PP_requestStart;
    public long h5_PP_requestStart_uptime;
    private long h5_PP_responseEnd;
    private long h5_PP_responseEnd_uptime;
    private long h5_PP_startLoad;
    private long h5_PP_startLoad_uptime;
    private int h5_core_type;
    private String h5_core_type_str;
    private String url;

    static {
        kge.a(930860320);
    }

    public void setH5_PP_interceptStart(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3124e70e", new Object[]{this, new Long(j)});
        } else {
            this.h5_PP_interceptStart = j;
        }
    }

    public void setH5_PP_interceptEnd(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("664caef5", new Object[]{this, new Long(j)});
        } else {
            this.h5_PP_interceptEnd = j;
        }
    }

    public void setH5_PP_startLoad(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d5464", new Object[]{this, new Long(j)});
        } else {
            this.h5_PP_startLoad = j;
        }
    }

    public void setH5_PP_startLoad_uptime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3941f74f", new Object[]{this, new Long(j)});
        } else {
            this.h5_PP_startLoad_uptime = j;
        }
    }

    public void setH5_PP_finishLoad(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fb2fd5", new Object[]{this, new Long(j)});
        } else {
            this.h5_PP_finishLoad = j;
        }
    }

    public void setH5_PP_finishLoad_uptime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eac8abe", new Object[]{this, new Long(j)});
        } else {
            this.h5_PP_finishLoad_uptime = j;
        }
    }

    public void setH5_PP_FP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("490f72c4", new Object[]{this, new Long(j)});
        } else {
            this.h5_PP_FP = j;
        }
    }

    public void setH5_PP_FSP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1dbebc9", new Object[]{this, new Long(j)});
        } else {
            this.h5_PP_FSP = j;
        }
    }

    public void setH5_PP_FSP_uptime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b532344a", new Object[]{this, new Long(j)});
        } else {
            this.h5_PP_FSP_uptime = j;
        }
    }

    public void setH5_PP_TTI(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8920aee3", new Object[]{this, new Long(j)});
        } else {
            this.h5_PP_TTI = j;
        }
    }

    public void setH5_PP_T1(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c07511", new Object[]{this, new Long(j)});
        } else {
            this.h5_PP_T1 = j;
        }
    }

    public void setH5_PP_T1_uptime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e262a02", new Object[]{this, new Long(j)});
        } else {
            this.h5_PP_T1_uptime = j;
        }
    }

    public void setH5_PP_T2(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa754db0", new Object[]{this, new Long(j)});
        } else {
            this.h5_PP_T2 = j;
        }
    }

    public void setH5_PP_T2_uptime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca93083", new Object[]{this, new Long(j)});
        } else {
            this.h5_PP_T2_uptime = j;
        }
    }

    public void setH5_PP_navigationStart(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6f569e", new Object[]{this, new Long(j)});
            return;
        }
        this.h5_PP_navigationStart = j;
        this.h5_PP_navigationStart_uptime = aex.a(j);
    }

    public void setH5_PP_fetchStart(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("228ab786", new Object[]{this, new Long(j)});
            return;
        }
        this.h5_PP_fetchStart = j;
        this.h5_PP_fetchStart_uptime = aex.a(j);
    }

    public void setH5_PP_responseEnd(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f9fcf72", new Object[]{this, new Long(j)});
            return;
        }
        this.h5_PP_responseEnd = j;
        this.h5_PP_responseEnd_uptime = aex.a(j);
    }

    public void setH5_PP_domContentLoadedEventStart(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4210fa0a", new Object[]{this, new Long(j)});
            return;
        }
        this.h5_PP_domContentLoadedEventStart = j;
        this.h5_PP_domContentLoadedEventStart_uptime = aex.a(j);
    }

    public void setH5_PP_loadEventStart(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69099520", new Object[]{this, new Long(j)});
            return;
        }
        this.h5_PP_loadEventStart = j;
        this.h5_PP_loadEventStart_uptime = aex.a(j);
    }

    public void setH5_PP_loadEventEnd(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6949b987", new Object[]{this, new Long(j)});
            return;
        }
        this.h5_PP_loadEventEnd = j;
        this.h5_PP_loadEventEnd_uptime = aex.a(j);
    }

    public void setH5_PP_requestStart(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("157e14db", new Object[]{this, new Long(j)});
            return;
        }
        this.h5_PP_requestStart = j;
        this.h5_PP_requestStart_uptime = aex.a(j);
    }

    public void setH5_PP_domLoading(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a3256f4", new Object[]{this, new Long(j)});
            return;
        }
        this.h5_PP_domLoading = j;
        this.h5_PP_domLoading_uptime = aex.a(j);
    }

    public void setH5_PP_domComplete(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5ad051", new Object[]{this, new Long(j)});
            return;
        }
        this.h5_PP_domComplete = j;
        this.h5_PP_domComplete_uptime = aex.a(j);
    }

    public void setH5_PP_isFinished(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06e1622", new Object[]{this, new Boolean(z)});
        } else {
            this.h5_PP_isFinished = z;
        }
    }

    public void setH5_PP_errorCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80224417", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.h5_PP_errorCode = str;
        }
    }

    public void setH5_PP_errorMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439ec55f", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.h5_PP_errorMessage = str;
        }
    }

    public void setH5_Core_Type(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed706132", new Object[]{this, new Integer(i)});
        } else {
            this.h5_core_type = i;
        }
    }

    public void setH5_Core_Type_Str(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b70c64d", new Object[]{this, str});
        } else {
            this.h5_core_type_str = str;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    public long getH5_PP_interceptStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("17fa955e", new Object[]{this})).longValue() : this.h5_PP_interceptStart;
    }

    public long getH5_PP_interceptEnd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2bdfe197", new Object[]{this})).longValue() : this.h5_PP_interceptEnd;
    }

    public long getH5_PP_startLoad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f9c2ee0", new Object[]{this})).longValue() : this.h5_PP_startLoad;
    }

    public long getH5_PP_startLoad_uptime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9d80bfd", new Object[]{this})).longValue() : this.h5_PP_startLoad_uptime;
    }

    public long getH5_PP_finishLoad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f5de31b7", new Object[]{this})).longValue() : this.h5_PP_finishLoad;
    }

    public long getH5_PP_finishLoad_uptime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("45cc7946", new Object[]{this})).longValue() : this.h5_PP_finishLoad_uptime;
    }

    public long getH5_PP_FP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e4d888e8", new Object[]{this})).longValue() : this.h5_PP_FP + getH5_PP_navigationStart();
    }

    public long getH5_PP_FP_uptime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d1ebd8f5", new Object[]{this})).longValue() : this.h5_PP_FP + getH5_PP_navigationStart_uptime();
    }

    public long getH5_PP_FSP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd38efdb", new Object[]{this})).longValue() : this.h5_PP_FSP;
    }

    public long getH5_PP_FSP_uptime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("202a4aa2", new Object[]{this})).longValue() : this.h5_PP_FSP_uptime;
    }

    public long getH5_PP_TTI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3226181", new Object[]{this})).longValue();
        }
        long j = this.h5_PP_TTI;
        if (j == 0) {
            return getH5_PP_FSP();
        }
        return j + getH5_PP_navigationStart();
    }

    public long getH5_PP_TTI_uptime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32f2d23c", new Object[]{this})).longValue();
        }
        long j = this.h5_PP_TTI;
        if (j == 0) {
            return getH5_PP_FSP_uptime();
        }
        return j + getH5_PP_navigationStart_uptime();
    }

    public long getH5_PP_T1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fb0788fb", new Object[]{this})).longValue() : this.h5_PP_T1;
    }

    public long getH5_PP_T1_uptime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee932d82", new Object[]{this})).longValue() : this.h5_PP_T1_uptime;
    }

    public long getH5_PP_T2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fb15a07c", new Object[]{this})).longValue() : this.h5_PP_T2;
    }

    public long getH5_PP_T2_uptime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f644d2e1", new Object[]{this})).longValue() : this.h5_PP_T2_uptime;
    }

    public long getH5_PP_navigationStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2cdc6466", new Object[]{this})).longValue() : this.h5_PP_navigationStart;
    }

    public long getH5_PP_navigationStart_uptime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d2bfb3b7", new Object[]{this})).longValue() : this.h5_PP_navigationStart_uptime;
    }

    public long getH5_PP_fetchStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b8566fe6", new Object[]{this})).longValue() : this.h5_PP_fetchStart;
    }

    public long getH5_PP_fetchStart_uptime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e789b837", new Object[]{this})).longValue() : this.h5_PP_fetchStart_uptime;
    }

    public long getH5_PP_responseEnd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8bc92712", new Object[]{this})).longValue() : this.h5_PP_responseEnd;
    }

    public long getH5_PP_responseEnd_uptime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("819ed78b", new Object[]{this})).longValue() : this.h5_PP_responseEnd_uptime;
    }

    public long getH5_PP_domContentLoadedEventStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4bc364e2", new Object[]{this})).longValue() : this.h5_PP_domContentLoadedEventStart;
    }

    public long getH5_PP_domContentLoadedEventStart_uptime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c30a6fbb", new Object[]{this})).longValue() : this.h5_PP_domContentLoadedEventStart_uptime;
    }

    public long getH5_PP_loadEventStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("749edd0c", new Object[]{this})).longValue() : this.h5_PP_loadEventStart;
    }

    public long getH5_PP_loadEventStart_uptime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("95c95451", new Object[]{this})).longValue() : this.h5_PP_loadEventStart_uptime;
    }

    public long getH5_PP_loadEventEnd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2ae3cc5", new Object[]{this})).longValue() : this.h5_PP_loadEventEnd;
    }

    public long getH5_PP_loadEventEnd_uptime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8a3a8278", new Object[]{this})).longValue() : this.h5_PP_loadEventEnd_uptime;
    }

    public boolean getH5_PP_isFinished() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef7ecbea", new Object[]{this})).booleanValue() : this.h5_PP_isFinished;
    }

    public String getH5_PP_errorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3ce45a7", new Object[]{this});
        }
        String str = this.h5_PP_errorCode;
        return str == null ? "" : str;
    }

    public String getH5_PP_errorMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bce594f7", new Object[]{this});
        }
        String str = this.h5_PP_errorMessage;
        return str == null ? "" : str;
    }

    public int getH5_Core_Type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8d57ad8", new Object[]{this})).intValue() : this.h5_core_type;
    }

    public String getH5_Core_Type_Str() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1acff149", new Object[]{this}) : this.h5_core_type_str;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        String str = this.url;
        return str == null ? "" : str;
    }
}
