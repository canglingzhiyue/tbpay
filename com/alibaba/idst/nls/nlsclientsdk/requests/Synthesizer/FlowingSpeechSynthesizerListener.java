package com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class FlowingSpeechSynthesizerListener implements ConnectionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Nls.SynthesizerListener";
    private CountDownLatch completeLatch;
    private CountDownLatch readyLatch;
    private final FlowingSpeechSynthesizer speechSynthesizer;
    private final SpeechSynthesizerCallback speechSynthesizerCallback;
    private Boolean websocketConnecting = false;

    static {
        kge.a(-1938168561);
        kge.a(-1099020703);
    }

    public Boolean isWebsocketConnecting() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("249f74d9", new Object[]{this}) : this.websocketConnecting;
    }

    public FlowingSpeechSynthesizerListener(FlowingSpeechSynthesizer flowingSpeechSynthesizer, SpeechSynthesizerCallback speechSynthesizerCallback) {
        this.speechSynthesizer = flowingSpeechSynthesizer;
        this.speechSynthesizerCallback = speechSynthesizerCallback;
    }

    public void onComplete(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81d14c9", new Object[]{this, str});
        } else {
            this.speechSynthesizerCallback.onSynthesisCompleted(str, 0);
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f398d0", new Object[]{this});
            return;
        }
        this.readyLatch = new CountDownLatch(1);
        this.websocketConnecting = true;
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onClose(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fffa2ad", new Object[]{this, new Integer(i), str});
            return;
        }
        String str2 = "connection is closed due to {" + str + "},code:{" + i + riy.BLOCK_END_STR;
        this.websocketConnecting = false;
        this.speechSynthesizerCallback.onChannelClosed(str, i);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onError(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14ba516", new Object[]{this, exc});
            return;
        }
        String message = exc.getMessage() != null ? exc.getMessage() : "SDK Internal Error!";
        this.websocketConnecting = false;
        this.speechSynthesizerCallback.onTaskFailed(message, 400);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6056db9", new Object[]{this, str});
        } else if (str == null || str.trim().isEmpty()) {
        } else {
            String str2 = "on message:{" + str + riy.BLOCK_END_STR;
            SpeechSynthesizerResponse speechSynthesizerResponse = (SpeechSynthesizerResponse) JSON.parseObject(str, SpeechSynthesizerResponse.class);
            if (isComplete(speechSynthesizerResponse)) {
                this.readyLatch = null;
                this.completeLatch.countDown();
                onComplete(str);
                this.speechSynthesizer.cancel();
            } else if (isTaskFailed(speechSynthesizerResponse)) {
                onFail(speechSynthesizerResponse.getStatus(), speechSynthesizerResponse.getStatusText());
                this.readyLatch = null;
            } else if (isReady(speechSynthesizerResponse)) {
                this.speechSynthesizerCallback.onSynthesisStarted();
                this.speechSynthesizer.sendCachedTexts();
                this.readyLatch.countDown();
            } else {
                Log.e(TAG, str);
            }
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onFail(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            return;
        }
        Log.e(TAG, "fail status:{},reason:{}" + i + str);
        this.speechSynthesizerCallback.onTaskFailed(str, i);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener
    public void onMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e36702", new Object[]{this, byteBuffer});
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr, 0, bArr.length);
        this.speechSynthesizerCallback.onBinaryReceived(bArr, 0);
    }

    private boolean isReady(SpeechSynthesizerResponse speechSynthesizerResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e59795", new Object[]{this, speechSynthesizerResponse})).booleanValue() : speechSynthesizerResponse.getName().equals(Constant.VALUE_NAME_TTS_STARTED);
    }

    private boolean isComplete(SpeechSynthesizerResponse speechSynthesizerResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e4eeedff", new Object[]{this, speechSynthesizerResponse})).booleanValue() : speechSynthesizerResponse.getName().equals(Constant.VALUE_NAME_TTS_COMPLETE);
    }

    private boolean isTaskFailed(SpeechSynthesizerResponse speechSynthesizerResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2e9063a8", new Object[]{this, speechSynthesizerResponse})).booleanValue() : speechSynthesizerResponse.getName().equals(Constant.VALUE_NAME_TASK_FAILE);
    }

    public void setCompleteLatch(CountDownLatch countDownLatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c468a66", new Object[]{this, countDownLatch});
        } else {
            this.completeLatch = countDownLatch;
        }
    }

    public void countDownReadyLatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1aa719", new Object[]{this});
            return;
        }
        CountDownLatch countDownLatch = this.readyLatch;
        if (countDownLatch == null || countDownLatch.getCount() <= 0) {
            return;
        }
        this.readyLatch.countDown();
    }

    public boolean isReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52d16a4", new Object[]{this})).booleanValue();
        }
        CountDownLatch countDownLatch = this.readyLatch;
        return countDownLatch != null && countDownLatch.getCount() <= 0;
    }
}
