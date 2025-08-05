package com.taobao.mytaobao.newSettingV2.data;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.base.Versions;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.task.Coordinator;
import com.taobao.global.setting.d;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import com.taobao.utils.Global;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.ksx;
import tb.mvh;
import tb.mxk;
import tb.mxq;
import tb.mxr;
import tb.mxz;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final JSONObject GENERAL_SETTING_DEFAULT_STATUS_DATA;
    public static final String K_GENERAL_SETTING_DEFAULT_STATUS = "value";

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<NewGeneralSettingDataModel> f18392a;
    private mvh b;
    private final a c = new a();
    private final ksx d = new ksx(Global.getApplication());

    public static /* synthetic */ void a(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3064c735", new Object[]{bVar, jSONObject});
        } else {
            bVar.b(jSONObject);
        }
    }

    static {
        kge.a(-336946945);
        GENERAL_SETTING_DEFAULT_STATUS_DATA = JSONObject.parseObject("{\"wifiAutoDownload\":{\"type\":\"switch\",\"value\":true}}");
    }

    private boolean a(NewGeneralSettingDataModel newGeneralSettingDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d66eec80", new Object[]{this, newGeneralSettingDataModel})).booleanValue();
        }
        if (TextUtils.isEmpty(newGeneralSettingDataModel.nativeKey)) {
            return true;
        }
        Boolean b = this.c.b(newGeneralSettingDataModel.nativeKey);
        if (b != null) {
            return b.booleanValue();
        }
        JSONArray jSONArray = newGeneralSettingDataModel.showRule;
        if (jSONArray != null) {
            return a(jSONArray);
        }
        return true;
    }

    private boolean a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad9ea594", new Object[]{this, jSONArray})).booleanValue();
        }
        Iterator<Object> it = jSONArray.iterator();
        while (true) {
            boolean z = true;
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    if (!z || !a((JSONObject) next)) {
                        z = false;
                    }
                }
            }
            return z;
        }
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        while (true) {
            boolean z = false;
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String obj = entry.getValue().toString();
                String key = entry.getKey();
                if ("voiceAssistant".equals(key)) {
                    if (!z && !String.valueOf(mxq.a(Global.getApplication())).equals(obj)) {
                        break;
                    }
                    z = true;
                } else if (!"elderly".equals(key)) {
                    continue;
                } else {
                    if (!z && !String.valueOf(TextUtils.equals("1", TBRevisionSwitchManager.i().c("elderHome"))).equals(obj)) {
                        break;
                    }
                    z = true;
                }
            }
            return z;
        }
    }

    public void a() {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String a2 = com.taobao.mytaobao.newSettingV2.a.INSTANCE.a("mtbGeneralSettingsPage");
        if (!TextUtils.isEmpty(a2)) {
            try {
                parseObject = JSONObject.parseObject(a2, Feature.OrderedField);
            } catch (Throwable unused) {
                return;
            }
        } else {
            String a3 = mxk.a(Globals.getApplication(), "mtbsettings/mtb_generalsettings_default.json");
            if (TextUtils.isEmpty(a3)) {
                return;
            }
            try {
                parseObject = JSONObject.parseObject(a3, Feature.OrderedField);
            } catch (Throwable unused2) {
                return;
            }
        }
        if (parseObject == null) {
            return;
        }
        b(parseObject);
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        JSONObject a2 = a(jSONObject, "structure");
        JSONObject jSONObject2 = null;
        ArrayList<NewGeneralSettingDataModel> arrayList = new ArrayList<>();
        for (Map.Entry<String, Object> entry : a2.entrySet()) {
            String key = entry.getKey();
            String a3 = a(entry.getValue());
            if (jSONObject2 == null) {
                jSONObject2 = a(jSONObject, "content");
            }
            a(jSONObject2, arrayList, key, a3);
        }
        this.f18392a = arrayList;
    }

    private JSONObject a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5543672", new Object[]{this, jSONObject, str});
        }
        if (jSONObject != null && !TextUtils.isEmpty(str) && (jSONObject2 = jSONObject.getJSONObject("data")) != null) {
            return jSONObject2.getJSONObject(str);
        }
        return null;
    }

    private void a(JSONObject jSONObject, ArrayList<NewGeneralSettingDataModel> arrayList, String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c36f36", new Object[]{this, jSONObject, arrayList, str, str2});
        } else if (jSONObject == null || arrayList == null || TextUtils.isEmpty(str)) {
        } else {
            Object obj = jSONObject.get(str);
            if (!(obj instanceof JSONArray)) {
                return;
            }
            Iterator<Object> it = ((JSONArray) obj).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) next;
                    NewGeneralSettingDataModel newGeneralSettingDataModel = (NewGeneralSettingDataModel) JSONObject.toJavaObject(jSONObject2, NewGeneralSettingDataModel.class);
                    if (!TextUtils.isEmpty(newGeneralSettingDataModel.key)) {
                        newGeneralSettingDataModel.nativeKey = this.c.a(newGeneralSettingDataModel.key);
                        if (a(newGeneralSettingDataModel)) {
                            if (z) {
                                a(newGeneralSettingDataModel, jSONObject2, str2);
                                z = false;
                            }
                            b(newGeneralSettingDataModel);
                            arrayList.add(newGeneralSettingDataModel);
                        }
                    }
                }
            }
        }
    }

    private void b(NewGeneralSettingDataModel newGeneralSettingDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99a9fbd", new Object[]{this, newGeneralSettingDataModel});
        } else if (newGeneralSettingDataModel == null) {
        } else {
            String str = newGeneralSettingDataModel.style;
            String str2 = newGeneralSettingDataModel.nativeKey;
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                return;
            }
            if ("normal".equals(str)) {
                String a2 = this.c.a(str2, newGeneralSettingDataModel);
                if (TextUtils.isEmpty(a2)) {
                    a2 = (String) mxr.b(str2, a(str2, ""));
                }
                newGeneralSettingDataModel.rightTip = a2;
            } else if (!"switch".equals(str) && !NewGeneralSettingDataModel.STYLE_PICKER_SWITCH.equals(str)) {
            } else {
                boolean booleanValue = ((Boolean) a(str2, (String) Boolean.valueOf("true".equals(newGeneralSettingDataModel.defaultSwitchStat)))).booleanValue();
                Object obj = null;
                try {
                    obj = this.d.a("mytaobao", str2);
                } catch (Throwable th) {
                    TLog.loge(d.BIZ_NAME, "我淘设置页， key= " + str2 + " err=" + th.getMessage());
                }
                if (obj instanceof Boolean) {
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (d.a().b() && mxr.KEY_INLINE_VOLUME.equals(str2)) {
                        booleanValue = !booleanValue;
                    }
                } else if (obj != null) {
                    TLog.loge(d.BIZ_NAME, "开关value不是boolean， key=" + str2);
                    if (Versions.isDebug()) {
                        new RuntimeException("开关value不是boolean， key=" + str2);
                    }
                }
                newGeneralSettingDataModel.switchState = booleanValue;
            }
        }
    }

    private <T> T a(String str, T t) {
        JSONObject jSONObject;
        T t2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, t});
        }
        JSONObject jSONObject2 = mxz.q;
        return (jSONObject2 == null || !jSONObject2.containsKey(str) || (jSONObject = jSONObject2.getJSONObject(str)) == null || !jSONObject.containsKey("value") || (t2 = (T) jSONObject.get("value")) == null) ? t : t2;
    }

    private void a(NewGeneralSettingDataModel newGeneralSettingDataModel, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede0e2be", new Object[]{this, newGeneralSettingDataModel, jSONObject, str});
        } else if (newGeneralSettingDataModel == null || jSONObject == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                newGeneralSettingDataModel.isShowDividerWithoutTitle = true;
            } else {
                newGeneralSettingDataModel.showDividerWithTitle = str;
            }
        }
    }

    private String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj});
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).getString("title");
        }
        return null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.reborn.mclaren.general.setting.get");
        mtopRequest.setVersion("1.0");
        if (d.a().b()) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("settingExpType", (Object) "voice");
            hashMap.put(PushConstants.PARAMS, jSONObject.toJSONString());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(hashMap);
            mtopRequest.setData(jSONObject2.toJSONString());
            mtopRequest.dataParams = hashMap;
        }
        MtopBusiness mo1337addListener = MtopBusiness.build(mtopRequest, TaoHelper.getTTID()).mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.newSettingV2.data.NewGeneralSettingDataManager$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                final String str = new String(mtopResponse.getBytedata());
                Coordinator.execute(new Runnable() { // from class: com.taobao.mytaobao.newSettingV2.data.NewGeneralSettingDataManager$1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            com.taobao.mytaobao.newSettingV2.a.INSTANCE.a("mtbGeneralSettingsPage", str);
                        }
                    }
                });
                b.a(b.this, (JSONObject) JSONObject.parse(str, Feature.OrderedField));
                b bVar = b.this;
                if (b.$ipChange == null) {
                    return;
                }
                b bVar2 = b.this;
                b.$ipChange.a();
            }
        });
        mo1337addListener.mo1328setUnitStrategy("UNIT_TRADE");
        mo1337addListener.startRequest();
    }

    public ArrayList<NewGeneralSettingDataModel> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b36da644", new Object[]{this}) : this.f18392a;
    }

    public void a(mvh mvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5444699", new Object[]{this, mvhVar});
        } else {
            this.b = mvhVar;
        }
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            this.c.a(str, z);
        }
    }
}
