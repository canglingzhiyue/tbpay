package com.taobao.message.tree.core.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class NodeImpl implements ContentNode<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String attachTreeId;
    private transient List<ContentNode> childNode;
    private Map<String, String> computed;
    private Map<String, Object> computedData;
    private String configData;
    private Map<String, Object> ext;
    private String nodeId;
    private Object object;
    private String originalObjectId;
    private String originalObjectType;
    private String parentId;
    private String type;
    private String uniqueKey;
    private transient Map<String, Object> viewData;

    static {
        kge.a(-1882636478);
        kge.a(-764254693);
    }

    public NodeImpl() {
        this.attachTreeId = "0";
        this.computed = new ConcurrentHashMap();
        this.computedData = new ConcurrentHashMap();
        this.viewData = new ConcurrentHashMap();
        this.ext = new ConcurrentHashMap();
        this.childNode = new ArrayList();
    }

    public NodeImpl(String str, String str2, String str3, String str4) {
        this(str, str2, str3, null, str4);
    }

    public NodeImpl(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, null);
    }

    public NodeImpl(String str, String str2, String str3, String str4, String str5, Object obj) {
        this.attachTreeId = "0";
        this.computed = new ConcurrentHashMap();
        this.computedData = new ConcurrentHashMap();
        this.viewData = new ConcurrentHashMap();
        this.ext = new ConcurrentHashMap();
        this.childNode = new ArrayList();
        this.nodeId = str;
        this.parentId = str2;
        this.type = str3;
        this.uniqueKey = str5;
        this.configData = str4;
        this.object = obj;
    }

    public NodeImpl(String str, String str2, Object obj) {
        this(str, (String) null, str2, obj);
    }

    public NodeImpl(String str, String str2, String str3, Object obj) {
        this(null, null, str, str2, str3, obj);
    }

    @Override // com.taobao.message.tree.core.model.Node
    public String getAttachTreeId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df6d0d05", new Object[]{this}) : this.attachTreeId;
    }

    @Override // com.taobao.message.tree.core.model.Node
    public String getNodeId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6fcbeb26", new Object[]{this}) : this.nodeId;
    }

    @Override // com.taobao.message.tree.core.model.Node
    public String getParentId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2ba388fe", new Object[]{this}) : this.parentId;
    }

    @Override // com.taobao.message.tree.core.model.Node
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
    }

    @Override // com.taobao.message.tree.core.model.Node
    public String getUniqueKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48663fe1", new Object[]{this}) : this.uniqueKey;
    }

    @Override // com.taobao.message.tree.core.model.Node
    public Map<String, String> getComputed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c5e2603f", new Object[]{this}) : this.computed;
    }

    @Override // com.taobao.message.tree.core.model.Node
    public String getConfigData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("93b63637", new Object[]{this}) : this.configData;
    }

    @Override // com.taobao.message.tree.core.model.Node
    public Map<String, Object> getExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7b9b14a7", new Object[]{this}) : this.ext;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "NodeImpl{attachTreeId='" + this.attachTreeId + "', nodeId='" + this.nodeId + "', parentId='" + this.parentId + "', type=" + this.type + ", configData='" + this.configData + "'}";
    }

    @Override // com.taobao.message.tree.core.model.ContentNode
    public Object getObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a8d7ee76", new Object[]{this}) : this.object;
    }

    @Override // com.taobao.message.tree.core.model.ContentNode
    public Map<String, Object> getComputedData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c6b48c09", new Object[]{this}) : this.computedData;
    }

    @Override // com.taobao.message.tree.core.model.ContentNode
    public Map<String, Object> getViewMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("258c607d", new Object[]{this}) : this.viewData;
    }

    public void setViewMap(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73800c49", new Object[]{this, map});
        } else {
            this.viewData = map;
        }
    }

    @Override // com.taobao.message.tree.core.model.Node
    public void setAttachTreeId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed30811", new Object[]{this, str});
        } else {
            this.attachTreeId = str;
        }
    }

    public void setNodeId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295b6710", new Object[]{this, str});
        } else {
            this.nodeId = str;
        }
    }

    public void setParentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3aaf138", new Object[]{this, str});
        } else {
            this.parentId = str;
        }
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type = str;
        }
    }

    public void setComputed(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6435a2f", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.computed = map;
        }
    }

    public void setConfigData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59fa181f", new Object[]{this, str});
        } else {
            this.configData = str;
        }
    }

    public void setObject(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e76424", new Object[]{this, obj});
        } else {
            this.object = obj;
        }
    }

    public void setComputedData(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e51bcda5", new Object[]{this, map});
        } else {
            this.computedData = map;
        }
    }

    public void setUniqueKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("469f781d", new Object[]{this, str});
        } else {
            this.uniqueKey = str;
        }
    }

    @Override // com.taobao.message.tree.core.model.ContentNode
    public List<ContentNode> getChildNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8894d758", new Object[]{this}) : this.childNode;
    }

    public void setChildNode(List<ContentNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7032874", new Object[]{this, list});
        } else {
            this.childNode = list;
        }
    }

    @Override // com.taobao.message.tree.core.model.ContentNode
    public String getOriginalObjectType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4821e139", new Object[]{this}) : this.originalObjectType;
    }

    public void setOriginalObjectType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fec015d", new Object[]{this, str});
        } else {
            this.originalObjectType = str;
        }
    }

    @Override // com.taobao.message.tree.core.model.ContentNode
    public String getOriginalObjectId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87ca9078", new Object[]{this}) : this.originalObjectId;
    }

    public void setOriginalObjectId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adca0cfe", new Object[]{this, str});
        } else {
            this.originalObjectId = str;
        }
    }
}
