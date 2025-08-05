package com.taobao.themis.taobao.container;

import com.taobao.themis.kernel.container.ui.titlebar.IMenuAction;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        kge.a(-1289301539);
        int[] iArr = new int[IMenuAction.MenuType.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[IMenuAction.MenuType.SHARE.ordinal()] = 1;
        $EnumSwitchMapping$0[IMenuAction.MenuType.ABOUT.ordinal()] = 2;
        $EnumSwitchMapping$0[IMenuAction.MenuType.COMMENT.ordinal()] = 3;
        $EnumSwitchMapping$0[IMenuAction.MenuType.ADD_TO_DESKTOP.ordinal()] = 4;
        $EnumSwitchMapping$0[IMenuAction.MenuType.AUTHORIZE_SETTING.ordinal()] = 5;
        $EnumSwitchMapping$0[IMenuAction.MenuType.MORE_CHANNEL.ordinal()] = 6;
    }
}
