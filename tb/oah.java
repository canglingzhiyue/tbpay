package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Patterns;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.model.TemplateId;
import com.taobao.share.taopassword.busniess.model.e;
import com.taobao.share.taopassword.constants.TPAction;
import com.taobao.share.taopassword.genpassword.mtop.ITaoPasswordGenerateRequest;
import java.util.HashMap;
import java.util.regex.Matcher;

/* loaded from: classes8.dex */
public class oah {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f31871a;
    private nzw b;
    private a c;
    private b d;

    /* loaded from: classes8.dex */
    public interface b {
    }

    /* loaded from: classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static oah f31874a;

        static {
            kge.a(-1360118026);
            f31874a = new oah();
        }

        public static /* synthetic */ oah a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (oah) ipChange.ipc$dispatch("f089308", new Object[0]) : f31874a;
        }
    }

    public static /* synthetic */ nzw a(oah oahVar, nzw nzwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzw) ipChange.ipc$dispatch("5c60c334", new Object[]{oahVar, nzwVar});
        }
        oahVar.b = nzwVar;
        return nzwVar;
    }

    public static /* synthetic */ b a(oah oahVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("da20fe30", new Object[]{oahVar}) : oahVar.d;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : f31871a;
    }

    static {
        kge.a(-418038749);
        f31871a = "TPGenerateManager";
    }

    public static oah a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oah) ipChange.ipc$dispatch("f089308", new Object[0]) : c.a();
    }

    private oah() {
        this.b = null;
    }

    private boolean a(com.taobao.share.taopassword.genpassword.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7580099", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        if (aVar.h != null && !StringUtils.isEmpty(aVar.h.f19663a)) {
            String str = aVar.h.b;
            if (StringUtils.isEmpty(str) || !str.contains(aVar.h.f19663a)) {
                return false;
            }
        }
        return true;
    }

    private com.taobao.share.taopassword.genpassword.model.a a(com.taobao.share.taopassword.genpassword.model.a aVar, TPAction tPAction) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.share.taopassword.genpassword.model.a) ipChange.ipc$dispatch("f227c7e", new Object[]{this, aVar, tPAction});
        }
        com.taobao.share.taopassword.genpassword.model.a aVar2 = new com.taobao.share.taopassword.genpassword.model.a();
        aVar2.f19662a = aVar.f19662a;
        if (StringUtils.isEmpty(aVar2.f19662a)) {
            throw new Exception("bizId is null");
        }
        if (StringUtils.isEmpty(aVar.c)) {
            throw new Exception("text is null");
        }
        if (StringUtils.isEmpty(aVar.d)) {
            throw new Exception("url is null");
        }
        aVar2.c = oag.a(aVar.c);
        aVar2.b = aVar.b;
        if (tPAction == null) {
            if (!StringUtils.isEmpty(aVar.g)) {
                aVar2.g = aVar.g;
            } else {
                aVar2.g = TPAction.OTHER.toString();
            }
        } else {
            aVar2.g = tPAction.toString();
        }
        aVar2.e = aVar.e;
        if (aVar.j != null) {
            aVar2.j = new HashMap();
            aVar2.j.putAll(aVar.j);
        }
        aVar2.n = aVar.n;
        if (aVar2.n != -1) {
            if (aVar2.j == null) {
                aVar2.j = new HashMap();
            }
            aVar2.j.put("isCallClient", Integer.toString(0));
        }
        aVar2.d = aVar.d;
        aVar2.f = aVar.f;
        if (StringUtils.isEmpty(aVar.f)) {
            aVar2.f = "other";
        }
        aVar2.o = aVar.o;
        if (StringUtils.isEmpty(aVar2.o)) {
            if (aVar2.f.equals("item")) {
                aVar2.o = TemplateId.ITEM.toString();
            } else if (aVar2.f.equals("shop")) {
                aVar2.o = TemplateId.SHOP.toString();
            } else {
                aVar2.o = TemplateId.COMMON.toString();
            }
        }
        aVar2.i = aVar.i;
        aVar2.h = aVar.h;
        aVar2.k = aVar.k;
        aVar2.l = aVar.l;
        aVar2.m = aVar.m;
        return aVar2;
    }

    public void a(Context context, com.taobao.share.taopassword.genpassword.model.a aVar, TPAction tPAction, oal oalVar, String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbed64d", new Object[]{this, context, aVar, tPAction, oalVar, str});
            return;
        }
        String str2 = "generateTaoPassword 1 ttid=" + str;
        if (oalVar == null) {
            throw new Exception("listener can not be null!");
        }
        if (StringUtils.isEmpty(str)) {
            if (StringUtils.isEmpty(nzt.b())) {
                throw new Exception("ttid is null.");
            }
        } else {
            nzt.a(str);
        }
        if (context == null || aVar == null || !a(aVar)) {
            e eVar = new e();
            eVar.f19659a = aVar;
            eVar.e = "TPShareError_MissRequiredParameter";
            oalVar.a(null, eVar);
        } else if (!b(aVar)) {
        } else {
            a(context, a(aVar, tPAction), oalVar);
        }
    }

    private boolean b(com.taobao.share.taopassword.genpassword.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10ac55da", new Object[]{this, aVar})).booleanValue();
        }
        if (this.c == null) {
            this.c = new a();
            this.c.f31873a = aVar.c;
            this.c.b = aVar.d;
            return true;
        } else if (aVar.c.equals(this.c.f31873a) && aVar.d.equals(this.c.b) && this.b != null) {
            return false;
        } else {
            b();
            this.c.f31873a = aVar.c;
            this.c.b = aVar.d;
            return true;
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        String str2 = "saveTaoPassword text=" + str;
        if (StringUtils.isEmpty(str)) {
            return;
        }
        Matcher matcher = Patterns.WEB_URL.matcher(str);
        if (matcher.find()) {
            String group = matcher.group();
            int indexOf = str.indexOf("?");
            String substring = indexOf <= 0 ? group : group.substring(0, indexOf);
            String str3 = "saveTaoPassword url=" + group + "  shortUrl=" + substring;
            obc.a(context, substring);
            return;
        }
        obc.a(context, str);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        nzw nzwVar = this.b;
        if (nzwVar == null) {
            return;
        }
        nzwVar.cancel();
        this.b = null;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : new oaj().a(str);
    }

    private void a(final Context context, com.taobao.share.taopassword.genpassword.model.a aVar, final oal oalVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("540384e3", new Object[]{this, context, aVar, oalVar});
            return;
        }
        this.b = new ITaoPasswordGenerateRequest();
        this.b.request(context, aVar, new oab() { // from class: tb.oah.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.oab
            public void a(e eVar) {
                Context context2;
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a3a435aa", new Object[]{this, eVar});
                    return;
                }
                oah.a(oah.this, (nzw) null);
                oah.c();
                String str2 = "generateTP resultData.passwordUrl=" + eVar.d + "  resultData.passwordKey=" + eVar.c;
                if (StringUtils.isEmpty(eVar.e)) {
                    oah.c();
                    String str3 = "generateTP getIsCachePassword=" + oai.a();
                    if (oai.a()) {
                        if (!StringUtils.isEmpty(eVar.d)) {
                            context2 = context;
                            str = eVar.d;
                        } else if (!StringUtils.isEmpty(eVar.c)) {
                            context2 = context;
                            str = eVar.c;
                        }
                        oah.a(context2, str);
                    }
                }
                oalVar.a(new obd(), eVar);
                if (oah.a(oah.this) == null) {
                    return;
                }
                oah.a(oah.this);
            }
        });
    }

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f31873a;
        public String b;

        static {
            kge.a(-1350136076);
        }

        private a() {
        }
    }
}
