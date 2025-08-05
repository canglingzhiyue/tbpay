package com.taobao.speech.util;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.alibaba.idst.nls.nlsclientsdk.requests.NlsSpeechClient;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorder;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorderCallback;
import com.alibaba.security.realidentity.p1;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.artc.api.ArtcStats;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.s;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import org.json.JSONObject;
import org.json.JSONTokener;
import tb.iud;
import tb.npj;
import tb.npn;
import tb.npr;
import tb.nps;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0005H\u0002J\u001a\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020\u000bH\u0016J\u001a\u0010$\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020\u000bH\u0016J\u001a\u0010%\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020\u000bH\u0016J\b\u0010&\u001a\u00020\u0015H\u0016J\u001a\u0010'\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020\u000bH\u0016J\u001a\u0010(\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000bH\u0016J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u000bH\u0016J\u001c\u0010.\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010/\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u00103\u001a\u00020\u0015H\u0002J\u001a\u00104\u001a\u00020\u00152\b\u00105\u001a\u0004\u0018\u00010\u00052\u0006\u0010#\u001a\u00020\u000bH\u0002J\u0012\u00106\u001a\u0002072\b\u0010/\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u00108\u001a\u00020\u0015H\u0016J\b\u00109\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/taobao/speech/util/NlsWvClientImplV2;", "Lcom/taobao/speech/util/BaseNlsWvClient;", "Lcom/alibaba/idst/nls/nlsclientsdk/requests/recognizer/SpeechRecognizerWithRecorderCallback;", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "isRetrying", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mIsCompleted", "mIsStarted", "maxRetryCount", "", "nlsClient", "Lcom/alibaba/idst/nls/nlsclientsdk/requests/NlsSpeechClient;", "requestSpeechTokenDisposable", "Lcom/taobao/search/rx/network/mtop/Disposable;", ArtcStats.STAT_RETRYCOUNT, "Ljava/util/concurrent/atomic/AtomicInteger;", "speechRecognizer", "Lcom/alibaba/idst/nls/nlsclientsdk/requests/recognizer/SpeechRecognizerWithRecorder;", "cancel", "", "clearStoreToken", "destroy", "getAccessToken", "getThresholdNlsSpeechTokenExpired", "", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "init", "context", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "initSpeakSdk", "accessToken", "onChannelClosed", "msg", "code", "onRecognizedCompleted", "onRecognizedResultChanged", "onRecognizedStarted", "onTaskFailed", "onVoiceData", "p0", "", p1.d, "onVoiceVolume", Constant.PROP_TTS_VOLUME, "operateConfigSetting", "params", "parseResponse", "Lcom/taobao/speech/util/NlsVoiceContentBean;", "content", "requestNlsSpeechToken", "retryToken", "errorMsg", "start", "", "stop", "stopRequestTokenTask", "tbspeech_android_release"}, k = 1, mv = {1, 1, 11})
/* loaded from: classes8.dex */
public final class d extends com.taobao.speech.util.a implements SpeechRecognizerWithRecorderCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private npn e;
    private SpeechRecognizerWithRecorder f;
    private NlsSpeechClient k;
    private final String d = "NlsWvClientImplV2";
    private AtomicBoolean g = new AtomicBoolean();
    private AtomicBoolean h = new AtomicBoolean(false);
    private AtomicInteger i = new AtomicInteger();
    private AtomicBoolean j = new AtomicBoolean(false);
    private final int l = 3;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == -904532059) {
            super.a((WVCallBackContext) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onRecognizedStarted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a57473", new Object[]{this});
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallback
    public void onVoiceData(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc515b8", new Object[]{this, bArr, new Integer(i)});
        }
    }

    public d() {
        SearchSdk.Companion.b();
    }

    public static final /* synthetic */ AtomicBoolean a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("25c8f266", new Object[]{dVar}) : dVar.j;
    }

    public static final /* synthetic */ void a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa838f0", new Object[]{dVar, str});
        } else {
            dVar.c(str);
        }
    }

    public static final /* synthetic */ void a(d dVar, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155f5813", new Object[]{dVar, str, new Integer(i)});
        } else {
            dVar.a(str, i);
        }
    }

    @Override // com.taobao.speech.util.a, com.taobao.speech.util.b
    public void a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca15efa5", new Object[]{this, wVCallBackContext});
            return;
        }
        super.a(wVCallBackContext);
        String d = d();
        if (d == null) {
            e();
        } else {
            c(d);
        }
    }

    @Override // com.taobao.speech.util.b
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        this.f19705a = true;
        a(this.f, str);
        SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.f;
        if (speechRecognizerWithRecorder != null && this.h.compareAndSet(false, true)) {
            this.g.getAndSet(false);
            speechRecognizerWithRecorder.start();
        }
        return true;
    }

    private final void a(SpeechRecognizerWithRecorder speechRecognizerWithRecorder, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a8f7ce", new Object[]{this, speechRecognizerWithRecorder, str});
        } else if (speechRecognizerWithRecorder == null) {
        } else {
            try {
                Object nextValue = new JSONTokener(str).nextValue();
                if (nextValue == null) {
                    throw new TypeCastException("null cannot be cast to non-null type org.json.JSONObject");
                }
                JSONObject jSONObject = (JSONObject) nextValue;
                speechRecognizerWithRecorder.enableIntermediateResult(q.a((Object) jSONObject.optString("enableIntermediateResult"), (Object) "true"));
                if (!q.a((Object) jSONObject.optString("enableVoiceDetection"), (Object) "true") && !jSONObject.optBoolean("recordAutoStop", false)) {
                    z = false;
                }
                speechRecognizerWithRecorder.enableVoiceDetection(z);
                speechRecognizerWithRecorder.setVocabularyId(jSONObject.optString("asrVocabularyId", null));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.speech.util.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.h.get()) {
        } else {
            this.h.set(false);
            f();
            SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.f;
            if (speechRecognizerWithRecorder == null) {
                return;
            }
            speechRecognizerWithRecorder.stop();
        }
    }

    @Override // com.taobao.speech.util.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f19705a = false;
        if (!this.h.get()) {
            return;
        }
        f();
        this.h.set(false);
        SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.f;
        if (speechRecognizerWithRecorder == null) {
            return;
        }
        speechRecognizerWithRecorder.cancel();
    }

    @Override // com.taobao.speech.util.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.h.set(false);
        this.f = null;
        f();
    }

    private final String d() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        String b2 = s.b("nls_speech_token_v2", "");
        String str = b2;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        String str2 = null;
        try {
            try {
                NlsSpeechTokenResult nlsSpeechTokenResult = (NlsSpeechTokenResult) JSON.parseObject(b2, NlsSpeechTokenResult.class);
                return nlsSpeechTokenResult.getExpire() - (System.currentTimeMillis() / ((long) 1000)) > a(43200L) ? nlsSpeechTokenResult.getToken() : str2;
            } catch (JSONException e) {
                e.printStackTrace();
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    private final long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{this, new Long(j)})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig(r.SEARCH_BIZ_NAME, r.NLS_SPEECH_TOKEN_EXPIRE_THRESHOLD, "");
        return TextUtils.isEmpty(config) ? j : com.taobao.search.mmd.util.d.a(config, j);
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        f();
        this.e = new npr.b().a(new nps("30830", "nls_speech_token")).a(new c()).a().b().c().a(new a(), new b("speechToken"));
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/speech/util/NlsWvClientImplV2$requestNlsSpeechToken$1", "Lcom/taobao/android/searchbaseframe/util/function/Consumer;", "Lcom/taobao/speech/util/NlsSpeechTokenBean;", "accept", "", "nlsSpeechTokenBean", "tbspeech_android_release"}, k = 1, mv = {1, 1, 11})
    /* loaded from: classes8.dex */
    public static final class a implements iud<NlsSpeechTokenBean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.iud
        public void a(NlsSpeechTokenBean nlsSpeechTokenBean) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c7ed994", new Object[]{this, nlsSpeechTokenBean});
                return;
            }
            q.c(nlsSpeechTokenBean, "nlsSpeechTokenBean");
            if (nlsSpeechTokenBean.getResult().isEmpty()) {
                d.a(d.this).set(false);
                d.this.a(0);
                return;
            }
            NlsSpeechTokenResult nlsSpeechTokenResult = nlsSpeechTokenBean.getResult().get(0);
            d.a(d.this, nlsSpeechTokenResult.getToken());
            s.a("nls_speech_token_v2", JSON.toJSONString(nlsSpeechTokenResult));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/speech/util/NlsWvClientImplV2$requestNlsSpeechToken$2", "Lcom/taobao/search/rx/base/SearchBaseErrorConsumer;", "accept", "", "throwable", "", "tbspeech_android_release"}, k = 1, mv = {1, 1, 11})
    /* loaded from: classes8.dex */
    public static final class b extends npj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -73738099) {
                super.a((Throwable) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public b(String str) {
            super(str);
        }

        @Override // tb.npj, tb.iud
        public void a(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                return;
            }
            super.a(th);
            d.a(d.this).set(false);
            d.a(d.this, "Rx request Error", 0);
        }
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        npn npnVar = this.e;
        if (npnVar == null || npnVar.b()) {
            return;
        }
        npnVar.a();
    }

    private final void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (!this.j.compareAndSet(false, true)) {
        } else {
            g();
            if (this.i.get() >= this.l) {
                this.j.set(false);
                a(i);
                return;
            }
            this.i.incrementAndGet();
            e();
        }
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            s.b("nls_speech_token_v2", "");
        }
    }

    private final NlsVoiceContentBean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NlsVoiceContentBean) ipChange.ipc$dispatch("aacda439", new Object[]{this, str});
        }
        NlsVoiceContentBean nlsVoiceContentBean = new NlsVoiceContentBean();
        if (str != null) {
            try {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
                Object obj = parseObject.get("header");
                if (!(obj instanceof com.alibaba.fastjson.JSONObject)) {
                    obj = null;
                }
                com.alibaba.fastjson.JSONObject jSONObject = (com.alibaba.fastjson.JSONObject) obj;
                if (jSONObject != null) {
                    String string = jSONObject.getString("task_id");
                    if (string == null) {
                        string = "";
                    }
                    nlsVoiceContentBean.setTaskId(string);
                    String string2 = jSONObject.getString(Constant.PROP_MESSAGE_ID);
                    if (string2 == null) {
                        string2 = "";
                    }
                    nlsVoiceContentBean.setMessageId(string2);
                    nlsVoiceContentBean.setStatus(jSONObject.getLongValue("status"));
                    String string3 = jSONObject.getString("namespace");
                    if (string3 == null) {
                        string3 = "";
                    }
                    nlsVoiceContentBean.setNamespace(string3);
                    Object obj2 = parseObject.get("payload");
                    if (!(obj2 instanceof com.alibaba.fastjson.JSONObject)) {
                        obj2 = null;
                    }
                    com.alibaba.fastjson.JSONObject jSONObject2 = (com.alibaba.fastjson.JSONObject) obj2;
                    if (jSONObject2 != null) {
                        String string4 = jSONObject2.getString("result");
                        q.a((Object) string4, "payload.getString(\"result\")");
                        nlsVoiceContentBean.setResult(string4);
                        String jSONObject3 = jSONObject2.toString();
                        q.a((Object) jSONObject3, "payload.toString()");
                        nlsVoiceContentBean.setPayload(jSONObject3);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return nlsVoiceContentBean;
    }

    private final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        if (this.k == null) {
            this.k = NlsSpeechClient.getInstance(NlsSpeechClient.DEFAULT_SERVER_ADDR, str);
        }
        NlsSpeechClient nlsSpeechClient = this.k;
        if (nlsSpeechClient != null) {
            nlsSpeechClient.setToken(str);
        }
        NlsSpeechClient nlsSpeechClient2 = this.k;
        this.f = nlsSpeechClient2 != null ? nlsSpeechClient2.createRecognizerWithRecorder(this) : null;
        SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.f;
        if (speechRecognizerWithRecorder == null) {
            return;
        }
        speechRecognizerWithRecorder.setAppKey("3qjVsFYlHINwVNll");
        speechRecognizerWithRecorder.setSampleRate(16000);
        speechRecognizerWithRecorder.enableIntermediateResult(true);
        speechRecognizerWithRecorder.enableVoiceDetection(false);
        speechRecognizerWithRecorder.setFormat("opu");
        speechRecognizerWithRecorder.setInverseTextNormalization(false);
        speechRecognizerWithRecorder.setMaxStartSilence(3000);
        speechRecognizerWithRecorder.setMaxEndSilence(3000);
        this.j.set(false);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onTaskFailed(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea2f011", new Object[]{this, str, new Integer(i)});
        } else if (i == 1002 && str != null && n.b((CharSequence) str, (CharSequence) "403", false, 2, (Object) null)) {
            a(str, i);
        } else {
            a(i);
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onRecognizedCompleted(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f88dc", new Object[]{this, str, new Integer(i)});
            return;
        }
        String str2 = "onRecognizedResultCompleted:" + str + ", " + i;
        if (!this.g.compareAndSet(false, true) || !this.f19705a) {
            return;
        }
        a(i, b(str).getPayload());
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onRecognizedResultChanged(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a218b750", new Object[]{this, str, new Integer(i)});
            return;
        }
        String str2 = "onRecognizedResultChanged:" + str + ", " + i;
        a(i, b(str).getPayload());
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
    public void onChannelClosed(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c4a3e2", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.h.set(false);
        if ((this.j.get() && this.i.get() < this.l) || this.g.compareAndSet(false, true)) {
            return;
        }
        this.g.set(false);
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallback
    public void onVoiceVolume(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78c1fef", new Object[]{this, new Integer(i)});
            return;
        }
        String str = "Callback not implement; onVoiceVolume " + i;
        HashMap hashMap = new HashMap();
        hashMap.put(Constant.PROP_TTS_VOLUME, String.valueOf(i) + "");
        hashMap.put("status", "1");
        hashMap.put("message", "On VoiceVolume");
        a("TBNlsVoiceRecognizer.Event.onVoiceVolume", JSON.toJSONString(hashMap));
    }
}
