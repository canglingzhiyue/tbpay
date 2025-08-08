package com.taobao.android.dinamicx_v4.responsive.impl;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static com.taobao.android.dinamicx.model.b<String> d;
    private static HashMap<String, Long> e;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<DXWidgetNode> f12233a;
    public Set<Long> b;
    public Set<String> c;

    static {
        kge.a(-88942139);
        d = new com.taobao.android.dinamicx.model.b() { // from class: com.taobao.android.dinamicx_v4.responsive.impl.b.1
            {
                put(16887479372907L, "alpha");
                put(9346582897824575L, "height");
                put(DXWidgetNode.DXVIEW_SCALEX, "scaleX");
                put(DXWidgetNode.DXVIEW_SCALEY, "scaleY");
                put(DXWidgetNode.DXVIEW_TRANSLATIONX, "translationX");
                put(DXWidgetNode.DXVIEW_TRANSLATIONY, "translationY");
                put(DXWidgetNode.DXVIEW_ROTATIONX, "rotationX");
                put(DXWidgetNode.DXVIEW_ROTATIONY, "rotationY");
                put(DXWidgetNode.DXVIEW_ROTATIONZ, "rotation");
            }
        };
        e = new HashMap<String, Long>() { // from class: com.taobao.android.dinamicx_v4.responsive.impl.PropertyInfo$2
            {
                put("alpha", 16887479372907L);
                put("height", 9346582897824575L);
                put("scaleX", Long.valueOf((long) DXWidgetNode.DXVIEW_SCALEX));
                put("scaleY", Long.valueOf((long) DXWidgetNode.DXVIEW_SCALEY));
                put("translationX", Long.valueOf((long) DXWidgetNode.DXVIEW_TRANSLATIONX));
                put("translationY", Long.valueOf((long) DXWidgetNode.DXVIEW_TRANSLATIONY));
                put("rotationX", Long.valueOf((long) DXWidgetNode.DXVIEW_ROTATIONX));
                put("rotationY", Long.valueOf((long) DXWidgetNode.DXVIEW_ROTATIONY));
                put("rotation", Long.valueOf((long) DXWidgetNode.DXVIEW_ROTATIONZ));
            }
        };
    }

    public static Long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("8fbb82a3", new Object[]{str});
        }
        if (!StringUtils.isEmpty(str)) {
            return e.get(str);
        }
        return null;
    }

    public WeakReference<DXWidgetNode> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("989ead36", new Object[]{this}) : this.f12233a;
    }

    public void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
        } else {
            this.f12233a = new WeakReference<>(dXWidgetNode);
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        if (this.b == null) {
            this.b = new HashSet();
            this.c = new HashSet();
        }
        this.b.add(Long.valueOf(j));
        this.c.add(d.get(j));
    }

    public Collection<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("846747e", new Object[]{this}) : this.c;
    }
}
