package com.taobao.orange.accssupport;

import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.e;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.f;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes.dex */
public class OrangeAccsService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Set<NameSpaceDO> f18577a;

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

    public static /* synthetic */ Set b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[0]) : f18577a;
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else if (!"orange".equals(str)) {
        } else {
            OLog.i("OrangeAccs", "onData", "dataId", str3, "userId", str2);
            a(bArr);
        }
    }

    static {
        kge.a(683167125);
        f18577a = new HashSet();
    }

    public static void a(final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{bArr});
        } else {
            e.a(new Runnable() { // from class: com.taobao.orange.accssupport.OrangeAccsService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    byte[] bArr2 = bArr;
                    if (bArr2 == null || bArr2.length <= 0) {
                        OLog.e("OrangeAccs", "handleUpdate data is empty", new Object[0]);
                        return;
                    }
                    NameSpaceDO nameSpaceDO = (NameSpaceDO) JSON.parseObject(new String(bArr2), NameSpaceDO.class);
                    if (nameSpaceDO == null) {
                        OLog.e("OrangeAccs", "handleUpdate fail as namespace null", new Object[0]);
                        return;
                    }
                    if (OLog.isPrintLog(1)) {
                        OLog.d("OrangeAccs", "handleUpdate", "namespace", f.a(nameSpaceDO));
                    }
                    if (ConfigCenter.getInstance().mIsOrangeInit.get()) {
                        ConfigCenter.getInstance().loadConfigLazy(nameSpaceDO);
                    } else {
                        OLog.w("OrangeAccs", "handleUpdate fail as not init completed", new Object[0]);
                        OrangeAccsService.b().add(nameSpaceDO);
                    }
                    if (com.taobao.orange.a.g == null) {
                        return;
                    }
                    Intent intent = new Intent("com.taobao.orange.monitor.DATA");
                    intent.setPackage(com.taobao.orange.a.g.getPackageName());
                    intent.putExtra("changeType", "grey");
                    intent.putExtra("namespace", nameSpaceDO.name);
                    intent.putExtra("version", nameSpaceDO.version);
                    com.taobao.orange.a.g.sendBroadcast(intent);
                    OLog.e("OrangeAccs", "sendBroadcast", "namespace", nameSpaceDO.name, "version", nameSpaceDO.version);
                }
            });
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!f18577a.isEmpty()) {
            OLog.v("OrangeAccs", "complete", "accs waiting", Integer.valueOf(f18577a.size()));
            for (NameSpaceDO nameSpaceDO : f18577a) {
                ConfigCenter.getInstance().loadConfigLazy(nameSpaceDO);
            }
            f18577a.clear();
            OLog.v("OrangeAccs", "complete end", new Object[0]);
        }
    }
}
