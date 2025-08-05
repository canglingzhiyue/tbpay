package com.taobao.message.conversation;

import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.util.RemoteMonitorUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "errorMsg", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class CompatMessageTabHost$onCreate$2 extends Lambda implements rul<String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CompatMessageTabHost this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompatMessageTabHost$onCreate$2(CompatMessageTabHost compatMessageTabHost) {
        super(1);
        this.this$0 = compatMessageTabHost;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(String str) {
        invoke2(str);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String errorMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c25509", new Object[]{this, errorMsg});
            return;
        }
        q.c(errorMsg, "errorMsg");
        RemoteMonitorUtil.INSTANCE.remoteLoadFailCount("category", errorMsg);
        IErrorViewService iErrorViewService = (IErrorViewService) GlobalContainer.getInstance().get(IErrorViewService.class);
        if (iErrorViewService == null) {
            return;
        }
        CompatMessageTabHost compatMessageTabHost = this.this$0;
        FragmentActivity fragmentActivity = CompatMessageTabHost.$ipChange;
        if (fragmentActivity == null) {
            q.a();
        }
        CompatMessageTabHost.access$replaceContentView(compatMessageTabHost, iErrorViewService.getErrorView(fragmentActivity, DisplayUtil.localizedString(R.string.mp_download_timeout), DisplayUtil.localizedString(R.string.mp_don_t_worry_try_to_reload), DisplayUtil.localizedString(R.string.mp_refresh), 0, new CompatMessageTabHost$onCreate$2$$special$$inlined$let$lambda$1(this)));
    }
}
