package com.taobao.android.ultron.datamodel.imp;

import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.LinkageType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import tb.jny;
import tb.jop;
import tb.jpk;
import tb.jqc;
import tb.kge;

/* loaded from: classes6.dex */
public class DMComponent implements IDMComponent, Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APPEND = "append";
    private static final String BOOL_TRUE_VALUE = "true";
    public static final String CARD_GROUP_TAG = "CardGroupTag";
    public static final String EXTEND_TYPE = "extendType";
    public static final String POSITION_TAG = "PositionTag";
    public static final String PREPEND = "prepend";
    public static final String RESET = "reset";
    private static final String STRING_UNDERLINE = "_";
    private static final String TAG = "DMComponent";
    private Map<String, DMComponent> codePopupWindowMap;
    public String componentKey;
    public JSONObject layout;
    public String mAdjustOperatorAction;
    public String mBizName;
    public JSONObject mContainerInfo;
    public String mContainerType;
    private IDMComponent.a mCustomValidate;
    public JSONObject mData;
    private String mDeltaOpType;
    private Map<String, List<com.taobao.android.ultron.common.model.b>> mEventMap;
    public JSONObject mEvents;
    public boolean mExtendBlock;
    public JSONObject mFeatures;
    public JSONObject mFields;
    public boolean mHasMore;
    public JSONObject mHidden;
    public String mID;
    public int mModifiedCount;
    public DMComponent mParent;
    private JSONObject mStashData;
    public String mSubmit;
    public String mTag;
    public String mTriggerEvent;
    public String mType;
    private jpk messageChannel;
    public LinkageType mLinkageType = LinkageType.REFRESH;
    private List<IDMComponent> mChildren = new ArrayList();
    private ArrayMap<String, Object> mExtMap = new ArrayMap<>();
    private ConcurrentHashMap<String, Object> mSafeExtMap = new ConcurrentHashMap<>();
    private ArrayMap<String, Object> mOnceExtMap = new ArrayMap<>();
    private String extendType = "append";

    static {
        kge.a(189290713);
        kge.a(-325349683);
        kge.a(-723128125);
        kge.a(1028243835);
    }

    public DMComponent(JSONObject jSONObject, String str, JSONObject jSONObject2, Map<String, List<com.taobao.android.ultron.common.model.b>> map) {
        this.mContainerType = "native";
        this.mContainerType = str;
        this.mContainerInfo = jSONObject2;
        this.mEventMap = map;
        loadData(jSONObject);
    }

    public DMComponent(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        this.mContainerType = "native";
        this.mContainerType = str;
        this.mContainerInfo = jSONObject2;
        loadData(jSONObject);
        this.mEventMap = parseEventMap(jSONObject);
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getContainerType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c6db7474", new Object[]{this}) : this.mContainerType;
    }

    public void setContainerType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4932fbea", new Object[]{this, str});
        } else {
            this.mContainerType = str;
        }
    }

    public void setContainerInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e327dc", new Object[]{this, jSONObject});
        } else {
            this.mContainerInfo = jSONObject;
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getContainerInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("245b3440", new Object[]{this}) : this.mContainerInfo;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this}) : this.mData;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getFields() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this}) : this.mFields;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getHidden() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("23924447", new Object[]{this}) : this.mHidden;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        JSONObject jSONObject = this.mData;
        return jSONObject == null ? "unknown" : jSONObject.getString("id");
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        JSONObject jSONObject = this.mData;
        return jSONObject == null ? "unknown" : jSONObject.getString("tag");
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("216f01ba", new Object[]{this});
        }
        JSONObject jSONObject = this.mData;
        return jSONObject == null ? "unknown" : jSONObject.getString("position");
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getCardGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b741200", new Object[]{this});
        }
        JSONObject jSONObject = this.mData;
        return jSONObject == null ? "unknown" : jSONObject.getString("cardGroup");
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        JSONObject jSONObject = this.mData;
        return jSONObject == null ? "unknown" : jSONObject.getString("type");
    }

    public void setComponentKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d3c135", new Object[]{this, str});
        } else {
            this.componentKey = str;
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.componentKey)) {
            return this.componentKey;
        }
        String tag = getTag();
        String id = getId();
        if (tag == null || id == null) {
            return null;
        }
        return tag + "_" + id;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public Map<String, List<com.taobao.android.ultron.common.model.b>> getEventMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("86199254", new Object[]{this}) : this.mEventMap;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public LinkageType getLinkageType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkageType) ipChange.ipc$dispatch("67b2f4b8", new Object[]{this}) : this.mLinkageType;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public IDMComponent getParent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("c56546ab", new Object[]{this}) : this.mParent;
    }

    public void setLinkageType(LinkageType linkageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c782f6", new Object[]{this, linkageType});
        } else {
            this.mLinkageType = linkageType;
        }
    }

    public void onReload(jny jnyVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8afd9b6", new Object[]{this, jnyVar, jSONObject});
        } else {
            loadData(jSONObject);
        }
    }

    public void onReloadEvent(Map<String, List<com.taobao.android.ultron.common.model.b>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c5b0fbc", new Object[]{this, map});
        } else {
            this.mEventMap = map;
        }
    }

    public JSONObject submitData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d0006289", new Object[]{this}) : this.mData;
    }

    public JSONObject adjustData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("c4e5700", new Object[]{this}) : this.mData;
    }

    public boolean shouldSubmit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29f3a6b6", new Object[]{this})).booleanValue();
        }
        String str = this.mSubmit;
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase("true");
    }

    public JSONObject getFeatures() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("51abd7da", new Object[]{this}) : this.mFeatures;
    }

    public void setParent(DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c051975", new Object[]{this, dMComponent});
        } else {
            this.mParent = dMComponent;
        }
    }

    private void loadData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5622b99", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            throw new IllegalArgumentException();
        } else {
            this.mData = jSONObject;
            this.mID = jSONObject.getString("id");
            this.mTag = jSONObject.getString("tag");
            this.mType = this.mData.getString("type");
            this.mSubmit = jSONObject.getString("submit");
            this.mBizName = jSONObject.getString("bizName");
            JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
                jSONObject.put("fields", (Object) jSONObject2);
            }
            this.mFields = jSONObject2;
            if (this.mTag == null) {
                this.mTag = "";
                jSONObject.put("tag", (Object) this.mTag);
            }
            if (this.mType == null) {
                this.mType = "";
                jSONObject.put("type", (Object) this.mType);
            }
            this.mHidden = this.mData.getJSONObject("hidden");
            this.mEvents = this.mData.getJSONObject("events");
            this.mFeatures = this.mData.getJSONObject("features");
            this.mExtendBlock = this.mData.containsKey("extendBlock") ? this.mData.getBoolean("extendBlock").booleanValue() : false;
            if (this.mData.containsKey("hasMore")) {
                z = this.mData.getBoolean("hasMore").booleanValue();
            }
            this.mHasMore = z;
            this.layout = this.mData.containsKey("layout") ? this.mData.getJSONObject("layout") : null;
            if (!jSONObject.containsKey(EXTEND_TYPE)) {
                return;
            }
            this.extendType = jSONObject.getString(EXTEND_TYPE);
        }
    }

    public void addChildren(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2141cd38", new Object[]{this, list});
        } else {
            this.mChildren.addAll(list);
        }
    }

    public void addChild(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950f8892", new Object[]{this, iDMComponent});
        } else {
            this.mChildren.add(iDMComponent);
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public List<IDMComponent> getChildren() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this}) : this.mChildren;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public ArrayMap<String, Object> getExtMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayMap) ipChange.ipc$dispatch("c980df8e", new Object[]{this}) : this.mExtMap;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public ConcurrentHashMap<String, Object> getSafeExtMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("ffabd961", new Object[]{this}) : this.mSafeExtMap;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public ArrayMap<String, Object> getOnceExtMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayMap) ipChange.ipc$dispatch("b7b8cd4d", new Object[]{this}) : this.mOnceExtMap;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public boolean clearOnceExtMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac073794", new Object[]{this})).booleanValue();
        }
        ArrayMap<String, Object> arrayMap = this.mOnceExtMap;
        if (arrayMap == null) {
            return false;
        }
        arrayMap.clear();
        return true;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void writeFields(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fac4fa5", new Object[]{this, str, obj});
        } else if (this.mFields == null || StringUtils.isEmpty(str) || obj == null) {
        } else {
            this.mFields.put(str, obj);
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void record() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbb6058", new Object[]{this});
            return;
        }
        this.mStashData = JSON.parseObject(this.mData.toJSONString());
        Map<String, List<com.taobao.android.ultron.common.model.b>> map = this.mEventMap;
        if (map == null) {
            return;
        }
        jop.a(map);
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getStashData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("41d69a30", new Object[]{this}) : this.mStashData;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void rollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a52d58b", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.mStashData;
        if (jSONObject != null) {
            loadData(jSONObject);
            this.mStashData = null;
        }
        Map<String, List<com.taobao.android.ultron.common.model.b>> map = this.mEventMap;
        if (map == null) {
            return;
        }
        jop.b(map);
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setCustomValidate(IDMComponent.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b398bc7", new Object[]{this, aVar});
        } else {
            this.mCustomValidate = aVar;
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public com.taobao.android.ultron.common.b validate() {
        JSONObject jSONObject;
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.b) ipChange.ipc$dispatch("cce007c2", new Object[]{this});
        }
        IDMComponent.a aVar = this.mCustomValidate;
        if (aVar != null) {
            return aVar.a(this);
        }
        com.taobao.android.ultron.common.b bVar = new com.taobao.android.ultron.common.b();
        JSONObject jSONObject2 = this.mData;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("validate")) == null) {
            return bVar;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("fields");
        JSONArray jSONArray2 = jSONObject.getJSONArray("regex");
        JSONArray jSONArray3 = jSONObject.getJSONArray("msg");
        if (jSONArray != null && jSONArray2 != null && jSONArray3 != null && !jSONArray.isEmpty() && (size = jSONArray.size()) == jSONArray2.size() && size == jSONArray3.size()) {
            for (int i = 0; i < size; i++) {
                String string = this.mFields.getString(jSONArray.getString(i));
                if (string == null) {
                    string = "";
                }
                String string2 = jSONArray2.getString(i);
                String string3 = jSONArray3.getString(i);
                Pattern pattern = null;
                try {
                    pattern = Pattern.compile(string2);
                } catch (Exception unused) {
                }
                if (pattern != null && !pattern.matcher(string).find()) {
                    bVar.a(false);
                    bVar.a(string3);
                    bVar.a(this);
                    return bVar;
                }
            }
        }
        return bVar;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        JSONObject jSONObject = this.mData;
        if (jSONObject == null) {
            return 2;
        }
        String string = jSONObject.getString("status");
        if ("hidden".equals(string)) {
            return 0;
        }
        return "disable".equals(string) ? 1 : 2;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public int getModifiedCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a626c8a", new Object[]{this})).intValue() : this.mModifiedCount;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void updateModifiedCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f37784", new Object[]{this});
        } else {
            this.mModifiedCount++;
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("78cabc36", new Object[]{this}) : this.mEvents;
    }

    public void setEvents(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b13ef00e", new Object[]{this, jSONObject});
        } else {
            this.mEvents = jSONObject;
        }
    }

    public boolean isExtendBlock() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1176a14", new Object[]{this})).booleanValue() : this.mExtendBlock;
    }

    public boolean hasMore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e35ca1a", new Object[]{this})).booleanValue() : this.mHasMore;
    }

    public String getTriggerEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("63efafc1", new Object[]{this}) : this.mTriggerEvent;
    }

    public void setTriggerEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa4bcd5", new Object[]{this, str});
        } else {
            this.mTriggerEvent = str;
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getAdjustOperatorAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8b50fe7a", new Object[]{this}) : this.mAdjustOperatorAction;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setAdjustOperatorAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c318793c", new Object[]{this, str});
        } else {
            this.mAdjustOperatorAction = str;
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2fbde1c7", new Object[]{this}) : this.layout;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getLayoutType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("208cadbf", new Object[]{this});
        }
        JSONObject jSONObject = this.layout;
        return jSONObject != null ? jSONObject.getString("type") : "";
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setLayoutType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f29197", new Object[]{this, str});
            return;
        }
        if (this.layout == null) {
            this.layout = new JSONObject();
        }
        this.layout.put("type", (Object) str);
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public JSONObject getLayoutStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ff3b1298", new Object[]{this});
        }
        JSONObject jSONObject = this.layout;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject("style");
    }

    public void addCodePopupWindow(String str, DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe09e69", new Object[]{this, str, dMComponent});
        } else if (StringUtils.isEmpty(str) || dMComponent == null) {
        } else {
            if (this.codePopupWindowMap == null) {
                this.codePopupWindowMap = new HashMap();
            }
            this.codePopupWindowMap.put(str, dMComponent);
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public Map<String, DMComponent> getCodePopupWindowMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("49b4a8ff", new Object[]{this}) : this.codePopupWindowMap;
    }

    public JSONObject toJsonInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8cfb9878", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) this.mID);
        jSONObject.put("tag", (Object) this.mTag);
        jSONObject.put("type", (Object) this.mType);
        JSONObject jSONObject2 = this.mData;
        String str = null;
        jSONObject.put("data", (Object) (jSONObject2 != null ? jSONObject2.toJSONString() : null));
        JSONObject jSONObject3 = this.mFields;
        jSONObject.put("fields", (Object) (jSONObject3 != null ? jSONObject3.toJSONString() : null));
        JSONObject jSONObject4 = this.mHidden;
        jSONObject.put("hidden", (Object) (jSONObject4 != null ? jSONObject4.toJSONString() : null));
        LinkageType linkageType = this.mLinkageType;
        jSONObject.put("linkageType", (Object) (linkageType != null ? linkageType.toString() : null));
        jSONObject.put("containerType", (Object) this.mContainerType);
        JSONObject jSONObject5 = this.mContainerInfo;
        jSONObject.put("containerInfo", (Object) (jSONObject5 != null ? jSONObject5.toJSONString() : null));
        jSONObject.put("submit", (Object) this.mSubmit);
        JSONObject jSONObject6 = this.mEvents;
        if (jSONObject6 != null) {
            str = jSONObject6.toJSONString();
        }
        jSONObject.put("events", (Object) str);
        jSONObject.put("extendBlock", (Object) Boolean.valueOf(this.mExtendBlock));
        jSONObject.put(EXTEND_TYPE, (Object) this.extendType);
        return jSONObject;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public jpk getMessageChannel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jpk) ipChange.ipc$dispatch("3bbd35a8", new Object[]{this}) : this.messageChannel;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setMessageChannel(jpk jpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b08cf0", new Object[]{this, jpkVar});
        } else {
            this.messageChannel = jpkVar;
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void writeBackFields(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e220c12a", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        this.mFields = jSONObject;
        if (!z) {
            return;
        }
        postNotification();
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void writeBackData(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac85edb", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null) {
        } else {
            loadData(jSONObject);
            if (!z) {
                return;
            }
            postNotification();
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void writeBackDataAndReloadEvent(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36db19a5", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null) {
        } else {
            loadData(jSONObject);
            this.mEventMap = parseEventMap(jSONObject);
            if (!z) {
                return;
            }
            postNotification();
        }
    }

    public void writeBackDataAndReloadEvent(JSONObject jSONObject, Map<String, List<com.taobao.android.ultron.common.model.b>> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124d44fe", new Object[]{this, jSONObject, map, new Boolean(z)});
        } else if (jSONObject == null) {
        } else {
            loadData(jSONObject);
            this.mEventMap = map;
            if (!z) {
                return;
            }
            postNotification();
        }
    }

    public Map<String, List<com.taobao.android.ultron.common.model.b>> parseEventMap(JSONObject jSONObject) {
        com.taobao.android.ultron.common.model.b parseEvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7bbf1f69", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("events");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap(jSONObject2.size());
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!StringUtils.isEmpty(key) && (value instanceof JSONArray)) {
                JSONArray jSONArray = (JSONArray) value;
                ArrayList arrayList = new ArrayList(jSONArray.size());
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof JSONObject) && (parseEvent = parseEvent((JSONObject) next)) != null) {
                        arrayList.add(parseEvent);
                    }
                }
                hashMap.put(key, arrayList);
            }
        }
        return hashMap;
    }

    private com.taobao.android.ultron.common.model.b parseEvent(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("eab505e3", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return new DMEvent(jSONObject.getString("type"), jSONObject.getJSONObject("fields"), null, jSONObject.getIntValue("option"));
        }
        return null;
    }

    private void postNotification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bef3cb2", new Object[]{this});
        } else if (this.messageChannel == null) {
        } else {
            HashMap hashMap = new HashMap(1);
            hashMap.put("postModel", this);
            this.messageChannel.b(hashMap);
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setComponentCardGroupTag(String str) {
        ArrayMap<String, Object> arrayMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c04f837", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || (arrayMap = this.mExtMap) == null) {
        } else {
            arrayMap.put("CardGroupTag", str);
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setComponentPosition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3f4095", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.mExtMap.put("PositionTag", str);
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public boolean isNormalComponent() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff5283d7", new Object[]{this})).booleanValue() : getStatus() != 0 && (jSONObject = this.mFields) != null && !jSONObject.isEmpty() && !BundleLineComponent.COMPONENT_TAG.equals(getType());
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setCornerTypeFields(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c844b252", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = this.mFields;
        if (jSONObject == null) {
            return;
        }
        if (i == 1) {
            jSONObject.put("cornerType", (Object) "top");
        } else if (i == 16) {
            jSONObject.put("cornerType", (Object) "bottom");
        } else if (i != 17) {
        } else {
            jSONObject.put("cornerType", (Object) "both");
        }
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public String getExtendType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82c37cf", new Object[]{this}) : this.extendType;
    }

    @Override // com.taobao.android.ultron.common.model.IDMComponent
    public void setExtendType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4444987", new Object[]{this, str});
        } else {
            this.extendType = str;
        }
    }

    public String getDeltaOpType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6cd59dbc", new Object[]{this}) : this.mDeltaOpType;
    }

    public void setDeltaOpType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459548a2", new Object[]{this, str});
        } else {
            this.mDeltaOpType = str;
        }
    }

    public DMComponent deepClone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DMComponent) ipChange.ipc$dispatch("4b066f50", new Object[]{this}) : new DMComponent(jqc.a(this.mData), this.mContainerType, jqc.a(this.mContainerInfo));
    }
}
