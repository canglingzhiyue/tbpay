package com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant;

import android.accounts.NetworkErrorException;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogRequest;
import com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener;
import com.alibaba.idst.nls.nlsclientsdk.util.TimeStampLogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import tb.kge;
import tb.riy;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes2.dex */
public class DialogListener implements ConnectionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SpeechVAListener";
    private DialogCallback innerCallback;
    private DialogRequest vaRequest;

    static {
        kge.a(-2139811914);
        kge.a(-1099020703);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e36702", new Object[]{this, byteBuffer});
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f398d0", new Object[]{this});
        }
    }

    public DialogListener(DialogRequest dialogRequest, DialogCallback dialogCallback) {
        this.vaRequest = dialogRequest;
        this.innerCallback = dialogCallback;
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            return;
        }
        Log.e(TAG, "fail status:{" + i + "},reason:{" + str + riy.BLOCK_END_STR);
        this.vaRequest.setOnRequesting(false);
        this.innerCallback.onTaskFailed(str, i);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onClose(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fffa2ad", new Object[]{this, new Integer(i), str});
            return;
        }
        String str2 = "connection is closed due to reason:" + str + ",code:" + i;
        this.vaRequest.setOnRequesting(false);
        this.innerCallback.onChannelClosed(str, i);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onError(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14ba516", new Object[]{this, exc});
            return;
        }
        String message = exc.getMessage() != null ? exc.getMessage() : "";
        this.vaRequest.setOnRequesting(false);
        if (exc instanceof InterruptedException) {
            DialogCallback dialogCallback = this.innerCallback;
            dialogCallback.onTaskFailed("Connect Timeout : " + message, TaobaoMediaPlayer.FFP_PROP_FLOAT_PANO_FOV);
        } else if (exc instanceof NetworkErrorException) {
            DialogCallback dialogCallback2 = this.innerCallback;
            dialogCallback2.onTaskFailed("Connect Failed : " + message, TaobaoMediaPlayer.FFP_PROP_FLOAT_PANO_LATITUDE);
        } else {
            DialogCallback dialogCallback3 = this.innerCallback;
            dialogCallback3.onTaskFailed("Default Websocket Error : " + message, TaobaoMediaPlayer.FFP_PROP_INT64_PANO_TYPE);
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6056db9", new Object[]{this, str});
        } else if (str == null || str.trim().length() == 0) {
        } else {
            String str2 = "on message:{" + str + riy.BLOCK_END_STR;
            DialogResponse dialogResponse = (DialogResponse) JSON.parseObject(str, DialogResponse.class);
            if (isRecReady(dialogResponse)) {
                DialogRequest.markReady();
                TimeStampLogUtil.getInstance();
                TimeStampLogUtil.printLog("time_stamp_onstarted", null, null);
                this.innerCallback.onTaskStarted();
            } else if (isRecResult(dialogResponse)) {
                TimeStampLogUtil.getInstance();
                TimeStampLogUtil.printLog("time_stamp_on_recognition_result_changed", null, dialogResponse.getRecognizedText());
                this.innerCallback.onRecognizedResultChanged(str);
            } else if (isRecComplete(dialogResponse)) {
                if (this.vaRequest.getJobsMode() == DialogRequest.JobsMode.ASR) {
                    DialogRequest.markComplete();
                    if (this.vaRequest.getEnableVoiceDetection()) {
                        this.vaRequest.stop();
                    }
                    this.innerCallback.onRecognizedCompleted(str);
                } else if (this.vaRequest.getJobsMode() != DialogRequest.JobsMode.ASR_DIALOGE) {
                } else {
                    this.innerCallback.onRecognizedCompleted(str);
                    TimeStampLogUtil.getInstance();
                    TimeStampLogUtil.printLog("time_stamp_on_recognition_result_completed", null, dialogResponse.getRecognizedText());
                    if (!this.vaRequest.getEnableVoiceDetection()) {
                        return;
                    }
                    this.vaRequest.stop();
                }
            } else if (isDialogResultGenerated(dialogResponse)) {
                DialogRequest.markComplete();
                TimeStampLogUtil.getInstance();
                TimeStampLogUtil.printLog("time_stamp_on_dialog_result", null, null);
                this.innerCallback.onDialogResultGenerated(str);
            } else if (isTaskFailed(dialogResponse)) {
                DialogRequest.markComplete();
                onFail(dialogResponse.getStatus(), dialogResponse.getStatusText());
            } else if (isTaskCompleted(dialogResponse)) {
                this.vaRequest.close();
            } else {
                Log.e(TAG, str);
            }
        }
    }

    private boolean isRecReady(DialogResponse dialogResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9aeac54", new Object[]{this, dialogResponse})).booleanValue() : dialogResponse.getName().equals(Constant.VALUE_NAME_VIRTUALASSISTANT_STARTED);
    }

    private boolean isRecResult(DialogResponse dialogResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5e500da", new Object[]{this, dialogResponse})).booleanValue() : dialogResponse.getName().equals("RecognitionResultChanged");
    }

    private boolean isRecComplete(DialogResponse dialogResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b022c076", new Object[]{this, dialogResponse})).booleanValue() : dialogResponse.getName().equals("RecognitionCompleted");
    }

    private boolean isDialogResultGenerated(DialogResponse dialogResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2009c097", new Object[]{this, dialogResponse})).booleanValue() : dialogResponse.getName().equals(Constant.VALUE_NAME_VIRTUALASSISTANT_DIALOG_RESULT_GENERATED);
    }

    private boolean isTaskFailed(DialogResponse dialogResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fbd87f03", new Object[]{this, dialogResponse})).booleanValue() : dialogResponse.getName().equals(Constant.VALUE_NAME_TASK_FAILE);
    }

    private boolean isTaskCompleted(DialogResponse dialogResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1e14153", new Object[]{this, dialogResponse})).booleanValue() : dialogResponse.getName().equals(Constant.VALUE_NAME_TASK_COMPLETED);
    }
}
