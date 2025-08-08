package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import anetwork.channel.Header;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class nhc implements nfg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1397846365);
        kge.a(-1043610963);
    }

    @Override // tb.nfg
    public String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{this, str, map});
        }
        nfh a2 = a(str, "GET", map);
        if (a2 != null && a2.a() == 200) {
            return new String(a2.c());
        }
        return null;
    }

    @Override // tb.nfg
    public nfh a(String str, String str2, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfh) ipChange.ipc$dispatch("6ee0002d", new Object[]{this, str, str2, map});
        }
        Context e = p.e();
        if (e != null) {
            DegradableNetwork degradableNetwork = new DegradableNetwork(e);
            RequestImpl requestImpl = new RequestImpl(str);
            if (!"GET".equals(str2) && !StringUtils.isEmpty(str2)) {
                requestImpl.setMethod(str2);
            }
            ArrayList arrayList = new ArrayList();
            if (map != null) {
                for (final String str3 : map.keySet()) {
                    arrayList.add(new Header() { // from class: tb.nhc.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // anetwork.channel.Header
                        public String getName() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("7c09e698", new Object[]{this}) : str3;
                        }

                        @Override // anetwork.channel.Header
                        public String getValue() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("5308aa1e", new Object[]{this}) : (String) map.get(str3);
                        }
                    });
                }
                requestImpl.setHeaders(arrayList);
            }
            Response syncSend = degradableNetwork.syncSend(requestImpl, null);
            if (syncSend != null) {
                return new a(syncSend);
            }
        }
        return null;
    }

    /* loaded from: classes7.dex */
    public static class a implements nfh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Response f31462a;

        static {
            kge.a(360193871);
            kge.a(1665406270);
        }

        public a(Response response) {
            this.f31462a = response;
        }

        @Override // tb.nfh
        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f31462a.getStatusCode();
        }

        @Override // tb.nfh
        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f31462a.getError() != null ? this.f31462a.getError().toString() : "";
        }

        @Override // tb.nfh
        public byte[] c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("ab8ad2b3", new Object[]{this}) : this.f31462a.getBytedata();
        }

        @Override // tb.nfh
        public Map<String, List<String>> d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.f31462a.getConnHeadFields();
        }
    }
}
