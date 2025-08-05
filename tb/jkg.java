package tb;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes4.dex */
public class jkg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f29595a;
    private long b = System.currentTimeMillis();
    private int c;
    private Map<String, String> d;

    static {
        kge.a(-1103344764);
    }

    public jkg(View view, AccessibilityEvent accessibilityEvent, Map<String, String> map) {
        this.c = -1;
        this.f29595a = new WeakReference<>(view);
        this.c = accessibilityEvent.getEventType();
        this.d = map;
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        WeakReference<View> weakReference = this.f29595a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }

    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.d;
    }
}
