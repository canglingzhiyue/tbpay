package com.taobao.taolive.crossplatformfoundation.arch.core.dto_and_do;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.c;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.kge;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 =2\u00020\u00012\u00060\u0003j\u0002`\u0002:\u0001=B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001e\u0010!\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R\u001e\u00103\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u0010\n\u0002\u00109\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010:\u001a\u0004\u0018\u00010%X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010'\"\u0004\b<\u0010)¨\u0006>"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/CDNMessageResponse;", "Lcom/taobao/uniinfra_kmp/common_utils/KMPNativeCommuBase;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "<init>", "()V", "startTime", "", "getStartTime", "()Ljava/lang/Long;", "setStartTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "endTime", "getEndTime", "setEndTime", "payloads", "", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/CDNMessagePayload;", "getPayloads", "()Ljava/util/List;", "setPayloads", "(Ljava/util/List;)V", "dataSize", "", "getDataSize", "()Ljava/lang/Integer;", "setDataSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "colorRate", "getColorRate", "setColorRate", "pullInterval", "getPullInterval", "setPullInterval", "pullPolicy", "", "getPullPolicy", "()Ljava/lang/String;", "setPullPolicy", "(Ljava/lang/String;)V", "subTypeColorRate", "", "getSubTypeColorRate", "()Ljava/util/Map;", "setSubTypeColorRate", "(Ljava/util/Map;)V", "traceId", "getTraceId", "setTraceId", "hasError", "", "getHasError", "()Ljava/lang/Boolean;", "setHasError", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "uuid", "getUuid", "setUuid", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CDNMessageResponse implements c, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private Integer colorRate;
    private Integer dataSize;
    private Long endTime;
    private Boolean hasError;
    private List<CDNMessagePayload> payloads;
    private Integer pullInterval;
    private String pullPolicy;
    private Long startTime;
    private Map<Integer, Integer> subTypeColorRate;
    private String traceId;
    private String uuid;

    static {
        kge.a(1940175171);
        kge.a(239485178);
        kge.a(1028243835);
        Companion = new a(null);
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

    public final Long getStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("7e8a3975", new Object[]{this}) : this.startTime;
    }

    public final void setStartTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c70253", new Object[]{this, l});
        } else {
            this.startTime = l;
        }
    }

    public final Long getEndTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("a1c6a25c", new Object[]{this}) : this.endTime;
    }

    public final void setEndTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ecc34c", new Object[]{this, l});
        } else {
            this.endTime = l;
        }
    }

    public final List<CDNMessagePayload> getPayloads() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d4a41ce5", new Object[]{this}) : this.payloads;
    }

    public final void setPayloads(List<CDNMessagePayload> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9582f91f", new Object[]{this, list});
        } else {
            this.payloads = list;
        }
    }

    public final Integer getDataSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("9a8f356f", new Object[]{this}) : this.dataSize;
    }

    public final void setDataSize(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3dfea3", new Object[]{this, num});
        } else {
            this.dataSize = num;
        }
    }

    public final Integer getColorRate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("2344985b", new Object[]{this}) : this.colorRate;
    }

    public final void setColorRate(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cde0c4cf", new Object[]{this, num});
        } else {
            this.colorRate = num;
        }
    }

    public final Integer getPullInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("64adec8e", new Object[]{this}) : this.pullInterval;
    }

    public final void setPullInterval(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77585164", new Object[]{this, num});
        } else {
            this.pullInterval = num;
        }
    }

    public final String getPullPolicy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a691914c", new Object[]{this}) : this.pullPolicy;
    }

    public final void setPullPolicy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28a1faa", new Object[]{this, str});
        } else {
            this.pullPolicy = str;
        }
    }

    public final Map<Integer, Integer> getSubTypeColorRate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a3eb1e9b", new Object[]{this}) : this.subTypeColorRate;
    }

    public final void setSubTypeColorRate(Map<Integer, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6119b353", new Object[]{this, map});
        } else {
            this.subTypeColorRate = map;
        }
    }

    public final String getTraceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this}) : this.traceId;
    }

    public final void setTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8b6e8f", new Object[]{this, str});
        } else {
            this.traceId = str;
        }
    }

    public final Boolean getHasError() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("8ca1e448", new Object[]{this}) : this.hasError;
    }

    public final void setHasError(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bae8756", new Object[]{this, bool});
        } else {
            this.hasError = bool;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/CDNMessageResponse$Companion;", "", "<init>", "()V", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-247714613);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
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
}
