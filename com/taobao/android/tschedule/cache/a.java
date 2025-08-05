package com.taobao.android.tschedule.cache;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.task.ScheduleTask;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final a f15658a;
    private volatile C0606a b = null;

    static {
        kge.a(2142657346);
        f15658a = new a();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("31ce32a0", new Object[0]) : f15658a;
    }

    public C0606a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0606a) ipChange.ipc$dispatch("bd251139", new Object[]{this, str});
        }
        C0606a c0606a = this.b;
        if (c0606a != null && str != null && TextUtils.equals(str, c0606a.f15659a)) {
            return c0606a;
        }
        return null;
    }

    public void a(String str, List<ScheduleTask> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
            return;
        }
        C0606a c0606a = new C0606a();
        c0606a.f15659a = str;
        c0606a.b = list;
        this.b = c0606a;
    }

    /* renamed from: com.taobao.android.tschedule.cache.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0606a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f15659a;
        public List<ScheduleTask> b;

        static {
            kge.a(921135022);
        }

        public List<ScheduleTask> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.b;
        }
    }
}
