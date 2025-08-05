package com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alibaba.idst.nls.nlsclientsdk.requests.SpeechReqProtocol;
import com.alibaba.idst.nls.nlsclientsdk.transport.Connection;
import com.alibaba.idst.nls.nlsclientsdk.transport.javawebsocket.JWebSocketClient;
import com.alibaba.idst.nls.nlsclientsdk.util.IdGen;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes2.dex */
public class FlowingSpeechSynthesizer extends SpeechReqProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_FORMAT = "";
    private static final Integer DEFAULT_SAMPLE_RATE;
    private static final Integer DEFAULT_VOICE_VOLUME;
    private static final String TAG = "Nls.SpeechSynthesizer";
    private JWebSocketClient client;
    private CountDownLatch completeLatch;
    private Connection conn;
    private Map<String, String> httpHeaderMap;
    private FlowingSpeechSynthesizerListener innerListener;
    private URI serverUri;
    private Handler speechSynthesizerHandler;
    private boolean cachedStop = false;
    private final LinkedList<String> ttsTextList = new LinkedList<>();

    public static /* synthetic */ Object ipc$super(FlowingSpeechSynthesizer flowingSpeechSynthesizer, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Handler access$002(FlowingSpeechSynthesizer flowingSpeechSynthesizer, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("484aa5a9", new Object[]{flowingSpeechSynthesizer, handler});
        }
        flowingSpeechSynthesizer.speechSynthesizerHandler = handler;
        return handler;
    }

    public static /* synthetic */ void access$100(FlowingSpeechSynthesizer flowingSpeechSynthesizer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129b90ee", new Object[]{flowingSpeechSynthesizer});
        } else {
            flowingSpeechSynthesizer.doStart();
        }
    }

    static {
        kge.a(-1816910021);
        DEFAULT_SAMPLE_RATE = 16000;
        DEFAULT_VOICE_VOLUME = 50;
    }

    public FlowingSpeechSynthesizer(URI uri, Map<String, String> map, SpeechSynthesizerCallback speechSynthesizerCallback) {
        this.serverUri = uri;
        this.httpHeaderMap = map;
        initSynthesizerHandler();
        this.innerListener = new FlowingSpeechSynthesizerListener(this, speechSynthesizerCallback);
        this.header.put("namespace", Constant.VALUE_NAMESPACE_FLOWING_TTS);
        this.header.put("name", Constant.VALUE_NAME_TTS_START);
        this.payload.put("format", "");
        this.payload.put("sample_rate", DEFAULT_SAMPLE_RATE);
    }

    private void initSynthesizerHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0df959", new Object[]{this});
        } else if (this.speechSynthesizerHandler != null) {
        } else {
            new Thread(new Runnable() { // from class: com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer.FlowingSpeechSynthesizer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Looper.prepare();
                    FlowingSpeechSynthesizer.access$002(FlowingSpeechSynthesizer.this, new Handler() { // from class: com.alibaba.idst.nls.nlsclientsdk.requests.Synthesizer.FlowingSpeechSynthesizer.1.1
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
                                FlowingSpeechSynthesizer.access$100(FlowingSpeechSynthesizer.this);
                            } else if (i == 2) {
                                FlowingSpeechSynthesizer.this.doSendCachedTexts();
                            } else if (i != 3) {
                            } else {
                                FlowingSpeechSynthesizer.this.doStop();
                            }
                        }
                    });
                    Looper.loop();
                }
            }, "FlowingSpeechSynthesizerThread").start();
        }
    }

    public void setVoice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("901ac881", new Object[]{this, str});
        } else {
            this.payload.put("voice", str);
        }
    }

    public void streamingCall(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62689871", new Object[]{this, str});
            return;
        }
        String str2 = "CALL SpeechSynthesizer.streamingCall with text:" + str;
        if (this.innerListener.isReady() && this.ttsTextList.isEmpty()) {
            this.header.put("name", Constant.VALUE_NAME_TTS_RUN_SYNTHESIS);
            this.header.put(Constant.PROP_MESSAGE_ID, IdGen.genId());
            this.payload.clear();
            this.payload.put("text", str);
            this.conn.sendText(serialize());
            return;
        }
        this.ttsTextList.add(str);
    }

    public boolean stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6623bb8d", new Object[]{this})).booleanValue();
        }
        if (!this.innerListener.isReady()) {
            this.cachedStop = true;
            return false;
        }
        Message message = new Message();
        message.what = 3;
        Handler handler = this.speechSynthesizerHandler;
        if (handler != null) {
            handler.sendMessage(message);
        }
        return true;
    }

    public void doStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205a7134", new Object[]{this});
        } else if (!this.innerListener.isReady()) {
            Log.e(TAG, "error 'stopSynthesis' before synthesizer started!");
        } else {
            this.header.put("name", Constant.VALUE_NAME_TTS_STOP_SYNTHESIS);
            this.header.put(Constant.PROP_MESSAGE_ID, IdGen.genId());
            this.payload.clear();
            this.conn.sendText(serialize());
        }
    }

    public void sendCachedTexts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92daeec3", new Object[]{this});
            return;
        }
        Message message = new Message();
        message.what = 2;
        Handler handler = this.speechSynthesizerHandler;
        if (handler == null) {
            return;
        }
        handler.sendMessage(message);
    }

    public void doSendCachedTexts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387a9038", new Object[]{this});
            return;
        }
        LinkedList<String> linkedList = this.ttsTextList;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        Iterator<String> it = this.ttsTextList.iterator();
        while (it.hasNext()) {
            this.header.put("name", Constant.VALUE_NAME_TTS_RUN_SYNTHESIS);
            this.header.put(Constant.PROP_MESSAGE_ID, IdGen.genId());
            this.payload.clear();
            this.context.clear();
            this.payload.put("text", it.next());
            this.conn.sendText(serialize());
        }
        this.ttsTextList.clear();
        this.innerListener.countDownReadyLatch();
        if (!this.cachedStop) {
            return;
        }
        this.cachedStop = false;
        stop();
    }

    public void setFormat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217718ca", new Object[]{this, str});
        } else if (str == null || str.equals("")) {
        } else {
            this.payload.put("format", str);
        }
    }

    public void setSampleRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4f1330", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
        } else {
            this.payload.put("sample_rate", Integer.valueOf(i));
        }
    }

    public void setSpeechRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0659ef8", new Object[]{this, new Integer(i)});
        } else {
            this.payload.put(Constant.PROP_TTS_SPEECH_RATE, Integer.valueOf(i));
        }
    }

    public void setVoiceVolume(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515e6872", new Object[]{this, new Integer(i)});
        } else if (i <= 0) {
        } else {
            this.payload.put(Constant.PROP_TTS_VOLUME, Integer.valueOf(i));
        }
    }

    public void setPitchRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9f781e", new Object[]{this, new Integer(i)});
        } else {
            this.payload.put(Constant.PROP_TTS_PITCH_RATE, Integer.valueOf(i));
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        Message message = new Message();
        message.what = 1;
        Handler handler = this.speechSynthesizerHandler;
        if (handler == null) {
            return;
        }
        handler.sendMessage(message);
    }

    private void doStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3479e", new Object[]{this});
            return;
        }
        setTaskId(IdGen.genId());
        if (this.innerListener.isWebsocketConnecting().booleanValue()) {
            Log.e(TAG, "WebSocketClient objects are not reusable, you need cancel old connection");
            return;
        }
        this.client = JWebSocketClient.getInstance(this.serverUri, this.httpHeaderMap);
        this.conn = this.client.connect(this.innerListener);
        if (this.conn == null) {
            return;
        }
        try {
            this.header.put("name", Constant.VALUE_NAME_TTS_START);
            this.conn.sendText(serialize());
            this.completeLatch = new CountDownLatch(1);
            this.innerListener.setCompleteLatch(this.completeLatch);
        } catch (Exception e) {
            Log.e(TAG, "SpeechSynthesizer :" + e.getMessage());
        }
    }

    public void waitForComplete(int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3731e70f", new Object[]{this, new Integer(i)});
        } else {
            this.completeLatch.await(i, TimeUnit.SECONDS);
        }
    }

    public void waitForComplete() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09da74", new Object[]{this});
        } else {
            this.completeLatch.await();
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (this.conn == null) {
        } else {
            this.client.shutdown();
        }
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        this.speechSynthesizerHandler.removeCallbacksAndMessages(null);
        if (Build.VERSION.SDK_INT >= 18) {
            this.speechSynthesizerHandler.getLooper().quitSafely();
        }
        this.speechSynthesizerHandler = null;
        JWebSocketClient jWebSocketClient = this.client;
        if (jWebSocketClient == null) {
            return;
        }
        jWebSocketClient.shutdown();
    }
}
