package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Patterns;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.model.ALCreatePassWordModel;
import com.taobao.share.taopassword.busniess.model.b;
import com.taobao.share.taopassword.busniess.mtop.request.PasswordGenerateRequestI;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import java.util.regex.Matcher;

/* loaded from: classes8.dex */
public class nzq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f31853a;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static nzq f31855a;

        static {
            kge.a(383922104);
            f31855a = new nzq();
        }

        public static /* synthetic */ nzq a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (nzq) ipChange.ipc$dispatch("f087d99", new Object[0]) : f31855a;
        }
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f31853a;
    }

    static {
        kge.a(540471525);
        f31853a = "PassWordGenBusiness";
    }

    public static nzq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzq) ipChange.ipc$dispatch("f087d99", new Object[0]) : a.a();
    }

    private nzq() {
    }

    public void a(Context context, ALCreatePassWordModel aLCreatePassWordModel, nzu nzuVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5ff897", new Object[]{this, context, aLCreatePassWordModel, nzuVar});
        } else if (nzuVar == null) {
            throw new Exception("listener can not be null!");
        } else {
            if (context == null || aLCreatePassWordModel == null) {
                new b().f19656a = aLCreatePassWordModel;
                nzuVar.a("0", "context or content is null ");
                return;
            }
            b(context, aLCreatePassWordModel, nzuVar);
        }
    }

    private void b(final Context context, ALCreatePassWordModel aLCreatePassWordModel, final nzu nzuVar) {
        final String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e79b98", new Object[]{this, context, aLCreatePassWordModel, nzuVar});
            return;
        }
        PasswordGenerateRequestI passwordGenerateRequestI = new PasswordGenerateRequestI();
        if (aLCreatePassWordModel != null) {
            str = aLCreatePassWordModel.c + "," + aLCreatePassWordModel.a();
        } else {
            str = "";
        }
        passwordGenerateRequestI.request(context, aLCreatePassWordModel, new nzx() { // from class: tb.nzq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.nzx
            public void a(b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a3a2d88d", new Object[]{this, bVar});
                    return;
                }
                if (oai.a()) {
                    if (!StringUtils.isEmpty(bVar.f)) {
                        nzq.a(context, bVar.f);
                    } else if (!StringUtils.isEmpty(bVar.b)) {
                        nzq.a(context, bVar.b);
                    }
                }
                nzuVar.a(bVar);
                AppMonitor.Alarm.commitSuccess("share", "genpassword", str);
                String b = nzq.b();
                nyy.c(b, "createPassWord suc: " + bVar.toString());
                TBS.Ext.commitEvent("Share_Exception", 19999, "taopassword", "info", com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18122), JSON.toJSONString(bVar));
            }

            @Override // tb.nzx
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    return;
                }
                nzuVar.a(str2, str3);
                AppMonitor.Alarm.commitFail("share", "genpassword", str2, str3, str);
                String b = nzq.b();
                nyy.c(b, "createPassWord err: " + str2 + " ->" + str3);
                String a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18136);
                TBS.Ext.commitEvent("Share_Exception", 19999, "taopassword", "err", a2, com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18141) + str2 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18137) + str3);
            }
        });
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
}
