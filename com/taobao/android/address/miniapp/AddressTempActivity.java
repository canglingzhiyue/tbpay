package com.taobao.android.address.miniapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.a;
import com.taobao.android.address.b;
import com.taobao.taolive.room.utils.ag;

/* loaded from: classes4.dex */
public class AddressTempActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AddressTempActivity";
    public static BridgeCallback b;

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f8980a;

    public static /* synthetic */ Object ipc$super(AddressTempActivity addressTempActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ void a(AddressTempActivity addressTempActivity, BridgeCallback bridgeCallback, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb36bfa4", new Object[]{addressTempActivity, bridgeCallback, new Integer(i), str});
        } else {
            addressTempActivity.a(bridgeCallback, i, str);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.f8980a = new LinearLayout(this);
        this.f8980a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(this.f8980a);
        this.f8980a.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.address.miniapp.AddressTempActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    AddressTempActivity.this.finish();
                }
            }
        });
        this.f8980a.setClickable(true);
        this.f8980a.setLongClickable(true);
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            b();
            finish();
            return;
        }
        try {
            b.a(this, intent.getStringExtra("bizIdentity"), intent.getStringExtra("channel"), intent.getStringExtra(ag.KEY_TAOKE_BIZSCENE), new a() { // from class: com.taobao.android.address.miniapp.AddressTempActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.address.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    if (AddressTempActivity.b != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("data", (Object) str);
                        AddressTempActivity.b.sendJSONResponse(jSONObject);
                    }
                    AddressTempActivity.this.finish();
                }

                @Override // com.taobao.android.address.a
                public void a(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    AddressTempActivity addressTempActivity = AddressTempActivity.this;
                    BridgeCallback bridgeCallback = AddressTempActivity.b;
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                    AddressTempActivity.a(addressTempActivity, bridgeCallback, i, str);
                    AddressTempActivity.this.finish();
                }
            });
        } catch (Exception unused) {
            a(b, -1, "系统异常");
            finish();
        }
    }

    private void a(BridgeCallback bridgeCallback, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97023b9", new Object[]{this, bridgeCallback, new Integer(i), str});
        } else if (bridgeCallback == null) {
        } else {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(i, str));
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        BridgeCallback bridgeCallback = b;
        if (bridgeCallback == null) {
            return;
        }
        bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(-2, ""));
    }

    @Override // android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        overridePendingTransition(0, 0);
        super.onPause();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i == 2001) {
            if (i2 != -1 && !TextUtils.isEmpty(b.f8967a)) {
                i2 = -1;
            }
            b.a(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        b = null;
        super.onDestroy();
    }
}
