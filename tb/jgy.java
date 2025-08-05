package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.tao.log.c;
import com.taobao.tao.log.f;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;

/* loaded from: classes.dex */
public class jgy extends AccsAbstractDataListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1015520154);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
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
        } else if (bArr == null || bArr.length <= 0) {
            f.a().h().b(oko.f, "RECEIVE MSG", "接收到accs下发的消息，但是内容为空的.");
            TLogEventHelper.a("ut_tlog_accs_receive_err", ErrorCode.DATA_EMPTY, "onData msg is null");
        } else {
            f.a().h().a(oko.f, "RECEIVE MSG", "接收到accs下发的消息，开始处理");
            c.a().a(str, str2, str3, bArr);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        } else if (bArr != null) {
            f.a().h().a(oko.f, "RECEIVE REPONSE", "接收到accs返回的reponse");
            c.a().a(str, "userId", str2, bArr);
        } else if (i == -11) {
        } else {
            TLogEventHelper.b("ut_tlog_accs_receive_err", String.valueOf(i), "response is null");
            okn h = f.a().h();
            String str3 = oko.f;
            h.b(str3, "RECEIVE REPONSE", "接收到accs返回的reponse，但是内容为空的, dataId:" + str2 + " serviceId:" + str + " errorCode:" + i);
        }
    }
}
