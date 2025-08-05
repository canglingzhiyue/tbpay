package com.alibaba.idst.nls.restapi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import tb.kge;

/* loaded from: classes2.dex */
public class RestTTS {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG;
    private String accessToken;
    private String appkey;
    private String format;
    private HttpRequest httpRequest = new HttpRequest();
    private HttpUtil httpUtil;
    private int pitchRate;
    private int sampleRate;
    private int speechRate;
    private String text;
    private String voice;
    private int volume;

    static {
        kge.a(-499068214);
        TAG = "RestTTS";
    }

    public String getAppkey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this}) : this.appkey;
    }

    public void setAppkey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9dfe31", new Object[]{this, str});
        } else {
            this.appkey = str;
        }
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.text = str;
        }
    }

    public void setFormat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217718ca", new Object[]{this, str});
        } else {
            this.format = str;
        }
    }

    public void setAccessToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347a8f84", new Object[]{this, str});
        } else {
            this.accessToken = str;
        }
    }

    public void setSampleRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4f1330", new Object[]{this, new Integer(i)});
        } else {
            this.sampleRate = i;
        }
    }

    public void setVoice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("901ac881", new Object[]{this, str});
        } else {
            this.voice = str;
        }
    }

    public void setVolume(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942b2c0", new Object[]{this, new Integer(i)});
        } else {
            this.volume = i;
        }
    }

    public void setSpeechRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0659ef8", new Object[]{this, new Integer(i)});
        } else {
            this.speechRate = i;
        }
    }

    public void setPitchRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9f781e", new Object[]{this, new Integer(i)});
        } else {
            this.pitchRate = i;
        }
    }

    public HttpResponse doRestTTSRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("3744aff5", new Object[]{this});
        }
        this.httpRequest.setBody(JSON.toJSONString(generatingReqeustBody()));
        HttpResponse[] httpResponseArr = {null};
        try {
            httpResponseArr[0] = HttpUtil.send(this.httpRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (httpResponseArr[0] == null) {
            return null;
        }
        return httpResponseArr[0];
    }

    private JSONObject generatingReqeustBody() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("63cbaac6", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appkey", (Object) this.appkey);
        jSONObject.put("text", (Object) this.text);
        jSONObject.put("token", (Object) this.accessToken);
        jSONObject.put("format", (Object) this.format);
        jSONObject.put("sample_rate", (Object) Integer.valueOf(this.sampleRate));
        jSONObject.put("voice", (Object) this.voice);
        jSONObject.put(Constant.PROP_TTS_VOLUME, (Object) Integer.valueOf(this.volume));
        jSONObject.put(Constant.PROP_TTS_SPEECH_RATE, (Object) Integer.valueOf(this.speechRate));
        jSONObject.put(Constant.PROP_TTS_PITCH_RATE, (Object) Integer.valueOf(this.pitchRate));
        return jSONObject;
    }
}
