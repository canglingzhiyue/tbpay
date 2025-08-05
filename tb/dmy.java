package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.dnr;
import tb.dns;
import tb.dnt;

/* loaded from: classes4.dex */
public class dmy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-315843702);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{dinamicXEngine});
        } else if (dinamicXEngine == null) {
        } else {
            dinamicXEngine.a(dno.DX_PARSER_GETTAOGLOBALSETTING, new dno());
            dinamicXEngine.a(dnv.DX_PARSER_ISTOPINULTRONGROUP, new dnv(true));
            dinamicXEngine.a(dnv.DX_PARSER_ISBOTTOMINULTRONGROUP, new dnv(false));
            dinamicXEngine.a(dnw.DX_PARSER_ULTRONGLOBALDATA, new dnw());
            dinamicXEngine.a(dnx.DX_PARSER_ULTRONPARENTDXDATA, new dnx());
            dinamicXEngine.a(dny.DX_PARSER_ULTRONPARENTKEY, new dny());
            dinamicXEngine.a(dnz.DX_PARSER_ULTRONREQUESTDATA, new dnz());
            dinamicXEngine.a(doa.DX_PARSER_ULTRONFREENODEDATA, new doa());
            dinamicXEngine.a(dob.DX_PARSER_ULTRONFREENODETEMPLATEINFO, new dob());
            dinamicXEngine.a(-3364302697346699741L, new fuk());
            if (dinamicXEngine.l() == null) {
                return;
            }
            dinamicXEngine.l().a(dnr.DAMBATCHUPDATECOMPONENT, new dnr.a());
            dinamicXEngine.l().a(dns.DAMREMOVECOMPONENT, new dns.a());
            dinamicXEngine.l().a(dnt.DAMUPDATECOMPONENT, new dnt.a());
        }
    }

    public static void b(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e2379a", new Object[]{dinamicXEngine});
        } else if (dinamicXEngine == null) {
        } else {
            dinamicXEngine.a(dnn.DX_PARSER_ADAMCONFIG, new dnn());
            dinamicXEngine.a(dnj.DX_EVENT_ADAMEVENTHANDLER, new dnj());
        }
    }

    public static dmx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dmx) ipChange.ipc$dispatch("f03c1ef", new Object[0]) : new dmx();
    }
}
