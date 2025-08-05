package com.taobao.unit.center.sync;

import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.message.kit.util.FileUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel;
import com.taobao.unit.center.mtop.UnitCenterLayoutSyncModel;
import com.taobao.unit.center.sync.constant.SyncConstant;
import com.taobao.unit.center.sync.model.LayoutRequest;
import com.taobao.unit.center.sync.model.LayoutResponse;
import com.taobao.unit.center.sync.syncable.ISyncable;
import com.taobao.unit.center.sync.syncable.LayoutSyncable;
import com.taobao.unit.center.sync.syncable.SyncHandler;
import com.taobao.unit.center.sync.tool.EnvTool;
import com.taobao.unit.center.templatesync.ILayoutSyncService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0017J\u0006\u0010\u0010\u001a\u00020\u000fJ\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016J\u0006\u0010\u0014\u001a\u00020\u000fJ\b\u0010\u0015\u001a\u00020\u000fH\u0002J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0005J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0016R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/taobao/unit/center/sync/LayoutSyncManager;", "Lcom/taobao/unit/center/templatesync/ILayoutSyncService;", "()V", "degradeModelCache", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "isInit", "", "modelCache", "Landroid/util/LruCache;", "Lcom/taobao/unit/center/mtop/UnitCenterLayoutInfoModel;", "syncable", "Lcom/taobao/unit/center/sync/syncable/LayoutSyncable;", "checkSync", "", "clearCache", "getLayoutInfoModel", DxContainerActivity.PARAMS_NAMESPACE, SyncConstant.KEY_LAYOUTID, "init", "initDegrade", "initMessageTab", "config", "remoteSyncSuccessFunc", InputFrame3.TYPE_RESPONSE, "Lcom/taobao/unit/center/sync/model/LayoutResponse;", "setUnitCenterLayoutInfoModel", "model", "Companion", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class LayoutSyncManager implements ILayoutSyncService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion;
    private static final String KEY_LAYOUTJSON;
    private static final String KEY_NAME;
    private static final String KEY_URL;
    private static final String KEY_VERSION;
    private static final String KEY_WEEX_URL;
    private static final String ORANGE_NAME_ENABLE_DINAMICX;
    private static LayoutSyncManager instance;
    private boolean isInit;
    private final LruCache<String, UnitCenterLayoutInfoModel> modelCache = new LruCache<>(50);
    private final HashMap<String, String> degradeModelCache = new HashMap<>(16);
    private final LayoutSyncable syncable = LayoutSyncable.Companion.getInstance();

    @JvmStatic
    public static final void checkDownloadDinamicXTemplates(List<? extends UnitCenterLayoutInfoModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eaf4f8", new Object[]{list});
        } else {
            Companion.checkDownloadDinamicXTemplates(list);
        }
    }

    public static final /* synthetic */ LayoutSyncManager access$getInstance$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutSyncManager) ipChange.ipc$dispatch("4affca88", new Object[0]) : instance;
    }

    public static final /* synthetic */ String access$getKEY_NAME$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("808c0fa9", new Object[0]) : KEY_NAME;
    }

    public static final /* synthetic */ String access$getKEY_URL$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2b698381", new Object[0]) : KEY_URL;
    }

    public static final /* synthetic */ String access$getKEY_VERSION$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15fd2ea", new Object[0]) : KEY_VERSION;
    }

    public static final /* synthetic */ String access$getORANGE_NAME_ENABLE_DINAMICX$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c127d934", new Object[0]) : ORANGE_NAME_ENABLE_DINAMICX;
    }

    public static final /* synthetic */ void access$remoteSyncSuccessFunc(LayoutSyncManager layoutSyncManager, LayoutResponse layoutResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af06baca", new Object[]{layoutSyncManager, layoutResponse});
        } else {
            layoutSyncManager.remoteSyncSuccessFunc(layoutResponse);
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(LayoutSyncManager layoutSyncManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323ae4aa", new Object[]{layoutSyncManager});
        } else {
            instance = layoutSyncManager;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0007J\u0006\u0010\u0013\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/taobao/unit/center/sync/LayoutSyncManager$Companion;", "", "()V", "KEY_LAYOUTJSON", "", "KEY_NAME", "KEY_URL", "KEY_VERSION", "KEY_WEEX_URL", "ORANGE_NAME_ENABLE_DINAMICX", "getORANGE_NAME_ENABLE_DINAMICX", "()Ljava/lang/String;", "instance", "Lcom/taobao/unit/center/sync/LayoutSyncManager;", "checkDownloadDinamicXTemplates", "", "layoutList", "", "Lcom/taobao/unit/center/mtop/UnitCenterLayoutInfoModel;", "getInstance", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes9.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1294665054);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final String getORANGE_NAME_ENABLE_DINAMICX() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c14b48d", new Object[]{this}) : LayoutSyncManager.access$getORANGE_NAME_ENABLE_DINAMICX$cp();
        }

        public final LayoutSyncManager getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LayoutSyncManager) ipChange.ipc$dispatch("f0dee06d", new Object[]{this});
            }
            if (LayoutSyncManager.access$getInstance$cp() == null) {
                synchronized (LayoutSyncManager.class) {
                    if (LayoutSyncManager.access$getInstance$cp() == null) {
                        LayoutSyncManager.access$setInstance$cp(new LayoutSyncManager());
                    }
                    t tVar = t.INSTANCE;
                }
            }
            LayoutSyncManager access$getInstance$cp = LayoutSyncManager.access$getInstance$cp();
            if (access$getInstance$cp == null) {
                q.a();
            }
            return access$getInstance$cp;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00a4 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0046 A[SYNTHETIC] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void checkDownloadDinamicXTemplates(java.util.List<? extends com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel> r8) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.unit.center.sync.LayoutSyncManager.Companion.checkDownloadDinamicXTemplates(java.util.List):void");
        }
    }

    static {
        kge.a(544906646);
        kge.a(944473119);
        Companion = new Companion(null);
        KEY_LAYOUTJSON = KEY_LAYOUTJSON;
        KEY_NAME = "name";
        KEY_VERSION = "version";
        KEY_URL = "url";
        KEY_WEEX_URL = KEY_WEEX_URL;
        ORANGE_NAME_ENABLE_DINAMICX = ORANGE_NAME_ENABLE_DINAMICX;
    }

    @Override // com.taobao.unit.center.templatesync.ILayoutSyncService
    public void setUnitCenterLayoutInfoModel(UnitCenterLayoutInfoModel unitCenterLayoutInfoModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48fb11", new Object[]{this, unitCenterLayoutInfoModel});
        } else if (unitCenterLayoutInfoModel == null) {
        } else {
            String str = unitCenterLayoutInfoModel.nameSpace + "_" + unitCenterLayoutInfoModel.layoutId;
            this.modelCache.put(str, unitCenterLayoutInfoModel);
            SharedPreferencesUtil.addStringSharedPreference(str, JSONObject.toJSONString(unitCenterLayoutInfoModel));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
        if (r9.updateTime <= r1.updateTime) goto L19;
     */
    @Override // com.taobao.unit.center.templatesync.ILayoutSyncService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel getLayoutInfoModel(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.unit.center.sync.LayoutSyncManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r7
            r2 = 1
            r1[r2] = r8
            r8 = 2
            r1[r8] = r9
            java.lang.String r8 = "d0b82934"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel r8 = (com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel) r8
            return r8
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "_"
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            android.util.LruCache<java.lang.String, com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel> r9 = r7.modelCache
            java.lang.Object r9 = r9.get(r8)
            com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel r9 = (com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel) r9
            if (r9 == 0) goto L3a
            return r9
        L3a:
            java.lang.String r0 = com.taobao.message.kit.util.SharedPreferencesUtil.getStringSharedPreference(r8)
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "cbq@sync"
            if (r1 != 0) goto L70
            java.lang.Class<com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel> r1 = com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel.class
            java.lang.Object r1 = com.alibaba.fastjson.JSONObject.parseObject(r0, r1)     // Catch: java.lang.Throwable -> L53
            com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel r1 = (com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel) r1     // Catch: java.lang.Throwable -> L53
            r9 = r1
            goto L70
        L53:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "parseModel fail, data is "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.taobao.tao.log.TLog.loge(r2, r0)
            java.lang.String r0 = android.util.Log.getStackTraceString(r1)
            com.taobao.tao.log.TLog.loge(r2, r0)
        L70:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r7.degradeModelCache
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lae
            java.lang.Class<com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel> r1 = com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel.class
            java.lang.Object r1 = com.alibaba.fastjson.JSONObject.parseObject(r0, r1)     // Catch: java.lang.Throwable -> L91
            com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel r1 = (com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel) r1     // Catch: java.lang.Throwable -> L91
            if (r9 != 0) goto L86
        L84:
            r9 = r1
            goto Lae
        L86:
            if (r1 == 0) goto Lae
            long r3 = r9.updateTime     // Catch: java.lang.Throwable -> L91
            long r5 = r1.updateTime     // Catch: java.lang.Throwable -> L91
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lae
            goto L84
        L91:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "parseModel fail, degrade is "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.taobao.tao.log.TLog.loge(r2, r0)
            java.lang.String r0 = android.util.Log.getStackTraceString(r1)
            com.taobao.tao.log.TLog.loge(r2, r0)
        Lae:
            if (r9 == 0) goto Lb5
            android.util.LruCache<java.lang.String, com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel> r0 = r7.modelCache
            r0.put(r8, r9)
        Lb5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.unit.center.sync.LayoutSyncManager.getLayoutInfoModel(java.lang.String, java.lang.String):com.taobao.unit.center.mtop.UnitCenterLayoutInfoModel");
    }

    private final void initDegrade() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb956e4d", new Object[]{this});
            return;
        }
        String loadZipFromAsset = FileUtil.loadZipFromAsset(ApplicationUtil.getApplication(), "compress/mpm_layoutinfo.json.zip");
        if (TextUtils.isEmpty(loadZipFromAsset)) {
            return;
        }
        JSONArray jsonArray = JSONArray.parseArray(loadZipFromAsset);
        q.a((Object) jsonArray, "jsonArray");
        Iterator<Object> it = jsonArray.iterator();
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i < 0) {
                p.b();
            }
            JSONObject jSONObject = jsonArray.getJSONObject(i);
            HashMap<String, String> hashMap = this.degradeModelCache;
            hashMap.put("tbmessage_" + jSONObject.getString(SyncConstant.KEY_LAYOUTID), jSONObject.toJSONString());
            i = i2;
        }
    }

    public final void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.isInit) {
        } else {
            checkSync();
            initDegrade();
            this.isInit = true;
        }
    }

    public final void initMessageTab(String config) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7fbb4f", new Object[]{this, config});
            return;
        }
        q.c(config, "config");
        JSONArray jsonArray = JSONArray.parseArray(config);
        q.a((Object) jsonArray, "jsonArray");
        Iterator<Object> it = jsonArray.iterator();
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i < 0) {
                p.b();
            }
            JSONObject jSONObject = jsonArray.getJSONObject(i);
            HashMap<String, String> hashMap = this.degradeModelCache;
            hashMap.put("tbmessage_" + jSONObject.getString(SyncConstant.KEY_LAYOUTID), jSONObject.toJSONString());
            i = i2;
        }
    }

    @Override // com.taobao.unit.center.templatesync.ILayoutSyncService
    public void checkSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc239aca", new Object[]{this});
            return;
        }
        TLog.loge(SyncConstant.TAG, "layout checkSync start ");
        EnvTool.INSTANCE.isSwitchEnv(EnvTool.KEY_LAST_ENV2, new LayoutSyncManager$checkSync$1(this));
        SyncHandler.INSTANCE.doCheckSync(new LayoutRequest(null, null, 3, null), this.syncable, new LayoutSyncManager$checkSync$2(this));
    }

    public final void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            return;
        }
        this.modelCache.evictAll();
        this.degradeModelCache.clear();
        this.isInit = false;
    }

    private final void remoteSyncSuccessFunc(LayoutResponse layoutResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6023b19", new Object[]{this, layoutResponse});
            return;
        }
        TLog.loge(SyncConstant.TAG, "layoutSync remoteSyncSuccessFunc");
        HashMap<String, Long> groups = layoutResponse.getGroups();
        if (groups == null) {
            q.a();
        }
        UnitCenterLayoutSyncModel model = layoutResponse.getModel();
        if (model == null) {
            q.a();
        }
        if (model.layouts == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (UnitCenterLayoutSyncModel.Layout layout : model.layouts) {
            Long l = 0L;
            if (groups.containsKey(layout.group)) {
                l = groups.get(layout.group);
            }
            long j = layout.timestamp;
            if (l == null) {
                q.a();
            }
            if (j > l.longValue()) {
                String str = layout.group;
                q.a((Object) str, "layout.group");
                groups.put(str, Long.valueOf(layout.timestamp));
            }
            if (layout.layoutList != null) {
                for (UnitCenterLayoutInfoModel unitCenterLayoutInfoModel : layout.layoutList) {
                    setUnitCenterLayoutInfoModel(unitCenterLayoutInfoModel);
                }
                Companion companion = Companion;
                List<UnitCenterLayoutInfoModel> list = layout.layoutList;
                q.a((Object) list, "layout.layoutList");
                companion.checkDownloadDinamicXTemplates(list);
            }
            if (layout.next) {
                String str2 = layout.group;
                q.a((Object) str2, "layout.group");
                hashMap.put(str2, groups.get(layout.group));
            }
        }
        this.syncable.isSyncing().set(false);
        if (hashMap.size() > 0) {
            this.syncable.updateTimeStamp(groups);
            ISyncable.DefaultImpls.doRemoteSync$default(this.syncable, new LayoutRequest(hashMap, null, 2, null), new LayoutSyncManager$remoteSyncSuccessFunc$1(this), null, 4, null);
            return;
        }
        for (String item : groups.keySet()) {
            q.a((Object) item, "item");
            groups.put(item, Long.valueOf(this.syncable.getRemoteIncTimeStamp()));
        }
        this.syncable.updateTimeStamp(groups);
        TLog.loge(SyncConstant.TAG, "layout sync, no more groups");
    }
}
