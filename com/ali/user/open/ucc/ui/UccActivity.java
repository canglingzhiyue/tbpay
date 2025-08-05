package com.ali.user.open.ucc.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.model.SerializableMap;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.ucc.UccCallback;
import com.ali.user.open.ucc.UccServiceImpl;
import com.ali.user.open.ucc.context.UccContext;
import com.ali.user.open.ucc.util.UccConstants;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UccActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UccActivity";
    public static boolean isUccActivityExist;
    public static UccCallback mUccCallback;
    public LinearLayout hiddenLayout;
    private boolean isInUccTrustLogin = false;

    public static /* synthetic */ Object ipc$super(UccActivity uccActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
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

    public static /* synthetic */ boolean access$000(UccActivity uccActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("10626d27", new Object[]{uccActivity})).booleanValue() : uccActivity.isInUccTrustLogin;
    }

    public static /* synthetic */ void access$100(UccActivity uccActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab032fa4", new Object[]{uccActivity});
        } else {
            uccActivity.unknownFailure();
        }
    }

    static {
        kge.a(82723747);
        isUccActivityExist = false;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.hiddenLayout = new LinearLayout(this);
        this.hiddenLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(this.hiddenLayout);
        if (KernelContext.applicationContext == null) {
            KernelContext.applicationContext = getApplicationContext();
        }
        this.hiddenLayout.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.open.ucc.ui.UccActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (UccActivity.access$000(UccActivity.this) && (UccContext.startTrustLoginTime == 0 || System.currentTimeMillis() - UccContext.startTrustLoginTime < 3000)) {
                } else {
                    SDKLogger.e(UccActivity.TAG, "click to destroy");
                    UccActivity.access$100(UccActivity.this);
                    UccActivity.this.finish();
                }
            }
        });
        this.hiddenLayout.setClickable(true);
        this.hiddenLayout.setLongClickable(true);
        if (!KernelContext.checkServiceValid()) {
            SDKLogger.d(TAG, "static field null");
            unknownFailure();
            finish();
            return;
        }
        SDKLogger.e(TAG, "before mtop call showLogin");
        auth();
        isUccActivityExist = true;
    }

    private void unknownFailure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f242a67", new Object[]{this});
            return;
        }
        UccCallback uccCallback = mUccCallback;
        if (uccCallback == null) {
            return;
        }
        uccCallback.onFail("taobao", 10001, "");
    }

    public void auth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554c4e2f", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            unknownFailure();
            finish();
            return;
        }
        int intExtra = intent.getIntExtra(UccConstants.PARAM_FUNC_TYPE, 2);
        String stringExtra = intent.getStringExtra("targetSite");
        String stringExtra2 = intent.getStringExtra("userToken");
        HashMap hashMap = new HashMap();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            try {
                SerializableMap serializableMap = (SerializableMap) extras.getSerializable("params");
                if (serializableMap != null) {
                    hashMap.putAll(serializableMap.getMap());
                }
            } catch (Throwable unused) {
            }
        }
        if (intExtra == 1) {
            UccContext.startTrustLoginTime = 0L;
            this.isInUccTrustLogin = true;
            UccServiceImpl.getInstance().trustLogin(this, stringExtra, hashMap, new UccCallback() { // from class: com.ali.user.open.ucc.ui.UccActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.ucc.UccCallback
                public void onSuccess(String str, Map map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str, map});
                        return;
                    }
                    if (UccActivity.mUccCallback != null) {
                        UccActivity.mUccCallback.onSuccess(str, map);
                    }
                    UccActivity.this.finish();
                }

                @Override // com.ali.user.open.ucc.UccCallback
                public void onFail(String str, int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9656df", new Object[]{this, str, new Integer(i), str2});
                        return;
                    }
                    SDKLogger.e(UccActivity.TAG, "trustlogin fail target=" + str + "  code=" + i);
                    if (UccActivity.mUccCallback != null) {
                        UccActivity.mUccCallback.onFail(str, i, str2);
                    }
                    UccActivity.this.finish();
                }
            });
        } else if (intExtra == 3) {
            UccServiceImpl.getInstance().doBindAlipay(this, intent.getStringExtra("bizCode"), intent.getStringExtra(UccConstants.PARAM_REALM), hashMap, new UccCallback() { // from class: com.ali.user.open.ucc.ui.UccActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.ucc.UccCallback
                public void onSuccess(String str, Map map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str, map});
                        return;
                    }
                    if (UccActivity.mUccCallback != null) {
                        UccActivity.mUccCallback.onSuccess(str, map);
                    }
                    UccActivity.this.finish();
                }

                @Override // com.ali.user.open.ucc.UccCallback
                public void onFail(String str, int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9656df", new Object[]{this, str, new Integer(i), str2});
                        return;
                    }
                    SDKLogger.e(UccActivity.TAG, "trustlogin fail target=" + str + "  code=" + i);
                    if (UccActivity.mUccCallback != null) {
                        UccActivity.mUccCallback.onFail(str, i, str2);
                    }
                    UccActivity.this.finish();
                }
            });
        } else {
            UccServiceImpl.getInstance().bind(this, stringExtra2, stringExtra, hashMap, new UccCallback() { // from class: com.ali.user.open.ucc.ui.UccActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.ucc.UccCallback
                public void onSuccess(String str, Map map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b5e17230", new Object[]{this, str, map});
                        return;
                    }
                    if (UccActivity.mUccCallback != null) {
                        UccActivity.mUccCallback.onSuccess(str, map);
                    }
                    UccActivity.this.finish();
                }

                @Override // com.ali.user.open.ucc.UccCallback
                public void onFail(String str, int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9656df", new Object[]{this, str, new Integer(i), str2});
                        return;
                    }
                    if (UccActivity.mUccCallback != null) {
                        UccActivity.mUccCallback.onFail(str, i, str2);
                    }
                    UccActivity.this.finish();
                }
            });
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (KernelContext.checkServiceValid()) {
            return;
        }
        unknownFailure();
        finish();
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
            return;
        }
        SDKLogger.d(TAG, "onActivityResult requestCode = " + i + " resultCode=" + i2);
        if (!KernelContext.checkServiceValid()) {
            unknownFailure();
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        mUccCallback = null;
        isUccActivityExist = false;
        super.onDestroy();
    }
}
