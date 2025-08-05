package com.taobao.wireless.link.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.rkf;
import tb.rkg;
import tb.rki;
import tb.rkj;
import tb.rkk;

/* loaded from: classes.dex */
public class LinkCommonHomeReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static LinkCommonHomeReceiver f23582a;

        static {
            kge.a(1807991408);
            f23582a = new LinkCommonHomeReceiver();
        }
    }

    static {
        kge.a(-746374016);
    }

    public static /* synthetic */ Object ipc$super(LinkCommonHomeReceiver linkCommonHomeReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        rkg.a("link_tag", "LinkCommonHomeReceiver === onReceive: context：" + context + "action: " + intent.getAction());
        com.taobao.wireless.link.notification.b.b(context, false);
        a(context);
    }

    private void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            rkf.f33202a.a(new Runnable() { // from class: com.taobao.wireless.link.common.LinkCommonHomeReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        long longValue = ((Long) rkk.a(context).b("float_permission", 0L)).longValue();
                        long a2 = rkj.a();
                        if (a2 - longValue <= 86400000) {
                            return;
                        }
                        boolean c = rkj.c(context);
                        rki.a(rki.ARG1_HAS_FLOAT_PERMISSION, c + "", "", null);
                        rkk.a(context).a("float_permission", Long.valueOf(a2));
                        rkg.a("link_tag", "LinkCommonHomeReceiver === sendFloatPermission === 距上次大于一天，上报埋点");
                    } catch (Exception e) {
                        rkg.a("link_tag", "LinkCommonHomeReceiver === sendFloatPermission === 上报埋点异常：" + e);
                    }
                }
            });
        }
    }
}
