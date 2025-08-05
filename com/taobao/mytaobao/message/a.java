package com.taobao.mytaobao.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.message.biz.contacts.MessageBoxService;
import com.taobao.message.biz.contacts.UnreadInfo;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.mytaobao.ultron.e;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_MSG_UNREAD = "msg.action.ACTION_MPM_MESSAGE_BOX_UNREAD";

    /* renamed from: a */
    public LocalBroadcastManager f18380a;
    public BroadcastReceiver b = new BroadcastReceiver() { // from class: com.taobao.mytaobao.message.UnreadWangWangMessageManager$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MessageBoxService messageBoxService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!"msg.action.ACTION_MPM_MESSAGE_BOX_UNREAD".equals(intent.getAction()) || (messageBoxService = (MessageBoxService) GlobalContainer.getInstance().get(MessageBoxService.class)) == null) {
            } else {
                a.a(a.this, messageBoxService.getUnreadInfo());
            }
        }
    };
    private d c;
    private String d;
    private IDMComponent e;

    static {
        kge.a(-1847842459);
    }

    public static /* synthetic */ void a(a aVar, UnreadInfo unreadInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9cf68f", new Object[]{aVar, unreadInfo});
        } else {
            aVar.a(unreadInfo);
        }
    }

    public a(d dVar, Context context, String str) {
        this.c = dVar;
        this.d = str;
        this.f18380a = LocalBroadcastManager.getInstance(context);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f18380a.registerReceiver(this.b, new IntentFilter("msg.action.ACTION_MPM_MESSAGE_BOX_UNREAD"));
        }
    }

    private void a(UnreadInfo unreadInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca827295", new Object[]{this, unreadInfo});
            return;
        }
        if (this.e == null) {
            this.e = e.a(this.c, this.d);
            if (this.e == null) {
                return;
            }
        }
        JSONObject data = this.e.getData();
        data.put("tipNumber", (Object) Integer.valueOf(unreadInfo.getTipNumber()));
        data.put("tipType", (Object) Integer.valueOf(unreadInfo.getTipType()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.e);
        this.c.a(arrayList);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f18380a.unregisterReceiver(this.b);
        }
    }
}
