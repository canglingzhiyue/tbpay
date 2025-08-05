package com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.crossplatformfoundation.arch.core.dto_and_do.PMMessageResponse;
import com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context.HeartBeatContext;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;
import com.taobao.uniinfra_kmp.common_utils.f;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.eau;
import tb.kge;
import tb.rul;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 H2\u00020\u0001:\u0001HBg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u00002\b\u00105\u001a\u0004\u0018\u00010,¢\u0006\u0002\u00106J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\fHÆ\u0003Ji\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010C\u001a\u00020,2\b\u00104\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R0\u0010(\u001a\u0016\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0018\u00010*j\u0004\u0018\u0001`)X\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00107\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0011\"\u0004\b9\u0010\u0013¨\u0006I"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMContext;", "Lcom/taobao/uniinfra_kmp/common_utils/KMPNativeCommuBase;", "topic", "", "bizCode", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizCode;", com.taobao.tao.powermsg.model.a.COL_BTAG, "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizTag;", ag.KEY_TAOKE_BIZSCENE, "from", aw.PARAM_PM_PARAMS, "officialLiveRoomHeartBeatContext", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/HeartBeatContext;", "liveRoomHeartBeatContext", "<init>", "(Ljava/lang/String;Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizCode;Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizTag;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/HeartBeatContext;Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/HeartBeatContext;)V", "getTopic", "()Ljava/lang/String;", "setTopic", "(Ljava/lang/String;)V", "getBizCode", "()Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizCode;", "setBizCode", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizCode;)V", "getBizTag", "()Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizTag;", "setBizTag", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizTag;)V", "getBizScene", "setBizScene", "getFrom", "setFrom", "getPmParams", "setPmParams", "getOfficialLiveRoomHeartBeatContext", "()Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/HeartBeatContext;", "setOfficialLiveRoomHeartBeatContext", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/HeartBeatContext;)V", "getLiveRoomHeartBeatContext", "setLiveRoomHeartBeatContext", "customMessageValidCheckAction", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/CustomMessageValidCheckAction;", "Lkotlin/Function1;", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/PMMessageResponse;", "", "getCustomMessageValidCheckAction", "()Lkotlin/jvm/functions/Function1;", "setCustomMessageValidCheckAction", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "merge", "", "other", "useOtherAsBase", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMContext;Ljava/lang/Boolean;)V", "uuid", "getUuid", "setUuid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", eau.PARSER_TAG, "", "hashCode", "", "toString", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a implements com.taobao.uniinfra_kmp.common_utils.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0891a Companion;

    /* renamed from: a  reason: collision with root package name */
    private String f21405a;
    private OpenArchPMBizCode b;
    private OpenArchPMBizTag c;
    private String d;
    private String e;
    private String f;
    private HeartBeatContext g;
    private HeartBeatContext h;
    private rul<? super PMMessageResponse, Boolean> i;
    private String j;

    static {
        kge.a(1286881485);
        kge.a(239485178);
        Companion = new C0891a(null);
    }

    public a() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return q.a((Object) this.f21405a, (Object) aVar.f21405a) && this.b == aVar.b && this.c == aVar.c && q.a((Object) this.d, (Object) aVar.d) && q.a((Object) this.e, (Object) aVar.e) && q.a((Object) this.f, (Object) aVar.f) && q.a(this.g, aVar.g) && q.a(this.h, aVar.h);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f21405a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OpenArchPMBizCode openArchPMBizCode = this.b;
        int hashCode2 = (hashCode + (openArchPMBizCode == null ? 0 : openArchPMBizCode.hashCode())) * 31;
        OpenArchPMBizTag openArchPMBizTag = this.c;
        int hashCode3 = (hashCode2 + (openArchPMBizTag == null ? 0 : openArchPMBizTag.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        HeartBeatContext heartBeatContext = this.g;
        int hashCode7 = (hashCode6 + (heartBeatContext == null ? 0 : heartBeatContext.hashCode())) * 31;
        HeartBeatContext heartBeatContext2 = this.h;
        if (heartBeatContext2 != null) {
            i = heartBeatContext2.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "OpenArchPMContext(topic=" + this.f21405a + ", bizCode=" + this.b + ", bizTag=" + this.c + ", bizScene=" + this.d + ", from=" + this.e + ", pmParams=" + this.f + ", officialLiveRoomHeartBeatContext=" + this.g + ", liveRoomHeartBeatContext=" + this.h + ')';
    }

    public a(String str, OpenArchPMBizCode openArchPMBizCode, OpenArchPMBizTag openArchPMBizTag, String str2, String str3, String str4, HeartBeatContext heartBeatContext, HeartBeatContext heartBeatContext2) {
        this.f21405a = str;
        this.b = openArchPMBizCode;
        this.c = openArchPMBizTag;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = heartBeatContext;
        this.h = heartBeatContext2;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f21405a;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f21405a = str;
        }
    }

    public /* synthetic */ a(String str, OpenArchPMBizCode openArchPMBizCode, OpenArchPMBizTag openArchPMBizTag, String str2, String str3, String str4, HeartBeatContext heartBeatContext, HeartBeatContext heartBeatContext2, int i, o oVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? OpenArchPMBizCode.DefaultBizCode : openArchPMBizCode, (i & 4) != 0 ? OpenArchPMBizTag.TaoBao : openArchPMBizTag, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : heartBeatContext, (i & 128) == 0 ? heartBeatContext2 : null);
    }

    public final OpenArchPMBizCode b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OpenArchPMBizCode) ipChange.ipc$dispatch("95674e1c", new Object[]{this}) : this.b;
    }

    public final rul<PMMessageResponse, Boolean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("1e6d8673", new Object[]{this}) : this.i;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J#\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\b¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u0005¨\u0006\u000e"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMContext$Companion;", "", "<init>", "()V", "defaultContext", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMContext;", "defaultContextWithCustomMessageValid", "action", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/CustomMessageValidCheckAction;", "Lkotlin/Function1;", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/PMMessageResponse;", "", "(Lkotlin/jvm/functions/Function1;)Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMContext;", "defaultContextWithHeartBeat", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C0891a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-518565931);
        }

        public /* synthetic */ C0891a(o oVar) {
            this();
        }

        private C0891a() {
        }

        public final a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("da33a9fd", new Object[]{this}) : new a(null, OpenArchPMBizCode.DefaultBizCode, OpenArchPMBizTag.TaoBao, null, String.valueOf(f.a()), null, null, null, 233, null);
        }
    }

    @Override // com.taobao.uniinfra_kmp.common_utils.c
    public String getUuid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this}) : this.j;
    }

    @Override // com.taobao.uniinfra_kmp.common_utils.c
    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }
}
