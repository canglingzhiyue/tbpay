package com.taobao.android.detail.core.standard.widget.lightoff.model;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.widget.lightoff.vm.ILightOffViewModel;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f9909a;
    public String b;
    public Rect c;
    public String d;
    public List<LightOffItemModel> e;
    public Map<String, Class<? extends ILightOffViewModel>> f;
    public ViewPager g;
    public int h;
    public List<LightOffFloatModel> i;
    public boolean j;

    static {
        kge.a(1470218520);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("from:" + this.b);
        sb.append(",transImageUrl:" + this.d);
        sb.append(",initialIndexId:" + this.h);
        if (this.c != null) {
            sb.append(",transOriginViewRect:" + this.c.toShortString());
        }
        if (this.e != null) {
            sb.append("itemModels:" + JSON.toJSONString(this.e));
        }
        if (this.g != null) {
            sb.append("customGallery:" + this.g.getClass().getName());
        }
        return sb.toString();
    }
}
