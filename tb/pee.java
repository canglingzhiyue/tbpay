package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.message_sdk.core.LiveMessageStatus;
import com.taobao.taolive.message_sdk.core.a;

/* loaded from: classes8.dex */
public class pee {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String j = "pee";
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public int h = 3;

    /* renamed from: a  reason: collision with root package name */
    public LiveMessageStatus f32564a = LiveMessageStatus.unSubscribe;
    public a b = new a();
    public pes i = new pes(this.b.b);

    public pee(String str) {
        this.c = str;
    }

    public void a(peh pehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97340e5", new Object[]{this, pehVar});
            return;
        }
        this.f32564a = LiveMessageStatus.running;
        this.d = pehVar.f32566a;
        this.e = pehVar.b;
        this.f = pehVar.c;
        this.g = pehVar.d;
    }

    public void b(peh pehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f64766", new Object[]{this, pehVar});
        } else {
            this.f32564a = LiveMessageStatus.unSubscribe;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f32564a = LiveMessageStatus.stop;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f32564a = LiveMessageStatus.running;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f32564a != LiveMessageStatus.unSubscribe;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LiveMessageContext{status=" + this.f32564a + ", config=" + this.b + ", deviceId='" + this.c + "', bizCode=" + this.d + ", topic='" + this.e + "', channel='" + this.f + "', from='" + this.g + "', powerMsgType=" + this.h + '}';
    }
}
