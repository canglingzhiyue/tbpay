package anet.channel.statist;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "fragmentationParent")
/* loaded from: classes2.dex */
public class FragmentParentStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public boolean haveRange;
    @Dimension
    public String host;
    @Dimension
    public int sessionType;
    @Dimension
    public String url;
    @Dimension
    public int userPathType;
    @Dimension
    public int ret = 1;
    @Dimension
    public boolean multipathPlaned = false;
    @Dimension
    public boolean multipathActual = false;
    @Dimension
    public int priorityLevel = -1;
    @Dimension
    public String scene = null;
    @Measure
    public long fileSize = 0;
    @Measure
    public long transportSize = 0;
    @Measure
    public long fragmentCount = 0;
    @Measure
    public long multipathPlanedCount = 0;
    @Measure
    public long multipathActualCount = 0;
    @Measure
    public long failFragmentCount = 0;
    @Measure
    public long successFragmentCount = 0;
    @Measure
    public long cancelFragmentCount = 0;
    @Measure
    public long totalTime = 0;

    static {
        kge.a(-1038153890);
    }

    public void setBaseInfo(String str, String str2, int i, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b370e97", new Object[]{this, str, str2, new Integer(i), new Long(j), new Boolean(z)});
            return;
        }
        this.host = str;
        this.url = str2;
        this.userPathType = i;
        this.fileSize = j;
        this.haveRange = z;
        this.multipathPlaned = false;
        this.multipathActual = false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("[FragmentParentStatistic]ret=");
        sb.append(this.ret);
        sb.append(",host=");
        sb.append(this.host);
        sb.append(",multipathPlaned=");
        sb.append(this.multipathPlaned);
        sb.append(",multipathActual=");
        sb.append(this.multipathActual);
        sb.append(",haveRange=");
        sb.append(this.haveRange);
        sb.append(",fileSize=");
        sb.append(this.fileSize);
        sb.append(",fragmentCount=");
        sb.append(this.fragmentCount);
        sb.append(",failFragmentCount=");
        sb.append(this.failFragmentCount);
        sb.append(",successFragmentCount=");
        sb.append(this.successFragmentCount);
        sb.append(",cancelFragmentCount=");
        sb.append(this.cancelFragmentCount);
        sb.append(",totalTime=");
        sb.append(this.totalTime);
        sb.append(",url=");
        sb.append(this.url);
        return sb.toString();
    }
}
