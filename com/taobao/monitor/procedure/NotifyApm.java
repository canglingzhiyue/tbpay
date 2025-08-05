package com.taobao.monitor.procedure;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class NotifyApm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALGORITHM_CANVAS = 0;
    public static final int ALGORITHM_SHADOW = 2;
    public static final int ALGORITHM_SPECIFIC_VIEW_AREA = 1;
    public static final int NOTIFY_LANDING_PAGE_MISS_HIT = 1;
    public static final int NOTIFY_TRIGGER_PAGE_LOAD_CALCULATE = 2;

    /* renamed from: a  reason: collision with root package name */
    private static volatile NotifyApm f18217a;
    private final Map<Integer, List<a>> b = new ConcurrentHashMap();

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface AlgorithmType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface NotifyType {
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(Map<String, Object> map);
    }

    private NotifyApm() {
    }

    public static NotifyApm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotifyApm) ipChange.ipc$dispatch("ec2730cc", new Object[0]);
        }
        if (f18217a == null) {
            synchronized (NotifyApm.class) {
                if (f18217a == null) {
                    f18217a = new NotifyApm();
                }
            }
        }
        return f18217a;
    }

    public void a(int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834b191c", new Object[]{this, new Integer(i), aVar});
        } else if (aVar == null) {
        } else {
            List<a> list = this.b.get(Integer.valueOf(i));
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.b.put(Integer.valueOf(i), list);
            }
            list.add(aVar);
        }
    }

    public void b(int i, a aVar) {
        List<a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd15bafb", new Object[]{this, new Integer(i), aVar});
        } else if (aVar == null || (list = this.b.get(Integer.valueOf(i))) == null) {
        } else {
            list.remove(aVar);
        }
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("activity", activity);
        List<a> list = this.b.get(1);
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.a(hashMap);
        }
    }

    public void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{this, activity, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page", o.f18229a.a(activity));
        hashMap.put("algorithmType", Integer.valueOf(i));
        List<a> list = this.b.get(2);
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            aVar.a(hashMap);
        }
    }
}
