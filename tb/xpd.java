package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.gateway.dispatch.a;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.themis.kernel.i;
import tb.suf;

/* loaded from: classes8.dex */
public class xpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final xpe b = new xpe();

    /* renamed from: a  reason: collision with root package name */
    private final suf.a f34451a = a();

    static {
        kge.a(-1029552143);
    }

    public static /* synthetic */ xpe a(xpd xpdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xpe) ipChange.ipc$dispatch("4f89fb4d", new Object[]{xpdVar}) : xpdVar.b;
    }

    public xpd() {
        oql.a().i().a(this.f34451a, ksk.NEW_FACE_PARENT.f30287a);
    }

    private suf.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (suf.a) ipChange.ipc$dispatch("771bf67d", new Object[]{this}) : new suf.a() { // from class: tb.xpd.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.suf.a
            public void a(final IContainerDataModel<?> iContainerDataModel, JSONObject jSONObject, final String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8fafb607", new Object[]{this, iContainerDataModel, jSONObject, str});
                } else if (jSONObject == null || StringUtils.isEmpty(str)) {
                    e.e("CacheDataValidator", "containerId or actionParams is null.");
                } else {
                    String string = jSONObject.getString(i.CDN_REQUEST_TYPE);
                    if (StringUtils.isEmpty(string)) {
                        e.e("CacheDataValidator", "requestType is null.");
                        return;
                    }
                    char c = 65535;
                    int hashCode = string.hashCode();
                    if (hashCode != 1363155516) {
                        if (hashCode == 1638323166 && string.equals("coldStart")) {
                            c = 1;
                        }
                    } else if (string.equals("loadCache")) {
                        c = 0;
                    }
                    if (c == 0) {
                        xpd.a(xpd.this).a(str, iContainerDataModel);
                    } else if (c != 1) {
                    } else {
                        a.b().a(new Runnable() { // from class: tb.xpd.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    xpd.a(xpd.this).a(str, iContainerDataModel, 0);
                                }
                            }
                        });
                    }
                }
            }
        };
    }
}
