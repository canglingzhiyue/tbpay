package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.share.resource.a;
import com.taobao.share.taopassword.busniess.model.g;
import com.taobao.share.taopassword.querypassword.check.mtop.Checkistaopassword;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.List;
import java.util.regex.Pattern;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class oar implements oaq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1525004132);
        kge.a(-1715841262);
    }

    @Override // tb.oaq
    public oat a(Context context, oaz oazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oat) ipChange.ipc$dispatch("78da37fc", new Object[]{this, context, oazVar});
        }
        if (!StringUtils.isEmpty(oazVar.b)) {
            return null;
        }
        if (nyg.k() && !h(oazVar.f31882a)) {
            return null;
        }
        oat a2 = a(oazVar.f31882a);
        if (a2.f31880a) {
            a2.c = a(context, a2.d);
        }
        return a2;
    }

    private boolean h(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb017cfd", new Object[]{this, str})).booleanValue() : obe.b(oan.f(), str);
    }

    private oat a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oat) ipChange.ipc$dispatch("7c733d72", new Object[]{this, str});
        }
        String c = oan.c();
        char c2 = 65535;
        switch (c.hashCode()) {
            case 65:
                if (c.equals("A")) {
                    c2 = 0;
                    break;
                }
                break;
            case 66:
                if (c.equals("B")) {
                    c2 = 1;
                    break;
                }
                break;
            case 67:
                if (c.equals("C")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            return c(str);
        }
        if (c2 == 1) {
            return d(str);
        }
        if (c2 == 2) {
            return e(str);
        }
        return c(str);
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : g(str) ? g.MIAO : g.TAO;
    }

    private boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, str})).booleanValue() : obe.a(context, str);
    }

    private oat c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oat) ipChange.ipc$dispatch("7dcc94b0", new Object[]{this, str});
        }
        oat oatVar = new oat();
        String a2 = obe.a(oan.b(), str);
        if (StringUtils.isEmpty(a2)) {
            oatVar.f31880a = false;
            return oatVar;
        }
        oatVar.f31880a = true;
        oatVar.d = a2;
        oatVar.b = b(str);
        return oatVar;
    }

    private oat d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oat) ipChange.ipc$dispatch("7e79404f", new Object[]{this, str});
        }
        oat c = c(str);
        if (c.f31880a) {
            nyy.a("plan A");
            return c;
        } else if (!obe.b(oan.d(), str)) {
            nyy.a("plan b");
            c.f31880a = false;
            return c;
        } else {
            nyy.a("plan b");
            c.f31880a = true;
            c.d = str;
            c.b = b(str);
            if (StringUtils.equals(c.b, g.TAO)) {
                c.f31880a = f(str);
            }
            return c;
        }
    }

    private oat e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oat) ipChange.ipc$dispatch("7f25ebee", new Object[]{this, str});
        }
        oat c = c(str);
        if (c.f31880a) {
            return c;
        }
        c.d = str;
        c.b = b(str);
        if (StringUtils.equals(c.b, g.TAO)) {
            c.f31880a = f(str);
        } else {
            c.f31880a = true;
        }
        return c;
    }

    private boolean f(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue();
        }
        a a2 = a.a();
        a2.a(a.KEY_SHAREBACKISTAOPASSWORDMTOPSTART);
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        Checkistaopassword.Request request = new Checkistaopassword.Request();
        if (tdw.a().b()) {
            List<String> c = tdw.a().c(str);
            if (c == null || c.size() <= 0) {
                return false;
            }
            boolean d = tdw.a().d();
            request.passwordContent = com.alibaba.fastjson.JSONObject.toJSONString(c);
            request.passwordKeyList = com.alibaba.fastjson.JSONObject.toJSONString(c);
            request.openHash = d;
        } else {
            request.passwordContent = str;
        }
        MtopResponse syncRequest = RemoteBusiness.build((IMTOPDataObject) request, nzt.b()).syncRequest();
        if (syncRequest != null) {
            if (syncRequest.isApiSuccess()) {
                String str2 = "isServerCertificateTaopasswordonSuccess：" + jSONObject.toString();
                String string = new JSONObject(new String(syncRequest.getBytedata())).getJSONObject("data").getString("isTaoPassword");
                if (!"1".equals(string) && !"true".equals(string)) {
                    z = false;
                }
                nyy.a("mtop.taobao.sharepassword.checkistaopassword 结果: " + z);
                a2.a(a.KEY_SHAREBACKISTAOPASSWORDMTOPEND);
                return z;
            }
        }
        nyy.a("mtop.taobao.sharepassword.checkistaopassword 结果: true");
        return true;
    }

    private boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{this, str})).booleanValue();
        }
        try {
            return Pattern.compile(oan.e()).matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }
}
