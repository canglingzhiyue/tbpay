package com.taobao.themis.external.embed;

import com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/taobao/themis/external/embed/TMSEmbedSolutionType;", "", "(Ljava/lang/String;I)V", "convert", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "getStartParam", "Ljava/lang/Class;", "Lcom/taobao/themis/external/embed/StartParams;", "WIDGET", "CLUSTER_WIDGET", "UNIAPP", "WEB_SINGLE_PAGE", AbsInputFrame2.CALL_BACK_TYPE_WEEX, "themis_interface_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public enum TMSEmbedSolutionType {
    WIDGET,
    CLUSTER_WIDGET,
    UNIAPP,
    WEB_SINGLE_PAGE,
    WEEX;

    public final TMSSolutionType convert() {
        return TMSSolutionType.valueOf(name());
    }

    public final Class<? extends StartParams> getStartParam() {
        int i = b.$EnumSwitchMapping$0[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? StartParams.class : WidgetStartParams.class : Weex2StartParams.class : WebStartParams.class : UniAppStartParams.class;
    }
}
