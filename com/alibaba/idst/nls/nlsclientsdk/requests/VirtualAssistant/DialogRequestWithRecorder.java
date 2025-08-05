package com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant;

import android.util.Log;
import com.alibaba.idst.nls.nlsclientsdk.requests.NlsSpeechClient;
import com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogRequest;
import com.alibaba.idst.nls.nlsclientsdk.util.DefaultRecorder;
import com.alibaba.idst.nls.nlsclientsdk.util.IdGen;
import com.alibaba.idst.nls.nlsclientsdk.util.NlsUserTrack;
import com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallbackWithStatus;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class DialogRequestWithRecorder implements DialogCallback, RecorderCallbackWithStatus {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DialogRequestWithRecorder";
    private DialogRequest dialogRequest;
    private URI uri;
    private DialogWithRecorderCallback userCallback;
    private String url = NlsSpeechClient.DEFAULT_SERVER_ADDR;
    private volatile boolean isOver = true;
    private DefaultRecorder recorder = new DefaultRecorder(this);
    private Map<String, String> httpHeaderMap = new HashMap();

    static {
        kge.a(1538957201);
        kge.a(636775239);
        kge.a(1636042143);
    }

    public DialogRequestWithRecorder(URI uri, String str, DialogWithRecorderCallback dialogWithRecorderCallback) {
        this.userCallback = dialogWithRecorderCallback;
        if (str != null) {
            this.httpHeaderMap.put("X-NLS-Token", str);
        }
        if (uri != null) {
            this.uri = uri;
        } else {
            this.uri = URI.create(this.url);
        }
        this.dialogRequest = new DialogRequest(this.uri, this.httpHeaderMap, this);
    }

    public void startDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea3abd1", new Object[]{this});
            return;
        }
        this.dialogRequest.setTaskId(IdGen.genId());
        NlsUserTrack.getInstance().sendUTMessage(getClass().getName(), "startDialog", 20100001, "user call start");
        if (!this.isOver) {
            Log.e(TAG, "DialogWithRecorder already on requesting, please wait this request over!!!");
            NlsUserTrack.getInstance().sendUTMessage(getClass().getName(), "startDialog", 40100001, "already started");
        } else if (this.dialogRequest.payload.containsKey("query")) {
            startDialogInner();
        } else if (this.recorder.start() != -1) {
        } else {
            this.userCallback.onTaskFailed("Audio recorder Failed ,maybe has no recorder permission", 14022);
        }
    }

    public void stopDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2846e771", new Object[]{this});
            return;
        }
        DefaultRecorder defaultRecorder = this.recorder;
        if (defaultRecorder != null) {
            defaultRecorder.stop();
        }
        NlsUserTrack.getInstance().sendUTMessage(getClass().getName(), "stopDialog", 20100002, "user call stop");
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        NlsUserTrack.getInstance().sendUTMessage(getClass().getName(), "cancel", 20100003, "user call cancel");
        DefaultRecorder defaultRecorder = this.recorder;
        if (defaultRecorder != null) {
            defaultRecorder.stop();
        }
        DialogRequest dialogRequest = this.dialogRequest;
        if (dialogRequest != null) {
            dialogRequest.close();
        }
        this.isOver = true;
    }

    public void enableVpr(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02827d8", new Object[]{this, new Boolean(z)});
            return;
        }
        DialogRequest dialogRequest = this.dialogRequest;
        if (dialogRequest == null || !z) {
            return;
        }
        dialogRequest.setJobsMode(DialogRequest.JobsMode.ASR_VPR_DIALOGE);
    }

    public void enableAttr(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d8f199", new Object[]{this, new Boolean(z)});
            return;
        }
        DialogRequest dialogRequest = this.dialogRequest;
        if (dialogRequest == null || !z) {
            return;
        }
        dialogRequest.setJobsMode(DialogRequest.JobsMode.ASR_ATTR_DIALOGE);
    }

    public void enableVprAndAttr(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8720da", new Object[]{this, new Boolean(z)});
            return;
        }
        DialogRequest dialogRequest = this.dialogRequest;
        if (dialogRequest == null || !z) {
            return;
        }
        dialogRequest.setJobsMode(DialogRequest.JobsMode.ASR_ATTR_VPR_DIALOGE);
    }

    public void setJobModel(DialogRequest.JobsMode jobsMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124ca574", new Object[]{this, jobsMode});
        } else {
            this.dialogRequest.setJobsMode(jobsMode);
        }
    }

    public void setAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{this, str});
        } else {
            this.dialogRequest.setAppKey(str);
        }
    }

    public void setDeviceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462fc2e4", new Object[]{this, str});
        } else {
            this.dialogRequest.setDeviceInfo(str);
        }
    }

    public void setMaxRecordDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e697075", new Object[]{this, new Integer(i)});
        } else {
            this.recorder.setMaxRecordDuration(i);
        }
    }

    public void addCustomedParam(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576ba9", new Object[]{this, str, obj});
        } else {
            this.dialogRequest.addCustomedParam(str, obj);
        }
    }

    public void removeCustomedParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e810e24a", new Object[]{this, str});
        } else {
            this.dialogRequest.removeCustomParam(str);
        }
    }

    public void addContextParam(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6088c", new Object[]{this, str, obj});
        } else {
            this.dialogRequest.addContextParam(str, obj);
        }
    }

    public void setFormat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217718ca", new Object[]{this, str});
        } else {
            this.dialogRequest.setFormat(str);
        }
    }

    public void setSampleRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4f1330", new Object[]{this, new Integer(i)});
        } else {
            this.dialogRequest.setSampleRate(i);
        }
    }

    public void enableIntermediateResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770b7174", new Object[]{this, new Boolean(z)});
        } else {
            this.dialogRequest.enableIntermediateResult(z);
        }
    }

    public void enablePunctuationPrediction(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef665b27", new Object[]{this, new Boolean(z)});
        } else {
            this.dialogRequest.enablePunctuationPrediction(z);
        }
    }

    public void enableEos(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c702ca67", new Object[]{this, new Boolean(z)});
        } else {
            this.dialogRequest.enableEos(z);
        }
    }

    public void setCustomizationId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8973d1d", new Object[]{this, str});
        } else {
            this.dialogRequest.setCustomizationId(str);
        }
    }

    public void setVocabularyId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6af474", new Object[]{this, str});
        } else {
            this.dialogRequest.setVocabularyId(str);
        }
    }

    public void setVocabulary(Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f440836", new Object[]{this, map});
        } else {
            this.dialogRequest.setVocabulary(map);
        }
    }

    public void setClassVocabulary(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cd9ae2", new Object[]{this, map});
        } else {
            this.dialogRequest.setClassVocabulary(map);
        }
    }

    public void setInverseTextNormalization(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49838dcb", new Object[]{this, new Boolean(z)});
        } else {
            this.dialogRequest.setInverseTextNormalization(z);
        }
    }

    public void enableVoiceDetection(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a78a317", new Object[]{this, new Boolean(z)});
        } else {
            this.dialogRequest.enableVoiceDetection(z);
        }
    }

    public void enableDecoderVoiceDetection(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49290e99", new Object[]{this, new Boolean(z)});
        } else {
            this.dialogRequest.enableDecoderVoiceDetection(z);
        }
    }

    public void setSessionId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648aa560", new Object[]{this, str});
        } else {
            this.dialogRequest.setSessionId(str);
        }
    }

    public void setDialogParams(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bee5e8", new Object[]{this, list});
        } else {
            this.dialogRequest.setDialogParams(list);
        }
    }

    public void setDialogContext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720baad6", new Object[]{this, str});
        } else {
            this.dialogRequest.setDialogContext(str);
        }
    }

    public void setMaxStartSilence(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08a575b", new Object[]{this, new Integer(i)});
        } else {
            this.dialogRequest.setMaxStartSilence(i);
        }
    }

    public void setMaxEndSilence(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff21b5d4", new Object[]{this, new Integer(i)});
        } else {
            this.dialogRequest.setMaxEndSilence(i);
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogCallback
    public void onTaskFailed(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea2f011", new Object[]{this, str, new Integer(i)});
            return;
        }
        NlsUserTrack.getInstance().sendUTMessage(getClass().getName(), "onTaskFailed", i, str);
        if (!this.isOver) {
            if (this.recorder.getRecordStatus() == 1 || this.recorder.getRecordStatus() == 6) {
                String str2 = "recorder status is :" + this.recorder.getRecordStatus();
                this.recorder.stop();
            }
            this.userCallback.onTaskFailed(str, i);
        }
        this.isOver = true;
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogCallback
    public void onTaskStarted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655d29e4", new Object[]{this});
        } else {
            this.userCallback.onTaskStarted();
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogCallback
    public void onRecognizedCompleted(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5ca4b07", new Object[]{this, str});
            return;
        }
        if (!this.isOver && this.dialogRequest.getEnableVoiceDetection()) {
            this.recorder.stop();
        }
        this.userCallback.onRecognizedCompleted(str);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogCallback
    public void onRecognizedResultChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d77e13", new Object[]{this, str});
        } else {
            this.userCallback.onRecognizedResultChanged(str);
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogCallback
    public void onChannelClosed(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c4a3e2", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.isOver = true;
        NlsUserTrack.getInstance().sendUTMessage(getClass().getName(), "onChannelClosed", i, str);
        this.userCallback.onChannelClosed(str, i);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogCallback
    public void onDialogResultGenerated(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e469f3c", new Object[]{this, str});
            return;
        }
        NlsUserTrack.getInstance().sendUTMessage(getClass().getName(), "onDialogResultGenerated", 20000000, "");
        this.userCallback.onDialogResultGenerated(str);
        if (!this.dialogRequest.payload.containsKey("query")) {
            return;
        }
        this.dialogRequest.stop();
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallbackWithStatus
    public void onPre() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8d2ecb", new Object[]{this});
        } else {
            startDialogInner();
        }
    }

    private void startDialogInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d60aeb3", new Object[]{this});
            return;
        }
        this.dialogRequest.setSampleRate(16000);
        this.dialogRequest.setFormat("opu");
        this.dialogRequest.start();
        this.isOver = false;
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallbackWithStatus
    public void onPost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d226f026", new Object[]{this});
        } else if (this.isOver) {
            DialogRequest dialogRequest = this.dialogRequest;
            if (dialogRequest == null) {
                return;
            }
            dialogRequest.setStopTag();
        } else {
            this.dialogRequest.stop();
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallback
    public void onVoiceData(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc515b8", new Object[]{this, bArr, new Integer(i)});
            return;
        }
        this.dialogRequest.send(bArr);
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
