package com.alipay.mobile.verifyidentity.engine;

import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.verifyidentity.callback.ModuleListener;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.ModuleDescription;
import com.alipay.mobile.verifyidentity.module.ModuleLoadException;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import tb.riy;

/* loaded from: classes3.dex */
public class ModuleManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5867a = "ModuleManager";
    private Stack<MicroModule> b = new Stack<>();
    private Map<String, MicroModule> c = new HashMap();
    private List<ModuleDescription> d = new ArrayList();

    public void notifyModuleResult(String str, String str2, String str3, ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c2af67", new Object[]{this, str, str2, str3, moduleExecuteResult});
            return;
        }
        String a2 = a(str, str2, str3);
        String str4 = f5867a;
        VerifyLogCat.i(str4, a2 + " notifyModuleResult");
        MicroModule microModule = this.c.get(a2);
        if (microModule == null) {
            return;
        }
        microModule.notifyResult(moduleExecuteResult);
    }

    public synchronized void finishModule(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6435bb44", new Object[]{this, str, str2, str3});
        } else {
            a(a(str, str2, str3));
        }
    }

    public synchronized void finishAllModules() {
        MicroModule microModule;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c167ba0", new Object[]{this});
        } else if (this.c == null) {
            VerifyLogCat.d(f5867a, "no microModule need to be finished");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.c);
            for (String str : hashMap.keySet()) {
                if (!VIUtils.isMultiTaskModeEnabled() || (microModule = (MicroModule) hashMap.get(str)) == null || microModule.getTask() == null || !microModule.getTask().keepOnMultiMode()) {
                    a(str);
                }
            }
        }
    }

    private synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        MicroModule microModule = this.c.get(str);
        if (microModule != null) {
            String str2 = f5867a;
            VerifyLogCat.d(str2, "finishModule microModule: " + str);
            microModule.destroy();
            return;
        }
        String str3 = f5867a;
        VerifyLogCat.w(str3, "finishModule can't find microModule: " + str);
    }

    public synchronized void notifyAndFinishAllModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b2eef3", new Object[]{this});
        } else if (this.c == null) {
            VerifyLogCat.d(f5867a, "no microModule need to be finished");
        } else {
            VerifyLogCat.i(f5867a, "Now to [notifyAndFinishAllModule]!");
            DefaultModuleResult defaultModuleResult = new DefaultModuleResult("1003");
            if (defaultModuleResult.getExtInfo() == null) {
                defaultModuleResult.setExtInfo(new HashMap<>());
            }
            defaultModuleResult.getExtInfo().put("subCode", "101");
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.c);
            for (String str : hashMap.keySet()) {
                MicroModule microModule = (MicroModule) hashMap.get(str);
                if (microModule != null && (!VIUtils.isMultiTaskModeEnabled() || microModule.getTask() == null || !microModule.getTask().keepOnMultiMode())) {
                    if (microModule.isFindAndPay) {
                        defaultModuleResult.setFindAndPay(true);
                    }
                    if (microModule.getTask() != null) {
                        defaultModuleResult.getExtInfo().put("nextProVid", microModule.getTask().nextProVid);
                    }
                    notifyModuleResult(microModule.getVerifyId(), microModule.getToken(), microModule.getModuleName(), defaultModuleResult);
                    finishModule(microModule.getVerifyId(), microModule.getToken(), microModule.getModuleName());
                    String str2 = f5867a;
                    VerifyLogCat.i(str2, "Module " + str + " have been finished!");
                }
            }
        }
    }

    public void finishTask(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc84ded3", new Object[]{this, str, str2});
            return;
        }
        String str3 = f5867a;
        VerifyLogCat.d(str3, "finishTask verifyId: " + str + " token: " + str2);
        for (MicroModule microModule : this.c.values()) {
            if (StringUtils.isEmpty(str)) {
                if (!StringUtils.isEmpty(str2) && str2.equals(microModule.getToken())) {
                    microModule.destroy();
                    String str4 = f5867a;
                    VerifyLogCat.d(str4, "finishModule microModule by token: " + microModule.getModuleName());
                }
            } else if (!StringUtils.isEmpty(str) && str.equals(microModule.getVerifyId())) {
                microModule.destroy();
                String str5 = f5867a;
                VerifyLogCat.d(str5, "finishModule microModule by verifyId: " + microModule.getVerifyId());
            }
        }
    }

    public MicroModule findModule(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("cee7732c", new Object[]{this, str, str2, str3}) : this.c.get(a(str, str2, str3));
    }

    private static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        return str + "_" + str2 + "_" + str3;
    }

    public synchronized void startModule(String str, String str2, String str3, String str4, Bundle bundle, ModuleListener moduleListener, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a4cc4e", new Object[]{this, str, str2, str3, str4, bundle, moduleListener, verifyIdentityTask});
            return;
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            VerifyLogCat.e(f5867a, "token or moduleName should not be empty");
        }
        String str5 = f5867a;
        VerifyLogCat.i(str5, "startModule(): [token=" + str2 + "], [moduleName=" + str3 + riy.ARRAY_END_STR);
        a(str, str2, str3, str4, bundle, moduleListener, verifyIdentityTask);
    }

    private boolean a(String str, String str2, String str3, String str4, Bundle bundle, ModuleListener moduleListener, VerifyIdentityTask verifyIdentityTask) {
        ModuleDescription b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60e0567f", new Object[]{this, str, str2, str3, str4, bundle, moduleListener, verifyIdentityTask})).booleanValue();
        }
        if (verifyIdentityTask.isDynamicMode) {
            VerifyLogCat.i(f5867a, "[startNativeModule] Task is in dynamic mode now. It will use the unified dynamic module!");
            b = b(ModuleConstants.VI_MODULE_NAME_DYNAMIC_CENTER);
        } else if (verifyIdentityTask.isIPay) {
            b = b(str3 + "_INTERNAL");
        } else {
            b = b(str3);
        }
        if (b != null) {
            try {
                if (!MicroModuleContext.getInstance().canTaskContinue(verifyIdentityTask)) {
                    String str5 = f5867a;
                    VerifyLogCat.w(str5, "当前任务已过期，无需再启动 [" + str3 + riy.ARRAY_END_STR);
                } else {
                    MicroModule a2 = a(b, bundle);
                    a2.setModuleName(str3);
                    a2.create(str, str2, str4, bundle, moduleListener, verifyIdentityTask);
                    this.b.push(a2);
                    this.c.put(a(str, str2, str3), a2);
                    String str6 = f5867a;
                    VerifyLogCat.i(str6, "createModule() completed " + b);
                    a2.start();
                }
                return true;
            } catch (ModuleLoadException e) {
                VerifyLogCat.e(f5867a, e);
            }
        }
        String str7 = f5867a;
        VerifyLogCat.w(str7, "Failed to find ModuleDescription by [" + str3 + riy.ARRAY_END_STR);
        if (moduleListener != null) {
            moduleListener.onModuleExecuteResult(str, str2, str3, new DefaultModuleResult("2002"), verifyIdentityTask);
        }
        return false;
    }

    private static MicroModule a(ModuleDescription moduleDescription, Bundle bundle) {
        String str = f5867a;
        VerifyLogCat.d(str, "createModuleByDescription: " + moduleDescription.getModuleName());
        String str2 = f5867a;
        StringBuilder sb = new StringBuilder("params is ");
        sb.append(bundle != null ? "not" : "");
        sb.append("null");
        VerifyLogCat.d(str2, sb.toString());
        Object obj = null;
        String className = moduleDescription.getClassName();
        try {
            Class<?> cls = Class.forName(className);
            if (cls != null) {
                obj = cls.newInstance();
            }
            if (!(obj instanceof MicroModule)) {
                throw new ModuleLoadException("Module " + className + " is not a Module");
            }
            return (MicroModule) obj;
        } catch (Throwable th) {
            throw new ModuleLoadException("Module Exception: " + th);
        }
    }

    private synchronized ModuleDescription b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModuleDescription) ipChange.ipc$dispatch("6876ba95", new Object[]{this, str});
        }
        ModuleDescription moduleDescription = null;
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        Iterator<ModuleDescription> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ModuleDescription next = it.next();
            if (str.equalsIgnoreCase(next.getModuleName())) {
                moduleDescription = next;
                break;
            }
        }
        return moduleDescription;
    }

    public synchronized void addDescription(ModuleDescription... moduleDescriptionArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40b415f", new Object[]{this, moduleDescriptionArr});
            return;
        }
        if (moduleDescriptionArr != null && moduleDescriptionArr.length > 0) {
            this.d.addAll(Arrays.asList(moduleDescriptionArr));
        }
    }

    public synchronized void onDestroyModule(MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf904be4", new Object[]{this, microModule});
            return;
        }
        this.b.remove(microModule);
        String a2 = a(microModule.getVerifyId(), microModule.getToken(), microModule.getModuleName());
        this.c.remove(a2);
        String str = f5867a;
        VerifyLogCat.d(str, "onDestroyModule pop microModule: " + a2);
    }

    public MicroModule getTopRunningModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("98572ff5", new Object[]{this});
        }
        Stack<MicroModule> stack = this.b;
        if (stack != null && !stack.isEmpty()) {
            return this.b.peek();
        }
        return null;
    }
}
