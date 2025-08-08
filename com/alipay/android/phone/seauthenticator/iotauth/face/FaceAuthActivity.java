package com.alipay.android.phone.seauthenticator.iotauth.face;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.Button;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager;
import com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.speech.util.e;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class FaceAuthActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SWITCH_BTN_TYPE = "switch_btn_type";
    public static final String KEY_UI_STYLE = "ui_style";
    public static FaceAnimationManager.ActionCallback actionCallback;
    public static FaceAnimationManager animationCall = new FaceAnimationManager();
    public static FaceAuthDialog notify;
    public final int PERMISSION_REQUEST_ID = 1;

    /* renamed from: a  reason: collision with root package name */
    private FaceView f5149a;
    private View b;
    private Button c;
    private Button d;

    public static /* synthetic */ Object ipc$super(FaceAuthActivity faceAuthActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 323739864:
                super.setRequestedOrientation(((Number) objArr[0]).intValue());
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 2133689546:
                super.onStart();
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

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134be0d8", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.setRequestedOrientation(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.bio_TransparentTheme);
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        if (d() && ContextCompat.checkSelfPermission(this, e.CAMERA) != 0) {
            ActivityCompat.requestPermissions(this, new String[]{e.CAMERA}, 1);
        } else {
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (getIntent().getIntExtra(KEY_UI_STYLE, 0) == 1) {
            b();
        } else {
            c();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        FaceAuthDialog.mActionCallback = actionCallback;
        FaceAuthDialog faceAuthDialog = new FaceAuthDialog(this, animationCall);
        notify = faceAuthDialog;
        faceAuthDialog.showDialog(Constants.TYPE_FACE, "", 0, new IBiometricValidateNewDialog.IDialogActionListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog.IDialogActionListener
            public void onAction(int i) {
                String str;
                int i2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("781efb87", new Object[]{this, new Integer(i)});
                    return;
                }
                AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse(1, 1);
                if (i == 1) {
                    str = "user cancel";
                } else if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            AuthenticatorLOG.fpInfo(Constants.STRING_AUTH_SWITCH);
                            i2 = 135;
                        }
                        FaceAuthActivity.this.finish();
                    }
                    AuthenticatorLOG.fpInfo("fallback");
                    i2 = 121;
                    authenticatorResponse.setResult(i2);
                    FaceAuthActivity.animationCall.action = 3;
                    FaceAuthActivity.this.finish();
                } else {
                    str = "system cancel";
                }
                AuthenticatorLOG.fpInfo(str);
                authenticatorResponse.setResult(102);
                FaceAuthActivity.animationCall.action = 1;
                FaceAuthActivity.this.finish();
            }
        });
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        setContentView(R.layout.activity_face_auth);
        getWindow().setLayout(-1, getWindowManager().getDefaultDisplay().getHeight());
        setRequestedOrientation(1);
        this.b = findViewById(R.id.activity_face_auth);
        this.f5149a = (FaceView) findViewById(R.id.faceview);
        this.c = (Button) findViewById(R.id.btCancel);
        this.d = (Button) findViewById(R.id.btPsw);
        this.d.setVisibility(4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.b.setForceDarkAllowed(false);
        }
        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_SWITCH);
        if (!StringUtils.isEmpty(clientText)) {
            this.d.setText(clientText);
        }
        String clientText2 = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_CANCEL);
        if (!StringUtils.isEmpty(clientText2)) {
            this.c.setText(clientText2);
        }
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (FaceAuthActivity.actionCallback == null) {
                } else {
                    FaceAuthActivity.animationCall.action = 1;
                    FaceAuthActivity.this.finish();
                }
            }
        });
        final int intExtra = getIntent().getIntExtra(KEY_SWITCH_BTN_TYPE, 0);
        if (intExtra == 1) {
            this.d.setText(getResources().getText(R.string.fp_auth_switch_other));
        } else if (intExtra == 2) {
            this.d.setVisibility(8);
        }
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAuthActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (FaceAuthActivity.actionCallback == null) {
                } else {
                    if (intExtra == 1) {
                        FaceAuthActivity.animationCall.action = 5;
                    } else {
                        FaceAuthActivity.animationCall.action = 2;
                    }
                    FaceAuthActivity.this.finish();
                }
            }
        });
        FaceAnimationManager faceAnimationManager = animationCall;
        if (faceAnimationManager != null) {
            faceAnimationManager.init(this, this.f5149a, this.c, this.d, intExtra);
        }
        FaceAnimationManager.ActionCallback actionCallback2 = actionCallback;
        if (actionCallback2 == null) {
            return;
        }
        actionCallback2.onAction(0);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 23;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1) {
            return;
        }
        if (iArr.length == 1 && iArr[0] == 0) {
            a();
            return;
        }
        animationCall.action = 4;
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        if (animationCall.action > 0) {
            FaceAnimationManager.ActionCallback actionCallback2 = actionCallback;
            if (actionCallback2 != null) {
                actionCallback2.onAction(animationCall.action);
            }
            FaceView faceView = this.f5149a;
            if (faceView != null) {
                faceView.stop();
            }
        }
        animationCall.action = -1;
        super.finish();
    }

    @Override // android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        if (animationCall.action != 3) {
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
        FaceView faceView = this.f5149a;
        if (faceView != null) {
            faceView.stop();
        }
        FaceAnimationManager faceAnimationManager = animationCall;
        if (faceAnimationManager != null) {
            faceAnimationManager.reset();
        }
        FaceAuthDialog faceAuthDialog = notify;
        if (faceAuthDialog == null) {
            return;
        }
        faceAuthDialog.dismiss();
        notify = null;
    }
}
