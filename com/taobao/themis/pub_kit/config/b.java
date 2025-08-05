package com.taobao.themis.pub_kit.config;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.pub_kit.config.PubContainerConfigClient;
import com.taobao.themis.pub_kit.config.c;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.pub_kit.utils.h;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\tJ\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/pub_kit/config/PubContainerConfigTask;", "", "mAppId", "", "(Ljava/lang/String;)V", "containerConfigHasCallBack", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/taobao/themis/pub_kit/config/PubContainerConfigTask$PubContainerConfigTaskListener;", "mPubUserGuideModule", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "mSyncLock", "Ljava/util/concurrent/CountDownLatch;", e.RECORD_EXECUTE, "", "sourceChannel", "isNeedRequest", "", "getAsync", DataReceiveMonitor.CB_LISTENER, "getSync", "Companion", "PubContainerConfigTaskListener", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final ConcurrentHashMap<String, b> f;

    /* renamed from: a  reason: collision with root package name */
    private PubUserGuideModule f22779a;
    private CountDownLatch b;
    private final CopyOnWriteArrayList<Object> c;
    private final AtomicBoolean d;
    private final String e;

    public static final /* synthetic */ String a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ba7e23ef", new Object[]{bVar}) : bVar.e;
    }

    public static final /* synthetic */ void a(b bVar, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac14b456", new Object[]{bVar, pubUserGuideModule});
        } else {
            bVar.f22779a = pubUserGuideModule;
        }
    }

    public static final /* synthetic */ AtomicBoolean b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("f142a692", new Object[]{bVar}) : bVar.d;
    }

    public static final /* synthetic */ PubUserGuideModule c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubUserGuideModule) ipChange.ipc$dispatch("2da799e8", new Object[]{bVar}) : bVar.f22779a;
    }

    public static final /* synthetic */ CountDownLatch d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("f7a8e6ba", new Object[]{bVar}) : bVar.b;
    }

    public static final /* synthetic */ CopyOnWriteArrayList e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("1b0c61c2", new Object[]{bVar}) : bVar.c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/taobao/themis/pub_kit/config/PubContainerConfigTask$execute$1", "Lcom/taobao/themis/pub_kit/config/PubIconChangeDataTask$IconChangeTaskListener;", "onDeltaData", "", "deltaData", "Lcom/alibaba/fastjson/JSONObject;", "onIconChange", "iconChangeData", "Lcom/alibaba/fastjson/JSONArray;", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f22780a;
        public final /* synthetic */ String b;

        @Override // com.taobao.themis.pub_kit.config.c.b
        public void a(JSONArray jSONArray) {
            PubContainerConfigClient.PubContainerConfigRequestParam pubContainerConfigRequestParam;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
                return;
            }
            TMSLogger.b("PubContainerConfigTask", "onIconChange: " + jSONArray);
            if (h.INSTANCE.f(jSONArray)) {
                String a2 = b.a(this.f22780a);
                String str = this.b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("enableAddIconButton", (Object) true);
                t tVar = t.INSTANCE;
                pubContainerConfigRequestParam = new PubContainerConfigClient.PubContainerConfigRequestParam(a2, str, jSONObject);
            } else {
                pubContainerConfigRequestParam = new PubContainerConfigClient.PubContainerConfigRequestParam(b.a(this.f22780a), this.b, null);
            }
            new PubContainerConfigClient(pubContainerConfigRequestParam, new a()).a();
            com.taobao.themis.kernel.utils.a.a(new PubContainerConfigTask$execute$1$onIconChange$1(this), 3000L);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/taobao/themis/pub_kit/config/PubContainerConfigTask$execute$1$onIconChange$pubContainerConfigListener$1", "Lcom/taobao/themis/kernel/network/CommonListener;", "Lcom/alibaba/fastjson/JSONObject;", "onFailure", "", "errorCode", "", "errorMsg", InputFrame3.TYPE_RESPONSE, "onSuccess", "userGuideModule", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
        /* loaded from: classes9.dex */
        public static final class a implements com.taobao.themis.kernel.network.b<JSONObject, JSONObject> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.taobao.themis.kernel.network.b
            public /* synthetic */ void onFailure(String str, String str2, JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ec067822", new Object[]{this, str, str2, jSONObject});
                } else {
                    a(str, str2, jSONObject);
                }
            }

            @Override // com.taobao.themis.kernel.network.b
            public /* synthetic */ void onSuccess(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, jSONObject});
                } else {
                    a(jSONObject);
                }
            }

            public void a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                    return;
                }
                if (b.b(c.this.f22780a).get()) {
                    TMSLogger.d("PubContainerConfigTask", "mtop请求超时");
                }
                b.b(c.this.f22780a).set(true);
                b.a(c.this.f22780a, jSONObject != null ? (PubUserGuideModule) jSONObject.toJavaObject(PubUserGuideModule.class) : null);
                b.d(c.this.f22780a).countDown();
                Iterator it = b.e(c.this.f22780a).iterator();
                while (it.hasNext()) {
                    it.next();
                    b.c(c.this.f22780a);
                }
                b.e(c.this.f22780a).clear();
            }

            public void a(String str, String str2, JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
                    return;
                }
                if (b.b(c.this.f22780a).get()) {
                    TMSLogger.d("PubContainerConfigTask", "mtop请求超时");
                }
                b.b(c.this.f22780a).set(true);
                b.d(c.this.f22780a).countDown();
                Iterator it = b.e(c.this.f22780a).iterator();
                while (it.hasNext()) {
                    it.next();
                }
                b.e(c.this.f22780a).clear();
                TMSLogger.d("PubContainerConfigTask", "errorCode = " + str + ", errorMsg = " + str2 + ", response = " + jSONObject);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/taobao/themis/pub_kit/config/PubContainerConfigTask$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "instances", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/taobao/themis/pub_kit/config/PubContainerConfigTask;", "getInstance", "appId", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(1382755727);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-818602233);
        Companion = new a(null);
        f = new ConcurrentHashMap<>();
    }
}
