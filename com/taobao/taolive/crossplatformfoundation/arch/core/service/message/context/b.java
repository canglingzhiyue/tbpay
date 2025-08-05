package com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/CompensationMessageProcessorContext;", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/CDNMessageProcessorContext;", "topic", "", "baseUrl", "compensationType", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/OpenArchMessageCompensationType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/OpenArchMessageCompensationType;)V", "getTopic", "()Ljava/lang/String;", "setTopic", "(Ljava/lang/String;)V", "getBaseUrl", "setBaseUrl", "getCompensationType", "()Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/OpenArchMessageCompensationType;", "setCompensationType", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/OpenArchMessageCompensationType;)V", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b extends com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private String f21404a;
    private String b;
    private OpenArchMessageCompensationType c;

    static {
        kge.a(-1896146508);
        Companion = new a(null);
    }

    public b() {
        this(null, null, null, 7, null);
    }

    @Override // com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f21404a;
    }

    @Override // com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f21404a = str;
        }
    }

    public /* synthetic */ b(String str, String str2, OpenArchMessageCompensationType openArchMessageCompensationType, int i, o oVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? OpenArchMessageCompensationType.Unknown : openArchMessageCompensationType);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¨\u0006\t"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/CompensationMessageProcessorContext$Companion;", "", "<init>", "()V", "defaultGoodsCompensationContext", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/CompensationMessageProcessorContext;", "defaultCommentCompensationContext", "defaultCompensationContextList", "", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-720538628);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        private final b b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e16c0c70", new Object[]{this}) : new b(null, "", OpenArchMessageCompensationType.Goods, 1, null);
        }

        private final b c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("296b6acf", new Object[]{this}) : new b(null, "", OpenArchMessageCompensationType.Comment, 1, null);
        }

        public final List<b> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : p.b(b(), c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, OpenArchMessageCompensationType compensationType) {
        super(str, str2);
        q.d(compensationType, "compensationType");
        this.f21404a = str;
        this.b = str2;
        this.c = compensationType;
    }
}
