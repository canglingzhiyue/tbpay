package com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant;

import android.accounts.NetworkErrorException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.alibaba.idst.nls.nlsclientsdk.VoiceCodecs;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alibaba.idst.nls.nlsclientsdk.requests.SpeechReqProtocol;
import com.alibaba.idst.nls.nlsclientsdk.transport.Connection;
import com.alibaba.idst.nls.nlsclientsdk.transport.javawebsocket.JWebSocketClient;
import com.alibaba.idst.nls.nlsclientsdk.util.BytesTransUtil;
import com.alibaba.idst.nls.nlsclientsdk.util.TimeStampLogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.kge;

/* loaded from: classes2.dex */
public class DialogRequest extends SpeechReqProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_FORMAT = "pcm";
    private static final Integer DEFAULT_SAMPLE_RATE;
    private static final String TAG = "SpeechVARequest";
    private static CountDownLatch completeLatch;
    private static boolean isHandshaking;
    private static CountDownLatch readyLatch;
    private byte[] audioInput;
    private BytesTransUtil bytesTransUtil;
    private JWebSocketClient client;
    private Connection conn;
    private String currentTaskId;
    private Map<String, String> httpHeaderMap;
    private DialogListener innerLister;
    private VoiceCodecs mVoiceCodecs;
    private boolean onRequesting;
    private byte[] sendBuffer;
    private int sendBufferCount;
    private URI serverUri;
    private JWebSocketClient.WebsocketStatus state;
    private short[] transData;
    private Handler virtualAssistantHandler;
    private byte[] opu = new byte[640];
    private Lock lock = new ReentrantLock();
    private JobsMode jobsMode = JobsMode.ASR_DIALOGE;
    private LinkedList<String> startTasks = new LinkedList<>();
    private LinkedList<String> stopTasks = new LinkedList<>();
    private LinkedBlockingQueue<byte[]> queue = new LinkedBlockingQueue<>();

    /* loaded from: classes2.dex */
    public enum JobsMode {
        ASR,
        ASR_DIALOGE,
        ASR_VPR_DIALOGE,
        ASR_ATTR_DIALOGE,
        ASR_ATTR_VPR_DIALOGE
    }

    public static /* synthetic */ Object ipc$super(DialogRequest dialogRequest, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Handler access$002(DialogRequest dialogRequest, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ec6dcf3b", new Object[]{dialogRequest, handler});
        }
        dialogRequest.virtualAssistantHandler = handler;
        return handler;
    }

    public static /* synthetic */ void access$100(DialogRequest dialogRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29186c5c", new Object[]{dialogRequest});
        } else {
            dialogRequest.doStart();
        }
    }

    public static /* synthetic */ void access$200(DialogRequest dialogRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c9d67b", new Object[]{dialogRequest});
        } else {
            dialogRequest.doStop();
        }
    }

    public static /* synthetic */ void access$300(DialogRequest dialogRequest, InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d84ce39", new Object[]{dialogRequest, inputStream});
        } else {
            dialogRequest.doSend(inputStream);
        }
    }

    public static /* synthetic */ LinkedList access$400(DialogRequest dialogRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("e4aa3f15", new Object[]{dialogRequest}) : dialogRequest.startTasks;
    }

    public static /* synthetic */ LinkedList access$500(DialogRequest dialogRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("2810ae56", new Object[]{dialogRequest}) : dialogRequest.stopTasks;
    }

    public boolean isOnRequesting() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7abf9f07", new Object[]{this})).booleanValue() : this.onRequesting;
    }

    public void setOnRequesting(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d09bf9", new Object[]{this, new Boolean(z)});
        } else {
            this.onRequesting = z;
        }
    }

    static {
        kge.a(-817873075);
        DEFAULT_SAMPLE_RATE = 16000;
    }

    public DialogRequest(URI uri, Map<String, String> map, DialogCallback dialogCallback) {
        this.mVoiceCodecs = null;
        this.bytesTransUtil = null;
        this.serverUri = uri;
        this.httpHeaderMap = map;
        initHandler();
        this.innerLister = new DialogListener(this, dialogCallback);
        this.header.put("namespace", Constant.VALUE_NAMESPACE_VIRTUALASSISTANT);
        this.header.put("name", Constant.VALUE_VIRTUALASSISTANT_START_TASK);
        this.payload.put("format", DEFAULT_FORMAT);
        this.payload.put("sample_rate", DEFAULT_SAMPLE_RATE);
        this.transData = new short[320];
        this.mVoiceCodecs = VoiceCodecs.getInstance();
        this.bytesTransUtil = BytesTransUtil.getInstance();
        this.onRequesting = false;
        this.audioInput = new byte[0];
    }

    public void initHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e19fa1", new Object[]{this});
        } else if (this.virtualAssistantHandler != null) {
        } else {
            new Thread(new Runnable() { // from class: com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogRequest.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Looper.prepare();
                    DialogRequest.access$002(DialogRequest.this, new Handler() { // from class: com.alibaba.idst.nls.nlsclientsdk.requests.VirtualAssistant.DialogRequest.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("282a8c19", new Object[]{this, message});
                                return;
                            }
                            int i = message.what;
                            if (i == 1) {
                                DialogRequest.access$100(DialogRequest.this);
                            } else if (i == 2) {
                                DialogRequest.access$200(DialogRequest.this);
                            } else if (i == 3) {
                                DialogRequest.access$300(DialogRequest.this, (InputStream) message.obj);
                            } else if (i != 4) {
                            } else {
                                DialogRequest.this.doSendControlJob(DialogRequest.access$400(DialogRequest.this), DialogRequest.access$500(DialogRequest.this));
                            }
                        }
                    });
                    Looper.loop();
                }
            }, "DialogRequestThread").start();
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        isHandshaking = false;
        this.audioInput = new byte[0];
        Message message = new Message();
        message.what = 1;
        Handler handler = this.virtualAssistantHandler;
        if (handler == null) {
            return;
        }
        handler.sendMessage(message);
    }

    public void setStopTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7418afd", new Object[]{this});
        } else {
            this.onRequesting = false;
        }
    }

    private void doStart() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3479e", new Object[]{this});
            return;
        }
        try {
            if (this.onRequesting) {
                Log.e(TAG, "Still on VA speech recognizing, please waiting for right request over !");
                return;
            }
            TimeStampLogUtil.getInstance();
            TimeStampLogUtil.printLog("time_stamp_start_recognition", getTaskId(), null);
            this.client = JWebSocketClient.getInstance(this.serverUri, this.httpHeaderMap);
            this.conn = this.client.connect(this.innerLister);
            this.startTasks.clear();
            this.stopTasks.clear();
            if (this.payload.containsKey("query")) {
                this.startTasks.add("dialog");
            } else {
                if (this.jobsMode == JobsMode.ASR_DIALOGE) {
                    this.startTasks.add("asr|dialog");
                }
                if (this.jobsMode == JobsMode.ASR) {
                    this.startTasks.add("asr");
                }
            }
            this.payload.put(Constant.VALUE_VIRTUALASSISTANT_START_JOBS, this.startTasks);
            if (this.conn == null) {
                return;
            }
            this.sendBufferCount = 0;
            this.sendBuffer = new byte[0];
            this.onRequesting = true;
            completeLatch = new CountDownLatch(1);
            readyLatch = new CountDownLatch(1);
            this.currentTaskId = getTaskId();
            this.conn.sendText(serialize());
            TimeStampLogUtil.getInstance();
            TimeStampLogUtil.printLog("time_stamp_send_request", null, null);
            if (readyLatch.getCount() > 0) {
                try {
                    z = readyLatch.await(10L, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    z = false;
                }
                if (!z && this.client.getStatus() != JWebSocketClient.WebsocketStatus.STATUS_CLOSED && this.client.getStatus() != JWebSocketClient.WebsocketStatus.STATUS_FAILED) {
                    String format = String.format("timeout after 10 seconds waiting for startDialog confirmation.task_id:%s,state:%s", this.currentTaskId, this.state);
                    Log.e(TAG, format);
                    this.innerLister.onError(new NetworkErrorException(format));
                    return;
                }
                return;
            }
            Log.e(TAG, "readyLatch count 0 ,just skip it!");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void send(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce569e4", new Object[]{this, inputStream});
            return;
        }
        Message message = new Message();
        message.what = 3;
        message.obj = inputStream;
        Handler handler = this.virtualAssistantHandler;
        if (handler == null) {
            return;
        }
        handler.sendMessage(message);
    }

    private void doSend(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b57d19", new Object[]{this, inputStream});
            return;
        }
        try {
            if (getFormat().equals(DEFAULT_FORMAT)) {
                byte[] bArr = new byte[JosStatusCodes.RTN_CODE_COMMON_ERROR];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        return;
                    }
                    this.conn.sendBinary(Arrays.copyOfRange(bArr, 0, read));
                }
            } else if (!getFormat().equals("opu")) {
            } else {
                byte[] bArr2 = new byte[640];
                while (inputStream.read(bArr2) > 0) {
                    this.transData = this.bytesTransUtil.Bytes2Shorts(bArr2);
                    int bufferFrame = this.mVoiceCodecs.bufferFrame(this.transData, this.opu);
                    byte[] bArr3 = new byte[bufferFrame];
                    System.arraycopy(this.opu, 0, bArr3, 0, bufferFrame);
                    if (bufferFrame == 0) {
                        return;
                    }
                    this.conn.sendBinary(bArr3);
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "fail to send binary,current_task_id:{},state:{}" + this.currentTaskId + this.state + e.getMessage());
            e.printStackTrace();
        }
    }

    public void send(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98afd16", new Object[]{this, bArr});
        } else {
            doSend(bArr);
        }
    }

    private void doSend(byte[] bArr) {
        byte[] bArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0eaf401", new Object[]{this, bArr});
            return;
        }
        this.audioInput = appendBytes(this.audioInput, bArr);
        int length = this.audioInput.length;
        try {
            if (this.client == null || this.client.getStatus() != JWebSocketClient.WebsocketStatus.STATUS_CONNECTED || !isHandshaking) {
                return;
            }
            int i = length;
            while (i >= 640) {
                byte[] subBytes = subBytes(this.audioInput, length - i, 640);
                if (getFormat().equals("opu")) {
                    this.transData = this.bytesTransUtil.Bytes2Shorts(subBytes);
                    int bufferFrame = this.mVoiceCodecs.bufferFrame(this.transData, this.opu);
                    bArr2 = new byte[bufferFrame];
                    System.arraycopy(this.opu, 0, bArr2, 0, bufferFrame);
                    if (bufferFrame == 0) {
                        return;
                    }
                } else {
                    bArr2 = bArr;
                }
                this.sendBuffer = appendBytes(this.sendBuffer, bArr2);
                this.sendBufferCount++;
                if (this.sendBufferCount > 10) {
                    String str = "send opu data len:" + this.sendBuffer.length;
                    this.conn.sendBinary(this.sendBuffer);
                    this.sendBuffer = new byte[0];
                    this.sendBufferCount = 0;
                }
                i -= 640;
            }
            if (this.audioInput.length <= 0) {
                return;
            }
            this.audioInput = subBytes(this.audioInput, length - i, i);
        } catch (Exception e) {
            Log.e(TAG, "dosend voice failed! call self stop");
            e.printStackTrace();
            stop();
        }
    }

    public void sendControlJob(LinkedList linkedList, LinkedList linkedList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5329d97f", new Object[]{this, linkedList, linkedList2});
            return;
        }
        Message message = new Message();
        message.what = 4;
        if (linkedList != null) {
            this.startTasks = linkedList;
        }
        if (linkedList2 != null) {
            this.stopTasks = linkedList2;
        }
        Handler handler = this.virtualAssistantHandler;
        if (handler == null) {
            return;
        }
        handler.sendMessage(message);
    }

    public void doSendControlJob(LinkedList linkedList, LinkedList linkedList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47bc0ea", new Object[]{this, linkedList, linkedList2});
        } else if (this.client.getStatus() == JWebSocketClient.WebsocketStatus.STATUS_FAILED || this.client.getStatus() == JWebSocketClient.WebsocketStatus.STATUS_CLOSED) {
            this.onRequesting = false;
        } else {
            SpeechReqProtocol speechReqProtocol = new SpeechReqProtocol();
            speechReqProtocol.setAppKey(getAppKey());
            speechReqProtocol.header.put("namespace", Constant.VALUE_NAMESPACE_VIRTUALASSISTANT);
            speechReqProtocol.header.put("name", Constant.VALUE_VIRTUALASSISTANT_CONTROL_JOB);
            speechReqProtocol.header.put("task_id", this.currentTaskId);
            if (linkedList != null) {
                speechReqProtocol.payload.put(Constant.VALUE_VIRTUALASSISTANT_START_JOBS, linkedList);
            }
            if (linkedList2 != null) {
                speechReqProtocol.payload.put(Constant.VALUE_VIRTUALASSISTANT_STOP_JOBS, linkedList2);
            }
            if (this.conn == null) {
                return;
            }
            this.conn.sendText(speechReqProtocol.serialize());
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (!this.onRequesting) {
        } else {
            this.onRequesting = false;
            Message message = new Message();
            message.what = 2;
            Handler handler = this.virtualAssistantHandler;
            if (handler == null) {
                return;
            }
            handler.sendMessage(message);
        }
    }

    private void doStop() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205a7134", new Object[]{this});
            return;
        }
        try {
            if ((this.client != null && this.client.getStatus() == JWebSocketClient.WebsocketStatus.STATUS_FAILED) || this.client.getStatus() == JWebSocketClient.WebsocketStatus.STATUS_CLOSED) {
                this.onRequesting = false;
                return;
            }
            this.audioInput = new byte[0];
            SpeechReqProtocol speechReqProtocol = new SpeechReqProtocol();
            speechReqProtocol.setAppKey(getAppKey());
            speechReqProtocol.header.put("namespace", Constant.VALUE_NAMESPACE_VIRTUALASSISTANT);
            speechReqProtocol.header.put("name", Constant.VALUE_VIRTUALASSISTANT_STOP_TASK);
            speechReqProtocol.header.put("task_id", this.currentTaskId);
            if (this.conn == null) {
                return;
            }
            String serialize = speechReqProtocol.serialize();
            String str = "send stopJson: " + serialize;
            this.conn.sendText(serialize);
            if (completeLatch != null && this.conn != null && completeLatch.getCount() > 0) {
                try {
                    z = completeLatch.await(10L, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    z = false;
                }
                if (!z) {
                    Log.e(TAG, String.format("timeout after 10 seconds waiting for complete confirmation.task_id:%s,state:%s", this.currentTaskId, this.state));
                }
            }
            this.onRequesting = false;
            close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        try {
            if (this.lock.tryLock(100L, TimeUnit.MILLISECONDS)) {
                this.onRequesting = false;
                this.lock.unlock();
            }
            if (this.conn == null) {
                return;
            }
            this.client.shutdown();
        } catch (InterruptedException unused) {
            Log.e(TAG, "Recognizer close warning!");
        }
    }

    public static void markReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1705445d", new Object[0]);
            return;
        }
        CountDownLatch countDownLatch = readyLatch;
        if (countDownLatch == null) {
            return;
        }
        isHandshaking = true;
        countDownLatch.countDown();
    }

    public static void markComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e0f00ad", new Object[0]);
            return;
        }
        CountDownLatch countDownLatch = completeLatch;
        if (countDownLatch == null) {
            return;
        }
        countDownLatch.countDown();
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        this.virtualAssistantHandler.removeCallbacksAndMessages(null);
        if (Build.VERSION.SDK_INT >= 18) {
            this.virtualAssistantHandler.getLooper().quitSafely();
        }
        JWebSocketClient jWebSocketClient = this.client;
        if (jWebSocketClient == null) {
            return;
        }
        jWebSocketClient.shutdown();
    }

    public String getFormat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1cf61a2c", new Object[]{this}) : (String) this.payload.get("format");
    }

    public void setFormat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217718ca", new Object[]{this, str});
        } else {
            this.payload.put("format", str);
        }
    }

    public Integer getSampleRate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("3742c18e", new Object[]{this}) : (Integer) this.payload.get("sample_rate");
    }

    public void setSampleRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4f1330", new Object[]{this, new Integer(i)});
        } else {
            this.payload.put("sample_rate", Integer.valueOf(i));
        }
    }

    public void enableIntermediateResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770b7174", new Object[]{this, new Boolean(z)});
        } else {
            this.payload.put("enable_intermediate_result", Boolean.valueOf(z));
        }
    }

    public void enablePunctuationPrediction(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef665b27", new Object[]{this, new Boolean(z)});
        } else {
            this.payload.put("enable_punctuation_prediction", Boolean.valueOf(z));
        }
    }

    public void setKeywordListId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18ed16f1", new Object[]{this, str});
        } else {
            this.payload.put(Constant.PROP_ASR_KEYWORD_LIST_ID, str);
        }
    }

    public void setCustomizationId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8973d1d", new Object[]{this, str});
        } else {
            this.payload.put(Constant.PROP_ASR_CUSTOMIZATION_ID, str);
        }
    }

    public void setVocabularyId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6af474", new Object[]{this, str});
        } else {
            this.payload.put(Constant.PROP_ASR_VOCABULARY_ID, str);
        }
    }

    public void setVocabulary(Map<String, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f440836", new Object[]{this, map});
        } else {
            this.payload.put("vocabulary", map);
        }
    }

    public void setClassVocabulary(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cd9ae2", new Object[]{this, map});
        } else {
            this.payload.put(Constant.PROP_ASR_CLASS_VOCABULARY, map);
        }
    }

    public void enableEos(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c702ca67", new Object[]{this, new Boolean(z)});
        } else {
            this.payload.put("enable_eos", Boolean.valueOf(z));
        }
    }

    public void setInverseTextNormalization(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49838dcb", new Object[]{this, new Boolean(z)});
        } else {
            this.payload.put(Constant.PROP_ASR_ENABLE_ITN, Boolean.valueOf(z));
        }
    }

    public void enableVoiceDetection(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a78a317", new Object[]{this, new Boolean(z)});
        } else {
            this.payload.put(Constant.PROP_ASR_ENABLE_VAD, Boolean.valueOf(z));
        }
    }

    public void enableDecoderVoiceDetection(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49290e99", new Object[]{this, new Boolean(z)});
        } else {
            this.payload.put(Constant.PROP_ASR_ENABLE_DECODER_VAD, Boolean.valueOf(z));
        }
    }

    public boolean getEnableVoiceDetection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4840cd7", new Object[]{this})).booleanValue();
        }
        if (!this.payload.containsKey(Constant.PROP_ASR_ENABLE_VAD)) {
            return false;
        }
        return ((Boolean) this.payload.get(Constant.PROP_ASR_ENABLE_VAD)).booleanValue();
    }

    public void setSessionId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648aa560", new Object[]{this, str});
        } else {
            this.payload.put("session_id", str);
        }
    }

    public void setDialogParams(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bee5e8", new Object[]{this, list});
        } else {
            this.payload.put(Constant.PROP_VIRTUALASSISTANT_DIALOG_PARAMS, list);
        }
    }

    public void setDialogContext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720baad6", new Object[]{this, str});
        } else {
            this.payload.put(Constant.PROP_VIRTUALASSISTANT_DIALOG_CONTEXT, str);
        }
    }

    public void setMaxStartSilence(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08a575b", new Object[]{this, new Integer(i)});
        } else {
            this.payload.put(Constant.PROP_ASR_MAX_START_SILENCE, Integer.valueOf(i));
        }
    }

    public void setMaxEndSilence(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff21b5d4", new Object[]{this, new Integer(i)});
        } else {
            this.payload.put(Constant.PROP_ASR_MAX_END_SILENCE, Integer.valueOf(i));
        }
    }

    public JobsMode getJobsMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JobsMode) ipChange.ipc$dispatch("519d6a7f", new Object[]{this}) : this.jobsMode;
    }

    public void setJobsMode(JobsMode jobsMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3349f821", new Object[]{this, jobsMode});
        } else {
            this.jobsMode = jobsMode;
        }
    }

    private static byte[] appendBytes(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a9fd8c57", new Object[]{bArr, bArr2});
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private static byte[] subBytes(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cae38884", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
