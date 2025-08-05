package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "aura.impl.event.executeAbility")
/* loaded from: classes2.dex */
public final class axh extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "executeAbility";

    /* renamed from: a  reason: collision with root package name */
    private dkt f25668a;
    private axi b;

    static {
        kge.a(-2114916040);
    }

    public static /* synthetic */ Object ipc$super(axh axhVar, String str, Object... objArr) {
        if (str.hashCode() == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : EVENT_TYPE;
    }

    public static /* synthetic */ axi a(axh axhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (axi) ipChange.ipc$dispatch("72da05ad", new Object[]{axhVar}) : axhVar.b;
    }

    @Override // tb.arv, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.b = (axi) fVar.a(axi.class);
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
        } else {
            a(aURAEventIO.getEventModel().c());
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (this.f25668a == null) {
            this.f25668a = new dkt();
        }
        dlr dlrVar = new dlr();
        Context e = b().e();
        dlrVar.a(e);
        if (e instanceof Activity) {
            dlrVar.a(((Activity) e).getWindow().getDecorView());
        }
        this.f25668a.a(new dlh(jSONObject), dlrVar, new dll() { // from class: tb.axh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dll
            public void callback(String str, dkx dkxVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("398d9b15", new Object[]{this, str, dkxVar});
                } else if (TextUtils.isEmpty(str) || axh.a(axh.this) == null) {
                } else {
                    axh.a(axh.this);
                }
            }
        });
    }
}
