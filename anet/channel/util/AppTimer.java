package anet.channel.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class AppTimer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String name;
    private double startTime = mto.a.GEO_NOT_SUPPORT;
    private double endTime = mto.a.GEO_NOT_SUPPORT;
    private double sumTime = mto.a.GEO_NOT_SUPPORT;

    static {
        kge.a(-1018877710);
    }

    public AppTimer(String str) {
        this.name = str;
    }

    public synchronized void start(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f662bfb", new Object[]{this, new Long(j)});
        } else {
            this.startTime = j;
        }
    }

    public double getTimes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("295ea05", new Object[]{this})).doubleValue() : this.sumTime;
    }

    public synchronized void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.startTime = mto.a.GEO_NOT_SUPPORT;
        this.endTime = mto.a.GEO_NOT_SUPPORT;
    }

    public synchronized void stop(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e542c5b", new Object[]{this, new Long(j)});
            return;
        }
        this.endTime = j;
        if (this.startTime > mto.a.GEO_NOT_SUPPORT && this.endTime > this.startTime) {
            this.sumTime += (this.endTime - this.startTime) / 60000.0d;
        }
    }
}
