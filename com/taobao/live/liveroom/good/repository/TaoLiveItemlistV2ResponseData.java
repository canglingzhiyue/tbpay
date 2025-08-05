package com.taobao.live.liveroom.good.repository;

import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.liveroom.good.model.LiveItem;
import java.io.Serializable;
import kotlin.Metadata;
import tb.kge;
import tb.tpz$a;
import tb.tpz$b$b;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u00060\u0002j\u0002`\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/taobao/live/liveroom/good/repository/TaoLiveItemlistV2ResponseData;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "<init>", "()V", "Companion", "ItemListv1", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TaoLiveItemlistV2ResponseData implements Serializable {
    public static final tpz$a Companion;

    static {
        kge.a(-254013157);
        kge.a(1028243835);
        Companion = new tpz$a(null);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001a2\u00060\u0002j\u0002`\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/taobao/live/liveroom/good/repository/TaoLiveItemlistV2ResponseData$ItemListv1;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "<init>", "()V", "explained", "", "getExplained", "()Ljava/lang/String;", "setExplained", "(Ljava/lang/String;)V", "goodsIndex", "getGoodsIndex", "setGoodsIndex", "liveItemDO", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "getLiveItemDO", "()Lcom/taobao/live/liveroom/good/model/LiveItem;", "setLiveItemDO", "(Lcom/taobao/live/liveroom/good/model/LiveItem;)V", "sliceNum", "getSliceNum", "setSliceNum", "scene", "getScene", ExtTransportOffice.METHOD_SETSCENE, "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class ItemListv1 implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final tpz$b$b Companion;

        /* renamed from: a  reason: collision with root package name */
        private String f17794a;
        private String b;
        private LiveItem c;
        private String d;
        private String e;

        static {
            kge.a(-1694213163);
            kge.a(1028243835);
            Companion = new tpz$b$b(null);
        }

        public final String getExplained() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a8e141d9", new Object[]{this}) : this.f17794a;
        }

        public final void setExplained(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f584b525", new Object[]{this, str});
            } else {
                this.f17794a = str;
            }
        }

        public final String getGoodsIndex() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("95c72f27", new Object[]{this}) : this.b;
        }

        public final void setGoodsIndex(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a083d2f", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public final LiveItem a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LiveItem) ipChange.ipc$dispatch("a01a6e5e", new Object[]{this}) : this.c;
        }

        public final void setLiveItemDO(LiveItem liveItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82618223", new Object[]{this, liveItem});
            } else {
                this.c = liveItem;
            }
        }

        public final String getSliceNum() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("664e472f", new Object[]{this}) : this.d;
        }

        public final void setSliceNum(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee57f927", new Object[]{this, str});
            } else {
                this.d = str;
            }
        }

        public final String getScene() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this}) : this.e;
        }

        public final void setScene(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9147a05b", new Object[]{this, str});
            } else {
                this.e = str;
            }
        }
    }
}
