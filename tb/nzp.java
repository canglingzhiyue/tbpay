package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.share.adapter.ShareShortenAdapter;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;

/* loaded from: classes8.dex */
public class nzp implements ShareShortenAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1294196845);
        kge.a(-1054325129);
    }

    @Override // com.ut.share.adapter.ShareShortenAdapter
    public String shortenURL(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aaf7dde5", new Object[]{this, str});
        }
        String str3 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TBShareContent j = e.b().j();
        if (j != null) {
            str3 = j.businessId;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "tbshare";
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.sharepassword.generateShortUrlNew");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(true);
        JSONObject parseObject = JSONObject.parseObject(mtopRequest.getData());
        parseObject.put("targetUrl", (Object) str);
        parseObject.put("bizCode", (Object) str3);
        if (j.extraParams != null && j.extraParams.size() > 0) {
            parseObject.put(MspGlobalDefine.EXTENDINFO, (Object) JSONObject.toJSONString(j.extraParams));
        }
        if (j != null && j.disableBackToClient) {
            parseObject.put("isCallClient", (Object) 0);
        }
        mtopRequest.setData(parseObject.toString());
        MtopBuilder build = Mtop.instance(ShareBizAdapter.getInstance().getAppEnv().b()).build(mtopRequest, ShareBizAdapter.getInstance().getAppEnv().a());
        build.mo1340setBizId(67);
        MtopResponse syncRequest = build.syncRequest();
        if (syncRequest.getDataJsonObject() != null) {
            if (j != null) {
                str2 = str + "," + j.businessId;
            } else {
                str2 = str;
            }
            try {
                String string = syncRequest.getDataJsonObject().getString("shortUrl");
                if (!TextUtils.isEmpty(string)) {
                    str = string;
                }
                AppMonitor.Alarm.commitSuccess("share", "generateShortUrl", str2);
            } catch (Throwable unused) {
                AppMonitor.Alarm.commitFail("share", "generateShortUrl", "SHARE_GENERATESHORTURL_FAILED", b.a(R.string.taobao_app_1010_1_18118), str2);
            }
        }
        TLog.logd("TBShareShortenURLService", "shortenURL : " + str);
        return str;
    }
}
