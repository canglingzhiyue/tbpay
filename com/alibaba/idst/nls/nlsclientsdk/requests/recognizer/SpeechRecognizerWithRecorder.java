package com.alibaba.idst.nls.nlsclientsdk.requests.recognizer;

import android.util.Log;
import com.alibaba.idst.nls.nlsclientsdk.requests.NlsSpeechClient;
import com.alibaba.idst.nls.nlsclientsdk.util.DefaultRecorder;
import com.alibaba.idst.nls.nlsclientsdk.util.IdGen;
import com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallbackWithStatus;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class SpeechRecognizerWithRecorder implements SpeechRecognizerCallback, RecorderCallbackWithStatus {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AliSpeechSDK";
    private SpeechRecognizer speechRecognizer;
    private URI uri;
    private SpeechRecognizerWithRecorderCallback userCallback;
    private String url = NlsSpeechClient.DEFAULT_SERVER_ADDR;
    private volatile boolean isOver = true;
    private int CHANNEL_CLOSE_NORMAL = 1000;
    private DefaultRecorder recorder = new DefaultRecorder(this);
    private Map<String, String> httpHeaderMap = new HashMap();

    static {
        kge.a(1945261491);
        kge.a(1224293844);
        kge.a(1636042143);
    }

    public SpeechRecognizerWithRecorder(URI uri, String str, SpeechRecognizerWithRecorderCallback speechRecognizerWithRecorderCallback) {
        this.userCallback = speechRecognizerWithRecorderCallback;
        if (str != null) {
            this.httpHeaderMap.put("X-NLS-Token", str);
        }
        if (uri != null) {
            this.uri = uri;
        } else {
            this.uri = URI.create(this.url);
        }
        this.speechRecognizer = new SpeechRecognizer(this.uri, this.httpHeaderMap, this);
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!this.isOver) {
            Log.e(TAG, "SpeechRecognizerWithRecorder already on requesting, please wait this request over!!!");
        } else if (this.recorder.start() != -1) {
        } else {
            this.userCallback.onTaskFailed("Audio recorder Failed ,maybe has no recorder permission", 422);
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        DefaultRecorder defaultRecorder = this.recorder;
        if (defaultRecorder == null) {
            return;
        }
        defaultRecorder.stop();
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        DefaultRecorder defaultRecorder = this.recorder;
        if (defaultRecorder != null) {
            defaultRecorder.stop();
        }
        SpeechRecognizer speechRecognizer = this.speechRecognizer;
        if (speechRecognizer == null) {
            return;
        }
        speechRecognizer.close();
    }

    public void setAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{this, str});
        } else {
            this.speechRecognizer.setAppKey(str);
        }
    }

    public void addCustomedParam(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576ba9", new Object[]{this, str, obj});
        } else {
            this.speechRecognizer.addCustomedParam(str, obj);
        }
    }

    public void addContextParam(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6088c", new Object[]{this, str, obj});
        } else {
            this.speechRecognizer.addContextParam(str, obj);
        }
    }

    public void setFormat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217718ca", new Object[]{this, str});
        } else {
            this.speechRecognizer.setFormat(str);
        }
    }

    public void setSampleRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4f1330", new Object[]{this, new Integer(i)});
        } else {
            this.speechRecognizer.setSampleRate(i);
        }
    }

    public void enableIntermediateResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770b7174", new Object[]{this, new Boolean(z)});
        } else {
            this.speechRecognizer.enableIntermediateResult(z);
        }
    }

    public void enablePunctuation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c781b6", new Object[]{this, new Boolean(z)});
        } else {
            this.speechRecognizer.enablePunctuation(z);
        }
    }

    public void setCustomizationId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8973d1d", new Object[]{this, str});
        } else {
            this.speechRecognizer.setCustomizationId(str);
        }
    }

    public void setVocabularyId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6af474", new Object[]{this, str});
        } else {
            this.speechRecognizer.setVocabularyId(str);
        }
    }

    public void setVocabulary(Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f440836", new Object[]{this, map});
        } else {
            this.speechRecognizer.setVocabulary(map);
        }
    }

    public void setClassVocabulary(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cd9ae2", new Object[]{this, map});
        } else {
            this.speechRecognizer.setClassVocabulary(map);
        }
    }

    public void setInverseTextNormalization(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49838dcb", new Object[]{this, new Boolean(z)});
        } else {
            this.speechRecognizer.setInverseTextNormalization(z);
        }
    }

    public void enableVoiceDetection(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a78a317", new Object[]{this, new Boolean(z)});
        } else {
            this.speechRecognizer.enableVoiceDetection(z);
        }
    }

    public void setMaxStartSilence(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08a575b", new Object[]{this, new Integer(i)});
        } else {
            this.speechRecognizer.setMaxStartSilence(i);
        }
    }

    public void setMaxEndSilence(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff21b5d4", new Object[]{this, new Integer(i)});
        } else {
            this.speechRecognizer.setMaxEndSilence(i);
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onTaskFailed(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea2f011", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (!this.isOver) {
            this.recorder.stop();
            this.userCallback.onTaskFailed(str, i);
        }
        this.isOver = true;
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onRecognizedStarted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a57473", new Object[]{this});
        } else {
            this.userCallback.onRecognizedStarted();
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onRecognizedCompleted(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f88dc", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (!this.isOver && this.speechRecognizer.getEnableVoiceDetection()) {
            this.recorder.stop();
        }
        this.userCallback.onRecognizedCompleted(str, i);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onRecognizedResultChanged(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a218b750", new Object[]{this, str, new Integer(i)});
        } else {
            this.userCallback.onRecognizedResultChanged(str, i);
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onChannelClosed(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c4a3e2", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (i != this.CHANNEL_CLOSE_NORMAL && !this.isOver) {
            this.userCallback.onTaskFailed(str, i);
        }
        this.isOver = true;
        this.recorder.stop();
        this.userCallback.onChannelClosed(str, i);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallbackWithStatus
    public void onPre() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8d2ecb", new Object[]{this});
            return;
        }
        this.speechRecognizer.setTaskId(IdGen.genId());
        this.speechRecognizer.setSampleRate(16000);
        this.speechRecognizer.setFormat("opu");
        this.speechRecognizer.start();
        this.isOver = false;
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallbackWithStatus
    public void onPost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d226f026", new Object[]{this});
        } else if (!this.isOver) {
            this.speechRecognizer.stop();
        } else {
            SpeechRecognizer speechRecognizer = this.speechRecognizer;
            if (speechRecognizer == null) {
                return;
            }
            speechRecognizer.setStopTag();
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallback
    public void onVoiceData(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc515b8", new Object[]{this, bArr, new Integer(i)});
            return;
        }
        this.speechRecognizer.send(bArr);
        this.userCallback.onVoiceData(bArr, i);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallback
    public void onVoiceVolume(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78c1fef", new Object[]{this, new Integer(i)});
        } else {
            this.userCallback.onVoiceVolume(i);
        }
    }
}
