package com.taobao.detail.domain.tuwen.template;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.domain.template.android.ComponentVO;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class TuwenTemplate extends ComponentVO implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<TuwenTemplate> actions;
    public List<TuwenTemplate> children;
    public Map<String, Object> params;

    static {
        kge.a(2070484436);
        kge.a(1028243835);
        kge.a(-723128125);
    }

    public static /* synthetic */ Object ipc$super(TuwenTemplate tuwenTemplate, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TuwenTemplate() {
    }

    public TuwenTemplate(String str, String str2, String str3, Map<String, Object> map, List<TuwenTemplate> list) {
        this.ID = str;
        this.type = str2;
        this.key = str3;
        this.params = map;
        this.children = list;
    }

    public void addSeemore(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b99e77", new Object[]{this, map});
            return;
        }
        if (this.children == null) {
            this.children = new ArrayList();
        }
        this.children.add(b.a("see_more", null, map));
    }

    public void addParams(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166a56b4", new Object[]{this, str, obj});
            return;
        }
        if (this.params == null) {
            this.params = new HashMap();
        }
        this.params.put(str, obj);
    }

    public void addChild(TuwenTemplate tuwenTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba1be6b", new Object[]{this, tuwenTemplate});
        } else if (tuwenTemplate == null) {
        } else {
            if (this.children == null) {
                this.children = new ArrayList();
            }
            this.children.add(tuwenTemplate);
        }
    }

    public void addChildWithDivsion(TuwenTemplate tuwenTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45725201", new Object[]{this, tuwenTemplate});
        } else if (tuwenTemplate == null) {
        } else {
            if (this.children == null) {
                this.children = new ArrayList();
            }
            this.children.add(tuwenTemplate);
            this.children.add(b.a("9"));
        }
    }

    public void addFirstChild(TuwenTemplate tuwenTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ab7c59", new Object[]{this, tuwenTemplate});
        } else if (tuwenTemplate == null) {
        } else {
            if (this.children == null) {
                this.children = new ArrayList();
            }
            this.children.add(0, tuwenTemplate);
        }
    }

    public void addRequestMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31de07df", new Object[]{this, str});
        } else {
            addParams("requestMap", str);
        }
    }

    public void addPicSku(String str, String str2, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505454f", new Object[]{this, str, str2, new Double(d), new Double(d2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("path", str);
        hashMap.put("name", str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("x", Double.valueOf(d));
        hashMap2.put("y", Double.valueOf(d2));
        hashMap.put("position", hashMap2);
        addPicSku(hashMap);
    }

    public void addPicSku(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cddac6a", new Object[]{this, map});
        } else if (map == null) {
        } else {
            if (this.children == null) {
                this.children = new ArrayList();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("pic_sku_");
            int i = b.f17003a + 1;
            b.f17003a = i;
            sb.append(i);
            this.children.add(new TuwenTemplate(getUniquePicSkuId(sb.toString(), this.children), "native", "detail_sku_bar", map, null));
        }
    }

    public void addHotArea(int i, double d, double d2, double d3, double d4, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e43ca2", new Object[]{this, new Integer(i), new Double(d), new Double(d2), new Double(d3), new Double(d4), l});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", "//h5.m.taobao.com/awp/core/detail.htm");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("id", l.toString());
        hashMap2.put("scm", "20140620.2.1." + l);
        hashMap.put(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS, hashMap2);
        addHotArea(i, d, d2, d3, d4, hashMap);
    }

    private void addHotArea(int i, double d, double d2, double d3, double d4, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33a3ec2", new Object[]{this, new Integer(i), new Double(d), new Double(d2), new Double(d3), new Double(d4), map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("style", Integer.valueOf(i));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("startX", Double.valueOf(d));
        hashMap2.put("startY", Double.valueOf(d2));
        hashMap2.put("endX", Double.valueOf(d3));
        hashMap2.put("endY", Double.valueOf(d4));
        hashMap.put("position", hashMap2);
        addHotArea(hashMap, map);
    }

    private void addHotArea(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8ba6000", new Object[]{this, map, map2});
        } else if (map == null) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("hot_area");
            int i = b.f17003a + 1;
            b.f17003a = i;
            sb.append(i);
            TuwenTemplate tuwenTemplate = new TuwenTemplate(sb.toString(), "native", "detail_hotarea", map, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("action_open_url");
            int i2 = b.f17003a + 1;
            b.f17003a = i2;
            sb2.append(i2);
            tuwenTemplate.addAction(new TuwenTemplate(sb2.toString(), null, "open_url", map2, null));
            addChild(tuwenTemplate);
        }
    }

    private void addAction(TuwenTemplate tuwenTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c6ebaf", new Object[]{this, tuwenTemplate});
        } else if (tuwenTemplate == null) {
        } else {
            if (this.actions == null) {
                this.actions = new ArrayList();
            }
            this.actions.add(tuwenTemplate);
        }
    }

    private String getUniquePicSkuId(String str, List<TuwenTemplate> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c5fac29", new Object[]{this, str, list});
        }
        for (TuwenTemplate tuwenTemplate : list) {
            if (tuwenTemplate.ID.equals(str)) {
                return getUniquePicSkuId(str + b.f17003a, list);
            }
        }
        return str;
    }

    @Override // com.taobao.detail.domain.template.android.BaseDataVO
    public String getParams(String str) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0721e33", new Object[]{this, str});
        }
        if (str != null && str.length() > 0 && (map = this.params) != null && map.get(str) != null) {
            return String.valueOf(this.params.get(str));
        }
        return null;
    }
}
