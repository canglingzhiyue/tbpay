package android.taobao.windvane.export.prerender;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0014J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Landroid/taobao/windvane/export/prerender/TMSPrerenderModel;", "Ljava/io/Serializable;", "()V", "autoStart", "", "getAutoStart", "()Z", "setAutoStart", "(Z)V", "enable", "getEnable", "setEnable", "shuffleTime", "", "getShuffleTime", "()I", "setShuffleTime", "(I)V", "tasks", "", "Landroid/taobao/windvane/export/prerender/TMSPrerenderTaskModel;", "getTasks", "()Ljava/util/List;", "setTasks", "(Ljava/util/List;)V", "isMatchCondition", "taskModel", "parseDate", "", "date", "", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class TMSPrerenderModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean autoStart;
    private boolean enable;
    private int shuffleTime = Constants.MAX_VALID_TIME_FOR_REGISTRATION_REQUEST;
    private List<TMSPrerenderTaskModel> tasks = new ArrayList();

    static {
        kge.a(1835030685);
        kge.a(1028243835);
    }

    public final boolean getEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f06e884", new Object[]{this})).booleanValue() : this.enable;
    }

    public final void setEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else {
            this.enable = z;
        }
    }

    public final int getShuffleTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7fc71caa", new Object[]{this})).intValue() : this.shuffleTime;
    }

    public final void setShuffleTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d198238", new Object[]{this, new Integer(i)});
        } else {
            this.shuffleTime = i;
        }
    }

    public final List<TMSPrerenderTaskModel> getTasks() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("db64ee08", new Object[]{this}) : this.tasks;
    }

    public final void setTasks(List<TMSPrerenderTaskModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5bf41c4", new Object[]{this, list});
            return;
        }
        q.d(list, "<set-?>");
        this.tasks = list;
    }

    public final boolean getAutoStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fd243b48", new Object[]{this})).booleanValue() : this.autoStart;
    }

    public final void setAutoStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5a481c", new Object[]{this, new Boolean(z)});
        } else {
            this.autoStart = z;
        }
    }

    public final boolean isMatchCondition(TMSPrerenderTaskModel taskModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbde78c2", new Object[]{this, taskModel})).booleanValue();
        }
        q.d(taskModel, "taskModel");
        if (!((taskModel.getStartTime() == null || taskModel.getEndTime() == null || taskModel.getUrl() == null || taskModel.getSpmBVerifyValue() == null || taskModel.getDelayNextTime() == null) ? false : true)) {
            return false;
        }
        try {
            String startTime = taskModel.getStartTime();
            q.a((Object) startTime);
            long parseDate = parseDate(startTime);
            String endTime = taskModel.getEndTime();
            q.a((Object) endTime);
            long parseDate2 = parseDate(endTime);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < parseDate || currentTimeMillis > parseDate2) {
                com.taobao.android.riverlogger.e.a(RVLLevel.Error, "Themis/Performance/Prerender").a("timeNotMatch").a("url", (Object) taskModel.getUrl()).a();
                return false;
            } else if (this.shuffleTime < 0) {
                return false;
            } else {
                long j = currentTimeMillis - parseDate;
                if (j < this.shuffleTime && new Random().nextInt(this.shuffleTime + 1) > j) {
                    com.taobao.android.riverlogger.e.a(RVLLevel.Error, "Themis/Performance/Prerender").a("由于打散逻辑，导致本次未创建成功").a("url", (Object) taskModel.getUrl()).a();
                    return false;
                }
                List<String> spmBVerifyValue = taskModel.getSpmBVerifyValue();
                q.a(spmBVerifyValue);
                return !spmBVerifyValue.isEmpty();
            }
        } catch (Exception e) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, "Themis/Performance/Prerender").a("executionFailed").a("msg", (Object) e.getMessage()).a();
            return false;
        }
    }

    private final long parseDate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78e300c6", new Object[]{this, str})).longValue();
        }
        Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).parse(str);
        if (parse == null) {
            return 0L;
        }
        return parse.getTime();
    }
}
