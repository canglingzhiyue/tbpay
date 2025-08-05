package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.sku.BaseSkuInputComponent;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import tb.gbk;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class SkuBaseNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<BaseSkuInputComponent> components;
    private HashMap<String, SkuPropAddedInfo> propAddedInfo;
    public ArrayList<SkuProperty> props;
    public ArrayList<SkuIdPropPath> skus;

    static {
        kge.a(-2108055639);
    }

    public static /* synthetic */ HashMap access$000(SkuBaseNode skuBaseNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("519dc780", new Object[]{skuBaseNode}) : skuBaseNode.propAddedInfo;
    }

    public SkuBaseNode(JSONObject jSONObject) {
        super(jSONObject);
        this.skus = initSkuIdPropPath();
        this.propAddedInfo = initSkuPropAddedInfo();
        this.props = initSkuProperties();
        this.components = initComponents();
        tpc.a("com.taobao.android.detail.sdk.model.node.SkuBaseNode");
    }

    public SkuBaseNode() {
    }

    public JSONObject getOriginalData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("2b45ceb8", new Object[]{this}) : this.root;
    }

    private ArrayList<BaseSkuInputComponent> initComponents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("d2cd9d27", new Object[]{this}) : c.a(this.root.getJSONArray("components"), new g<BaseSkuInputComponent>() { // from class: com.taobao.android.detail.sdk.model.node.SkuBaseNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.sku.BaseSkuInputComponent] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ BaseSkuInputComponent b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public BaseSkuInputComponent a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (BaseSkuInputComponent) ipChange2.ipc$dispatch("92eb64e", new Object[]{this, obj});
                }
                BaseSkuInputComponent baseSkuInputComponent = new BaseSkuInputComponent();
                JSONObject jSONObject = (JSONObject) obj;
                baseSkuInputComponent.type = jSONObject.getIntValue("type");
                baseSkuInputComponent.key = c.a(jSONObject.getString("key"));
                baseSkuInputComponent.data = c.a(jSONObject.getString("data"));
                return baseSkuInputComponent;
            }
        });
    }

    private ArrayList<SkuIdPropPath> initSkuIdPropPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("890fa511", new Object[]{this}) : c.a(this.root.getJSONArray("skus"), new g<SkuIdPropPath>() { // from class: com.taobao.android.detail.sdk.model.node.SkuBaseNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.SkuBaseNode$SkuIdPropPath, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ SkuIdPropPath b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public SkuIdPropPath a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (SkuIdPropPath) ipChange2.ipc$dispatch("62d3ecdc", new Object[]{this, obj}) : new SkuIdPropPath((JSONObject) obj);
            }
        });
    }

    private HashMap<String, SkuPropAddedInfo> initSkuPropAddedInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("51d8cc68", new Object[]{this}) : c.a(this.root.getJSONObject("propAddedInfo"), new g<SkuPropAddedInfo>() { // from class: com.taobao.android.detail.sdk.model.node.SkuBaseNode.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.node.SkuBaseNode$SkuPropAddedInfo] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ SkuPropAddedInfo b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public SkuPropAddedInfo a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (SkuPropAddedInfo) ipChange2.ipc$dispatch("accc54cc", new Object[]{this, obj}) : new SkuPropAddedInfo((JSONObject) obj);
            }
        });
    }

    private ArrayList<SkuProperty> initSkuProperties() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("f0e689e1", new Object[]{this}) : c.a(this.root.getJSONArray("props"), new g<SkuProperty>() { // from class: com.taobao.android.detail.sdk.model.node.SkuBaseNode.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.SkuBaseNode$SkuProperty, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ SkuProperty b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public SkuProperty a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (SkuProperty) ipChange2.ipc$dispatch("1549ceaa", new Object[]{this, obj}) : new SkuProperty((JSONObject) obj, SkuBaseNode.access$000(SkuBaseNode.this));
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
            kge.a(1127014277);
            kge.a(1028243835);
        }

        public SkuIdPropPath() {
        }

        public SkuIdPropPath(JSONObject jSONObject) {
            this.skuId = c.a(jSONObject.getString("skuId"));
            this.propPath = c.a(jSONObject.getString(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH));
            this.selected = jSONObject.getBooleanValue(gbk.TYPE_SELECTED);
            this.itemId = c.a(jSONObject.getString("itemId"));
        }
    }

    /* loaded from: classes4.dex */
    public static class SkuProperty implements Serializable {
        public String name;
        public String pid;
        public SkuPropAddedInfo propAddedInfo;
        public ArrayList<SkuPropertyValue> values;

        static {
            kge.a(-1675303561);
            kge.a(1028243835);
        }

        public SkuProperty() {
        }

        public SkuProperty(JSONObject jSONObject, HashMap<String, SkuPropAddedInfo> hashMap) {
            this.pid = c.a(jSONObject.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID));
            this.name = c.a(jSONObject.getString("name"));
            if (hashMap != null && hashMap.containsKey(this.pid)) {
                this.propAddedInfo = hashMap.get(this.pid);
            }
            this.values = c.a(jSONObject.getJSONArray("values"), new g<SkuPropertyValue>() { // from class: com.taobao.android.detail.sdk.model.node.SkuBaseNode.SkuProperty.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.sdk.model.node.SkuBaseNode$SkuPropertyValue, java.lang.Object] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ SkuPropertyValue b(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public SkuPropertyValue a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (SkuPropertyValue) ipChange.ipc$dispatch("ac5b67fb", new Object[]{this, obj}) : new SkuPropertyValue((JSONObject) obj);
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
            kge.a(-266564038);
            kge.a(1028243835);
        }

        public SkuPropertyValue() {
            this.checkable = true;
            this.checkable = true;
        }

        public SkuPropertyValue(JSONObject jSONObject) {
            this.checkable = true;
            this.vid = c.a(jSONObject.getString(MspEventTypes.ACTION_STRING_VID));
            this.name = c.a(jSONObject.getString("name"));
            this.image = c.a(jSONObject.getString("image"));
            this.alias = c.a(jSONObject.getString("alias"));
            this.desc = c.a(jSONObject.getString("desc"));
            this.tagHighlight = c.a(jSONObject.getString("tagHighlight"));
            this.tag = c.a(jSONObject.getString("tag"));
            this.colorValue = c.a(jSONObject.getString("colorValue"));
            this.colorSeries = c.a(jSONObject.getString("colorSeries"));
            this.colorMaterialImg = c.a(jSONObject.getString("colorMaterialImg"));
            this.colorMaterial = c.a(jSONObject.getString("colorMaterial"));
            this.colorHotNew = c.a(jSONObject.getString("colorHotNew"));
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
            kge.a(-127777975);
            kge.a(1028243835);
        }

        public SkuPropAddedInfo(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.macShowText = c.a(jSONObject.getString("macShowText"));
            this.macShowNum = c.a(jSONObject.getString("macShowNum"));
            parseColorSeries(jSONObject);
        }

        private void parseColorSeries(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85f418a2", new Object[]{this, jSONObject});
            } else if (jSONObject == null || !jSONObject.containsKey("colorSeries")) {
            } else {
                this.colorSeries = c.a(jSONObject.getJSONArray("colorSeries"), new g<String>() { // from class: com.taobao.android.detail.sdk.model.node.SkuBaseNode.SkuPropAddedInfo.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                    @Override // com.taobao.android.detail.sdk.utils.g
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
