package com.taobao.mtop.wvplugin;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import anet.channel.request.ByteArrayEntry;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SDKConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DATA = "data";
    public static final String KEY_HEADER = "header";
    public static final String KEY_METHOD = "method";
    public static final String KEY_URL = "url";
    public static final String METHOD_POST = "POST";
    public static final int MSG_ERR = -1;
    public static final int MSG_OK = 1;
    public static final String RESULT_CONTENT = "content";
    public static final String RESULT_KEY = "ret";

    /* renamed from: a  reason: collision with root package name */
    private WVCallBackContext f18289a;
    private Context b = SDKConfig.getInstance().getGlobalContext();
    private Handler c = new Handler(Looper.getMainLooper()) { // from class: com.taobao.mtop.wvplugin.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            Bundle data = message.getData();
            r rVar = new r();
            rVar.a("status_code", String.valueOf(data.getInt("status_code", 0)));
            String string = data.getString("status");
            if (StringUtils.isEmpty(string)) {
                rVar.a("status", string);
            }
            if (message.what == -1) {
                rVar.a(a.RESULT_KEY, new JSONArray().put("HY_FAILED"));
                a.b(a.this).error(rVar);
            } else if (message.what != 1) {
            } else {
                rVar.a(a.RESULT_KEY, new JSONArray().put("HY_SUCCESS"));
                rVar.a("content", data.getString("content"));
                a.b(a.this).success(rVar);
            }
        }
    };

    public static /* synthetic */ Handler a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("19694d47", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ WVCallBackContext b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("d3ab2f3", new Object[]{aVar}) : aVar.f18289a;
    }

    /* renamed from: com.taobao.mtop.wvplugin.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public class C0728a implements NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ByteArrayOutputStream b;

        private C0728a() {
            this.b = new ByteArrayOutputStream();
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                return;
            }
            Message obtainMessage = a.a(a.this).obtainMessage();
            Bundle bundle = new Bundle();
            try {
                if (finishEvent.getHttpCode() > 0) {
                    obtainMessage.what = 1;
                    bundle.putString("content", new String(this.b.toByteArray(), "UTF-8"));
                } else {
                    obtainMessage.what = -1;
                }
            } catch (UnsupportedEncodingException unused) {
                TBSdkLog.e("ANetBridge", "ByteArray -> String Error");
            }
            bundle.putInt("status_code", finishEvent.getHttpCode());
            bundle.putString("status", finishEvent.getDesc());
            obtainMessage.setData(bundle);
            a.a(a.this).sendMessage(obtainMessage);
        }

        @Override // anetwork.channel.NetworkCallBack.ProgressListener
        public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
            } else {
                this.b.write(progressEvent.getBytedata(), 0, progressEvent.getSize());
            }
        }
    }

    public void a(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ae5a2f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (TBSdkLog.isPrintLog()) {
            TBSdkLog.d("ANetBridge", "Send Params: " + str);
        }
        this.f18289a = wVCallBackContext;
        RequestImpl a2 = a(str);
        if (a2 == null) {
            this.c.sendEmptyMessage(-1);
        }
        new DegradableNetwork(this.b).asyncSend(a2, null, null, new C0728a());
    }

    private RequestImpl a(String str) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestImpl) ipChange.ipc$dispatch("603f3c52", new Object[]{this, str});
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("method");
            RequestImpl requestImpl = new RequestImpl(string);
            requestImpl.setMethod(string2);
            JSONObject optJSONObject = jSONObject.optJSONObject("header");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string3 = optJSONObject.getString(next);
                    if (!StringUtils.isEmpty(next) && !StringUtils.isEmpty(string3)) {
                        requestImpl.addHeader(next, string3);
                    }
                }
            }
            if ("POST".equals(string2)) {
                String string4 = jSONObject.getString("data");
                if (!StringUtils.isBlank(string4)) {
                    try {
                        bArr = string4.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                        bArr = null;
                    }
                    if (bArr != null) {
                        requestImpl.setBodyEntry(new ByteArrayEntry(bArr));
                    }
                }
            }
            return requestImpl;
        } catch (JSONException unused) {
            TBSdkLog.e("ANetBridge", "parseParams error, param=" + str);
            return null;
        }
    }
}
