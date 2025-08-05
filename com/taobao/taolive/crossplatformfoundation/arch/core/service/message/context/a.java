package com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg.OpenArchPMBizCode;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.kge;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0016\u0018\u0000 12\u00020\u0001:\u00011B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001a\u0010(\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\b\"\u0004\b*\u0010\nR\u001a\u0010+\u001a\u00020 X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R\u001a\u0010.\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018¨\u00062"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/CDNMessageProcessorContext;", "", "topic", "", "baseUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTopic", "()Ljava/lang/String;", "setTopic", "(Ljava/lang/String;)V", "getBaseUrl", "setBaseUrl", "bizCode", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizCode;", "getBizCode", "()Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizCode;", "setBizCode", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizCode;)V", "startCDNMessageFetchingWhenSubscribe", "", "getStartCDNMessageFetchingWhenSubscribe", "()Z", "setStartCDNMessageFetchingWhenSubscribe", "(Z)V", "defaultPullInterval", "", "getDefaultPullInterval", "()J", "setDefaultPullInterval", "(J)V", "defaultMaxPullInterval", "", "getDefaultMaxPullInterval", "()I", "setDefaultMaxPullInterval", "(I)V", "defaultTimeout", "getDefaultTimeout", "setDefaultTimeout", "longPullBaseUrl", "getLongPullBaseUrl", "setLongPullBaseUrl", "defaultLongPullTimeout", "getDefaultLongPullTimeout", "setDefaultLongPullTimeout", "liveMessageLongPullDisable", "getLiveMessageLongPullDisable", "setLiveMessageLongPullDisable", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0890a Companion;

    /* renamed from: a  reason: collision with root package name */
    private String f21403a;
    private String b;
    private OpenArchPMBizCode c;
    private boolean d;
    private long e;
    private int f;
    private int g;
    private String h;
    private int i;
    private boolean j;

    static {
        kge.a(552749101);
        Companion = new C0890a(null);
    }

    public a() {
        this(null, null, 3, null);
    }

    public a(String str, String str2) {
        this.f21403a = str;
        this.b = str2;
        this.c = OpenArchPMBizCode.DefaultBizCode;
        this.d = true;
        this.e = 5000L;
        this.f = 10000;
        this.g = 30000;
        this.h = "https://livemsgconnect.taobao.com/live/message";
        this.i = TaobaoMediaPlayer.FFP_PROP_INT64_CPU_IS_QTI_CHIP;
        this.j = true;
    }

    public /* synthetic */ a(String str, String str2, int i, o oVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f21403a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f21403a = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/CDNMessageProcessorContext$Companion;", "", "<init>", "()V", "defaultCDNProcessorContext", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/CDNMessageProcessorContext;", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C0890a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(377200437);
        }

        public /* synthetic */ C0890a(o oVar) {
            this();
        }

        private C0890a() {
        }

        public final a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("996cadf2", new Object[]{this}) : new a(null, "https://impaas.alicdn.com/live/message/", 1, null);
        }
    }
}
