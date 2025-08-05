package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.click.extend.ExtendClickLink;
import com.taobao.muniontaobaosdk.util.TaoLog;

/* loaded from: classes4.dex */
public class dgb extends ExtendClickLink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1426808751);
    }

    public dgb(ExtendClickLink.a aVar) {
        super(aVar);
    }

    @Override // com.taobao.alimama.click.extend.ExtendClickLink
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        try {
            TaoLog.Logd("AlimamaSdk", this.f8418a);
            if (TextUtils.isEmpty(this.f8418a)) {
                return "mtop.ali.ad.settle.tanx.click";
            }
            Uri parse = Uri.parse(this.f8418a);
            String host = parse.getHost();
            if (TextUtils.isEmpty(host)) {
                return "mtop.ali.ad.settle.tanx.click";
            }
            if (host.equals("click.tanx.com")) {
                TaoLog.Logd("AlimamaSdk", "return default old host : mtop.ali.ad.settle.tanx.click");
                return "mtop.ali.ad.settle.tanx.click";
            }
            String queryParameter = parse.getQueryParameter("mtop_api");
            if (!TextUtils.isEmpty(queryParameter)) {
                TaoLog.Logd("AlimamaSdk", "return mtop_host : " + queryParameter);
                return queryParameter;
            }
            TaoLog.Logd("AlimamaSdk", "return defalut brand host : mtop.ali.ad.settle.brand.log");
            return "mtop.ali.ad.settle.brand.log";
        } catch (Exception e) {
            e.printStackTrace();
            TaoLog.Logd("AlimamaSdk", "Exception return defalut old host : mtop.ali.ad.settle.tanx.click");
            return "mtop.ali.ad.settle.tanx.click";
        }
    }
}
