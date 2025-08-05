package com.taobao.live.liveroom.good.model.message;

import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.taolive.room.utils.aw;
import java.io.Serializable;
import kotlin.Metadata;
import tb.kge;
import tb.tpy$b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u00182\u00060\u0002j\u0002`\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/taobao/live/liveroom/good/model/message/SortRule;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "<init>", "()V", "goodsIndex", "", "getGoodsIndex", "()Ljava/lang/Integer;", "setGoodsIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "itemId", "", "getItemId", "()Ljava/lang/String;", "setItemId", "(Ljava/lang/String;)V", "type", NetworkAbility.API_GET_TYPE, "setType", aw.PARAM_SEARCH_KEYWORD_POS, "getPos", "setPos", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SortRule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tpy$b Companion;

    /* renamed from: a  reason: collision with root package name */
    private Integer f17793a;
    private String b;
    private String c;
    private Integer d;

    static {
        kge.a(-1758774590);
        kge.a(1028243835);
        Companion = new tpy$b(null);
    }

    public final Integer getGoodsIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("da1bb580", new Object[]{this}) : this.f17793a;
    }

    public final void setGoodsIndex(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92baf3b2", new Object[]{this, num});
        } else {
            this.f17793a = num;
        }
    }

    public final String getItemId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this}) : this.b;
    }

    public final void setItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7375121", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.c;
    }

    public final void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final Integer getPos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("28b3c88c", new Object[]{this}) : this.d;
    }

    public final void setPos(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ed53be", new Object[]{this, num});
        } else {
            this.d = num;
        }
    }
}
