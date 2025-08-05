package com.taobao.unit.center.sync;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.message.kit.threadpool.BaseRunnable;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.FileUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel;
import com.taobao.unit.center.sync.constant.SyncConstant;
import com.taobao.unit.center.sync.model.TemplateRequest;
import com.taobao.unit.center.sync.packer.TemplatePacker;
import com.taobao.unit.center.sync.syncable.ISyncable;
import com.taobao.unit.center.sync.syncable.SyncHandler;
import com.taobao.unit.center.sync.syncable.TemplateSyncable;
import com.taobao.unit.center.sync.tool.EnvTool;
import com.taobao.unit.center.templatesync.ITemplateSyncService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import org.json.JSONObject;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\bH\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\bH\u0017J\b\u0010\"\u001a\u00020\u0016H\u0016J\b\u0010#\u001a\u00020\u0016H\u0002J\u0006\u0010$\u001a\u00020\u0016J\b\u0010%\u001a\u00020\u0016H\u0002J\b\u0010&\u001a\u00020\u0016H\u0016J\u0018\u0010'\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010,\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/taobao/unit/center/sync/TemplateSyncManager;", "Lcom/taobao/unit/center/templatesync/ITemplateSyncService;", "()V", "KEY_LAYOUTID", "", "KEY_LAYOUT_MAP", "KEY_SYNC", "curResetCount", "", "isInit", "", "isReset", "maxResetCount", "syncListenerList", "Ljava/util/ArrayList;", "Lcom/taobao/unit/center/templatesync/ITemplateSyncService$ISyncListener;", "syncable", "Lcom/taobao/unit/center/sync/syncable/TemplateSyncable;", "templateId2DataMap", "Ljava/util/concurrent/ConcurrentHashMap;", "templateId2LayoutIdMap", "addSyncListener", "", DataReceiveMonitor.CB_LISTENER, "checkDoSingleMakeup", "templateId", "checkSync", "getLayoutId", "getLayoutStyle", "layout", "getSharedPreference", "Lcom/alibaba/fastjson/JSONObject;", "inputId", "getTemplateData", "init", "initDegrade", "intMessageTab", "notifyChange", "reInit", "remoteSingleSyncFunc", "jsonObject", "Lorg/json/JSONObject;", "remoteSyncSuccessFunc", "removeSyncListener", DMComponent.RESET, "Companion", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class TemplateSyncManager implements ITemplateSyncService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion;
    private static TemplateSyncManager instance;
    private int curResetCount;
    private volatile boolean isInit;
    private boolean isReset;
    private final String KEY_SYNC = "KEY_SYNC";
    private final String KEY_LAYOUT_MAP = "KEY_LAYOUT_MAP";
    private final String KEY_LAYOUTID = SyncConstant.KEY_LAYOUTID;
    private final TemplateSyncable syncable = TemplateSyncable.Companion.getInstance();
    private final ConcurrentHashMap<Integer, String> templateId2DataMap = new ConcurrentHashMap<>(16);
    private final ConcurrentHashMap<Integer, String> templateId2LayoutIdMap = new ConcurrentHashMap<>();
    private final ArrayList<ITemplateSyncService.ISyncListener> syncListenerList = new ArrayList<>();
    private final int maxResetCount = 3;

    static {
        kge.a(600731334);
        kge.a(-1093568241);
        Companion = new Companion(null);
    }

    public static final /* synthetic */ TemplateSyncManager access$getInstance$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateSyncManager) ipChange.ipc$dispatch("434d6298", new Object[0]) : instance;
    }

    public static final /* synthetic */ void access$remoteSingleSyncFunc(TemplateSyncManager templateSyncManager, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eddf82", new Object[]{templateSyncManager, new Integer(i), jSONObject});
        } else {
            templateSyncManager.remoteSingleSyncFunc(i, jSONObject);
        }
    }

    public static final /* synthetic */ void access$remoteSyncSuccessFunc(TemplateSyncManager templateSyncManager, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7f3690", new Object[]{templateSyncManager, jSONObject});
        } else {
            templateSyncManager.remoteSyncSuccessFunc(jSONObject);
        }
    }

    public static final /* synthetic */ void access$reset(TemplateSyncManager templateSyncManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ec0ce5", new Object[]{templateSyncManager});
        } else {
            templateSyncManager.reset();
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(TemplateSyncManager templateSyncManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af8577a", new Object[]{templateSyncManager});
        } else {
            instance = templateSyncManager;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/unit/center/sync/TemplateSyncManager$Companion;", "", "()V", "instance", "Lcom/taobao/unit/center/sync/TemplateSyncManager;", "getInstance", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes9.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(630135438);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final TemplateSyncManager getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplateSyncManager) ipChange.ipc$dispatch("edbe933d", new Object[]{this});
            }
            if (TemplateSyncManager.access$getInstance$cp() == null) {
                synchronized (TemplateSyncManager.class) {
                    if (TemplateSyncManager.access$getInstance$cp() == null) {
                        TemplateSyncManager.access$setInstance$cp(new TemplateSyncManager());
                    }
                    t tVar = t.INSTANCE;
                }
            }
            TemplateSyncManager access$getInstance$cp = TemplateSyncManager.access$getInstance$cp();
            if (access$getInstance$cp == null) {
                q.a();
            }
            return access$getInstance$cp;
        }
    }

    private final void initDegrade() {
        int intValue;
        int intValue2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb956e4d", new Object[]{this});
            return;
        }
        try {
            TLog.loge(SyncConstant.TAG, "initDegrade start : ");
            if (ApplicationUtil.isDebug() && this.isReset) {
                return;
            }
            JSONArray parseArray = JSONArray.parseArray(FileUtil.loadZipFromAsset(ApplicationUtil.getApplication(), "compress/mpm_templateinfo.json.zip"));
            if (parseArray != null) {
                int size = parseArray.size();
                for (int i = 0; i < size; i++) {
                    com.alibaba.fastjson.JSONObject jSONObject = parseArray.getJSONObject(i);
                    if (jSONObject != null && (intValue2 = jSONObject.getIntValue("templateId")) != 0) {
                        com.alibaba.fastjson.JSONObject sharedPreference = getSharedPreference(intValue2);
                        if (intValue2 == 503) {
                            TLog.loge(SyncConstant.TAG, "sp " + sharedPreference);
                            TLog.loge(SyncConstant.TAG, "config " + jSONObject);
                        }
                        if (sharedPreference != null && jSONObject.getLongValue(StWindow.UPDATE_TIME) <= sharedPreference.getLongValue(StWindow.UPDATE_TIME)) {
                            TLog.loge(SyncConstant.TAG, "use degree " + intValue2);
                        } else {
                            Integer valueOf = Integer.valueOf(intValue2);
                            String jSONObject2 = jSONObject.toString();
                            q.a((Object) jSONObject2, "templateData.toString()");
                            this.templateId2DataMap.put(valueOf, jSONObject2);
                            jSONObject.containsKey(this.KEY_LAYOUTID);
                            Integer valueOf2 = Integer.valueOf(intValue2);
                            String string = jSONObject.getString(this.KEY_LAYOUTID);
                            q.a((Object) string, "templateData.getString(KEY_LAYOUTID)");
                            this.templateId2LayoutIdMap.put(valueOf2, string);
                        }
                    }
                }
            } else {
                TLog.loge(SyncConstant.TAG, "templateId2DataMap error   ");
            }
            TLog.loge(SyncConstant.TAG, "templateId2DataMap end : ");
            TLog.loge(SyncConstant.TAG, "templateId2DataMap 503 : " + this.templateId2DataMap.get(503));
            if (!q.a((Object) "1", (Object) ConfigUtil.getValue("mpm_data_switch", "useSpTemplate", "0"))) {
                return;
            }
            String stringSharedPreference = SharedPreferencesUtil.getStringSharedPreference(this.KEY_SYNC);
            TLog.loge(SyncConstant.TAG, "layoutJSON: " + stringSharedPreference);
            if (TextUtils.isEmpty(stringSharedPreference)) {
                return;
            }
            JSONArray jSONArray = com.alibaba.fastjson.JSONObject.parseObject(stringSharedPreference).getJSONArray(this.KEY_LAYOUT_MAP);
            int size2 = jSONArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                com.alibaba.fastjson.JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                if (jSONObject3 != null && (intValue = jSONObject3.getIntValue("templateId")) != 503) {
                    Integer valueOf3 = Integer.valueOf(intValue);
                    String jSONObject4 = jSONObject3.toString();
                    q.a((Object) jSONObject4, "templateData.toString()");
                    this.templateId2DataMap.put(valueOf3, jSONObject4);
                    jSONObject3.containsKey(this.KEY_LAYOUTID);
                    Integer valueOf4 = Integer.valueOf(intValue);
                    String string2 = jSONObject3.getString(this.KEY_LAYOUTID);
                    q.a((Object) string2, "templateData.getString(KEY_LAYOUTID)");
                    this.templateId2LayoutIdMap.put(valueOf4, string2);
                }
            }
        } catch (Exception e) {
            if (ApplicationUtil.isDebug()) {
                throw e;
            }
        }
    }

    public final void intMessageTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54759964", new Object[]{this});
            return;
        }
        LayoutConfig layoutConfig = new LayoutConfig();
        JSONArray parseArray = JSONArray.parseArray(layoutConfig.msgTabTemplateConfig);
        if (parseArray != null) {
            int size = parseArray.size();
            for (int i = 0; i < size; i++) {
                com.alibaba.fastjson.JSONObject jSONObject = parseArray.getJSONObject(i);
                if (jSONObject != null) {
                    Integer valueOf = Integer.valueOf(jSONObject.getIntValue("templateId"));
                    String jSONObject2 = jSONObject.toString();
                    q.a((Object) jSONObject2, "templateData.toString()");
                    this.templateId2DataMap.put(valueOf, jSONObject2);
                }
            }
        }
        LayoutSyncManager companion = LayoutSyncManager.Companion.getInstance();
        String str = layoutConfig.msgTabLayoutConfig;
        q.a((Object) str, "layoutConfig.msgTabLayoutConfig");
        companion.initMessageTab(str);
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.isInit) {
        } else {
            checkSync();
            initDegrade();
            LayoutSyncManager.Companion.getInstance().init();
            notifyChange();
            this.isInit = true;
        }
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public void checkSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc239aca", new Object[]{this});
            return;
        }
        EnvTool.INSTANCE.isSwitchEnv(EnvTool.KEY_LAST_ENV1, new TemplateSyncManager$checkSync$1(this));
        SyncHandler.INSTANCE.doCheckSync(new TemplateRequest(100L, null, 2, null), this.syncable, new TemplateSyncManager$checkSync$2(this));
        TLog.loge(SyncConstant.TAG, "template checkSync end");
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public void reInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b7c70ea", new Object[]{this});
            return;
        }
        this.templateId2DataMap.clear();
        this.templateId2LayoutIdMap.clear();
        this.isInit = false;
        LayoutSyncManager.Companion.getInstance().clearCache();
        init();
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public String getTemplateData(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("378c26fe", new Object[]{this, new Integer(i)});
        }
        String str = this.templateId2DataMap.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        com.alibaba.fastjson.JSONObject sharedPreference = getSharedPreference(i);
        if (sharedPreference != null) {
            return sharedPreference.toJSONString();
        }
        if (i <= 0 || !this.isInit) {
            return "";
        }
        TLog.loge(SyncConstant.TAG, "getTemplateData 需要单个补偿 templateId:" + i);
        checkDoSingleMakeup(i);
        return "";
    }

    private final com.alibaba.fastjson.JSONObject getSharedPreference(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("73e58da6", new Object[]{this, new Integer(i)});
        }
        String data = SharedPreferencesUtil.getStringSharedPreference("templateSyncInfo" + i);
        try {
            if (TextUtils.isEmpty(data) || this.isReset) {
                return null;
            }
            com.alibaba.fastjson.JSONObject parseObject = com.alibaba.fastjson.JSONObject.parseObject(data);
            Integer valueOf = Integer.valueOf(i);
            q.a((Object) data, "data");
            this.templateId2DataMap.put(valueOf, data);
            parseObject.containsKey(this.KEY_LAYOUTID);
            Integer valueOf2 = Integer.valueOf(i);
            String string = parseObject.getString(this.KEY_LAYOUTID);
            q.a((Object) string, "templateData.getString(KEY_LAYOUTID)");
            this.templateId2LayoutIdMap.put(valueOf2, string);
            return parseObject;
        } catch (Exception e) {
            TLog.logw(e.getMessage(), new String[0]);
            return null;
        }
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public String getLayoutId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("676cf1df", new Object[]{this, new Integer(i)}) : this.templateId2LayoutIdMap.get(Integer.valueOf(i));
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public void checkDoSingleMakeup(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("449b8318", new Object[]{this, new Integer(i)});
            return;
        }
        TLog.loge(SyncConstant.TAG, "checkDoSingleMakeup called " + i);
        Coordinator.doBackGroundTask(new BaseRunnable() { // from class: com.taobao.unit.center.sync.TemplateSyncManager$checkDoSingleMakeup$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.kit.threadpool.BaseRunnable
            public void execute() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e48bb97c", new Object[]{this});
                    return;
                }
                SyncHandler syncHandler = SyncHandler.INSTANCE;
                TemplateRequest templateRequest = new TemplateRequest(100L, Integer.valueOf(i));
                TemplateSyncManager templateSyncManager = TemplateSyncManager.this;
                syncHandler.doRemoteSyncSingle(templateRequest, TemplateSyncManager.$ipChange, new TemplateSyncManager$checkDoSingleMakeup$1$execute$1(TemplateSyncManager.this));
            }
        });
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public String getLayoutStyle(String layout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77f51d9e", new Object[]{this, layout});
        }
        q.c(layout, "layout");
        return TemplatePacker.INSTANCE.getLayoutStyle(layout);
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public void addSyncListener(ITemplateSyncService.ISyncListener listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee39983", new Object[]{this, listener});
            return;
        }
        q.c(listener, "listener");
        synchronized (this.syncListenerList) {
            this.syncListenerList.add(listener);
        }
    }

    @Override // com.taobao.unit.center.templatesync.ITemplateSyncService
    public void removeSyncListener(ITemplateSyncService.ISyncListener listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0cbc866", new Object[]{this, listener});
            return;
        }
        q.c(listener, "listener");
        synchronized (this.syncListenerList) {
            this.syncListenerList.remove(listener);
        }
    }

    private final void remoteSingleSyncFunc(int i, JSONObject jSONObject) {
        JSONObject optJSONObject;
        com.alibaba.fastjson.JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af448bef", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        TLog.loge(SyncConstant.TAG, "templateSingleSync remoteSingleSyncSuccessFunc " + i);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("model");
        JSONObject jSONObject2 = null;
        org.json.JSONArray optJSONArray = optJSONObject2 != null ? optJSONObject2.optJSONArray("templateInfos") : null;
        if (optJSONArray != null && optJSONArray.length() > 0) {
            com.alibaba.fastjson.JSONObject parseObject2 = com.alibaba.fastjson.JSONObject.parseObject(optJSONArray.getString(0));
            TLog.loge(SyncConstant.TAG, "templateSingleSync templateData is " + parseObject2);
            HashMap hashMap = new HashMap();
            int intValue = parseObject2.getIntValue("templateId");
            String string = parseObject2.getString(this.KEY_LAYOUTID);
            if ("1".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "need_check_template_cache_update_time", "0"))) {
                Long updateTime = parseObject2.getLong(StWindow.UPDATE_TIME);
                String str = this.templateId2DataMap.get(Integer.valueOf(intValue));
                if (str != null && (parseObject = com.alibaba.fastjson.JSONObject.parseObject(str)) != null) {
                    long longValue = parseObject.getLongValue(StWindow.UPDATE_TIME);
                    q.a((Object) updateTime, "updateTime");
                    if (longValue > updateTime.longValue()) {
                        TLog.loge(SyncConstant.TAG, " remoteSingleSyncFunc cacheUpdateTime > updateTime " + longValue + " | " + updateTime + ' ');
                        return;
                    }
                }
            }
            Integer valueOf = Integer.valueOf(intValue);
            String jSONObject3 = parseObject2.toString();
            q.a((Object) jSONObject3, "templateData.toString()");
            hashMap.put(valueOf, jSONObject3);
            synchronized (this.templateId2DataMap) {
                this.templateId2DataMap.putAll(hashMap);
                t tVar = t.INSTANCE;
            }
            SharedPreferencesUtil.addStringSharedPreference("templateSyncInfo" + intValue, (String) hashMap.get(Integer.valueOf(intValue)));
            if (string != null) {
                this.templateId2LayoutIdMap.put(Integer.valueOf(intValue), string);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("model");
            if (optJSONObject3 != null && (optJSONObject = optJSONObject3.optJSONObject("layoutIdMapLayoutInfos")) != null) {
                jSONObject2 = optJSONObject.optJSONObject(string);
            }
            if (jSONObject2 != null) {
                try {
                    UnitCenterLayoutInfoModel unitCenterLayoutInfoModel = (UnitCenterLayoutInfoModel) com.alibaba.fastjson.JSONObject.parseObject(jSONObject2.toString(), UnitCenterLayoutInfoModel.class);
                    LayoutSyncManager.Companion.getInstance().setUnitCenterLayoutInfoModel(unitCenterLayoutInfoModel);
                    TLog.loge(SyncConstant.TAG, "layoutInfo已补偿" + unitCenterLayoutInfoModel);
                } catch (Throwable th) {
                    TLog.loge(SyncConstant.TAG, "templateSingleSync parse layoutModel error :" + Log.getStackTraceString(th));
                }
            }
            notifyChange();
            return;
        }
        this.templateId2DataMap.put(Integer.valueOf(i), "");
    }

    private final void notifyChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779aec60", new Object[]{this});
            return;
        }
        synchronized (this.syncListenerList) {
            for (ITemplateSyncService.ISyncListener iSyncListener : this.syncListenerList) {
                TLog.loge(SyncConstant.TAG, " syncLisenter onSync:" + iSyncListener);
                iSyncListener.onSync();
            }
            t tVar = t.INSTANCE;
        }
    }

    private final void remoteSyncSuccessFunc(JSONObject jSONObject) {
        boolean z;
        com.alibaba.fastjson.JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e2f47b1", new Object[]{this, jSONObject});
            return;
        }
        TLog.loge(SyncConstant.TAG, "templateSync remoteSyncSuccessFunc");
        JSONObject optJSONObject = jSONObject.optJSONObject("model");
        if (optJSONObject == null) {
            return;
        }
        boolean optBoolean = optJSONObject.optBoolean("next");
        long optLong = optJSONObject.optLong("timestamp");
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("templates");
        if (optJSONArray != null) {
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            z = false;
            for (int i = 0; i < length; i++) {
                com.alibaba.fastjson.JSONObject parseObject2 = com.alibaba.fastjson.JSONObject.parseObject(optJSONArray.optString(i));
                if (parseObject2 == null) {
                    TLog.loge(BaseRunnable.TAG, "layout is empty");
                    z = true;
                } else {
                    int intValue = parseObject2.getIntValue("templateId");
                    Object obj = parseObject2.get(StWindow.UPDATE_TIME);
                    int intValue2 = obj instanceof Integer ? ((Number) obj).intValue() : 0;
                    String str = this.templateId2DataMap.get(Integer.valueOf(intValue));
                    if (str != null && (parseObject = com.alibaba.fastjson.JSONObject.parseObject(str)) != null) {
                        long longValue = parseObject.getLongValue(StWindow.UPDATE_TIME);
                        if (longValue > intValue2) {
                            TLog.loge(SyncConstant.TAG, " remoteSyncSuccessFunc cacheUpdateTime > updateTime " + longValue + " | " + intValue2 + ' ');
                        }
                    }
                    Integer valueOf = Integer.valueOf(intValue);
                    String jSONObject2 = parseObject2.toString();
                    q.a((Object) jSONObject2, "templateData.toString()");
                    hashMap.put(valueOf, jSONObject2);
                    SharedPreferencesUtil.addStringSharedPreference("templateSyncInfo" + intValue, (String) hashMap.get(Integer.valueOf(intValue)));
                    parseObject2.containsKey(this.KEY_LAYOUTID);
                    Integer valueOf2 = Integer.valueOf(intValue);
                    String string = parseObject2.getString(this.KEY_LAYOUTID);
                    q.a((Object) string, "templateData.getString(KEY_LAYOUTID)");
                    this.templateId2LayoutIdMap.put(valueOf2, string);
                }
            }
            synchronized (this.templateId2DataMap) {
                this.templateId2DataMap.putAll(hashMap);
                t tVar = t.INSTANCE;
            }
        } else {
            z = false;
        }
        this.syncable.updateLocalIncTimeStamp(optLong);
        if (z) {
            TLog.loge(SyncConstant.TAG, "reset for exception");
            reset();
        } else {
            notifyChange();
        }
        this.syncable.isSyncing().set(false);
        if (!z && optBoolean) {
            ISyncable.DefaultImpls.doRemoteSync$default(this.syncable, new TemplateRequest(100L, null, 2, null), new TemplateSyncManager$remoteSyncSuccessFunc$4(this), null, 4, null);
        } else {
            TLog.loge(SyncConstant.TAG, "记录init时间");
        }
    }

    private final void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.curResetCount++;
        if (this.curResetCount > this.maxResetCount) {
            return;
        }
        this.isReset = true;
        Iterator<Map.Entry<Integer, String>> it = this.templateId2DataMap.entrySet().iterator();
        while (it.hasNext()) {
            SharedPreferencesUtil.addStringSharedPreference("templateSyncInfo" + it.next().getKey().intValue(), "");
        }
        this.syncable.updateLocalIncTimeStamp(0L);
    }
}
