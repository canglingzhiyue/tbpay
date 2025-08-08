package tb;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.ext.i;
import com.alibaba.android.ultron.vfw.widget.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public class ian extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-256246298);
    }

    public static /* synthetic */ Object ipc$super(ian ianVar, String str, Object... objArr) {
        if (str.hashCode() == -1069556256) {
            super.d((e) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.ext.i, com.alibaba.android.ultron.event.ext.p
    public void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        hzy.a("TBOpenUrlV2Subscriber", "onHandleEventChain", "----");
        String string = e(eVar).getString("url");
        if (!StringUtils.isEmpty(string) && string.toLowerCase().startsWith("tel:")) {
            hzy.a("TBOpenUrlV2Subscriber", "onHandleEventChain", "截断 openUrl 并唤醒拨打电话逻辑 tel:" + string);
            a(eVar.a(), string);
            return;
        }
        super.d(eVar);
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (StringUtils.isEmpty(str) || context == null) {
        } else {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse(str));
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                a.a(context, b.a(R.string.order_biz_not_support_call));
                hzy.a("TBOpenUrlV2Subscriber", "callPhone", b.a(R.string.order_biz_not_support_call));
            }
        }
    }
}
