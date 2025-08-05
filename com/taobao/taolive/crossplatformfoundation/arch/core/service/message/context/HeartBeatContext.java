package com.taobao.taolive.crossplatformfoundation.arch.core.service.message.context;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.d;
import com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg.OpenArchPMBizCode;
import com.taobao.taolive.room.utils.ag;
import com.taobao.uniinfra_kmp.common_utils.c;
import com.taobao.weex.common.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 $2\u00020\u00012\u00060\u0003j\u0002`\u0002:\u0001$B7\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/HeartBeatContext;", "Lcom/taobao/uniinfra_kmp/common_utils/KMPNativeCommuBase;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "APIName", "", d.PARAM_SESSION_ID, "topic", ag.KEY_TAOKE_BIZSCENE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAPIName", "()Ljava/lang/String;", "setAPIName", "(Ljava/lang/String;)V", "getSessionID", "setSessionID", "getTopic", "setTopic", "getBizScene", "setBizScene", "uuid", "getUuid", "setUuid", "bizCode", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizCode;", "getBizCode", "()Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizCode;", "setBizCode", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMBizCode;)V", Constants.Name.INTERVAL, "", "getInterval", "()J", "setInterval", "(J)V", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HeartBeatContext implements c, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private String APIName;
    private OpenArchPMBizCode bizCode;
    private String bizScene;
    private long interval;
    private String sessionID;
    private String topic;
    private String uuid;

    static {
        kge.a(1118715049);
        kge.a(239485178);
        kge.a(1028243835);
        Companion = new a(null);
    }

    public HeartBeatContext() {
        this(null, null, null, null, 15, null);
    }

    public c keepObj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("892207ae", new Object[]{this}) : c.a.a(this);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            c.a.b(this);
        }
    }

    public HeartBeatContext(String str, String str2, String str3, String str4) {
        this.APIName = str;
        this.sessionID = str2;
        this.topic = str3;
        this.bizScene = str4;
        this.bizCode = OpenArchPMBizCode.DefaultBizCode;
        this.interval = 10000L;
    }

    public /* synthetic */ HeartBeatContext(String str, String str2, String str3, String str4, int i, o oVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4);
    }

    public final String getAPIName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1fd74aca", new Object[]{this}) : this.APIName;
    }

    public final void setAPIName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2159754", new Object[]{this, str});
        } else {
            this.APIName = str;
        }
    }

    public final String getSessionID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ed78a5e", new Object[]{this}) : this.sessionID;
    }

    public final void setSessionID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e577d40", new Object[]{this, str});
        } else {
            this.sessionID = str;
        }
    }

    public final String getTopic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this}) : this.topic;
    }

    public final void setTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.topic = str;
        }
    }

    public final String getBizScene() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e69425aa", new Object[]{this}) : this.bizScene;
    }

    public final void setBizScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76cdea0c", new Object[]{this, str});
        } else {
            this.bizScene = str;
        }
    }

    @Override // com.taobao.uniinfra_kmp.common_utils.c
    public String getUuid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this}) : this.uuid;
    }

    @Override // com.taobao.uniinfra_kmp.common_utils.c
    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            this.uuid = str;
        }
    }

    public final OpenArchPMBizCode getBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OpenArchPMBizCode) ipChange.ipc$dispatch("60becb24", new Object[]{this}) : this.bizCode;
    }

    public final void setBizCode(OpenArchPMBizCode openArchPMBizCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc35167e", new Object[]{this, openArchPMBizCode});
            return;
        }
        q.d(openArchPMBizCode, "<set-?>");
        this.bizCode = openArchPMBizCode;
    }

    public final long getInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("34e1136", new Object[]{this})).longValue() : this.interval;
    }

    public final void setInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af436", new Object[]{this, new Long(j)});
        } else {
            this.interval = j;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/HeartBeatContext$Companion;", "", "<init>", "()V", "defaultContext4LiveRoom", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/context/HeartBeatContext;", "defaultContext4OfficialLiveRoom", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1549981519);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }
}
