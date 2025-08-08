package com.alipay.mobile.verifyidentity.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.common.VerifyType;
import com.alipay.mobile.verifyidentity.data.VISrcCode;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.TimeCostLog;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.log.crash.VerifyIdentityCrashHandler;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.alipay.mobile.verifyidentity.utils.IDecisionHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes3.dex */
public class TaskManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5868a = "TaskManager";
    private static volatile TaskManager b;
    private VerifyIdentityTask d;
    private Handler c = new Handler(Looper.getMainLooper());
    private Stack<VerifyIdentityTask> e = new Stack<>();
    private SlientModule f = null;
    private Object g = new Object();

    /* renamed from: com.alipay.mobile.verifyidentity.engine.TaskManager$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$mobile$verifyidentity$common$VerifyType = new int[VerifyType.values().length];

        static {
            try {
                $SwitchMap$com$alipay$mobile$verifyidentity$common$VerifyType[VerifyType.TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$mobile$verifyidentity$common$VerifyType[VerifyType.VERIFYID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class SlientModule {
        public String nextModuleData;
        public String nextVerifyId;

        public SlientModule() {
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : f5868a;
    }

    public static TaskManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskManager) ipChange.ipc$dispatch("63407aa6", new Object[0]);
        }
        if (b == null) {
            synchronized (TaskManager.class) {
                if (b == null) {
                    b = new TaskManager();
                }
            }
        }
        return b;
    }

    private TaskManager() {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0113 A[Catch: Throwable -> 0x0117, TRY_LEAVE, TryCatch #0 {Throwable -> 0x0117, blocks: (B:25:0x00e1, B:27:0x00e7, B:29:0x00ed, B:31:0x00f7, B:33:0x0107, B:38:0x0113), top: B:44:0x00e1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onTaskOver(java.lang.String r15, java.lang.String r16, com.alipay.mobile.verifyidentity.data.VerifyIdentityResult r17, com.alipay.mobile.verifyidentity.data.VerifyIdentityTask r18) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.engine.TaskManager.onTaskOver(java.lang.String, java.lang.String, com.alipay.mobile.verifyidentity.data.VerifyIdentityResult, com.alipay.mobile.verifyidentity.data.VerifyIdentityTask):void");
    }

    public void clearAllTasks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f37361", new Object[]{this});
            return;
        }
        VerifyLogCat.i(f5868a, "clear all tasks");
        try {
            VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult("1003");
            if (verifyIdentityResult.getExtInfo() == null) {
                verifyIdentityResult.setExtInfo(new HashMap<>());
            }
            verifyIdentityResult.getExtInfo().put("subCode", "101");
            if (getCurrentTask() != null) {
                verifyIdentityResult.getExtInfo().put("nextProVid", getCurrentTask().nextProVid);
            }
            new VISrcCode().addEngineCode(verifyIdentityResult, "catcc");
            if (VIUtils.isMultiTaskModeEnabled()) {
                Iterator<VerifyIdentityTask> it = this.e.iterator();
                while (it.hasNext()) {
                    VerifyIdentityTask next = it.next();
                    if (!next.keepOnMultiMode()) {
                        notifyVerifyTaskResult(next.getVerifyId(), next.getToken(), verifyIdentityResult, next);
                    }
                }
            } else if (getCurrentTask() == null) {
            } else {
                notifyVerifyTaskResult(getCurrentTask().getVerifyId(), getCurrentTask().getToken(), verifyIdentityResult, getCurrentTask());
            }
        } catch (Throwable th) {
            VerifyLogCat.e(f5868a, "clearAllTasks error: ", th);
        }
    }

    public void addTaskInstace(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27904cce", new Object[]{this, verifyIdentityTask});
        } else if (isDowngradTaskLock()) {
            addTaskInstaceV1(verifyIdentityTask);
        } else {
            addTaskInstaceV2(verifyIdentityTask);
        }
    }

    public synchronized void addTaskInstaceV1(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b7e069", new Object[]{this, verifyIdentityTask});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (needCleanTasks()) {
            if (getCurrentTask() != null) {
                getCurrentTask().nextProVid = verifyIdentityTask.getVerifyId();
            }
            if (verifyIdentityTask.getPluginOrProxyMode()) {
                MicroModuleContext.getInstance().exit(true);
            }
            MicroModuleContext.getInstance().exit();
        } else {
            VerifyLogCat.i(f5868a, "no need to clean tasks");
        }
        setCurrentTask(verifyIdentityTask);
        this.e.push(verifyIdentityTask);
        VIFBPluginManager.flushPlugins(verifyIdentityTask.getVerifyId());
        TimeCostLog.log(f5868a, "addTaskInstace耗时：", elapsedRealtime);
        a(verifyIdentityTask);
        VerifyIdentityCrashHandler.getInstance().start();
    }

    public void addTaskInstaceV2(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc4764aa", new Object[]{this, verifyIdentityTask});
            return;
        }
        synchronized (this.g) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (needCleanTasks()) {
                if (getCurrentTask() != null) {
                    getCurrentTask().nextProVid = verifyIdentityTask.getVerifyId();
                }
                if (verifyIdentityTask.getPluginOrProxyMode()) {
                    MicroModuleContext.getInstance().exit(true);
                }
                MicroModuleContext.getInstance().exit();
            } else {
                VerifyLogCat.i(f5868a, "no need to clean tasks");
            }
            setCurrentTask(verifyIdentityTask);
            this.e.push(verifyIdentityTask);
            VIFBPluginManager.flushPlugins(verifyIdentityTask.getVerifyId());
            TimeCostLog.log(f5868a, "addTaskInstace耗时：", elapsedRealtime);
            a(verifyIdentityTask);
            VerifyIdentityCrashHandler.getInstance().start();
        }
    }

    public static boolean isDowngradTaskLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33f88335", new Object[0])).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("VerifyIdentityConfig", "alipay_verifyidentity_add_task_lock_config", "");
            String str = f5868a;
            DecisionLogcat.b(str, "ViTbDecisionReceiver.alipay_verifyidentity_add_task_lock_config = " + config);
            return "Y".equalsIgnoreCase(config);
        } catch (Throwable th) {
            String str2 = f5868a;
            DecisionLogcat.a(str2, "error:" + th.getMessage());
            return false;
        }
    }

    private static void a(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b62fd8", new Object[]{verifyIdentityTask});
            return;
        }
        VerifyLogCat.i(f5868a, "handleTask");
        verifyIdentityTask.setTaskStatus(VerifyIdentityTask.TaskStatus.RUN);
        String token = verifyIdentityTask.getToken();
        String verifyId = verifyIdentityTask.getVerifyId();
        VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-150810-1", Constants.VI_ENGINE_APPID, "mdhxhssdk", token, verifyId, null, b(verifyIdentityTask));
        verifyIdentityTask.mTaskStartTime = SystemClock.elapsedRealtime();
        if (verifyIdentityTask.getPluginOrProxyMode()) {
            IDecisionHelper.sendLocalBroadcast(IDecisionHelper.VI_ENTER_ACTION, "mobilecashier_mobile_cashier_mobile_cashier_payment_app", verifyId);
        } else {
            IDecisionHelper.sendLocalBroadcast(IDecisionHelper.VI_ENTER_ACTION, verifyIdentityTask.sceneId, verifyId);
        }
        ModuleFlowController.getInstance().startVerifyTask(verifyIdentityTask);
    }

    public synchronized void notifyVerifyTaskResult(final String str, final String str2, final VerifyIdentityResult verifyIdentityResult, final VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83619a7", new Object[]{this, str, str2, verifyIdentityResult, verifyIdentityTask});
        } else if (verifyIdentityTask == null) {
            VerifyLogCat.w(f5868a, "notifyVerifyTaskResult task is null");
            onTaskOver(str, str2, verifyIdentityResult, verifyIdentityTask);
        } else if (MicroModuleContext.getInstance().canTaskContinue(verifyIdentityTask)) {
            VerifyLogCat.i(f5868a, "上下文中task与当前task匹配");
            verifyIdentityTask.setTaskStatus(VerifyIdentityTask.TaskStatus.OVER);
            if (verifyIdentityTask.getListener() != null || verifyIdentityTask.getVidListener() != null) {
                this.c.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.TaskManager.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        VerifyIdentityResult verifyIdentityResult2 = verifyIdentityResult;
                        if (verifyIdentityResult2 == null) {
                            VerifyLogCat.e(TaskManager.access$000(), "notifyVerifyTaskResult result is null");
                            TaskManager.access$100(TaskManager.this, str, str2, verifyIdentityTask, new VerifyIdentityResult("2002"));
                        } else if (verifyIdentityResult2.getExtInfo() != null && Boolean.valueOf(String.valueOf(verifyIdentityResult.getExtInfo().get(ModuleConstants.MODULE_NO_NEED_TO_CALLBACK))).booleanValue()) {
                            String access$000 = TaskManager.access$000();
                            VerifyLogCat.i(access$000, "NO NEED to notifyVerifyTaskResult result:" + verifyIdentityResult.getCode() + " verifyId: " + str + " token:" + str2 + " bizName:" + verifyIdentityTask.getBizName());
                        } else {
                            String access$0002 = TaskManager.access$000();
                            VerifyLogCat.i(access$0002, "notifyVerifyTaskResult result:" + verifyIdentityResult.getCode() + " verifyId: " + str + " token:" + str2 + " bizName:" + verifyIdentityTask.getBizName());
                            TaskManager.access$100(TaskManager.this, str, str2, verifyIdentityTask, verifyIdentityResult);
                        }
                    }
                });
            }
            setCurrentTask(null);
            onTaskOver(str, str2, verifyIdentityResult, verifyIdentityTask);
        } else {
            VerifyLogCat.i(f5868a, "上下文中task与当前task不匹配，本次任务已过期（之前已回调），不再回调");
        }
    }

    private static HashMap<String, String> a(VerifyIdentityResult verifyIdentityResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9f81263", new Object[]{verifyIdentityResult});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (verifyIdentityResult == null) {
            return hashMap;
        }
        try {
            HashMap<String, String> hashMap2 = new HashMap<>();
            try {
                hashMap2.put("code", verifyIdentityResult.getCode());
                hashMap2.put("message", verifyIdentityResult.getMessage());
                if (verifyIdentityResult.getExtInfo() != null) {
                    Object obj = verifyIdentityResult.getExtInfo().get("subCode");
                    Object obj2 = verifyIdentityResult.getExtInfo().get(VerifyIdentityResult.SRC_CODE_KEY);
                    Object obj3 = verifyIdentityResult.getExtInfo().get("cancel_scene");
                    if (obj != null) {
                        hashMap2.put("subCode", String.valueOf(obj));
                    }
                    if (obj2 != null) {
                        hashMap2.put(VerifyIdentityResult.SRC_CODE_KEY, String.valueOf(obj2));
                    }
                    if (obj3 != null) {
                        hashMap2.put("cancel_scene", String.valueOf(obj3));
                    }
                }
            } catch (Throwable unused) {
            }
            return hashMap2;
        } catch (Throwable unused2) {
            return hashMap;
        }
    }

    public synchronized void setCurrentTask(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df1b7713", new Object[]{this, verifyIdentityTask});
            return;
        }
        this.d = verifyIdentityTask;
        if (this.d != null) {
            VerifyLogger.getInstance().setVerifyId(this.d.getVerifyId());
        }
    }

    public synchronized VerifyIdentityTask getCurrentTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityTask) ipChange.ipc$dispatch("e3fb0fb7", new Object[]{this});
        } else if (VIUtils.isMultiTaskModeEnabled()) {
            if (!this.e.empty()) {
                return this.e.peek();
            }
            return this.d;
        } else {
            return this.d;
        }
    }

    public synchronized boolean preCheckTaskQueue(String str, VerifyType verifyType) {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d77c06b6", new Object[]{this, str, verifyType})).booleanValue();
        }
        VerifyIdentityTask currentTask = getCurrentTask();
        if (currentTask == null) {
            z = false;
        } else if (AnonymousClass4.$SwitchMap$com$alipay$mobile$verifyidentity$common$VerifyType[verifyType.ordinal()] == 1) {
            z = StringUtils.equals(str, currentTask.getToken());
        } else {
            z = StringUtils.equals(str, currentTask.getVerifyId());
        }
        if (z) {
            String str2 = f5868a;
            VerifyLogCat.d(str2, verifyType.toString() + ResponseProtocolType.COMMENT + str + "is already exist in currentTask");
        } else {
            z2 = true;
        }
        return z2;
    }

    public boolean needCleanTasks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc88b06", new Object[]{this})).booleanValue();
        }
        VerifyIdentityTask currentTask = getCurrentTask();
        if (currentTask != null && VerifyIdentityTask.TaskStatus.OVER != currentTask.getTaskStatus()) {
            return true;
        }
        VerifyLogCat.d(f5868a, "no task on going");
        return false;
    }

    public void clearMultiTaskFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b29ba4", new Object[]{this});
            return;
        }
        try {
            Iterator<VerifyIdentityTask> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().isMultiTaskEnabled = false;
            }
        } catch (Throwable th) {
            VerifyLogCat.w(f5868a, "清理task标异常", th);
        }
    }

    private static Map<String, String> b(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f15a268e", new Object[]{verifyIdentityTask});
        }
        HashMap hashMap = new HashMap();
        if (verifyIdentityTask != null) {
            hashMap.put("sceneId", verifyIdentityTask.sceneId);
            hashMap.put("bizId", verifyIdentityTask.bizId);
            hashMap.put(Constants.VI_ENGINE_VERIFY_TYPE, verifyIdentityTask.getCompatibleVerifyType());
        }
        return hashMap;
    }

    public void addSlientModule(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2a1501", new Object[]{this, jSONObject});
            return;
        }
        SlientModule slientModule = new SlientModule();
        slientModule.nextVerifyId = jSONObject.getString("nextVerifyId");
        slientModule.nextModuleData = jSONObject.getString("nextModuleData");
        String str = f5868a;
        VerifyLogCat.i(str, "[addSlientModule] nextVerifyId: " + slientModule.nextVerifyId + " , nextModuleData: " + slientModule.nextModuleData);
        this.f = slientModule;
    }

    public static /* synthetic */ void access$100(TaskManager taskManager, String str, String str2, VerifyIdentityTask verifyIdentityTask, VerifyIdentityResult verifyIdentityResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14af3348", new Object[]{taskManager, str, str2, verifyIdentityTask, verifyIdentityResult});
        } else if (verifyIdentityTask == null) {
            VerifyLogCat.w(f5868a, "notifyListenerResult task is null");
        } else if (verifyIdentityTask.getVidListener() == null && verifyIdentityTask.getListener() == null) {
            VerifyLogCat.i(f5868a, "no listener to callback");
        } else {
            VerifyLogCat.i(f5868a, "notifyListenerResult");
            if (VerifyType.FAST_INIT.equals(verifyIdentityTask.getVerifyType()) || VerifyType.FAST_DIRECT.equals(verifyIdentityTask.getVerifyType())) {
                verifyIdentityTask.getVidListener().onVerifyResult(str, str2, verifyIdentityTask.getBizName(), verifyIdentityResult);
            } else if (StringUtils.isEmpty(str) && verifyIdentityTask.getListener() != null) {
                verifyIdentityTask.getListener().onVerifyResult(str2, verifyIdentityTask.getBizName(), verifyIdentityResult);
            } else if (StringUtils.isEmpty(str) || verifyIdentityTask.getVidListener() == null) {
            } else {
                verifyIdentityTask.getVidListener().onVerifyResult(str, str2, verifyIdentityTask.getBizName(), verifyIdentityResult);
            }
        }
    }
}
