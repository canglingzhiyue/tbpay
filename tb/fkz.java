package tb;

import android.content.Context;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.remote.newmodel.b;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.intf.Mtop;

/* loaded from: classes5.dex */
public class fkz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MtopBusiness f28024a;

    static {
        kge.a(-2123814282);
    }

    public fkz(Context context, fla flaVar, String str, boolean z, boolean z2) {
        if (context == null || flaVar == null) {
            return;
        }
        this.f28024a = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, context), flaVar.getMtopRequest()).mo1310setBizTopic(str);
        this.f28024a.mo1305reqMethod(MethodEnum.POST);
        this.f28024a.mo1328setUnitStrategy(flaVar.getUnitStrategy());
        if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put("asac", b.ASAC_VALUE);
            this.f28024a.mo1297headers((Map<String, String>) hashMap);
        }
        this.f28024a.mo1331supportZstdDictionary(z2);
    }

    public void a(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e49798", new Object[]{this, handler});
        } else if (handler == null) {
        } else {
            this.f28024a.mo1296handler(handler);
        }
    }

    public void a(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2600e", new Object[]{this, iRemoteBaseListener});
            return;
        }
        MtopBusiness mtopBusiness = this.f28024a;
        if (mtopBusiness == null) {
            return;
        }
        mtopBusiness.registerListener((IRemoteListener) iRemoteBaseListener);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.f28024a == null) {
            return false;
        }
        ctu.a("mMtopBusiness.startRequest");
        this.f28024a.startRequest();
        ctu.a();
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        MtopBusiness mtopBusiness = this.f28024a;
        if (mtopBusiness == null) {
            return;
        }
        mtopBusiness.cancelRequest();
    }
}
