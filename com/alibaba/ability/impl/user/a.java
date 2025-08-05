package com.alibaba.ability.impl.user;

import com.taobao.login4android.broadcast.LoginAction;
import tb.kge;

/* loaded from: classes2.dex */
public final /* synthetic */ class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        kge.a(1513794206);
        int[] iArr = new int[LoginAction.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
        $EnumSwitchMapping$0[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
        $EnumSwitchMapping$0[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
        $EnumSwitchMapping$0[LoginAction.NOTIFY_LOGOUT.ordinal()] = 4;
    }
}
