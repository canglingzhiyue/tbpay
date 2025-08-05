package com.taobao.android.fluid.framework.card;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.b;
import com.taobao.android.fluid.framework.data.datamodel.a;
import tb.psw;
import tb.shn;
import tb.sho;
import tb.shv;
import tb.sjt;

/* loaded from: classes5.dex */
public interface ICardService extends FluidService, shn, sho, shv {
    public static final String SERVICE_NAME = "ICardService";
    public static final b WEEX_REMOVE_TIMEOUT_CALLBACKS_ERROR = new b("CARD-1", "Weex 移除超时任务回调失败");
    public static final b WEEX_INSTANCE_CREATE_VIEW_ERROR = new b("CARD-2", "Weex 创建 View 失败");

    psw getActiveCard();

    a.c getActiveCardMediaDetail();

    a getActiveCardMediaSetData();

    long getCardPrivateViewForegroundTime();

    sjt getConfig();

    int getCurrentActiveCellPosition();

    void setActiveCard(psw pswVar);

    void setCardPrivateViewForegroundTime(long j);

    void setCurrentActiveCellPosition(int i);
}
