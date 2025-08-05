package anet.channel.statist;

import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "strategy_stat")
/* loaded from: classes.dex */
public class StrategyStatObject extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public StringBuilder errorTrace;
    @Dimension
    public int isFileExists;
    @Dimension
    public int isReadObjectSucceed;
    @Dimension
    public int isRenameSucceed;
    @Dimension
    public int isSucceed;
    @Dimension
    public int isTempWriteSucceed;
    @Measure
    public long readCostTime;
    @Dimension
    public String readStrategyFileId;
    @Dimension
    public String readStrategyFilePath;
    @Dimension
    public int type;
    @Measure
    public long writeCostTime;
    @Dimension
    public String writeStrategyFileId;
    @Dimension
    public String writeStrategyFilePath;
    @Dimension
    public String writeTempFilePath;

    static {
        kge.a(-1320894082);
    }

    public StrategyStatObject(int i) {
        this.type = -1;
        this.type = i;
    }

    public void appendErrorTrace(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62fc26cd", new Object[]{this, str, th});
            return;
        }
        String message = th.getMessage();
        if (this.errorTrace == null) {
            this.errorTrace = new StringBuilder();
        }
        StringBuilder sb = this.errorTrace;
        sb.append('[');
        sb.append(str);
        sb.append(']');
        sb.append(str);
        sb.append(' ');
        sb.append(message);
        sb.append('\n');
    }

    @Override // anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue() : GlobalAppRuntimeInfo.isTargetProcess();
    }
}
