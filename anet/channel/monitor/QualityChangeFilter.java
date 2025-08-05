package anet.channel.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class QualityChangeFilter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long filterAddTime;
    private final double DEFAULT_SPEED_THRESHOLD = 40.0d;
    private boolean isNetSpeedSlow = false;
    private boolean shouldCheck = true;

    static {
        kge.a(-1404893293);
    }

    public boolean detectNetSpeedSlow(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("75eecd4d", new Object[]{this, new Double(d)})).booleanValue() : d < 40.0d;
    }

    public int getDelay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e36535c7", new Object[]{this})).intValue();
        }
        return 0;
    }

    public final boolean isNetSpeedSlow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e1f83e20", new Object[]{this})).booleanValue() : this.isNetSpeedSlow;
    }

    public final void setNetSpeedSlow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8abe000", new Object[]{this, new Boolean(z)});
        } else {
            this.isNetSpeedSlow = z;
        }
    }

    public final boolean checkShouldDelay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93d7a9f3", new Object[]{this})).booleanValue();
        }
        if (!this.shouldCheck) {
            return false;
        }
        if (System.currentTimeMillis() - this.filterAddTime <= getDelay() * 1000) {
            return true;
        }
        this.shouldCheck = false;
        return false;
    }
}
