package com.taobao.mytaobao.homepage.busniess.acds;

import mtopsdk.common.util.StringUtils;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class DealInfo implements Serializable, IMTOPDataObject {
    public static final String KEY_HAS_PAID = "hasPaid";
    public static final String KEY_TO_COMMENT = "toComment";
    public static final String KEY_TO_CONFIRM = "toConfirmBiz";
    public static final String KEY_TO_PAY = "toPayBiz";
    public static final String KEY_TO_REFUND = "refundBiz";
    private static final long serialVersionUID = 4591266114586077726L;
    public String hasPaid;
    public String refundBiz;
    public String toComment;
    public String toConfirmBiz;
    public String toPayBiz;

    static {
        kge.a(-785457198);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public boolean isSameBiz(DealInfo dealInfo, boolean z, String... strArr) {
        if (dealInfo == null || strArr == null) {
            return z;
        }
        boolean z2 = true;
        for (String str : strArr) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1880185434:
                    if (str.equals(KEY_TO_PAY)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1263537394:
                    if (str.equals(KEY_TO_CONFIRM)) {
                        c = 2;
                        break;
                    }
                    break;
                case -712816796:
                    if (str.equals(KEY_TO_COMMENT)) {
                        c = 3;
                        break;
                    }
                    break;
                case -470855045:
                    if (str.equals(KEY_TO_REFUND)) {
                        c = 4;
                        break;
                    }
                    break;
                case 696814726:
                    if (str.equals(KEY_HAS_PAID)) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                z2 = StringUtils.equals(this.toPayBiz, dealInfo.toPayBiz);
            } else if (c == 1) {
                z2 = StringUtils.equals(this.hasPaid, dealInfo.hasPaid);
            } else if (c == 2) {
                z2 = StringUtils.equals(this.toConfirmBiz, dealInfo.toConfirmBiz);
            } else if (c == 3) {
                z2 = StringUtils.equals(this.toComment, dealInfo.toComment);
            } else if (c == 4) {
                z2 = StringUtils.equals(this.refundBiz, dealInfo.refundBiz);
            }
            if (!z2) {
                return z2;
            }
        }
        return z2;
    }

    public boolean isSameBiz(DealInfo dealInfo, String... strArr) {
        return isSameBiz(dealInfo, false, strArr);
    }

    public static DealInfo createZeroCount() {
        DealInfo dealInfo = new DealInfo();
        dealInfo.hasPaid = "0";
        dealInfo.toComment = "0";
        dealInfo.toConfirmBiz = "0";
        dealInfo.refundBiz = "0";
        dealInfo.toPayBiz = "0";
        return dealInfo;
    }
}
