package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.official.heartbeat.OfficialHeartbeatResponse;
import com.taobao.taolive.sdk.business.official.subscribe.OfficialSubscribeResponse;
import com.taobao.taolive.sdk.model.official.OfficialHeartbeatDO;
import com.taobao.taolive.sdk.utils.u;
import tb.ppp;

/* loaded from: classes8.dex */
public class pow extends HandlerThread implements d, ppp.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile pow b;

    /* renamed from: a  reason: collision with root package name */
    private long f32790a;
    private final a c;
    private String d;
    private String e;
    private String f;
    private String g;

    static {
        kge.a(133619069);
        kge.a(-797454141);
        kge.a(-1010935401);
    }

    public static /* synthetic */ Object ipc$super(pow powVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    public static /* synthetic */ long a(pow powVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa06fd74", new Object[]{powVar})).longValue() : powVar.f32790a;
    }

    public static /* synthetic */ long a(pow powVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46d92938", new Object[]{powVar, new Long(j)})).longValue();
        }
        powVar.f32790a = j;
        return j;
    }

    public static /* synthetic */ boolean b(pow powVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e88a0405", new Object[]{powVar})).booleanValue() : powVar.g();
    }

    public static /* synthetic */ String c(pow powVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("52b6fe5e", new Object[]{powVar}) : powVar.d;
    }

    public static /* synthetic */ String d(pow powVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5363a9fd", new Object[]{powVar}) : powVar.e;
    }

    public static /* synthetic */ String e(pow powVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5410559c", new Object[]{powVar}) : powVar.f;
    }

    public static /* synthetic */ String f(pow powVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54bd013b", new Object[]{powVar}) : powVar.g;
    }

    private pow() {
        super("com.taobao.taolive.official.subscriber");
        this.f32790a = 15000L;
        start();
        this.c = new a(getLooper());
    }

    public static pow c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pow) ipChange.ipc$dispatch("1e6c8884", new Object[0]);
        }
        if (b == null) {
            synchronized (pow.class) {
                if (b == null) {
                    b = new pow();
                }
            }
        }
        return b;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            pmd.a().u().a(this);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            pmd.a().u().b(this);
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else if (!u.aQ()) {
        } else {
            e();
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            if (g()) {
                return;
            }
            new com.taobao.taolive.sdk.business.official.subscribe.a(this).a(str, str2, str3, str4);
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.g);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!u.aQ()) {
        } else {
            f();
            i();
            if (g()) {
                return;
            }
            new com.taobao.taolive.sdk.business.official.unsubscribe.a(this).a(this.d, this.e, this.f, this.g);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (!(netBaseOutDo instanceof OfficialSubscribeResponse)) {
        } else {
            OfficialSubscribeResponse officialSubscribeResponse = (OfficialSubscribeResponse) netBaseOutDo;
            if (officialSubscribeResponse.mo1437getData() != null && officialSubscribeResponse.mo1437getData().getHeartBeatConfig() != null) {
                this.f32790a = officialSubscribeResponse.mo1437getData().getHeartBeatConfig().getInterval();
            }
            h();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.removeCallbacksAndMessages(null);
        this.c.sendEmptyMessage(1);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.removeCallbacksAndMessages(null);
    }

    @Override // tb.ppp.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            i();
        }
    }

    @Override // tb.ppp.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            h();
        }
    }

    /* loaded from: classes8.dex */
    public class a extends Handler implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(614292936);
            kge.a(-797454141);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.taobao.taolive.sdk.adapter.network.d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        @Override // com.taobao.taolive.sdk.adapter.network.d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            a();
            sendEmptyMessageDelayed(1, pow.a(pow.this));
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (pow.b(pow.this)) {
            } else {
                new com.taobao.taolive.sdk.business.official.heartbeat.a(this).a(pow.c(pow.this), pow.d(pow.this), pow.e(pow.this), pow.f(pow.this));
            }
        }

        @Override // com.taobao.taolive.sdk.adapter.network.d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            OfficialHeartbeatDO mo1437getData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (!(netBaseOutDo instanceof OfficialHeartbeatResponse) || (mo1437getData = ((OfficialHeartbeatResponse) netBaseOutDo).mo1437getData()) == null || mo1437getData.getHeartBeatConfig() == null) {
            } else {
                pow.a(pow.this, mo1437getData.getHeartBeatConfig().getInterval());
            }
        }
    }
}
