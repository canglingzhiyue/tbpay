package com.alipay.android.phone.seauthenticator.iotauth.face;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView;
import com.alipay.security.mobile.auth.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class FaceAnimationManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACTION_CODE_BACKGROUND = 3;
    public static final int ACTION_CODE_CANCEL = 1;
    public static final int ACTION_CODE_NOPERMISSION = 4;
    public static final int ACTION_CODE_NULL = -1;
    public static final int ACTION_CODE_PASSWORD = 2;
    public static final int ACTION_CODE_START = 0;
    public static final int ACTION_CODE_SWITCH = 5;
    public static final int STATUS_CHECK_SUCCESS = 3;
    public static final int STATUS_SECONDE_CHECK = 2;
    public static final int STATUS_START = 1;
    private View d;
    private FaceView e;
    private View f;
    private View g;
    private View h;
    private Activity j;
    public int action = 3;

    /* renamed from: a  reason: collision with root package name */
    private final int f5136a = 0;
    private final int b = 1;
    private final int c = 2;
    private int i = 0;
    private int k = 0;
    private boolean l = true;
    public boolean isDialogUI = false;

    /* loaded from: classes3.dex */
    public static abstract class ActionCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract void onAction(int i);
    }

    /* loaded from: classes3.dex */
    public interface AnimationCallback {
        void onAnimationEnd();
    }

    public static /* synthetic */ int a(FaceAnimationManager faceAnimationManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47be8798", new Object[]{faceAnimationManager, new Integer(i)})).intValue();
        }
        faceAnimationManager.k = i;
        return i;
    }

    public static /* synthetic */ View a(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("de7c1be0", new Object[]{faceAnimationManager}) : faceAnimationManager.f;
    }

    public static /* synthetic */ boolean a(FaceAnimationManager faceAnimationManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47bec77a", new Object[]{faceAnimationManager, new Boolean(z)})).booleanValue();
        }
        faceAnimationManager.l = z;
        return z;
    }

    public static /* synthetic */ View b(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fd3653a1", new Object[]{faceAnimationManager}) : faceAnimationManager.g;
    }

    public static /* synthetic */ View c(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("1bf08b62", new Object[]{faceAnimationManager}) : faceAnimationManager.h;
    }

    public static /* synthetic */ View d(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3aaac323", new Object[]{faceAnimationManager}) : faceAnimationManager.d;
    }

    public static /* synthetic */ FaceView e(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FaceView) ipChange.ipc$dispatch("631626da", new Object[]{faceAnimationManager}) : faceAnimationManager.e;
    }

    public static /* synthetic */ Activity f(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("cce0165", new Object[]{faceAnimationManager}) : faceAnimationManager.j;
    }

    public static /* synthetic */ int g(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f293d317", new Object[]{faceAnimationManager})).intValue() : faceAnimationManager.i;
    }

    public static /* synthetic */ boolean h(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d30d2929", new Object[]{faceAnimationManager})).booleanValue() : faceAnimationManager.l;
    }

    public static /* synthetic */ int i(FaceAnimationManager faceAnimationManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b3867f19", new Object[]{faceAnimationManager})).intValue() : faceAnimationManager.k;
    }

    public synchronized void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = null;
    }

    public synchronized void init(Activity activity, FaceView faceView, View view, View view2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926ebe64", new Object[]{this, activity, faceView, view, view2, new Integer(i)});
            return;
        }
        this.j = activity;
        this.e = faceView;
        this.f = view;
        this.g = view2;
        this.k = 0;
        this.i = i;
    }

    public synchronized void init(Activity activity, View view, FaceView faceView, View view2, View view3, View view4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434ca8d3", new Object[]{this, activity, view, faceView, view2, view3, view4});
            return;
        }
        this.j = activity;
        this.e = faceView;
        this.f = view2;
        this.g = view3;
        this.h = view4;
        this.d = view;
        this.k = 0;
        this.isDialogUI = true;
        this.l = true;
    }

    public synchronized void updateUI(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533bf45f", new Object[]{this, new Integer(i)});
        } else if (this.j == null) {
        } else {
            this.j.runOnUiThread(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (FaceAnimationManager.a(FaceAnimationManager.this) == null || FaceAnimationManager.b(FaceAnimationManager.this) == null) {
                    } else {
                        int i2 = i;
                        if (i2 == 1) {
                            if (!FaceAnimationManager.this.isDialogUI) {
                                FaceAnimationManager.a(FaceAnimationManager.this).setVisibility(0);
                                FaceAnimationManager.b(FaceAnimationManager.this).setVisibility(4);
                                return;
                            }
                            FaceAnimationManager.a(FaceAnimationManager.this).setVisibility(4);
                            FaceAnimationManager.b(FaceAnimationManager.this).setVisibility(4);
                            if (FaceAnimationManager.c(FaceAnimationManager.this) != null) {
                                FaceAnimationManager.c(FaceAnimationManager.this).setVisibility(4);
                            }
                            if (FaceAnimationManager.d(FaceAnimationManager.this) != null) {
                                FaceAnimationManager.d(FaceAnimationManager.this).setBackground(null);
                            }
                            FaceAnimationManager.e(FaceAnimationManager.this).setColorfulUI(false);
                        } else if (i2 == 2) {
                            FaceAnimationManager.a(FaceAnimationManager.this, false);
                            if (!FaceAnimationManager.this.isDialogUI) {
                                FaceAnimationManager.a(FaceAnimationManager.this).setVisibility(0);
                                if (FaceAnimationManager.g(FaceAnimationManager.this) == 2) {
                                    return;
                                }
                                FaceAnimationManager.b(FaceAnimationManager.this).setVisibility(0);
                                return;
                            }
                            FaceAnimationManager.a(FaceAnimationManager.this).setVisibility(0);
                            FaceAnimationManager.b(FaceAnimationManager.this).setVisibility(0);
                            if (FaceAnimationManager.c(FaceAnimationManager.this) != null) {
                                FaceAnimationManager.c(FaceAnimationManager.this).setVisibility(0);
                            }
                            if (FaceAnimationManager.d(FaceAnimationManager.this) != null) {
                                FaceAnimationManager.d(FaceAnimationManager.this).setBackground(FaceAnimationManager.f(FaceAnimationManager.this).getResources().getDrawable(R.drawable.fp_radius_corner));
                            }
                            FaceAnimationManager.e(FaceAnimationManager.this).setColorfulUI(true);
                        } else if (i2 != 3) {
                        } else {
                            if (FaceAnimationManager.h(FaceAnimationManager.this) || !FaceAnimationManager.this.isDialogUI) {
                                FaceAnimationManager.a(FaceAnimationManager.this).setVisibility(4);
                                FaceAnimationManager.b(FaceAnimationManager.this).setVisibility(4);
                                return;
                            }
                            FaceAnimationManager.a(FaceAnimationManager.this).setVisibility(0);
                            FaceAnimationManager.a(FaceAnimationManager.this).setEnabled(false);
                            FaceAnimationManager.b(FaceAnimationManager.this).setVisibility(0);
                            FaceAnimationManager.b(FaceAnimationManager.this).setEnabled(false);
                            if (FaceAnimationManager.c(FaceAnimationManager.this) != null) {
                                FaceAnimationManager.c(FaceAnimationManager.this).setVisibility(0);
                            }
                            if (FaceAnimationManager.d(FaceAnimationManager.this) != null) {
                                FaceAnimationManager.d(FaceAnimationManager.this).setBackground(FaceAnimationManager.f(FaceAnimationManager.this).getResources().getDrawable(R.drawable.fp_radius_corner));
                            }
                            FaceAnimationManager.e(FaceAnimationManager.this).setColorfulUI(true);
                        }
                    }
                }
            });
        }
    }

    public synchronized void startCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e1eb0b", new Object[]{this});
        } else if (this.j == null) {
        } else {
            this.j.runOnUiThread(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FaceAnimationManager.a(FaceAnimationManager.this, 0);
                    if (FaceAnimationManager.e(FaceAnimationManager.this) == null) {
                        return;
                    }
                    FaceAnimationManager.e(FaceAnimationManager.this).setFaceViewTip("");
                    FaceAnimationManager.e(FaceAnimationManager.this).startCapture();
                }
            });
        }
    }

    public synchronized void checkFinish(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde3a842", new Object[]{this, new Long(j)});
        } else if (this.e == null) {
        } else {
            this.e.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (FaceAnimationManager.f(FaceAnimationManager.this) == null) {
                    } else {
                        FaceAnimationManager faceAnimationManager = FaceAnimationManager.this;
                        faceAnimationManager.action = -1;
                        if (!(FaceAnimationManager.f(faceAnimationManager) instanceof FaceAuthActivity)) {
                            return;
                        }
                        FaceAnimationManager.f(FaceAnimationManager.this).finish();
                    }
                }
            }, j);
        }
    }

    public synchronized void captureFail(final AnimationCallback animationCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2236dbc", new Object[]{this, animationCallback});
        } else if (this.j == null) {
        } else {
            this.j.runOnUiThread(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FaceAnimationManager.a(FaceAnimationManager.this, 2);
                    if (FaceAnimationManager.e(FaceAnimationManager.this) == null) {
                        return;
                    }
                    FaceAnimationManager.e(FaceAnimationManager.this).captureFail(new FaceView.AnimationEndCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                        public void onCheckEnd() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("11c62d39", new Object[]{this});
                            }
                        }

                        @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                        public void onCheckFailEnd() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("ebc1ccbb", new Object[]{this});
                            }
                        }

                        @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                        public void onCheckSuccessEnd() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("be01a128", new Object[]{this});
                            }
                        }

                        @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                        public void onNoCaptureEnd() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("921845dc", new Object[]{this});
                            } else if (animationCallback == null) {
                            } else {
                                animationCallback.onAnimationEnd();
                            }
                        }
                    });
                }
            });
        }
    }

    public synchronized void startCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290cf4d", new Object[]{this});
        } else if (this.j == null) {
        } else {
            this.j.runOnUiThread(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FaceAnimationManager.a(FaceAnimationManager.this, 1);
                    if (FaceAnimationManager.e(FaceAnimationManager.this) == null) {
                        return;
                    }
                    FaceAnimationManager.e(FaceAnimationManager.this).startCheck(null);
                }
            });
        }
    }

    public synchronized void checkFail(final AnimationCallback animationCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce1219fe", new Object[]{this, animationCallback});
        } else if (this.j == null) {
        } else {
            this.j.runOnUiThread(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (FaceAnimationManager.e(FaceAnimationManager.this) == null) {
                    } else {
                        if (FaceAnimationManager.i(FaceAnimationManager.this) <= 0) {
                            FaceAnimationManager.this.startCheck();
                            FaceAnimationManager.e(FaceAnimationManager.this).postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.6.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        FaceAnimationManager.this.checkFail(animationCallback);
                                    }
                                }
                            }, 100L);
                            return;
                        }
                        FaceAnimationManager.a(FaceAnimationManager.this, 2);
                        String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_FAILURE);
                        FaceView e = FaceAnimationManager.e(FaceAnimationManager.this);
                        if (TextUtils.isEmpty(clientText)) {
                            clientText = FaceAnimationManager.f(FaceAnimationManager.this).getString(R.string.face_auth_fail);
                        }
                        e.setFaceViewTip(clientText);
                        FaceAnimationManager.e(FaceAnimationManager.this).checkFail(new FaceView.AnimationEndCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.6.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("11c62d39", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckSuccessEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("be01a128", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onNoCaptureEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("921845dc", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckFailEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("ebc1ccbb", new Object[]{this});
                                } else if (animationCallback == null) {
                                } else {
                                    animationCallback.onAnimationEnd();
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public synchronized void checkSuccess(final AnimationCallback animationCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1959a53", new Object[]{this, animationCallback});
        } else if (this.j == null) {
        } else {
            this.j.runOnUiThread(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (FaceAnimationManager.e(FaceAnimationManager.this) == null) {
                    } else {
                        if (FaceAnimationManager.i(FaceAnimationManager.this) <= 0) {
                            FaceAnimationManager.this.startCheck();
                            FaceAnimationManager.e(FaceAnimationManager.this).postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.7.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        FaceAnimationManager.this.checkSuccess(animationCallback);
                                    }
                                }
                            }, 100L);
                            return;
                        }
                        FaceAnimationManager.a(FaceAnimationManager.this, 2);
                        FaceAnimationManager.e(FaceAnimationManager.this).checkSuccess(new FaceView.AnimationEndCallback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.face.FaceAnimationManager.7.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("11c62d39", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckFailEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("ebc1ccbb", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onNoCaptureEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("921845dc", new Object[]{this});
                                }
                            }

                            @Override // com.alipay.android.phone.seauthenticator.iotauth.face.view.FaceView.AnimationEndCallback
                            public void onCheckSuccessEnd() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("be01a128", new Object[]{this});
                                } else if (animationCallback == null) {
                                } else {
                                    animationCallback.onAnimationEnd();
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
