package com.taobao.android.detail.mainpic.a11y;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ado;
import tb.eux;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(String str, String str2, final IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de9ae7a", new Object[]{this, str, str2, iRemoteBaseListener});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.alibaba.nhcil.videotextgeneration.get");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str2);
        jSONObject.put("mtype", (Object) "video");
        jSONObject.put(UiUtil.INPUT_TYPE_VALUE_NUM, (Object) 2);
        jSONObject.put("biz", (Object) "taobao");
        if (!StringUtils.isEmpty(str)) {
            jSONObject.put("item_id", (Object) str);
        }
        mtopRequest.setData(jSONObject.toJSONString());
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.mainpic.a11y.VideoContentMtopRequester$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 != null) {
                    iRemoteBaseListener2.onSystemError(i, mtopResponse, obj);
                }
                eux.a("Page_Detail", 19999, "Page_Detail_Video_Desc_Request_FAIL", null, null, null);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 == null) {
                    return;
                }
                iRemoteBaseListener2.onSuccess(i, mtopResponse, baseOutDo, obj);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 != null) {
                    iRemoteBaseListener2.onError(i, mtopResponse, obj);
                }
                eux.a("Page_Detail", 19999, "Page_Detail_Video_Desc_Request_FAIL", null, null, null);
            }
        });
        build.startRequest();
        eux.a("Page_Detail", 19999, "Page_Detail_Video_Desc_Request", null, null, null);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || str.startsWith("http") || str.startsWith("https")) {
            return str;
        }
        if (str.startsWith(ado.URL_SEPARATOR)) {
            return com.taobao.vessel.utils.b.HTTPS_SCHEMA + str;
        }
        return k.HTTPS_PREFIX + str;
    }

    public String a(MtopResponse mtopResponse) {
        byte[] bytedata;
        JSONObject parseObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf8a613", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null || (bytedata = mtopResponse.getBytedata()) == null || bytedata.length <= 0 || (parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()))) == null || (jSONArray = parseObject.getJSONArray("data")) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.size(); i++) {
            sb.append(jSONArray.getString(i));
        }
        return sb.toString();
    }
}
