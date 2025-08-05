package com.taobao.android.detail.mainpic.a11y;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(String str, final IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934bf004", new Object[]{this, str, iRemoteBaseListener});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.ocr.image.check");
        mtopRequest.setVersion("1.2");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(str);
        jSONObject.put("imgList", (Object) jSONArray.toJSONString());
        mtopRequest.setData(jSONObject.toJSONString());
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.mainpic.a11y.OCRMtopRequester$1
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
                eux.a("Page_Detail", 19999, "Page_Detail_OCR_Request_FAIL", null, null, null);
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
                eux.a("Page_Detail", 19999, "Page_Detail_OCR_Request_FAIL", null, null, null);
            }
        });
        build.startRequest();
        eux.a("Page_Detail", 19999, "Page_Detail_OCR_Request", null, null, null);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || str.startsWith("http") || str.startsWith("https")) {
            return str;
        }
        if (str.startsWith(ado.URL_SEPARATOR)) {
            return com.taobao.vessel.utils.b.HTTPS_SCHEMA + str;
        }
        return k.HTTPS_PREFIX + str;
    }

    public String a(MtopResponse mtopResponse, String str) {
        byte[] bytedata;
        JSONObject parseObject;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42c6b2c9", new Object[]{this, mtopResponse, str});
        }
        if (mtopResponse != null && (bytedata = mtopResponse.getBytedata()) != null && bytedata.length > 0 && (parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()))) != null && (jSONObject = parseObject.getJSONObject("data")) != null && (jSONObject2 = jSONObject.getJSONObject("data")) != null && (jSONObject3 = jSONObject2.getJSONObject(str)) != null) {
            return jSONObject3.getString("content");
        }
        return null;
    }
}
