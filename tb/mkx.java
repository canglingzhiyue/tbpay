package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.c;

/* loaded from: classes7.dex */
public class mkx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f31080a;
    private final String b;
    private final long c;

    public mkx(String str, String str2, long j) {
        this.f31080a = str;
        this.b = str2;
        this.c = j;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f31080a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.c;
    }

    public boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
        }
        return !TextUtils.isEmpty(this.f31080a) && this.f31080a.contains("Slide") && (((double) this.c) * 1.0d) / ((double) j) < ((double) (((float) c.a(c.CONFIG_OPERATION_SCROLL_JUDGE_RATE, 70L)) / 100.0f));
    }
}
