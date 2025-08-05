package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public abstract class kee implements kef {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f30005a = false;

    static {
        kge.a(1035398876);
        kge.a(941147798);
    }

    @Override // tb.kef
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.f30005a) {
            return false;
        }
        SharedPreferences a2 = kel.a();
        if (a2 == null) {
            kej.a("BaseStabilityService", "isNeedUploadOccupiedState sp null ");
            return false;
        }
        return a2.getBoolean("occupiedNeedUpload", false);
    }

    @Override // tb.kef
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f30005a = false;
        SharedPreferences a2 = kel.a();
        if (a2 == null) {
            kej.a("BaseStabilityService", "resetUploadOccupiedState sp null ");
        } else {
            a2.edit().putBoolean("occupiedNeedUpload", false).apply();
        }
    }

    public boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue();
        }
        long j2 = 30;
        SharedPreferences a2 = kel.a();
        if (a2 != null) {
            j2 = a2.getInt(kel.FREEZETIME, 30);
        }
        return j2 != -1 && System.currentTimeMillis() - j < (j2 * 60) * 1000;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f30005a = true;
        SharedPreferences a2 = kel.a();
        if (a2 == null) {
            return;
        }
        a2.edit().putBoolean("occupiedNeedUpload", true).apply();
    }
}
