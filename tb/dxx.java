package tb;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes4.dex */
public class dxx extends dxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int c;
    private int d;
    private final LinkedHashMap<String, Integer> e = new LinkedHashMap<>();
    private final ReadWriteLock f = new ReentrantReadWriteLock();
    private final Handler g = new Handler(Looper.getMainLooper());

    static {
        kge.a(-58009404);
    }

    public static /* synthetic */ int a(dxx dxxVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db781382", new Object[]{dxxVar, new Integer(i)})).intValue();
        }
        dxxVar.c = i;
        return i;
    }

    public static /* synthetic */ ReadWriteLock a(dxx dxxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ReadWriteLock) ipChange.ipc$dispatch("d6d086dc", new Object[]{dxxVar}) : dxxVar.f;
    }

    public static /* synthetic */ int b(dxx dxxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d48f2468", new Object[]{dxxVar})).intValue() : dxxVar.c;
    }

    public static /* synthetic */ int b(dxx dxxVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd55dd21", new Object[]{dxxVar, new Integer(i)})).intValue();
        }
        dxxVar.d = i;
        return i;
    }

    public static /* synthetic */ int c(dxx dxxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c3122ae9", new Object[]{dxxVar})).intValue() : dxxVar.d;
    }

    public static /* synthetic */ LinkedHashMap d(dxx dxxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedHashMap) ipChange.ipc$dispatch("60fc9a93", new Object[]{dxxVar}) : dxxVar.e;
    }

    public dxx() {
        emu.a("com.taobao.android.detail.core.aura.page.scroll.MainAliDetailPageScrollManager");
    }

    @Override // tb.dxw
    public void a(final String str, final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6198cb60", new Object[]{this, str, view});
        } else if (StringUtils.isEmpty(str) || view == null) {
        } else {
            this.g.post(new Runnable() { // from class: tb.dxx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Lock writeLock = dxx.a(dxx.this).writeLock();
                    writeLock.lock();
                    try {
                        int height = view.getHeight();
                        if (dxx.b(dxx.this) - 2 > view.getTop() || dxx.c(dxx.this) + 2 < view.getBottom() || !"guaranteeSectionV3".equals(str)) {
                            dxx.a(dxx.this, view.getTop());
                            dxx.b(dxx.this, view.getBottom());
                        } else {
                            height = 0;
                        }
                        dxx.d(dxx.this).put(str, Integer.valueOf(height));
                    } finally {
                        writeLock.unlock();
                    }
                }
            });
        }
    }

    @Override // tb.dxw
    public int a(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return -1;
        }
        Lock readLock = this.f.readLock();
        readLock.lock();
        try {
            if (!this.e.containsKey(str)) {
                return -1;
            }
            for (Map.Entry<String, Integer> entry : this.e.entrySet()) {
                if (entry.getKey().equals(str)) {
                    break;
                }
                i += entry.getValue().intValue();
            }
            return i;
        } finally {
            readLock.unlock();
        }
    }
}
