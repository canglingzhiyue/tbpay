package com.taobao.message.conversation;

import android.content.Context;
import android.view.View;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.uikit.extend.component.TBErrorView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002JM\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/taobao/message/conversation/TBErrorViewService;", "Lcom/taobao/message/conversation/IErrorViewService;", "()V", "getErrorView", "Landroid/view/View;", "ctx", "Landroid/content/Context;", "title", "", MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, "btnTitle", "resId", "", "onClick", "Lkotlin/Function0;", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)Landroid/view/View;", "Companion", "message_base_tb_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class TBErrorViewService implements IErrorViewService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion;

    static {
        kge.a(-1222355673);
        kge.a(558276608);
        Companion = new Companion(null);
    }

    @JvmStatic
    public static final void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
        } else {
            Companion.register();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/taobao/message/conversation/TBErrorViewService$Companion;", "", "()V", "register", "", "message_base_tb_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(904215471);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        @JvmStatic
        public final void register() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            } else {
                GlobalContainer.getInstance().register(IErrorViewService.class, new TBErrorViewService());
            }
        }
    }

    @Override // com.taobao.message.conversation.IErrorViewService
    public View getErrorView(Context ctx, String str, String str2, String str3, Integer num, final ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a59a1119", new Object[]{this, ctx, str, str2, str3, num, rukVar});
        }
        q.c(ctx, "ctx");
        final TBErrorView tBErrorView = new TBErrorView(ctx);
        if (str != null) {
            tBErrorView.setTitle(str);
        }
        if (str2 != null) {
            tBErrorView.setSubTitle(str2);
        }
        if (num != null && num.intValue() != 0) {
            tBErrorView.setIcon(num.intValue());
        }
        if (str3 != null) {
            tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, str3, new View.OnClickListener() { // from class: com.taobao.message.conversation.TBErrorViewService$getErrorView$$inlined$let$lambda$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    ruk rukVar2 = rukVar;
                    if (rukVar2 == null) {
                        return;
                    }
                    rukVar2.mo2427invoke();
                }
            });
        }
        return tBErrorView;
    }
}
