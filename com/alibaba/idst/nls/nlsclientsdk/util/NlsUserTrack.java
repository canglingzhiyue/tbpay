package com.alibaba.idst.nls.nlsclientsdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.SpeechReqProtocol;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alibaba.idst.nls.restapi.HttpUtil;
import com.alibaba.security.realidentity.g4;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class NlsUserTrack {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG;
    private static NlsUserTrack nlsUserTrack;
    private static SpeechReqProtocol speechReqProtocol;
    private static String url;
    private static Handler utHandler;
    private static Map<String, Object> utMap;
    private static boolean utSwith;

    public static /* synthetic */ Handler access$002(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7fe0f4fd", new Object[]{handler});
        }
        utHandler = handler;
        return handler;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : TAG;
    }

    static {
        kge.a(1152808463);
        TAG = "NlsSpeechUserTrack";
        url = "https://nls-log-gather.aliyuncs.com/api/gather";
        utSwith = false;
    }

    public NlsUserTrack() {
        if (utSwith) {
            initUtHandler();
        }
    }

    public void openUT(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3709264", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!utSwith && z && utHandler == null) {
            initUtHandler();
        }
        utSwith = z;
    }

    public static NlsUserTrack getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NlsUserTrack) ipChange.ipc$dispatch("348bb114", new Object[0]);
        }
        if (nlsUserTrack == null) {
            nlsUserTrack = new NlsUserTrack();
        }
        return nlsUserTrack;
    }

    private void initUtHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1313b82", new Object[]{this});
        } else {
            new Thread(new Runnable() { // from class: com.alibaba.idst.nls.nlsclientsdk.util.NlsUserTrack.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Looper.prepare();
                    NlsUserTrack.access$002(new Handler() { // from class: com.alibaba.idst.nls.nlsclientsdk.util.NlsUserTrack.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("282a8c19", new Object[]{this, message});
                                return;
                            }
                            try {
                                NlsUserTrack.access$100();
                                HttpUtil.send((HttpRequest) message.obj);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    Looper.loop();
                }
            }, "NlsUserTrackThread").start();
        }
    }

    public void setSpeechRequest(SpeechReqProtocol speechReqProtocol2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ce352f", new Object[]{this, speechReqProtocol2});
        } else {
            speechReqProtocol = speechReqProtocol2;
        }
    }

    public void sendUTMessage(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8f9a32", new Object[]{this, str, str2, new Integer(i), str3});
        } else if (utSwith) {
            HttpRequest httpRequest = new HttpRequest();
            httpRequest.setUrl(url);
            HashMap hashMap = new HashMap();
            utMap = hashMap;
            hashMap.put("request_id", speechReqProtocol.getTaskId());
            utMap.put("app", "android-lite-sdk");
            utMap.put("backend_app", "gateway");
            utMap.put("time", Long.valueOf(System.currentTimeMillis()));
            utMap.put(MspGlobalDefine.APP_KEY, speechReqProtocol.getAppKey());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("class_name", (Object) str);
            jSONObject.put("event", (Object) str2);
            jSONObject.put("code", (Object) Integer.valueOf(i));
            jSONObject.put("message", (Object) str3);
            jSONObject.put("sdk_info", speechReqProtocol.context.get(g4.a.f3423a));
            utMap.put(aw.PARAM_EXTEND, jSONObject.toJSONString());
            utMap.put("token", "83578acaef32b906ad3aaf62b662e714");
            String str4 = "";
            for (Map.Entry<String, Object> entry : utMap.entrySet()) {
                str4 = str4 + entry.getKey() + "=" + entry.getValue() + "&";
            }
            httpRequest.setBody(str4);
            Message message = new Message();
            message.obj = httpRequest;
            Handler handler = utHandler;
            if (handler == null) {
                return;
            }
            handler.sendMessage(message);
        }
    }
}
