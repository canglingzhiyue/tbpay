package com.taobao.message.lab.comfrm.inner2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.artry.dycontainer.BaseWVApiPlugin;
import com.taobao.message.kit.cache.KVDataStorage;
import com.taobao.message.kit.util.ApplicationBuildInfo;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.Observer;
import com.taobao.message.lab.comfrm.util.TimeBuffer;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.util.MessageNavProcessorV2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ept;
import tb.kge;

/* loaded from: classes7.dex */
public class Snapshot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Snapshot";
    private final String mBizConfigCode;
    private KVDataStorage mDataStorage;
    private ISnapshotCustom mSnapshotCustom;
    private volatile SnapshotData mSnapshotData;
    private boolean tabImageOpt = ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "msgTabImageOpt");
    private boolean tabHeadOpt = ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "msgTabHeadPreRenderOpt");
    private TimeBuffer<SnapshotInput> mBuffer = new TimeBuffer<>(true, 5000, new TimeBuffer.LastItemMergeFunction(), new Observer<List<SnapshotInput>>() { // from class: com.taobao.message.lab.comfrm.inner2.Snapshot.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.message.lab.comfrm.util.Observer
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            }
        }

        @Override // com.taobao.message.lab.comfrm.util.Observer
        public void onError(String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b263e360", new Object[]{this, str, str2, obj});
            }
        }

        @Override // com.taobao.message.lab.comfrm.util.Observer
        public void onData(final List<SnapshotInput> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62cedf21", new Object[]{this, list});
            } else if (list.isEmpty()) {
            } else {
                Schedules.lowBackground(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.Snapshot.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        List list2 = list;
                        Snapshot.this.saveSnapshotImpl((SnapshotInput) list2.get(list2.size() - 1));
                    }
                });
            }
        }
    });

    /* loaded from: classes7.dex */
    public static class SnapshotData {
        public String appVersion;
        public Map<String, Object> preBindData;
        public String version;
        public ViewObject viewObject;

        static {
            kge.a(733249741);
        }
    }

    /* loaded from: classes7.dex */
    public static class SnapshotInput {
        public SharedState state;
        public String version;
        public ViewObject viewObject;

        static {
            kge.a(1260907271);
        }
    }

    static {
        kge.a(-561432283);
    }

    public static /* synthetic */ void access$000(Snapshot snapshot, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127dbbba", new Object[]{snapshot, viewObject});
        } else {
            snapshot.processViewObject(viewObject);
        }
    }

    public static /* synthetic */ SnapshotData access$102(Snapshot snapshot, SnapshotData snapshotData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SnapshotData) ipChange.ipc$dispatch("d004d5d4", new Object[]{snapshot, snapshotData});
        }
        snapshot.mSnapshotData = snapshotData;
        return snapshotData;
    }

    public Snapshot(String str) {
        this.mBizConfigCode = str;
    }

    public void initSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa5797b", new Object[]{this});
            return;
        }
        this.mDataStorage = new KVDataStorage(ApplicationUtil.getApplication().getFilesDir().getAbsolutePath() + File.separator + "message" + File.separator + this.mBizConfigCode + ".cache");
        this.mDataStorage.addInitListener(new KVDataStorage.InitListener() { // from class: com.taobao.message.lab.comfrm.inner2.Snapshot.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
            /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v5 */
            @Override // com.taobao.message.kit.cache.KVDataStorage.InitListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void init(java.util.Map<java.lang.String, java.lang.String> r6) {
                /*
                    r5 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.message.lab.comfrm.inner2.Snapshot.AnonymousClass2.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 1
                    if (r1 == 0) goto L15
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r3 = 0
                    r1[r3] = r5
                    r1[r2] = r6
                    java.lang.String r6 = "f1cfb90e"
                    r0.ipc$dispatch(r6, r1)
                    return
                L15:
                    java.lang.String r0 = "snapshot"
                    java.lang.Object r6 = r6.get(r0)
                    java.lang.String r6 = (java.lang.String) r6
                    boolean r0 = android.text.TextUtils.isEmpty(r6)
                    if (r0 != 0) goto L7c
                    r0 = 0
                    com.alibaba.fastjson.JSONObject r6 = com.alibaba.fastjson.JSONObject.parseObject(r6)     // Catch: java.lang.Exception -> L5b
                    java.lang.String r1 = "viewObject"
                    java.lang.Class<com.taobao.message.lab.comfrm.core.ViewObject> r3 = com.taobao.message.lab.comfrm.core.ViewObject.class
                    java.lang.Object r1 = r6.getObject(r1, r3)     // Catch: java.lang.Exception -> L5b
                    com.taobao.message.lab.comfrm.core.ViewObject r1 = (com.taobao.message.lab.comfrm.core.ViewObject) r1     // Catch: java.lang.Exception -> L5b
                    r1.isSnapshot = r2     // Catch: java.lang.Exception -> L58
                    com.taobao.message.lab.comfrm.inner2.Snapshot r2 = com.taobao.message.lab.comfrm.inner2.Snapshot.this     // Catch: java.lang.Exception -> L58
                    com.taobao.message.lab.comfrm.inner2.Snapshot.access$000(r2, r1)     // Catch: java.lang.Exception -> L58
                    java.lang.String r2 = "bindData"
                    java.lang.Class<java.util.Map> r3 = java.util.Map.class
                    java.lang.Object r2 = r6.getObject(r2, r3)     // Catch: java.lang.Exception -> L58
                    java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L58
                    java.lang.String r3 = "version"
                    java.lang.String r3 = r6.getString(r3)     // Catch: java.lang.Exception -> L55
                    java.lang.String r4 = "appVersion"
                    java.lang.String r0 = r6.getString(r4)     // Catch: java.lang.Exception -> L53
                    goto L68
                L53:
                    r6 = move-exception
                    goto L5f
                L55:
                    r6 = move-exception
                    r3 = r0
                    goto L5f
                L58:
                    r6 = move-exception
                    r2 = r0
                    goto L5e
                L5b:
                    r6 = move-exception
                    r1 = r0
                    r2 = r1
                L5e:
                    r3 = r2
                L5f:
                    java.lang.String r6 = r6.toString()
                    java.lang.String r4 = "Container"
                    com.taobao.message.lab.comfrm.util.Logger.e(r4, r6)
                L68:
                    if (r1 == 0) goto L7c
                    com.taobao.message.lab.comfrm.inner2.Snapshot$SnapshotData r6 = new com.taobao.message.lab.comfrm.inner2.Snapshot$SnapshotData
                    r6.<init>()
                    r6.viewObject = r1
                    r6.preBindData = r2
                    r6.version = r3
                    r6.appVersion = r0
                    com.taobao.message.lab.comfrm.inner2.Snapshot r0 = com.taobao.message.lab.comfrm.inner2.Snapshot.this
                    com.taobao.message.lab.comfrm.inner2.Snapshot.access$102(r0, r6)
                L7c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.inner2.Snapshot.AnonymousClass2.init(java.util.Map):void");
            }
        });
        this.mDataStorage.init();
    }

    public void saveSnapshot(String str, ViewObject viewObject, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e459abf1", new Object[]{this, str, viewObject, sharedState});
            return;
        }
        SnapshotInput snapshotInput = new SnapshotInput();
        snapshotInput.state = sharedState;
        snapshotInput.viewObject = viewObject;
        snapshotInput.version = str;
        this.mBuffer.produce(snapshotInput);
    }

    public void saveSnapshotToDiskForce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2355179", new Object[]{this});
        } else {
            this.mBuffer.checkForce();
        }
    }

    public void saveSnapshotImpl(SnapshotInput snapshotInput) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e402d4b2", new Object[]{this, snapshotInput});
            return;
        }
        Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1012).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, this.mBizConfigCode).build());
        ViewObject viewObject = snapshotInput.viewObject;
        ISnapshotCustom iSnapshotCustom = this.mSnapshotCustom;
        if (iSnapshotCustom != null) {
            viewObject = iSnapshotCustom.snapshot(viewObject);
        }
        if (!viewObject.isSnapshot) {
            ViewObject viewObject2 = new ViewObject(viewObject);
            viewObject2.isSnapshot = true;
            viewObject2.isStateLoadSourceReady = viewObject.isStateLoadSourceReady;
            viewObject2.sharedState = viewObject.sharedState;
            viewObject2.diff = viewObject.diff;
            viewObject = viewObject2;
        }
        HashMap hashMap = new HashMap();
        buildEventBindCache(viewObject, snapshotInput.state, hashMap);
        SnapshotData snapshotData = new SnapshotData();
        snapshotData.viewObject = viewObject;
        snapshotData.preBindData = hashMap;
        snapshotData.version = snapshotInput.version;
        snapshotData.appVersion = ApplicationBuildInfo.getAppVersionName();
        this.mSnapshotData = snapshotData;
        this.mDataStorage.tryWaitInit(1000L);
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put("viewObject", (Object) viewObject);
        jSONObject.put(ept.SUB_BIND_VIEW, (Object) hashMap);
        jSONObject.put("version", (Object) snapshotInput.version);
        jSONObject.put("appVersion", (Object) snapshotData.appVersion);
        this.mDataStorage.put("snapshot", jSONObject);
        saveHeadData(viewObject);
        saveHeadUrl(viewObject);
        saveContentUrl(viewObject);
        Logger.e("Container", "snapshot save");
    }

    private void saveHeadData(ViewObject viewObject) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244d0db1", new Object[]{this, viewObject});
            return;
        }
        if (viewObject != null && this.tabHeadOpt) {
            try {
                Logger.e(TAG, " saveHeadData");
                JSONObject jSONObject2 = (JSONObject) ((ViewObject) ((List) ((ViewObject) ((ViewObject) viewObject.children.get("content")).children.get("header")).children.get(Constants.Slot.DEF_SLOT)).get(0)).data;
                if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("operationArea")) == null) {
                    return;
                }
                SharedPreferencesUtil.addStringSharedPreference("msgTabHeadOperationArea", jSONObject.toJSONString());
            } catch (Throwable unused) {
            }
        }
    }

    private void saveHeadUrl(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91568ae6", new Object[]{this, viewObject});
            return;
        }
        if (viewObject != null && this.tabImageOpt) {
            try {
                Logger.e(TAG, " saveHeadUrl");
                JSONObject jSONObject = (JSONObject) ((ViewObject) ((List) ((ViewObject) ((ViewObject) viewObject.children.get("content")).children.get("header")).children.get(Constants.Slot.DEF_SLOT)).get(0)).data;
                if (jSONObject == null) {
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("operationArea");
                if (jSONObject2 != null) {
                    SharedPreferencesUtil.addStringSharedPreference("msgTabHeadOperationArea", jSONObject2.toJSONString());
                }
                JSONArray jSONArray = ((JSONObject) ((JSONObject) jSONObject2.getJSONArray("subContainerList").get(0)).getJSONArray(BaseWVApiPlugin.RESOURCE_LIST_KEY).get(0)).getJSONObject("resData").getJSONArray("list");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string = jSONObject3.getString("defaultExtendDescPic");
                    String string2 = jSONObject3.getString("shortIcon");
                    arrayList.add(string);
                    arrayList.add(string2);
                }
                if (arrayList.size() <= 0) {
                    return;
                }
                String jSONString = JSON.toJSONString(arrayList);
                SharedPreferencesUtil.addStringSharedPreference("msgTabHeadUrl", jSONString);
                Logger.e(TAG, "saveHeadUrl " + jSONString);
            } catch (Throwable unused) {
            }
        }
    }

    private void saveContentUrl(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa211ce5", new Object[]{this, viewObject});
            return;
        }
        if (viewObject != null && this.tabImageOpt) {
            try {
                Logger.e(TAG, " saveContentUrl");
                List list = (List) ((ViewObject) ((List) ((ViewObject) viewObject.children.get("content")).children.get(AbsListWidgetInstance.SLOT_SECTION)).get(0)).children.get("content");
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (int i2 = 0; i2 < list.size() && i <= 7; i2++) {
                    i++;
                    arrayList.add(((JSONObject) ((ViewObject) ((ViewObject) list.get(i2)).children.get("content")).data).getString("headIcon"));
                }
                if (arrayList.size() <= 0) {
                    return;
                }
                String jSONString = JSON.toJSONString(arrayList);
                Logger.e(TAG, "saveContentUrl " + jSONString);
                SharedPreferencesUtil.addStringSharedPreference("msgTabContentUrl", jSONString);
            } catch (Throwable unused) {
            }
        }
    }

    private void buildEventBindCache(ViewObject viewObject, Object obj, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf1ab2a", new Object[]{this, viewObject, obj, map});
            return;
        }
        map.putAll(LayoutProtocol.buildWithExpressionMap(viewObject, obj));
        if (viewObject.children == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : viewObject.children.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof List) {
                for (Object obj2 : (List) value) {
                    if (obj2 instanceof ViewObject) {
                        buildEventBindCache((ViewObject) obj2, obj, map);
                    }
                }
            } else if (value instanceof ViewObject) {
                buildEventBindCache((ViewObject) value, obj, map);
            }
        }
    }

    public SnapshotData getSnapshotData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SnapshotData) ipChange.ipc$dispatch("20fb67ed", new Object[]{this});
        }
        TraceUtil.beginSection("getSnapshotData");
        int i = 1000;
        try {
            i = Integer.parseInt(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "waitSnapshotTime", "1000"));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.mDataStorage.tryWaitInit(i);
        TraceUtil.endTrace();
        if (ApplicationUtil.isDebug() && this.mSnapshotData != null && this.mSnapshotData.viewObject != null && !this.mSnapshotData.viewObject.isSnapshot) {
            throw new IllegalStateException("获取的快照数据不应该没有快照标记");
        }
        return this.mSnapshotData;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mSnapshotData = null;
        }
    }

    private void processViewObject(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d05665", new Object[]{this, viewObject});
        } else if (viewObject.children != null) {
            for (Map.Entry<String, Object> entry : viewObject.children.entrySet()) {
                if (entry.getValue() instanceof JSONObject) {
                    ViewObject viewObject2 = (ViewObject) ((JSONObject) entry.getValue()).toJavaObject(ViewObject.class);
                    processViewObject(viewObject2);
                    viewObject.children.put(entry.getKey(), viewObject2);
                } else if (entry.getValue() instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.size(); i++) {
                        ViewObject viewObject3 = (ViewObject) jSONArray.getObject(i, ViewObject.class);
                        processViewObject(viewObject3);
                        arrayList.add(viewObject3);
                    }
                    viewObject.children.put(entry.getKey(), arrayList);
                }
            }
        }
    }

    public void setSnapshotCustom(ISnapshotCustom iSnapshotCustom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e215d790", new Object[]{this, iSnapshotCustom});
        } else {
            this.mSnapshotCustom = iSnapshotCustom;
        }
    }
}
