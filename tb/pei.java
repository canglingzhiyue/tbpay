package tb;

import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.message_sdk.mtop.heart.HeartbeatReportResponse;
import com.taobao.taolive.message_sdk.mtop.heart.HeartbeatReportResponseData;
import com.taobao.taolive.message_sdk.mtop.heart.a;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes8.dex */
public class pei implements d, pet {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f32567a = false;
    private static final String b = "pei";
    private long c;
    private long d;
    private pey e;
    private pee f;
    private String g;
    private a h;
    private peu m;
    private pej n;
    private HashSet<String> o;
    private boolean j = false;
    private boolean k = true;
    private int l = 1;
    private boolean p = true;
    private List<Long> i = new ArrayList();

    public pei(pee peeVar, pej pejVar) {
        this.f = peeVar;
        this.d = this.f.b.n;
        this.n = pejVar;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.p = z;
        String str = b;
        pex.a(str, "setOrangeHeartbeatDisable: " + z);
    }

    public void a(peh pehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97340e5", new Object[]{this, pehVar});
            return;
        }
        this.g = UUID.randomUUID().toString();
        this.h = new a(this, pehVar.f32566a);
        this.e = new pey(this);
        this.m = new peu();
        f();
        a(0L);
    }

    public void b(peh pehVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f64766", new Object[]{this, pehVar});
            return;
        }
        h();
        a(1L);
        this.n = null;
    }

    private void a(long j) {
        Map<String, String> a2;
        String[] strArr;
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        this.f.i.a(f32567a && this.p);
        if (f32567a && this.p) {
            pex.a(b, "reportHeartbeat return. stopReport: " + f32567a + " ,orangeStopHeartbeatDisable: " + this.p);
            return;
        }
        ArrayList arrayList = new ArrayList(this.i);
        this.i.clear();
        if (j == 4 || j == 0) {
            this.m.b();
        }
        this.m.a(this.l);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("deviceId", this.f.c);
        pej pejVar = this.n;
        if (pejVar == null || !pejVar.c()) {
            i = this.k ? 1 : 0;
        }
        this.l = i;
        hashMap.put("behaviour", String.valueOf(i));
        pej pejVar2 = this.n;
        if (pejVar2 != null && (a2 = pejVar2.a()) != null) {
            for (String str : this.f.b.p) {
                if (a2.containsKey(str)) {
                    hashMap.put(str, a2.get(str));
                }
            }
        }
        HashSet<String> a3 = this.f.i.a();
        HashSet<String> hashSet = this.o;
        if (hashSet != null) {
            a3.addAll(hashSet);
            pex.a(b, "reportHeartbeat receiveMsg: " + a3);
        }
        this.o = a3;
        this.h.a(this.f.d, this.f.e, this.g, j, arrayList, this.m.f32577a, this.m.b, hashMap, a3);
        pex.a(b, "reportHeartbeat[]: " + this.f.d + " " + this.f.e + " " + this.g + " " + j + " " + arrayList + " " + this.m.f32577a + " " + this.m.b + " " + hashMap + " " + a3);
        this.m.a();
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        if (netBaseOutDo instanceof HeartbeatReportResponse) {
            HeartbeatReportResponseData mo1437getData = ((HeartbeatReportResponse) netBaseOutDo).mo1437getData();
            if (mo1437getData.reportInterval > 0) {
                this.d = mo1437getData.reportInterval;
            }
            f32567a = mo1437getData.stopReport;
            this.o = null;
            String str = b;
            pex.a(str, "onSuccess receiveMsgSet: " + this.o + " ,heartbeatInterval: " + this.d + " ,stopReport: " + f32567a);
        }
        per.a(per.MODULE_POINT_HEART);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        String str = b;
        pex.a(str, "onError[]: code " + i + " netResponse " + netResponse + " Object " + obj);
        per.a(per.MODULE_POINT_HEART, String.valueOf(i), netResponse != null ? netResponse.toString() : "");
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.j = true;
        g();
        a(3L);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.j = false;
        f();
        a(4L);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.k = true;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.k = false;
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        pey peyVar = this.e;
        if (peyVar == null) {
            return;
        }
        peyVar.removeMessages(1000);
        this.e.sendEmptyMessageDelayed(1000, this.f.b.o * 1000);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        pey peyVar = this.e;
        if (peyVar == null) {
            return;
        }
        peyVar.removeMessages(1000);
        this.e.sendEmptyMessageDelayed(1000, this.f.b.o * 1000);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        pey peyVar = this.e;
        if (peyVar == null) {
            return;
        }
        peyVar.removeMessages(1000);
        this.c = 0L;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        pey peyVar = this.e;
        if (peyVar == null) {
            return;
        }
        peyVar.removeMessages(1000);
        this.c = 0L;
        this.e = null;
    }

    @Override // tb.pet
    public void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
        } else if (f32567a && this.p) {
            pex.a(b, "handleMessage return. stopReport: " + f32567a + " ,orangeStopHeartbeatDisable: " + this.p);
        } else if (message.what != 1000) {
        } else {
            this.i.add(Long.valueOf(i()));
            this.c += this.f.b.o;
            if (this.c % this.d == 0) {
                a(2L);
            } else {
                this.m.a(this.l);
            }
            e();
        }
    }

    private long i() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2864", new Object[]{this})).longValue();
        }
        pej pejVar = this.n;
        int b2 = pejVar != null ? pejVar.b() : 0;
        pej pejVar2 = this.n;
        boolean z = pejVar2 != null && pejVar2.c();
        pej pejVar3 = this.n;
        int i2 = (pejVar3 == null || pejVar3.d()) ? 1 : 0;
        byte[] bArr = new byte[8];
        Arrays.fill(bArr, (byte) 0);
        bArr[0] = (byte) i2;
        bArr[1] = (byte) b2;
        if (z) {
            i = 2;
        } else if (!this.k) {
            i = 0;
        }
        this.l = i;
        bArr[2] = (byte) i;
        return a(bArr);
    }

    private static long a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c196723", new Object[]{bArr})).longValue();
        }
        long j = 0;
        for (int i = 7; i >= 0; i--) {
            j = (j << 8) | (bArr[i] & 255);
        }
        return j;
    }
}
