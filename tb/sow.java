package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class sow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static float f33783a;
    public static float b;
    public static float c;
    public int e;
    public int f;
    public int g;
    public String h;
    public long d = 0;
    public boolean i = false;

    static {
        kge.a(1167777330);
        f33783a = 6.0f;
        b = 3.0f;
        c = 1.0f;
    }

    public void a(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fb0d31", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.e = i;
        this.f = i2;
        this.g = i3;
        if (TextUtils.equals(str, this.h)) {
            if (i2 - i <= oeb.a("ShortVideo.totalHealthyValue", 2000)) {
                this.i = true;
            }
        } else {
            this.i = false;
        }
        this.h = str;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.g > 95) {
            return true;
        }
        return (this.i && oeb.a("ShortVideo.totalHealthy", true) && sij.a() != 1) || ((float) d()) >= f33783a * 1000.0f;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!a() || ((float) (SystemClock.elapsedRealtime() - this.d)) <= c * 1000.0f) {
            return false;
        }
        this.d = SystemClock.elapsedRealtime();
        return true;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.g > 95) {
            return false;
        }
        return (!this.i || !oeb.a("ShortVideo.totalHealthy", true) || sij.a() == 1) && ((float) d()) <= b * 1000.0f;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : ((int) ((this.g / 100.0f) * this.f)) - this.e;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreLoadHealthy{currentPosition=" + this.e + ", total=" + this.f + ", bufferPercent=" + this.g + '}';
    }
}
