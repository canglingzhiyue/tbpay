package com.taobao.themis.pub_kit.guide.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R \u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/model/PubPropertiesModel;", "Ljava/io/Serializable;", "()V", "backFatigueCountValue", "", "getBackFatigueCountValue", "()Ljava/lang/Integer;", "setBackFatigueCountValue", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "backFatigueDayValue", "getBackFatigueDayValue", "setBackFatigueDayValue", "operateGuideBizFatigueConfig", "Lcom/taobao/themis/pub_kit/guide/model/PubPropertiesFatigueModel;", "getOperateGuideBizFatigueConfig", "()Lcom/taobao/themis/pub_kit/guide/model/PubPropertiesFatigueModel;", "setOperateGuideBizFatigueConfig", "(Lcom/taobao/themis/pub_kit/guide/model/PubPropertiesFatigueModel;)V", "operateGuideUserFatigueConfig", "getOperateGuideUserFatigueConfig", "setOperateGuideUserFatigueConfig", "totalGuidePopupUserFatigueConfig", "getTotalGuidePopupUserFatigueConfig", "setTotalGuidePopupUserFatigueConfig", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubPropertiesModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Integer backFatigueCountValue;
    private Integer backFatigueDayValue;
    private PubPropertiesFatigueModel operateGuideBizFatigueConfig;
    private PubPropertiesFatigueModel operateGuideUserFatigueConfig;
    @JSONField(name = "totalGuidePopupUserFatigueConfig")
    private PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig;

    static {
        kge.a(-1546072349);
        kge.a(1028243835);
    }

    public final Integer getBackFatigueDayValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("da60aaad", new Object[]{this}) : this.backFatigueDayValue;
    }

    public final void setBackFatigueDayValue(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a71dbd", new Object[]{this, num});
        } else {
            this.backFatigueDayValue = num;
        }
    }

    public final Integer getBackFatigueCountValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("28de2da", new Object[]{this}) : this.backFatigueCountValue;
    }

    public final void setBackFatigueCountValue(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87519830", new Object[]{this, num});
        } else {
            this.backFatigueCountValue = num;
        }
    }

    public final PubPropertiesFatigueModel getTotalGuidePopupUserFatigueConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubPropertiesFatigueModel) ipChange.ipc$dispatch("1cb0150", new Object[]{this}) : this.totalGuidePopupUserFatigueConfig;
    }

    public final void setTotalGuidePopupUserFatigueConfig(PubPropertiesFatigueModel pubPropertiesFatigueModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a12a6", new Object[]{this, pubPropertiesFatigueModel});
        } else {
            this.totalGuidePopupUserFatigueConfig = pubPropertiesFatigueModel;
        }
    }

    public final PubPropertiesFatigueModel getOperateGuideUserFatigueConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubPropertiesFatigueModel) ipChange.ipc$dispatch("aaff6c40", new Object[]{this}) : this.operateGuideUserFatigueConfig;
    }

    public final void setOperateGuideUserFatigueConfig(PubPropertiesFatigueModel pubPropertiesFatigueModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c60e54e", new Object[]{this, pubPropertiesFatigueModel});
        } else {
            this.operateGuideUserFatigueConfig = pubPropertiesFatigueModel;
        }
    }

    public final PubPropertiesFatigueModel getOperateGuideBizFatigueConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PubPropertiesFatigueModel) ipChange.ipc$dispatch("48d5514", new Object[]{this}) : this.operateGuideBizFatigueConfig;
    }

    public final void setOperateGuideBizFatigueConfig(PubPropertiesFatigueModel pubPropertiesFatigueModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea19162", new Object[]{this, pubPropertiesFatigueModel});
        } else {
            this.operateGuideBizFatigueConfig = pubPropertiesFatigueModel;
        }
    }
}
