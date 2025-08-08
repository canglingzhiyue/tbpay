package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ad;

@AURAExtensionImpl(code = "aliDetail.impl.aspect.mega.args")
/* loaded from: classes4.dex */
public final class dwu extends arn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27048a;

    static {
        kge.a(1423447322);
    }

    public static /* synthetic */ Object ipc$super(dwu dwuVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != -362309544) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.beforeServiceExecute((AURAInputData) objArr[0], (a) objArr[1]);
            return null;
        }
    }

    public dwu() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.AliDetailMAGAEventRedirectExtension");
    }

    @Override // tb.arn, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.f27048a = qVar.e();
    }

    @Override // tb.arn, tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, aVar);
        if (!StringUtils.equals(aVar.c(), e.CODE)) {
            arc.a().b("AliDetailMAGAEventRedirectExtension.beforeServiceExecute:not target service");
        } else if (!(aURAInputData.getData() instanceof AURAEventIO)) {
            arc.a().b("AliDetailMAGAEventRedirectExtension.beforeServiceExecute:inputData invalid");
        } else {
            AURAEventIO aURAEventIO = (AURAEventIO) aURAInputData.getData();
            String eventType = aURAEventIO.getEventType();
            char c = 65535;
            if (eventType.hashCode() == 693995882 && eventType.equals(ad.EVENT_TYPE)) {
                c = 0;
            }
            if (c != 0) {
                return;
            }
            a(aURAEventIO);
        }
    }

    private void a(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d42ad4", new Object[]{this, aURAEventIO});
            return;
        }
        JSONObject c = aURAEventIO.getEventModel().c();
        if (c == null) {
            c = new JSONObject();
        }
        JSONObject jSONObject = c.getJSONObject("queryParams");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            c.put("queryParams", (Object) jSONObject);
        }
        Context context = this.f27048a;
        if (!(context instanceof DetailCoreActivity)) {
            return;
        }
        jSONObject.put("token", (Object) ((DetailCoreActivity) context).h);
    }
}
