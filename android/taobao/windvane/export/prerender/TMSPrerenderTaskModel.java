package android.taobao.windvane.export.prerender;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Landroid/taobao/windvane/export/prerender/TMSPrerenderTaskModel;", "Ljava/io/Serializable;", "()V", "delayNextTime", "", "getDelayNextTime", "()Ljava/lang/Long;", "setDelayNextTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "endTime", "", "getEndTime", "()Ljava/lang/String;", "setEndTime", "(Ljava/lang/String;)V", "prerenderType", "", "getPrerenderType", "()I", "setPrerenderType", "(I)V", "spmBVerifyValue", "", "getSpmBVerifyValue", "()Ljava/util/List;", "setSpmBVerifyValue", "(Ljava/util/List;)V", "startTime", "getStartTime", "setStartTime", "url", "getUrl", "setUrl", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class TMSPrerenderTaskModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Long delayNextTime;
    private String endTime;
    private int prerenderType = 1;
    private List<String> spmBVerifyValue;
    private String startTime;
    private String url;

    static {
        kge.a(534840344);
        kge.a(1028243835);
    }

    public final String getStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7fef9d00", new Object[]{this}) : this.startTime;
    }

    public final void setStartTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41bede", new Object[]{this, str});
        } else {
            this.startTime = str;
        }
    }

    public final String getEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5b56827", new Object[]{this}) : this.endTime;
    }

    public final void setEndTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fb2597", new Object[]{this, str});
        } else {
            this.endTime = str;
        }
    }

    public final String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.url;
    }

    public final void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    public final List<String> getSpmBVerifyValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("65d4be90", new Object[]{this}) : this.spmBVerifyValue;
    }

    public final void setSpmBVerifyValue(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5c813c", new Object[]{this, list});
        } else {
            this.spmBVerifyValue = list;
        }
    }

    public final Long getDelayNextTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("5758c941", new Object[]{this}) : this.delayNextTime;
    }

    public final void setDelayNextTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f87e1207", new Object[]{this, l});
        } else {
            this.delayNextTime = l;
        }
    }

    public final int getPrerenderType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed16f717", new Object[]{this})).intValue() : this.prerenderType;
    }

    public final void setPrerenderType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cf3e26b", new Object[]{this, new Integer(i)});
        } else {
            this.prerenderType = i;
        }
    }
}
