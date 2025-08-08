package tb;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.b;
import com.taobao.update.c;
import com.taobao.update.dialog.a;
import com.taobao.update.framework.UpdateRuntime;

/* loaded from: classes9.dex */
public class rez implements rer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean sClickbg2Exit;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33091a;
    private boolean b;
    private boolean c;

    static {
        kge.a(-1076805616);
        kge.a(-473588679);
    }

    public static /* synthetic */ void a(rez rezVar, Activity activity, String str, rew rewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8beeeeb9", new Object[]{rezVar, activity, str, rewVar});
        } else {
            rezVar.a(activity, str, rewVar);
        }
    }

    public rez() {
        this.c = false;
        this.f33091a = sClickbg2Exit;
    }

    public rez(boolean z) {
        this.c = false;
        this.f33091a = z;
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : StringUtils.isEmpty(str) ? str2 : str;
    }

    @Override // tb.rer
    public void alertForConfirm(final String str, final rew rewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c514dd0", new Object[]{this, str, rewVar});
            return;
        }
        if (rewVar.getConfirmText().equals("立即安装")) {
            this.b = true;
        }
        Log.e("UIConfirmImpl", "alertForConfirm" + UpdateRuntime.getContext());
        Activity peekTopActivity = ren.getInstance().peekTopActivity();
        if (peekTopActivity == null || peekTopActivity.isFinishing() || peekTopActivity.getClass().getName().contains("GuideActivity") || peekTopActivity.getClass().getName().toLowerCase().contains("welcome") || (b.blackDialogActivity != null && b.blackDialogActivity.contains(peekTopActivity.getClass().getName()))) {
            Log.e("UIConfirmImpl", peekTopActivity == null ? "null" : peekTopActivity.getClass().getName());
            UpdateRuntime.getContext().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: tb.rez.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                        return;
                    }
                    Log.e("UIConfirmImpl", "alertForConfirm " + activity.getComponentName().getClassName() + "onresume!");
                    if (b.blackDialogActivity.contains(activity.getClass().getName())) {
                        return;
                    }
                    UpdateRuntime.getContext().unregisterActivityLifecycleCallbacks(this);
                    rez.a(rez.this, activity, str, rewVar);
                }
            });
            return;
        }
        a(peekTopActivity, str, rewVar);
    }

    private void a(Activity activity, String str, final rew rewVar) {
        Dialog bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4be1050", new Object[]{this, activity, str, rewVar});
            return;
        }
        try {
            if (c.getInstance().enableDialogUiV2() && a(rewVar)) {
                bVar = new com.taobao.update.dialog.c(activity, a(rewVar.getTitleText(), "提示"), str, this.f33091a);
                ((com.taobao.update.dialog.c) bVar).setHeaderImg(b(rewVar) ? R.drawable.update_notify : R.drawable.update_confirm);
                ((com.taobao.update.dialog.c) bVar).addAcceptButton(a(rewVar.getConfirmText(), "同意"), new View.OnClickListener() { // from class: tb.rez.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            rewVar.onConfirm();
                        }
                    }
                });
                ((com.taobao.update.dialog.c) bVar).addCancelButton(a(rewVar.getCancelText(), c(rewVar)), new View.OnClickListener() { // from class: tb.rez.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            rewVar.onCancel();
                        }
                    }
                });
            } else {
                if (!this.b && this.c) {
                    bVar = new a.C1007a(activity).setTitle("手机淘宝新版本更新啦,诚邀\n        你抢先体验!").setMessage(str).setNegativeButton(new DialogInterface.OnClickListener() { // from class: tb.rez.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else {
                                rewVar.onCancel();
                            }
                        }
                    }).setPositiveButton("立即参与", new DialogInterface.OnClickListener() { // from class: tb.rez.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else {
                                rewVar.onConfirm();
                            }
                        }
                    }).create();
                }
                bVar = new com.taobao.update.dialog.b(activity, a(rewVar.getTitleText(), "提示"), str, this.f33091a);
                ((com.taobao.update.dialog.b) bVar).addAcceptButton(a(rewVar.getConfirmText(), "同意"), new View.OnClickListener() { // from class: tb.rez.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            rewVar.onConfirm();
                        }
                    }
                });
                ((com.taobao.update.dialog.b) bVar).addCancelButton(a(rewVar.getCancelText(), "拒绝"), new View.OnClickListener() { // from class: tb.rez.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            rewVar.onCancel();
                        }
                    }
                });
            }
            bVar.show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean a(rew rewVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fce3c3b8", new Object[]{this, rewVar})).booleanValue() : rfk.UA_NOTIFY_TYPE.equals(rewVar.getType()) || rfk.UA_NOTIFY_FORCE_TYPE.equals(rewVar.getType()) || rff.UA_INSTALL_TYPE.equals(rewVar.getType()) || rff.UA_INSTALL_FORCE_TYPE.equals(rewVar.getType());
    }

    private boolean b(rew rewVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eb66ca39", new Object[]{this, rewVar})).booleanValue() : rfk.UA_NOTIFY_TYPE.equals(rewVar.getType()) || rfk.UA_NOTIFY_FORCE_TYPE.equals(rewVar.getType());
    }

    private String c(rew rewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5e0e6aa", new Object[]{this, rewVar});
        }
        if (!b(rewVar)) {
            return "拒绝";
        }
        return null;
    }
}
