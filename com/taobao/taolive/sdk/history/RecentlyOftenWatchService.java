package com.taobao.taolive.sdk.history;

import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.m;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.mfi;

/* loaded from: classes8.dex */
public class RecentlyOftenWatchService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private static RecentlyOftenWatchService f21833a;
    private Data b = null;
    private String c = Login.getUserId();

    /* loaded from: classes8.dex */
    public static class Data implements Serializable {
        public List<DayItem> data;

        static {
            kge.a(1296334030);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes8.dex */
    public static class DayItem implements Serializable {
        public Map<String, Long> day;
        public Long timestamp;

        static {
            kge.a(-1254820565);
            kge.a(1028243835);
        }
    }

    public static /* synthetic */ Data a(RecentlyOftenWatchService recentlyOftenWatchService, Data data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("e3414fff", new Object[]{recentlyOftenWatchService, data});
        }
        recentlyOftenWatchService.b = data;
        return data;
    }

    static {
        kge.a(964421920);
        TAG = RecentlyOftenWatchService.class.getSimpleName();
    }

    public static RecentlyOftenWatchService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecentlyOftenWatchService) ipChange.ipc$dispatch("16e4cc7d", new Object[0]);
        }
        if (f21833a == null) {
            f21833a = new RecentlyOftenWatchService();
        }
        return f21833a;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a aVar = new a();
        aVar.f21835a = new a.InterfaceC0906a() { // from class: com.taobao.taolive.sdk.history.RecentlyOftenWatchService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.history.RecentlyOftenWatchService.a.InterfaceC0906a
            public void a(Data data) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("23ae4d0b", new Object[]{this, data});
                } else {
                    RecentlyOftenWatchService.a(RecentlyOftenWatchService.this, data);
                }
            }
        };
        aVar.execute(this.c);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            new b().execute(this.b, this.c);
        }
    }

    /* loaded from: classes8.dex */
    public static class b extends AsyncTask<Object, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1230408039);
        }

        private b() {
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
        }

        public Void a(Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("f8783014", new Object[]{this, objArr});
            }
            if (objArr.length < 2) {
                return null;
            }
            try {
                Object obj = objArr[0];
                Object obj2 = objArr[1];
                String jSONString = JSON.toJSONString(obj);
                if (l.e(jSONString)) {
                    return null;
                }
                mfi.a("live_recently_often_watch" + obj2, jSONString);
                return null;
            } catch (Throwable th) {
                m.a(RecentlyOftenWatchService.TAG, "AsyncSaveJsonStrTask doInBackground exp.", th);
                return null;
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends AsyncTask<Object, Void, Data> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public InterfaceC0906a f21835a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.taobao.taolive.sdk.history.RecentlyOftenWatchService$a$a  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public interface InterfaceC0906a {
            void a(Data data);
        }

        static {
            kge.a(235333117);
        }

        private a() {
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.taolive.sdk.history.RecentlyOftenWatchService$Data] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Data doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Data data) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, data});
            } else {
                a(data);
            }
        }

        public Data a(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Data) ipChange.ipc$dispatch("50313eac", new Object[]{this, objArr});
            }
            if (objArr.length > 0) {
                try {
                    Object obj = objArr[0];
                    String str = (String) mfi.a("live_recently_often_watch" + obj);
                    if (l.e(str)) {
                        return null;
                    }
                    return (Data) JSON.parseObject(str, Data.class);
                } catch (Exception e) {
                    m.a(RecentlyOftenWatchService.TAG, "AsyncReadDataTask doInBackground exp.", e);
                }
            }
            return null;
        }

        public void a(Data data) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23ae4d0b", new Object[]{this, data});
                return;
            }
            InterfaceC0906a interfaceC0906a = this.f21835a;
            if (interfaceC0906a == null) {
                return;
            }
            interfaceC0906a.a(data);
        }
    }
}
