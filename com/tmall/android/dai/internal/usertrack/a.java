package com.tmall.android.dai.internal.usertrack;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.dataservice.DataServiceImpl;
import java.util.ArrayList;
import java.util.Set;
import tb.kge;
import tb.rkq;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UserTrackDOCacheService";

    /* renamed from: a  reason: collision with root package name */
    private static a f23704a;

    static {
        kge.a(1499359957);
    }

    private a() {
    }

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d12c82c5", new Object[0]);
            }
            if (f23704a == null) {
                f23704a = new a();
            }
            return f23704a;
        }
    }

    public void a(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa89db5", new Object[]{this, userTrackDO});
            return;
        }
        rkq.d().a(userTrackDO);
        b(userTrackDO);
    }

    private void b(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705e6a76", new Object[]{this, userTrackDO});
            return;
        }
        try {
            Set<Integer> j = rkq.d().j();
            new ArrayList();
            if (j.contains(Integer.valueOf(userTrackDO.getEventId()))) {
                return;
            }
            if (userTrackDO.getEventId() == 2201 && !rkq.d().a(userTrackDO.getArg1())) {
                return;
            }
            DataServiceImpl.getInstance().saveData("dai_native_walle_ut_behavior", "test", "usertrack", userTrackDO.toHashMapValues());
        } catch (Exception unused) {
        }
    }
}
