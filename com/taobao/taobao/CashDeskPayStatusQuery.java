package com.taobao.taobao;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.c;
import com.taobao.taobao.utils.b;
import java.util.HashMap;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.jqg;
import tb.qem;

/* loaded from: classes8.dex */
public class CashDeskPayStatusQuery implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API = "mtop.trade.receipt.order.status.query";
    public static final String ERROR_ORDER_CLOSE = "8";
    public static final String ERROR_OTHER = "200";
    public static final String ERROR_WAIT_PAY = "1";
    private static final String KEY_ANY_UNPAID = "anyUnpaid";
    private static final String KEY_ORDER_INFO = "orderInfos";
    private static final String KEY_PAY_STATUS = "payStatus";
    private static final String TAG = "CashDeskPayStatusQuery";
    private boolean isMultiOrder;
    private final Context mContext;
    private final qem mMegaInstance = qem.a();
    private c.a mRequestListener;

    public CashDeskPayStatusQuery(Context context) {
        this.mContext = context;
    }

    public void startRequest(String str, c.a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a46f1", new Object[]{this, str, aVar});
        } else if (TextUtils.isEmpty(str)) {
            jqg.b(TAG, "orderIds is null");
        } else {
            com.taobao.taobao.internal.helper.c.a(this.mMegaInstance, this.mContext);
            if (str.split(",").length > 1) {
                z = true;
            }
            this.isMultiOrder = z;
            this.mRequestListener = aVar;
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(API);
            mtopRequest.setVersion("1.0");
            HashMap hashMap = new HashMap();
            hashMap.put("orderIds", str);
            hashMap.put("source", "wxPay");
            mtopRequest.dataParams = hashMap;
            mtopRequest.setData(JSON.toJSONString(hashMap));
            MtopBusiness build = MtopBusiness.build(mtopRequest);
            build.mo1330supportStreamJson(true);
            build.mo1337addListener((MtopListener) this).startRequest();
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        com.taobao.taobao.internal.helper.c.a(this.mMegaInstance);
        try {
            handleSuccessCallback(mtopResponse, this.mRequestListener, this.isMultiOrder);
        } catch (Throwable unused) {
            this.mRequestListener.a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        com.taobao.taobao.internal.helper.c.a(this.mMegaInstance);
        handleFailCallback(mtopResponse, this.mRequestListener);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        com.taobao.taobao.internal.helper.c.a(this.mMegaInstance);
        handleFailCallback(mtopResponse, this.mRequestListener);
    }

    private void handleSuccessCallback(MtopResponse mtopResponse, c.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946e2611", new Object[]{this, mtopResponse, aVar, new Boolean(z)});
            return;
        }
        JSONObject body = getBody(mtopResponse);
        if (body == null) {
            aVar.a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            jqg.b(TAG, "body is null");
            return;
        }
        if ("false".equals(body.getString(KEY_ANY_UNPAID))) {
            aVar.a(mtopResponse.getRetMsg());
        } else {
            aVar.a(z ? "1" : getStatus(body), mtopResponse.getRetMsg());
        }
        com.taobao.taobao.utils.b.a(b.C0887b.a(mtopResponse.getApi(), true).a(0.01f));
    }

    private void handleFailCallback(MtopResponse mtopResponse, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0ce8358", new Object[]{this, mtopResponse, aVar});
            return;
        }
        aVar.a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        com.taobao.taobao.utils.b.a(b.C0887b.a(mtopResponse.getApi(), false).a(1.0f));
    }

    private String getStatus(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76bce15f", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray(KEY_ORDER_INFO);
        if (jSONArray == null || jSONArray.size() != 1) {
            return "1";
        }
        if (jSONArray.getJSONObject(0) == null) {
            jqg.b(TAG, "info is null");
            return "1";
        }
        String string = jSONObject.getString("payStatus");
        return TextUtils.isEmpty(string) ? "1" : string;
    }

    private JSONObject getBody(MtopResponse mtopResponse) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d16489c4", new Object[]{this, mtopResponse});
        }
        if (mtopResponse.getOriginFastJsonObject() != null) {
            parseObject = mtopResponse.getOriginFastJsonObject();
        } else {
            parseObject = JSONObject.parseObject(mtopResponse.getBytedata() == null ? "" : new String(mtopResponse.getBytedata()));
        }
        if (parseObject == null) {
            jqg.b(TAG, "response is null");
            return null;
        }
        return parseObject.getJSONObject("data");
    }
}
