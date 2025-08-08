package com.taobao.wireless.link.pop;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import java.util.HashMap;
import tb.kge;
import tb.rjt;
import tb.rkg;
import tb.rki;

/* loaded from: classes.dex */
public class PopMessageReceiver extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1178425498);
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
            com.taobao.wireless.link.controller.a.a().b = (PopMessageData) JSON.parseObject(str4, PopMessageData.class);
            if (com.taobao.wireless.link.controller.a.a().b == null) {
                return;
            }
            com.taobao.wireless.link.controller.a.a().b.messageId = str3;
            if (com.taobao.wireless.link.controller.a.a().b.messageType == 0 && StringUtils.equals("true", com.taobao.wireless.link.common.b.a(rjt.a().f33186a, "is_push_alive_open", "true"))) {
                rjt.a().e = true;
                rkg.a("link_tag", "PopMessageReceiver === onData == 空消息拉活：" + str4);
                HashMap hashMap = new HashMap();
                hashMap.put("empty_message", str4);
                hashMap.put("launchType", rjt.a().f);
                hashMap.put(Constant.PROP_MESSAGE_ID, str3);
                hashMap.put("isEmptyMessageStart", rjt.a().e + "");
                rki.a("empty_message_data", "", "", hashMap);
                return;
            }
            rki.a("message_id_data", str3, str4, null);
            rkg.a("link_tag", "PopMessageReceiver === onData == data：" + str4);
            d.a(rjt.a().f33186a, com.taobao.wireless.link.controller.a.a().b);
            a.a().a(rjt.a().f33186a);
        } catch (Throwable th) {
            rkg.a("link_tag", "PopMessageReceiver === onData == 消息处理异常，流程结束：" + th.getMessage());
        }
    }
}
