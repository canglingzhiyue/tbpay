package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.c;
import com.alibaba.android.aura.service.nextrpc.extension.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "alibuy.impl.nextrpc.stream.handler")
/* loaded from: classes4.dex */
public final class tcx extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private tcy f34034a;
    private long b = 0;
    private final Handler c = new Handler(Looper.getMainLooper());
    private Runnable d;

    static {
        kge.a(677663105);
    }

    public static /* synthetic */ Object ipc$super(tcx tcxVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private tcy d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tcy) ipChange.ipc$dispatch("261fd291", new Object[]{this});
        }
        tcy tcyVar = this.f34034a;
        if (tcyVar != null) {
            return tcyVar;
        }
        this.f34034a = (tcy) c().get("aliBuyGlobalDataStreamResponseProcessor", tcy.class);
        if (this.f34034a == null) {
            this.f34034a = new tcy(a(), c());
            c().update("aliBuyGlobalDataStreamResponseProcessor", this.f34034a);
        }
        return this.f34034a;
    }

    @Override // com.alibaba.android.aura.service.nextrpc.extension.a
    public boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6573c390", new Object[]{this, cVar})).booleanValue();
        }
        JSONObject jSONObject = cVar.f().getJSONObject("data");
        if (jSONObject == null) {
            arc.a().a("stream", "protocol is null");
            return false;
        }
        tcy d = d();
        jcp jcpVar = new jcp(jSONObject);
        int h = cVar.h();
        if (h == 1) {
            this.b = System.currentTimeMillis();
            a(d, jcpVar);
        } else if (h == 2) {
            a(d, jSONObject);
        } else {
            arc.a().a("stream", "不支持>2的流式数据");
            tcz.a("STREAM_DATA_NO_IDENTIFIER_COUNT");
        }
        return false;
    }

    private void a(tcy tcyVar, jcp jcpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb7bd67", new Object[]{this, tcyVar, jcpVar});
        } else if (jcpVar.a()) {
            arc.a().a("stream", "收到流式首包数据");
            tcyVar.a(true);
            tcyVar.a(jcpVar);
            tcz.a();
            if (this.d == null) {
                this.d = new Runnable() { // from class: tb.tcx.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            tcz.a("STREAM_DATA_TIME_OUT");
                        }
                    }
                };
            }
            this.c.postDelayed(this.d, sad.DEFAULT_TCP_CONNECT_TIMEOUT_MS);
        } else {
            arc.a().a("stream", "进入流式桶，但不是流式数据");
            tcz.a("STREAM_BUCKET_BUT_NOT_HEADER");
        }
    }

    private void a(tcy tcyVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd911a02", new Object[]{this, tcyVar, jSONObject});
            return;
        }
        arc.a().a("stream", "收到流式二段包数据");
        tcyVar.a(false);
        Runnable runnable = this.d;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
        tcyVar.b();
        if (jSONObject.isEmpty()) {
            tcz.a("STREAM_DATA_EMPTY");
        }
        tcz.b();
        tcz.a((String) a().a("itemCount", String.class), this.b, System.currentTimeMillis(), baq.a((com.alibaba.android.aura.datamodel.nextrpc.a) c().get("aura_data_response", com.alibaba.android.aura.datamodel.nextrpc.a.class)));
    }

    @Override // com.alibaba.android.aura.service.nextrpc.extension.a
    public boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8fee151", new Object[]{this, cVar})).booleanValue();
        }
        int h = cVar.h();
        if (h == 1) {
            arc.a().a("stream", "流式首段包异常");
            return false;
        }
        tcy d = d();
        if (h == 2 && !d.f()) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("STREAM_DATA_EXCEPTION");
        String str = "_忽略";
        sb.append(z ? str : "_错误提示");
        sb.append(cVar.a());
        tcz.a(sb.toString());
        ard a2 = arc.a();
        if (!z) {
            str = "_错误提示";
        }
        a2.a("stream", str);
        return z;
    }

    @Override // tb.aqy, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        tcy tcyVar = this.f34034a;
        if (tcyVar == null) {
            return;
        }
        tcyVar.c();
    }
}
