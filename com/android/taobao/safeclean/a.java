package com.android.taobao.safeclean;

import android.app.Application;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class a extends AccsAbstractDataListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean b;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, List<d>> f6394a = new HashMap();

    static {
        kge.a(-620279533);
        kge.a(687885549);
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

    public a(Application application, boolean z) {
        try {
            a("clean", m.a());
            a("addition", l.a());
            if (!z) {
                return;
            }
            a(application, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        for (d dVar : new ArrayList(this.f6394a.get(str))) {
            dVar.a("accs", str2, str3);
        }
    }

    public void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36076ea3", new Object[]{this, str, dVar});
            return;
        }
        synchronized (this.f6394a) {
            if (this.f6394a.containsKey(str)) {
                this.f6394a.get(str).add(dVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dVar);
                this.f6394a.put(str, arrayList);
            }
        }
    }

    public void a(Context context, AccsAbstractDataListener accsAbstractDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc0d11b", new Object[]{this, context, accsAbstractDataListener});
        } else if (b) {
        } else {
            b = true;
            GlobalClientInfo.getInstance(context).registerListener("mtl_bypass", accsAbstractDataListener);
        }
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
            if (StringUtils.isEmpty(str4)) {
                return;
            }
            Log.e("AccsSource", str4);
            if (str4.contains("additionDataList")) {
                a("addition", "", str4);
            } else {
                a("clean", "", str4);
            }
        }
    }
}
