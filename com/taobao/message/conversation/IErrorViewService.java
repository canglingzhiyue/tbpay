package com.taobao.message.conversation;

import android.content.Context;
import android.view.View;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import kotlin.Metadata;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JM\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/message/conversation/IErrorViewService;", "", "getErrorView", "Landroid/view/View;", "ctx", "Landroid/content/Context;", "title", "", MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, "btnTitle", "resId", "", "onClick", "Lkotlin/Function0;", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)Landroid/view/View;", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public interface IErrorViewService {
    View getErrorView(Context context, String str, String str2, String str3, Integer num, ruk<t> rukVar);
}
