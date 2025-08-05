package com.taobao.monitor.impl.trace;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.common.BundleMap;
import com.taobao.monitor.impl.common.f;
import java.util.Map;
import tb.mpi;

/* loaded from: classes.dex */
public class b extends com.taobao.monitor.impl.trace.a<a> implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public interface a {
        void a(Activity activity, long j);

        void a(Activity activity, Map<String, Object> map, long j);

        void b(Activity activity, long j);

        void c(Activity activity, long j);

        void d(Activity activity, long j);

        void e(Activity activity, long j);
    }

    public b() {
        com.taobao.monitor.impl.common.f.a().a(this);
    }

    public void a(Activity activity, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf57d99", new Object[]{this, activity, map, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 130;
        obtain.obj = activity;
        Bundle b = com.taobao.monitor.impl.common.f.a().b();
        b.putSerializable("params", new BundleMap(map));
        b.putLong("time", j);
        obtain.setData(b);
        com.taobao.monitor.impl.common.f.a().a(obtain);
    }

    public void a(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb084a", new Object[]{this, activity, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 131;
        obtain.obj = activity;
        Bundle b = com.taobao.monitor.impl.common.f.a().b();
        b.putLong("time", j);
        obtain.setData(b);
        com.taobao.monitor.impl.common.f.a().a(obtain);
    }

    public void b(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8c0fa9", new Object[]{this, activity, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 132;
        obtain.obj = activity;
        Bundle b = com.taobao.monitor.impl.common.f.a().b();
        b.putLong("time", j);
        obtain.setData(b);
        com.taobao.monitor.impl.common.f.a().a(obtain);
    }

    public void c(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5d1708", new Object[]{this, activity, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 133;
        obtain.obj = activity;
        Bundle b = com.taobao.monitor.impl.common.f.a().b();
        b.putLong("time", j);
        obtain.setData(b);
        com.taobao.monitor.impl.common.f.a().a(obtain);
    }

    public void d(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2e1e67", new Object[]{this, activity, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 134;
        obtain.obj = activity;
        Bundle b = com.taobao.monitor.impl.common.f.a().b();
        b.putLong("time", j);
        obtain.setData(b);
        com.taobao.monitor.impl.common.f.a().a(obtain);
    }

    public void e(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dff25c6", new Object[]{this, activity, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 135;
        obtain.obj = activity;
        Bundle b = com.taobao.monitor.impl.common.f.a().b();
        b.putLong("time", j);
        obtain.setData(b);
        com.taobao.monitor.impl.common.f.a().a(obtain);
    }

    @Override // com.taobao.monitor.impl.common.f.a
    public int[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this}) : new int[]{130, 131, 132, 133, 134, 135};
    }

    @Override // com.taobao.monitor.impl.common.f.a
    public void a(int i, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ae696e", new Object[]{this, new Integer(i), message});
            return;
        }
        try {
            Bundle data = message.getData();
            switch (i) {
                case 130:
                    for (LISTENER listener : this.f18168a) {
                        listener.a((Activity) message.obj, ((BundleMap) data.getSerializable("params")).getData(), data.getLong("time"));
                    }
                    return;
                case 131:
                    for (LISTENER listener2 : this.f18168a) {
                        listener2.a((Activity) message.obj, data.getLong("time"));
                    }
                    return;
                case 132:
                    for (LISTENER listener3 : this.f18168a) {
                        listener3.b((Activity) message.obj, data.getLong("time"));
                    }
                    return;
                case 133:
                    for (LISTENER listener4 : this.f18168a) {
                        listener4.c((Activity) message.obj, data.getLong("time"));
                    }
                    return;
                case 134:
                    for (LISTENER listener5 : this.f18168a) {
                        listener5.d((Activity) message.obj, data.getLong("time"));
                    }
                    return;
                case 135:
                    for (LISTENER listener6 : this.f18168a) {
                        listener6.e((Activity) message.obj, data.getLong("time"));
                    }
                    return;
                default:
                    return;
            }
        } catch (Exception e) {
            mpi.c("ActivityLifeCycleDispatcher", e);
        }
    }
}
