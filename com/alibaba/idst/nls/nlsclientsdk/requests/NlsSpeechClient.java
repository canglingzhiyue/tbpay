package com.alibaba.idst.nls.nlsclientsdk.requests;

import android.util.Log;
import com.alibaba.idst.nls.nlsclientsdk.VoiceCodecs;
import com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer.FlowingSpeechSynthesizer;
import com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer.SpeechSynthesizer;
import com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer.SpeechSynthesizerCallback;
import com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogCallback;
import com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogRequest;
import com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogRequestWithRecorder;
import com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogWithRecorderCallback;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizer;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorder;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorderCallback;
import com.alibaba.idst.nls.nlsclientsdk.transport.javawebsocket.JWebSocketClient;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class NlsSpeechClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_SERVER_ADDR = "wss://nls-gateway.cn-shanghai.aliyuncs.com/ws/v1";
    public static final int SAMPLE_RATE_16K = 16000;
    private static final String TAG = "NlsSpeechClient";
    private static NlsSpeechClient thisClient;
    public JWebSocketClient client;
    private Map<String, String> httpHeaderMap;
    public String token;
    private URI uri;
    public VoiceCodecs voiceCodecs;

    static {
        kge.a(952043104);
        thisClient = null;
    }

    public NlsSpeechClient(String str) {
        try {
            this.token = str;
            this.httpHeaderMap = new HashMap();
            if (str != null) {
                this.httpHeaderMap.put("X-NLS-Token", str);
            }
            this.uri = URI.create(DEFAULT_SERVER_ADDR);
            this.voiceCodecs = VoiceCodecs.getInstance();
            this.voiceCodecs.open(true);
        } catch (Exception e) {
            Log.e(TAG, "fail to create NlsClient" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public NlsSpeechClient(String str, String str2) {
        try {
            this.token = str2;
            this.httpHeaderMap = new HashMap();
            if (str2 != null) {
                this.httpHeaderMap.put("X-NLS-Token", str2);
            }
            if (str != null && !str.equals("")) {
                this.uri = URI.create(str);
            } else {
                this.uri = URI.create(DEFAULT_SERVER_ADDR);
            }
            String str3 = "Connect to host:" + str;
            this.voiceCodecs = VoiceCodecs.getInstance();
            this.voiceCodecs.open(true);
        } catch (Exception e) {
            Log.e(TAG, "fail to create NlsClient" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public NlsSpeechClient(String str, String str2, boolean z) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    str = str + "?token=" + str2;
                    this.uri = URI.create(str);
                    String str3 = "Connect to host:" + str;
                }
            } catch (Exception e) {
                Log.e(TAG, "fail to create NlsClient" + e.getMessage());
                throw new RuntimeException(e);
            }
        }
        this.uri = URI.create(DEFAULT_SERVER_ADDR);
        String str32 = "Connect to host:" + str;
    }

    public static NlsSpeechClient getInstance(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NlsSpeechClient) ipChange.ipc$dispatch("8fd3f73f", new Object[]{str, str2});
        }
        if (thisClient == null) {
            thisClient = new NlsSpeechClient(str, str2);
        }
        return thisClient;
    }

    public void setToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99ac208", new Object[]{this, str});
            return;
        }
        this.token = str;
        Map<String, String> map = this.httpHeaderMap;
        if (map == null || str == null) {
            return;
        }
        map.put("X-NLS-Token", str);
    }

    public SpeechRecognizer createRecognizerRequest(SpeechRecognizerCallback speechRecognizerCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpeechRecognizer) ipChange.ipc$dispatch("35f995c5", new Object[]{this, speechRecognizerCallback}) : new SpeechRecognizer(this.uri, this.httpHeaderMap, speechRecognizerCallback);
    }

    public SpeechRecognizerWithRecorder createRecognizerWithRecorder(SpeechRecognizerWithRecorderCallback speechRecognizerWithRecorderCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpeechRecognizerWithRecorder) ipChange.ipc$dispatch("c011b650", new Object[]{this, speechRecognizerWithRecorderCallback}) : new SpeechRecognizerWithRecorder(this.uri, this.token, speechRecognizerWithRecorderCallback);
    }

    public DialogRequest createDialogRequest(DialogCallback dialogCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogRequest) ipChange.ipc$dispatch("601a5e9e", new Object[]{this, dialogCallback}) : new DialogRequest(this.uri, this.httpHeaderMap, dialogCallback);
    }

    public DialogRequestWithRecorder createDialogRequestWithRecorder(DialogWithRecorderCallback dialogWithRecorderCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogRequestWithRecorder) ipChange.ipc$dispatch("3f645b5a", new Object[]{this, dialogWithRecorderCallback}) : new DialogRequestWithRecorder(this.uri, this.token, dialogWithRecorderCallback);
    }

    public SpeechSynthesizer createSpeechSynthesizer(SpeechSynthesizerCallback speechSynthesizerCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpeechSynthesizer) ipChange.ipc$dispatch("fc58972a", new Object[]{this, speechSynthesizerCallback}) : new SpeechSynthesizer(this.uri, this.httpHeaderMap, speechSynthesizerCallback);
    }

    public FlowingSpeechSynthesizer createFlowingSpeechSynthesizer(SpeechSynthesizerCallback speechSynthesizerCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FlowingSpeechSynthesizer) ipChange.ipc$dispatch("ddc963d8", new Object[]{this, speechSynthesizerCallback}) : new FlowingSpeechSynthesizer(this.uri, this.httpHeaderMap, speechSynthesizerCallback);
    }

    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        this.httpHeaderMap = null;
        this.voiceCodecs.close();
        JWebSocketClient jWebSocketClient = this.client;
        if (jWebSocketClient == null) {
            return;
        }
        jWebSocketClient.shutdown();
    }
}
