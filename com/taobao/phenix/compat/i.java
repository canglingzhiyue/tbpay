package com.taobao.phenix.compat;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import tb.riy;

/* loaded from: classes.dex */
public class i implements com.taobao.rxm.schedule.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Coordinator.CoordThreadPoolExecutor f18903a;

    @Override // com.taobao.rxm.schedule.j
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.rxm.schedule.j
    public void a(com.taobao.rxm.schedule.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5e8cf", new Object[]{this, gVar});
        } else {
            this.f18903a.execute(gVar, 27);
        }
    }

    @Override // com.taobao.rxm.schedule.j
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return "TBScheduler4Phenix[queue=" + c() + ",active=" + this.f18903a.getActiveCount() + ",pool=" + this.f18903a.getPoolSize() + ",largest=" + this.f18903a.getLargestPoolSize() + ",tasks=" + this.f18903a.getTaskCount() + ",completes=" + this.f18903a.getCompletedTaskCount() + riy.ARRAY_END_STR;
    }

    @Override // com.taobao.rxm.schedule.j
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f18903a.getQueue().size();
    }

    public static void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{new Boolean(z), new Boolean(z2)});
        } else {
            a(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(boolean r17) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.phenix.compat.i.a(boolean):void");
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23 && !Process.is64Bit()) {
            return true;
        }
        return (TextUtils.equals(Build.BRAND, "HUAWEI") || TextUtils.equals(Build.BRAND, "HONOR")) && Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT <= 27;
    }
}
