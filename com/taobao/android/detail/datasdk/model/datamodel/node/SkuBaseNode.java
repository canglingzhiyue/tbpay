package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.sku.BaseSkuInputComponent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.gbk;
import tb.kge;

/* loaded from: classes4.dex */
public class SkuBaseNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "skuBase";
    public ArrayList<BaseSkuInputComponent> components;
    public String macWeexUrl;
    private HashMap<String, SkuPropAddedInfo> propAddedInfo;
    public ArrayList<SkuProperty> props;
    public ArrayList<SkuIdPropPath> skus;

    static {
        kge.a(1748066211);
    }

    public static /* synthetic */ HashMap access$000(SkuBaseNode skuBaseNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("8885eb46", new Object[]{skuBaseNode}) : skuBaseNode.propAddedInfo;
    }

    public SkuBaseNode(JSONObject jSONObject) {
        super(jSONObject);
        this.skus = initSkuIdPropPath();
        this.propAddedInfo = initSkuPropAddedInfo();
        this.props = initSkuProperties();
        this.macWeexUrl = this.data.getString("macWeexUrl");
        this.components = initComponents();
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode");
    }

    public SkuBaseNode() {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode");
    }

    public JSONObject getOriginalData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2b45ceb8", new Object[]{this}) : this.data;
    }

    private ArrayList<BaseSkuInputComponent> initComponents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("d2cd9d27", new Object[]{this}) : epw.a(this.data.getJSONArray("components"), new epy<BaseSkuInputComponent>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.sku.BaseSkuInputComponent] */
            @Override // tb.epy
            public /* synthetic */ BaseSkuInputComponent b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public BaseSkuInputComponent a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (BaseSkuInputComponent) ipChange2.ipc$dispatch("f0177848", new Object[]{this, obj});
                }
                BaseSkuInputComponent baseSkuInputComponent = new BaseSkuInputComponent();
                JSONObject jSONObject = (JSONObject) obj;
                baseSkuInputComponent.type = jSONObject.getIntValue("type");
                baseSkuInputComponent.key = epw.a(jSONObject.getString("key"));
                baseSkuInputComponent.data = epw.a(jSONObject.getString("data"));
                return baseSkuInputComponent;
            }
        });
    }

    private ArrayList<SkuIdPropPath> initSkuIdPropPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("890fa511", new Object[]{this}) : epw.a(this.data.getJSONArray("skus"), new epy<SkuIdPropPath>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode$SkuIdPropPath] */
            @Override // tb.epy
            public /* synthetic */ SkuIdPropPath b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public SkuIdPropPath a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (SkuIdPropPath) ipChange2.ipc$dispatch("8ed75722", new Object[]{this, obj}) : new SkuIdPropPath((JSONObject) obj);
            }
        });
    }

    private HashMap<String, SkuPropAddedInfo> initSkuPropAddedInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("51d8cc68", new Object[]{this}) : epw.a(this.data.getJSONObject("propAddedInfo"), new epy<SkuPropAddedInfo>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode$SkuPropAddedInfo, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ SkuPropAddedInfo b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public SkuPropAddedInfo a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (SkuPropAddedInfo) ipChange2.ipc$dispatch("8e387cc6", new Object[]{this, obj}) : new SkuPropAddedInfo((JSONObject) obj);
            }
        });
    }

    private ArrayList<SkuProperty> initSkuProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("f0e689e1", new Object[]{this}) : epw.a(this.data.getJSONArray("props"), new epy<SkuProperty>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode$SkuProperty, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ SkuProperty b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public SkuProperty a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (SkuProperty) ipChange2.ipc$dispatch("3d8f1270", new Object[]{this, obj}) : new SkuProperty((JSONObject) obj, SkuBaseNode.access$000(SkuBaseNode.this));
            }
        });
    }

    /* loaded from: classes4.dex */
    public static class SkuIdPropPath implements Serializable {
        public String itemId;
        public String propPath;
        public boolean selected;
        public String skuId;

        static {
            kge.a(424681983);
            kge.a(1028243835);
        }

        public SkuIdPropPath() {
        }

        public SkuIdPropPath(JSONObject jSONObject) {
            this.skuId = epw.a(jSONObject.getString("skuId"));
            this.propPath = epw.a(jSONObject.getString(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH));
            this.selected = jSONObject.getBooleanValue(gbk.TYPE_SELECTED);
            this.itemId = epw.a(jSONObject.getString("itemId"));
        }
    }

    /* loaded from: classes4.dex */
    public static class SkuProperty implements Serializable {
        public String name;
        public String pid;
        public SkuPropAddedInfo propAddedInfo;
        public ArrayList<SkuPropertyValue> values;

        static {
            kge.a(625639025);
            kge.a(1028243835);
        }

        public SkuProperty() {
        }

        public SkuProperty(JSONObject jSONObject, HashMap<String, SkuPropAddedInfo> hashMap) {
            this.pid = epw.a(jSONObject.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID));
            this.name = epw.a(jSONObject.getString("name"));
            if (hashMap != null && hashMap.containsKey(this.pid)) {
                this.propAddedInfo = hashMap.get(this.pid);
            }
            this.values = epw.a(jSONObject.getJSONArray("values"), new epy<SkuPropertyValue>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode.SkuProperty.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode$SkuPropertyValue] */
                @Override // tb.epy
                public /* synthetic */ SkuPropertyValue b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public SkuPropertyValue a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SkuPropertyValue) ipChange.ipc$dispatch("8dc78ff5", new Object[]{this, obj}) : new SkuPropertyValue((JSONObject) obj);
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static class SkuPropertyValue implements Serializable {
        public String alias;
        public boolean checkable;
        public String colorHotNew;
        public String colorMaterial;
        public String colorMaterialImg;
        public String colorSeries;
        public String colorValue;
        public String desc;
        public boolean hasChecked;
        public String image;
        public String name;
        public String tag;
        public String tagHighlight;
        public String vid;

        static {
            kge.a(1632731520);
            kge.a(1028243835);
        }

        public SkuPropertyValue() {
            this.checkable = true;
            this.checkable = true;
        }

        public SkuPropertyValue(JSONObject jSONObject) {
            this.checkable = true;
            this.vid = epw.a(jSONObject.getString(MspEventTypes.ACTION_STRING_VID));
            this.name = epw.a(jSONObject.getString("name"));
            this.image = epw.a(jSONObject.getString("image"));
            this.alias = epw.a(jSONObject.getString("alias"));
            this.desc = epw.a(jSONObject.getString("desc"));
            this.tagHighlight = epw.a(jSONObject.getString("tagHighlight"));
            this.tag = epw.a(jSONObject.getString("tag"));
            this.colorValue = epw.a(jSONObject.getString("colorValue"));
            this.colorSeries = epw.a(jSONObject.getString("colorSeries"));
            this.colorMaterialImg = epw.a(jSONObject.getString("colorMaterialImg"));
            this.colorMaterial = epw.a(jSONObject.getString("colorMaterial"));
            this.colorHotNew = epw.a(jSONObject.getString("colorHotNew"));
            this.checkable = true;
        }
    }

    /* loaded from: classes4.dex */
    public static class SkuPropAddedInfo implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ArrayList<String> colorSeries;
        public String macShowNum;
        public String macShowText;

        static {
            kge.a(1771517583);
            kge.a(1028243835);
        }

        public SkuPropAddedInfo(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.macShowText = epw.a(jSONObject.getString("macShowText"));
            this.macShowNum = epw.a(jSONObject.getString("macShowNum"));
            parseColorSeries(jSONObject);
        }

        private void parseColorSeries(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85f418a2", new Object[]{this, jSONObject});
            } else if (jSONObject == null || !jSONObject.containsKey("colorSeries")) {
            } else {
                this.colorSeries = epw.a(jSONObject.getJSONArray("colorSeries"), new epy<String>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.SkuBaseNode.SkuPropAddedInfo.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                    @Override // tb.epy
                    public /* synthetic */ String b(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                    }

                    public String a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
                    }
                });
            }
        }
    }
}
