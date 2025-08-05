package com.alibaba.idst.nls.nlsclientsdk.requests.recognizer;

import android.accounts.NetworkErrorException;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener;
import com.alibaba.idst.nls.nlsclientsdk.transport.javawebsocket.JWebSocketClient;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import tb.kge;
import tb.riy;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes2.dex */
public class SpeechRecognizerListener implements ConnectionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RecognizerListener";
    private SpeechRecognizerCallback innerCallback;
    private SpeechRecognizer recognizer;

    static {
        kge.a(-1552293309);
        kge.a(-1099020703);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e36702", new Object[]{this, byteBuffer});
        }
    }

    public SpeechRecognizerListener(SpeechRecognizer speechRecognizer, SpeechRecognizerCallback speechRecognizerCallback) {
        this.recognizer = speechRecognizer;
        this.innerCallback = speechRecognizerCallback;
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            return;
        }
        Log.e(TAG, "fail status:{" + i + "},reasone:{" + str + riy.BLOCK_END_STR);
        this.innerCallback.onTaskFailed(str, i);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f398d0", new Object[]{this});
        } else {
            Log.e(TAG, "connection is ok");
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onClose(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fffa2ad", new Object[]{this, new Integer(i), str});
            return;
        }
        String str2 = "connection is closed due to reason:" + str + ",code:" + i;
        this.recognizer.setStopTag();
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
        if (exc instanceof InterruptedException) {
            SpeechRecognizerCallback speechRecognizerCallback = this.innerCallback;
            speechRecognizerCallback.onTaskFailed("Connect Timeout : " + message, TaobaoMediaPlayer.FFP_PROP_FLOAT_PANO_FOV);
        } else if (exc instanceof NetworkErrorException) {
            SpeechRecognizerCallback speechRecognizerCallback2 = this.innerCallback;
            speechRecognizerCallback2.onTaskFailed("Connect Failed : " + message, TaobaoMediaPlayer.FFP_PROP_FLOAT_PANO_LATITUDE);
        } else {
            SpeechRecognizerCallback speechRecognizerCallback3 = this.innerCallback;
            speechRecognizerCallback3.onTaskFailed("Default Websocket Error : " + message, TaobaoMediaPlayer.FFP_PROP_INT64_PANO_TYPE);
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
            SpeechRecognizerResponse speechRecognizerResponse = (SpeechRecognizerResponse) JSON.parseObject(str, SpeechRecognizerResponse.class);
            if (isRecReady(speechRecognizerResponse)) {
                SpeechRecognizer.markReady();
                this.innerCallback.onRecognizedStarted();
            } else if (isRecResult(speechRecognizerResponse)) {
                this.innerCallback.onRecognizedResultChanged(str, 0);
            } else if (isRecComplete(speechRecognizerResponse)) {
                SpeechRecognizer.markComplete();
                this.recognizer.client.setStatus(JWebSocketClient.WebsocketStatus.STATUS_STOP);
                this.innerCallback.onRecognizedCompleted(str, 0);
                if (!this.recognizer.getEnableVoiceDetection()) {
                    return;
                }
                this.recognizer.close();
            } else if (isTaskFailed(speechRecognizerResponse)) {
                SpeechRecognizer.markComplete();
                onFail(speechRecognizerResponse.getStatus(), speechRecognizerResponse.getStatusText());
            } else {
                Log.e(TAG, str);
            }
        }
    }

    private boolean isRecReady(SpeechRecognizerResponse speechRecognizerResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d88e527", new Object[]{this, speechRecognizerResponse})).booleanValue() : speechRecognizerResponse.getName().equals("RecognitionStarted");
    }

    private boolean isRecResult(SpeechRecognizerResponse speechRecognizerResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f5d586ad", new Object[]{this, speechRecognizerResponse})).booleanValue() : speechRecognizerResponse.getName().equals("RecognitionResultChanged");
    }

    private boolean isRecComplete(SpeechRecognizerResponse speechRecognizerResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5b21849", new Object[]{this, speechRecognizerResponse})).booleanValue() : speechRecognizerResponse.getName().equals("RecognitionCompleted");
    }

    private boolean isTaskFailed(SpeechRecognizerResponse speechRecognizerResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac1bc856", new Object[]{this, speechRecognizerResponse})).booleanValue() : speechRecognizerResponse.getName().equals(Constant.VALUE_NAME_TASK_FAILE);
    }
}
