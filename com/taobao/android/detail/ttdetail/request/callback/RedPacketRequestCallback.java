package com.taobao.android.detail.ttdetail.request.callback;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.RedPacketRequestParams;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes5.dex */
public class RedPacketRequestCallback implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GETCOUPON_ERROR_MESSAGE = "领取失败";
    private static final String TAG = "RedPacketRequestCallback";
    private Context mContext;
    private RedPacketRequestParams mParams;

    static {
        kge.a(-562356558);
        kge.a(-525336021);
    }

    public RedPacketRequestCallback(Context context, RedPacketRequestParams redPacketRequestParams) {
        this.mParams = redPacketRequestParams;
        this.mContext = context;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            handleSuccess(i, mtopResponse, baseOutDo, obj);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            handleError(i, mtopResponse, obj);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            handleError(i, mtopResponse, obj);
        }
    }

    private void handleSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("235d7ab0", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        String message = getMessage(mtopResponse);
        if (TextUtils.isEmpty(message)) {
            return;
        }
        Toast.makeText(this.mContext, message, 0).show();
    }

    private void handleError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8778fd", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            Toast.makeText(this.mContext, GETCOUPON_ERROR_MESSAGE, 0).show();
        }
    }

    private String getMessage(MtopResponse mtopResponse) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("741e4ca3", new Object[]{this, mtopResponse});
        }
        String str = null;
        try {
            if (mtopResponse.getBytedata() != null) {
                str = new String(mtopResponse.getBytedata());
            }
            return (TextUtils.isEmpty(str) || (jSONObject = JSON.parseObject(str).getJSONObject("data")) == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null) ? "" : jSONObject2.getString("message");
        } catch (Exception e) {
            i.a(TAG, "getMessage parse json error", e);
            return "";
        }
    }
}
