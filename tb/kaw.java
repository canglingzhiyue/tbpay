package tb;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import com.taobao.augecore.data.GroupData;
import com.taobao.augecore.jsbridge.AugeSDKJSBridge;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class kaw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "auge";

    /* renamed from: a  reason: collision with root package name */
    public Context f29925a;
    public HashMap<String, Object> b;
    public String c;
    public Handler d;
    private boolean e;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static kaw f29929a = new kaw();

        public static /* synthetic */ kaw a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (kaw) ipChange.ipc$dispatch("f06c35d", new Object[0]) : f29929a;
        }
    }

    public static /* synthetic */ void a(kaw kawVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b97957", new Object[]{kawVar});
        } else {
            kawVar.f();
        }
    }

    public static kaw a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kaw) ipChange.ipc$dispatch("f06c35d", new Object[0]) : a.a();
    }

    private kaw() {
        this.e = false;
        this.c = "AugeNonUIThread";
        this.d = null;
    }

    public void a(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
            return;
        }
        this.b = hashMap;
        a(context);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        kbd.a(LOG_TAG, "开始初始化,isInitialed == " + this.e);
        if (this.e) {
            return;
        }
        this.e = true;
        this.f29925a = context;
        kax.a(context);
        com.taobao.augecore.remote.a.a(context);
        q.a(AugeSDKJSBridge.NAME, (Class<? extends e>) AugeSDKJSBridge.class);
        d();
        kbc.c();
        e();
        kbd.a(LOG_TAG, "结束初始化，isInitialed == " + this.e);
    }

    public Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ac18683d", new Object[]{this});
        }
        try {
        } catch (Exception e) {
            kbd.a(LOG_TAG, "getHandlerThread == 获取异常：" + e);
        }
        if (this.d != null) {
            return this.d;
        }
        if (this.b != null && this.b.size() > 0 && ((Boolean) this.b.get("isNetWorkInThread")).booleanValue()) {
            HandlerThread handlerThread = new HandlerThread(this.c);
            handlerThread.start();
            this.d = new Handler(handlerThread.getLooper());
        }
        return this.d;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        List<GroupData> b = kax.b(kbb.GROUP_DATA);
        if (!kay.a().b()) {
            kbd.a(LOG_TAG, "prepareData，本地数据为空，并且过期，请求接口");
            if (StringUtils.isEmpty(kbc.a(a().f29925a))) {
                return;
            }
            f();
            return;
        }
        kay.a().b(b);
        kbd.a(LOG_TAG, "prepareData，本地数据为： " + b.toString());
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            c.a(new a.b() { // from class: tb.kaw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                    } else if (i != 1 && i != 2) {
                    } else {
                        kbd.a(kaw.LOG_TAG, "前后台切换");
                        if (kay.a().b()) {
                            return;
                        }
                        kbd.a(kaw.LOG_TAG, "前后台切换,本地数据过期，重新拉取数据");
                        kaw.a(kaw.this);
                    }
                }
            });
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        final int a2 = kbc.a(kbc.b());
        kbd.a(LOG_TAG, "delayRequestRandom === 获取到的打散时间=" + a2 + "s");
        Coordinator.postTask(new Coordinator.TaggedRunnable(LOG_TAG) { // from class: tb.kaw.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                kbd.a(kaw.LOG_TAG, "delayRequestRandom === 延迟：" + a2 + "s，请求网络数据");
                kbb.a().a(new kba() { // from class: tb.kaw.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.kba
                    public void a(List<GroupData> list, String str) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
                        } else {
                            kay.a().a(list);
                        }
                    }
                });
            }
        }, a2 * 1000);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        kbd.f29946a = true;
        kbd.a(LOG_TAG, "turnOnDebug，打开debug模式");
    }

    public boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue() : kay.a().a(str, str2, str3);
    }

    public List<String> a(String str, List<String> list, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1f4ad67a", new Object[]{this, str, list, str2}) : kay.a().a(str, list, str2);
    }
}
