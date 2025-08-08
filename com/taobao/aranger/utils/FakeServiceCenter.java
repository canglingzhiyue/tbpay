package com.taobao.aranger.utils;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kak;
import tb.kge;

/* loaded from: classes6.dex */
public class FakeServiceCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile FakeServiceCenter f16369a;
    private final Map<String, FakeService> b = new ConcurrentHashMap();

    static {
        kge.a(747551467);
        f16369a = null;
    }

    private FakeServiceCenter() {
    }

    public static FakeServiceCenter a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FakeServiceCenter) ipChange.ipc$dispatch("39f6792", new Object[0]);
        }
        if (f16369a == null) {
            synchronized (FakeServiceCenter.class) {
                if (f16369a == null) {
                    f16369a = new FakeServiceCenter();
                }
            }
        }
        return f16369a;
    }

    public Collection<FakeService> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("846747e", new Object[]{this}) : this.b.values();
    }

    public void a(String str, FakeService fakeService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f45b913a", new Object[]{this, str, fakeService});
        } else {
            this.b.put(str, fakeService);
        }
    }

    public FakeService a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FakeService) ipChange.ipc$dispatch("5f6226ac", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        for (FakeService fakeService : this.b.values()) {
            if (str.equals(fakeService.c())) {
                return fakeService;
            }
        }
        return null;
    }

    public FakeService b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FakeService) ipChange.ipc$dispatch("7863784b", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.b.get(str);
        }
        return null;
    }

    public FakeService c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FakeService) ipChange.ipc$dispatch("9164c9ea", new Object[]{this, str});
        }
        if (str != null) {
            return this.b.remove(str);
        }
        return null;
    }

    /* loaded from: classes6.dex */
    public static class FakeService extends Service {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f16370a;
        private Service b;
        private final AtomicInteger c = new AtomicInteger();
        private final HashMap<Integer, List<Intent.FilterComparison>> d = new HashMap<>();
        private final HashMap<Intent.FilterComparison, IBinder> e = new HashMap<>();

        static {
            kge.a(366225735);
        }

        public FakeService(String str, Service service) {
            this.f16370a = str;
            this.b = service;
        }

        public Service a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Service) ipChange.ipc$dispatch("425fe972", new Object[]{this}) : this.b;
        }

        public Pair<Boolean, Boolean> a(int i, Intent intent) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("2697c6a2", new Object[]{this, new Integer(i), intent});
            }
            List<Intent.FilterComparison> list = this.d.get(Integer.valueOf(i));
            boolean z2 = list != null;
            Intent.FilterComparison filterComparison = new Intent.FilterComparison(intent);
            Iterator<List<Intent.FilterComparison>> it = this.d.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().contains(filterComparison)) {
                    break;
                }
            }
            if (list == null) {
                list = new ArrayList<>();
                this.d.put(Integer.valueOf(i), list);
            }
            if (!list.contains(filterComparison)) {
                list.add(filterComparison);
            }
            return Pair.create(Boolean.valueOf(z), Boolean.valueOf(z2));
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            List<Intent.FilterComparison> remove = this.d.remove(Integer.valueOf(i));
            if (remove == null || remove.isEmpty()) {
                return;
            }
            if (!this.d.isEmpty()) {
                for (List<Intent.FilterComparison> list : this.d.values()) {
                    remove.removeAll(list);
                }
            }
            for (Intent.FilterComparison filterComparison : remove) {
                onUnbind(filterComparison.getIntent());
            }
        }

        public IBinder a(Intent intent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IBinder) ipChange.ipc$dispatch("1093fb78", new Object[]{this, intent}) : this.e.get(new Intent.FilterComparison(intent));
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f16370a;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
            }
            Service service = this.b;
            return service == null ? "" : service.getClass().getName();
        }

        @Override // android.app.Service
        public void onCreate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
                return;
            }
            kak.b("FakeServiceCenter", "invoke Service.onCreate()", "service", this.b, "timeStamp", this.f16370a);
            this.b.onCreate();
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
            }
            kak.b("FakeServiceCenter", "Service.onBind()", "bindingCnt", Integer.valueOf(this.c.incrementAndGet()));
            IBinder onBind = this.b.onBind(intent);
            this.e.put(new Intent.FilterComparison(intent), onBind);
            return onBind;
        }

        @Override // android.app.Service
        public boolean onUnbind(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
            }
            kak.b("FakeServiceCenter", "Service.onUnbind()", "bindingCnt", Integer.valueOf(this.c.decrementAndGet()));
            return this.b.onUnbind(intent);
        }

        @Override // android.app.Service
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            kak.b("FakeServiceCenter", "Service.onDestroy()", new Object[0]);
            this.b.onDestroy();
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.c.get() == 0;
        }

        @Override // android.app.Service, android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            } else {
                this.b.onTrimMemory(i);
            }
        }

        @Override // android.app.Service, android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            } else {
                this.b.onConfigurationChanged(configuration);
            }
        }

        @Override // android.app.Service, android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            } else {
                this.b.onLowMemory();
            }
        }
    }
}
