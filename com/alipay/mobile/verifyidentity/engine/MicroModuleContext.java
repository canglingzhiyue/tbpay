package com.alipay.mobile.verifyidentity.engine;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.callback.ModuleListener;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.injector.StartActivityInjectorUtils;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.ModuleDescription;
import com.alipay.mobile.verifyidentity.module.ModuleLoadException;
import com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager;
import com.alipay.mobile.verifyidentity.rpc.IRpcService;
import com.alipay.mobile.verifyidentity.rpc.IRpcServiceImpl;
import com.alipay.mobile.verifyidentity.rpc.IRpcServiceInjector;
import com.alipay.mobile.verifyidentity.ui.helper.ActivityHelper;
import com.alipay.mobile.verifyidentity.ui.helper.ContextDialogHelper;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MicroModuleContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5862a = "MicroModuleContext";
    private static volatile MicroModuleContext b;
    private ModuleManager d;
    private Map<String, BaseProdManager> e;
    private Activity f;
    private Context g;
    private ContextDialogHelper h;
    private String i;
    private IRpcService j;
    private Handler c = new Handler(Looper.getMainLooper()) { // from class: com.alipay.mobile.verifyidentity.engine.MicroModuleContext.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 1001) {
            } else {
                MicroModuleContext.access$000(MicroModuleContext.this);
            }
        }
    };
    private WeakReference<Context> k = new WeakReference<>(null);

    public static /* synthetic */ ModuleManager access$100(MicroModuleContext microModuleContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ModuleManager) ipChange.ipc$dispatch("bb766d58", new Object[]{microModuleContext}) : microModuleContext.d;
    }

    public static /* synthetic */ String access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("682607c7", new Object[0]) : f5862a;
    }

    public static MicroModuleContext getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModuleContext) ipChange.ipc$dispatch("51020fa9", new Object[0]);
        }
        if (b == null) {
            synchronized (MicroModuleContext.class) {
                if (b == null) {
                    b = new MicroModuleContext();
                }
            }
        }
        return b;
    }

    private MicroModuleContext() {
        ModuleManager moduleManager = new ModuleManager();
        this.e = new HashMap();
        this.d = moduleManager;
    }

    public void exit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81677ea5", new Object[]{this});
        } else {
            exit(false);
        }
    }

    public void exit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8908cf", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = f5862a;
        VerifyLogCat.i(str, "VI exit() called. [rudely]:" + z);
        if (z) {
            TaskManager.getInstance().clearMultiTaskFlag();
        }
        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.synKillPre))) {
            ModuleManager moduleManager = this.d;
            if (moduleManager != null && moduleManager.getTopRunningModule() != null) {
                VerifyLogCat.i(f5862a, "[NEW WAY!] There're modules need to be finished.");
                this.d.notifyAndFinishAllModule();
            }
        } else {
            TaskManager.getInstance().clearAllTasks();
            ModuleManager moduleManager2 = this.d;
            if (moduleManager2 != null && moduleManager2.getTopRunningModule() != null) {
                VerifyLogCat.i(f5862a, "There're modules need to be finished.");
                this.d.finishAllModules();
            }
        }
        dismissProgressDialog();
    }

    public void attachContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff7db7", new Object[]{this, context});
            return;
        }
        this.g = context;
        this.h = new ContextDialogHelper(this.g);
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        if (this.g == null) {
            VerifyLogCat.i(f5862a, "核身引擎Context为空，进入致命恢复逻辑");
            try {
                this.g = (Context) ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.alipay.util.ContextUtils", "getContext", null, null);
            } catch (Throwable th) {
                VerifyLogCat.e(f5862a, "致命恢复失败！！！ ", th);
            }
            Context context = this.g;
            if (context == null) {
                VerifyLogCat.i(f5862a, "Context为空，致命恢复失败！！！");
            } else {
                VerifyIdentityEngine.getInstance(context);
                VerifyLogCat.i(f5862a, "致命恢复成功！");
            }
        }
        return this.g;
    }

    public String getEnvType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("85aafa08", new Object[]{this}) : this.i;
    }

    public void setEnvType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b7cfd6", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void startActivity(MicroModule microModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dbf9044", new Object[]{this, microModule, str});
        } else if (microModule == null || TextUtils.isEmpty(str)) {
            VerifyLogCat.w(f5862a, "startActivity className failed");
        } else {
            Intent intent = new Intent(this.f, a(str));
            intent.putExtra(ActivityHelper.TASK_VERIFYID, microModule.getVerifyId());
            intent.putExtra(ActivityHelper.TASK_TOKEN, microModule.getToken());
            intent.putExtra(ActivityHelper.TASK_MODULENAME, microModule.getModuleName());
            microModule.setIsPrevent(true);
            intent.addFlags(65536);
            if (this.f != null) {
                if (StartActivityInjectorUtils.injectorHandled(intent)) {
                    VerifyLogCat.i(f5862a, "StartActivityInjector HANDLED!!!");
                    return;
                }
                VerifyLogCat.i(f5862a, "startActivity by VI itself!");
                this.f.startActivity(intent);
                return;
            }
            startActivityByContext(intent);
        }
    }

    private Class<?> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("582938df", new Object[]{this, str});
        }
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            Class<?> loadClass = classLoader.loadClass(str);
            Thread.currentThread().setContextClassLoader(classLoader);
            if (loadClass != null) {
                return loadClass;
            }
            throw new ActivityNotFoundException("entry class must be set.");
        } catch (ClassNotFoundException e) {
            throw new ActivityNotFoundException(e.getMessage());
        }
    }

    public void startActivity(MicroModule microModule, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b49aab7", new Object[]{this, microModule, intent});
        } else if (microModule == null || intent == null) {
            VerifyLogCat.w(f5862a, "startActivity intent failed");
        } else {
            intent.putExtra(ActivityHelper.TASK_VERIFYID, microModule.getVerifyId());
            intent.putExtra(ActivityHelper.TASK_TOKEN, microModule.getToken());
            intent.putExtra(ActivityHelper.TASK_MODULENAME, microModule.getModuleName());
            microModule.setIsPrevent(true);
            intent.addFlags(65536);
            if (this.f != null) {
                if (StartActivityInjectorUtils.injectorHandled(intent)) {
                    VerifyLogCat.i(f5862a, "StartActivityInjector HANDLED!!!");
                    return;
                }
                VerifyLogCat.i(f5862a, "startActivity by VI itself!");
                this.f.startActivity(intent);
                return;
            }
            startActivityByContext(intent);
        }
    }

    public void startActivityForMsp(MicroModule microModule, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45174376", new Object[]{this, microModule, intent});
        } else if (microModule == null || intent == null) {
            VerifyLogCat.w(f5862a, "startActivity intent failed");
        } else {
            intent.putExtra(ActivityHelper.TASK_VERIFYID, microModule.getVerifyId());
            intent.putExtra(ActivityHelper.TASK_TOKEN, microModule.getToken());
            intent.putExtra(ActivityHelper.TASK_MODULENAME, microModule.getModuleName());
            microModule.setIsPrevent(true);
            intent.addFlags(65536);
            startActivityByContext(intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void startActivityByContext(android.content.Intent r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r5 = "7ad5818b"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            java.lang.String r0 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.f5862a
            java.lang.String r1 = "startActivity by mContext"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r0, r1)
            boolean r0 = com.alipay.mobile.verifyidentity.injector.StartActivityInjectorUtils.injectorHandled(r5)
            if (r0 == 0) goto L2b
            java.lang.String r5 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.f5862a
            java.lang.String r0 = "StartActivityInjector HANDLED!!!"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r5, r0)
            return
        L2b:
            java.lang.String r0 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.f5862a
            java.lang.String r1 = "startActivity by VI itself!"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r0, r1)
            com.alipay.mobile.verifyidentity.engine.TaskManager r0 = com.alipay.mobile.verifyidentity.engine.TaskManager.getInstance()
            com.alipay.mobile.verifyidentity.data.VerifyIdentityTask r0 = r0.getCurrentTask()
            if (r0 == 0) goto L49
            com.alipay.mobile.verifyidentity.engine.TaskManager r0 = com.alipay.mobile.verifyidentity.engine.TaskManager.getInstance()
            com.alipay.mobile.verifyidentity.data.VerifyIdentityTask r0 = r0.getCurrentTask()
            boolean r2 = r0.getPluginOrProxyMode()
        L49:
            java.lang.String r0 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.f5862a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[getValidStartActivityContext] popMode: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r0, r1)
            java.lang.ref.WeakReference<android.content.Context> r0 = r4.k
            if (r0 == 0) goto L7d
            if (r2 == 0) goto L7d
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L7e
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isFinishing()
            if (r1 != 0) goto L7d
            java.lang.String r1 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.f5862a
            java.lang.String r2 = "[getValidStartActivityContext] Activity 可用"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r1, r2)
            goto L7e
        L7d:
            r0 = 0
        L7e:
            if (r0 != 0) goto L89
            java.lang.String r0 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.f5862a
            java.lang.String r1 = "getRunningActivity is null"
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.i(r0, r1)
            android.content.Context r0 = r4.g
        L89:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L96
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r5.addFlags(r1)
            r0.startActivity(r5)
            return
        L96:
            android.app.Activity r0 = (android.app.Activity) r0
            r0.startActivity(r5)
            r5 = 17432576(0x10a0000, float:2.5346597E-38)
            r1 = 17432577(0x10a0001, float:2.53466E-38)
            r0.overridePendingTransition(r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.engine.MicroModuleContext.startActivityByContext(android.content.Intent):void");
    }

    public void startProdActivityByContext(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ab0074", new Object[]{this, intent});
            return;
        }
        VerifyLogCat.i(f5862a, "startActivity by mContext");
        if (StartActivityInjectorUtils.injectorHandled(intent)) {
            VerifyLogCat.i(f5862a, "StartActivityInjector HANDLED!!!");
            return;
        }
        VerifyLogCat.i(f5862a, "startActivity by VI itself!");
        intent.putExtra(ActivityHelper.PROD_ACTIVITY, true);
        Context context = this.g;
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
            if (this.g == null) {
                this.g = getContext();
            }
            this.g.startActivity(intent);
            return;
        }
        Activity activity = (Activity) context;
        activity.startActivity(intent);
        activity.overridePendingTransition(17432576, 17432577);
    }

    public void startModule(final String str, final String str2, final String str3, final String str4, final Bundle bundle, final ModuleListener moduleListener, final VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a4cc4e", new Object[]{this, str, str2, str3, str4, bundle, moduleListener, verifyIdentityTask});
        } else {
            this.c.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.MicroModuleContext.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        MicroModuleContext.access$100(MicroModuleContext.this).startModule(str, str2, str3, str4, bundle, moduleListener, verifyIdentityTask);
                    } catch (ModuleLoadException e) {
                        VerifyLogCat.e(MicroModuleContext.access$200(), e);
                    }
                }
            });
        }
    }

    public void finishModule(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6435bb44", new Object[]{this, str, str2, str3});
        } else {
            this.c.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.MicroModuleContext.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MicroModuleContext.access$100(MicroModuleContext.this).finishModule(str, str2, str3);
                    }
                }
            });
        }
    }

    public void finishTask(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc84ded3", new Object[]{this, str, str2});
        } else {
            this.c.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.MicroModuleContext.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MicroModuleContext.access$100(MicroModuleContext.this).finishTask(str, str2);
                    }
                }
            });
        }
    }

    public void notifyModuleResult(final String str, final String str2, final String str3, final ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c2af67", new Object[]{this, str, str2, str3, moduleExecuteResult});
        } else {
            this.c.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.MicroModuleContext.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MicroModuleContext.access$100(MicroModuleContext.this).notifyModuleResult(str, str2, str3, moduleExecuteResult);
                    }
                }
            });
        }
    }

    public void notifyAndFinishModule(final String str, final String str2, final String str3, final ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8264a80c", new Object[]{this, str, str2, str3, moduleExecuteResult});
        } else {
            this.c.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.MicroModuleContext.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MicroModuleContext.access$100(MicroModuleContext.this).notifyModuleResult(str, str2, str3, moduleExecuteResult);
                    MicroModuleContext.access$100(MicroModuleContext.this).finishModule(str, str2, str3);
                }
            });
        }
    }

    public WeakReference<Activity> getTopActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("c699f323", new Object[]{this}) : new WeakReference<>(this.f);
    }

    public MicroModule findModule(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("cee7732c", new Object[]{this, str, str2, str3}) : this.d.findModule(str, str2, str3);
    }

    public BaseProdManager findProManager(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseProdManager) ipChange.ipc$dispatch("6aadfd81", new Object[]{this, str}) : this.e.get(str);
    }

    public void addProManager(String str, BaseProdManager baseProdManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a7cbe7", new Object[]{this, str, baseProdManager});
        } else {
            this.e.put(str, baseProdManager);
        }
    }

    public void onDestroyProManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e40d4ec2", new Object[]{this});
            return;
        }
        Map<String, BaseProdManager> map = this.e;
        if (map == null) {
            return;
        }
        map.clear();
    }

    public void onDestroyModule(MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf904be4", new Object[]{this, microModule});
            return;
        }
        ModuleManager moduleManager = this.d;
        if (moduleManager == null) {
            return;
        }
        moduleManager.onDestroyModule(microModule);
    }

    public Activity updateActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("c06971b7", new Object[]{this, activity});
        }
        Activity activity2 = this.f;
        this.f = activity;
        return activity2;
    }

    public void addDescription(ModuleDescription... moduleDescriptionArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40b415f", new Object[]{this, moduleDescriptionArr});
        } else {
            this.d.addDescription(moduleDescriptionArr);
        }
    }

    public void showProgressDialog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a6743", new Object[]{this, str});
            return;
        }
        ContextDialogHelper contextDialogHelper = this.h;
        if (contextDialogHelper != null) {
            contextDialogHelper.showProgressDialog(str);
        } else {
            VerifyLogCat.w(f5862a, "showProgressDialog error");
        }
    }

    public void showProgressProDialog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e11fd7c", new Object[]{this, str});
            return;
        }
        ContextDialogHelper contextDialogHelper = this.h;
        if (contextDialogHelper != null) {
            contextDialogHelper.showProgressProDialog(str);
        } else {
            VerifyLogCat.w(f5862a, "showProgressDialog error");
        }
    }

    public void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a225aa", new Object[]{this, str, new Boolean(z), onCancelListener});
        } else if (this.h != null) {
            VerifyLogCat.i(f5862a, "showProgressDialog");
            this.h.showProgressDialog(str, z, onCancelListener);
        } else {
            VerifyLogCat.w(f5862a, "showProgressDialog error");
        }
    }

    public void dismissProgressDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa6c806", new Object[]{this});
        } else if (this.h != null) {
            VerifyLogCat.i(f5862a, "dismissProgressDialog");
            this.h.dismissProgressDialog();
        } else {
            VerifyLogCat.w(f5862a, "dismissProgressDialog error");
        }
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392f581d", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bundle});
        } else if (this.h != null) {
            VerifyLogCat.i(f5862a, "alert");
            this.h.alert(str, str2, str3, onClickListener, str4, onClickListener2, bundle);
        } else {
            VerifyLogCat.w(f5862a, "alert error");
        }
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
        } else if (this.h != null) {
            VerifyLogCat.i(f5862a, "alert");
            this.h.alert(str, str2, str3, onClickListener, str4, onClickListener2, null);
        } else {
            VerifyLogCat.w(f5862a, "alert error");
        }
    }

    public void toast(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
        } else if (this.h != null) {
            VerifyLogCat.i(f5862a, "toast");
            this.h.toast(str, i);
        } else {
            VerifyLogCat.w(f5862a, "toast error");
        }
    }

    public void toast(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22158bd8", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.h != null) {
            VerifyLogCat.i(f5862a, "toast");
            this.h.toast(str, i, i2);
        } else {
            VerifyLogCat.w(f5862a, "toast error");
        }
    }

    public boolean canTaskContinue(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10f55f77", new Object[]{this, verifyIdentityTask})).booleanValue();
        }
        if (verifyIdentityTask == null) {
            return false;
        }
        if (VerifyIdentityTask.TaskStatus.OVER.equals(verifyIdentityTask.getTaskStatus())) {
            VerifyLogCat.i(f5862a, "任务已结束");
            return false;
        }
        VerifyLogCat.i(f5862a, "任务正常");
        return true;
    }

    public void setStartActivityContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb58ec1", new Object[]{this, context});
        } else {
            this.k = new WeakReference<>(context);
        }
    }

    private static int a() {
        String reportFlag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        try {
            reportFlag = ReportHelper.getReportFlag(ReportHelper.enableMultiCashierFixPolice);
            String str = f5862a;
            VerifyLogCat.i(str, "getStartActivityTimeoutMs config: " + reportFlag);
        } catch (Throwable th) {
            VerifyLogCat.e(f5862a, "getStartActivityTimeoutMs exp: ", th);
        }
        return "Y".equalsIgnoreCase(reportFlag) ? 10000 : 0;
    }

    public void setStartActivityMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("128c7912", new Object[]{this});
            return;
        }
        try {
            int a2 = a();
            if (a2 <= 0 || this.c == null) {
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = 1001;
            VerifyLogCat.i(f5862a, "send msg MSG_START_ACTIVITY_FAIL");
            this.c.sendMessageDelayed(obtain, a2);
        } catch (Throwable th) {
            VerifyLogCat.e(f5862a, "setStartActivityMonitor exp: ", th);
        }
    }

    public void removeStartActivityMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04bef34", new Object[]{this});
            return;
        }
        try {
            VerifyLogCat.i(f5862a, "remove msg MSG_START_ACTIVITY_FAIL");
            if (this.c == null) {
                return;
            }
            this.c.removeMessages(1001);
        } catch (Throwable th) {
            VerifyLogCat.e(f5862a, "removeStartActivityMonitor exp: ", th);
        }
    }

    public IRpcService getRpcService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRpcService) ipChange.ipc$dispatch("1ac199ab", new Object[]{this});
        }
        IRpcService rpcService = IRpcServiceInjector.getInstance().getRpcService();
        if (rpcService == null) {
            rpcService = new IRpcServiceImpl();
        }
        this.j = rpcService;
        if (TaskManager.getInstance().getCurrentTask() != null) {
            this.j.setGW(TaskManager.getInstance().getCurrentTask().gwUrl);
        }
        return this.j;
    }

    public static /* synthetic */ void access$000(MicroModuleContext microModuleContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacf851c", new Object[]{microModuleContext});
            return;
        }
        try {
            VerifyLogCat.i(f5862a, "handleStartActivityTimeout");
            if (microModuleContext.d == null || microModuleContext.d.getTopRunningModule() == null) {
                return;
            }
            MicroModule topRunningModule = microModuleContext.d.getTopRunningModule();
            DefaultModuleResult defaultModuleResult = new DefaultModuleResult("1003");
            if (defaultModuleResult.getExtInfo() == null) {
                defaultModuleResult.setExtInfo(new HashMap<>());
            }
            defaultModuleResult.getExtInfo().put("subCode", CommonConstant.CANCEL_SUB_BY_START_ACTIVITY_TIMEOUT);
            String str = f5862a;
            VerifyLogCat.i(str, "handleStartActivityTimeout verifyId: " + topRunningModule.getVerifyId() + ", token: " + topRunningModule.getToken() + ", moduleName: " + topRunningModule.getModuleName());
            microModuleContext.notifyAndFinishModule(topRunningModule.getVerifyId(), topRunningModule.getToken(), topRunningModule.getModuleName(), defaultModuleResult);
        } catch (Throwable th) {
            VerifyLogCat.e(f5862a, "handleStartActivityTimeout exp: ", th);
        }
    }
}
