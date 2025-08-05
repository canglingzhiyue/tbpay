package com.taobao.message.notify;

import android.content.Intent;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/taobao/message/notify/MessageNotifyService;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "doAgooNotify", "", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "invokeTag", "message_base_tb_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class MessageNotifyService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final MessageNotifyService INSTANCE;
    private static final String TAG = "MessageNotifyService";

    static {
        kge.a(846950512);
        INSTANCE = new MessageNotifyService();
    }

    private MessageNotifyService() {
    }

    @JvmStatic
    public static final void doAgooNotify(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4720e8", new Object[]{intent, str});
        } else if (BundleSplitUtil.INSTANCE.isMsgBundleReady()) {
            BundleSplitUtil.INSTANCE.checkClazzReady("com.taobao.message.agoo.AgooNotifyUtil", true, new MessageNotifyService$doAgooNotify$1(intent, str), MessageNotifyService$doAgooNotify$2.INSTANCE);
        } else {
            TLog.loge(TAG, "msg bundle is not ready");
        }
    }
}
