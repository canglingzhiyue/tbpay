package com.taobao.homepage.pop.viewmodel;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.pop.IPopPoint;
import com.taobao.homepage.pop.utils.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f17273a;
    private Map<String, IPopData> b = new ConcurrentHashMap();
    private Map<Integer, Map<String, List<IPopData>>> c = new ConcurrentHashMap();
    private Map<Integer, List<IPopData>> d = new ConcurrentHashMap();
    private Map<Integer, List<IPopData>> e = new ConcurrentHashMap();

    public a(int i) {
        this.f17273a = i;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f17273a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b.size();
    }

    public IPopData a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopData) ipChange.ipc$dispatch("f583f522", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.b.get(str);
        }
        return null;
    }

    public Map<Integer, List<IPopData>> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.e;
    }

    public List<IPopData> a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("749b2702", new Object[]{this, new Integer(i), str});
        }
        Map<String, List<IPopData>> map = this.c.get(Integer.valueOf(i));
        if (map != null && !map.isEmpty()) {
            return map.get(str);
        }
        return null;
    }

    public List<IPopData> a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("87fd354c", new Object[]{this, new Integer(i)}) : this.d.get(Integer.valueOf(i));
    }

    public void a(Map<String, IPopData> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        this.b.clear();
        this.e.clear();
        this.c.clear();
        this.d.clear();
        for (IPopData iPopData : map.values()) {
            if (this.f17273a == iPopData.getPopConfig().getHierarchy()) {
                this.b.put(iPopData.getBusinessID(), iPopData);
                a(iPopData);
                b(iPopData);
                c(iPopData);
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e.clear();
        this.c.clear();
    }

    private void a(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ae3ed8", new Object[]{this, iPopData});
            return;
        }
        int popContentType = iPopData.getPopConfig().getPopContentType();
        List<IPopData> list = this.e.get(Integer.valueOf(popContentType));
        if (list == null) {
            list = new ArrayList<>();
            this.e.put(Integer.valueOf(popContentType), list);
        }
        list.add(iPopData);
    }

    private void b(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539b55f7", new Object[]{this, iPopData});
        } else if (!iPopData.isAllowShow()) {
        } else {
            d.a("PopShowCountValid", iPopData);
            int trigger = iPopData.getPopConfig().getTrigger();
            List<IPopData> list = this.d.get(Integer.valueOf(trigger));
            if (list == null) {
                list = new ArrayList<>(16);
                this.d.put(Integer.valueOf(trigger), list);
            }
            list.add(iPopData);
        }
    }

    private void c(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0886d16", new Object[]{this, iPopData});
        } else if (!iPopData.isAllowShow()) {
        } else {
            int trigger = iPopData.getPopConfig().getTrigger();
            Map<String, List<IPopData>> map = this.c.get(Integer.valueOf(trigger));
            if (map == null) {
                map = new HashMap<>();
                this.c.put(Integer.valueOf(trigger), map);
            }
            IPopPoint point = iPopData.getPopConfig().getPoint();
            String sectionBizCode = point == null ? null : point.getSectionBizCode();
            List<IPopData> list = map.get(sectionBizCode);
            if (list == null) {
                list = new ArrayList<>();
                map.put(sectionBizCode, list);
            }
            list.add(iPopData);
        }
    }
}
