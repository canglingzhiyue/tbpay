package com.taobao.taobao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.internal.PayResultInfo;
import com.taobao.taobao.utils.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class CashDeskV2Activity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, String> f21202a;
    private Activity b;

    public static /* synthetic */ Object ipc$super(CashDeskV2Activity cashDeskV2Activity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 1264052993) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onNewIntent((Intent) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ Activity a(CashDeskV2Activity cashDeskV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2512f336", new Object[]{cashDeskV2Activity}) : cashDeskV2Activity.b;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        getWindow().addFlags(16);
        this.b = this;
        this.f21202a = d.a(getIntent());
        HashMap<String, String> hashMap = this.f21202a;
        if (hashMap == null) {
            finish();
        } else {
            a(hashMap.get(CashdeskConstants.CASHIER_TYPE), this.f21202a);
        }
        com.taobao.taobao.utils.b.a();
    }

    private void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        b bVar = new b();
        PayRequest payRequest = new PayRequest();
        payRequest.setActionParams(map.get("signStr"));
        payRequest.setOrderIds(map.get("orderids"));
        payRequest.setFrom(map.get(map.get("from")));
        payRequest.setSuccessUrl(map.get("backURL"));
        payRequest.setUnSuccessUrl(map.get("unSuccessUrl"));
        payRequest.setNextAction(str);
        payRequest.setExtAttrMap(map);
        bVar.a(this, payRequest, new com.taobao.taobao.internal.b() { // from class: com.taobao.taobao.CashDeskV2Activity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taobao.internal.b
            public void a(String str2, PayResultInfo payResultInfo) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aa92b52", new Object[]{this, str2, payResultInfo});
                } else if (CashDeskV2Activity.a(CashDeskV2Activity.this) == null) {
                } else {
                    CashDeskV2Activity.a(CashDeskV2Activity.this).setResult(-1);
                    CashDeskV2Activity.a(CashDeskV2Activity.this).finish();
                }
            }

            @Override // com.taobao.taobao.internal.b
            public void b(String str2, PayResultInfo payResultInfo) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5868a353", new Object[]{this, str2, payResultInfo});
                } else if (CashDeskV2Activity.a(CashDeskV2Activity.this) == null) {
                } else {
                    CashDeskV2Activity.a(CashDeskV2Activity.this).finish();
                }
            }

            @Override // com.taobao.taobao.internal.b
            public void c(String str2, PayResultInfo payResultInfo) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6281b54", new Object[]{this, str2, payResultInfo});
                } else if (CashDeskV2Activity.a(CashDeskV2Activity.this) == null) {
                } else {
                    CashDeskV2Activity.a(CashDeskV2Activity.this).finish();
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        this.f21202a = d.a(intent);
        if (this.f21202a != null) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.f21202a = null;
    }
}
