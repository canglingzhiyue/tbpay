package com.taobao.tao.shop.rule;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteParserListener;
import com.taobao.tao.shop.rule.g;
import com.taobao.tao.shop.rule.mtop.MtopShopRuleVersionedRulesRequest;
import com.taobao.tao.shop.rule.mtop.MtopShopRuleVersionedRulesResponse;
import com.taobao.tao.shop.rule.mtop.MtopShopRuleVersionedRulesResponseData;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.ouu;
import tb.oux;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.tao.shop.rule.g$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass1 extends AsyncTask<Object, Object, Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21099a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public AnonymousClass1(String str, String str2, String str3) {
            this.f21099a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr});
            }
            e eVar = new e();
            MtopShopRuleVersionedRulesRequest mtopShopRuleVersionedRulesRequest = new MtopShopRuleVersionedRulesRequest();
            mtopShopRuleVersionedRulesRequest.setVersion(this.f21099a);
            mtopShopRuleVersionedRulesRequest.setBizType(this.b);
            eVar.a(new IRemoteParserListener() { // from class: com.taobao.tao.shop.rule.TBUrlRuleDownloader$1$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteParserListener
                public void parseResponse(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12969fa0", new Object[]{this, mtopResponse});
                        return;
                    }
                    if (mtopResponse != null) {
                        try {
                            if (mtopResponse.getBytedata() != null) {
                                MtopShopRuleVersionedRulesResponse mtopShopRuleVersionedRulesResponse = (MtopShopRuleVersionedRulesResponse) JSON.parseObject(mtopResponse.getBytedata(), MtopShopRuleVersionedRulesResponse.class, new Feature[0]);
                                if (mtopShopRuleVersionedRulesResponse != null && mtopShopRuleVersionedRulesResponse.mo2429getData() != null) {
                                    MtopShopRuleVersionedRulesResponseData mo2429getData = mtopShopRuleVersionedRulesResponse.mo2429getData();
                                    if (mo2429getData.rules != null && g.AnonymousClass1.this.c.equals(mo2429getData.version)) {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("author", mo2429getData.author);
                                        hashMap.put(MspGlobalDefine.RULES, mo2429getData.rules);
                                        hashMap.put("version", mo2429getData.version);
                                        f.a().a(g.AnonymousClass1.this.b, JSONObject.toJSONString(hashMap), mo2429getData.version);
                                        return;
                                    }
                                    ouu.b("download() - data.rules == null || !versionInConfig.equals(data.version)");
                                    return;
                                }
                                String retMsg = mtopResponse.getRetMsg();
                                ouu.b("download() - mtopResponse.retMsg = " + retMsg);
                                return;
                            }
                        } catch (Throwable th) {
                            ouu.a(th, "download() - download error");
                            return;
                        }
                    }
                    ouu.b("download() - mtopResponse is null");
                }
            });
            eVar.a(null, 0, mtopShopRuleVersionedRulesRequest, MtopShopRuleVersionedRulesResponse.class);
            return null;
        }
    }

    static {
        kge.a(308247992);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str)) {
            ouu.b("checkRuleUpdate() - bundleName is empty");
        } else if (oux.a(str2)) {
            ouu.b("checkRuleUpdate() - localVersion is empty");
        } else {
            int indexOf = str2.indexOf(".");
            if (indexOf < 0) {
                ouu.b("checkRuleUpdate() - localVersion is illegal");
                return;
            }
            String substring = str2.substring(0, indexOf);
            if (oux.a(substring)) {
                ouu.b("checkRuleUpdate() - firstBitVersion is empty");
                return;
            }
            String config = OrangeConfig.getInstance().getConfig(str, com.taobao.tao.shop.rule.util.c.KEY_PRE + substring, null);
            if (oux.a(config)) {
                ouu.b("checkRuleUpdate() - versionInConfig is empty");
            } else if (com.taobao.tao.shop.rule.util.d.b(str2, config)) {
                a(str, str2, config);
            } else {
                ouu.b("checkRuleUpdate() - localVersion >= versionInConfig ,  do not update");
            }
        }
    }

    private static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            new AnonymousClass1(str2, str, str3).execute(new Object[0]);
        }
    }
}
