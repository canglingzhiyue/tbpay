package com.taobao.live.liveroom.good.model;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;
import tb.kge;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ,\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\u0010"}, d2 = {"Lcom/taobao/live/liveroom/good/model/TaoLiveButtonStateHelper;", "", "<init>", "()V", "appendButtonState", "", "goodLiveContext", "Lcom/taobao/live/liveroom/good/model/TaoLiveGoodLiveContext;", "liveItem", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "enableDoubleButton", "", "showVipShopEnable", "getButtonState", "", "ButtonState", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TaoLiveButtonStateHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/live/liveroom/good/model/TaoLiveButtonStateHelper$ButtonState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DOWN_SHELF", "VIP_BUY", "TIME_SHELF", "PRE_SALE_PREHEATING", "SINGLE_DEFAULT", "SINGLE_DEFAULT_NEWBUY", "PRE_SALE_DEPOSIT", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class ButtonState extends Enum<ButtonState> {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonState[] $VALUES;
        private final String value;
        public static final ButtonState DOWN_SHELF = new ButtonState("DOWN_SHELF", 0, "1");
        public static final ButtonState VIP_BUY = new ButtonState("VIP_BUY", 1, "2");
        public static final ButtonState TIME_SHELF = new ButtonState("TIME_SHELF", 2, "3");
        public static final ButtonState PRE_SALE_PREHEATING = new ButtonState("PRE_SALE_PREHEATING", 3, "4");
        public static final ButtonState SINGLE_DEFAULT = new ButtonState("SINGLE_DEFAULT", 4, "6");
        public static final ButtonState SINGLE_DEFAULT_NEWBUY = new ButtonState("SINGLE_DEFAULT_NEWBUY", 5, "7");
        public static final ButtonState PRE_SALE_DEPOSIT = new ButtonState("PRE_SALE_DEPOSIT", 6, "8");

        private static final /* synthetic */ ButtonState[] $values() {
            return new ButtonState[]{DOWN_SHELF, VIP_BUY, TIME_SHELF, PRE_SALE_PREHEATING, SINGLE_DEFAULT, SINGLE_DEFAULT_NEWBUY, PRE_SALE_DEPOSIT};
        }

        static {
            ButtonState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonState(String str, int i, String str2) {
            this.value = str2;
        }

        public static a<ButtonState> getEntries() {
            return $ENTRIES;
        }

        public static ButtonState valueOf(String str) {
            return (ButtonState) Enum.valueOf(ButtonState.class, str);
        }

        public static ButtonState[] values() {
            return (ButtonState[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    static {
        kge.a(991652607);
    }

    public final void a(f fVar, LiveItem liveItem, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84675c3", new Object[]{this, fVar, liveItem, new Boolean(z), new Boolean(z2)});
        } else if (liveItem == null) {
        } else {
            liveItem.a(b(fVar, liveItem, z, z2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
        if (r10 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String b(com.taobao.live.liveroom.good.model.f r7, com.taobao.live.liveroom.good.model.LiveItem r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.liveroom.good.model.TaoLiveButtonStateHelper.b(com.taobao.live.liveroom.good.model.f, com.taobao.live.liveroom.good.model.LiveItem, boolean, boolean):java.lang.String");
    }
}
