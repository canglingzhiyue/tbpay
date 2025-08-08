package com.taobao.update.datasource.accs;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.reu;
import tb.rfq;
import tb.rfx;
import tb.rgb;

/* loaded from: classes9.dex */
public class a extends AccsAbstractDataListener implements rfq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERVICE_ID = "mtl";

    /* renamed from: a  reason: collision with root package name */
    private List<rgb> f23376a = new ArrayList();
    private reu b;

    static {
        kge.a(-1039736975);
        kge.a(-217468681);
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

    public a(reu reuVar) {
        this.b = reuVar;
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else if (bArr == null) {
        } else {
            try {
                str4 = new String(bArr, "utf-8");
            } catch (UnsupportedEncodingException unused) {
                str4 = null;
            }
            String str5 = "AccsUpdaterCenter.onData : " + str4;
            reu reuVar = this.b;
            if (reuVar != null) {
                reuVar.commitSuccess("update_center_accs", "accs_message_receiver", str3);
            }
            if (StringUtils.isEmpty(str4)) {
                return;
            }
            dispatchUpdate(from(), true, str4, str3);
        }
    }

    @Override // tb.rfq
    public void registerDataListener(rgb rgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a34b4b", new Object[]{this, rgbVar});
            return;
        }
        synchronized (this.f23376a) {
            this.f23376a.add(rgbVar);
        }
    }

    @Override // tb.rfq
    public void unRegisterDataListener(rgb rgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23d2ba04", new Object[]{this, rgbVar});
            return;
        }
        synchronized (this.f23376a) {
            this.f23376a.remove(rgbVar);
        }
    }

    @Override // tb.rfq
    public String from() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dad658f", new Object[]{this}) : rfx.ACCS_SOURCE;
    }

    @Override // tb.rfq
    public void dispatchUpdate(String str, boolean z, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6221f5", new Object[]{this, str, new Boolean(z), str2, strArr});
            return;
        }
        for (rgb rgbVar : new ArrayList(this.f23376a)) {
            rgbVar.onUpdate(str, null, z, str2, strArr);
        }
    }
}
