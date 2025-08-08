package com.taobao.share.taopassword.busniess.mtop.request;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.e;
import com.taobao.share.taopassword.busniess.model.c;
import com.taobao.share.taopassword.busniess.model.d;
import com.taobao.share.taopassword.busniess.mtop.response.MtopTaobaoWirelessSharePasswordGetResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.acg;
import tb.eby;
import tb.kge;
import tb.nyy;
import tb.nzt;
import tb.nzw;
import tb.nzy;
import tb.oac;

/* loaded from: classes8.dex */
public class PasswordCheckRequest implements IRemoteBaseListener, nzw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int GET_TAOPASSWORD = 110;
    private static final String TAG = "PasswordCheckRequest";
    private RemoteBusiness remoteBusiness;
    private a requestContent;
    private nzy rlistener;

    static {
        kge.a(-2000560967);
        kge.a(-525336021);
        kge.a(1017852983);
    }

    @Override // tb.nzw
    public void request(Context context, Object obj, oac oacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3204f24d", new Object[]{this, context, obj, oacVar});
            return;
        }
        this.rlistener = (nzy) oacVar;
        if (oacVar == null || obj == null) {
            return;
        }
        try {
            this.requestContent = (a) obj;
            MtopCheckPasswordHashRequest mtopCheckPasswordHashRequest = new MtopCheckPasswordHashRequest();
            mtopCheckPasswordHashRequest.setPasswordContent(this.requestContent.f19660a);
            mtopCheckPasswordHashRequest.setPasswordKeyList(JSONObject.toJSONString(this.requestContent.d));
            mtopCheckPasswordHashRequest.setOpenHash(this.requestContent.c.booleanValue());
            String str = this.requestContent.b;
            if ("pic".equals(this.requestContent.b)) {
                str = "copy";
            }
            mtopCheckPasswordHashRequest.setPasswordType(str);
            this.remoteBusiness = RemoteBusiness.build(context, mtopCheckPasswordHashRequest, nzt.b()).registeListener((MtopListener) this);
            this.remoteBusiness.mo1340setBizId(67);
            this.remoteBusiness.startRequest(110, MtopTaobaoWirelessSharePasswordGetResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.rlistener.a(getErrorCode(mtopResponse), mtopResponse.getRetMsg());
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        Map map = (Map) baseOutDo.mo2429getData();
        c parseRecResult = parseRecResult((Map) baseOutDo.mo2429getData());
        d a2 = parseRecResult.a();
        e.b().b(e.QUERYPASSEORD, parseRecResult.v);
        if (this.requestContent.f19660a != null) {
            a2.f19658a = this.requestContent.f19660a;
        }
        if (this.requestContent.b != null) {
            a2.b = this.requestContent.b;
        }
        this.rlistener.a(parseRecResult, map);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.rlistener.a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        }
    }

    private c parseRecResult(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("9a25d048", new Object[]{this, map});
        }
        c cVar = new c();
        cVar.a(new d());
        cVar.C = map.get("isTaoFriend");
        cVar.D = map.get("taoFriendIcon");
        cVar.m = map.get("bizId");
        cVar.f = map.get("content");
        cVar.b = map.get("createAppkey");
        cVar.e = map.get(MspGlobalDefine.EXTENDINFO);
        cVar.n = map.get("leftButtonText");
        cVar.s = map.get("myTaopwdToast");
        cVar.l = map.get("ownerFace");
        cVar.j = map.get("ownerName");
        cVar.i = map.get("password");
        cVar.g = map.get(eby.KEY_PIC_URL);
        cVar.p = map.get("popType");
        cVar.h = map.get("popUrl");
        cVar.k = map.get("pricev");
        cVar.q = map.get("rankNum");
        cVar.r = map.get("rankPic");
        cVar.o = map.get("rightButtonText");
        cVar.u = map.get("taopwdOwnerId");
        cVar.d = map.get("title");
        cVar.z = map.get("url");
        cVar.y = map.get("templateId");
        cVar.c = map.get("validDate");
        cVar.t = map.get("weakShow");
        cVar.v = map.get("shareDataTrack");
        String str = map.get("chatPopMap");
        if (!StringUtils.isEmpty(str)) {
            cVar.L = (com.taobao.share.taopassword.busniess.model.a) JSON.parseObject(str, com.taobao.share.taopassword.busniess.model.a.class);
            if (cVar.L != null) {
                com.taobao.share.taopassword.busniess.model.a aVar = cVar.L;
                if (StringUtils.isEmpty(cVar.C) || !"true".equals(cVar.C)) {
                    z = false;
                }
                aVar.f19655a = z;
            }
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(map.get("chatParams"));
            parseObject.put("userId", (Object) SecurityGuardManager.getInstance(acg.a()).getStaticDataEncryptComp().staticSafeDecrypt(16, "amp-relation_user_signcheck", parseObject.getString("encryptSharerId")));
            parseObject.remove("encryptSharerId");
            cVar.w = parseObject;
            map.put("chatParams", parseObject.toJSONString());
        } catch (Throwable th) {
            nyy.c(TAG, th.toString());
        }
        return cVar;
    }

    private String getErrorCode(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d4f0bf55", new Object[]{this, mtopResponse}) : mtopResponse == null ? "TPShareError_Others" : mtopResponse.isIllegelSign() ? "TPShareError_IllegelSign" : mtopResponse.isSessionInvalid() ? "TPShareError_SessionExpired" : mtopResponse.isNetworkError() ? "TPShareError_NetworkTimeout" : (mtopResponse.isMtopSdkError() || mtopResponse.isExpiredRequest() || mtopResponse.isSystemError()) ? "TPError_NetworkSysError" : (mtopResponse.is41XResult() || mtopResponse.isApiLockedResult()) ? "TPShareError_NetworkLimit" : mtopResponse.getRetCode();
    }

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f19660a;
        public String b;
        public Boolean c;
        public List<String> d;

        static {
            kge.a(1265263189);
        }

        public a(String str, String str2) {
            this.c = false;
            this.f19660a = str;
            this.b = str2;
        }

        public a(String str, String str2, List<String> list, boolean z) {
            this.c = false;
            this.f19660a = str;
            this.b = str2;
            this.d = list;
            this.c = Boolean.valueOf(z);
        }

        public a() {
            this.c = false;
        }
    }

    @Override // tb.nzw
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.remoteBusiness;
        if (remoteBusiness == null) {
            return;
        }
        remoteBusiness.cancelRequest();
    }
}
