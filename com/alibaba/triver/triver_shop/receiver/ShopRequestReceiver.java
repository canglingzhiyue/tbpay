package com.alibaba.triver.triver_shop.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.triver.triver_shop.d;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class ShopRequestReceiver extends BroadcastReceiver implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_SHOP_REQUEST = "SHOP_ACTION_SHOP_REQUEST";
    public static final a Companion;
    private static final String MSG_CANCEL_STAR_SUCCESS = "取消星标成功";
    private static final String MSG_SETTING_SUCCESS = "设置成功";
    private static final String MSG_STAR_SUCCESS = "星标订阅成功";
    private static final String TYPE_STAR = "SHOP_TYPE_STAR";

    static {
        kge.a(478169712);
        kge.a(1028243835);
        Companion = new a(null);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(969533880);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (context == null || intent == null || !q.a((Object) intent.getAction(), (Object) ACTION_SHOP_REQUEST) || (extras = intent.getExtras()) == null || !extras.containsKey("star")) {
        } else {
            boolean z = extras.getBoolean("star", false);
            d.INSTANCE.a(context, extras.getString("sellerId"), z, new ShopRequestReceiver$onReceive$1(z, context, extras.getBoolean("changeToFollow", false)));
        }
    }
}
