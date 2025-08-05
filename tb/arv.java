package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.arc;

/* loaded from: classes2.dex */
public abstract class arv implements arw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f25542a;
    private AURAGlobalData b;
    private f c;

    static {
        kge.a(1998679407);
        kge.a(-642282024);
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract void b(AURAEventIO aURAEventIO);

    public long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue();
        }
        return 0L;
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.arw
    public final void a(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d42ad4", new Object[]{this, aURAEventIO});
            return;
        }
        String eventType = aURAEventIO.getEventType();
        if (TextUtils.isEmpty(eventType)) {
            arc.a().c(getClass().getSimpleName(), "handleEvent", "eventType is empty");
        } else if (aURAEventIO.getEventModel() == null) {
            arc.a().c(getClass().getSimpleName(), "handleEvent", "AURAEventModel is null");
        } else if (a(eventType, aURAEventIO.getEventModel().c())) {
        } else {
            b(aURAEventIO);
        }
    }

    private boolean a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6635bd02", new Object[]{this, str, jSONObject})).booleanValue();
        }
        if (!a()) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int a2 = a(jSONObject);
        long k = k();
        if (elapsedRealtime - k() < a2) {
            ard a3 = arc.a();
            a3.a("事件【" + str + "】 操作太频繁，限制操作" + a2 + "ms 上次执行时间：" + k + " 当前执行时间：" + elapsedRealtime, arc.a.a().a("AURA/ability").b("needControlFrequency").b());
            return true;
        }
        ard a4 = arc.a();
        a4.a("事件【" + str + "】 操作间隔大于" + a2 + "ms 上次执行时间：" + k + " 当前执行时间：" + elapsedRealtime, arc.a.a().a("AURA/ability").b("needControlFrequency").b());
        a(elapsedRealtime);
        return false;
    }

    private int a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("266fb7b", new Object[]{this, jSONObject})).intValue() : bbi.a((String) bbc.a(jSONObject, "intervalTime", String.class, String.valueOf(500)), 500);
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.b = aURAGlobalData;
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.f25542a = qVar;
        this.c = fVar;
    }

    public q b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("c46eebf6", new Object[]{this}) : this.f25542a;
    }

    public f c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("4c9f2a80", new Object[]{this}) : this.c;
    }

    public AURAGlobalData d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("d7fa6101", new Object[]{this}) : this.b;
    }
}
