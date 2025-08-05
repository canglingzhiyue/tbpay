package com.taobao.wireless.link.controller;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.wireless.link.model.MessageData;
import tb.kge;
import tb.rjt;
import tb.rkg;
import tb.rkk;

/* loaded from: classes.dex */
public class MessageServiceReceiver extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-170492711);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            return;
        }
        try {
            String str4 = new String(bArr);
            a.a().f23587a = (MessageData) JSON.parseObject(str4, MessageData.class);
            if (a.a().f23587a == null) {
                rkg.a("link_tag", "MessageServiceReceiver === onData == 接收的数据解析为空，不执行消息逻辑 = " + str4);
                return;
            }
            a.a().f23587a.message_id = str3;
            rkg.a("link_tag", "MessageServiceReceiver === onData == bytes = " + str4);
            b.a(a.a().f23587a.message_type).a(rjt.a().f33186a, a.a().f23587a);
            rkk.a(rjt.a().f33186a).a("message_data", a.a().f23587a);
        } catch (Throwable th) {
            rkg.a("link_tag", "MessageServiceReceiver === onData == 处理消息异常：" + th);
        }
    }
}
